/*
 * Copyright (c) 2002-2006 by OpenSymphony
 * All rights reserved.
 */
package org.apache.struts.action2.showcase.filedownload;

import org.apache.struts.action2.ServletActionContext;
import com.opensymphony.xwork.Action;

import java.io.InputStream;

/**
 * Action to demonstrate how to use file download.
 * <p/>
 * This action is used to download a jpeg file from the image folder.
 *
 * @author Claus Ibsen
 */
public class FileDownloadAction implements Action {

    public InputStream getImageStream() throws Exception {
        return ServletActionContext.getServletContext().getResourceAsStream("/images/logo.png");
    }

    public String execute() throws Exception {
        return SUCCESS;
    }

}
