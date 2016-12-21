
/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.analytics.dataservice.commons.exception;

import org.wso2.carbon.analytics.datasource.commons.exception.AnalyticsException;

/**
 * This class represents the exception class where the queue is being interrupted when shutdown hook is triggered.
 */
public class AnalyticsInterruptException extends AnalyticsException {

    private static final long serialVersionUID = 2945719572725443092L;

    public AnalyticsInterruptException(String msg) {
        super(msg);
    }

    public AnalyticsInterruptException(String msg, Throwable cause) {
        super(msg, cause);
    }
}