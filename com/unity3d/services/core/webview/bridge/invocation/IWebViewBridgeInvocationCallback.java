package com.unity3d.services.core.webview.bridge.invocation;

import com.unity3d.services.core.webview.bridge.CallbackStatus;

public interface IWebViewBridgeInvocationCallback {
    void onFailure(String arg1, CallbackStatus arg2);

    void onSuccess();

    void onTimeout();
}

