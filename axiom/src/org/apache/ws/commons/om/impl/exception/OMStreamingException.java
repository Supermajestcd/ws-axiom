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

package org.apache.ws.commons.om.impl.exception;

import org.apache.ws.commons.om.OMException;

/**
 * Class OMStreamingException
 */
public class OMStreamingException extends OMException {
	
    private static final long serialVersionUID = 8108888406034145092L;

	/**
     * Constructor OMStreamingException
     */
    public OMStreamingException() {
    }

    /**
     * Constructor OMStreamingException
     *
     * @param message
     */
    public OMStreamingException(String message) {
        super(message);
    }

    /**
     * Constructor OMStreamingException
     *
     * @param message
     * @param cause
     */
    public OMStreamingException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor OMStreamingException
     *
     * @param cause
     */
    public OMStreamingException(Throwable cause) {
        super(cause);
    }
}
