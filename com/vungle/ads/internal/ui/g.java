package com.vungle.ads.internal.ui;

import android.os.Handler;
import android.webkit.WebView;
import com.vungle.ads.internal.ui.view.c.a;
import kotlinx.serialization.json.y;

public final class g implements Runnable {
    public final a a;
    public final String b;
    public final y c;
    public final Handler d;
    public final h e;
    public final WebView f;

    public g(a c$a0, String s, y y0, Handler handler0, h h0, WebView webView0) {
        this.a = c$a0;
        this.b = s;
        this.c = y0;
        this.d = handler0;
        this.e = h0;
        this.f = webView0;
    }

    @Override
    public final void run() {
        h.shouldOverrideUrlLoading$lambda-6$lambda-5$lambda-4(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}

