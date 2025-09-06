package com.igaworks.ssp.part.video;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.igaworks.ssp.E.j;
import com.igaworks.ssp.E;
import com.igaworks.ssp.M;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.V;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.b;
import com.igaworks.ssp.common.adapter.BaseMediationAdapter;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.e0;
import com.igaworks.ssp.g;
import com.igaworks.ssp.i0;
import com.igaworks.ssp.i;
import com.igaworks.ssp.k;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.IMediationLogListener;
import com.igaworks.ssp.part.video.listener.IInterstitialVideoAdEventCallbackListener;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t0;
import com.igaworks.ssp.t;
import com.igaworks.ssp.y;
import com.igaworks.ssp.z;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

public class AdPopcornSSPInterstitialVideoAd {
    class e implements V {
        final AdPopcornSSPInterstitialVideoAd a;

        @Override  // com.igaworks.ssp.V
        public void a() {
            AdPopcornSSPInterstitialVideoAd.this.callVideoAdListenerClosed();
        }

        @Override  // com.igaworks.ssp.V
        public void a(int v) {
            AdPopcornSSPInterstitialVideoAd.this.c();
        }

        @Override  // com.igaworks.ssp.V
        public void b(int v) {
            if(AdPopcornSSPInterstitialVideoAd.this.m != null) {
                int v1 = AdPopcornSSPInterstitialVideoAd.this.getCurrentNetwork();
                AdPopcornSSPInterstitialVideoAd.this.m.OnMediationLoadSuccess(AdPopcornSSPInterstitialVideoAd.this.d, v1);
            }
            AdPopcornSSPInterstitialVideoAd.this.f = v;
            AdPopcornSSPInterstitialVideoAd.this.b();
        }

        @Override  // com.igaworks.ssp.V
        public void c(int v) {
            AdPopcornSSPInterstitialVideoAd.this.a(5009);
        }

