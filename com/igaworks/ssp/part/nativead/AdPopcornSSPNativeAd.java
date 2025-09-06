package com.igaworks.ssp.part.nativead;

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
import com.igaworks.ssp.c0;
import com.igaworks.ssp.common.adapter.BaseMediationAdapter;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.e0;
import com.igaworks.ssp.g;
import com.igaworks.ssp.i;
import com.igaworks.ssp.k;
import com.igaworks.ssp.o0;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.IMediationLogListener;
import com.igaworks.ssp.part.nativead.binder.ADOPViewBinder;
import com.igaworks.ssp.part.nativead.binder.AdFitViewBinder;
import com.igaworks.ssp.part.nativead.binder.AdForusViewBinder;
import com.igaworks.ssp.part.nativead.binder.AdMobViewBinder;
import com.igaworks.ssp.part.nativead.binder.AdPopcornSSPViewBinder;
import com.igaworks.ssp.part.nativead.binder.AppLovinMaxViewBinder;
import com.igaworks.ssp.part.nativead.binder.CoupangViewBinder;
import com.igaworks.ssp.part.nativead.binder.FacebookViewBinder;
import com.igaworks.ssp.part.nativead.binder.GAMViewBinder;
import com.igaworks.ssp.part.nativead.binder.MintegralViewBinder;
import com.igaworks.ssp.part.nativead.binder.MobWithViewBinder;
import com.igaworks.ssp.part.nativead.binder.MobonViewBinder;
import com.igaworks.ssp.part.nativead.binder.NAMViewBinder;
import com.igaworks.ssp.part.nativead.binder.PangleViewBinder;
import com.igaworks.ssp.part.nativead.binder.VungleViewBinder;
import com.igaworks.ssp.part.nativead.listener.INativeAdEventCallbackListener;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.t0;
import com.igaworks.ssp.y;
import com.igaworks.ssp.z;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.List;
import org.json.JSONObject;

public class AdPopcornSSPNativeAd extends FrameLayout {
    public class PrivacyIconPosition {
        public static final int BOTTOM_LEFT = 2;
        public static final int BOTTOM_RIGHT = 3;
        public static final int TOP_LEFT = 0;
        public static final int TOP_RIGHT = 1;
        final AdPopcornSSPNativeAd a;

    }

    class b implements c0 {
        final AdPopcornSSPNativeAd a;

        @Override  // com.igaworks.ssp.c0
        public void a(int v) {
            if(AdPopcornSSPNativeAd.this.z != null) {
                AdPopcornSSPNativeAd.this.z.OnMediationLoadSuccess(AdPopcornSSPNativeAd.this.a, AdPopcornSSPNativeAd.this.getCurrentNetwork());
            }
            AdPopcornSSPNativeAd.this.h = v;
            AdPopcornSSPNativeAd.this.h();
        }

