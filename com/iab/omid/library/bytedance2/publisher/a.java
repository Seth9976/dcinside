package com.iab.omid.library.bytedance2.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

public class a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public a(String s, WebView webView0) {
        super(s);
        if(webView0 != null && !webView0.getSettings().getJavaScriptEnabled()) {
            webView0.getSettings().setJavaScriptEnabled(true);
        }
        this.a(webView0);
    }
}

