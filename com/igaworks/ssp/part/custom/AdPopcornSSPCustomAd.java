package com.igaworks.ssp.part.custom;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.igaworks.ssp.CustomAdType;
import com.igaworks.ssp.E.j;
import com.igaworks.ssp.E;
import com.igaworks.ssp.M;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.e0;
import com.igaworks.ssp.g;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.custom.listener.ICustomAdListener;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.t0;
import com.igaworks.ssp.y;
import com.igaworks.ssp.z;
import j..util.Objects;
import java.util.List;
import org.json.JSONObject;

public class AdPopcornSSPCustomAd {
    class b implements M {
        final AdPopcornSSPCustomAd a;

        @Override  // com.igaworks.ssp.M
        public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
            String s2;
            try {
                if(z) {
                    AdPopcornSSPCustomAd.this.a(5000);
                    return;
                }
                if(s0.b(s)) {
                    AdPopcornSSPCustomAd.this.a(0x270F);
                    return;
                }
                d0 d00 = p.f(s);
                if(d00 != null && d00.h() != 1) {
                    AdPopcornSSPCustomAd.this.a(d00.h());
                    return;
                }
                AdPopcornSSPCustomAd.this.e = d00;
                if(AdPopcornSSPCustomAd.this.e != null && AdPopcornSSPCustomAd.this.e.d() != null) {
                    t0.a(AdPopcornSSPCustomAd.this.d, AdPopcornSSPCustomAd.this.e.d());
                }
                if(y.a(AdPopcornSSPCustomAd.this.e)) {
                    if(AdPopcornSSPCustomAd.this.c == CustomAdType.NATIVE_AD) {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("IconImageURL", "");
                        jSONObject0.put("MainImageURL", "");
                        jSONObject0.put("Title", "");
                        jSONObject0.put("Desc", "");
                        jSONObject0.put("CtaText", "");
                        jSONObject0.put("PrivacyPolicyImageURL", "");
                        jSONObject0.put("PrivacyPolicyURL", "");
                        jSONObject0.put("LandingURL", "");
                        if(((g)AdPopcornSSPCustomAd.this.e.b().get(0)).u() == 0) {
                            jSONObject0.put("TemplateNo", 20);
                        }
                        else {
                            jSONObject0.put("TemplateNo", ((g)AdPopcornSSPCustomAd.this.e.b().get(0)).u());
                        }
                        s2 = jSONObject0.toString();
                    }
                    else {
                        s2 = ((g)AdPopcornSSPCustomAd.this.e.b().get(0)).y();
                    }
                    AdPopcornSSPCustomAd.this.a(s2);
                    return;
                }
                AdPopcornSSPCustomAd.this.a(5002);
                return;
            }
            catch(Exception exception0) {
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            AdPopcornSSPCustomAd.this.a(200);
        }
    }

    private String a;
    private String b;
    private CustomAdType c;
    private Context d;
    private d0 e;
    private ICustomAdListener f;
    M g;

    public AdPopcornSSPCustomAd(Context context0) {
        this.g = new b(this);
        this.d = context0;
    }

    public AdPopcornSSPCustomAd(Context context0, String s) {
        this.g = new b(this);
        this.d = context0;
        this.b = s;
    }

    private void a() {
        com.igaworks.ssp.b.c(Thread.currentThread(), "internalStopAd : " + this.a);
        if(this.e != null) {
            this.e = null;
        }
    }

    private void a(int v) {
        ICustomAdListener iCustomAdListener0 = this.f;
        if(iCustomAdListener0 != null) {
            iCustomAdListener0.OnCustomAdReceiveFailed(this.a, new SSPErrorCode(v));
        }
        this.a();
    }

    private void a(String s) {
        ICustomAdListener iCustomAdListener0 = this.f;
        if(iCustomAdListener0 != null) {
            iCustomAdListener0.OnCustomAdReceiveSuccess(this.a, s);
        }
    }

    public List getClickTrackersList() {
        try {
            g g0 = (g)this.e.b().get(0);
            if(g0 != null) {
                return g0.b();
            }
        }
        catch(Exception exception0) {
            com.igaworks.ssp.b.c(Thread.currentThread(), "getClickTrackersList exception : " + exception0.getMessage());
        }
        return null;
    }

