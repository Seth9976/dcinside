package com.vungle.ads.internal.ui;

import android.webkit.WebView;

public final class e implements Runnable {
    public final h a;
    public final WebView b;
    public final String c;

    public e(h h0, WebView webView0, String s) {
        this.a = h0;
        this.b = webView0;
        this.c = s;
    }

    @Override
    public final void run() {
        h.shouldOverrideUrlLoading$lambda-6$lambda-1$lambda-0(this.a, this.b, this.c);
    }
}

