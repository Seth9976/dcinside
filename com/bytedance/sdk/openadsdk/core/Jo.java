package com.bytedance.sdk.openadsdk.core;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;

public class Jo {
    public static void PjT(WebView webView0) {
        if(webView0 == null) {
            return;
        }
        webView0.setWebChromeClient(null);
        webView0.setWebViewClient(null);
        ViewParent viewParent0 = webView0.getParent();
        if(viewParent0 instanceof ViewGroup) {
            ((ViewGroup)viewParent0).removeView(webView0);
        }
        webView0.removeAllViews();
        webView0.destroy();
    }
}

