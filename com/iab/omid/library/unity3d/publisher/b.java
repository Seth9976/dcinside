package com.iab.omid.library.unity3d.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

public class b extends a {
    @SuppressLint({"SetJavaScriptEnabled"})
    public b(String s, WebView webView0) {
        super(s);
        if(webView0 != null && !webView0.getSettings().getJavaScriptEnabled()) {
            webView0.getSettings().setJavaScriptEnabled(true);
        }
        this.c(webView0);
    }
}

