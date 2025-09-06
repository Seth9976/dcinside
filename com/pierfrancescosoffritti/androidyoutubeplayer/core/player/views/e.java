package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.webkit.WebView;
import java.util.List;

public final class e implements Runnable {
    public final WebView a;
    public final String b;
    public final List c;

    public e(WebView webView0, String s, List list0) {
        this.a = webView0;
        this.b = s;
        this.c = list0;
    }

    @Override
    public final void run() {
        f.t(this.a, this.b, this.c);
    }
}

