package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import java.lang.reflect.Method;

public class WebViewBridgeInvoker implements IWebViewBridgeInvoker {
    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
    public boolean invokeMethod(String s, String s1, Method method0, Object[] arr_object) {
        return WebViewApp.getCurrentApp().invokeMethod(s, s1, method0, arr_object);
    }
}

