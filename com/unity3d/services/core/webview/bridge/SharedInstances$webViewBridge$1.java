package com.unity3d.services.core.webview.bridge;

import y4.m;

public final class SharedInstances.webViewBridge.1 implements IWebViewBridge {
    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridge
    public void handleCallback(@m String s, @m String s1, @m Object[] arr_object) throws Exception {
        WebViewBridge.getInstance().handleCallback(s, s1, arr_object);
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridge
    public void handleInvocation(@m String s, @m String s1, @m Object[] arr_object, @m WebViewCallback webViewCallback0) throws Exception {
        WebViewBridge.getInstance().handleInvocation(s, s1, arr_object, webViewCallback0);
    }
}

