package com.igaworks.ssp.part.custom;

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
import com.igaworks.ssp.g0;
import com.igaworks.ssp.i;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.custom.listener.IReactNativeAdEventCallbackListener;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.t0;
import com.igaworks.ssp.y;
import com.igaworks.ssp.z;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;

public class AdPopcornSSPReactNativeAd extends FrameLayout {
    class b implements g0 {
        final AdPopcornSSPReactNativeAd a;

        @Override  // com.igaworks.ssp.g0
        public void a(int v, int v1) {
            try {
                if(AdPopcornSSPReactNativeAd.this.i != null) {
                    com.igaworks.ssp.b.a(Thread.currentThread(), "Fail in adapter : " + AdPopcornSSPReactNativeAd.this.i.getNetworkName() + ", internalReason : " + v1);
                    AdPopcornSSPReactNativeAd.this.a(AdPopcornSSPReactNativeAd.this.i);
                }
                if(v1 == 3) {
                    com.igaworks.ssp.b.b(Thread.currentThread(), "Native asset error : " + AdPopcornSSPReactNativeAd.this.i.getNetworkName());
                }
                if(AdPopcornSSPReactNativeAd.this.d.e() == null) {
                    AdPopcornSSPReactNativeAd.this.a(5002);
                    return;
                }
                if(v < AdPopcornSSPReactNativeAd.this.d.e().a().size() - 1) {
                    AdPopcornSSPReactNativeAd.this.h = v + 1;
                    i i0 = i.a(((a0)AdPopcornSSPReactNativeAd.this.d.e().a().get(AdPopcornSSPReactNativeAd.this.h)).a());
                    AdPopcornSSPReactNativeAd.this.k = false;
                    BaseMediationAdapter baseMediationAdapter0 = AdPopcornSSPReactNativeAd.this.a(i0);
                    AdPopcornSSPReactNativeAd.this.i = baseMediationAdapter0;
                    AdPopcornSSPReactNativeAd.this.i.setReactNativeMediationAdapterEventListener(this);
                    AdPopcornSSPReactNativeAd.this.i.loadReactNativeAd(((Context)AdPopcornSSPReactNativeAd.this.c.get()), AdPopcornSSPReactNativeAd.this.d, AdPopcornSSPReactNativeAd.this.k, AdPopcornSSPReactNativeAd.this.h, AdPopcornSSPReactNativeAd.this);
                    return;
                }
                AdPopcornSSPReactNativeAd.this.a(5002);
                return;
            }
            catch(Exception exception0) {
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            AdPopcornSSPReactNativeAd.this.a(200);
        }

        @Override  // com.igaworks.ssp.g0
        public void a(int v, int v1, int v2, int v3) {
            AdPopcornSSPReactNativeAd.this.h = v;
            AdPopcornSSPReactNativeAd.this.a(v1, v2, v3);
        }

        @Override  // com.igaworks.ssp.g0
        public void onClicked() {
            AdPopcornSSPReactNativeAd.this.e();
        }

        @Override  // com.igaworks.ssp.g0
        public void onImpression() {
            AdPopcornSSPReactNativeAd.this.f();
        }
    }

    class c implements M {
        final AdPopcornSSPReactNativeAd a;

        @Override  // com.igaworks.ssp.M
        public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
            if(t$e0 == e.n) {
                try {
                    if(z) {
                        AdPopcornSSPReactNativeAd.this.a(5000);
                        return;
                    }
                    if(s0.b(s)) {
                        AdPopcornSSPReactNativeAd.this.a(0x270F);
                        return;
                    }
                    if(!e0.b(((Context)AdPopcornSSPReactNativeAd.this.c.get()).getApplicationContext())) {
                        AdPopcornSSPReactNativeAd.this.a(100001);
                        return;
                    }
                    d0 d00 = p.f(s);
                    if(d00 != null && d00.h() != 1) {
                        AdPopcornSSPReactNativeAd.this.a(d00.h());
                        return;
                    }
                    AdPopcornSSPReactNativeAd.this.d = d00;
                    if(AdPopcornSSPReactNativeAd.this.d != null && AdPopcornSSPReactNativeAd.this.d.d() != null) {
                        t0.a(((Context)AdPopcornSSPReactNativeAd.this.c.get()), AdPopcornSSPReactNativeAd.this.d.d());
                    }
                    AdPopcornSSPReactNativeAd.this.d();
                    return;
                }
                catch(Exception exception0) {
                }
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                AdPopcornSSPReactNativeAd.this.a(200);
            }
        }
    }

    private String a;
    private String b;
    private WeakReference c;
    private d0 d;
    private IReactNativeAdEventCallbackListener e;
    private boolean f;
    private boolean g;
    private int h;
    private BaseMediationAdapter i;
    private ConcurrentHashMap j;
    private boolean k;
    private int l;
    private int m;
    private g0 n;
    M o;

    public AdPopcornSSPReactNativeAd(Context context0) {
        super(context0);
        this.f = false;
        this.g = false;
        this.h = 0;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.n = new b(this);
        this.o = new c(this);
        this.c = new WeakReference(context0);
    }

    public AdPopcornSSPReactNativeAd(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = false;
        this.g = false;
        this.h = 0;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.n = new b(this);
        this.o = new c(this);
        this.c = new WeakReference(context0);
    }

