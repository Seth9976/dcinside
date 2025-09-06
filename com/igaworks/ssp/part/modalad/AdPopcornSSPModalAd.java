package com.igaworks.ssp.part.modalad;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.igaworks.ssp.E.j;
import com.igaworks.ssp.E;
import com.igaworks.ssp.M;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.b0;
import com.igaworks.ssp.b;
import com.igaworks.ssp.common.adapter.BaseMediationAdapter;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.e0;
import com.igaworks.ssp.i;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.IMediationLogListener;
import com.igaworks.ssp.part.modalad.listener.IModalAdEventCallbackListener;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.t0;
import com.igaworks.ssp.t;
import com.igaworks.ssp.y;
import com.igaworks.ssp.z;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Calendar;

public class AdPopcornSSPModalAd {
    public class CloseBtnType {
        public static final int CLOSE_AD = 0;
        public static final int DO_NOT_SHOW_TODAY = 1;
        final AdPopcornSSPModalAd a;

    }

    class d implements b0 {
        final AdPopcornSSPModalAd a;

        @Override  // com.igaworks.ssp.b0
        public void a() {
            AdPopcornSSPModalAd.this.b();
        }

        @Override  // com.igaworks.ssp.b0
        public void a(int v) {
            AdPopcornSSPModalAd.this.e();
        }

        @Override  // com.igaworks.ssp.b0
        public void b(int v) {
            if(AdPopcornSSPModalAd.this.k != null && AdPopcornSSPModalAd.this.j != null) {
                AdPopcornSSPModalAd.this.k.OnMediationLoadSuccess(AdPopcornSSPModalAd.this.d, i.a(AdPopcornSSPModalAd.this.j.getNetworkName()).b());
            }
            AdPopcornSSPModalAd.this.g = v;
            AdPopcornSSPModalAd.this.d();
        }

        @Override  // com.igaworks.ssp.b0
        public void c(int v) {
            AdPopcornSSPModalAd.this.b(5011);
        }

        @Override  // com.igaworks.ssp.b0
        public void d(int v) {
            try {
                if(AdPopcornSSPModalAd.this.k != null && AdPopcornSSPModalAd.this.j != null) {
                    int v1 = i.a(AdPopcornSSPModalAd.this.j.getNetworkName()).b();
                    AdPopcornSSPModalAd.this.k.OnMediationLoadFailed(AdPopcornSSPModalAd.this.d, v1);
                }
                if(AdPopcornSSPModalAd.this.b.e() == null) {
                    AdPopcornSSPModalAd.this.a(5002);
                    return;
                }
                if(v < AdPopcornSSPModalAd.this.b.e().a().size() - 1) {
                    AdPopcornSSPModalAd.this.g = v + 1;
                    i i0 = i.a(((a0)AdPopcornSSPModalAd.this.b.e().a().get(AdPopcornSSPModalAd.this.g)).a());
                    BaseMediationAdapter baseMediationAdapter0 = AdPopcornSSPModalAd.this.a(i0);
                    AdPopcornSSPModalAd.this.j = baseMediationAdapter0;
                    AdPopcornSSPModalAd.this.j.setModalAdMediationAdapterEventListener(this);
                    if(AdPopcornSSPModalAd.this.k != null) {
                        int v2 = i.a(AdPopcornSSPModalAd.this.j.getNetworkName()).b();
                        AdPopcornSSPModalAd.this.k.OnMediationLoadStart(AdPopcornSSPModalAd.this.d, v2);
                    }
                    Context context0 = (Context)AdPopcornSSPModalAd.this.c.get();
                    AdPopcornSSPModalAd.this.j.loadModalAd(context0, AdPopcornSSPModalAd.this.b, AdPopcornSSPModalAd.this.g, AdPopcornSSPModalAd.this);
                    return;
                }
                AdPopcornSSPModalAd.this.a(5002);
                return;
            }
            catch(Exception exception0) {
            }
            b.a(Thread.currentThread(), exception0);
            AdPopcornSSPModalAd.this.a(200);
        }

        @Override  // com.igaworks.ssp.b0
        public void e(int v) {
            AdPopcornSSPModalAd.this.c();
        }
    }

