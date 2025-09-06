package com.unity3d.services.core.webview;

import android.webkit.ValueCallback;

public final class c implements Runnable {
    public final WebView a;
    public final String b;
    public final ValueCallback c;

    public c(WebView webView0, String s, ValueCallback valueCallback0) {
        this.a = webView0;
        this.b = s;
        this.c = valueCallback0;
    }

    @Override
    public final void run() {
        WebView.evaluateJavascript$lambda$1(this.a, this.b, this.c);
    }
}

