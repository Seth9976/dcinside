package com.igaworks.ssp.part.interstitial;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import com.igaworks.ssp.E.j;
import com.igaworks.ssp.E;
import com.igaworks.ssp.M;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.T;
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
import com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener;
import com.igaworks.ssp.part.interstitial.listener.IInterstitialLoadEventCallbackListener;
import com.igaworks.ssp.part.interstitial.listener.IInterstitialShowEventCallbackListener;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t0;
import com.igaworks.ssp.t;
import com.igaworks.ssp.y;
import com.igaworks.ssp.z;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class AdPopcornSSPInterstitialAd {
    public class CloseEvent {
        public static final int AUTO_CLOSE = 5;
        public static final int CLICK_CLOSE_BTN = 1;
        public static final int PRESSED_BACK_KEY = 2;
        public static final int SWIPE_LEFT_TO_RIGHT = 4;
        public static final int SWIPE_RIGHT_TO_LEFT = 3;
        public static final int UNKNOWN;
        final AdPopcornSSPInterstitialAd a;

    }

    public class ContentsScale {
        public static final int DEFAULT = 0;
        public static final int FIT_XY = 2;
        public static final int FULLSCREEN = 1;
        final AdPopcornSSPInterstitialAd a;

    }

    public class CustomExtraData {
        public static final String APSSP_AD_AUTO_BG = "backgroundAutoBg";
        public static final String APSSP_AD_BACKGROUND_COLOR = "backgroundColor";
        public static final String APSSP_AD_CLOSE_BTN_BOTTOM_MARGIN = "closeBtnBottomMargin";
        public static final String APSSP_AD_CLOSE_BTN_GRAVITY = "closeBtnGravity";
        public static final String APSSP_AD_CLOSE_BTN_LEFT_MARGIN = "closeBtnLeftMargin";
        public static final String APSSP_AD_CLOSE_BTN_MARGIN_FROM_EDGE = "closeBtnGravityFromEdge";
        public static final String APSSP_AD_CLOSE_BTN_RIGHT_MARGIN = "closeBtnRightMargin";
        public static final String APSSP_AD_CLOSE_BTN_TOP_MARGIN = "closeBtnTopMargin";
        public static final String APSSP_AD_CONTENTS_SCALE = "contentsScale";
        public static final String APSSP_AD_DISABLE_BACK_BTN = "disableBackBtn";
        public static final String APSSP_AD_ENABLE_AUTO_CLOSE = "enableAutoClose";
        public static final String APSSP_AD_ENABLE_SWIPE_CLOSE = "enableSwipeClose";
        public static final String APSSP_AD_HIDE_CLOSE_BTN = "hideCloseBtn";
        public static final String APSSP_AD_SWIPE_MIN_DISTANCE_DP = "swipeMinDistanceDP";
        public static final String ENDING_TEXT = "endingText";
        public static final String ENDING_TEXT_COLOR = "endingTextColor";
        public static final String ENDING_TEXT_GRAVITY = "endingTextGravity";
        public static final String ENDING_TEXT_SIZE = "endingTextSize";
        public static final String IS_ENDING_AD = "isEndingAd";
        final AdPopcornSSPInterstitialAd a;

    }

    class e implements T {
        final AdPopcornSSPInterstitialAd a;

        @Override  // com.igaworks.ssp.T
        public void a() {
            AdPopcornSSPInterstitialAd.this.a();
        }

        @Override  // com.igaworks.ssp.T
        public void a(int v) {
            AdPopcornSSPInterstitialAd.this.c();
        }

        @Override  // com.igaworks.ssp.T
        public void b(int v) {
            if(AdPopcornSSPInterstitialAd.this.G != null && AdPopcornSSPInterstitialAd.this.D != null) {
                AdPopcornSSPInterstitialAd.this.G.OnMediationLoadSuccess(AdPopcornSSPInterstitialAd.this.f, i.a(AdPopcornSSPInterstitialAd.this.D.getNetworkName()).b());
            }
            AdPopcornSSPInterstitialAd.this.i = v;
            AdPopcornSSPInterstitialAd.this.b();
        }

        @Override  // com.igaworks.ssp.T
        public void c(int v) {
            AdPopcornSSPInterstitialAd.this.b(5003);
        }

        @Override  // com.igaworks.ssp.T
        public void d(int v) {
            class a implements Runnable {
                final e a;

                @Override
                public void run() {
                    try {
                        Object object0 = AdPopcornSSPInterstitialAd.this.e.get();
                        AdPopcornSSPInterstitialAd.this.D.loadInterstitial(((Context)object0), AdPopcornSSPInterstitialAd.this, AdPopcornSSPInterstitialAd.this.d, AdPopcornSSPInterstitialAd.this.H, AdPopcornSSPInterstitialAd.this.i);
                    }
                    catch(Exception unused_ex) {
                        AdPopcornSSPInterstitialAd.this.c(AdPopcornSSPInterstitialAd.this.d.h());
                    }
                }
            }

            i i0;
            try {
                if(AdPopcornSSPInterstitialAd.this.G != null && AdPopcornSSPInterstitialAd.this.D != null) {
                    int v1 = i.a(AdPopcornSSPInterstitialAd.this.D.getNetworkName()).b();
                    AdPopcornSSPInterstitialAd.this.G.OnMediationLoadFailed(AdPopcornSSPInterstitialAd.this.f, v1);
                }
                if(AdPopcornSSPInterstitialAd.this.d.e() == null) {
                    AdPopcornSSPInterstitialAd.this.c(5002);
                    return;
                }
                if(v >= AdPopcornSSPInterstitialAd.this.d.e().a().size() - 1) {
                    AdPopcornSSPInterstitialAd.this.c(5002);
                    return;
                }
                AdPopcornSSPInterstitialAd.this.i = v + 1;
                i0 = i.a(((a0)AdPopcornSSPInterstitialAd.this.d.e().a().get(AdPopcornSSPInterstitialAd.this.i)).a());
                AdPopcornSSPInterstitialAd.this.H = false;
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
                AdPopcornSSPInterstitialAd.this.c(200);
                return;
            }
            try {
                if(i0.b() == i.c.b() && y.a(AdPopcornSSPInterstitialAd.this.d)) {
                    String s = ((g)AdPopcornSSPInterstitialAd.this.d.b().get(0)).k();
                    if(s != null) {
                        if(p.k(s) == k.c.b()) {
                            i0 = i.e;
                            AdPopcornSSPInterstitialAd.this.H = true;
                        }
                        else if(p.k(s) == k.d.b()) {
                            i0 = i.r;
                            AdPopcornSSPInterstitialAd.this.H = true;
                        }
                        else if(p.k(s) == k.g.b()) {
                            i0 = i.v;
                            AdPopcornSSPInterstitialAd.this.H = true;
                        }
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            try {
                BaseMediationAdapter baseMediationAdapter0 = AdPopcornSSPInterstitialAd.this.a(i0);
                AdPopcornSSPInterstitialAd.this.D = baseMediationAdapter0;
                AdPopcornSSPInterstitialAd.this.D.setInterstitialMediationAdapterEventListener(this);
                if(AdPopcornSSPInterstitialAd.this.G != null) {
                    int v2 = i.a(AdPopcornSSPInterstitialAd.this.D.getNetworkName()).b();
                    AdPopcornSSPInterstitialAd.this.G.OnMediationLoadStart(AdPopcornSSPInterstitialAd.this.f, v2);
                }
                if(Looper.myLooper() == Looper.getMainLooper()) {
                    b.a(Thread.currentThread(), "loadAd Interstitial Main Thread : " + AdPopcornSSPInterstitialAd.this.f);
                    Object object0 = AdPopcornSSPInterstitialAd.this.e.get();
                    AdPopcornSSPInterstitialAd.this.D.loadInterstitial(((Context)object0), AdPopcornSSPInterstitialAd.this, AdPopcornSSPInterstitialAd.this.d, AdPopcornSSPInterstitialAd.this.H, AdPopcornSSPInterstitialAd.this.i);
                    return;
                }
                b.a(Thread.currentThread(), "loadAd Interstitial Another Thread : " + AdPopcornSSPInterstitialAd.this.f);
                new Handler(Looper.getMainLooper()).post(new a(this));
                return;
            }
            catch(Exception exception0) {
            }
            b.a(Thread.currentThread(), exception0);
            AdPopcornSSPInterstitialAd.this.c(200);
        }

        @Override  // com.igaworks.ssp.T
        public void e(int v) {
            AdPopcornSSPInterstitialAd.this.a(v);
        }
    }

    private int A;
    private int B;
    private HashMap C;
    private BaseMediationAdapter D;
    private int E;
    private boolean F;
    private IMediationLogListener G;
    private boolean H;
    private boolean I;
    private T J;
    private IInterstitialEventCallbackListener a;
    private IInterstitialLoadEventCallbackListener b;
    private IInterstitialShowEventCallbackListener c;
    private d0 d;
    private WeakReference e;
    private String f;
    private String g;
    private boolean h;
    private int i;
    private boolean j;
    private ConcurrentHashMap k;
    private boolean l;
    private String m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private boolean x;
    private int y;
    private int z;

    public AdPopcornSSPInterstitialAd(Context context0) {
        this.h = false;
        this.i = 0;
        this.j = false;
        this.l = false;
        this.m = "";
        this.n = 11;
        this.o = Color.parseColor("#9c9c9c");
        this.p = 5;
        this.q = Color.parseColor("#000000");
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = 120;
        this.w = 53;
        this.x = true;
        this.y = -28;
        this.z = 20;
        this.A = 20;
        this.B = 0;
        this.E = 0;
        this.F = false;
        this.H = false;
        this.I = false;
        this.J = new e(this);
        this.e = new WeakReference(context0);
        E.g().a(this);
    }

    public AdPopcornSSPInterstitialAd(Context context0, String s) {
        this.h = false;
        this.i = 0;
        this.j = false;
        this.l = false;
        this.m = "";
        this.n = 11;
        this.o = Color.parseColor("#9c9c9c");
        this.p = 5;
        this.q = Color.parseColor("#000000");
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = 120;
        this.w = 53;
        this.x = true;
        this.y = -28;
        this.z = 20;
        this.A = 20;
        this.B = 0;
        this.E = 0;
        this.F = false;
        this.H = false;
        this.I = false;
        this.J = new e(this);
        this.e = new WeakReference(context0);
        E.g().a(this);
        this.g = s;
    }

    private BaseMediationAdapter a(i i0) {
        if(this.k == null) {
            this.k = new ConcurrentHashMap();
        }
        BaseMediationAdapter baseMediationAdapter0 = (BaseMediationAdapter)this.k.get(i0);
        if(baseMediationAdapter0 == null) {
            baseMediationAdapter0 = i0.e();
            if(baseMediationAdapter0 != null) {
                this.k.put(i0, baseMediationAdapter0);
            }
        }
        return baseMediationAdapter0;
    }

    private void a() {
        IInterstitialEventCallbackListener iInterstitialEventCallbackListener0 = this.a;
        if(iInterstitialEventCallbackListener0 != null) {
            iInterstitialEventCallbackListener0.OnInterstitialClicked();
        }
        IInterstitialShowEventCallbackListener iInterstitialShowEventCallbackListener0 = this.c;
        if(iInterstitialShowEventCallbackListener0 != null) {
            iInterstitialShowEventCallbackListener0.OnInterstitialClicked();
        }
    }

    private void a(int v) {
        this.j = false;
        this.e();
        IInterstitialEventCallbackListener iInterstitialEventCallbackListener0 = this.a;
        if(iInterstitialEventCallbackListener0 != null) {
            iInterstitialEventCallbackListener0.OnInterstitialClosed(v);
        }
        IInterstitialShowEventCallbackListener iInterstitialShowEventCallbackListener0 = this.c;
        if(iInterstitialShowEventCallbackListener0 != null) {
            iInterstitialShowEventCallbackListener0.OnInterstitialClosed(v);
        }
    }

    private void a(d0 d00) {
        i i1;
        i i0;
        try {
            if(!y.c(d00)) {
                if(!y.a(d00)) {
                    this.b(d00.h());
                    return;
                }
                i0 = i.c;
                this.H = false;
                goto label_6;
            }
            goto label_25;
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            this.b(200);
            return;
        }
        try {
        label_6:
            String s = ((g)this.d.b().get(0)).k();
            if(s != null) {
                if(p.k(s) == k.c.b()) {
                    i0 = i.e;
                    this.H = true;
                }
                else if(p.k(s) == k.d.b()) {
                    i0 = i.r;
                    this.H = true;
                }
                else if(p.k(s) == k.g.b()) {
                    i0 = i.v;
                    this.H = true;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.a(i0);
            this.D = baseMediationAdapter0;
            baseMediationAdapter0.setCustomExtras(this.g());
            this.D.showInterstitial(((Context)this.e.get()), d00, this.H, this.i);
            this.D.setInterstitialMediationAdapterEventListener(this.J);
            return;
        label_25:
            y.a(d00, this.k);
            i1 = i.a(((a0)d00.e().a().get(this.i)).a());
            this.H = false;
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            this.b(200);
            return;
        }
        try {
            if(i1.b() == i.c.b() && y.a(this.d)) {
                String s1 = ((g)this.d.b().get(0)).k();
                if(s1 != null) {
                    if(p.k(s1) == k.c.b()) {
                        i1 = i.e;
                        this.H = true;
                    }
                    else if(p.k(s1) == k.d.b()) {
                        i1 = i.r;
                        this.H = true;
                    }
                    else if(p.k(s1) == k.g.b()) {
                        i1 = i.v;
                        this.H = true;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter1 = this.a(i1);
            this.D = baseMediationAdapter1;
            baseMediationAdapter1.setCustomExtras(this.g());
            this.D.showInterstitial(((Context)this.e.get()), d00, this.H, this.i);
            this.D.setInterstitialMediationAdapterEventListener(this.J);
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.b(200);
    }

    private void b() {
        this.h = false;
        this.j = true;
        IInterstitialEventCallbackListener iInterstitialEventCallbackListener0 = this.a;
        if(iInterstitialEventCallbackListener0 != null) {
            iInterstitialEventCallbackListener0.OnInterstitialLoaded();
        }
        IInterstitialLoadEventCallbackListener iInterstitialLoadEventCallbackListener0 = this.b;
        if(iInterstitialLoadEventCallbackListener0 != null) {
            iInterstitialLoadEventCallbackListener0.OnInterstitialLoaded();
        }
    }

    private void b(int v) {
        IInterstitialEventCallbackListener iInterstitialEventCallbackListener0 = this.a;
        if(iInterstitialEventCallbackListener0 != null) {
            iInterstitialEventCallbackListener0.OnInterstitialOpenFailed(new SSPErrorCode(v));
        }
        IInterstitialShowEventCallbackListener iInterstitialShowEventCallbackListener0 = this.c;
        if(iInterstitialShowEventCallbackListener0 != null) {
            iInterstitialShowEventCallbackListener0.OnInterstitialOpenFailed(new SSPErrorCode(v));
        }
    }

    private void c() {
        this.I = true;
        this.d();
        IInterstitialEventCallbackListener iInterstitialEventCallbackListener0 = this.a;
        if(iInterstitialEventCallbackListener0 != null) {
            iInterstitialEventCallbackListener0.OnInterstitialOpened();
        }
        IInterstitialShowEventCallbackListener iInterstitialShowEventCallbackListener0 = this.c;
        if(iInterstitialShowEventCallbackListener0 != null) {
            iInterstitialShowEventCallbackListener0.OnInterstitialOpened();
        }
    }

    private void c(int v) {
        this.h = false;
        this.j = false;
        IInterstitialEventCallbackListener iInterstitialEventCallbackListener0 = this.a;
        if(iInterstitialEventCallbackListener0 != null) {
            iInterstitialEventCallbackListener0.OnInterstitialReceiveFailed(new SSPErrorCode(v));
        }
        IInterstitialLoadEventCallbackListener iInterstitialLoadEventCallbackListener0 = this.b;
        if(iInterstitialLoadEventCallbackListener0 != null) {
            iInterstitialLoadEventCallbackListener0.OnInterstitialReceiveFailed(new SSPErrorCode(v));
        }
    }

    public void closeAPSSPInterstitialAd() {
        try {
            b.a(Thread.currentThread(), "closeAPSSPInterstitialAd");
            if(this.D != null && i.a(this.D.getNetworkName()) == i.c) {
                this.D.destroyInterstitial();
                this.D.setInterstitialMediationAdapterEventListener(null);
                this.D = null;
            }
            this.h = false;
        }
        catch(Exception unused_ex) {
        }
    }

    private void d() {
        try {
            if(this.d != null && !this.d.n()) {
                this.d.b(true);
                Object[] arr_object = {"", this.getCurrentNetwork(), this.f};
                E.g().d().a(((Context)this.e.get()).getApplicationContext(), com.igaworks.ssp.t.e.i, "" + String.format("&advertising_id=%s&ad_network_no=%d&placement_id=%s", arr_object));
                return;
            }
            b.a(Thread.currentThread(), "callMediationImpTracking null or already fired.");
        }
        catch(Exception unused_ex) {
        }
    }

    public void destroy() {
        synchronized(this) {
            try {
                b.c(Thread.currentThread(), "destroy : " + this.f);
                this.h = false;
                BaseMediationAdapter baseMediationAdapter0 = this.D;
                if(baseMediationAdapter0 != null) {
                    baseMediationAdapter0.destroyInterstitial();
                    this.D.setInterstitialMediationAdapterEventListener(null);
                    this.D = null;
                }
                if(this.d != null) {
                    this.d = null;
                }
                HashMap hashMap0 = this.C;
                if(hashMap0 != null) {
                    hashMap0.clear();
                }
                this.f();
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
            }
        }
    }

    private void e() {
        try {
            if(E.g().e(this.f)) {
                b.a(Thread.currentThread(), "claimPointBox : " + this.I);
                if(this.I) {
                    this.I = false;
                    JSONObject jSONObject0 = new JSONObject();
                    E.g().e();
                    jSONObject0.put("ad_request_no", "");
                    jSONObject0.put("advertising_id", "");
                    jSONObject0.put("impression_campaign_type", 13);
                    jSONObject0.put("media_key", "");
                    jSONObject0.put("placement_id", this.f);
                    jSONObject0.put("platform", "android");
                    jSONObject0.put("usn", "");
                    i0.a(((Context)this.e.get()), jSONObject0);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void f() {
        ConcurrentHashMap concurrentHashMap0 = this.k;
        if(concurrentHashMap0 != null) {
            concurrentHashMap0.clear();
            this.k = null;
        }
    }

    private HashMap g() {
        if(this.C == null) {
            this.C = new HashMap();
        }
        try {
            this.C.put("backgroundColor", this.q);
            this.C.put("hideCloseBtn", Boolean.valueOf(this.r));
            this.C.put("disableBackBtn", Boolean.valueOf(this.u));
            this.C.put("isEndingAd", Boolean.valueOf(this.l));
            this.C.put("endingText", this.m);
            this.C.put("endingTextSize", this.n);
            this.C.put("endingTextColor", this.o);
            this.C.put("endingTextGravity", this.p);
            this.C.put("enableAutoClose", Boolean.valueOf(this.s));
            this.C.put("enableSwipeClose", Boolean.valueOf(this.t));
            this.C.put("swipeMinDistanceDP", this.v);
            this.C.put("closeBtnGravity", this.w);
            this.C.put("closeBtnGravityFromEdge", Boolean.valueOf(this.x));
            this.C.put("closeBtnLeftMargin", this.y);
            this.C.put("closeBtnRightMargin", this.z);
            this.C.put("closeBtnTopMargin", this.A);
            this.C.put("closeBtnBottomMargin", this.B);
            this.C.put("contentsScale", this.E);
            this.C.put("backgroundAutoBg", Boolean.valueOf(this.F));
        }
        catch(Exception unused_ex) {
        }
        return this.C;
    }

    // 去混淆评级： 低(20)
    public String getAdRequestNo() [...] // 潜在的解密器

    public int getCurrentNetwork() {
        try {
            return this.D == null ? -1 : i.a(this.D.getNetworkName()).b();
        }
        catch(Exception unused_ex) {
        }
        return -1;
    }

    public String getPlacementId() {
        return this.f;
    }

    private void h() {
        class d implements Runnable {
            final AdPopcornSSPInterstitialAd a;

            @Override
            public void run() {
                try {
                    Object object0 = AdPopcornSSPInterstitialAd.this.e.get();
                    AdPopcornSSPInterstitialAd.this.D.loadInterstitial(((Context)object0), AdPopcornSSPInterstitialAd.this, AdPopcornSSPInterstitialAd.this.d, AdPopcornSSPInterstitialAd.this.H, AdPopcornSSPInterstitialAd.this.i);
                }
                catch(Exception unused_ex) {
                    AdPopcornSSPInterstitialAd.this.c(AdPopcornSSPInterstitialAd.this.d.h());
                }
            }
        }

        i i1;
        i i0;
        try {
            if(!y.c(this.d)) {
                if(!y.a(this.d)) {
                    this.c(this.d.h());
                    return;
                }
                i0 = i.c;
                this.H = false;
                goto label_6;
            }
            goto label_27;
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            this.c(200);
            return;
        }
        try {
        label_6:
            String s = ((g)this.d.b().get(0)).k();
            if(s != null) {
                if(p.k(s) == k.c.b()) {
                    i0 = i.e;
                    this.H = true;
                }
                else if(p.k(s) == k.d.b()) {
                    i0 = i.r;
                    this.H = true;
                }
                else if(p.k(s) == k.g.b()) {
                    i0 = i.v;
                    this.H = true;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.a(i0);
            this.D = baseMediationAdapter0;
            baseMediationAdapter0.setInterstitialMediationAdapterEventListener(this.J);
            IMediationLogListener iMediationLogListener0 = this.G;
            if(iMediationLogListener0 != null) {
                iMediationLogListener0.OnMediationLoadStart(this.f, i.a(this.D.getNetworkName()).b());
            }
            this.D.loadInterstitial(((Context)this.e.get()), this, this.d, this.H, this.i);
            return;
        label_27:
            y.a(this.d, this.k);
            this.i = 0;
            i1 = i.a(((a0)this.d.e().a().get(0)).a());
            this.H = false;
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            this.c(200);
            return;
        }
        try {
            if(i1.b() == i.c.b() && y.a(this.d)) {
                String s1 = ((g)this.d.b().get(0)).k();
                if(s1 != null) {
                    if(p.k(s1) == k.c.b()) {
                        i1 = i.e;
                        this.H = true;
                    }
                    else if(p.k(s1) == k.d.b()) {
                        i1 = i.r;
                        this.H = true;
                    }
                    else if(p.k(s1) == k.g.b()) {
                        i1 = i.v;
                        this.H = true;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter1 = this.a(i1);
            this.D = baseMediationAdapter1;
            baseMediationAdapter1.setInterstitialMediationAdapterEventListener(this.J);
            IMediationLogListener iMediationLogListener1 = this.G;
            if(iMediationLogListener1 != null) {
                iMediationLogListener1.OnMediationLoadStart(this.f, i.a(this.D.getNetworkName()).b());
            }
            if(Looper.myLooper() == Looper.getMainLooper()) {
                b.a(Thread.currentThread(), "loadAd Interstitial Main Thread : " + this.f);
                this.D.loadInterstitial(((Context)this.e.get()), this, this.d, this.H, this.i);
                return;
            }
            b.a(Thread.currentThread(), "loadAd Interstitial Another Thread : " + this.f);
            new Handler(Looper.getMainLooper()).post(new d(this));
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.c(200);
    }

    public boolean isLoaded() {
        return this.j;
    }

    public void loadAd() {
        class com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd.a extends z {
            final AdPopcornSSPInterstitialAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd.a.a implements Runnable {
                    final com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd.a a;

                    @Override
                    public void run() {
                        AdPopcornSSPInterstitialAd.this.h = false;
                        AdPopcornSSPInterstitialAd.this.loadAd();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd.a.a(this));
            }
        }


        class com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd.b implements M {
            final AdPopcornSSPInterstitialAd a;

            @Override  // com.igaworks.ssp.M
            public void onNetResponseListener(com.igaworks.ssp.t.e t$e0, String s, String s1, boolean z) {
                try {
                    if(z) {
                        AdPopcornSSPInterstitialAd.this.c(5000);
                        return;
                    }
                    if(s0.b(s)) {
                        AdPopcornSSPInterstitialAd.this.c(0x270F);
                        return;
                    }
                    d0 d00 = p.f(s);
                    if(d00 != null && d00.h() != 1) {
                        AdPopcornSSPInterstitialAd.this.c(d00.h());
                        return;
                    }
                    AdPopcornSSPInterstitialAd.this.d = d00;
                    if(AdPopcornSSPInterstitialAd.this.d != null && AdPopcornSSPInterstitialAd.this.d.d() != null) {
                        t0.a(((Context)AdPopcornSSPInterstitialAd.this.e.get()), AdPopcornSSPInterstitialAd.this.d.d());
                    }
                    AdPopcornSSPInterstitialAd.this.h();
                    return;
                }
                catch(Exception exception0) {
                }
                b.a(Thread.currentThread(), exception0);
                AdPopcornSSPInterstitialAd.this.c(200);
            }
        }

        JSONObject jSONObject0;
        synchronized(this) {
            try {
                if(E.g().f()) {
                    if(this.h) {
                        b.b(Thread.currentThread(), this.f + " : Interstitial In Progress!!");
                        return;
                    }
                    this.h = true;
                    this.j = false;
                    if(this.f == null || this.f.isEmpty()) {
                        this.c(2030);
                        return;
                    }
                    if(!E.g().m()) {
                        b.c(Thread.currentThread(), "Checking ADID...");
                        E.g().a(new com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd.a(this));
                        E e0 = E.g();
                        Objects.requireNonNull(e0);
                        new j(e0, ((Context)this.e.get()).getApplicationContext()).start();
                        return;
                    }
                    if(!e0.b(((Context)this.e.get()).getApplicationContext())) {
                        this.c(100001);
                        return;
                    }
                    b.c(Thread.currentThread(), "loadInterstitialAd : " + this.f);
                    List list0 = E.g().a(this.f);
                    if(list0 == null) {
                        jSONObject0 = null;
                    }
                    else {
                        jSONObject0 = new JSONObject();
                        k k0 = k.c;
                        if(list0.contains(k0.b())) {
                            i i0 = i.e;
                            if(y.a(i0, this.k)) {
                                jSONObject0.put(k0.b() + "", this.a(i0).getBiddingToken(((Context)this.e.get()).getApplicationContext()));
                            }
                        }
                        k k1 = k.d;
                        if(list0.contains(k1.b())) {
                            i i1 = i.r;
                            if(y.a(i1, this.k)) {
                                jSONObject0.put(k1.b() + "", this.a(i1).getBiddingToken(((Context)this.e.get()).getApplicationContext()));
                            }
                        }
                        k k2 = k.g;
                        if(list0.contains(k2.b())) {
                            i i2 = i.v;
                            if(y.a(i2, this.k)) {
                                jSONObject0.put(k2.b() + "", this.a(i2).getBiddingToken(((Context)this.e.get()).getApplicationContext()));
                            }
                        }
                        b.c(Thread.currentThread(), "load interstitialAd biddingTokenParameter : " + jSONObject0);
                    }
                    t t0 = E.g().d();
                    Context context0 = ((Context)this.e.get()).getApplicationContext();
                    String s = this.f;
                    String s1 = this.g;
                    com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd.b adPopcornSSPInterstitialAd$b0 = new com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd.b(this);
                    t0.a(context0, com.igaworks.ssp.t.e.h, s, s1, jSONObject0, adPopcornSSPInterstitialAd$b0);
                    return;
                }
                b.a(Thread.currentThread(), this.f + " : GDPR_CONSENT_UNAVAILABLE");
                this.c(5008);
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
                this.c(200);
            }
        }
    }

    public void onResume() {
        synchronized(this) {
            BaseMediationAdapter baseMediationAdapter0 = this.D;
            if(baseMediationAdapter0 != null) {
                try {
                    baseMediationAdapter0.resumeInterstitial();
                }
                catch(Exception unused_ex) {
                }
            }
        }
    }

    public void setCurrentActivity(Activity activity0) {
        WeakReference weakReference0 = this.e;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.e = new WeakReference(activity0);
    }

    public void setCustomExtras(HashMap hashMap0) {
        if(hashMap0 != null) {
            try {
                if(hashMap0.containsKey("backgroundColor")) {
                    this.q = (int)(((Integer)hashMap0.get("backgroundColor")));
                }
                if(hashMap0.containsKey("hideCloseBtn")) {
                    this.r = ((Boolean)hashMap0.get("hideCloseBtn")).booleanValue();
                }
                if(hashMap0.containsKey("disableBackBtn")) {
                    this.u = ((Boolean)hashMap0.get("disableBackBtn")).booleanValue();
                }
                if(hashMap0.containsKey("isEndingAd")) {
                    this.l = ((Boolean)hashMap0.get("isEndingAd")).booleanValue();
                }
                if(hashMap0.containsKey("endingText")) {
                    this.m = (String)hashMap0.get("endingText");
                }
                if(hashMap0.containsKey("endingTextSize")) {
                    this.n = (int)(((Integer)hashMap0.get("endingTextSize")));
                }
                if(hashMap0.containsKey("endingTextColor")) {
                    this.o = (int)(((Integer)hashMap0.get("endingTextColor")));
                }
                if(hashMap0.containsKey("endingTextGravity")) {
                    this.p = (int)(((Integer)hashMap0.get("endingTextGravity")));
                }
                if(hashMap0.containsKey("enableAutoClose")) {
                    this.s = ((Boolean)hashMap0.get("enableAutoClose")).booleanValue();
                }
                if(hashMap0.containsKey("enableSwipeClose")) {
                    this.t = ((Boolean)hashMap0.get("enableSwipeClose")).booleanValue();
                }
                if(hashMap0.containsKey("swipeMinDistanceDP")) {
                    this.v = (int)(((Integer)hashMap0.get("swipeMinDistanceDP")));
                }
                if(hashMap0.containsKey("closeBtnGravity")) {
                    this.w = (int)(((Integer)hashMap0.get("closeBtnGravity")));
                }
                if(hashMap0.containsKey("closeBtnGravityFromEdge")) {
                    this.x = ((Boolean)hashMap0.get("closeBtnGravityFromEdge")).booleanValue();
                }
                if(hashMap0.containsKey("closeBtnLeftMargin")) {
                    this.y = (int)(((Integer)hashMap0.get("closeBtnLeftMargin")));
                }
                if(hashMap0.containsKey("closeBtnRightMargin")) {
                    this.z = (int)(((Integer)hashMap0.get("closeBtnRightMargin")));
                }
                if(hashMap0.containsKey("closeBtnTopMargin")) {
                    this.A = (int)(((Integer)hashMap0.get("closeBtnTopMargin")));
                }
                if(hashMap0.containsKey("closeBtnBottomMargin")) {
                    this.B = (int)(((Integer)hashMap0.get("closeBtnBottomMargin")));
                }
                if(hashMap0.containsKey("contentsScale")) {
                    this.E = (int)(((Integer)hashMap0.get("contentsScale")));
                }
                if(hashMap0.containsKey("backgroundAutoBg")) {
                    this.F = ((Boolean)hashMap0.get("backgroundAutoBg")).booleanValue();
                    return;
                }
                return;
            }
            catch(Exception exception0) {
            }
            exception0.printStackTrace();
        }
    }

    @Deprecated
    public void setEndingMessage(String s) {
        this.m = s;
    }

    public void setInterstitialEventCallbackListener(IInterstitialEventCallbackListener iInterstitialEventCallbackListener0) {
        this.a = iInterstitialEventCallbackListener0;
    }

    public void setInterstitialLoadEventCallbackListener(IInterstitialLoadEventCallbackListener iInterstitialLoadEventCallbackListener0) {
        this.b = iInterstitialLoadEventCallbackListener0;
    }

    public void setInterstitialShowEventCallbackListener(IInterstitialShowEventCallbackListener iInterstitialShowEventCallbackListener0) {
        this.c = iInterstitialShowEventCallbackListener0;
    }

    @Deprecated
    public void setIsEndingInterstitial(boolean z) {
        this.l = z;
    }

    public void setMediationLogListener(IMediationLogListener iMediationLogListener0) {
        this.G = iMediationLogListener0;
    }

    public void setPlacementAppKey(String s) {
        this.g = s;
    }

    public void setPlacementId(String s) {
        this.f = s;
    }

    public void showAd() {
        class c implements Runnable {
            final AdPopcornSSPInterstitialAd a;

            @Override
            public void run() {
                try {
                    d0 d00 = new d0(AdPopcornSSPInterstitialAd.this.d);
                    AdPopcornSSPInterstitialAd.this.a(d00);
                    AdPopcornSSPInterstitialAd.this.j = false;
                }
                catch(Exception exception0) {
                    b.a(Thread.currentThread(), exception0);
                    AdPopcornSSPInterstitialAd.this.b(200);
                }
            }
        }

        synchronized(this) {
            try {
                if(this.h) {
                    b.b(Thread.currentThread(), "Interstitial In Progress!!");
                }
                else {
                    if(this.d == null || !this.j) {
                        b.c(Thread.currentThread(), "showAd : NO_INTERSTITIAL_LOADED");
                        this.b(5003);
                        return;
                    }
                    if(!e0.b(((Context)this.e.get()).getApplicationContext())) {
                        this.b(100001);
                        return;
                    }
                    if(Looper.myLooper() == Looper.getMainLooper()) {
                        b.a(Thread.currentThread(), "showAd Interstitial Main Thread : " + this.f);
                        this.a(new d0(this.d));
                        this.j = false;
                    }
                    else {
                        b.a(Thread.currentThread(), "showAd Interstitial Another Thread : " + this.f);
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

