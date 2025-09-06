package com.iab.omid.library.vungle.publisher;

import C2.b;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.adsession.c;
import com.iab.omid.library.vungle.adsession.d;
import com.iab.omid.library.vungle.adsession.p;
import com.iab.omid.library.vungle.adsession.q;
import com.iab.omid.library.vungle.internal.h;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class a {
    static enum com.iab.omid.library.vungle.publisher.a.a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE;

    }

    private String a;
    private b b;
    private com.iab.omid.library.vungle.adsession.a c;
    private com.iab.omid.library.vungle.adsession.media.b d;
    private com.iab.omid.library.vungle.publisher.a.a e;
    private long f;

    public a(String s) {
        this.a();
        this.a = s;
        this.b = new b(null);
    }

    public void a() {
        this.f = 9376553542200L;
        this.e = com.iab.omid.library.vungle.publisher.a.a.a;
    }

    public void b(float f) {
        h.a().c(this.x(), this.a, f);
    }

    void c(WebView webView0) {
        this.b = new b(webView0);
    }

    public void d(com.iab.omid.library.vungle.adsession.a a0) {
        this.c = a0;
    }

    public void e(c c0) {
        h.a().g(this.x(), this.a, c0.d());
    }

    public void f(com.iab.omid.library.vungle.adsession.h h0, String s) {
        h.a().d(this.x(), this.a, h0, s);
    }

    public void g(q q0, d d0) {
        this.h(q0, d0, null);
    }

    protected void h(q q0, d d0, JSONObject jSONObject0) {
        String s = q0.e();
        JSONObject jSONObject1 = new JSONObject();
        com.iab.omid.library.vungle.utils.c.i(jSONObject1, "environment", "app");
        com.iab.omid.library.vungle.utils.c.i(jSONObject1, "adSessionType", d0.d());
        com.iab.omid.library.vungle.utils.c.i(jSONObject1, "deviceInfo", com.iab.omid.library.vungle.utils.b.d());
        com.iab.omid.library.vungle.utils.c.i(jSONObject1, "deviceCategory", "other");
        JSONArray jSONArray0 = new JSONArray();
        jSONArray0.put("clid");
        jSONArray0.put("vlid");
        com.iab.omid.library.vungle.utils.c.i(jSONObject1, "supports", jSONArray0);
        JSONObject jSONObject2 = new JSONObject();
        com.iab.omid.library.vungle.utils.c.i(jSONObject2, "partnerName", d0.i().b());
        com.iab.omid.library.vungle.utils.c.i(jSONObject2, "partnerVersion", d0.i().c());
        com.iab.omid.library.vungle.utils.c.i(jSONObject1, "omidNativeInfo", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        com.iab.omid.library.vungle.utils.c.i(jSONObject3, "libraryVersion", "1.5.2-Vungle");
        com.iab.omid.library.vungle.utils.c.i(jSONObject3, "appId", "com.dcinside.app.android");
        com.iab.omid.library.vungle.utils.c.i(jSONObject1, "app", jSONObject3);
        if(d0.e() != null) {
            com.iab.omid.library.vungle.utils.c.i(jSONObject1, "contentUrl", d0.e());
        }
        if(d0.f() != null) {
            com.iab.omid.library.vungle.utils.c.i(jSONObject1, "customReferenceData", d0.f());
        }
        JSONObject jSONObject4 = new JSONObject();
        for(Object object0: d0.j()) {
            com.iab.omid.library.vungle.utils.c.i(jSONObject4, ((p)object0).d(), ((p)object0).e());
        }
        h.a().h(this.x(), s, jSONObject1, jSONObject4, jSONObject0);
    }

    public void i(com.iab.omid.library.vungle.adsession.media.b b0) {
        this.d = b0;
    }

    public void j(String s) {
        this.l(s, null);
    }

    public void k(String s, long v) {
        if(v >= this.f) {
            com.iab.omid.library.vungle.publisher.a.a a$a0 = com.iab.omid.library.vungle.publisher.a.a.c;
            if(this.e != a$a0) {
                this.e = a$a0;
                h.a().n(this.x(), this.a, s);
            }
        }
    }

    public void l(String s, @Nullable JSONObject jSONObject0) {
        h.a().f(this.x(), this.a, s, jSONObject0);
    }

    public void m(@NonNull Date date0) {
        if(date0 == null) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        com.iab.omid.library.vungle.utils.c.i(jSONObject0, "timestamp", date0.getTime());
        h.a().k(this.x(), jSONObject0);
    }

    public void n(@Nullable JSONObject jSONObject0) {
        h.a().o(this.x(), this.a, jSONObject0);
    }

    public void o(boolean z) {
        if(this.u()) {
            h.a().p(this.x(), this.a, (z ? "foregrounded" : "backgrounded"));
        }
    }

    public void p() {
        this.b.clear();
    }

    public void q(String s, long v) {
        if(v >= this.f) {
            this.e = com.iab.omid.library.vungle.publisher.a.a.b;
            h.a().n(this.x(), this.a, s);
        }
    }

    public void r(boolean z) {
        if(this.u()) {
            h.a().e(this.x(), this.a, (z ? "locked" : "unlocked"));
        }
    }

    public com.iab.omid.library.vungle.adsession.a s() {
        return this.c;
    }

    public com.iab.omid.library.vungle.adsession.media.b t() {
        return this.d;
    }

    public boolean u() {
        return this.b.get() != null;
    }

    public void v() {
        h.a().b(this.x(), this.a);
    }

    public void w() {
        h.a().m(this.x(), this.a);
    }

    public WebView x() {
        return (WebView)this.b.get();
    }

    public void y() {
        this.n(null);
    }

    public void z() {
    }
}

