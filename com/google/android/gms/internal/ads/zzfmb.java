package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

public final class zzfmb extends zzfma {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfmb(String s, WebView webView0) {
        super(s);
        if(!webView0.getSettings().getJavaScriptEnabled()) {
            webView0.getSettings().setJavaScriptEnabled(true);
        }
        this.zzn(webView0);
    }
}

