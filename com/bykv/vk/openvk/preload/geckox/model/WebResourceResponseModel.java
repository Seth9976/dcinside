package com.bykv.vk.openvk.preload.geckox.model;

import android.webkit.WebResourceResponse;

public class WebResourceResponseModel {
    public static final int ERROR_DEFAULT = -1;
    public static final int ERROR_INTERCEPT = 1;
    public static final int ERROR_NOT_FIND_BY_RESOURCE = 2;
    int errorType;
    WebResourceResponse webResourceResponse;

    public WebResourceResponseModel(int v, WebResourceResponse webResourceResponse0) {
        this.errorType = v;
        this.webResourceResponse = webResourceResponse0;
    }

    public int getMsg() {
        return this.errorType;
    }

    public WebResourceResponse getWebResourceResponse() {
        return this.webResourceResponse;
    }

    public void setMsg(int v) {
        this.errorType = v;
    }

    public void setWebResourceResponse(WebResourceResponse webResourceResponse0) {
        this.webResourceResponse = webResourceResponse0;
    }
}