    private IModalAdEventCallbackListener a;
    private d0 b;
    private WeakReference c;
    private String d;
    private String e;
    private boolean f;
    private int g;
    private boolean h;
    private ConcurrentHashMap i;
    private BaseMediationAdapter j;
    private IMediationLogListener k;
    private int l;
    private int m;
    private float n;
    private boolean o;
    private b0 p;

    public AdPopcornSSPModalAd(Context context0) {
        this.f = false;
        this.g = 0;
        this.h = false;
        this.l = 0;
        this.m = 80;
        this.n = 0.5f;
        this.o = true;
        this.p = new d(this);
        this.c = new WeakReference(context0);
        E.g().a(this);
    }

    public AdPopcornSSPModalAd(Context context0, String s) {
        this.f = false;
        this.g = 0;
        this.h = false;
        this.l = 0;
        this.m = 80;
        this.n = 0.5f;
        this.o = true;
        this.p = new d(this);
        this.c = new WeakReference(context0);
        E.g().a(this);
        this.e = s;
    }

    private BaseMediationAdapter a(i i0) {
        if(this.i == null) {
            this.i = new ConcurrentHashMap();
        }
        BaseMediationAdapter baseMediationAdapter0 = (BaseMediationAdapter)this.i.get(i0);
        if(baseMediationAdapter0 == null) {
            baseMediationAdapter0 = i0.e();
            if(baseMediationAdapter0 != null) {
                this.i.put(i0, baseMediationAdapter0);
            }
        }
        return baseMediationAdapter0;
    }

