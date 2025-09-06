package com.vungle.ads.internal.ui;

import android.webkit.WebView;

public final class d implements Runnable {
    public final h a;
    public final WebView b;

    public d(h h0, WebView webView0) {
        this.a = h0;
        this.b = webView0;
    }

    @Override
    public final void run() {
        h.shouldOverrideUrlLoading$lambda-6$lambda-5$lambda-4$lambda-3(this.a, this.b);
    }
}

