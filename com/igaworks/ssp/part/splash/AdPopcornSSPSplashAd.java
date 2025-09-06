package com.igaworks.ssp.part.splash;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.igaworks.ssp.E.j;
import com.igaworks.ssp.E;
import com.igaworks.ssp.M;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.common.adapter.BaseMediationAdapter;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.e0;
import com.igaworks.ssp.i;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.splash.listener.ISplashAdEventCallbackListener;
import com.igaworks.ssp.r0;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.t0;
import com.igaworks.ssp.t;
import com.igaworks.ssp.y;
import com.igaworks.ssp.z;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;

public class AdPopcornSSPSplashAd extends FrameLayout {
    class b implements r0 {
        final AdPopcornSSPSplashAd a;

        @Override  // com.igaworks.ssp.r0
        public void a(int v) {
            AdPopcornSSPSplashAd.this.h = v;
            AdPopcornSSPSplashAd.this.f();
        }

        @Override  // com.igaworks.ssp.r0
        public void a(int v, int v1) {
            try {
                if(AdPopcornSSPSplashAd.this.k != null) {
                    com.igaworks.ssp.b.a(Thread.currentThread(), "Fail in adapter : " + AdPopcornSSPSplashAd.this.k.getNetworkName() + ", internalReason : " + v1);
                    AdPopcornSSPSplashAd.this.a(AdPopcornSSPSplashAd.this.k);
                }
                if(AdPopcornSSPSplashAd.this.d.e() == null) {
                    AdPopcornSSPSplashAd.this.a(5002);
                    return;
                }
                if(v < AdPopcornSSPSplashAd.this.d.e().a().size() - 1) {
                    AdPopcornSSPSplashAd.this.h = v + 1;
                    i i0 = i.a(((a0)AdPopcornSSPSplashAd.this.d.e().a().get(AdPopcornSSPSplashAd.this.h)).a());
                    BaseMediationAdapter baseMediationAdapter0 = AdPopcornSSPSplashAd.this.a(i0);
                    AdPopcornSSPSplashAd.this.k = baseMediationAdapter0;
                    AdPopcornSSPSplashAd.this.k.setSplashMediationAdapterEventListener(this);
                    AdPopcornSSPSplashAd.this.k.loadSplashAd(((Context)AdPopcornSSPSplashAd.this.c.get()), AdPopcornSSPSplashAd.this.d, AdPopcornSSPSplashAd.this.h, AdPopcornSSPSplashAd.this);
                    return;
                }
                AdPopcornSSPSplashAd.this.a(5002);
                return;
            }
            catch(Exception exception0) {
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            AdPopcornSSPSplashAd.this.a(200);
        }

        @Override  // com.igaworks.ssp.r0
        public void onImpression() {
            AdPopcornSSPSplashAd.this.e();
        }
    }

    class c implements M {
        final AdPopcornSSPSplashAd a;

        @Override  // com.igaworks.ssp.M
        public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
            if(t$e0 == e.v) {
                try {
                    if(z) {
                        AdPopcornSSPSplashAd.this.a(5000);
                        return;
                    }
                    if(s0.b(s)) {
                        AdPopcornSSPSplashAd.this.a(0x270F);
                        return;
                    }
                    if(!e0.b(((Context)AdPopcornSSPSplashAd.this.c.get()).getApplicationContext())) {
                        AdPopcornSSPSplashAd.this.a(100001);
                        return;
                    }
                    d0 d00 = p.f(s);
                    if(d00 != null && d00.h() != 1) {
                        AdPopcornSSPSplashAd.this.a(d00.h());
                        return;
                    }
                    AdPopcornSSPSplashAd.this.d = d00;
                    if(AdPopcornSSPSplashAd.this.d != null && AdPopcornSSPSplashAd.this.d.d() != null) {
                        t0.a(((Context)AdPopcornSSPSplashAd.this.c.get()), AdPopcornSSPSplashAd.this.d.d());
                    }
                    AdPopcornSSPSplashAd.this.d();
                    return;
                }
                catch(Exception exception0) {
                }
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                AdPopcornSSPSplashAd.this.a(200);
            }
        }
    }