    public List getImpTrackersList() {
        try {
            g g0 = (g)this.e.b().get(0);
            if(g0 != null) {
                return g0.j();
            }
        }
        catch(Exception exception0) {
            com.igaworks.ssp.b.c(Thread.currentThread(), "getImpTrackersList exception : " + exception0.getMessage());
        }
        return null;
    }

    public String getPlacementId() {
        return this.a;
    }

    public void loadAd() {
        class a extends z {
            final AdPopcornSSPCustomAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.custom.AdPopcornSSPCustomAd.a.a implements Runnable {
                    final a a;

                    @Override
                    public void run() {
                        AdPopcornSSPCustomAd.this.loadAd();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.custom.AdPopcornSSPCustomAd.a.a(this));
            }
        }

        try {
            if(!E.g().f()) {
                com.igaworks.ssp.b.a(Thread.currentThread(), this.a + " : GDPR_CONSENT_UNAVAILABLE");
                this.a(5008);
                return;
            }
            if(this.a != null && this.a.length() != 0) {
                if(this.c == null) {
                    this.c = CustomAdType.BANNER_320x50;
                }
                if(!E.g().m()) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "Checking ADID...");
                    E.g().a(new a(this));
                    E e0 = E.g();
                    Objects.requireNonNull(e0);
                    new j(e0, this.d.getApplicationContext()).start();
                    return;
                }
                E.g().a(this);
                com.igaworks.ssp.b.c(Thread.currentThread(), "loadAd : " + this.a);
                if(!e0.b(this.d.getApplicationContext())) {
                    this.a(100001);
                    return;
                }
                e t$e0 = e.b;
                CustomAdType customAdType0 = this.c;
                if(customAdType0 != CustomAdType.BANNER_320x50) {
                    if(customAdType0 == CustomAdType.BANNER_320x100) {
                        t$e0 = e.d;
                    }
                    else if(customAdType0 == CustomAdType.BANNER_300x250) {
                        t$e0 = e.c;
                    }
                    else if(customAdType0 == CustomAdType.INTERSTITIAL) {
                        t$e0 = e.h;
                    }
                    else if(customAdType0 == CustomAdType.NATIVE_AD) {
                        t$e0 = e.n;
                    }
                }
                E.g().d().a(this.d.getApplicationContext(), t$e0, this.a, this.b, false, this.g);
                return;
            }
            this.a(2030);
        }
        catch(Exception unused_ex) {
            this.a(200);
        }
    }

    public void reportClick() {
        com.igaworks.ssp.b.c(Thread.currentThread(), "called reportClick");
        try {
            g g0 = (g)this.e.b().get(0);
            for(int v = 0; v < g0.b().size(); ++v) {
                String s = (String)g0.b().get(v);
                if(s0.a(s)) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), String.format("reportClick url : %s ", s));
                    E.g().d().a(this.d, e.j, s);
                }
            }
        }
        catch(Exception exception0) {
            com.igaworks.ssp.b.c(Thread.currentThread(), "reportClick exception : " + exception0.getMessage());
        }
    }

    public void reportImpression() {
        com.igaworks.ssp.b.c(Thread.currentThread(), "called reportImpression");
        try {
            if(y.a(this.e)) {
                goto label_6;
            }
        }
        catch(Exception exception0) {
            com.igaworks.ssp.b.c(Thread.currentThread(), "reportImpression exception : " + exception0.getMessage());
        }
        return;
        try {
        label_6:
            g g0 = (g)this.e.b().get(0);
            for(int v = 0; v < g0.j().size(); ++v) {
                String s = (String)g0.j().get(v);
                if(s0.a(s)) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), String.format("<reportImpression url : %s>", s));
                    E.g().d().a(this.d, e.i, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void setAdType(CustomAdType customAdType0) {
        this.c = customAdType0;
    }

    public void setCustomAdEventCallbackListener(ICustomAdListener iCustomAdListener0) {
        this.f = iCustomAdListener0;
    }

    public void setPlacementAppKey(String s) {
        this.b = s;
    }

    public void setPlacementId(String s) {
        this.a = s;
        E.g().a(this);
    }

    public void stopAd() {
        try {
            com.igaworks.ssp.b.c(Thread.currentThread(), "stopAd : " + this.a);
            if(this.e != null) {
                this.e = null;
            }
            E.g().b(this);
            return;
        }
        catch(Exception exception0) {
        }
        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
    }
}

