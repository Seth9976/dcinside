package com.unity3d.services.ads.api;

import P2.e;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class GMAScar {
    private static final GMAScarAdapterBridge gmaScarAdapterBridge;

    static {
        GMAScar.gmaScarAdapterBridge = GMA.getInstance().getBridge();
    }

    @WebViewExposed
    public static void getSCARSignal(String s, String s1, WebViewCallback webViewCallback0) {
        GMAScar.gmaScarAdapterBridge.getSCARSignal(s, e.valueOf(s1.toUpperCase()));
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getVersion(WebViewCallback webViewCallback0) {
        GMAScar.gmaScarAdapterBridge.getVersion();
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void initializeScar(WebViewCallback webViewCallback0) {
        GMAScar.gmaScarAdapterBridge.initializeScar();
        webViewCallback0.invoke(new Object[0]);
    }

    public static void isInitialized(WebViewCallback webViewCallback0) {
        GMAScar.gmaScarAdapterBridge.isInitialized();
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void load(String s, String s1, Boolean boolean0, String s2, String s3, Integer integer0, WebViewCallback webViewCallback0) {
        GMAScar.gmaScarAdapterBridge.load(boolean0.booleanValue(), s, s1, s3, s2, ((int)integer0));
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void show(String s, String s1, Boolean boolean0, WebViewCallback webViewCallback0) {
        GMAScar.gmaScarAdapterBridge.show(s, s1);
        webViewCallback0.invoke(new Object[0]);
    }
}

