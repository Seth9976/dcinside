package com.unity3d.services.banners.api;

import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class BannerListener {
    @WebViewExposed
    public static void sendClickEvent(String s, WebViewCallback webViewCallback0) {
        BannerViewCache.getInstance().triggerBannerClickEvent(s);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendErrorEvent(String s, Integer integer0, String s1, WebViewCallback webViewCallback0) {
        BannerErrorInfo bannerErrorInfo0 = new BannerErrorInfo(s1, BannerErrorCode.values()[((int)integer0)]);
        BannerViewCache.getInstance().triggerBannerErrorEvent(s, bannerErrorInfo0);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendLeaveApplicationEvent(String s, WebViewCallback webViewCallback0) {
        BannerViewCache.getInstance().triggerBannerLeftApplicationEvent(s);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendLoadEvent(String s, WebViewCallback webViewCallback0) {
        BannerViewCache.getInstance().triggerBannerLoadEvent(s);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowEvent(String s, WebViewCallback webViewCallback0) {
        BannerViewCache.getInstance().triggerBannerShowEvent(s);
        webViewCallback0.invoke(new Object[0]);
    }
}

