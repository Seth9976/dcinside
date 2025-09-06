package com.unity3d.services.core.api;

import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Connectivity {
    @WebViewExposed
    public static void setConnectionMonitoring(Boolean boolean0, WebViewCallback webViewCallback0) {
        ConnectivityMonitor.setConnectionMonitoring(boolean0.booleanValue());
        webViewCallback0.invoke(new Object[0]);
    }
}

