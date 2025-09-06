package com.unity3d.services.core.webview.bridge;

import y4.m;

public interface IWebViewBridge {
    void handleCallback(@m String arg1, @m String arg2, @m Object[] arg3) throws Exception;

    void handleInvocation(@m String arg1, @m String arg2, @m Object[] arg3, @m WebViewCallback arg4) throws Exception;
}