    private String a;
    private String b;
    private WeakReference c;
    private d0 d;
    private ISplashAdEventCallbackListener e;
    private boolean f;
    private boolean g;
    private int h;
    private boolean i;
    private ConcurrentHashMap j;
    private BaseMediationAdapter k;
    private r0 l;
    M m;

    public AdPopcornSSPSplashAd(Context context0) {
        super(context0);
        this.f = false;
        this.g = false;
        this.h = 0;
        this.i = false;
        this.l = new b(this);
        this.m = new c(this);
        this.c = new WeakReference(context0);
    }

    public AdPopcornSSPSplashAd(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = false;
        this.g = false;
        this.h = 0;
        this.i = false;
        this.l = new b(this);
        this.m = new c(this);
        this.c = new WeakReference(context0);
    }

    public AdPopcornSSPSplashAd(Context context0, String s) {
        super(context0);
        this.f = false;
        this.g = false;
        this.h = 0;
        this.i = false;
        this.l = new b(this);
        this.m = new c(this);
        this.c = new WeakReference(context0);
        this.b = s;
    }

    private BaseMediationAdapter a(i i0) {
        if(this.j == null) {
            this.j = new ConcurrentHashMap();
        }
        BaseMediationAdapter baseMediationAdapter0 = (BaseMediationAdapter)this.j.get(i0);
        if(baseMediationAdapter0 == null) {
            baseMediationAdapter0 = i0.e();
            if(baseMediationAdapter0 != null) {
                this.j.put(i0, baseMediationAdapter0);
            }
        }
        return baseMediationAdapter0;
    }