    private void a() {
        try {
            if(this.b != null && !this.b.n()) {
                this.b.b(true);
                Object[] arr_object = {"", this.getCurrentNetwork(), this.d};
                E.g().d().a(((Context)this.c.get()).getApplicationContext(), e.i, "" + String.format("&advertising_id=%s&ad_network_no=%d&placement_id=%s", arr_object));
                return;
            }
            b.a(Thread.currentThread(), "callMediationImpTracking null or already fired.");
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(int v) {
        this.f = false;
        this.h = false;
        IModalAdEventCallbackListener iModalAdEventCallbackListener0 = this.a;
        if(iModalAdEventCallbackListener0 != null) {
            iModalAdEventCallbackListener0.OnModalAdLoadFailed(new SSPErrorCode(v));
        }
    }

    private void a(d0 d00) {
        try {
            if(y.c(d00)) {
                y.a(d00, this.i);
                BaseMediationAdapter baseMediationAdapter0 = this.a(i.a(((a0)d00.e().a().get(this.g)).a()));
                this.j = baseMediationAdapter0;
                baseMediationAdapter0.showModalAd(((Context)this.c.get()), d00, this.g, this);
                this.j.setModalAdMediationAdapterEventListener(this.p);
                return;
            }
            if(y.a(d00)) {
                BaseMediationAdapter baseMediationAdapter1 = this.a(i.c);
                this.j = baseMediationAdapter1;
                baseMediationAdapter1.showModalAd(((Context)this.c.get()), d00, this.g, this);
                this.j.setModalAdMediationAdapterEventListener(this.p);
                return;
            }
            this.b(d00.h());
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.b(200);
    }

    private void b() {
        IModalAdEventCallbackListener iModalAdEventCallbackListener0 = this.a;
        if(iModalAdEventCallbackListener0 != null) {
            iModalAdEventCallbackListener0.OnModalAdClicked();
        }
    }

    private void b(int v) {
        IModalAdEventCallbackListener iModalAdEventCallbackListener0 = this.a;
        if(iModalAdEventCallbackListener0 != null) {
            iModalAdEventCallbackListener0.OnModalAdOpenFailed(new SSPErrorCode(v));
        }
    }

    private void c() {
        this.h = false;
        IModalAdEventCallbackListener iModalAdEventCallbackListener0 = this.a;
        if(iModalAdEventCallbackListener0 != null) {
            iModalAdEventCallbackListener0.OnModalAdClosed();
        }
    }

    private void d() {
        this.f = false;
        this.h = true;
        IModalAdEventCallbackListener iModalAdEventCallbackListener0 = this.a;
        if(iModalAdEventCallbackListener0 != null) {
            iModalAdEventCallbackListener0.OnModalAdLoaded();
        }
    }

    public void destroy() {
        synchronized(this) {
            try {
                b.c(Thread.currentThread(), "destroy : " + this.d);
                this.f = false;
                BaseMediationAdapter baseMediationAdapter0 = this.j;
                if(baseMediationAdapter0 != null) {
                    baseMediationAdapter0.destroyModalAd();
                    this.j.setModalAdMediationAdapterEventListener(null);
                    this.j = null;
                }
                if(this.b != null) {
                    this.b = null;
                }
                this.f();
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
            }
        }
    }

    private void e() {
        this.a();
        IModalAdEventCallbackListener iModalAdEventCallbackListener0 = this.a;
        if(iModalAdEventCallbackListener0 != null) {
            iModalAdEventCallbackListener0.OnModalAdOpened();
        }
    }

    private void f() {
        ConcurrentHashMap concurrentHashMap0 = this.i;
        if(concurrentHashMap0 != null) {
            concurrentHashMap0.clear();
            this.i = null;
        }
    }

    private void g() {
        try {
            if(y.c(this.b)) {
                y.a(this.b, this.i);
                this.g = 0;
                BaseMediationAdapter baseMediationAdapter0 = this.a(i.a(((a0)this.b.e().a().get(0)).a()));
                this.j = baseMediationAdapter0;
                baseMediationAdapter0.setModalAdMediationAdapterEventListener(this.p);
                IMediationLogListener iMediationLogListener0 = this.k;
                if(iMediationLogListener0 != null) {
                    iMediationLogListener0.OnMediationLoadStart(this.d, i.a(this.j.getNetworkName()).b());
                }
                this.j.loadModalAd(((Context)this.c.get()), this.b, this.g, this);
                return;
            }
            if(y.a(this.b)) {
                BaseMediationAdapter baseMediationAdapter1 = this.a(i.c);
                this.j = baseMediationAdapter1;
                baseMediationAdapter1.setModalAdMediationAdapterEventListener(this.p);
                IMediationLogListener iMediationLogListener1 = this.k;
                if(iMediationLogListener1 != null) {
                    iMediationLogListener1.OnMediationLoadStart(this.d, i.a(this.j.getNetworkName()).b());
                }
                this.j.loadModalAd(((Context)this.c.get()), this.b, this.g, this);
                return;
            }
            this.a(this.b.h());
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.a(200);
    }

    public int getAdGravity() {
        return this.m;
    }

    public float getBackgroundAlpha() {
        return this.n;
    }

    public int getCloseBtnType() {
        return this.l;
    }

    public int getCurrentNetwork() {
        try {
            return this.j == null ? -1 : i.a(this.j.getNetworkName()).b();
        }
        catch(Exception unused_ex) {
        }
        return -1;
    }

    public String getPlacementId() {
        return this.d;
    }

    public boolean isEnableBackKey() {
        return this.o;
    }

    public boolean isLoaded() {
        return this.h;
    }

    public void loadAd() {
        class a extends z {
            final AdPopcornSSPModalAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd.a.a implements Runnable {
                    final a a;

                    @Override
                    public void run() {
                        AdPopcornSSPModalAd.this.f = false;
                        AdPopcornSSPModalAd.this.loadAd();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd.a.a(this));
            }
        }


        class com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd.b implements M {
            final AdPopcornSSPModalAd a;

            @Override  // com.igaworks.ssp.M
            public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
                try {
                    if(z) {
                        AdPopcornSSPModalAd.this.a(5000);
                        return;
                    }
                    if(s0.b(s)) {
                        AdPopcornSSPModalAd.this.a(0x270F);
                        return;
                    }
                    d0 d00 = p.f(s);
                    if(d00 != null && d00.h() != 1) {
                        AdPopcornSSPModalAd.this.a(d00.h());
                        return;
                    }
                    AdPopcornSSPModalAd.this.b = d00;
                    if(AdPopcornSSPModalAd.this.b != null && AdPopcornSSPModalAd.this.b.d() != null) {
                        t0.a(((Context)AdPopcornSSPModalAd.this.c.get()), AdPopcornSSPModalAd.this.b.d());
                    }
                    AdPopcornSSPModalAd.this.g();
                    return;
                }
                catch(Exception exception0) {
                }
                b.a(Thread.currentThread(), exception0);
                AdPopcornSSPModalAd.this.a(200);
            }
        }

        synchronized(this) {
            try {
                if(E.g().f()) {
                    if(this.f) {
                        b.b(Thread.currentThread(), this.d + " : ModalAd In Progress!!");
                        return;
                    }
                    if(this.l == 1) {
                        SharedPreferences sharedPreferences0 = ((Context)this.c.get()).getSharedPreferences("adpopcorn_parameter", 0);
                        int v1 = sharedPreferences0.getInt("modal_ad_impression_day", -1);
                        if(v1 == Calendar.getInstance().get(6)) {
                            b.b(Thread.currentThread(), "ModalAd does not show today : " + v1);
                            this.a(5012);
                            return;
                        }
                        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                        sharedPreferences$Editor0.putInt("modal_ad_impression_day", -1);
                        sharedPreferences$Editor0.commit();
                    }
                    this.f = true;
                    this.h = false;
                    if(this.d == null || this.d.length() == 0) {
                        this.a(2030);
                        return;
                    }
                    if(!E.g().m()) {
                        b.c(Thread.currentThread(), "Checking ADID...");
                        E.g().a(new a(this));
                        E e0 = E.g();
                        Objects.requireNonNull(e0);
                        new j(e0, ((Context)this.c.get()).getApplicationContext()).start();
                        return;
                    }
                    if(!e0.b(((Context)this.c.get()).getApplicationContext())) {
                        this.a(100001);
                        return;
                    }
                    b.c(Thread.currentThread(), "load ModalAd : " + this.d);
                    t t0 = E.g().d();
                    Context context0 = ((Context)this.c.get()).getApplicationContext();
                    String s = this.d;
                    String s1 = this.e;
                    com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd.b adPopcornSSPModalAd$b0 = new com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd.b(this);
                    t0.a(context0, e.y, s, s1, null, adPopcornSSPModalAd$b0);
                    return;
                }
                b.a(Thread.currentThread(), this.d + " : GDPR_CONSENT_UNAVAILABLE");
                this.a(5008);
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
                this.a(200);
            }
        }
    }

    public void setAdGravity(int v) {
        this.m = v;
    }

    public void setBackgroundAlpha(float f) {
        this.n = f;
    }

    public void setCloseBtnType(int v) {
        this.l = v;
    }

    public void setCurrentActivity(Activity activity0) {
        WeakReference weakReference0 = this.c;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.c = new WeakReference(activity0);
    }

    public void setEnableBackKey(boolean z) {
        this.o = z;
    }

    public void setModalAdEventCallbackListener(IModalAdEventCallbackListener iModalAdEventCallbackListener0) {
        this.a = iModalAdEventCallbackListener0;
    }

    public void setPlacementAppKey(String s) {
        this.e = s;
    }

    public void setPlacementId(String s) {
        this.d = s;
    }

    public void showAd() {
        class c implements Runnable {
            final AdPopcornSSPModalAd a;

            @Override
            public void run() {
                try {
                    d0 d00 = new d0(AdPopcornSSPModalAd.this.b);
                    AdPopcornSSPModalAd.this.a(d00);
                    AdPopcornSSPModalAd.this.h = false;
                }
                catch(Exception exception0) {
                    b.a(Thread.currentThread(), exception0);
                    AdPopcornSSPModalAd.this.b(200);
                }
            }
        }

        synchronized(this) {
            try {
                if(this.f) {
                    b.b(Thread.currentThread(), "ModalAd In Progress!!");
                }
                else {
                    if(this.b == null || !this.h) {
                        b.c(Thread.currentThread(), "showAd : NO_MODAL_AD_LOADED");
                        this.b(5011);
                        return;
                    }
                    if(!e0.b(((Context)this.c.get()).getApplicationContext())) {
                        this.b(100001);
                    }
                    else if(Looper.myLooper() == Looper.getMainLooper()) {
                        b.a(Thread.currentThread(), "showAd ModalAd Main Thread : " + this.d);
                        this.a(new d0(this.b));
                        this.h = false;
                    }
                    else {
                        b.a(Thread.currentThread(), "showAd ModalAd Another Thread : " + this.d);
                        new Handler(Looper.getMainLooper()).post(new c(this));
                    }
                }
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
                this.b(200);
            }
        }
    }
}

