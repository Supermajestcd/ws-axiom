/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.axiom.apicheck.checker;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

import org.junit.Test;

public class APICheckerTest {
    @Test
    public void test() throws Exception {
        MockViolationListener listener = new MockViolationListener();
        for (Method method : ViolatingClass.class.getDeclaredMethods()) {
            listener.addExpectedMethod(method.getName());
        }
        APIChecker checker = new APIChecker(listener);
        String signatures = ForbiddenClass.class.getName().replace('.', '/') + " Forbidden";
        checker.loadSignatures(new ByteArrayInputStream(signatures.getBytes("utf-8")));
        InputStream in = APICheckerTest.class.getResourceAsStream(
                "/" + ViolatingClass.class.getName().replace('.', '/') + ".class");
        try {
            checker.checkClass(in);
        } finally {
            in.close();
        }
        assertThat(listener.getUnseenMethods(), is(empty()));
    }
}
