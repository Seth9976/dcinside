package com.unity3d.services.core.webview.bridge.invocation;

import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.concurrent.ExecutorService;

public class WebViewBridgeInvocation implements IWebViewBridgeInvocation {
    private ExecutorService _executorService;
    private IWebViewBridgeInvoker _webViewBridgeInvoker;
    private static IWebViewBridgeInvocationCallback invocationCallback;

    public WebViewBridgeInvocation(ExecutorService executorService0, IWebViewBridgeInvoker iWebViewBridgeInvoker0, IWebViewBridgeInvocationCallback iWebViewBridgeInvocationCallback0) {
        this._executorService = executorService0;
        WebViewBridgeInvocation.invocationCallback = iWebViewBridgeInvocationCallback0;
        if(iWebViewBridgeInvoker0 == null) {
            throw new IllegalArgumentException("webViewBridgeInvoker cannot be null");
        }
        this._webViewBridgeInvoker = iWebViewBridgeInvoker0;
    }

    @Override  // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation
    public void invoke(String s, String s1, int v, Object[] arr_object) {
        synchronized(this) {
            this._executorService.submit(new WebViewBridgeInvocationRunnable(WebViewBridgeInvocation.invocationCallback, this._webViewBridgeInvoker, s, s1, v, arr_object));
        }
    }
}

