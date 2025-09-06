package com.vungle.ads.internal.omsdk;

import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.vungle.adsession.c;
import com.iab.omid.library.vungle.adsession.d;
import com.iab.omid.library.vungle.adsession.f;
import com.iab.omid.library.vungle.adsession.j;
import com.iab.omid.library.vungle.adsession.n;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class e implements g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        // 去混淆评级： 低(20)
        public final long getDESTROY_DELAY_MS() {
            return 1000L;
        }

        @VisibleForTesting
        public static void getDESTROY_DELAY_MS$annotations() {
        }
    }

    public static final class b {
        @l
        public final e make(boolean z) {
            return new e(z, null);
        }
    }

    @l
    public static final a Companion;
    private static final long DESTROY_DELAY_MS;
    @m
    private com.iab.omid.library.vungle.adsession.b adSession;
    private final boolean enabled;
    private boolean started;

    static {
        e.Companion = new a(null);
        e.DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1L);
    }

    private e(boolean z) {
        this.enabled = z;
    }

    public e(boolean z, w w0) {
        this(z);
    }

    public static final long access$getDESTROY_DELAY_MS$cp() [...] // 潜在的解密器

    @Override  // com.vungle.ads.internal.omsdk.g
    public void onPageFinished(@l WebView webView0) {
        L.p(webView0, "webView");
        if(this.started && this.adSession == null) {
            com.iab.omid.library.vungle.adsession.b b0 = com.iab.omid.library.vungle.adsession.b.b(c.a(f.b, j.b, com.iab.omid.library.vungle.adsession.m.c, com.iab.omid.library.vungle.adsession.m.c, false), d.a(n.a("Vungle", "7.4.3"), webView0, null, null));
            this.adSession = b0;
            if(b0 != null) {
                b0.g(webView0);
            }
            com.iab.omid.library.vungle.adsession.b b1 = this.adSession;
            if(b1 != null) {
                b1.k();
            }
        }
    }

    // 去混淆评级： 低(40)
    public final void start() {
    }

    public final long stop() {
        long v;
        if(this.started) {
            com.iab.omid.library.vungle.adsession.b b0 = this.adSession;
            if(b0 == null) {
                v = 0L;
            }
            else {
                b0.d();
                v = e.DESTROY_DELAY_MS;
            }
        }
        else {
            v = 0L;
        }
        this.started = false;
        this.adSession = null;
        return v;
    }
}