        @Override  // com.igaworks.ssp.V
        public void d(int v) {
            class a implements Runnable {
                final e a;

                @Override
                public void run() {
                    if(AdPopcornSSPInterstitialVideoAd.this.m != null) {
                        int v = AdPopcornSSPInterstitialVideoAd.this.getCurrentNetwork();
                        AdPopcornSSPInterstitialVideoAd.this.m.OnMediationLoadStart(AdPopcornSSPInterstitialVideoAd.this.d, v);
                    }
                    if(AdPopcornSSPInterstitialVideoAd.this.j != null) {
                        Object object0 = AdPopcornSSPInterstitialVideoAd.this.c.get();
                        AdPopcornSSPInterstitialVideoAd.this.j.loadInterstitialVideoAd(((Context)object0), AdPopcornSSPInterstitialVideoAd.this, AdPopcornSSPInterstitialVideoAd.this.b, AdPopcornSSPInterstitialVideoAd.this.n, AdPopcornSSPInterstitialVideoAd.this.f);
                        return;
                    }
                    AdPopcornSSPInterstitialVideoAd.this.b(200);
                }
            }

            i i0;
            try {
                if(AdPopcornSSPInterstitialVideoAd.this.m != null) {
                    int v1 = AdPopcornSSPInterstitialVideoAd.this.getCurrentNetwork();
                    AdPopcornSSPInterstitialVideoAd.this.m.OnMediationLoadFailed(AdPopcornSSPInterstitialVideoAd.this.d, v1);
                }
                if(AdPopcornSSPInterstitialVideoAd.this.j != null) {
                    b.a(Thread.currentThread(), "AdPopcornSSPInterstitialVideoAd Fail in adapter : " + AdPopcornSSPInterstitialVideoAd.this.j.getNetworkName());
                    AdPopcornSSPInterstitialVideoAd.this.j.destroyInterstitialVideoAd();
                }
                if(AdPopcornSSPInterstitialVideoAd.this.b.e() == null) {
                    AdPopcornSSPInterstitialVideoAd.this.f = 0;
                    AdPopcornSSPInterstitialVideoAd.this.b(5002);
                    return;
                }
                if(v >= AdPopcornSSPInterstitialVideoAd.this.b.e().a().size() - 1) {
                    AdPopcornSSPInterstitialVideoAd.this.b(5002);
                    return;
                }
                AdPopcornSSPInterstitialVideoAd.this.f = v + 1;
                i0 = i.a(((a0)AdPopcornSSPInterstitialVideoAd.this.b.e().a().get(AdPopcornSSPInterstitialVideoAd.this.f)).a());
                AdPopcornSSPInterstitialVideoAd.this.n = false;
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
                AdPopcornSSPInterstitialVideoAd.this.b(200);
                return;
            }
            try {
                if(i0.b() == i.c.b() && y.a(AdPopcornSSPInterstitialVideoAd.this.b)) {
                    String s = ((g)AdPopcornSSPInterstitialVideoAd.this.b.b().get(0)).k();
                    if(s != null) {
                        if(p.k(s) == k.c.b()) {
                            i0 = i.e;
                            AdPopcornSSPInterstitialVideoAd.this.n = true;
                        }
                        else if(p.k(s) == k.d.b()) {
                            i0 = i.r;
                            AdPopcornSSPInterstitialVideoAd.this.n = true;
                        }
                        else if(p.k(s) == k.e.b()) {
                            i0 = i.u;
                            AdPopcornSSPInterstitialVideoAd.this.n = true;
                        }
                        else if(p.k(s) == k.f.b()) {
                            i0 = i.l;
                            AdPopcornSSPInterstitialVideoAd.this.n = true;
                        }
                        else if(p.k(s) == k.g.b()) {
                            i0 = i.v;
                            AdPopcornSSPInterstitialVideoAd.this.n = true;
                        }
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            try {
                BaseMediationAdapter baseMediationAdapter0 = AdPopcornSSPInterstitialVideoAd.this.a(i0);
                AdPopcornSSPInterstitialVideoAd.this.j = baseMediationAdapter0;
                AdPopcornSSPInterstitialVideoAd.this.j.setInterstitialVideoMediationAdapterEventListener(this);
                if(Looper.myLooper() == Looper.getMainLooper()) {
                    b.a(Thread.currentThread(), "AdPopcornSSPInterstitialVideoAd onFail Main Thread.");
                    if(AdPopcornSSPInterstitialVideoAd.this.m != null) {
                        int v2 = AdPopcornSSPInterstitialVideoAd.this.getCurrentNetwork();
                        AdPopcornSSPInterstitialVideoAd.this.m.OnMediationLoadStart(AdPopcornSSPInterstitialVideoAd.this.d, v2);
                    }
                    if(AdPopcornSSPInterstitialVideoAd.this.j != null) {
                        Object object0 = AdPopcornSSPInterstitialVideoAd.this.c.get();
                        AdPopcornSSPInterstitialVideoAd.this.j.loadInterstitialVideoAd(((Context)object0), AdPopcornSSPInterstitialVideoAd.this, AdPopcornSSPInterstitialVideoAd.this.b, AdPopcornSSPInterstitialVideoAd.this.n, AdPopcornSSPInterstitialVideoAd.this.f);
                        return;
                    }
                }
                else {
                    b.a(Thread.currentThread(), "AdPopcornSSPInterstitialVideoAd onFail Another Thread");
                    new Handler(Looper.getMainLooper()).post(new a(this));
                }
                return;
            }
            catch(Exception exception0) {
            }
            b.a(Thread.currentThread(), exception0);
            AdPopcornSSPInterstitialVideoAd.this.b(200);
        }

        @Override  // com.igaworks.ssp.V
        public void onClickAd() {
            AdPopcornSSPInterstitialVideoAd.this.callVideoAdListenerClicked();
        }
    }

    private IInterstitialVideoAdEventCallbackListener a;
    private d0 b;
    private WeakReference c;
    private String d;
    private String e;
    private int f;
    private boolean g;
    private boolean h;
    private ConcurrentHashMap i;
    private BaseMediationAdapter j;
    private long k;
    private boolean l;
    private IMediationLogListener m;
    private boolean n;
    private boolean o;
    private final V p;

    public AdPopcornSSPInterstitialVideoAd(Context context0) {
        this.f = 0;
        this.g = false;
        this.h = false;
        this.k = 10000L;
        this.n = false;
        this.o = false;
        this.p = new e(this);
        this.c = new WeakReference(context0);
        E.g().a(this);
        this.l = false;
    }

    public AdPopcornSSPInterstitialVideoAd(Context context0, String s) {
        this.f = 0;
        this.g = false;
        this.h = false;
        this.k = 10000L;
        this.n = false;
        this.o = false;
        this.p = new e(this);
        this.c = new WeakReference(context0);
        E.g().a(this);
        this.l = false;
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
                E.g().d().a(((Context)this.c.get()).getApplicationContext(), com.igaworks.ssp.t.e.i, "" + String.format("&advertising_id=%s&ad_network_no=%d&placement_id=%s", arr_object));
                return;
            }
            b.a(Thread.currentThread(), "callMediationImpTracking null or already fired.");
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(int v) {
        this.h = false;
        this.l = false;
        b.a(Thread.currentThread(), "AdPopcornSSPInterstitialVideoAd callVideoAdListenerOpenFailed : " + this.a);
        IInterstitialVideoAdEventCallbackListener iInterstitialVideoAdEventCallbackListener0 = this.a;
        if(iInterstitialVideoAdEventCallbackListener0 != null) {
            iInterstitialVideoAdEventCallbackListener0.OnInterstitialVideoAdOpenFalied();
        }
    }

    private void a(d0 d00) {
        i i1;
        i i0;
        try {
            if(!y.c(d00)) {
                if(!y.a(d00)) {
                    this.a(d00.h());
                    return;
                }
                i0 = i.c;
                this.n = false;
                goto label_6;
            }
            goto label_32;
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            this.a(200);
            return;
        }
        try {
        label_6:
            String s = ((g)this.b.b().get(0)).k();
            if(s != null) {
                if(p.k(s) == k.c.b()) {
                    i0 = i.e;
                    this.n = true;
                }
                else if(p.k(s) == k.d.b()) {
                    i0 = i.r;
                    this.n = true;
                }
                else if(p.k(s) == k.e.b()) {
                    i0 = i.u;
                    this.n = true;
                }
                else if(p.k(s) == k.f.b()) {
                    i0 = i.l;
                    this.n = true;
                }
                else if(p.k(s) == k.g.b()) {
                    i0 = i.v;
                    this.n = true;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.a(i0);
            this.j = baseMediationAdapter0;
            baseMediationAdapter0.setInterstitialVideoMediationAdapterEventListener(this.p);
            this.j.showInterstitialVideoAd(((Context)this.c.get()), d00, this.n, this.f);
            return;
        label_32:
            y.a(d00, this.i);
            i1 = i.a(((a0)d00.e().a().get(this.f)).a());
            this.n = false;
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            this.a(200);
            return;
        }
        try {
            if(i1.b() == i.c.b() && y.a(this.b)) {
                String s1 = ((g)this.b.b().get(0)).k();
                if(s1 != null) {
                    if(p.k(s1) == k.c.b()) {
                        i1 = i.e;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.d.b()) {
                        i1 = i.r;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.e.b()) {
                        i1 = i.u;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.f.b()) {
                        i1 = i.l;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.g.b()) {
                        i1 = i.v;
                        this.n = true;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter1 = this.a(i1);
            this.j = baseMediationAdapter1;
            baseMediationAdapter1.setInterstitialVideoMediationAdapterEventListener(this.p);
            this.j.showInterstitialVideoAd(((Context)this.c.get()), d00, this.n, this.f);
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.a(200);
    }

    private void b() {
        this.g = false;
        this.h = true;
        b.a(Thread.currentThread(), "AdPopcornSSPInterstitialVideoAd load success isPlayingVideo : " + this.l + ", callbackListener : " + this.a);
        if(!this.l) {
            IInterstitialVideoAdEventCallbackListener iInterstitialVideoAdEventCallbackListener0 = this.a;
            if(iInterstitialVideoAdEventCallbackListener0 != null) {
                iInterstitialVideoAdEventCallbackListener0.OnInterstitialVideoAdLoaded();
            }
        }
    }

    private void b(int v) {
        this.g = false;
        this.h = false;
        b.a(Thread.currentThread(), "AdPopcornSSPInterstitialVideoAd callVideoAdListenerReceiveFailed isPlayingVideo : " + this.l + ", callbackListener : " + this.a);
        if(!this.l) {
            IInterstitialVideoAdEventCallbackListener iInterstitialVideoAdEventCallbackListener0 = this.a;
            if(iInterstitialVideoAdEventCallbackListener0 != null) {
                iInterstitialVideoAdEventCallbackListener0.OnInterstitialVideoAdLoadFailed(new SSPErrorCode(v));
            }
        }
    }

    private void c() {
        this.h = false;
        this.l = true;
        this.o = true;
        this.a();
        b.a(Thread.currentThread(), "AdPopcornSSPInterstitialVideoAd callVideoAdListenerOpened : " + this.a);
        IInterstitialVideoAdEventCallbackListener iInterstitialVideoAdEventCallbackListener0 = this.a;
        if(iInterstitialVideoAdEventCallbackListener0 != null) {
            iInterstitialVideoAdEventCallbackListener0.OnInterstitialVideoAdOpened();
        }
    }

    public void callVideoAdListenerClicked() {
        b.a(Thread.currentThread(), "AdPopcornSSPInterstitialVideoAd callVideoAdListenerClicked : " + this.a);
        IInterstitialVideoAdEventCallbackListener iInterstitialVideoAdEventCallbackListener0 = this.a;
        if(iInterstitialVideoAdEventCallbackListener0 != null) {
            iInterstitialVideoAdEventCallbackListener0.OnInterstitialVideoAdClicked();
        }
    }

    public void callVideoAdListenerClosed() {
        this.l = false;
        b.a(Thread.currentThread(), "AdPopcornSSPInterstitialVideoAd callVideoAdListenerClosed : " + this.a);
        this.d();
        IInterstitialVideoAdEventCallbackListener iInterstitialVideoAdEventCallbackListener0 = this.a;
        if(iInterstitialVideoAdEventCallbackListener0 != null) {
            iInterstitialVideoAdEventCallbackListener0.OnInterstitialVideoAdClosed();
        }
    }

    private void d() {
        try {
            if(E.g().e(this.d)) {
                b.a(Thread.currentThread(), "claimPointBox : " + this.o);
                if(this.o) {
                    this.o = false;
                    JSONObject jSONObject0 = new JSONObject();
                    E.g().e();
                    jSONObject0.put("ad_request_no", "");
                    jSONObject0.put("advertising_id", "");
                    jSONObject0.put("impression_campaign_type", 13);
                    jSONObject0.put("media_key", "");
                    jSONObject0.put("placement_id", this.d);
                    jSONObject0.put("platform", "android");
                    jSONObject0.put("usn", "");
                    i0.a(((Context)this.c.get()), jSONObject0);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void destroy() {
        synchronized(this) {
            try {
                b.c(Thread.currentThread(), "destroy : " + this.d);
                BaseMediationAdapter baseMediationAdapter0 = this.j;
                if(baseMediationAdapter0 != null) {
                    baseMediationAdapter0.destroyInterstitialVideoAd();
                    this.j.setInterstitialVideoMediationAdapterEventListener(null);
                    this.j = null;
                }
                if(this.b != null) {
                    this.b = null;
                }
                this.g = false;
                this.e();
                E.g().b(this);
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
            }
        }
    }

    private void e() {
        ConcurrentHashMap concurrentHashMap0 = this.i;
        if(concurrentHashMap0 != null) {
            concurrentHashMap0.clear();
            this.i = null;
        }
    }

    private void f() {
        class d implements Runnable {
            final AdPopcornSSPInterstitialVideoAd a;

            @Override
            public void run() {
                if(AdPopcornSSPInterstitialVideoAd.this.m != null) {
                    AdPopcornSSPInterstitialVideoAd.this.m.OnMediationLoadStart(AdPopcornSSPInterstitialVideoAd.this.d, AdPopcornSSPInterstitialVideoAd.this.getCurrentNetwork());
                }
                BaseMediationAdapter baseMediationAdapter0 = AdPopcornSSPInterstitialVideoAd.this.j;
                Object object0 = AdPopcornSSPInterstitialVideoAd.this.c.get();
                d0 d00 = AdPopcornSSPInterstitialVideoAd.this.b;
                boolean z = AdPopcornSSPInterstitialVideoAd.this.n;
                int v = AdPopcornSSPInterstitialVideoAd.this.f;
                baseMediationAdapter0.loadInterstitialVideoAd(((Context)object0), AdPopcornSSPInterstitialVideoAd.this, d00, z, v);
            }
        }

        i i1;
        i i0;
        try {
            if(!y.c(this.b)) {
                if(!y.a(this.b)) {
                    this.b(this.b.h());
                    return;
                }
                i0 = i.c;
                this.n = false;
                goto label_6;
            }
            goto label_35;
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            this.b(200);
            return;
        }
        try {
        label_6:
            String s = ((g)this.b.b().get(0)).k();
            if(s != null) {
                if(p.k(s) == k.c.b()) {
                    i0 = i.e;
                    this.n = true;
                }
                else if(p.k(s) == k.d.b()) {
                    i0 = i.r;
                    this.n = true;
                }
                else if(p.k(s) == k.e.b()) {
                    i0 = i.u;
                    this.n = true;
                }
                else if(p.k(s) == k.f.b()) {
                    i0 = i.l;
                    this.n = true;
                }
                else if(p.k(s) == k.g.b()) {
                    i0 = i.v;
                    this.n = true;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.a(i0);
            this.j = baseMediationAdapter0;
            baseMediationAdapter0.setInterstitialVideoMediationAdapterEventListener(this.p);
            IMediationLogListener iMediationLogListener0 = this.m;
            if(iMediationLogListener0 != null) {
                iMediationLogListener0.OnMediationLoadStart(this.d, this.getCurrentNetwork());
            }
            this.j.loadInterstitialVideoAd(((Context)this.c.get()), this, this.b, this.n, this.f);
            return;
        label_35:
            y.a(this.b, this.i);
            this.f = 0;
            i1 = i.a(((a0)this.b.e().a().get(0)).a());
            this.n = false;
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            this.b(200);
            return;
        }
        try {
            if(i1.b() == i.c.b() && y.a(this.b)) {
                String s1 = ((g)this.b.b().get(0)).k();
                if(s1 != null) {
                    if(p.k(s1) == k.c.b()) {
                        i1 = i.e;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.d.b()) {
                        i1 = i.r;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.e.b()) {
                        i1 = i.u;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.f.b()) {
                        i1 = i.l;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.g.b()) {
                        i1 = i.v;
                        this.n = true;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter1 = this.a(i1);
            this.j = baseMediationAdapter1;
            baseMediationAdapter1.setInterstitialVideoMediationAdapterEventListener(this.p);
            if(Looper.myLooper() == Looper.getMainLooper()) {
                b.a(Thread.currentThread(), "AdPopcornSSPInterstitialVideoAd loadInterstitialVideoAd Main Thread.");
                IMediationLogListener iMediationLogListener1 = this.m;
                if(iMediationLogListener1 != null) {
                    iMediationLogListener1.OnMediationLoadStart(this.d, this.getCurrentNetwork());
                }
                this.j.loadInterstitialVideoAd(((Context)this.c.get()), this, this.b, this.n, this.f);
                return;
            }
            b.a(Thread.currentThread(), "AdPopcornSSPInterstitialVideoAd loadInterstitialVideoAd Another Thread");
            new Handler(Looper.getMainLooper()).post(new d(this));
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.b(200);
    }

    // 去混淆评级： 低(20)
    public String getAdRequestNo() [...] // 潜在的解密器

    public int getCurrentNetwork() {
        try {
            return this.j == null ? -1 : i.a(this.j.getNetworkName()).b();
        }
        catch(Exception unused_ex) {
        }
        return -1;
    }

    public long getNetworkScheduleTimeout() {
        return this.k;
    }

    public String getPlacementId() {
        return this.d;
    }

    public boolean isReady() {
        return this.h;
    }

    public void loadAd() {
        class com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd.a extends z {
            final AdPopcornSSPInterstitialVideoAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd.a.a implements Runnable {
                    final com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd.a a;

                    @Override
                    public void run() {
                        AdPopcornSSPInterstitialVideoAd.this.g = false;
                        AdPopcornSSPInterstitialVideoAd.this.loadAd();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd.a.a(this));
            }
        }


        class com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd.b implements M {
            final AdPopcornSSPInterstitialVideoAd a;

            @Override  // com.igaworks.ssp.M
            public void onNetResponseListener(com.igaworks.ssp.t.e t$e0, String s, String s1, boolean z) {
                try {
                    if(z) {
                        AdPopcornSSPInterstitialVideoAd.this.b(5000);
                        return;
                    }
                    if(s0.b(s)) {
                        AdPopcornSSPInterstitialVideoAd.this.b(0x270F);
                        return;
                    }
                    d0 d00 = p.f(s);
                    if(d00 != null && d00.h() != 1) {
                        AdPopcornSSPInterstitialVideoAd.this.b(d00.h());
                        return;
                    }
                    AdPopcornSSPInterstitialVideoAd.this.b = d00;
                    if(AdPopcornSSPInterstitialVideoAd.this.b != null && AdPopcornSSPInterstitialVideoAd.this.b.d() != null) {
                        t0.a(((Context)AdPopcornSSPInterstitialVideoAd.this.c.get()), AdPopcornSSPInterstitialVideoAd.this.b.d());
                    }
                    AdPopcornSSPInterstitialVideoAd.this.f();
                    return;
                }
                catch(Exception exception0) {
                }
                b.a(Thread.currentThread(), exception0);
                AdPopcornSSPInterstitialVideoAd.this.b(200);
            }
        }

        JSONObject jSONObject0;
        synchronized(this) {
            try {
                if(E.g().f()) {
                    if(this.g) {
                        b.b(Thread.currentThread(), "loadAd() -> " + this.d + " : InterstitialVideoAd In Progress!!");
                        return;
                    }
                    this.g = true;
                    this.h = false;
                    if(this.d == null || this.d.length() == 0) {
                        this.b(2030);
                        return;
                    }
                    if(!E.g().m()) {
                        b.c(Thread.currentThread(), "Checking ADID...");
                        E.g().a(new com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd.a(this));
                        E e0 = E.g();
                        Objects.requireNonNull(e0);
                        new j(e0, ((Context)this.c.get()).getApplicationContext()).start();
                        return;
                    }
                    if(!e0.b(((Context)this.c.get()).getApplicationContext())) {
                        this.b(100001);
                        return;
                    }
                    b.c(Thread.currentThread(), "load interstitialVideo : " + this.d);
                    List list0 = E.g().a(this.d);
                    if(list0 == null) {
                        jSONObject0 = null;
                    }
                    else {
                        jSONObject0 = new JSONObject();
                        k k0 = k.c;
                        if(list0.contains(k0.b())) {
                            i i0 = i.e;
                            if(y.a(i0, this.i)) {
                                jSONObject0.put(k0.b() + "", this.a(i0).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        k k1 = k.d;
                        if(list0.contains(k1.b())) {
                            i i1 = i.r;
                            if(y.a(i1, this.i)) {
                                jSONObject0.put(k1.b() + "", this.a(i1).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        k k2 = k.e;
                        if(list0.contains(k2.b())) {
                            i i2 = i.u;
                            if(y.a(i2, this.i)) {
                                jSONObject0.put(k2.b() + "", this.a(i2).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        k k3 = k.f;
                        if(list0.contains(k3.b())) {
                            i i3 = i.l;
                            if(y.a(i3, this.i)) {
                                jSONObject0.put(k3.b() + "", this.a(i3).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        k k4 = k.g;
                        if(list0.contains(k4.b())) {
                            i i4 = i.v;
                            if(y.a(i4, this.i)) {
                                jSONObject0.put(k4.b() + "", this.a(i4).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        b.c(Thread.currentThread(), "load interstitialVideo biddingTokenParameter : " + jSONObject0);
                    }
                    t t0 = E.g().d();
                    Context context0 = ((Context)this.c.get()).getApplicationContext();
                    String s = this.d;
                    String s1 = this.e;
                    com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd.b adPopcornSSPInterstitialVideoAd$b0 = new com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd.b(this);
                    t0.a(context0, com.igaworks.ssp.t.e.p, s, s1, jSONObject0, adPopcornSSPInterstitialVideoAd$b0);
                    return;
                }
                b.a(Thread.currentThread(), this.d + " : GDPR_CONSENT_UNAVAILABLE");
                this.b(5008);
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
            }
        }
    }

    public void onPause() {
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.j;
            if(baseMediationAdapter0 != null) {
                baseMediationAdapter0.pauseInterstitialVideoAd();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void onResume() {
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.j;
            if(baseMediationAdapter0 != null) {
                baseMediationAdapter0.resumeInterstitialVideoAd();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void setCurrentActivity(Activity activity0) {
        WeakReference weakReference0 = this.c;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.c = new WeakReference(activity0);
    }

    public void setEventCallbackListener(IInterstitialVideoAdEventCallbackListener iInterstitialVideoAdEventCallbackListener0) {
        this.a = iInterstitialVideoAdEventCallbackListener0;
    }

    public void setMediationLogListener(IMediationLogListener iMediationLogListener0) {
        this.m = iMediationLogListener0;
    }

    public void setNetworkScheduleTimeout(int v) {
        b.c(Thread.currentThread(), "setNetworkScheduleTimeout : " + v);
        this.k = (long)(v * 1000);
    }

    public void setPlacementAppKey(String s) {
        this.e = s;
    }

    public void setPlacementId(String s) {
        this.d = s;
    }

    public void showAd() {
        class c implements Runnable {
            final AdPopcornSSPInterstitialVideoAd a;

            @Override
            public void run() {
                try {
                    d0 d00 = new d0(AdPopcornSSPInterstitialVideoAd.this.b);
                    AdPopcornSSPInterstitialVideoAd.this.a(d00);
                    AdPopcornSSPInterstitialVideoAd.this.h = false;
                }
                catch(Exception exception0) {
                    b.a(Thread.currentThread(), exception0);
                    AdPopcornSSPInterstitialVideoAd.this.a(200);
                }
            }
        }

        synchronized(this) {
            try {
                if(this.l) {
                    b.b(Thread.currentThread(), "interstitialVideoAd playing...");
                    return;
                }
                if(this.b == null || !this.h) {
                    b.c(Thread.currentThread(), "showAd : NO_INTERSTITIAL_VIDEO_AD_LOADED");
                    this.a(5009);
                    return;
                }
                if(!e0.b(((Context)this.c.get()).getApplicationContext())) {
                    this.a(100001);
                    return;
                }
                if(Looper.myLooper() == Looper.getMainLooper()) {
                    b.a(Thread.currentThread(), "showAd InterstitialVideo Main Thread : " + this.d);
                    this.a(new d0(this.b));
                    this.h = false;
                }
                else {
                    b.a(Thread.currentThread(), "showAd InterstitialVideo Another Thread : " + this.d);
                    new Handler(Looper.getMainLooper()).post(new c(this));
                }
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
                this.a(200);
            }
        }
    }
}

