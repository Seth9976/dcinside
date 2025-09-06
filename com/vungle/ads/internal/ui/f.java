package com.vungle.ads.internal.ui;

import android.os.Handler;
import android.webkit.WebView;

public final class f implements Runnable {
    public final h a;
    public final Handler b;
    public final WebView c;

    public f(h h0, Handler handler0, WebView webView0) {
        this.a = h0;
        this.b = handler0;
        this.c = webView0;
    }

    @Override
    public final void run() {
        h.shouldOverrideUrlLoading$lambda-6$lambda-1(this.a, this.b, this.c);
    }
}

