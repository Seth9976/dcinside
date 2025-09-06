package com.unity3d.services.core.webview.bridge;

public interface IWebViewBridgeSharedObjectStore {
    IWebViewSharedObject get(String arg1);

    void remove(String arg1);

    void set(IWebViewSharedObject arg1);
}

