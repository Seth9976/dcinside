package com.unity3d.services.core.webview.bridge.invocation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebViewBridgeInvocationSingleThreadedExecutor {
    private ExecutorService _ExecutorService;
    private static WebViewBridgeInvocationSingleThreadedExecutor instance;

    private WebViewBridgeInvocationSingleThreadedExecutor() {
        this._ExecutorService = Executors.newSingleThreadExecutor();
    }

    public ExecutorService getExecutorService() {
        return this._ExecutorService;
    }

    public static WebViewBridgeInvocationSingleThreadedExecutor getInstance() {
        if(WebViewBridgeInvocationSingleThreadedExecutor.instance == null) {
            WebViewBridgeInvocationSingleThreadedExecutor.instance = new WebViewBridgeInvocationSingleThreadedExecutor();
        }
        return WebViewBridgeInvocationSingleThreadedExecutor.instance;
    }
}