        @Override  // com.igaworks.ssp.c0
        public void a(int v, int v1) {
            i i0;
            try {
                if(AdPopcornSSPNativeAd.this.z != null) {
                    int v2 = AdPopcornSSPNativeAd.this.getCurrentNetwork();
                    AdPopcornSSPNativeAd.this.z.OnMediationLoadFailed(AdPopcornSSPNativeAd.this.a, v2);
                }
                if(AdPopcornSSPNativeAd.this.j != null) {
                    com.igaworks.ssp.b.a(Thread.currentThread(), "Fail in adapter : " + AdPopcornSSPNativeAd.this.j.getNetworkName() + ", internalReason : " + v1);
                    AdPopcornSSPNativeAd.this.a(AdPopcornSSPNativeAd.this.j);
                }
                if(v1 == 3) {
                    com.igaworks.ssp.b.b(Thread.currentThread(), "Native asset error : " + AdPopcornSSPNativeAd.this.j.getNetworkName());
                }
                if(AdPopcornSSPNativeAd.this.d.e() == null) {
                    AdPopcornSSPNativeAd.this.a(5002);
                    return;
                }
                if(v >= AdPopcornSSPNativeAd.this.d.e().a().size() - 1) {
                    AdPopcornSSPNativeAd.this.a(5002);
                    return;
                }
                AdPopcornSSPNativeAd.this.h = v + 1;
                i0 = i.a(((a0)AdPopcornSSPNativeAd.this.d.e().a().get(AdPopcornSSPNativeAd.this.h)).a());
                AdPopcornSSPNativeAd.this.A = false;
            }
            catch(Exception exception0) {
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                AdPopcornSSPNativeAd.this.a(200);
                return;
            }
            try {
                if(i0.b() == i.c.b() && y.a(AdPopcornSSPNativeAd.this.d)) {
                    String s = ((g)AdPopcornSSPNativeAd.this.d.b().get(0)).k();
                    if(s != null) {
                        if(p.k(s) == k.c.b()) {
                            i0 = i.e;
                            AdPopcornSSPNativeAd.this.A = true;
                        }
                        else if(p.k(s) == k.f.b()) {
                            i0 = i.l;
                            AdPopcornSSPNativeAd.this.A = true;
                        }
                        else if(p.k(s) == k.g.b()) {
                            i0 = i.v;
                            AdPopcornSSPNativeAd.this.A = true;
                        }
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            try {
                BaseMediationAdapter baseMediationAdapter0 = AdPopcornSSPNativeAd.this.a(i0);
                AdPopcornSSPNativeAd.this.j = baseMediationAdapter0;
                AdPopcornSSPNativeAd.this.j.setNativeMediationAdapterEventListener(this);
                if(AdPopcornSSPNativeAd.this.z != null) {
                    int v3 = AdPopcornSSPNativeAd.this.getCurrentNetwork();
                    AdPopcornSSPNativeAd.this.z.OnMediationLoadStart(AdPopcornSSPNativeAd.this.a, v3);
                }
                AdPopcornSSPNativeAd.this.j.loadNativeAd(((Context)AdPopcornSSPNativeAd.this.c.get()), AdPopcornSSPNativeAd.this.d, AdPopcornSSPNativeAd.this.A, AdPopcornSSPNativeAd.this.h, AdPopcornSSPNativeAd.this);
                return;
            }
            catch(Exception exception0) {
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            AdPopcornSSPNativeAd.this.a(200);
        }

        @Override  // com.igaworks.ssp.c0
        public void onAdHidden() {
            AdPopcornSSPNativeAd.this.e();
        }

        @Override  // com.igaworks.ssp.c0
        public void onClicked() {
            AdPopcornSSPNativeAd.this.f();
        }

        @Override  // com.igaworks.ssp.c0
        public void onImpression() {
            AdPopcornSSPNativeAd.this.g();
        }
    }

    class c implements M {
        final AdPopcornSSPNativeAd a;

        @Override  // com.igaworks.ssp.M
        public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
            if(t$e0 == e.n) {
                try {
                    if(z) {
                        AdPopcornSSPNativeAd.this.a(5000);
                        return;
                    }
                    if(s0.b(s)) {
                        AdPopcornSSPNativeAd.this.a(0x270F);
                        return;
                    }
                    if(!e0.b(((Context)AdPopcornSSPNativeAd.this.c.get()).getApplicationContext())) {
                        AdPopcornSSPNativeAd.this.a(100001);
                        return;
                    }
                    d0 d00 = p.f(s);
                    if(d00 != null && d00.h() != 1) {
                        AdPopcornSSPNativeAd.this.a(d00.h());
                        return;
                    }
                    AdPopcornSSPNativeAd.this.d = d00;
                    if(AdPopcornSSPNativeAd.this.d != null && AdPopcornSSPNativeAd.this.d.d() != null) {
                        t0.a(((Context)AdPopcornSSPNativeAd.this.c.get()), AdPopcornSSPNativeAd.this.d.d());
                    }
                    AdPopcornSSPNativeAd.this.d();
                    return;
                }
                catch(Exception exception0) {
                }
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                AdPopcornSSPNativeAd.this.a(200);
            }
        }
    }

    private boolean A;
    private o0 B;
    private int C;
    private long D;
    private c0 E;
    M F;
    private String a;
    private String b;
    private WeakReference c;
    private d0 d;
    private INativeAdEventCallbackListener e;
    private boolean f;
    private boolean g;
    private int h;
    private ConcurrentHashMap i;
    private BaseMediationAdapter j;
    private AdPopcornSSPViewBinder k;
    private FacebookViewBinder l;
    private AdMobViewBinder m;
    private MintegralViewBinder n;
    private AdFitViewBinder o;
    private MobonViewBinder p;
    private GAMViewBinder q;
    private PangleViewBinder r;
    private AppLovinMaxViewBinder s;
    private NAMViewBinder t;
    private ADOPViewBinder u;
    private VungleViewBinder v;
    private CoupangViewBinder w;
    private MobWithViewBinder x;
    private AdForusViewBinder y;
    private IMediationLogListener z;

    public AdPopcornSSPNativeAd(Context context0) {
        super(context0);
        this.f = false;
        this.g = false;
        this.h = 0;
        this.A = false;
        this.B = null;
        this.C = 21600;
        this.D = 0L;
        this.E = new b(this);
        this.F = new c(this);
        this.c = new WeakReference(context0);
    }

    public AdPopcornSSPNativeAd(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = false;
        this.g = false;
        this.h = 0;
        this.A = false;
        this.B = null;
        this.C = 21600;
        this.D = 0L;
        this.E = new b(this);
        this.F = new c(this);
        this.c = new WeakReference(context0);
    }

    public AdPopcornSSPNativeAd(Context context0, String s) {
        super(context0);
        this.f = false;
        this.g = false;
        this.h = 0;
        this.A = false;
        this.B = null;
        this.C = 21600;
        this.D = 0L;
        this.E = new b(this);
        this.F = new c(this);
        this.c = new WeakReference(context0);
        this.b = s;
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
        this.D = 0L;
        INativeAdEventCallbackListener iNativeAdEventCallbackListener0 = this.e;
        if(iNativeAdEventCallbackListener0 != null) {
            iNativeAdEventCallbackListener0.onNativeAdLoadFailed(new SSPErrorCode(v));
        }
        this.a(true);
        this.c();
    }

    private void a(BaseMediationAdapter baseMediationAdapter0) {
        if(baseMediationAdapter0 == null) {
            return;
        }
        baseMediationAdapter0.setNativeMediationAdapterEventListener(null);
        baseMediationAdapter0.destroyNativeAd();
    }

    private void a(boolean z) {
        try {
            if(z) {
                o0 o00 = this.B;
                if(o00 != null) {
                    o00.setVisibility(8);
                }
                if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                    this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                }
                if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                    this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                }
                if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                    this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                }
                if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                    this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                }
                if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                    this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                }
                if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                    this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                }
                if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                    this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                }
                if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                    this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                }
                if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                    this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                }
                NAMViewBinder nAMViewBinder0 = this.t;
                if(nAMViewBinder0 != null) {
                    if(this.findViewById(nAMViewBinder0.gfpNativeAdViewId) != null) {
                        this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                    }
                    if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                        this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                    }
                    View view0 = this.t.gfpNativeBannerView;
                    if(view0 != null) {
                        view0.setVisibility(8);
                    }
                }
                if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                    this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                }
                if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                    this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                }
                if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                    this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                }
                if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                    this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                }
                if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                    this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                }
            }
            else {
                this.setVisibility(0);
                if(this.j.getNetworkName().equals("ADPOPCORN")) {
                    if(this.k != null && this.k.privacyIconVisibility) {
                        o0 o01 = this.B;
                        if(o01 != null) {
                            o01.setVisibility(0);
                        }
                    }
                    if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                        this.findViewById(this.k.nativeAdViewId).setVisibility(0);
                    }
                    if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                        this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                    }
                    if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                        this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                    }
                    if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                        this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                    }
                    if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                        this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                    }
                    if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                        this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                    }
                    if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                        this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                    }
                    if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                        this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                    }
                    if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                        this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                    }
                    NAMViewBinder nAMViewBinder1 = this.t;
                    if(nAMViewBinder1 != null) {
                        if(this.findViewById(nAMViewBinder1.gfpNativeAdViewId) != null) {
                            this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                        }
                        if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                            this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                        }
                        View view1 = this.t.gfpNativeBannerView;
                        if(view1 != null) {
                            view1.setVisibility(8);
                        }
                    }
                    if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                        this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                    }
                    if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                        this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                    }
                    if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                        this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                    }
                    if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                        this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                    }
                    if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                        this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                    }
                }
                else {
                    o0 o02 = this.B;
                    if(o02 != null) {
                        o02.setVisibility(8);
                    }
                    if(this.j.getNetworkName().equals("AdMob")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(0);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        NAMViewBinder nAMViewBinder2 = this.t;
                        if(nAMViewBinder2 != null) {
                            if(this.findViewById(nAMViewBinder2.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view2 = this.t.gfpNativeBannerView;
                            if(view2 != null) {
                                view2.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("FAN") || this.j.getNetworkName().equals("FAN_NATIVE_BANNER")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(0);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        NAMViewBinder nAMViewBinder3 = this.t;
                        if(nAMViewBinder3 != null) {
                            if(this.findViewById(nAMViewBinder3.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view3 = this.t.gfpNativeBannerView;
                            if(view3 != null) {
                                view3.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("Mintegral")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(0);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        NAMViewBinder nAMViewBinder4 = this.t;
                        if(nAMViewBinder4 != null) {
                            if(this.findViewById(nAMViewBinder4.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view4 = this.t.gfpNativeBannerView;
                            if(view4 != null) {
                                view4.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("AdFit")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(0);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        NAMViewBinder nAMViewBinder5 = this.t;
                        if(nAMViewBinder5 != null) {
                            if(this.findViewById(nAMViewBinder5.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view5 = this.t.gfpNativeBannerView;
                            if(view5 != null) {
                                view5.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("Mobon")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(0);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        NAMViewBinder nAMViewBinder6 = this.t;
                        if(nAMViewBinder6 != null) {
                            if(this.findViewById(nAMViewBinder6.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view6 = this.t.gfpNativeBannerView;
                            if(view6 != null) {
                                view6.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("GAM")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(0);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        NAMViewBinder nAMViewBinder7 = this.t;
                        if(nAMViewBinder7 != null) {
                            if(this.findViewById(nAMViewBinder7.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view7 = this.t.gfpNativeBannerView;
                            if(view7 != null) {
                                view7.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("Pangle")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(0);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        NAMViewBinder nAMViewBinder8 = this.t;
                        if(nAMViewBinder8 != null) {
                            if(this.findViewById(nAMViewBinder8.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view8 = this.t.gfpNativeBannerView;
                            if(view8 != null) {
                                view8.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("APPLOVIN_MAX_DYNAMIC_BID")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(0);
                        }
                        NAMViewBinder nAMViewBinder9 = this.t;
                        if(nAMViewBinder9 != null) {
                            if(this.findViewById(nAMViewBinder9.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view9 = this.t.gfpNativeBannerView;
                            if(view9 != null) {
                                view9.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("NAM")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        if(this.t != null) {
                            com.igaworks.ssp.b.a(Thread.currentThread(), "Check visibility in NAMAdapter");
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("ADOP")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        NAMViewBinder nAMViewBinder10 = this.t;
                        if(nAMViewBinder10 != null) {
                            if(this.findViewById(nAMViewBinder10.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view10 = this.t.gfpNativeBannerView;
                            if(view10 != null) {
                                view10.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(0);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("Vungle")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        NAMViewBinder nAMViewBinder11 = this.t;
                        if(nAMViewBinder11 != null) {
                            if(this.findViewById(nAMViewBinder11.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view11 = this.t.gfpNativeBannerView;
                            if(view11 != null) {
                                view11.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(0);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("COUPANG_CPM")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        NAMViewBinder nAMViewBinder12 = this.t;
                        if(nAMViewBinder12 != null) {
                            if(this.findViewById(nAMViewBinder12.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view12 = this.t.gfpNativeBannerView;
                            if(view12 != null) {
                                view12.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(0);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("MobWith")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        NAMViewBinder nAMViewBinder13 = this.t;
                        if(nAMViewBinder13 != null) {
                            if(this.findViewById(nAMViewBinder13.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view13 = this.t.gfpNativeBannerView;
                            if(view13 != null) {
                                view13.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(0);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(8);
                        }
                    }
                    else if(this.j.getNetworkName().equals("AdForus")) {
                        if(this.k != null && this.findViewById(this.k.nativeAdViewId) != null) {
                            this.findViewById(this.k.nativeAdViewId).setVisibility(8);
                        }
                        if(this.l != null && this.findViewById(this.l.nativeAdViewId) != null) {
                            this.findViewById(this.l.nativeAdViewId).setVisibility(8);
                        }
                        if(this.m != null && this.findViewById(this.m.nativeAdViewId) != null) {
                            this.findViewById(this.m.nativeAdViewId).setVisibility(8);
                        }
                        if(this.n != null && this.findViewById(this.n.nativeAdViewId) != null) {
                            this.findViewById(this.n.nativeAdViewId).setVisibility(8);
                        }
                        if(this.o != null && this.findViewById(this.o.nativeAdViewId) != null) {
                            this.findViewById(this.o.nativeAdViewId).setVisibility(8);
                        }
                        if(this.p != null && this.findViewById(this.p.nativeAdViewId) != null) {
                            this.findViewById(this.p.nativeAdViewId).setVisibility(8);
                        }
                        if(this.q != null && this.findViewById(this.q.nativeAdViewId) != null) {
                            this.findViewById(this.q.nativeAdViewId).setVisibility(8);
                        }
                        if(this.r != null && this.findViewById(this.r.nativeAdViewId) != null) {
                            this.findViewById(this.r.nativeAdViewId).setVisibility(8);
                        }
                        if(this.s != null && this.findViewById(this.s.nativeAdViewId) != null) {
                            this.findViewById(this.s.nativeAdViewId).setVisibility(8);
                        }
                        NAMViewBinder nAMViewBinder14 = this.t;
                        if(nAMViewBinder14 != null) {
                            if(this.findViewById(nAMViewBinder14.gfpNativeAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeAdViewId).setVisibility(8);
                            }
                            if(this.findViewById(this.t.gfpNativeSimpleAdViewId) != null) {
                                this.findViewById(this.t.gfpNativeSimpleAdViewId).setVisibility(8);
                            }
                            View view14 = this.t.gfpNativeBannerView;
                            if(view14 != null) {
                                view14.setVisibility(8);
                            }
                        }
                        if(this.u != null && this.findViewById(this.u.nativeAdViewId) != null) {
                            this.findViewById(this.u.nativeAdViewId).setVisibility(8);
                        }
                        if(this.v != null && this.findViewById(this.v.nativeAdViewId) != null) {
                            this.findViewById(this.v.nativeAdViewId).setVisibility(8);
                        }
                        if(this.w != null && this.findViewById(this.w.nativeAdViewId) != null) {
                            this.findViewById(this.w.nativeAdViewId).setVisibility(8);
                        }
                        if(this.x != null && this.findViewById(this.x.nativeAdViewId) != null) {
                            this.findViewById(this.x.nativeAdViewId).setVisibility(8);
                        }
                        if(this.y != null && this.findViewById(this.y.nativeAdViewId) != null) {
                            this.findViewById(this.y.nativeAdViewId).setVisibility(0);
                        }
                    }
                }
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    private void b() {
        ConcurrentHashMap concurrentHashMap0 = this.i;
        if(concurrentHashMap0 != null) {
            concurrentHashMap0.clear();
            this.i = null;
        }
    }

    private void c() {
        com.igaworks.ssp.b.c(Thread.currentThread(), "internalStopAd : " + this.a);
        this.setVisibility(8);
    }

    private void d() {
        i i1;
        i i0;
        try {
            if(!y.c(this.d)) {
                if(!y.a(this.d)) {
                    this.a(this.d.h());
                    return;
                }
                i0 = i.c;
                this.A = false;
                goto label_6;
            }
            goto label_28;
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            this.a(200);
            return;
        }
        try {
        label_6:
            if(i0.b() == i0.b() && y.a(this.d)) {
                String s = ((g)this.d.b().get(0)).k();
                if(s != null) {
                    if(p.k(s) == k.c.b()) {
                        i0 = i.e;
                        this.A = true;
                    }
                    else if(p.k(s) == k.f.b()) {
                        i0 = i.l;
                        this.A = true;
                    }
                    else if(p.k(s) == k.g.b()) {
                        i0 = i.v;
                        this.A = true;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.a(i0);
            this.j = baseMediationAdapter0;
            baseMediationAdapter0.setNativeMediationAdapterEventListener(this.E);
            IMediationLogListener iMediationLogListener0 = this.z;
            if(iMediationLogListener0 != null) {
                iMediationLogListener0.OnMediationLoadStart(this.a, this.getCurrentNetwork());
            }
            this.j.loadNativeAd(((Context)this.c.get()), this.d, this.A, this.h, this);
            return;
        label_28:
            y.a(this.d, this.i);
            i1 = i.a(((a0)this.d.e().a().get(this.h)).a());
            this.A = false;
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            this.a(200);
            return;
        }
        try {
            if(i1.b() == i.c.b() && y.a(this.d)) {
                String s1 = ((g)this.d.b().get(0)).k();
                if(s1 != null) {
                    if(p.k(s1) == k.c.b()) {
                        i1 = i.e;
                        this.A = true;
                    }
                    else if(p.k(s1) == k.f.b()) {
                        i1 = i.l;
                        this.A = true;
                    }
                    else if(p.k(s1) == k.g.b()) {
                        i1 = i.v;
                        this.A = true;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter1 = this.a(i1);
            this.j = baseMediationAdapter1;
            baseMediationAdapter1.setNativeMediationAdapterEventListener(this.E);
            IMediationLogListener iMediationLogListener1 = this.z;
            if(iMediationLogListener1 != null) {
                iMediationLogListener1.OnMediationLoadStart(this.a, this.getCurrentNetwork());
            }
            this.j.loadNativeAd(((Context)this.c.get()), this.d, this.A, this.h, this);
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        this.a(200);
    }

    public void destroy() {
        try {
            com.igaworks.ssp.b.c(Thread.currentThread(), "nativeAd destroy : " + this.a);
            this.g = false;
            this.f = false;
            this.D = 0L;
            BaseMediationAdapter baseMediationAdapter0 = this.j;
            if(baseMediationAdapter0 != null) {
                baseMediationAdapter0.destroyNativeAd();
                this.j.setNativeMediationAdapterEventListener(null);
                this.j = null;
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
        INativeAdEventCallbackListener iNativeAdEventCallbackListener0 = this.e;
        if(iNativeAdEventCallbackListener0 != null) {
            iNativeAdEventCallbackListener0.onAdHidden();
        }
    }

    private void f() {
        INativeAdEventCallbackListener iNativeAdEventCallbackListener0 = this.e;
        if(iNativeAdEventCallbackListener0 != null) {
            iNativeAdEventCallbackListener0.onClicked();
        }
    }

    private void g() {
        INativeAdEventCallbackListener iNativeAdEventCallbackListener0 = this.e;
        if(iNativeAdEventCallbackListener0 != null) {
            iNativeAdEventCallbackListener0.onImpression();
        }
    }

    public ADOPViewBinder getADOPViewBinder() {
        return this.u;
    }

    public AdFitViewBinder getAdFitViewBinder() {
        return this.o;
    }

    public AdForusViewBinder getAdForusViewBinder() {
        return this.y;
    }

    public AdMobViewBinder getAdMobViewBinder() {
        return this.m;
    }

    public AdPopcornSSPViewBinder getAdPopcornSSPViewBinder() {
        return this.k;
    }

    public AppLovinMaxViewBinder getAppLovinMaxViewBinder() {
        return this.s;
    }

    public CoupangViewBinder getCoupangViewBinder() {
        return this.w;
    }

    public int getCurrentNetwork() {
        try {
            return this.j == null ? -1 : i.a(this.j.getNetworkName()).b();
        }
        catch(Exception unused_ex) {
        }
        return -1;
    }

    public FacebookViewBinder getFacebookViewBinder() {
        return this.l;
    }

    public GAMViewBinder getGAMViewBinder() {
        return this.q;
    }

    public MintegralViewBinder getMintegralViewBinder() {
        return this.n;
    }

    public MobWithViewBinder getMobWithViewBinder() {
        return this.x;
    }

    public MobonViewBinder getMobonViewBinder() {
        return this.p;
    }

    public NAMViewBinder getNamViewBinder() {
        return this.t;
    }

    public PangleViewBinder getPangleViewBinder() {
        return this.r;
    }

    public String getPlacementId() {
        return this.a;
    }

    public VungleViewBinder getVungleViewBinder() {
        return this.v;
    }

    private void h() {
        this.f = false;
        this.g = true;
        this.D = Calendar.getInstance().getTimeInMillis();
        this.a();
        INativeAdEventCallbackListener iNativeAdEventCallbackListener0 = this.e;
        if(iNativeAdEventCallbackListener0 != null) {
            iNativeAdEventCallbackListener0.onNativeAdLoadSuccess();
        }
        this.a(false);
    }

    public boolean isExpired() {
        boolean z;
        if(this.D > 0L) {
            try {
                if(((long)this.C) - (Calendar.getInstance().getTimeInMillis() - this.D) / 1000L > 0L) {
                    z = false;
                    goto label_5;
                }
            }
            catch(Exception unused_ex) {
            }
            z = true;
            com.igaworks.ssp.b.c(Thread.currentThread(), "placementId : " + this.a + ", isExpired : " + z);
            return z;
        }
        else {
            z = true;
        }
    label_5:
        com.igaworks.ssp.b.c(Thread.currentThread(), "placementId : " + this.a + ", isExpired : " + z);
        return z;
    }

    public boolean isLoaded() {
        return this.g;
    }

    public void loadAd() {
        class a extends z {
            final AdPopcornSSPNativeAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.nativead.AdPopcornSSPNativeAd.a.a implements Runnable {
                    final a a;

                    @Override
                    public void run() {
                        AdPopcornSSPNativeAd.this.f = false;
                        AdPopcornSSPNativeAd.this.loadAd();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.nativead.AdPopcornSSPNativeAd.a.a(this));
            }
        }

        JSONObject jSONObject0;
        try {
            if(!E.g().f()) {
                com.igaworks.ssp.b.a(Thread.currentThread(), this.a + " : GDPR_CONSENT_UNAVAILABLE");
                this.a(5008);
                return;
            }
            if(this.f) {
                com.igaworks.ssp.b.b(Thread.currentThread(), this.a + " : NativeAd In Progress!!");
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
                com.igaworks.ssp.b.c(Thread.currentThread(), "load NativeAd : " + this.a);
                if(!e0.b(((Context)this.c.get()).getApplicationContext())) {
                    this.a(100001);
                    return;
                }
                this.D = 0L;
                List list0 = E.g().a(this.a);
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
                    k k1 = k.f;
                    if(list0.contains(k1.b())) {
                        i i1 = i.l;
                        if(y.a(i1, this.i)) {
                            jSONObject0.put(k1.b() + "", this.a(i1).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                        }
                    }
                    k k2 = k.g;
                    if(list0.contains(k2.b())) {
                        i i2 = i.v;
                        if(y.a(i2, this.i)) {
                            jSONObject0.put(k2.b() + "", this.a(i2).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                        }
                    }
                    com.igaworks.ssp.b.c(Thread.currentThread(), "load native biddingTokenParameter : " + jSONObject0);
                }
                E.g().d().a(((Context)this.c.get()).getApplicationContext(), e.n, this.a, this.b, jSONObject0, this.F);
                return;
            }
            this.a(2030);
        }
        catch(Exception unused_ex) {
            this.f = false;
        }
    }

    public void manualClickEvent() {
        try {
            if(this.j.getNetworkName() == "ADPOPCORN" && y.a(this.d)) {
                g g0 = (g)this.d.b().get(0);
                for(int v = 0; v < g0.b().size(); ++v) {
                    String s = (String)g0.b().get(v);
                    if(s0.a(s)) {
                        com.igaworks.ssp.b.c(Thread.currentThread(), String.format("manualClickEvent Click Report URL Called in nativeAd : %s ", s));
                        E.g().d().a(((Context)this.c.get()), e.j, s);
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        BaseMediationAdapter baseMediationAdapter0 = this.j;
        if(baseMediationAdapter0 != null) {
            baseMediationAdapter0.checkAdPopcornSSPNativeImpression();
        }
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        BaseMediationAdapter baseMediationAdapter0 = this.j;
        if(baseMediationAdapter0 != null) {
            baseMediationAdapter0.checkAdPopcornSSPNativeImpression();
        }
    }

    public void setADOPViewBinder(ADOPViewBinder aDOPViewBinder0) {
        this.u = aDOPViewBinder0;
    }

    public void setAdFitViewBinder(AdFitViewBinder adFitViewBinder0) {
        this.o = adFitViewBinder0;
    }

    public void setAdForusViewBinder(AdForusViewBinder adForusViewBinder0) {
        this.y = adForusViewBinder0;
    }

    public void setAdMobViewBinder(AdMobViewBinder adMobViewBinder0) {
        this.m = adMobViewBinder0;
    }

    public void setAdPopcornSSPViewBinder(AdPopcornSSPViewBinder adPopcornSSPViewBinder0) {
        this.k = adPopcornSSPViewBinder0;
    }

    public void setAppLovinMaxViewBinder(AppLovinMaxViewBinder appLovinMaxViewBinder0) {
        this.s = appLovinMaxViewBinder0;
    }

    public void setCoupangViewBinder(CoupangViewBinder coupangViewBinder0) {
        this.w = coupangViewBinder0;
    }

    public void setFacebookAudienceViewBinder(FacebookViewBinder facebookViewBinder0) {
        this.l = facebookViewBinder0;
    }

    public void setGAMViewBinder(GAMViewBinder gAMViewBinder0) {
        this.q = gAMViewBinder0;
    }

    public void setMediationLogListener(IMediationLogListener iMediationLogListener0) {
        this.z = iMediationLogListener0;
    }

    public void setMintegralViewBinder(MintegralViewBinder mintegralViewBinder0) {
        this.n = mintegralViewBinder0;
    }

    public void setMobWithViewBinder(MobWithViewBinder mobWithViewBinder0) {
        this.x = mobWithViewBinder0;
    }

    public void setMobonViewBinder(MobonViewBinder mobonViewBinder0) {
        this.p = mobonViewBinder0;
    }

    public void setNamViewBinder(NAMViewBinder nAMViewBinder0) {
        this.t = nAMViewBinder0;
    }

    public void setNativeAdEventCallbackListener(INativeAdEventCallbackListener iNativeAdEventCallbackListener0) {
        this.e = iNativeAdEventCallbackListener0;
    }

    public void setPI(o0 o00) {
        this.B = o00;
    }

    public void setPangleViewBinder(PangleViewBinder pangleViewBinder0) {
        this.r = pangleViewBinder0;
    }

    public void setPlacementAppKey(String s) {
        this.b = s;
    }

    public void setPlacementId(String s) {
        this.a = s;
        E.g().a(this);
    }

    public void setVungleViewBinder(VungleViewBinder vungleViewBinder0) {
        this.v = vungleViewBinder0;
    }
}

