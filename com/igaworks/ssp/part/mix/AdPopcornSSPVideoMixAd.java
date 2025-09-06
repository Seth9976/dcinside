package com.igaworks.ssp.part.mix;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.igaworks.ssp.E.j;
import com.igaworks.ssp.E0;
import com.igaworks.ssp.E;
import com.igaworks.ssp.M;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.b;
import com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.e0;
import com.igaworks.ssp.g;
import com.igaworks.ssp.i0;
import com.igaworks.ssp.i;
import com.igaworks.ssp.k;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.IMediationLogListener;
import com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t0;
import com.igaworks.ssp.t;
import com.igaworks.ssp.y;
import com.igaworks.ssp.z;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public class AdPopcornSSPVideoMixAd {
    class e implements E0 {
        final AdPopcornSSPVideoMixAd a;

        @Override  // com.igaworks.ssp.E0
        public void a() {
            AdPopcornSSPVideoMixAd.this.callVideoMixAdListenerClosed();
        }

        @Override  // com.igaworks.ssp.E0
        public void a(int v) {
            AdPopcornSSPVideoMixAd.this.c();
            try {
                E.g().e();
                if(AdPopcornSSPVideoMixAd.this.b != null) {
                    int v1 = ((a0)AdPopcornSSPVideoMixAd.this.b.e().a().get(AdPopcornSSPVideoMixAd.this.f)).b();
                    AdPopcornSSPVideoMixAd.this.o = v1;
                    if(AdPopcornSSPVideoMixAd.this.o == 4) {
                        Locale locale0 = Locale.getDefault();
                        String s = "&usn=&AdNetworkNo=" + AdPopcornSSPVideoMixAd.this.getCurrentNetwork() + "&isStartRequest=" + true + "&isCompleted=" + false + "&app_key=" + "" + "&adid=" + "" + "&placement_id=" + AdPopcornSSPVideoMixAd.this.d + "&platform=android" + "&sdk_version=" + "3.8.2a" + "&country=" + locale0.getCountry();
                        String s1 = Build.VERSION.RELEASE;
                        if(s1 != null && !s1.equalsIgnoreCase("")) {
                            s = s + "&os_version=" + s1;
                        }
                        E.g().d().a(((Context)AdPopcornSSPVideoMixAd.this.c.get()).getApplicationContext(), com.igaworks.ssp.t.e.r, "" + s);
                    }
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }

        @Override  // com.igaworks.ssp.E0
        public void a(int v, boolean z) {
            b.a(Thread.currentThread(), "onComplete adNetworkNo : " + v + ", completed : " + z);
            AdPopcornSSPVideoMixAd.this.callVideoMixAdListenerCompleted(v, z);
            try {
                if(AdPopcornSSPVideoMixAd.this.b != null) {
                    int v1 = ((a0)AdPopcornSSPVideoMixAd.this.b.e().a().get(AdPopcornSSPVideoMixAd.this.f)).b();
                    AdPopcornSSPVideoMixAd.this.o = v1;
                    if(AdPopcornSSPVideoMixAd.this.o == 4) {
                        E.g().e();
                        Locale locale0 = Locale.getDefault();
                        String s = locale0 == null ? "&usn=&AdNetworkNo=" + v + "&isStartRequest=" + false + "&isCompleted=" + z + "&app_key=" + "" + "&adid=" + "" + "&placement_id=" + AdPopcornSSPVideoMixAd.this.d + "&platform=android" + "&sdk_version=" + "3.8.2a" : "&usn=&AdNetworkNo=" + v + "&isStartRequest=" + false + "&isCompleted=" + z + "&app_key=" + "" + "&adid=" + "" + "&placement_id=" + AdPopcornSSPVideoMixAd.this.d + "&platform=android" + "&sdk_version=" + "3.8.2a" + "&country=" + locale0.getCountry();
                        String s1 = Build.VERSION.RELEASE;
                        if(s1 != null && !s1.equalsIgnoreCase("")) {
                            s = s + "&os_version=" + s1;
                        }
                        E.g().d().a(((Context)AdPopcornSSPVideoMixAd.this.c.get()).getApplicationContext(), com.igaworks.ssp.t.e.r, "" + s);
                    }
                }
            }
            catch(Exception unused_ex) {
            }
        }

        @Override  // com.igaworks.ssp.E0
        public void b(int v) {
            if(AdPopcornSSPVideoMixAd.this.m != null) {
                int v1 = AdPopcornSSPVideoMixAd.this.getCurrentNetwork();
                AdPopcornSSPVideoMixAd.this.m.OnMediationLoadSuccess(AdPopcornSSPVideoMixAd.this.d, v1);
            }
            AdPopcornSSPVideoMixAd.this.f = v;
            AdPopcornSSPVideoMixAd.this.b();
        }

        @Override  // com.igaworks.ssp.E0
        public void c(int v) {
            AdPopcornSSPVideoMixAd.this.a(5013);
        }

        @Override  // com.igaworks.ssp.E0
        public void d(int v) {
            class a implements Runnable {
                final a0 a;
                final e b;

                a(a0 a00) {
                    this.a = a00;
                    super();
                }

                @Override
                public void run() {
                    if(AdPopcornSSPVideoMixAd.this.m != null) {
                        int v = AdPopcornSSPVideoMixAd.this.getCurrentNetwork();
                        AdPopcornSSPVideoMixAd.this.m.OnMediationLoadStart(AdPopcornSSPVideoMixAd.this.d, v);
                    }
                    if(AdPopcornSSPVideoMixAd.this.j != null) {
                        Object object0 = AdPopcornSSPVideoMixAd.this.c.get();
                        AdPopcornSSPVideoMixAd.this.j.loadAd(((Context)object0), AdPopcornSSPVideoMixAd.this, AdPopcornSSPVideoMixAd.this.b, AdPopcornSSPVideoMixAd.this.n, AdPopcornSSPVideoMixAd.this.f, this.a.b());
                        return;
                    }
                    AdPopcornSSPVideoMixAd.this.b(200);
                }
            }

            i i0;
            a0 a00;
            try {
                if(AdPopcornSSPVideoMixAd.this.m != null) {
                    int v1 = AdPopcornSSPVideoMixAd.this.getCurrentNetwork();
                    AdPopcornSSPVideoMixAd.this.m.OnMediationLoadFailed(AdPopcornSSPVideoMixAd.this.d, v1);
                }
                if(AdPopcornSSPVideoMixAd.this.j != null) {
                    b.a(Thread.currentThread(), "AdPopcornSSPVideoMix Fail in adapter : " + AdPopcornSSPVideoMixAd.this.j.getNetworkName());
                    AdPopcornSSPVideoMixAd.this.j.destroyAd();
                }
                if(AdPopcornSSPVideoMixAd.this.b.e() == null) {
                    AdPopcornSSPVideoMixAd.this.f = 0;
                    AdPopcornSSPVideoMixAd.this.b(5002);
                    return;
                }
                if(v >= AdPopcornSSPVideoMixAd.this.b.e().a().size() - 1) {
                    AdPopcornSSPVideoMixAd.this.b(5002);
                    return;
                }
                AdPopcornSSPVideoMixAd.this.f = v + 1;
                a00 = (a0)AdPopcornSSPVideoMixAd.this.b.e().a().get(AdPopcornSSPVideoMixAd.this.f);
                i0 = i.a(a00.a());
                AdPopcornSSPVideoMixAd.this.n = false;
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
                AdPopcornSSPVideoMixAd.this.b(200);
                return;
            }
            try {
                if(i0.b() == i.c.b() && y.a(AdPopcornSSPVideoMixAd.this.b)) {
                    String s = ((g)AdPopcornSSPVideoMixAd.this.b.b().get(0)).k();
                    if(s != null) {
                        if(p.k(s) == k.c.b()) {
                            i0 = i.e;
                            AdPopcornSSPVideoMixAd.this.n = true;
                        }
                        else if(p.k(s) == k.d.b()) {
                            i0 = i.r;
                            AdPopcornSSPVideoMixAd.this.n = true;
                        }
                        else if(p.k(s) == k.e.b()) {
                            i0 = i.u;
                            AdPopcornSSPVideoMixAd.this.n = true;
                        }
                        else if(p.k(s) == k.f.b()) {
                            i0 = i.l;
                            AdPopcornSSPVideoMixAd.this.n = true;
                        }
                        else if(p.k(s) == k.g.b()) {
                            i0 = i.v;
                            AdPopcornSSPVideoMixAd.this.n = true;
                        }
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            try {
                VideoMixAdMediationAdapter videoMixAdMediationAdapter0 = AdPopcornSSPVideoMixAd.this.a(i0);
                AdPopcornSSPVideoMixAd.this.j = videoMixAdMediationAdapter0;
                AdPopcornSSPVideoMixAd.this.j.setMediationAdapterEventListener(this);
                if(Looper.myLooper() == Looper.getMainLooper()) {
                    b.a(Thread.currentThread(), "AdPopcornSSPVideoMix onFail Main Thread.");
                    if(AdPopcornSSPVideoMixAd.this.m != null) {
                        int v2 = AdPopcornSSPVideoMixAd.this.getCurrentNetwork();
                        AdPopcornSSPVideoMixAd.this.m.OnMediationLoadStart(AdPopcornSSPVideoMixAd.this.d, v2);
                    }
                    Object object0 = AdPopcornSSPVideoMixAd.this.c.get();
                    AdPopcornSSPVideoMixAd.this.j.loadAd(((Context)object0), AdPopcornSSPVideoMixAd.this, AdPopcornSSPVideoMixAd.this.b, AdPopcornSSPVideoMixAd.this.n, AdPopcornSSPVideoMixAd.this.f, a00.b());
                    return;
                }
                b.a(Thread.currentThread(), "AdPopcornSSPVideoMix onFail Another Thread");
                new Handler(Looper.getMainLooper()).post(new a(this, a00));
                return;
            }
            catch(Exception exception0) {
            }
            b.a(Thread.currentThread(), exception0);
            AdPopcornSSPVideoMixAd.this.b(200);
        }

        @Override  // com.igaworks.ssp.E0
        public void onClickAd() {
            AdPopcornSSPVideoMixAd.this.callVideoMixAdListenerClicked();
        }
    }

    private IVideoMixAdEventCallbackListener a;
    private d0 b;
    private WeakReference c;
    private String d;
    private String e;
    private int f;
    private boolean g;
    private boolean h;
    private ConcurrentHashMap i;
    private VideoMixAdMediationAdapter j;
    private long k;
    private boolean l;
    private IMediationLogListener m;
    private boolean n;
    private int o;
    private boolean p;
    private final E0 q;

    public AdPopcornSSPVideoMixAd(Context context0) {
        this.f = 0;
        this.g = false;
        this.h = false;
        this.k = 10000L;
        this.n = false;
        this.o = 0;
        this.p = false;
        this.q = new e(this);
        this.c = new WeakReference(context0);
        E.g().a(this);
        this.l = false;
    }

    public AdPopcornSSPVideoMixAd(Context context0, String s) {
        this.f = 0;
        this.g = false;
        this.h = false;
        this.k = 10000L;
        this.n = false;
        this.o = 0;
        this.p = false;
        this.q = new e(this);
        this.c = new WeakReference(context0);
        E.g().a(this);
        this.l = false;
        this.e = s;
    }

    private VideoMixAdMediationAdapter a(i i0) {
        if(this.i == null) {
            this.i = new ConcurrentHashMap();
        }
        VideoMixAdMediationAdapter videoMixAdMediationAdapter0 = (VideoMixAdMediationAdapter)this.i.get(i0);
        if(videoMixAdMediationAdapter0 == null) {
            videoMixAdMediationAdapter0 = i0.f();
            if(videoMixAdMediationAdapter0 != null) {
                this.i.put(i0, videoMixAdMediationAdapter0);
            }
        }
        return videoMixAdMediationAdapter0;
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
        b.a(Thread.currentThread(), "callVideoMixAdListenerOpenFailed : " + this.a);
        IVideoMixAdEventCallbackListener iVideoMixAdEventCallbackListener0 = this.a;
        if(iVideoMixAdEventCallbackListener0 != null) {
            iVideoMixAdEventCallbackListener0.OnVideoMixAdOpenFailed();
        }
    }

    private void a(d0 d00) {
        i i1;
        a0 a00;
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
            VideoMixAdMediationAdapter videoMixAdMediationAdapter0 = this.a(i0);
            this.j = videoMixAdMediationAdapter0;
            videoMixAdMediationAdapter0.setMediationAdapterEventListener(this.q);
            this.j.showAd(((Context)this.c.get()), d00, this.n, this.f, 4);
            return;
        label_32:
            y.b(d00, this.i);
            a00 = (a0)this.b.e().a().get(this.f);
            i1 = i.a(a00.a());
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
            VideoMixAdMediationAdapter videoMixAdMediationAdapter1 = this.a(i1);
            this.j = videoMixAdMediationAdapter1;
            videoMixAdMediationAdapter1.setMediationAdapterEventListener(this.q);
            this.j.showAd(((Context)this.c.get()), d00, this.n, this.f, a00.b());
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
        b.a(Thread.currentThread(), "callVideoMixAdListenerLoaded isShowing : " + this.l);
        if(!this.l) {
            IVideoMixAdEventCallbackListener iVideoMixAdEventCallbackListener0 = this.a;
            if(iVideoMixAdEventCallbackListener0 != null) {
                iVideoMixAdEventCallbackListener0.OnVideoMixAdLoaded();
            }
        }
    }

    private void b(int v) {
        this.g = false;
        this.h = false;
        b.a(Thread.currentThread(), "callVideoMixListenerReceiveFailed isShowing : " + this.l);
        if(!this.l) {
            IVideoMixAdEventCallbackListener iVideoMixAdEventCallbackListener0 = this.a;
            if(iVideoMixAdEventCallbackListener0 != null) {
                iVideoMixAdEventCallbackListener0.OnVideoMixAdLoadFailed(new SSPErrorCode(v));
            }
        }
    }

    private void c() {
        this.h = false;
        this.l = true;
        this.p = true;
        b.a(Thread.currentThread(), "callVideoMixAdListenerOpened : " + this.o);
        this.a();
        IVideoMixAdEventCallbackListener iVideoMixAdEventCallbackListener0 = this.a;
        if(iVideoMixAdEventCallbackListener0 != null) {
            iVideoMixAdEventCallbackListener0.OnVideoMixAdOpened();
        }
    }

    public void callVideoMixAdListenerClicked() {
        b.a(Thread.currentThread(), "callVideoMixAdListenerClicked : " + this.o);
        IVideoMixAdEventCallbackListener iVideoMixAdEventCallbackListener0 = this.a;
        if(iVideoMixAdEventCallbackListener0 != null) {
            iVideoMixAdEventCallbackListener0.OnVideoMixAdClicked();
        }
    }

    public void callVideoMixAdListenerClosed() {
        this.l = false;
        b.a(Thread.currentThread(), "callVideoMixAdListenerClosed : " + this.o);
        try {
            if(this.o == 2 || this.o == 6) {
                this.d();
            }
        }
        catch(Exception unused_ex) {
        }
        IVideoMixAdEventCallbackListener iVideoMixAdEventCallbackListener0 = this.a;
        if(iVideoMixAdEventCallbackListener0 != null) {
            iVideoMixAdEventCallbackListener0.OnVideoMixAdClosed(this.o);
        }
    }

    public void callVideoMixAdListenerCompleted(int v, boolean z) {
        try {
            this.l = false;
            b.a(Thread.currentThread(), "callVideoMixAdListenerCompleted : " + this.o);
            if(z) {
                this.d();
            }
            IVideoMixAdEventCallbackListener iVideoMixAdEventCallbackListener0 = this.a;
            if(iVideoMixAdEventCallbackListener0 != null) {
                iVideoMixAdEventCallbackListener0.OnVideoMixPlayCompleted(v, z);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void d() {
        try {
            if(E.g().e(this.d)) {
                b.a(Thread.currentThread(), "claimPointBox : " + this.p);
                if(this.p) {
                    this.p = false;
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
                VideoMixAdMediationAdapter videoMixAdMediationAdapter0 = this.j;
                if(videoMixAdMediationAdapter0 != null) {
                    videoMixAdMediationAdapter0.destroyAd();
                    this.j.setMediationAdapterEventListener(null);
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
            final a0 a;
            final AdPopcornSSPVideoMixAd b;

            d(a0 a00) {
                this.a = a00;
                super();
            }

            @Override
            public void run() {
                if(AdPopcornSSPVideoMixAd.this.m != null) {
                    AdPopcornSSPVideoMixAd.this.m.OnMediationLoadStart(AdPopcornSSPVideoMixAd.this.d, AdPopcornSSPVideoMixAd.this.getCurrentNetwork());
                }
                if(AdPopcornSSPVideoMixAd.this.j != null) {
                    Object object0 = AdPopcornSSPVideoMixAd.this.c.get();
                    AdPopcornSSPVideoMixAd.this.j.loadAd(((Context)object0), AdPopcornSSPVideoMixAd.this, AdPopcornSSPVideoMixAd.this.b, AdPopcornSSPVideoMixAd.this.n, AdPopcornSSPVideoMixAd.this.f, this.a.b());
                    return;
                }
                AdPopcornSSPVideoMixAd.this.b(200);
            }
        }

        i i1;
        a0 a00;
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
            VideoMixAdMediationAdapter videoMixAdMediationAdapter0 = this.a(i0);
            this.j = videoMixAdMediationAdapter0;
            videoMixAdMediationAdapter0.setMediationAdapterEventListener(this.q);
            IMediationLogListener iMediationLogListener0 = this.m;
            if(iMediationLogListener0 != null) {
                iMediationLogListener0.OnMediationLoadStart(this.d, this.getCurrentNetwork());
            }
            this.j.loadAd(((Context)this.c.get()), this, this.b, this.n, this.f, 4);
            return;
        label_35:
            y.b(this.b, this.i);
            this.f = 0;
            a00 = (a0)this.b.e().a().get(0);
            i1 = i.a(a00.a());
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
            VideoMixAdMediationAdapter videoMixAdMediationAdapter1 = this.a(i1);
            this.j = videoMixAdMediationAdapter1;
            videoMixAdMediationAdapter1.setMediationAdapterEventListener(this.q);
            if(Looper.myLooper() == Looper.getMainLooper()) {
                b.a(Thread.currentThread(), "AdPopcornSSPVideoMix loadVideoMixAd Main Thread.");
                IMediationLogListener iMediationLogListener1 = this.m;
                if(iMediationLogListener1 != null) {
                    iMediationLogListener1.OnMediationLoadStart(this.d, this.getCurrentNetwork());
                }
                this.j.loadAd(((Context)this.c.get()), this, this.b, this.n, this.f, a00.b());
                return;
            }
            b.a(Thread.currentThread(), "AdPopcornSSPVideoMix loadVideoMixAd Another Thread");
            new Handler(Looper.getMainLooper()).post(new d(this, a00));
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
        class com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd.a extends z {
            final AdPopcornSSPVideoMixAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd.a.a implements Runnable {
                    final com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd.a a;

                    @Override
                    public void run() {
                        AdPopcornSSPVideoMixAd.this.g = false;
                        AdPopcornSSPVideoMixAd.this.loadAd();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd.a.a(this));
            }
        }


        class com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd.b implements M {
            final AdPopcornSSPVideoMixAd a;

            @Override  // com.igaworks.ssp.M
            public void onNetResponseListener(com.igaworks.ssp.t.e t$e0, String s, String s1, boolean z) {
                try {
                    if(z) {
                        AdPopcornSSPVideoMixAd.this.b(5000);
                        return;
                    }
                    if(s0.b(s)) {
                        AdPopcornSSPVideoMixAd.this.b(0x270F);
                        return;
                    }
                    d0 d00 = p.f(s);
                    if(d00 != null && d00.h() != 1) {
                        AdPopcornSSPVideoMixAd.this.b(d00.h());
                        return;
                    }
                    AdPopcornSSPVideoMixAd.this.b = d00;
                    if(AdPopcornSSPVideoMixAd.this.b != null && AdPopcornSSPVideoMixAd.this.b.d() != null) {
                        t0.a(((Context)AdPopcornSSPVideoMixAd.this.c.get()), AdPopcornSSPVideoMixAd.this.b.d());
                    }
                    E.g().c(AdPopcornSSPVideoMixAd.this.b.q());
                    AdPopcornSSPVideoMixAd.this.f();
                    return;
                }
                catch(Exception exception0) {
                }
                b.a(Thread.currentThread(), exception0);
                AdPopcornSSPVideoMixAd.this.b(200);
            }
        }

        JSONObject jSONObject0;
        synchronized(this) {
            try {
                if(E.g().f()) {
                    if(this.g) {
                        b.b(Thread.currentThread(), "loadAd() -> " + this.d + " : VideoMix In Progress!!");
                        return;
                    }
                    this.g = true;
                    this.h = false;
                    if(this.d == null || this.d.isEmpty()) {
                        this.b(2030);
                        return;
                    }
                    if(!E.g().m()) {
                        b.c(Thread.currentThread(), "Checking ADID...");
                        E.g().a(new com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd.a(this));
                        E e0 = E.g();
                        Objects.requireNonNull(e0);
                        new j(e0, ((Context)this.c.get()).getApplicationContext()).start();
                        return;
                    }
                    if(!e0.b(((Context)this.c.get()).getApplicationContext())) {
                        this.b(100001);
                        return;
                    }
                    b.c(Thread.currentThread(), "load VideoMix : " + this.d);
                    List list0 = E.g().a(this.d);
                    if(list0 == null) {
                        jSONObject0 = null;
                    }
                    else {
                        jSONObject0 = new JSONObject();
                        k k0 = k.c;
                        if(list0.contains(k0.b())) {
                            i i0 = i.e;
                            if(y.b(i0, this.i)) {
                                jSONObject0.put(k0.b() + "", this.a(i0).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        k k1 = k.d;
                        if(list0.contains(k1.b())) {
                            i i1 = i.r;
                            if(y.b(i1, this.i)) {
                                jSONObject0.put(k1.b() + "", this.a(i1).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        k k2 = k.e;
                        if(list0.contains(k2.b())) {
                            i i2 = i.u;
                            if(y.b(i2, this.i)) {
                                jSONObject0.put(k2.b() + "", this.a(i2).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        k k3 = k.f;
                        if(list0.contains(k3.b())) {
                            i i3 = i.l;
                            if(y.b(i3, this.i)) {
                                jSONObject0.put(k3.b() + "", this.a(i3).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        k k4 = k.g;
                        if(list0.contains(k4.b())) {
                            i i4 = i.v;
                            if(y.b(i4, this.i)) {
                                jSONObject0.put(k4.b() + "", this.a(i4).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        b.c(Thread.currentThread(), "load VideoMix biddingTokenParameter : " + jSONObject0);
                    }
                    t t0 = E.g().d();
                    Context context0 = ((Context)this.c.get()).getApplicationContext();
                    String s = this.d;
                    String s1 = this.e;
                    com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd.b adPopcornSSPVideoMixAd$b0 = new com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd.b(this);
                    t0.a(context0, com.igaworks.ssp.t.e.F, s, s1, jSONObject0, adPopcornSSPVideoMixAd$b0);
                    return;
                }
                b.a(Thread.currentThread(), this.d + " : GDPR_CONSENT_UNAVAILABLE");
                this.b(5008);
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
                this.b(200);
            }
        }
    }

    public void onPause() {
        try {
            VideoMixAdMediationAdapter videoMixAdMediationAdapter0 = this.j;
            if(videoMixAdMediationAdapter0 != null) {
                videoMixAdMediationAdapter0.pauseAd();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void onResume() {
        try {
            VideoMixAdMediationAdapter videoMixAdMediationAdapter0 = this.j;
            if(videoMixAdMediationAdapter0 != null) {
                videoMixAdMediationAdapter0.resumeAd();
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

    public void setMediationLogListener(IMediationLogListener iMediationLogListener0) {
        this.m = iMediationLogListener0;
    }

    public void setNetworkScheduleTimeout(int v) {
        b.c(Thread.currentThread(), "setNetworkScheduleTimeout : " + v);
        if(v > 1) {
            this.k = ((long)v) * 1000L;
        }
    }

    public void setPlacementAppKey(String s) {
        this.e = s;
    }

    public void setPlacementId(String s) {
        this.d = s;
    }

    public void setVideoMixAdEventCallbackListener(IVideoMixAdEventCallbackListener iVideoMixAdEventCallbackListener0) {
        this.a = iVideoMixAdEventCallbackListener0;
    }

    public void showAd() {
        class c implements Runnable {
            final AdPopcornSSPVideoMixAd a;

            @Override
            public void run() {
                try {
                    d0 d00 = new d0(AdPopcornSSPVideoMixAd.this.b);
                    AdPopcornSSPVideoMixAd.this.a(d00);
                    AdPopcornSSPVideoMixAd.this.h = false;
                }
                catch(Exception exception0) {
                    b.a(Thread.currentThread(), exception0);
                    AdPopcornSSPVideoMixAd.this.a(200);
                }
            }
        }

        synchronized(this) {
            try {
                if(this.l) {
                    b.b(Thread.currentThread(), "VideoMix playing...");
                    return;
                }
                if(this.b == null || !this.h) {
                    b.c(Thread.currentThread(), "showAd : NO_VIDEO_MIX_AD_LOADED");
                    this.a(5013);
                }
                else if(!e0.b(((Context)this.c.get()).getApplicationContext())) {
                    this.a(100001);
                }
                else if(Looper.myLooper() == Looper.getMainLooper()) {
                    b.a(Thread.currentThread(), "showAd VideoMix Main Thread : " + this.d);
                    this.a(new d0(this.b));
                    this.h = false;
                }
                else {
                    b.a(Thread.currentThread(), "showAd VideoMix Another Thread : " + this.d);
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

