/*
 * Copyright (c) 2002-2006 by OpenSymphony
 * All rights reserved.
*/
package org.apache.struts.action2.interceptor;

import com.opensymphony.xwork.Action;

/**
 * Used by ExecuteAndWaitInterceptorTest.
 *
 * @author Claus Ibsen
 */
public class ExecuteAndWaitDelayAction implements Action {

    public String execute() throws Exception {
        Thread.sleep(500);
        return SUCCESS;
    }

}
