package com.iab.omid.library.bytedance2.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.a;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.internal.h;
import com.iab.omid.library.bytedance2.utils.c;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class b extends AdSessionStatePublisher {
    private WebView g;
    private Long h;
    private final Map i;
    private final String j;

    public b(String s, Map map0, String s1) {
        super(s);
        this.h = null;
        this.i = map0;
        this.j = s1;
    }

    @Override  // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void a(a a0, AdSessionContext adSessionContext0) {
        JSONObject jSONObject0 = new JSONObject();
        Map map0 = adSessionContext0.getInjectedResourcesMap();
        for(Object object0: map0.keySet()) {
            c.a(jSONObject0, ((String)object0), ((VerificationScriptResource)map0.get(((String)object0))).toJsonObject());
        }
        this.a(a0, adSessionContext0, jSONObject0);
    }

    @Override  // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void b() {
        class com.iab.omid.library.bytedance2.publisher.b.b implements Runnable {
            private final WebView a;
            final b b;

            com.iab.omid.library.bytedance2.publisher.b.b() {
                this.a = b0.g;
            }

            @Override
            public void run() {
                this.a.destroy();
            }
        }

        super.b();
        long v = this.h == null ? 4000L : TimeUnit.MILLISECONDS.convert(9366973414500L - ((long)this.h), TimeUnit.NANOSECONDS);
        new Handler().postDelayed(new com.iab.omid.library.bytedance2.publisher.b.b(this), Math.max(4000L - v, 2000L));
        this.g = null;
    }

    @Override  // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        this.j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        class com.iab.omid.library.bytedance2.publisher.b.a extends WebViewClient {
            final b a;

            @Override  // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
                Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail0.toString() + "for WebView: " + webView0);
                if(b.this.getWebView() == webView0) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    b.this.a(null);
                }
                webView0.destroy();
                return true;
            }
        }

        WebView webView0 = new WebView(g.b().a());
        this.g = webView0;
        webView0.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(new com.iab.omid.library.bytedance2.publisher.b.a(this));
        this.a(this.g);
        h.a().c(this.g, this.j);
        for(Object object0: this.i.keySet()) {
            String s = ((VerificationScriptResource)this.i.get(((String)object0))).getResourceUrl().toExternalForm();
            h.a().c(this.g, s, ((String)object0));
        }
        this.h = 9367033651800L;
    }
}

