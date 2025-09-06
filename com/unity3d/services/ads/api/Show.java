package com.unity3d.services.ads.api;

import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;
import com.unity3d.ads.UnityAds.UnityAdsShowError;
import com.unity3d.services.ads.operation.show.ShowModule;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Show {
    @WebViewExposed
    public static void sendShowClickEvent(String s, String s1, WebViewCallback webViewCallback0) {
        ShowModule.getInstance().onUnityAdsShowClick(s1);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowCompleteEvent(String s, String s1, String s2, WebViewCallback webViewCallback0) {
        ShowModule.getInstance().onUnityAdsShowComplete(s1, UnityAdsShowCompletionState.valueOf(s2));
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowConsentEvent(String s, String s1, WebViewCallback webViewCallback0) {
        ShowModule.getInstance().onUnityAdsShowConsent(s1);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowFailedEvent(String s, String s1, String s2, String s3, WebViewCallback webViewCallback0) {
        ShowModule.getInstance().onUnityAdsShowFailure(s1, UnityAdsShowError.valueOf(s2), s3);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowStartEvent(String s, String s1, WebViewCallback webViewCallback0) {
        ShowModule.getInstance().onUnityAdsShowStart(s1);
        webViewCallback0.invoke(new Object[0]);
    }
}

