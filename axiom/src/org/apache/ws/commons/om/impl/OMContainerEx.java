/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ws.commons.om.impl;

import org.apache.ws.commons.om.OMContainer;
import org.apache.ws.commons.om.OMNode;

/**
 * Interface OMContainerEx
 *
 * Internal Implementation detail. Adding special interface to stop folks from accidently using OMContainer.
 * Please use at your own risk. May corrupt the data integrity.
 */
public interface OMContainerEx extends OMContainer {
    public void setComplete(boolean state);

    public void setFirstChild(OMNode omNode);
}
