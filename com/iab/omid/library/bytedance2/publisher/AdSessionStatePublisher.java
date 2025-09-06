package com.iab.omid.library.bytedance2.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.ErrorType;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.internal.h;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.weakreference.b;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {
    static enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE;

    }

    private String a;
    private b b;
    private AdEvents c;
    private MediaEvents d;
    private a e;
    private long f;

    public AdSessionStatePublisher(String s) {
        this.a();
        this.a = s;
        this.b = new b(null);
    }

    public void a() {
        this.f = 9366682277700L;
        this.e = a.a;
    }

    public void a(float f) {
        h.a().a(this.getWebView(), this.a, f);
    }

    void a(WebView webView0) {
        this.b = new b(webView0);
    }

    public void a(AdEvents adEvents0) {
        this.c = adEvents0;
    }

    public void a(AdSessionConfiguration adSessionConfiguration0) {
        h.a().a(this.getWebView(), this.a, adSessionConfiguration0.toJsonObject());
    }

    public void a(ErrorType errorType0, String s) {
        h.a().a(this.getWebView(), this.a, errorType0, s);
    }

    public void a(com.iab.omid.library.bytedance2.adsession.a a0, AdSessionContext adSessionContext0) {
        this.a(a0, adSessionContext0, null);
    }

    protected void a(com.iab.omid.library.bytedance2.adsession.a a0, AdSessionContext adSessionContext0, JSONObject jSONObject0) {
        String s = a0.getAdSessionId();
        JSONObject jSONObject1 = new JSONObject();
        c.a(jSONObject1, "environment", "app");
        c.a(jSONObject1, "adSessionType", adSessionContext0.getAdSessionContextType());
        c.a(jSONObject1, "deviceInfo", com.iab.omid.library.bytedance2.utils.b.d());
        c.a(jSONObject1, "deviceCategory", "other");
        JSONArray jSONArray0 = new JSONArray();
        jSONArray0.put("clid");
        jSONArray0.put("vlid");
        c.a(jSONObject1, "supports", jSONArray0);
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "partnerName", adSessionContext0.getPartner().getName());
        c.a(jSONObject2, "partnerVersion", adSessionContext0.getPartner().getVersion());
        c.a(jSONObject1, "omidNativeInfo", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, "libraryVersion", "1.4.12-Bytedance2");
        c.a(jSONObject3, "appId", "com.dcinside.app.android");
        c.a(jSONObject1, "app", jSONObject3);
        if(adSessionContext0.getContentUrl() != null) {
            c.a(jSONObject1, "contentUrl", adSessionContext0.getContentUrl());
        }
        if(adSessionContext0.getCustomReferenceData() != null) {
            c.a(jSONObject1, "customReferenceData", adSessionContext0.getCustomReferenceData());
        }
        JSONObject jSONObject4 = new JSONObject();
        for(Object object0: adSessionContext0.getVerificationScriptResources()) {
            c.a(jSONObject4, ((VerificationScriptResource)object0).getVendorKey(), ((VerificationScriptResource)object0).getVerificationParameters());
        }
        h.a().a(this.getWebView(), s, jSONObject1, jSONObject4, jSONObject0);
    }

    public void a(MediaEvents mediaEvents0) {
        this.d = mediaEvents0;
    }

    public void a(String s) {
        this.a(s, null);
    }

    public void a(String s, long v) {
        if(v >= this.f) {
            a adSessionStatePublisher$a0 = a.c;
            if(this.e != adSessionStatePublisher$a0) {
                this.e = adSessionStatePublisher$a0;
                h.a().a(this.getWebView(), this.a, s);
            }
        }
    }

    public void a(String s, @Nullable JSONObject jSONObject0) {
        h.a().a(this.getWebView(), this.a, s, jSONObject0);
    }

    public void a(@NonNull Date date0) {
        if(date0 == null) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        c.a(jSONObject0, "timestamp", date0.getTime());
        h.a().a(this.getWebView(), jSONObject0);
    }

    public void a(@Nullable JSONObject jSONObject0) {
        h.a().b(this.getWebView(), this.a, jSONObject0);
    }

    public void a(boolean z) {
        if(this.e()) {
            h.a().b(this.getWebView(), this.a, (z ? "foregrounded" : "backgrounded"));
        }
    }

    public void b() {
        this.b.clear();
    }

    public void b(String s, long v) {
        if(v >= this.f) {
            this.e = a.b;
            h.a().a(this.getWebView(), this.a, s);
        }
    }

    public AdEvents c() {
        return this.c;
    }

    public MediaEvents d() {
        return this.d;
    }

    public boolean e() {
        return this.b.get() != null;
    }

    public void f() {
        h.a().a(this.getWebView(), this.a);
    }

    public void g() {
        h.a().b(this.getWebView(), this.a);
    }

    public WebView getWebView() {
        return (WebView)this.b.get();
    }

    public void h() {
        this.a(null);
    }

    public void i() {
    }
}

