package com.unity3d.services.core.webview.bridge;

import j..util.concurrent.ConcurrentHashMap;

public abstract class WebViewBridgeSharedObjectStore implements IWebViewBridgeSharedObjectStore {
    private ConcurrentHashMap _sharedObjects;

    public WebViewBridgeSharedObjectStore() {
        this._sharedObjects = new ConcurrentHashMap();
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public IWebViewSharedObject get(String s) {
        return s == null ? null : ((IWebViewSharedObject)this._sharedObjects.get(s));
    }

    public void remove(IWebViewSharedObject iWebViewSharedObject0) {
        if(iWebViewSharedObject0 == null) {
            return;
        }
        this.remove(iWebViewSharedObject0.getId());
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void remove(String s) {
        this._sharedObjects.remove(s);
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void set(IWebViewSharedObject iWebViewSharedObject0) {
        if(iWebViewSharedObject0 == null) {
            return;
        }
        this._sharedObjects.put(iWebViewSharedObject0.getId(), iWebViewSharedObject0);
    }
}

