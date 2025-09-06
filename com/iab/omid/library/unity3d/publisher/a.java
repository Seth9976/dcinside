package com.iab.omid.library.unity3d.publisher;

import A2.b;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.c;
import com.iab.omid.library.unity3d.adsession.d;
import com.iab.omid.library.unity3d.adsession.h;
import com.iab.omid.library.unity3d.adsession.o;
import com.iab.omid.library.unity3d.adsession.p;
import com.iab.omid.library.unity3d.internal.g;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class a {
    static enum com.iab.omid.library.unity3d.publisher.a.a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE;

    }

    private String a;
    private b b;
    private com.iab.omid.library.unity3d.adsession.a c;
    private com.iab.omid.library.unity3d.adsession.media.b d;
    private com.iab.omid.library.unity3d.publisher.a.a e;
    private long f;

    public a(String s) {
        this.a();
        this.a = s;
        this.b = new b(null);
    }

    public void a() {
        this.f = 9375150820800L;
        this.e = com.iab.omid.library.unity3d.publisher.a.a.a;
    }

    public void b(float f) {
        g.a().c(this.w(), this.a, f);
    }

    void c(WebView webView0) {
        this.b = new b(webView0);
    }

    public void d(com.iab.omid.library.unity3d.adsession.a a0) {
        this.c = a0;
    }

    public void e(c c0) {
        g.a().g(this.w(), this.a, c0.d());
    }

    public void f(h h0, String s) {
        g.a().d(this.w(), this.a, h0, s);
    }

    public void g(p p0, d d0) {
        this.h(p0, d0, null);
    }

    protected void h(p p0, d d0, JSONObject jSONObject0) {
        String s = p0.e();
        JSONObject jSONObject1 = new JSONObject();
        com.iab.omid.library.unity3d.utils.c.i(jSONObject1, "environment", "app");
        com.iab.omid.library.unity3d.utils.c.i(jSONObject1, "adSessionType", d0.d());
        com.iab.omid.library.unity3d.utils.c.i(jSONObject1, "deviceInfo", com.iab.omid.library.unity3d.utils.b.d());
        com.iab.omid.library.unity3d.utils.c.i(jSONObject1, "deviceCategory", "other");
        JSONArray jSONArray0 = new JSONArray();
        jSONArray0.put("clid");
        jSONArray0.put("vlid");
        com.iab.omid.library.unity3d.utils.c.i(jSONObject1, "supports", jSONArray0);
        JSONObject jSONObject2 = new JSONObject();
        com.iab.omid.library.unity3d.utils.c.i(jSONObject2, "partnerName", d0.i().b());
        com.iab.omid.library.unity3d.utils.c.i(jSONObject2, "partnerVersion", d0.i().c());
        com.iab.omid.library.unity3d.utils.c.i(jSONObject1, "omidNativeInfo", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        com.iab.omid.library.unity3d.utils.c.i(jSONObject3, "libraryVersion", "1.4.9-Unity3d");
        com.iab.omid.library.unity3d.utils.c.i(jSONObject3, "appId", "com.dcinside.app.android");
        com.iab.omid.library.unity3d.utils.c.i(jSONObject1, "app", jSONObject3);
        if(d0.e() != null) {
            com.iab.omid.library.unity3d.utils.c.i(jSONObject1, "contentUrl", d0.e());
        }
        if(d0.f() != null) {
            com.iab.omid.library.unity3d.utils.c.i(jSONObject1, "customReferenceData", d0.f());
        }
        JSONObject jSONObject4 = new JSONObject();
        for(Object object0: d0.j()) {
            com.iab.omid.library.unity3d.utils.c.i(jSONObject4, ((o)object0).d(), ((o)object0).e());
        }
        g.a().h(this.w(), s, jSONObject1, jSONObject4, jSONObject0);
    }

    public void i(com.iab.omid.library.unity3d.adsession.media.b b0) {
        this.d = b0;
    }

    public void j(String s) {
        this.l(s, null);
    }

    public void k(String s, long v) {
        if(v >= this.f) {
            com.iab.omid.library.unity3d.publisher.a.a a$a0 = com.iab.omid.library.unity3d.publisher.a.a.c;
            if(this.e != a$a0) {
                this.e = a$a0;
                g.a().e(this.w(), this.a, s);
            }
        }
    }

    public void l(String s, @Nullable JSONObject jSONObject0) {
        g.a().f(this.w(), this.a, s, jSONObject0);
    }

    public void m(@NonNull Date date0) {
        if(date0 == null) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        com.iab.omid.library.unity3d.utils.c.i(jSONObject0, "timestamp", date0.getTime());
        g.a().k(this.w(), jSONObject0);
    }

    public void n(@Nullable JSONObject jSONObject0) {
        g.a().o(this.w(), this.a, jSONObject0);
    }

    public void o(boolean z) {
        if(this.t()) {
            g.a().n(this.w(), this.a, (z ? "foregrounded" : "backgrounded"));
        }
    }

    public void p() {
        this.b.clear();
    }

    public void q(String s, long v) {
        if(v >= this.f) {
            this.e = com.iab.omid.library.unity3d.publisher.a.a.b;
            g.a().e(this.w(), this.a, s);
        }
    }

    public com.iab.omid.library.unity3d.adsession.a r() {
        return this.c;
    }

    public com.iab.omid.library.unity3d.adsession.media.b s() {
        return this.d;
    }

    public boolean t() {
        return this.b.get() != null;
    }

    public void u() {
        g.a().b(this.w(), this.a);
    }

    public void v() {
        g.a().m(this.w(), this.a);
    }

    public WebView w() {
        return (WebView)this.b.get();
    }

    public void x() {
        this.n(null);
    }

    public void y() {
    }
}

