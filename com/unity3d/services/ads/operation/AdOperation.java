package com.unity3d.services.ads.operation;

import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;

public abstract class AdOperation implements IAdOperation {
    private String _invocationMethodName;
    private IWebViewBridgeInvocation _webViewBridgeInvocation;
    private static String invocationClassName = "webview";

    static {
    }

    protected AdOperation(IWebViewBridgeInvocation iWebViewBridgeInvocation0, String s) throws NullPointerException {
        this._invocationMethodName = s;
        if(s == null || s.isEmpty()) {
            throw new IllegalArgumentException("invocationMethodName cannot be null");
        }
        this._webViewBridgeInvocation = iWebViewBridgeInvocation0;
        if(iWebViewBridgeInvocation0 == null) {
            throw new IllegalArgumentException("webViewBridgeInvocation cannot be null");
        }
    }

    @Override  // com.unity3d.services.ads.operation.IAdOperation
    public void invoke(int v, Object[] arr_object) {
        this._webViewBridgeInvocation.invoke("webview", this._invocationMethodName, v, arr_object);
    }
}

