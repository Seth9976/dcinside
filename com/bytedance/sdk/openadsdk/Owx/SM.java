package com.bytedance.sdk.openadsdk.Owx;

import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SM {
    private static void PjT(WebSettings webSettings0) {
        try {
            webSettings0.setMediaPlaybackRequiresUserGesture(false);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(WebView webView0) {
        if(webView0 == null) {
            return;
        }
        SM.Zh(webView0);
        WebSettings webSettings0 = webView0.getSettings();
        SM.PjT(webSettings0);
        if(webSettings0 == null) {
            return;
        }
        try {
            webSettings0.setJavaScriptEnabled(true);
        }
        catch(Throwable unused_ex) {
        }
        try {
            webSettings0.setSupportZoom(false);
        }
        catch(Throwable unused_ex) {
        }
        webSettings0.setLoadWithOverviewMode(true);
        webSettings0.setUseWideViewPort(true);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setAllowFileAccess(false);
        webSettings0.setBlockNetworkImage(false);
        webSettings0.setDisplayZoomControls(false);
        int v = Build.VERSION.SDK_INT;
        webSettings0.setAllowFileAccessFromFileURLs(false);
        webSettings0.setAllowUniversalAccessFromFileURLs(false);
        webSettings0.setSavePassword(false);
        try {
            if(v < 28) {
                webView0.setLayerType(0, null);
            }
            else {
                webView0.setLayerType(2, null);
            }
        }
        catch(Throwable unused_ex) {
        }
        webView0.getSettings().setMixedContentMode(0);
    }

    private static void Zh(WebView webView0) {
        try {
            webView0.removeJavascriptInterface("searchBoxJavaBridge_");
            webView0.removeJavascriptInterface("accessibility");
            webView0.removeJavascriptInterface("accessibilityTraversal");
        }
        catch(Throwable unused_ex) {
        }
    }
}