    public AdPopcornSSPReactNativeAd(Context context0, String s) {
        super(context0);
        this.f = false;
        this.g = false;
        this.h = 0;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.n = new b(this);
        this.o = new c(this);
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
        IReactNativeAdEventCallbackListener iReactNativeAdEventCallbackListener0 = this.e;
        if(iReactNativeAdEventCallbackListener0 != null) {
            iReactNativeAdEventCallbackListener0.onReactNativeAdLoadFailed(new SSPErrorCode(v));
        }
        this.c();
    }

    private void a(int v, int v1, int v2) {
        this.f = false;
        this.g = true;
        this.a();
        IReactNativeAdEventCallbackListener iReactNativeAdEventCallbackListener0 = this.e;
        if(iReactNativeAdEventCallbackListener0 != null) {
            iReactNativeAdEventCallbackListener0.onReactNativeAdLoadSuccess(v, v1, v2);
        }
    }

    private void a(BaseMediationAdapter baseMediationAdapter0) {
        if(baseMediationAdapter0 == null) {
            return;
        }
        baseMediationAdapter0.setNativeMediationAdapterEventListener(null);
        baseMediationAdapter0.destroyNativeAd();
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
                i i0 = i.a(((a0)this.d.e().a().get(this.h)).a());
                this.k = false;
                BaseMediationAdapter baseMediationAdapter0 = this.a(i0);
                this.i = baseMediationAdapter0;
                baseMediationAdapter0.setReactNativeMediationAdapterEventListener(this.n);
                this.i.loadReactNativeAd(((Context)this.c.get()), this.d, this.k, this.h, this);
                return;
            }
            this.k = false;
            if(y.a(this.d)) {
                BaseMediationAdapter baseMediationAdapter1 = this.a(i.c);
                this.i = baseMediationAdapter1;
                baseMediationAdapter1.setReactNativeMediationAdapterEventListener(this.n);
                this.i.loadReactNativeAd(((Context)this.c.get()), this.d, this.k, this.h, this);
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
            com.igaworks.ssp.b.c(Thread.currentThread(), "ReactNativeAd destroy : " + this.a);
            this.g = false;
            this.f = false;
            BaseMediationAdapter baseMediationAdapter0 = this.i;
            if(baseMediationAdapter0 != null) {
                baseMediationAdapter0.destroyReactNativeAd();
                this.i.setReactNativeMediationAdapterEventListener(null);
                this.i = null;
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
        IReactNativeAdEventCallbackListener iReactNativeAdEventCallbackListener0 = this.e;
        if(iReactNativeAdEventCallbackListener0 != null) {
            iReactNativeAdEventCallbackListener0.onClicked();
        }
    }

    private void f() {
        IReactNativeAdEventCallbackListener iReactNativeAdEventCallbackListener0 = this.e;
        if(iReactNativeAdEventCallbackListener0 != null) {
            iReactNativeAdEventCallbackListener0.onImpression();
        }
    }

    public int getCurrentNetwork() {
        try {
            return this.i == null ? -1 : i.a(this.i.getNetworkName()).b();
        }
        catch(Exception unused_ex) {
        }
        return -1;
    }

    public int getReactNativeHeight() {
        return this.m;
    }

    public int getReactNativeWidth() {
        return this.l;
    }

    public boolean isLoaded() {
        return this.g;
    }

    public void loadAd() {
        class a extends z {
            final AdPopcornSSPReactNativeAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.custom.AdPopcornSSPReactNativeAd.a.a implements Runnable {
                    final a a;

                    @Override
                    public void run() {
                        AdPopcornSSPReactNativeAd.this.f = false;
                        AdPopcornSSPReactNativeAd.this.loadAd();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.custom.AdPopcornSSPReactNativeAd.a.a(this));
            }
        }

        try {
            if(!E.g().f()) {
                com.igaworks.ssp.b.a(Thread.currentThread(), this.a + " : GDPR_CONSENT_UNAVAILABLE");
                this.a(5008);
                return;
            }
            if(this.f) {
                com.igaworks.ssp.b.b(Thread.currentThread(), this.a + " : ReactNativeAd In Progress!!");
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
                com.igaworks.ssp.b.c(Thread.currentThread(), "load ReactNativeAd : " + this.a);
                if(!e0.b(((Context)this.c.get()).getApplicationContext())) {
                    this.a(100001);
                    return;
                }
                E.g().d().a(((Context)this.c.get()).getApplicationContext(), e.n, this.a, this.b, null, this.o);
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
        BaseMediationAdapter baseMediationAdapter0 = this.i;
        if(baseMediationAdapter0 != null) {
            baseMediationAdapter0.checkAdPopcornSSPNativeImpression();
        }
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        BaseMediationAdapter baseMediationAdapter0 = this.i;
        if(baseMediationAdapter0 != null) {
            baseMediationAdapter0.checkAdPopcornSSPNativeImpression();
        }
    }

    public void setPlacementAppKey(String s) {
        this.b = s;
    }

    public void setPlacementId(String s) {
        this.a = s;
        E.g().a(this);
    }

    public void setReactNativeAdEventCallbackListener(IReactNativeAdEventCallbackListener iReactNativeAdEventCallbackListener0) {
        this.e = iReactNativeAdEventCallbackListener0;
    }

    public void setReactNativeHeight(int v) {
        this.m = v;
    }

    public void setReactNativeWidth(int v) {
        this.l = v;
    }
}