    private void a() {
        try {
            if(this.d != null && !this.d.n()) {
                this.d.b(true);
                Object[] arr_object = {"", this.getCurrentNetwork(), this.a};
                E.g().d().a(((Context)this.c.get()).getApplicationContext(), e.i, "" + String.format("&advertising_id=%s&ad_network_no=%d&placement_id=%s", arr_object));
                return;
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), "callMediationImpTracking null or already fired.");
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(int v) {
        this.f = false;
        this.g = false;
        ISplashAdEventCallbackListener iSplashAdEventCallbackListener0 = this.e;
        if(iSplashAdEventCallbackListener0 != null) {
            iSplashAdEventCallbackListener0.onSplashAdLoadFailed(new SSPErrorCode(v));
        }
        this.c();
    }

    private void a(BaseMediationAdapter baseMediationAdapter0) {
        if(baseMediationAdapter0 == null) {
            return;
        }
        baseMediationAdapter0.setSplashMediationAdapterEventListener(null);
        baseMediationAdapter0.destroySplashAd();
    }

    private void b() {
        ConcurrentHashMap concurrentHashMap0 = this.j;
        if(concurrentHashMap0 != null) {
            concurrentHashMap0.clear();
            this.j = null;
        }
    }

    private void c() {
        com.igaworks.ssp.b.c(Thread.currentThread(), "internalStopAd : " + this.a);
        this.setVisibility(8);
    }

    private void d() {
        try {
            if(y.c(this.d)) {
                y.a(this.d, this.j);
                BaseMediationAdapter baseMediationAdapter0 = this.a(i.a(((a0)this.d.e().a().get(this.h)).a()));
                this.k = baseMediationAdapter0;
                baseMediationAdapter0.setSplashMediationAdapterEventListener(this.l);
                this.k.loadSplashAd(((Context)this.c.get()), this.d, this.h, this);
                return;
            }
            if(y.a(this.d)) {
                BaseMediationAdapter baseMediationAdapter1 = this.a(i.c);
                this.k = baseMediationAdapter1;
                baseMediationAdapter1.setSplashMediationAdapterEventListener(this.l);
                this.k.loadSplashAd(((Context)this.c.get()), this.d, this.h, this);
                return;
            }
            this.a(this.d.h());
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        this.a(200);
    }

    public void destroy() {
        try {
            com.igaworks.ssp.b.c(Thread.currentThread(), "splashAd destroy : " + this.a);
            this.g = false;
            this.f = false;
            BaseMediationAdapter baseMediationAdapter0 = this.k;
            if(baseMediationAdapter0 != null) {
                baseMediationAdapter0.destroySplashAd();
                this.k.setSplashMediationAdapterEventListener(null);
                this.k = null;
            }
            if(this.d != null) {
                this.d = null;
            }
            E.g().b(this);
            this.b();
            return;
        }
        catch(Exception exception0) {
        }
        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
    }

    private void e() {
        ISplashAdEventCallbackListener iSplashAdEventCallbackListener0 = this.e;
        if(iSplashAdEventCallbackListener0 != null) {
            iSplashAdEventCallbackListener0.onImpression();
        }
    }

    private void f() {
        this.f = false;
        this.g = true;
        this.a();
        ISplashAdEventCallbackListener iSplashAdEventCallbackListener0 = this.e;
        if(iSplashAdEventCallbackListener0 != null) {
            iSplashAdEventCallbackListener0.onSplashAdLoadSuccess();
        }
    }

    public int getCurrentNetwork() {
        try {
            return this.k == null ? -1 : i.a(this.k.getNetworkName()).b();
        }
        catch(Exception unused_ex) {
        }
        return -1;
    }

    public boolean isFullscreenSplash() {
        return this.i;
    }

    public boolean isLoaded() {
        return this.g;
    }

    public void loadAd() {
        class a extends z {
            final AdPopcornSSPSplashAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.splash.AdPopcornSSPSplashAd.a.a implements Runnable {
                    final a a;

                    @Override
                    public void run() {
                        AdPopcornSSPSplashAd.this.f = false;
                        AdPopcornSSPSplashAd.this.loadAd();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.splash.AdPopcornSSPSplashAd.a.a(this));
            }
        }

        try {
            if(!E.g().f()) {
                com.igaworks.ssp.b.a(Thread.currentThread(), this.a + " : GDPR_CONSENT_UNAVAILABLE");
                this.a(5008);
                return;
            }
            if(this.f) {
                com.igaworks.ssp.b.b(Thread.currentThread(), this.a + " : SplashAd In Progress!!");
                return;
            }
            this.h = 0;
            this.f = true;
            if(this.a != null && this.a.length() != 0) {
                if(!E.g().m()) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "Checking ADID...");
                    E.g().a(new a(this));
                    E e0 = E.g();
                    Objects.requireNonNull(e0);
                    new j(e0, ((Context)this.c.get()).getApplicationContext()).start();
                    return;
                }
                com.igaworks.ssp.b.c(Thread.currentThread(), "load SplashAd : " + this.a);
                if(!e0.b(((Context)this.c.get()).getApplicationContext())) {
                    this.a(100001);
                    return;
                }
                t t0 = E.g().d();
                if(this.i) {
                    t0.a(((Context)this.c.get()).getApplicationContext(), e.v, this.a, this.b, 2, this.m);
                    return;
                }
                t0.a(((Context)this.c.get()).getApplicationContext(), e.v, this.a, this.b, 1, this.m);
                return;
            }
            this.a(2030);
        }
        catch(Exception unused_ex) {
            this.f = false;
        }
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        BaseMediationAdapter baseMediationAdapter0 = this.k;
        if(baseMediationAdapter0 != null) {
            baseMediationAdapter0.checkAdPopcornSSPNativeImpression();
        }
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        BaseMediationAdapter baseMediationAdapter0 = this.k;
        if(baseMediationAdapter0 != null) {
            baseMediationAdapter0.checkAdPopcornSSPNativeImpression();
        }
    }

    public void setFullScreenSplash(boolean z) {
        this.i = z;
    }

    public void setPlacementAppKey(String s) {
        this.b = s;
    }

    public void setPlacementId(String s) {
        this.a = s;
        E.g().a(this);
    }

    public void setSplashAdEventCallbackListener(ISplashAdEventCallbackListener iSplashAdEventCallbackListener0) {
        this.e = iSplashAdEventCallbackListener0;
    }
}

