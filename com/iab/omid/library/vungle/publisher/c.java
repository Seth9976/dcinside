package com.iab.omid.library.vungle.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.vungle.adsession.d;
import com.iab.omid.library.vungle.adsession.p;
import com.iab.omid.library.vungle.adsession.q;
import com.iab.omid.library.vungle.internal.g;
import com.iab.omid.library.vungle.internal.h;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class c extends a {
    private WebView g;
    private Long h;
    private final Map i;
    private final String j;

    public c(String s, Map map0, String s1) {
        super(s);
        this.h = null;
        this.i = map0;
        this.j = s1;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void B() {
        class com.iab.omid.library.vungle.publisher.c.a extends WebViewClient {
            final c a;

            @Override  // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
                Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail0.toString() + "for WebView: " + webView0);
                if(c.this.x() == webView0) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    c.this.c(null);
                }
                webView0.destroy();
                return true;
            }
        }

        WebView webView0 = new WebView(g.c().a());
        this.g = webView0;
        webView0.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(new com.iab.omid.library.vungle.publisher.c.a(this));
        this.c(this.g);
        h.a().q(this.g, this.j);
        for(Object object0: this.i.keySet()) {
            String s = ((p)this.i.get(((String)object0))).c().toExternalForm();
            h.a().r(this.g, s, ((String)object0));
        }
        this.h = 9376606394800L;
    }

    @Override  // com.iab.omid.library.vungle.publisher.a
    public void g(q q0, d d0) {
        JSONObject jSONObject0 = new JSONObject();
        Map map0 = d0.g();
        for(Object object0: map0.keySet()) {
            com.iab.omid.library.vungle.utils.c.i(jSONObject0, ((String)object0), ((p)map0.get(((String)object0))).f());
        }
        this.h(q0, d0, jSONObject0);
    }

    @Override  // com.iab.omid.library.vungle.publisher.a
    public void p() {
        class b implements Runnable {
            private final WebView a;
            final c b;

            b() {
                this.a = c0.g;
            }

            @Override
            public void run() {
                this.a.destroy();
            }
        }

        super.p();
        long v = this.h == null ? 4000L : TimeUnit.MILLISECONDS.convert(9376600312900L - ((long)this.h), TimeUnit.NANOSECONDS);
        new Handler().postDelayed(new b(this), Math.max(4000L - v, 2000L));
        this.g = null;
    }

    @Override  // com.iab.omid.library.vungle.publisher.a
    public void z() {
        super.z();
        this.B();
    }
}

