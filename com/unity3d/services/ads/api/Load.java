package com.unity3d.services.ads.api;

import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.services.ads.operation.load.LoadModule;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Load {
    @WebViewExposed
    public static void sendAdFailedToLoad(String s, String s1, String s2, String s3, WebViewCallback webViewCallback0) {
        LoadModule.getInstance().onUnityAdsFailedToLoad(s1, UnityAdsLoadError.valueOf(s2), s3);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendAdLoaded(String s, String s1, WebViewCallback webViewCallback0) {
        LoadModule.getInstance().onUnityAdsAdLoaded(s1);
        webViewCallback0.invoke(new Object[0]);
    }
}

