package com.dcinside.app.wv;

import android.webkit.WebView;

public final class t implements Runnable {
    public final WebView a;
    public final int b;
    public final String c;
    public final String d;

    public t(WebView webView0, int v, String s, String s1) {
        this.a = webView0;
        this.b = v;
        this.c = s;
        this.d = s1;
    }

    @Override
    public final void run() {
        WebViews.m(this.a, this.b, this.c, this.d);
    }
}

