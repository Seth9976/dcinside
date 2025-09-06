package com.igaworks.ssp.common.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils.TruncateAt;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.igaworks.ssp.A0;
import com.igaworks.ssp.A;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.B0;
import com.igaworks.ssp.C0;
import com.igaworks.ssp.C;
import com.igaworks.ssp.D0;
import com.igaworks.ssp.E0;
import com.igaworks.ssp.E;
import com.igaworks.ssp.G;
import com.igaworks.ssp.J;
import com.igaworks.ssp.O;
import com.igaworks.ssp.Q;
import com.igaworks.ssp.S;
import com.igaworks.ssp.SdkInitListener;
import com.igaworks.ssp.T;
import com.igaworks.ssp.U;
import com.igaworks.ssp.V;
import com.igaworks.ssp.X;
import com.igaworks.ssp.a;
import com.igaworks.ssp.b0;
import com.igaworks.ssp.b;
import com.igaworks.ssp.c0;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.e.o;
import com.igaworks.ssp.e;
import com.igaworks.ssp.g0;
import com.igaworks.ssp.g;
import com.igaworks.ssp.i;
import com.igaworks.ssp.l0;
import com.igaworks.ssp.m0;
import com.igaworks.ssp.n.d;
import com.igaworks.ssp.n;
import com.igaworks.ssp.o0;
import com.igaworks.ssp.p0;
import com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd;
import com.igaworks.ssp.part.custom.AdPopcornSSPReactNativeAd;
import com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd;
import com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity;
import com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd;
import com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd;
import com.igaworks.ssp.part.nativead.AdPopcornSSPNativeAd;
import com.igaworks.ssp.part.nativead.view.AdPopcornSSPNativeAdTemplate;
import com.igaworks.ssp.part.splash.AdPopcornSSPSplashAd;
import com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd;
import com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd;
import com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity;
import com.igaworks.ssp.r0;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.w0;
import com.igaworks.ssp.x0;
import com.igaworks.ssp.y0;
import com.igaworks.ssp.y;
import java.util.HashMap;
import java.util.List;

public class AdPopcornSSPAdapter implements BaseMediationAdapter, VideoMixAdMediationAdapter {
    public class CLASSIC_AD_TYPE {
    }

    class processingVastXMLThread extends Thread {
        private String a;
        private int b;
        final AdPopcornSSPAdapter c;

        public processingVastXMLThread(String s, int v) {
            this.a = s;
            this.b = v;
        }

        @Override
        public void run() {
            try {
                boolean z = AdPopcornSSPAdapter.this.a(this.a, this.b);
                b.c(Thread.currentThread(), "AdPopcornSSPAdapter adType : " + this.b + ", processingVastXMLThread : " + z);
                if(z) {
                    if(AdPopcornSSPAdapter.this.P != null && AdPopcornSSPAdapter.this.P.q() != null) {
                        String s = AdPopcornSSPAdapter.this.P.q().b();
                        if(s != null && s.contentEquals("progressive")) {
                            b.c(Thread.currentThread(), "AdPopcornSSPAdapter media delivery type progressive");
                            com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.processingVastXMLThread.1 adPopcornSSPAdapter$processingVastXMLThread$10 = new d() {
                                final processingVastXMLThread a;

                                @Override  // com.igaworks.ssp.n$d
                                public void a(Bitmap bitmap0) {
                                    b.c(Thread.currentThread(), "AdPopcornSSPAdapter preVideoDownload success");
                                    int v = processingVastXMLThread.this.b;
                                    AdPopcornSSPAdapter.this.c(v);
                                }
                            };
                            n.a(AdPopcornSSPAdapter.this.w, AdPopcornSSPAdapter.this.P.q().d(), adPopcornSSPAdapter$processingVastXMLThread$10);
                            return;
                        }
                        b.c(Thread.currentThread(), "AdPopcornSSPAdapter media delivery type streaming not support");
                        AdPopcornSSPAdapter.this.b(this.b);
                        return;
                    }
                    AdPopcornSSPAdapter.this.b(this.b);
                    return;
                }
                AdPopcornSSPAdapter.this.b(this.b);
            }
            catch(Exception unused_ex) {
                AdPopcornSSPAdapter.this.b(this.b);
            }
        }
    }

    private o0 A;
    private o0 B;
    private o0 C;
    private o0 D;
    private TextView E;
    private TextView F;
    private TextView G;
    private boolean H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private B0 P;
    private int Q;
    private String R;
    private String S;
    private String T;
    private String U;
    private int V;
    private boolean W;
    private GradientDrawable X;
    private GradientDrawable Y;
    private Handler Z;
    private C a;
    private Runnable a0;
    private T b;
    private int b0;
    private l0 c;
    private int c0;
    private V d;
    private int d0;
    private c0 e;
    private int e0;
    private r0 f;
    private String f0;
    private g0 g;
    ViewTreeObserver.OnGlobalLayoutListener g0;
    private b0 h;
    ViewTreeObserver.OnScrollChangedListener h0;
    private E0 i;
    private static int i0 = 5;
    private boolean j;
    private e k;
    private HashMap l;
    private AdPopcornSSPNativeAd m;
    private AdPopcornSSPSplashAd n;
    private AdPopcornSSPReactNativeAd o;
    private View p;
    private AdPopcornSSPNativeAdTemplate q;
    private g r;
    private g s;
    private g t;
    private boolean u;
    private boolean v;
    private Context w;
    private ImageView x;
    private ImageView y;
    private ImageView z;

    static {
    }

    public AdPopcornSSPAdapter() {
        this.j = true;
        this.u = false;
        this.v = false;
        this.H = false;
        this.I = 1;
        this.J = 15;
        this.K = 15;
        this.L = 2;
        this.M = 2;
        this.Q = 0;
        this.R = "";
        this.S = "";
        this.T = "";
        this.U = "";
        this.V = 0;
        this.W = false;
        this.Z = new Handler(Looper.getMainLooper());
        this.e0 = 0;
        this.f0 = "";
        this.g0 = new ViewTreeObserver.OnGlobalLayoutListener() {
            final AdPopcornSSPAdapter a;

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    if(!AdPopcornSSPAdapter.this.u) {
                        AdPopcornSSPAdapter.this.a();
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        };
        this.h0 = new ViewTreeObserver.OnScrollChangedListener() {
            final AdPopcornSSPAdapter a;

            @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
            public void onScrollChanged() {
                try {
                    if(!AdPopcornSSPAdapter.this.u) {
                        AdPopcornSSPAdapter.this.a();
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        };
    }

    static g D(AdPopcornSSPAdapter adPopcornSSPAdapter0) {
        return adPopcornSSPAdapter0.r;
    }

    private String a(C0 c00) {
        try {
            int v = this.Q + 1;
            this.Q = v;
            if(v > AdPopcornSSPAdapter.i0) {
                this.a(302);
                return null;
            }
            String s = c00.e();
            if(s == null) {
                this.a(303);
                return null;
            }
            return A0.a(s);
        }
        catch(Exception unused_ex) {
            this.a(300);
            return null;
        }
    }

    private void a() {
        try {
            AdPopcornSSPNativeAd adPopcornSSPNativeAd0 = this.m;
            if(adPopcornSSPNativeAd0 == null) {
                AdPopcornSSPSplashAd adPopcornSSPSplashAd0 = this.n;
                if(adPopcornSSPSplashAd0 != null) {
                    if(this.isViewFullyVisible(adPopcornSSPSplashAd0)) {
                        b.c(Thread.currentThread(), "checkImpression splashAd isViewFullyVisible");
                        this.c(this.w);
                    }
                }
                else if(this.o != null && this.isViewFullyVisible(this.o)) {
                    b.c(Thread.currentThread(), "checkImpression reactNativeAd isViewFullyVisible");
                    this.b(this.w);
                }
            }
            else if(this.isViewFullyVisible(adPopcornSSPNativeAd0)) {
                b.c(Thread.currentThread(), "checkImpression nativeAd isViewFullyVisible");
                this.a(this.w);
            }
        }
        catch(Exception unused_ex) {
            if(this.m != null) {
                this.a(this.w);
                return;
            }
            if(this.n != null) {
                this.c(this.w);
                return;
            }
            if(this.o != null) {
                this.b(this.w);
            }
        }
    }

    private void a(int v) {
        try {
            if(this.P != null && this.P.k() != null) {
                for(int v1 = 0; v1 < this.P.k().size(); ++v1) {
                    String s = A0.a(((String)this.P.k().get(v1)), v);
                    E.g().d().a(this.w, com.igaworks.ssp.t.e.s, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(Context context0) {
        try {
            this.u = true;
            for(int v = 0; v < this.r.j().size(); ++v) {
                String s = (String)this.r.j().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("<Impression in nativeAd url : %s>", s));
                    E.g().d().a(context0, com.igaworks.ssp.t.e.i, s);
                }
            }
            this.m.getViewTreeObserver().removeOnGlobalLayoutListener(this.g0);
            this.m.getViewTreeObserver().removeOnScrollChangedListener(this.h0);
            c0 c00 = this.e;
            if(c00 != null) {
                c00.onImpression();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private boolean a(String s, int v) {
        long v2;
        D0 d00 = new D0();
        d00.a(s);
        b.c(Thread.currentThread(), "AdPopcornSSPAdapter redirect count : " + this.Q);
        b.c(Thread.currentThread(), "AdPopcornSSPAdapter processingVastXMLData : " + s);
        if(d00.d()) {
            d00.e();
            if(d00.c() != null) {
                b.b(Thread.currentThread(), "AdPopcornSSPAdapter processing Wrapper");
                C0 c00 = d00.c();
                this.P.h(c00.c());
                this.P.g(c00.b());
                String s1 = this.a(c00);
                if(s1 != null && this.a(s1, v)) {
                    b.c(Thread.currentThread(), "AdPopcornSSPAdapter processingVastXMLData true");
                    try {
                        y0 y00 = c00.d();
                        if(y00 != null) {
                            this.P = y00.a(this.P);
                            List list0 = y00.g();
                            List list1 = y00.h();
                            this.P.b(list0);
                            this.P.b(list1);
                            if(this.P.l() == null) {
                                O o0 = y00.c();
                                if(o0 != null) {
                                    this.P.a(o0);
                                    this.P.b(o0.a());
                                    this.P.m(o0.b());
                                    this.P.n(o0.e());
                                }
                            }
                            w0 w00 = c00.a();
                            if(w00 != null && this.P.d() == null) {
                                G g0 = w00.a(this.w);
                                if(g0 != null) {
                                    this.P.a(g0);
                                    this.P.e(w00.a("creativeView"));
                                    this.P.d(g0.b());
                                    this.P.a(g0.a());
                                }
                            }
                        }
                    }
                    catch(Exception unused_ex) {
                    }
                    return true;
                }
                return false;
            }
            if(d00.b() != null) {
                b.b(Thread.currentThread(), "AdPopcornSSPAdapter processing InLine");
                x0 x00 = d00.b();
                this.P.h(x00.c());
                this.P.g(x00.b());
                y0 y01 = x00.d();
                if(y01 != null) {
                    this.P = y01.a(this.P);
                    String s2 = y01.f();
                    List list2 = y01.g();
                    List list3 = y01.h();
                    this.P.c(s2);
                    this.P.b(list2);
                    this.P.b(list3);
                    if(this.P.l() == null) {
                        O o1 = y01.c();
                        if(o1 != null) {
                            this.P.a(o1);
                            this.P.b(o1.a());
                            this.P.m(o1.b());
                            this.P.n(o1.e());
                        }
                    }
                    long v1 = A0.e(y01.b());
                    if(v1 <= 0L) {
                        return false;
                    }
                    this.P.a(v1);
                    b.c(Thread.currentThread(), "AdPopcornSSPAdapter duration : " + v1);
                    X x0 = y01.a(this.w);
                    if(x0 == null) {
                        return false;
                    }
                    b.c(Thread.currentThread(), "AdPopcornSSPAdapter media URL : " + x0.d());
                    this.P.a(x0);
                    String s3 = y01.e();
                    if(s3 != null) {
                        if(A0.b(s3)) {
                            v2 = (long)(((float)v1) * A0.d(s3));
                        }
                        else {
                            if(!A0.c(s3)) {
                                this.a(100);
                                return false;
                            }
                            v2 = A0.e(s3);
                        }
                        if(v2 > 0L) {
                            this.P.b(v2);
                            this.P.c(true);
                        }
                    }
                    w0 w01 = x00.a();
                    if(w01 != null && this.P.d() == null) {
                        G g1 = w01.a(this.w);
                        if(g1 != null) {
                            this.P.a(g1);
                            this.P.e(w01.a("creativeView"));
                            this.P.d(g1.b());
                            this.P.a(g1.a());
                        }
                    }
                    return true;
                }
                String s4 = d00.a();
                if(s0.a(s4)) {
                    String s5 = A0.a(s4, 100);
                    E.g().d().a(this.w, com.igaworks.ssp.t.e.s, s5);
                }
                this.b(v);
                return false;
            }
            String s6 = d00.a();
            if(s0.a(s6)) {
                String s7 = A0.a(s6, 100);
                E.g().d().a(this.w, com.igaworks.ssp.t.e.s, s7);
            }
            this.b(v);
            return false;
        }
        String s8 = d00.a();
        if(s0.a(s8)) {
            String s9 = A0.a(s8, 303);
            E.g().d().a(this.w, com.igaworks.ssp.t.e.s, s9);
        }
        this.b(v);
        return false;
    }

    private void b(int v) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            final AdPopcornSSPAdapter b;

            @Override
            public void run() {
                int v = v;
                if(v != 2) {
                    switch(v) {
                        case 1: {
                            if(AdPopcornSSPAdapter.this.d != null) {
                                AdPopcornSSPAdapter.this.d.d(AdPopcornSSPAdapter.this.O);
                                return;
                            }
                            break;
                        }
                        case 3: {
                            if(AdPopcornSSPAdapter.this.i != null) {
                                AdPopcornSSPAdapter.this.i.d(AdPopcornSSPAdapter.this.e0);
                            }
                            break;
                        }
                    }
                }
                else if(AdPopcornSSPAdapter.this.c != null) {
                    AdPopcornSSPAdapter.this.c.d(AdPopcornSSPAdapter.this.N);
                }
            }
        });
    }

    private void b(Context context0) {
        try {
            this.u = true;
            for(int v = 0; v < this.t.j().size(); ++v) {
                String s = (String)this.t.j().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("<Impression in reactNativeAd url : %s>", s));
                    E.g().d().a(context0, com.igaworks.ssp.t.e.i, s);
                }
            }
            this.o.getViewTreeObserver().removeOnGlobalLayoutListener(this.g0);
            this.o.getViewTreeObserver().removeOnScrollChangedListener(this.h0);
            g0 g00 = this.g;
            if(g00 != null) {
                g00.onImpression();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private boolean b() {
        try {
            if(this.r.G() && this.E == null) {
                b.a(Thread.currentThread(), "checkRequiredAssets adTitleView Null");
                return false;
            }
            if(this.r.C() && this.F == null) {
                b.a(Thread.currentThread(), "checkRequiredAssets adDescView Null");
                return false;
            }
            if(this.r.E() && this.y == null) {
                b.a(Thread.currentThread(), "checkRequiredAssets iconImageView Null");
                return false;
            }
            if(this.r.F() && this.z == null) {
                b.a(Thread.currentThread(), "checkRequiredAssets mainImageView Null");
                return false;
            }
            if(this.r.B() && this.G == null) {
                b.a(Thread.currentThread(), "checkRequiredAssets ctaTextView Null");
                return false;
            }
            return true;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        return false;
    }

    private void c() {
        this.u = false;
        AdPopcornSSPNativeAd adPopcornSSPNativeAd0 = this.m;
        if(adPopcornSSPNativeAd0 != null) {
            if(adPopcornSSPNativeAd0.getAdPopcornSSPViewBinder().nativeAdViewId != 0) {
                this.p = this.m.findViewById(this.m.getAdPopcornSSPViewBinder().nativeAdViewId);
            }
            if(this.m.getAdPopcornSSPViewBinder().iconImageId != 0) {
                this.y = (ImageView)this.m.findViewById(this.m.getAdPopcornSSPViewBinder().iconImageId);
            }
            if(this.m.getAdPopcornSSPViewBinder().mainImageId != 0) {
                this.z = (ImageView)this.m.findViewById(this.m.getAdPopcornSSPViewBinder().mainImageId);
            }
            if(this.m.getAdPopcornSSPViewBinder().titleId != 0) {
                this.E = (TextView)this.m.findViewById(this.m.getAdPopcornSSPViewBinder().titleId);
            }
            if(this.m.getAdPopcornSSPViewBinder().descId != 0) {
                this.F = (TextView)this.m.findViewById(this.m.getAdPopcornSSPViewBinder().descId);
            }
            if(this.m.getAdPopcornSSPViewBinder().callToActionId != 0) {
                this.G = (TextView)this.m.findViewById(this.m.getAdPopcornSSPViewBinder().callToActionId);
            }
            this.H = this.m.getAdPopcornSSPViewBinder().privacyIconVisibility;
            if(this.m.getAdPopcornSSPViewBinder().privacyIconPosition != 1) {
                this.I = this.m.getAdPopcornSSPViewBinder().privacyIconPosition;
            }
            if(this.m.getAdPopcornSSPViewBinder().privacyIconWidth > 0) {
                this.J = this.m.getAdPopcornSSPViewBinder().privacyIconWidth;
            }
            if(this.m.getAdPopcornSSPViewBinder().privacyIconHeight > 0) {
                this.K = this.m.getAdPopcornSSPViewBinder().privacyIconHeight;
            }
            if(this.m.getAdPopcornSSPViewBinder().privacyIconLRMargin > 0) {
                this.L = this.m.getAdPopcornSSPViewBinder().privacyIconLRMargin;
            }
            if(this.m.getAdPopcornSSPViewBinder().privacyIconTBMargin > 0) {
                this.M = this.m.getAdPopcornSSPViewBinder().privacyIconTBMargin;
            }
            b.a(Thread.currentThread(), "privacyIconVisibility : " + this.H + ", position : " + this.I + ", width: " + this.J + ", height : " + this.K + ", lrMargin: " + this.L + ", tbMargin : " + this.M);
            this.p.setOnClickListener(new View.OnClickListener() {
                final AdPopcornSSPAdapter a;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    try {
                        AdPopcornSSPAdapter.this.d();
                    }
                    catch(Exception exception0) {
                        exception0.printStackTrace();
                    }
                }
            });
            if(this.A == null) {
                o0 o00 = new o0(this.w, ((float)J.a(this.w, this.m.getAdPopcornSSPViewBinder().privacyIconCornerRadius)));
                this.A = o00;
                this.m.addView(o00);
            }
            this.m.setPI(this.A);
        }
    }

    private void c(int v) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            final AdPopcornSSPAdapter b;

            @Override
            public void run() {
                int v = v;
                if(v == 2) {
                    if(s0.a(AdPopcornSSPAdapter.this.T)) {
                        b.c(Thread.currentThread(), "Call RewardVideo Win notice : " + AdPopcornSSPAdapter.this.T);
                        E.g().d().a(AdPopcornSSPAdapter.this.w, com.igaworks.ssp.t.e.u, AdPopcornSSPAdapter.this.T);
                    }
                    if(AdPopcornSSPAdapter.this.c != null) {
                        AdPopcornSSPAdapter.this.c.b(AdPopcornSSPAdapter.this.N);
                    }
                }
                else {
                    switch(v) {
                        case 1: {
                            if(s0.a(AdPopcornSSPAdapter.this.S)) {
                                b.c(Thread.currentThread(), "Call InterstitialVideo Win notice : " + AdPopcornSSPAdapter.this.S);
                                E.g().d().a(AdPopcornSSPAdapter.this.w, com.igaworks.ssp.t.e.u, AdPopcornSSPAdapter.this.S);
                            }
                            if(AdPopcornSSPAdapter.this.d != null) {
                                AdPopcornSSPAdapter.this.d.b(AdPopcornSSPAdapter.this.O);
                                return;
                            }
                            break;
                        }
                        case 3: {
                            if(s0.a(AdPopcornSSPAdapter.this.f0)) {
                                b.c(Thread.currentThread(), "Call AdvancedInterstitial Win notice : " + AdPopcornSSPAdapter.this.f0);
                                E.g().d().a(AdPopcornSSPAdapter.this.w, com.igaworks.ssp.t.e.u, AdPopcornSSPAdapter.this.f0);
                            }
                            if(AdPopcornSSPAdapter.this.i != null) {
                                AdPopcornSSPAdapter.this.i.b(AdPopcornSSPAdapter.this.e0);
                            }
                            break;
                        }
                    }
                }
            }
        });
    }

    private void c(Context context0) {
        try {
            this.u = true;
            for(int v = 0; v < this.s.j().size(); ++v) {
                String s = (String)this.s.j().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("<Impression in splashAd url : %s>", s));
                    E.g().d().a(context0, com.igaworks.ssp.t.e.i, s);
                }
            }
            this.n.getViewTreeObserver().removeOnGlobalLayoutListener(this.g0);
            this.n.getViewTreeObserver().removeOnScrollChangedListener(this.h0);
            r0 r00 = this.f;
            if(r00 != null) {
                r00.onImpression();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
        try {
            if(!this.u) {
                this.a();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void checkAdPopcornSSPReactNativeImpression() {
        try {
            if(!this.u) {
                this.a();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void checkValidMediation() {
    }

    static c0 d(AdPopcornSSPAdapter adPopcornSSPAdapter0) {
        return adPopcornSSPAdapter0.e;
    }

    private void d() {
        try {
            for(int v = 0; v < this.r.b().size(); ++v) {
                String s = (String)this.r.b().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("Click Report URL Called in nativeAd : %s ", s));
                    E.g().d().a(this.w, com.igaworks.ssp.t.e.j, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void d(int v) {
        int v19;
        int v18;
        int v10;
        int v9;
        FrameLayout.LayoutParams frameLayout$LayoutParams0;
        this.u = false;
        GradientDrawable.Orientation gradientDrawable$Orientation0 = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable0 = new GradientDrawable(gradientDrawable$Orientation0, new int[]{0xFF008BFA, 0xFF008BFA});
        this.X = gradientDrawable0;
        gradientDrawable0.setShape(0);
        this.X.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)J.a(this.w, 2)), ((float)J.a(this.w, 2)), ((float)J.a(this.w, 2)), ((float)J.a(this.w, 2))});
        this.X.setGradientType(0);
        GradientDrawable gradientDrawable1 = new GradientDrawable(gradientDrawable$Orientation0, new int[]{0xFF008BFA, 0xFF008BFA});
        this.Y = gradientDrawable1;
        gradientDrawable1.setShape(0);
        this.Y.setCornerRadius(((float)J.a(this.w, 2)));
        this.Y.setGradientType(0);
        AdPopcornSSPNativeAd adPopcornSSPNativeAd0 = this.m;
        if(adPopcornSSPNativeAd0 != null) {
            if(adPopcornSSPNativeAd0.getAdPopcornSSPViewBinder().nativeAdViewId != 0) {
                this.q = (AdPopcornSSPNativeAdTemplate)this.m.findViewById(this.m.getAdPopcornSSPViewBinder().nativeAdViewId);
            }
            AdPopcornSSPNativeAdTemplate adPopcornSSPNativeAdTemplate0 = this.q;
            if(adPopcornSSPNativeAdTemplate0 != null) {
                adPopcornSSPNativeAdTemplate0.removeAllViews();
            }
            int v1 = this.m.getWidth();
            if(v == 14 || v == 15) {
                if(v1 > J.a(this.w, 320)) {
                    v1 = J.a(this.w, 320);
                }
                frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v1, J.a(this.w, 280));
            }
            else if(v == 16) {
                if(v1 > J.a(this.w, 320)) {
                    v1 = J.a(this.w, 320);
                }
                frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v1, J.a(this.w, 80));
            }
            else {
                if(v1 > J.a(this.w, 360)) {
                    v1 = J.a(this.w, 360);
                }
                if(v == 17) {
                    frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v1, J.a(this.w, 50));
                }
                else if(v == 18) {
                    frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v1, J.a(this.w, 80));
                }
                else if(v == 19) {
                    frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v1, J.a(this.w, 100));
                }
                else if(v == 20) {
                    frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v1, J.a(this.w, 150));
                }
                else {
                    frameLayout$LayoutParams0 = null;
                }
            }
            int v2 = J.a(this.w, 320);
            int v3 = J.a(this.w, 0xA7);
            int v4 = J.a(this.w, 46);
            int v5 = v1 - J.a(this.w, 72) - J.a(this.w, 72);
            int v6 = v1 - J.a(this.w, 72) - J.a(this.w, 72);
            int v7 = J.a(this.w, 320);
            int v8 = J.a(this.w, 34);
            switch(v) {
                case 15: {
                    v5 = v1 - J.a(this.w, 16) - J.a(this.w, 0x73);
                    v6 = v1 - J.a(this.w, 16) - J.a(this.w, 0x73);
                    v7 = J.a(this.w, 89);
                    v8 = J.a(this.w, 34);
                    v9 = v2;
                    v10 = v3;
                    break;
                }
                case 16: {
                    v5 = v1 - J.a(this.w, 16) - J.a(this.w, 0x84);
                    v6 = v1 - J.a(this.w, 16) - J.a(this.w, 0x84);
                    v9 = J.a(this.w, 100);
                    v10 = J.a(this.w, 52);
                    break;
                }
                case 17: {
                    v4 = J.a(this.w, 34);
                    v6 = v1 - J.a(this.w, 62) - J.a(this.w, 16);
                    v9 = v2;
                    v10 = v3;
                    break;
                }
                case 18: {
                    v5 = v1 - J.a(this.w, 0x83) - J.a(this.w, 12);
                    v6 = v1 - J.a(this.w, 0x83) - J.a(this.w, 12);
                    v9 = J.a(this.w, 107);
                    v10 = J.a(this.w, 56);
                    break;
                }
                case 19: {
                    v5 = v1 - J.a(this.w, 0xA7) - J.a(this.w, 12);
                    v6 = v1 - J.a(this.w, 0xA7) - J.a(this.w, 12);
                    v9 = J.a(this.w, 0x91);
                    v10 = J.a(this.w, 76);
                    break;
                }
                case 20: {
                    v5 = v1 - J.a(this.w, 0xA7) - J.a(this.w, 12);
                    v6 = v1 - J.a(this.w, 0xA7) - J.a(this.w, 12);
                    v9 = J.a(this.w, 0x91);
                    int v11 = J.a(this.w, 76);
                    int v12 = J.a(this.w, 0x150);
                    v8 = J.a(this.w, 36);
                    v10 = v11;
                    v7 = v12;
                    break;
                }
                default: {
                    v9 = v2;
                    v10 = v3;
                }
            }
            frameLayout$LayoutParams0.gravity = 1;
            this.q.setBackgroundColor(this.m.getAdPopcornSSPViewBinder().templateBackgroundColor);
            this.q.setLayoutParams(frameLayout$LayoutParams0);
            if(v == 14 || v == 16 || (v == 18 || v == 19) || (v == 15 || v == 20)) {
                if(this.C == null) {
                    this.C = new o0(this.w, ((float)J.a(this.w, this.m.getAdPopcornSSPViewBinder().templateMainImageCornerRadius)));
                }
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v9, v10);
                if(v == 14 || v == 15) {
                    relativeLayout$LayoutParams0.addRule(10);
                }
                else {
                    switch(v) {
                        case 16: {
                            relativeLayout$LayoutParams0.addRule(10);
                            relativeLayout$LayoutParams0.addRule(11);
                            relativeLayout$LayoutParams0.topMargin = J.a(this.w, 14);
                            relativeLayout$LayoutParams0.rightMargin = J.a(this.w, 14);
                            break;
                        }
                        case 18: {
                            relativeLayout$LayoutParams0.addRule(10);
                            relativeLayout$LayoutParams0.addRule(11);
                            relativeLayout$LayoutParams0.topMargin = J.a(this.w, 12);
                            relativeLayout$LayoutParams0.rightMargin = J.a(this.w, 12);
                            break;
                        }
                        case 19: {
                            relativeLayout$LayoutParams0.addRule(10);
                            relativeLayout$LayoutParams0.addRule(11);
                            relativeLayout$LayoutParams0.topMargin = J.a(this.w, 12);
                            relativeLayout$LayoutParams0.rightMargin = J.a(this.w, 12);
                            break;
                        }
                        case 20: {
                            relativeLayout$LayoutParams0.addRule(10);
                            relativeLayout$LayoutParams0.addRule(11);
                            relativeLayout$LayoutParams0.topMargin = J.a(this.w, 12);
                            relativeLayout$LayoutParams0.rightMargin = J.a(this.w, 12);
                        }
                    }
                }
                this.C.setLayoutParams(relativeLayout$LayoutParams0);
                this.C.setScaleType(ImageView.ScaleType.FIT_XY);
                this.q.addView(this.C);
                this.C.setVisibility(0);
            }
            else {
                o0 o00 = this.C;
                if(o00 != null) {
                    o00.setVisibility(8);
                }
            }
            if(v == 14 || v == 17) {
                if(this.B == null) {
                    this.B = new o0(this.w, ((float)J.a(this.w, this.m.getAdPopcornSSPViewBinder().templateIconImageCornerRadius)));
                }
                RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(v4, v4);
                if(v == 14) {
                    relativeLayout$LayoutParams1.leftMargin = J.a(this.w, 16);
                    relativeLayout$LayoutParams1.rightMargin = J.a(this.w, 10);
                    relativeLayout$LayoutParams1.topMargin = J.a(this.w, 0xB7);
                }
                else {
                    relativeLayout$LayoutParams1.leftMargin = J.a(this.w, 16);
                    relativeLayout$LayoutParams1.rightMargin = J.a(this.w, 12);
                    relativeLayout$LayoutParams1.topMargin = J.a(this.w, 8);
                }
                relativeLayout$LayoutParams1.addRule(9);
                relativeLayout$LayoutParams1.addRule(10);
                this.B.setLayoutParams(relativeLayout$LayoutParams1);
                this.B.setScaleType(ImageView.ScaleType.FIT_XY);
                this.q.addView(this.B);
                this.B.setVisibility(0);
            }
            else {
                o0 o01 = this.B;
                if(o01 != null) {
                    o01.setVisibility(8);
                }
            }
            try {
                int v13 = this.m.getAdPopcornSSPViewBinder().templatePrivacyIconPosition;
                int v14 = this.m.getAdPopcornSSPViewBinder().templatePrivacyIconLRMargin;
                int v15 = this.m.getAdPopcornSSPViewBinder().templatePrivacyIconTBMargin;
                o0 o02 = this.D;
                if(o02 != null) {
                    o02.setVisibility(8);
                }
            }
            catch(Exception exception0) {
                b.c(Thread.currentThread(), "privacy rendering error : " + exception0.toString());
            }
            if(v == 14 || (v == 15 || v == 16) || (v == 18 || v == 19 || v == 20)) {
                this.E = new TextView(this.w);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(v5, J.a(this.w, 21));
                relativeLayout$LayoutParams2.addRule(10);
                relativeLayout$LayoutParams2.addRule(9);
                switch(v) {
                    case 14: {
                        relativeLayout$LayoutParams2.topMargin = J.a(this.w, 0xBA);
                        relativeLayout$LayoutParams2.leftMargin = J.a(this.w, 72);
                        relativeLayout$LayoutParams2.rightMargin = J.a(this.w, 14);
                        break;
                    }
                    case 15: {
                        relativeLayout$LayoutParams2.topMargin = J.a(this.w, 204);
                        relativeLayout$LayoutParams2.leftMargin = J.a(this.w, 16);
                        relativeLayout$LayoutParams2.rightMargin = J.a(this.w, 10);
                        break;
                    }
                    case 16: {
                        relativeLayout$LayoutParams2.topMargin = J.a(this.w, 20);
                        relativeLayout$LayoutParams2.leftMargin = J.a(this.w, 14);
                        break;
                    }
                    case 18: {
                        relativeLayout$LayoutParams2.topMargin = J.a(this.w, 21);
                        relativeLayout$LayoutParams2.leftMargin = J.a(this.w, 12);
                        break;
                    }
                    case 19: {
                        relativeLayout$LayoutParams2.topMargin = J.a(this.w, 0x1F);
                        relativeLayout$LayoutParams2.leftMargin = J.a(this.w, 12);
                        break;
                    }
                    case 20: {
                        relativeLayout$LayoutParams2.topMargin = J.a(this.w, 0x1F);
                        relativeLayout$LayoutParams2.leftMargin = J.a(this.w, 12);
                    }
                }
                this.E.setSingleLine();
                this.E.setGravity(16);
                this.E.setLayoutParams(relativeLayout$LayoutParams2);
                s0.a(this.E, "", 14, Color.parseColor("#000000"), null, 0, 1, TextUtils.TruncateAt.END, true);
                this.q.addView(this.E);
                this.E.setVisibility(0);
            }
            else {
                TextView textView0 = this.E;
                if(textView0 != null) {
                    textView0.setVisibility(8);
                }
            }
            if(v == 14 || (v == 15 || v == 16) || (v == 17 || v == 18 || v == 19 || v == 20)) {
                int v16 = Color.parseColor("#363636");
                this.F = new TextView(this.w);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(v6, J.a(this.w, 18));
                relativeLayout$LayoutParams3.addRule(9);
                switch(v) {
                    case 14: {
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 0xD0);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 72);
                        relativeLayout$LayoutParams3.rightMargin = J.a(this.w, 14);
                        v18 = v16;
                        v19 = 12;
                        break;
                    }
                    case 15: {
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 0xE2);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 16);
                        relativeLayout$LayoutParams3.rightMargin = J.a(this.w, 10);
                        v18 = v16;
                        v19 = 12;
                        break;
                    }
                    case 16: {
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 42);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 14);
                        v18 = v16;
                        v19 = 12;
                        break;
                    }
                    case 17: {
                        int v17 = Color.parseColor("#121212");
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 15);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 62);
                        v18 = v17;
                        v19 = 14;
                        break;
                    }
                    case 18: {
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 43);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 12);
                        v18 = v16;
                        v19 = 12;
                        break;
                    }
                    case 19: {
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 53);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 12);
                        v18 = v16;
                        v19 = 12;
                        break;
                    }
                    case 20: {
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 53);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 12);
                        v18 = v16;
                        v19 = 12;
                        break;
                    }
                    default: {
                        v18 = v16;
                        v19 = 12;
                        break;
                    }
                }
                this.F.setLayoutParams(relativeLayout$LayoutParams3);
                this.F.setSingleLine();
                this.F.setGravity(16);
                s0.a(this.F, "", v19, v18, null, 0, 1, TextUtils.TruncateAt.END, false);
                this.q.addView(this.F);
                this.F.setVisibility(0);
            }
            else {
                TextView textView1 = this.F;
                if(textView1 != null) {
                    textView1.setVisibility(8);
                }
            }
            if(v == 14 || v == 15 || v == 20) {
                this.G = new TextView(this.w);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(v7, v8);
                if(v == 14) {
                    relativeLayout$LayoutParams4.addRule(10);
                    relativeLayout$LayoutParams4.addRule(9);
                    relativeLayout$LayoutParams4.topMargin = J.a(this.w, 0xF6);
                    this.G.setBackgroundDrawable(this.X);
                }
                else {
                    switch(v) {
                        case 15: {
                            relativeLayout$LayoutParams4.addRule(10);
                            relativeLayout$LayoutParams4.addRule(11);
                            relativeLayout$LayoutParams4.topMargin = J.a(this.w, 0xCF);
                            relativeLayout$LayoutParams4.rightMargin = J.a(this.w, 16);
                            this.G.setBackgroundDrawable(this.Y);
                            break;
                        }
                        case 20: {
                            relativeLayout$LayoutParams4.addRule(12);
                            relativeLayout$LayoutParams4.addRule(14);
                            relativeLayout$LayoutParams4.bottomMargin = J.a(this.w, 14);
                            this.G.setBackgroundDrawable(this.Y);
                        }
                    }
                }
                this.G.setSingleLine();
                this.G.setGravity(17);
                this.G.setLayoutParams(relativeLayout$LayoutParams4);
                s0.a(this.G, "", 12, Color.parseColor("#ffffff"), null, 0, 1, TextUtils.TruncateAt.END, false);
                this.q.addView(this.G);
                this.G.setVisibility(0);
            }
            else {
                TextView textView2 = this.G;
                if(textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
            this.q.setOnClickListener(new View.OnClickListener() {
                final AdPopcornSSPAdapter a;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    try {
                        AdPopcornSSPAdapter.this.d();
                    }
                    catch(Exception exception0) {
                        exception0.printStackTrace();
                    }
                }
            });
        }

        class com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.10 implements d {
            final AdPopcornSSPAdapter a;

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    AdPopcornSSPAdapter.this.D.setImageBitmap(bitmap0);
                }
            }
        }


        class com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.11 implements View.OnClickListener {
            final AdPopcornSSPAdapter a;

            // 去混淆评级： 中等(70)
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
            }
        }


        class com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.8 implements d {
            final AdPopcornSSPAdapter a;

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    AdPopcornSSPAdapter.this.C.setImageBitmap(bitmap0);
                }
            }
        }


        class com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.9 implements d {
            final AdPopcornSSPAdapter a;

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    AdPopcornSSPAdapter.this.B.setImageBitmap(bitmap0);
                }
            }
        }

    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void destroyAd() {
        this.Q = 0;
        if(this.P != null) {
            this.P = null;
        }
        try {
            m0.b().a(null);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            b.a(Thread.currentThread(), "AdPopcornSSPAdapter.destroyBannerAd");
            e e0 = this.k;
            if(e0 != null) {
                e0.f();
                this.k.removeAllViews();
                a.a(this.k);
                this.a = null;
                this.stopBannerTimer();
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitial() {
        try {
            S.c().a(null);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitialVideoAd() {
        this.Q = 0;
        if(this.P != null) {
            this.P = null;
        }
        try {
            S.c().a(null);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyModalAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyNativeAd() {
        try {
            this.u = false;
            this.m.getViewTreeObserver().removeOnGlobalLayoutListener(this.g0);
            this.m.getViewTreeObserver().removeOnScrollChangedListener(this.h0);
            o0 o00 = this.A;
            if(o00 != null) {
                o00.setVisibility(8);
            }
            o0 o01 = this.D;
            if(o01 != null) {
                o01.setVisibility(8);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyReactNativeAd() {
        try {
            this.u = false;
            this.o.getViewTreeObserver().removeOnGlobalLayoutListener(this.g0);
            this.o.getViewTreeObserver().removeOnScrollChangedListener(this.h0);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyRewardVideoAd() {
        this.Q = 0;
        if(this.P != null) {
            this.P = null;
        }
        try {
            m0.b().a(null);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroySplashAd() {
        try {
            this.u = false;
            this.n.getViewTreeObserver().removeOnGlobalLayoutListener(this.g0);
            this.n.getViewTreeObserver().removeOnScrollChangedListener(this.h0);
        }
        catch(Exception unused_ex) {
        }
    }

    // 去混淆评级： 低(20)
    private void e() {
        o0 o00 = this.A;
        if(o00 != null) {
            o00.setVisibility(8);
        }

        class com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.13 implements d {
            final AdPopcornSSPAdapter a;

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    AdPopcornSSPAdapter.this.A.setImageBitmap(bitmap0);
                    AdPopcornSSPAdapter.this.A.bringToFront();
                }
            }
        }

    }

    private void e(int v) {
        int v47;
        int v46;
        int v34;
        int v33;
        int v32;
        int v31;
        int v23;
        int v22;
        int v21;
        int v20;
        int v19;
        int v18;
        FrameLayout.LayoutParams frameLayout$LayoutParams0;
        int v1 = v == 0 ? 14 : v;
        this.u = false;
        GradientDrawable.Orientation gradientDrawable$Orientation0 = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable0 = new GradientDrawable(gradientDrawable$Orientation0, new int[]{0xFF008BFA, 0xFF008BFA});
        this.X = gradientDrawable0;
        gradientDrawable0.setShape(0);
        this.X.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)J.a(this.w, 2)), ((float)J.a(this.w, 2)), ((float)J.a(this.w, 2)), ((float)J.a(this.w, 2))});
        this.X.setGradientType(0);
        GradientDrawable gradientDrawable1 = new GradientDrawable(gradientDrawable$Orientation0, new int[]{0xFF008BFA, 0xFF008BFA});
        this.Y = gradientDrawable1;
        gradientDrawable1.setShape(0);
        this.Y.setCornerRadius(((float)J.a(this.w, 2)));
        this.Y.setGradientType(0);
        if(this.o != null) {
            AdPopcornSSPNativeAdTemplate adPopcornSSPNativeAdTemplate0 = this.q;
            if(adPopcornSSPNativeAdTemplate0 == null) {
                this.q = new AdPopcornSSPNativeAdTemplate(this.w);
            }
            else {
                adPopcornSSPNativeAdTemplate0.removeAllViews();
            }
            int v2 = this.o.getWidth();
            this.c0 = v2;
            if(v1 == 14 || v1 == 15) {
                if(v2 == 0 || v2 > J.a(this.w, 320)) {
                    this.c0 = J.a(this.w, 320);
                }
                this.d0 = J.a(this.w, 280);
                frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.c0, this.d0);
            }
            else if(v1 == 16) {
                if(v2 == 0 || v2 > J.a(this.w, 320)) {
                    this.c0 = J.a(this.w, 320);
                }
                this.d0 = J.a(this.w, 80);
                frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.c0, this.d0);
            }
            else {
                if(v2 == 0 || v2 > J.a(this.w, 360)) {
                    this.c0 = J.a(this.w, 360);
                }
                if(v1 == 17) {
                    this.d0 = J.a(this.w, 50);
                    frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.c0, this.d0);
                }
                else if(v1 == 18) {
                    this.d0 = J.a(this.w, 80);
                    frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.c0, this.d0);
                }
                else if(v1 == 19) {
                    this.d0 = J.a(this.w, 100);
                    frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.c0, this.d0);
                }
                else if(v1 == 20) {
                    this.d0 = J.a(this.w, 150);
                    frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.c0, this.d0);
                }
                else {
                    frameLayout$LayoutParams0 = null;
                }
            }
            int v3 = J.a(this.w, 320);
            int v4 = J.a(this.w, 0xA7);
            int v5 = J.a(this.w, 46);
            int v6 = this.c0;
            int v7 = J.a(this.w, 72);
            int v8 = J.a(this.w, 72);
            int v9 = this.c0 - J.a(this.w, 72) - J.a(this.w, 72);
            int v10 = J.a(this.w, 320);
            int v11 = J.a(this.w, 34);
            switch(v1) {
                case 15: {
                    int v12 = this.c0;
                    int v13 = J.a(this.w, 16);
                    int v14 = J.a(this.w, 0x73);
                    int v15 = this.c0;
                    int v16 = J.a(this.w, 16);
                    int v17 = J.a(this.w, 0x73);
                    v18 = J.a(this.w, 89);
                    v11 = J.a(this.w, 34);
                    v19 = v3;
                    v20 = v15 - v16 - v17;
                    v21 = v4;
                    v22 = v5;
                    v23 = v12 - v13 - v14;
                    break;
                }
                case 16: {
                    int v24 = this.c0;
                    int v25 = J.a(this.w, 16);
                    int v26 = J.a(this.w, 0x84);
                    int v27 = this.c0;
                    int v28 = J.a(this.w, 16);
                    int v29 = J.a(this.w, 0x84);
                    int v30 = J.a(this.w, 100);
                    v22 = v5;
                    v23 = v24 - v25 - v26;
                    v20 = v27 - v28 - v29;
                    v21 = J.a(this.w, 52);
                    v19 = v30;
                    v18 = v10;
                    break;
                }
                case 17: {
                    v5 = J.a(this.w, 34);
                    v9 = this.c0 - J.a(this.w, 62) - J.a(this.w, 16);
                label_92:
                    v19 = v3;
                    v20 = v9;
                    v21 = v4;
                    v22 = v5;
                    v23 = v6 - v7 - v8;
                    v18 = v10;
                    break;
                }
                case 18: {
                    v31 = this.c0 - J.a(this.w, 0x83) - J.a(this.w, 12);
                    v32 = this.c0 - J.a(this.w, 0x83) - J.a(this.w, 12);
                    v33 = J.a(this.w, 107);
                    v34 = J.a(this.w, 56);
                    goto label_108;
                }
                case 19: {
                    v31 = this.c0 - J.a(this.w, 0xA7) - J.a(this.w, 12);
                    v32 = this.c0 - J.a(this.w, 0xA7) - J.a(this.w, 12);
                    v33 = J.a(this.w, 0x91);
                    v34 = J.a(this.w, 76);
                label_108:
                    v22 = v5;
                    v23 = v31;
                    v18 = v10;
                    v19 = v33;
                    v20 = v32;
                    v21 = v34;
                    break;
                }
                case 20: {
                    int v35 = this.c0;
                    int v36 = J.a(this.w, 0xA7);
                    int v37 = J.a(this.w, 12);
                    int v38 = this.c0;
                    int v39 = J.a(this.w, 0xA7);
                    int v40 = J.a(this.w, 12);
                    int v41 = J.a(this.w, 0x91);
                    int v42 = J.a(this.w, 76);
                    int v43 = J.a(this.w, 0x150);
                    v11 = J.a(this.w, 36);
                    v22 = v5;
                    v23 = v35 - v36 - v37;
                    v18 = v43;
                    v19 = v41;
                    v20 = v38 - v39 - v40;
                    v21 = v42;
                    break;
                }
                default: {
                    goto label_92;
                }
            }
            frameLayout$LayoutParams0.gravity = 1;
            this.q.setBackgroundColor(Color.parseColor("#F8F8F8"));
            this.q.setLayoutParams(frameLayout$LayoutParams0);
            if(v1 == 14 || (v1 == 15 || v1 == 16) || (v1 == 18 || v1 == 19 || v1 == 20)) {
                if(this.z == null) {
                    this.z = new o0(this.w, 0.0f);
                }
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v19, v21);
                if(v1 == 14 || v1 == 15) {
                    relativeLayout$LayoutParams0.addRule(10);
                }
                else if(v1 == 16) {
                    relativeLayout$LayoutParams0.addRule(10);
                    relativeLayout$LayoutParams0.addRule(11);
                    relativeLayout$LayoutParams0.topMargin = J.a(this.w, 14);
                    relativeLayout$LayoutParams0.rightMargin = J.a(this.w, 14);
                }
                else {
                    switch(v1) {
                        case 18: {
                            relativeLayout$LayoutParams0.addRule(10);
                            relativeLayout$LayoutParams0.addRule(11);
                            relativeLayout$LayoutParams0.topMargin = J.a(this.w, 12);
                            relativeLayout$LayoutParams0.rightMargin = J.a(this.w, 12);
                            break;
                        }
                        case 19: {
                            relativeLayout$LayoutParams0.addRule(10);
                            relativeLayout$LayoutParams0.addRule(11);
                            relativeLayout$LayoutParams0.topMargin = J.a(this.w, 12);
                            relativeLayout$LayoutParams0.rightMargin = J.a(this.w, 12);
                            break;
                        }
                        case 20: {
                            relativeLayout$LayoutParams0.addRule(10);
                            relativeLayout$LayoutParams0.addRule(11);
                            relativeLayout$LayoutParams0.topMargin = J.a(this.w, 12);
                            relativeLayout$LayoutParams0.rightMargin = J.a(this.w, 12);
                        }
                    }
                }
                this.z.setLayoutParams(relativeLayout$LayoutParams0);
                this.z.setScaleType(ImageView.ScaleType.FIT_XY);
                this.q.addView(this.z);
                this.z.setVisibility(0);
            }
            else {
                ImageView imageView0 = this.z;
                if(imageView0 != null) {
                    imageView0.setVisibility(8);
                }
            }
            if(v1 == 14 || v1 == 17) {
                if(this.y == null) {
                    this.y = new o0(this.w, 0.0f);
                }
                RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(v22, v22);
                if(v1 == 14) {
                    relativeLayout$LayoutParams1.leftMargin = J.a(this.w, 16);
                    relativeLayout$LayoutParams1.rightMargin = J.a(this.w, 10);
                    relativeLayout$LayoutParams1.topMargin = J.a(this.w, 0xB7);
                }
                else {
                    relativeLayout$LayoutParams1.leftMargin = J.a(this.w, 16);
                    relativeLayout$LayoutParams1.rightMargin = J.a(this.w, 12);
                    relativeLayout$LayoutParams1.topMargin = J.a(this.w, 8);
                }
                relativeLayout$LayoutParams1.addRule(9);
                relativeLayout$LayoutParams1.addRule(10);
                this.y.setLayoutParams(relativeLayout$LayoutParams1);
                this.y.setScaleType(ImageView.ScaleType.FIT_XY);
                this.q.addView(this.y);
                this.y.setVisibility(0);
            }
            else {
                ImageView imageView1 = this.y;
                if(imageView1 != null) {
                    imageView1.setVisibility(8);
                }
            }
            o0 o00 = this.A;
            if(o00 != null) {
                try {
                    o00.setVisibility(8);
                    goto label_201;
                }
                catch(Exception exception0) {
                }
                b.c(Thread.currentThread(), "privacy rendering error : " + exception0.toString());
            }
        label_201:
            if(v1 == 15 || (v1 == 14 || v1 == 16) || (v1 == 18 || v1 == 19 || v1 == 20)) {
                this.E = new TextView(this.w);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(v23, J.a(this.w, 21));
                relativeLayout$LayoutParams2.addRule(10);
                relativeLayout$LayoutParams2.addRule(9);
                switch(v1) {
                    case 14: {
                        relativeLayout$LayoutParams2.topMargin = J.a(this.w, 0xBA);
                        relativeLayout$LayoutParams2.leftMargin = J.a(this.w, 72);
                        relativeLayout$LayoutParams2.rightMargin = J.a(this.w, 14);
                        break;
                    }
                    case 15: {
                        relativeLayout$LayoutParams2.topMargin = J.a(this.w, 204);
                        relativeLayout$LayoutParams2.leftMargin = J.a(this.w, 16);
                        relativeLayout$LayoutParams2.rightMargin = J.a(this.w, 10);
                        break;
                    }
                    case 16: {
                        relativeLayout$LayoutParams2.topMargin = J.a(this.w, 20);
                        relativeLayout$LayoutParams2.leftMargin = J.a(this.w, 14);
                        break;
                    }
                    case 18: {
                        relativeLayout$LayoutParams2.topMargin = J.a(this.w, 21);
                        relativeLayout$LayoutParams2.leftMargin = J.a(this.w, 12);
                        break;
                    }
                    case 19: {
                        relativeLayout$LayoutParams2.topMargin = J.a(this.w, 0x1F);
                        relativeLayout$LayoutParams2.leftMargin = J.a(this.w, 12);
                        break;
                    }
                    case 20: {
                        relativeLayout$LayoutParams2.topMargin = J.a(this.w, 0x1F);
                        relativeLayout$LayoutParams2.leftMargin = J.a(this.w, 12);
                    }
                }
                this.E.setSingleLine();
                this.E.setGravity(16);
                this.E.setLayoutParams(relativeLayout$LayoutParams2);
                s0.a(this.E, "", 14, Color.parseColor("#000000"), null, 0, 1, TextUtils.TruncateAt.END, true);
                this.q.addView(this.E);
                this.E.setVisibility(0);
            }
            else {
                TextView textView0 = this.E;
                if(textView0 != null) {
                    textView0.setVisibility(8);
                }
            }
            if(v1 == 14 || v1 == 15 || v1 == 16 || (v1 == 17 || v1 == 18) || (v1 == 19 || v1 == 20)) {
                int v44 = Color.parseColor("#363636");
                this.F = new TextView(this.w);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(v20, J.a(this.w, 18));
                relativeLayout$LayoutParams3.addRule(9);
                switch(v1) {
                    case 14: {
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 0xD0);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 72);
                        relativeLayout$LayoutParams3.rightMargin = J.a(this.w, 14);
                        v46 = v44;
                        v47 = 12;
                        break;
                    }
                    case 15: {
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 0xE2);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 16);
                        relativeLayout$LayoutParams3.rightMargin = J.a(this.w, 10);
                        v46 = v44;
                        v47 = 12;
                        break;
                    }
                    case 16: {
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 42);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 14);
                        v46 = v44;
                        v47 = 12;
                        break;
                    }
                    case 17: {
                        int v45 = Color.parseColor("#121212");
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 15);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 62);
                        v46 = v45;
                        v47 = 14;
                        break;
                    }
                    case 18: {
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 43);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 12);
                        v46 = v44;
                        v47 = 12;
                        break;
                    }
                    case 19: {
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 53);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 12);
                        v46 = v44;
                        v47 = 12;
                        break;
                    }
                    case 20: {
                        relativeLayout$LayoutParams3.topMargin = J.a(this.w, 53);
                        relativeLayout$LayoutParams3.leftMargin = J.a(this.w, 12);
                        v46 = v44;
                        v47 = 12;
                        break;
                    }
                    default: {
                        v46 = v44;
                        v47 = 12;
                        break;
                    }
                }
                this.F.setLayoutParams(relativeLayout$LayoutParams3);
                this.F.setSingleLine();
                this.F.setGravity(16);
                s0.a(this.F, "", v47, v46, null, 0, 1, TextUtils.TruncateAt.END, false);
                this.q.addView(this.F);
                this.F.setVisibility(0);
            }
            else {
                TextView textView1 = this.F;
                if(textView1 != null) {
                    textView1.setVisibility(8);
                }
            }
            if(v1 == 14 || v1 == 15 || v1 == 20) {
                this.G = new TextView(this.w);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(v18, v11);
                if(v1 == 14) {
                    relativeLayout$LayoutParams4.addRule(10);
                    relativeLayout$LayoutParams4.addRule(9);
                    relativeLayout$LayoutParams4.topMargin = J.a(this.w, 0xF6);
                    this.G.setBackgroundDrawable(this.X);
                }
                else {
                    if(v1 == 15) {
                        relativeLayout$LayoutParams4.addRule(10);
                        relativeLayout$LayoutParams4.addRule(11);
                        relativeLayout$LayoutParams4.topMargin = J.a(this.w, 0xCF);
                        relativeLayout$LayoutParams4.rightMargin = J.a(this.w, 16);
                    }
                    else {
                        relativeLayout$LayoutParams4.addRule(12);
                        relativeLayout$LayoutParams4.addRule(14);
                        relativeLayout$LayoutParams4.bottomMargin = J.a(this.w, 14);
                    }
                    this.G.setBackgroundDrawable(this.Y);
                }
                this.G.setSingleLine();
                this.G.setGravity(17);
                this.G.setLayoutParams(relativeLayout$LayoutParams4);
                s0.a(this.G, "", 12, Color.parseColor("#ffffff"), null, 0, 1, TextUtils.TruncateAt.END, false);
                this.q.addView(this.G);
                this.G.setVisibility(0);
            }
            else {
                TextView textView2 = this.G;
                if(textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
            this.o.removeAllViews();
            this.o.removeAllViewsInLayout();
            this.o.addView(this.q);
            this.q.setOnClickListener(new View.OnClickListener() {
                final AdPopcornSSPAdapter a;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    try {
                        AdPopcornSSPAdapter.this.d();
                    }
                    catch(Exception exception0) {
                        exception0.printStackTrace();
                    }
                }
            });
        }

        class com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.21 implements d {
            final AdPopcornSSPAdapter a;

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    AdPopcornSSPAdapter.this.z.setImageBitmap(bitmap0);
                }
            }
        }


        class com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.22 implements d {
            final AdPopcornSSPAdapter a;

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    AdPopcornSSPAdapter.this.y.setImageBitmap(bitmap0);
                }
            }
        }


        class com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.23 implements d {
            final AdPopcornSSPAdapter a;

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    AdPopcornSSPAdapter.this.A.setImageBitmap(bitmap0);
                }
            }
        }


        class com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.24 implements View.OnClickListener {
            final AdPopcornSSPAdapter a;

            // 去混淆评级： 中等(70)
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
            }
        }

    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public String getBiddingToken(Context context0) {
        return null;
    }

    // 去混淆评级： 低(20)
    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public String getNetworkName() [...] // 潜在的解密器

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void initializeSDK(Context context0, p0 p00, SdkInitListener sdkInitListener0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        try {
            b.a(Thread.currentThread(), "AdPopcornSSPAdapter.internalStopBannerAd");
            e e0 = this.k;
            if(e0 != null) {
                e0.f();
                this.k.removeAllViews();
                a.a(this.k);
                this.a = null;
                this.stopBannerTimer();
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
    }

    public boolean isViewFullyVisible(View view0) {
        if(view0 == null) {
            return false;
        }
        else {
            try {
                if(view0.isShown() && view0.getWindowVisibility() != 8) {
                    Rect rect0 = new Rect();
                    view0.getWindowVisibleDisplayFrame(rect0);
                    Context context0 = view0.getContext();
                    int v = !(context0 instanceof Activity) || ((Activity)context0).getActionBar() == null ? 0 : ((Activity)context0).getActionBar().getHeight();
                    Rect rect1 = new Rect(rect0.left, rect0.top + v, rect0.right, rect0.bottom);
                    int[] arr_v = new int[2];
                    view0.getLocationInWindow(arr_v);
                    int v1 = arr_v[0];
                    int v2 = arr_v[1];
                    Rect rect2 = new Rect(v1, v2, view0.getWidth() + v1, view0.getHeight() + v2);
                    return view0.getWidth() == 0 || view0.getHeight() == 0 ? false : rect1.intersect(rect2);
                }
                return false;
            }
            catch(Exception unused_ex) {
            }
        }
        return true;
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void loadAd(Context context0, AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0, d0 d00, boolean z, int v, int v1) {
        try {
            b.a(Thread.currentThread(), "AdPopcornSSPAdapter videoMix loadAd : " + v1);
            this.e0 = v;
            this.Q = 0;
            this.f0 = "";
            this.w = context0;
            if(v1 == 4) {
                g g0 = (g)d00.b().get(0);
                if(g0 != null && g0.y() != null) {
                    this.f0 = "";
                    B0 b00 = new B0();
                    this.P = b00;
                    b00.a(g0.I());
                    if(g0.j() != null && !g0.j().isEmpty()) {
                        this.P.h(g0.j());
                    }
                    if(g0.b() != null && !g0.b().isEmpty()) {
                        this.P.b(g0.b());
                    }
                    new processingVastXMLThread(this, g0.y(), 3).start();
                    return;
                }
                E0 e00 = this.i;
                if(e00 != null) {
                    e00.d(v);
                }
            }
            else {
                b.a(Thread.currentThread(), "AdPopcornSSPAdapter does not support videoMix campaign type");
                E0 e01 = this.i;
                if(e01 != null) {
                    e01.d(v);
                }
            }
        }
        catch(Exception unused_ex) {
            E0 e02 = this.i;
            if(e02 != null) {
                e02.d(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "AdPopcornSSPAdapter loadInterstitial");
            if(!y.a(d00)) {
                b.b(Thread.currentThread(), "failed to load in ADPOPCORN");
                T t0 = this.b;
                if(t0 != null) {
                    t0.d(v);
                    return;
                }
                return;
            }
            b.a(Thread.currentThread(), "InterstitialAd : Success to load in ADPOPCORN");
            T t1 = this.b;
            if(t1 != null) {
                t1.b(v);
            }
            if(((g)d00.b().get(0)) != null && false) {
                b.c(Thread.currentThread(), "Call Interstitial Win notice : ");
                E.g().d().a(context0, com.igaworks.ssp.t.e.u, "");
            }
        }
        catch(Exception exception0) {
            T t2 = this.b;
            if(t2 != null) {
                t2.d(v);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitialVideoAd(Context context0, AdPopcornSSPInterstitialVideoAd adPopcornSSPInterstitialVideoAd0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "AdPopcornSSPAdapter loadInterstitialVideoAd");
            this.O = v;
            this.Q = 0;
            this.S = "";
            this.w = context0;
            g g0 = (g)d00.b().get(0);
            if(g0 != null && g0.y() != null) {
                this.S = "";
                B0 b00 = new B0();
                this.P = b00;
                b00.a(g0.p());
                if(g0.j() != null && g0.j().size() > 0) {
                    this.P.h(g0.j());
                }
                if(g0.b() != null && g0.b().size() > 0) {
                    this.P.b(g0.b());
                }
                new processingVastXMLThread(this, g0.y(), 1).start();
                return;
            }
            V v1 = this.d;
            if(v1 != null) {
                v1.d(v);
            }
        }
        catch(Exception exception0) {
            V v2 = this.d;
            if(v2 != null) {
                v2.d(v);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
        b0 b00 = this.h;
        if(b00 != null) {
            b00.d(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPNativeAd adPopcornSSPNativeAd0) {
        try {
            this.w = context0;
            this.m = adPopcornSSPNativeAd0;
            if(adPopcornSSPNativeAd0 != null) {
                goto label_3;
            }
            goto label_5;
        }
        catch(Exception exception0) {
            goto label_83;
        }
        try {
        label_3:
            if(adPopcornSSPNativeAd0.getAdPopcornSSPViewBinder() != null && this.m.getAdPopcornSSPViewBinder().useTemplate) {
                this.W = true;
            }
        }
        catch(Exception unused_ex) {
        }
        try {
        label_5:
            if(!y.a(d00)) {
                c0 c00 = this.e;
                if(c00 != null) {
                    c00.a(v, 2);
                    return;
                }
                return;
            }
            g g0 = (g)d00.b().get(0);
            this.r = g0;
            int v1 = g0.u();
            this.V = v1;
            if(this.W || v1 != 0) {
                if(this.m.getAdPopcornSSPViewBinder() == null || this.m.getAdPopcornSSPViewBinder().nativeAdViewId == 0) {
                    b.c(Thread.currentThread(), "AdPopcornSSPAdapter viewBinder or AdPopcornSSPNativeAd is null(Template Mode)");
                    c0 c03 = this.e;
                    if(c03 != null) {
                        c03.a(v, 3);
                    }
                    return;
                }
                this.d(this.V);
            }
            else {
                if(adPopcornSSPNativeAd0.getAdPopcornSSPViewBinder() == null) {
                    b.c(Thread.currentThread(), "AdPopcornSSPAdapter viewBinder or AdPopcornSSPNativeAd is null(General Mode)");
                    c0 c01 = this.e;
                    if(c01 != null) {
                        c01.a(v, 3);
                    }
                    return;
                }
                this.c();
                if(!this.b()) {
                    c0 c02 = this.e;
                    if(c02 != null) {
                        c02.a(v, 3);
                    }
                    return;
                }
            }
            this.u = false;
        }
        catch(Exception exception0) {
            goto label_83;
        }
        try {
            this.m.getViewTreeObserver().addOnGlobalLayoutListener(this.g0);
            this.m.getViewTreeObserver().addOnScrollChangedListener(this.h0);
        }
        catch(Exception unused_ex) {
        }
        try {
            if(this.V == 0) {
                View view0 = this.p;
                if(view0 != null) {
                    view0.setVisibility(0);
                }
                ImageView imageView0 = this.y;
                if(imageView0 != null) {
                    imageView0.setVisibility(8);
                }
                ImageView imageView1 = this.z;
                if(imageView1 != null) {
                    imageView1.setImageBitmap(null);
                    this.z.getLayoutParams().width = -2;
                    this.z.getLayoutParams().height = -2;
                    this.z.setVisibility(8);
                }
                o0 o00 = this.A;
                if(o00 != null) {
                    o00.setOnClickListener(new View.OnClickListener() {
                        final AdPopcornSSPAdapter b;

                        // 去混淆评级： 中等(70)
                        @Override  // android.view.View$OnClickListener
                        public void onClick(View view0) {
                        }
                    });
                }
                TextView textView0 = this.E;
                if(textView0 != null) {
                    textView0.setVisibility(8);
                }
                TextView textView1 = this.F;
                if(textView1 != null) {
                    textView1.setVisibility(8);
                }
                TextView textView2 = this.G;
                if(textView2 != null) {
                    textView2.setVisibility(8);
                }
                AdPopcornSSPNativeAdTemplate adPopcornSSPNativeAdTemplate0 = this.q;
                if(adPopcornSSPNativeAdTemplate0 != null) {
                    adPopcornSSPNativeAdTemplate0.setVisibility(8);
                }
                goto label_66;
            }
            else {
                goto label_68;
            }
            goto label_74;
        }
        catch(Exception exception0) {
            goto label_83;
        }
        try {
        label_66:
            this.e();
        }
        catch(Exception unused_ex) {
        }
        goto label_74;
        try {
        label_68:
            AdPopcornSSPNativeAdTemplate adPopcornSSPNativeAdTemplate1 = this.q;
            if(adPopcornSSPNativeAdTemplate1 != null) {
                adPopcornSSPNativeAdTemplate1.setVisibility(0);
            }
            View view1 = this.p;
            if(view1 != null) {
                view1.setVisibility(8);
            }
        label_74:
            c0 c04 = this.e;
            if(c04 != null) {
                c04.a(v);
            }
            if(this.r != null) {
                this.U = "";
            }
            if(!d00.m()) {
                this.a(context0);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
    label_83:
        b.a(Thread.currentThread(), exception0);
        c0 c05 = this.e;
        if(c05 != null) {
            c05.a(v, 0);
        }
        View view2 = this.p;
        if(view2 != null) {
            view2.setVisibility(4);
        }
        AdPopcornSSPNativeAdTemplate adPopcornSSPNativeAdTemplate2 = this.q;
        if(adPopcornSSPNativeAdTemplate2 != null) {
            adPopcornSSPNativeAdTemplate2.setVisibility(4);
        }

        class com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.4 implements d {
            final AdPopcornSSPAdapter a;

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    AdPopcornSSPAdapter.this.y.setImageBitmap(bitmap0);
                }
            }
        }


        class com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.5 implements d {
            final AdPopcornSSPAdapter a;

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    if(AdPopcornSSPAdapter.this.v) {
                        int v = bitmap0.getPixel(1, 1);
                        AdPopcornSSPAdapter.this.z.setBackgroundColor(v);
                    }
                    AdPopcornSSPAdapter.this.z.setImageBitmap(bitmap0);
                }
            }
        }

    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadReactNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0) {
        try {
            this.w = context0;
            this.o = adPopcornSSPReactNativeAd0;
            if(!y.a(d00)) {
                g0 g00 = this.g;
                if(g00 != null) {
                    g00.a(v, 2);
                    return;
                }
                return;
            }
            g g0 = (g)d00.b().get(0);
            this.t = g0;
            this.e(g0.u());
            this.u = false;
        }
        catch(Exception exception0) {
            goto label_26;
        }
        try {
            this.o.getViewTreeObserver().addOnGlobalLayoutListener(this.g0);
            this.o.getViewTreeObserver().addOnScrollChangedListener(this.h0);
        }
        catch(Exception unused_ex) {
        }
        try {
            AdPopcornSSPNativeAdTemplate adPopcornSSPNativeAdTemplate0 = this.q;
            if(adPopcornSSPNativeAdTemplate0 != null) {
                adPopcornSSPNativeAdTemplate0.setVisibility(0);
            }
            g0 g01 = this.g;
            if(g01 != null) {
                g01.a(v, this.c0, this.d0, i.c.b());
            }
            if(this.t != null) {
                this.U = "";
            }
            if(!d00.m()) {
                this.a(context0);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
    label_26:
        b.a(Thread.currentThread(), exception0);
        g0 g02 = this.g;
        if(g02 != null) {
            g02.a(v, 0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadRewardVideoAd(Context context0, AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "AdPopcornSSPAdapter loadRewardVideoAd");
            this.N = v;
            this.Q = 0;
            this.T = "";
            this.w = context0;
            g g0 = (g)d00.b().get(0);
            if(g0 != null && g0.y() != null) {
                this.T = "";
                B0 b00 = new B0();
                this.P = b00;
                b00.a(g0.I());
                if(g0.j() != null && g0.j().size() > 0) {
                    this.P.h(g0.j());
                }
                if(g0.b() != null && g0.b().size() > 0) {
                    this.P.b(g0.b());
                }
                new processingVastXMLThread(this, g0.y(), 2).start();
                return;
            }
            l0 l00 = this.c;
            if(l00 != null) {
                l00.d(this.N);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        l0 l01 = this.c;
        if(l01 != null) {
            l01.d(this.N);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadSplashAd(Context context0, d0 d00, int v, AdPopcornSSPSplashAd adPopcornSSPSplashAd0) {
        try {
            this.w = context0;
            this.n = adPopcornSSPSplashAd0;
            if(!y.a(d00)) {
                r0 r00 = this.f;
                if(r00 != null) {
                    r00.a(v, 2);
                    return;
                }
                return;
            }
            this.s = (g)d00.b().get(0);
            this.u = false;
        }
        catch(Exception exception0) {
            goto label_23;
        }
        try {
            this.n.getViewTreeObserver().addOnGlobalLayoutListener(this.g0);
            this.n.getViewTreeObserver().addOnScrollChangedListener(this.h0);
        }
        catch(Exception unused_ex) {
        }
        try {
            if(this.x == null) {
                ImageView imageView0 = new ImageView(context0);
                this.x = imageView0;
                imageView0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.n.addView(this.x);
            }
            r0 r01 = this.f;
            if(r01 != null) {
                r01.a(v);
            }
            this.c(context0);
            return;
        }
        catch(Exception exception0) {
        }
    label_23:
        b.a(Thread.currentThread(), exception0);
        r0 r02 = this.f;
        if(r02 != null) {
            r02.a(v, 0);
        }
        AdPopcornSSPSplashAd adPopcornSSPSplashAd1 = this.n;
        if(adPopcornSSPSplashAd1 != null) {
            adPopcornSSPSplashAd1.setVisibility(4);
        }

        class com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter.20 implements d {
            final AdPopcornSSPAdapter a;

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    AdPopcornSSPAdapter.this.x.setImageBitmap(bitmap0);
                }
            }
        }

    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void onPauseBanner() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void onResumeBanner() {
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void pauseAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void pauseInterstitialVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void pauseRewardVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void resumeAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void resumeInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void resumeInterstitialVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void resumeRewardVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setBannerMediationAdapterEventListener(C c0) {
        this.a = c0;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setCustomExtras(HashMap hashMap0) {
        this.l = hashMap0;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setInterstitialMediationAdapterEventListener(T t0) {
        this.b = t0;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setInterstitialVideoMediationAdapterEventListener(V v0) {
        this.d = v0;
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void setMediationAdapterEventListener(E0 e00) {
        this.i = e00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setModalAdMediationAdapterEventListener(b0 b00) {
        this.h = b00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setNativeMediationAdapterEventListener(c0 c00) {
        this.e = c00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setReactNativeMediationAdapterEventListener(g0 g00) {
        this.g = g00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setRewardVideoMediationAdapterEventListener(l0 l00) {
        this.c = l00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setSplashMediationAdapterEventListener(r0 r00) {
        this.f = r00;
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void showAd(Context context0, d0 d00, boolean z, int v, int v1) {
        b.c(Thread.currentThread(), "AdPopcornSSPAdapter videoMix showAd");
        B0 b00 = this.P;
        if(b00 == null) {
            E0 e02 = this.i;
            if(e02 != null) {
                e02.c(v);
            }
        }
        else {
            try {
                if(d00 != null) {
                    b00.b(d00.o());
                }
                Intent intent0 = new Intent(context0, AdPopcornSSPVideoActivity.class).putExtra("is_reward_video_type", true).putExtra("reward_video_complete_url", "").putExtra("vast_video_setting", this.P);
                try {
                    if(context0 instanceof Activity) {
                        Configuration configuration0 = context0.getResources().getConfiguration();
                        if(configuration0 == null || configuration0.orientation != 1) {
                            intent0.putExtra("is_video_landscape_mode", true);
                        }
                        else {
                            intent0.putExtra("is_video_landscape_mode", false);
                        }
                    }
                }
                catch(Exception unused_ex) {
                }
                intent0.setFlags(0x10000000);
                m0.b().a(new com.igaworks.ssp.m0.a() {
                    final AdPopcornSSPAdapter a;

                    @Override  // com.igaworks.ssp.m0$a
                    public void a() {
                        b.c(Thread.currentThread(), "AdPopcornSSPAdapter videoMix internal onCloseEvent");
                        if(AdPopcornSSPAdapter.this.i != null) {
                            AdPopcornSSPAdapter.this.i.a();
                        }
                    }

                    @Override  // com.igaworks.ssp.m0$a
                    public void b() {
                        b.c(Thread.currentThread(), "AdPopcornSSPAdapter videoMix internal onClickEvent");
                        if(AdPopcornSSPAdapter.this.i != null) {
                            AdPopcornSSPAdapter.this.i.onClickAd();
                        }
                    }

                    @Override  // com.igaworks.ssp.m0$a
                    public void onPlayCompleted() {
                        b.c(Thread.currentThread(), "AdPopcornSSPAdapter videoMix internal onPlayCompleted");
                        if(AdPopcornSSPAdapter.this.i != null) {
                            AdPopcornSSPAdapter.this.i.a(i.c.b(), true);
                        }
                    }
                });
                context0.startActivity(intent0);
                E0 e00 = this.i;
                if(e00 != null) {
                    e00.a(v);
                }
            }
            catch(Exception unused_ex) {
                E0 e01 = this.i;
                if(e01 != null) {
                    e01.c(v);
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        U u1;
        U u0;
        Q q0;
        try {
            b.c(Thread.currentThread(), "AdPopcornSSPAdapter showInterstitial");
            if(!y.a(d00)) {
                T t0 = this.b;
                if(t0 != null) {
                    t0.c(v);
                    return;
                }
                return;
            }
            g g0 = (g)d00.b().get(0);
            q0 = new Q();
            u0 = null;
            if(g0.H()) {
                if(A.a(g0.i())) {
                    q0.a("");
                }
                if(s0.a(g0.y())) {
                    q0.c(g0.y());
                }
                if(A.a(d00.l())) {
                    q0.c(d00.l());
                }
                q0.a(g0.b());
                q0.b(g0.j());
                q0.b(g0.t());
                q0.a(g0.d());
                q0.c(g0.p());
                q0.b(g0.I());
                q0.d(g0.z());
                q0.b(g0.e());
                q0.a(g0.H());
                u1 = null;
            }
            else {
                u1 = new U();
                if(g0.j() != null) {
                    u1.b(g0.j());
                }
                if(g0.b() != null) {
                    u1.a(g0.b());
                }
                u1.a("");
                u1.a(g0.B());
                u1.h("");
                u1.e(g0.G());
                u1.b("");
                u1.b(g0.C());
                u1.d("");
                u1.c("");
                u1.b(g0.h());
                u1.a(g0.f());
                u1.c(g0.E());
                u1.e("");
                u1.d(g0.o());
                u1.c(g0.m());
                u1.d(g0.F());
                u1.f("");
                u1.g("");
                u1.e(g0.u());
            }
            if(y.b(d00)) {
                g g1 = (g)d00.c().get(0);
                u0 = new U();
                if(g1.j() != null) {
                    u0.b(g1.j());
                }
                if(g1.b() != null) {
                    u0.a(g1.b());
                }
                u0.a("");
                u0.a(g1.B());
                u0.h("");
                u0.e(g1.G());
                u0.b("");
                u0.b(g1.C());
                u0.d("");
                u0.c("");
                u0.b(g1.h());
                u0.a(g1.f());
                u0.c(g1.E());
                u0.e("");
                u0.d(g1.o());
                u0.c(g1.m());
                u0.d(g1.F());
                u0.f("");
                u0.g("");
                u0.e(g1.u());
            }
        }
        catch(Exception exception0) {
            goto label_97;
        }
        try {
            Intent intent0 = new Intent(context0, AdPopcornSSPInterstitialActivity.class);
            intent0.putExtra("interstitial_intent_model_data", q0);
            intent0.putExtra("interstitial_intent_custom_data", this.l);
            if(u1 != null) {
                intent0.putExtra("interstitial_intent_native_model_data", u1);
            }
            if(u0 != null) {
                intent0.putExtra("interstitial_intent_companion_model_data", u0);
            }
            intent0.setFlags(0x10000000);
            S.c().a(new com.igaworks.ssp.S.a() {
                final AdPopcornSSPAdapter a;

                @Override  // com.igaworks.ssp.S$a
                public void a(int v) {
                    b.c(Thread.currentThread(), "internal onCloseEvent : " + v);
                    if(AdPopcornSSPAdapter.this.b != null) {
                        AdPopcornSSPAdapter.this.b.e(v);
                    }
                }

                @Override  // com.igaworks.ssp.S$a
                public void b() {
                    b.c(Thread.currentThread(), "internal onClickEvent");
                    if(AdPopcornSSPAdapter.this.b != null) {
                        AdPopcornSSPAdapter.this.b.a();
                    }
                }
            });
            context0.startActivity(intent0);
            T t1 = this.b;
            if(t1 != null) {
                t1.a(v);
                return;
            }
            return;
        }
        catch(Exception exception1) {
        }
        try {
            exception1.printStackTrace();
            T t2 = this.b;
            if(t2 != null) {
                t2.c(v);
            }
        }
        catch(Exception exception0) {
        label_97:
            T t3 = this.b;
            if(t3 != null) {
                t3.c(v);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitialVideoAd(Context context0, d0 d00, boolean z, int v) {
        Intent intent0;
        B0 b00;
        try {
            b.c(Thread.currentThread(), "AdPopcornSSPAdapter showInterstitialVideoAd");
            b00 = this.P;
            if(b00 == null) {
                V v1 = this.d;
                if(v1 != null) {
                    v1.c(v);
                    return;
                }
            }
            else {
                goto label_7;
            }
            return;
        }
        catch(Exception exception0) {
            goto label_31;
        }
        try {
        label_7:
            if(d00 != null) {
                b00.b(d00.o());
            }
            intent0 = new Intent(context0, AdPopcornSSPVideoActivity.class).putExtra("is_reward_video_type", false).putExtra("vast_video_setting", this.P);
        }
        catch(Exception exception1) {
            goto label_24;
        }
        try {
            if(context0 instanceof Activity) {
                Configuration configuration0 = context0.getResources().getConfiguration();
                if(configuration0 == null || configuration0.orientation != 1) {
                    intent0.putExtra("is_video_landscape_mode", true);
                }
                else {
                    intent0.putExtra("is_video_landscape_mode", false);
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            intent0.setFlags(0x10000000);
            S.c().a(new com.igaworks.ssp.S.a() {
                final AdPopcornSSPAdapter a;

                @Override  // com.igaworks.ssp.S$a
                public void a(int v) {
                    b.c(Thread.currentThread(), "showInterstitialVideoAd internal onCloseEvent");
                    if(AdPopcornSSPAdapter.this.d != null) {
                        AdPopcornSSPAdapter.this.d.a();
                    }
                }

                @Override  // com.igaworks.ssp.S$a
                public void b() {
                    b.c(Thread.currentThread(), "showInterstitialVideoAd internal onClickEvent");
                    if(AdPopcornSSPAdapter.this.d != null) {
                        AdPopcornSSPAdapter.this.d.onClickAd();
                    }
                }
            });
            context0.startActivity(intent0);
            V v2 = this.d;
            if(v2 != null) {
                v2.a(v);
                return;
            }
            return;
        }
        catch(Exception exception1) {
        }
        try {
        label_24:
            exception1.printStackTrace();
            V v3 = this.d;
            if(v3 != null) {
                v3.c(v);
            }
        }
        catch(Exception exception0) {
        label_31:
            V v4 = this.d;
            if(v4 != null) {
                v4.c(v);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showRewardVideoAd(Context context0, d0 d00, boolean z, int v) {
        Intent intent0;
        B0 b00;
        try {
            b.c(Thread.currentThread(), "AdPopcornSSPAdapter showRewardVideoAd");
            b00 = this.P;
            if(b00 == null) {
                l0 l00 = this.c;
                if(l00 != null) {
                    l00.c(v);
                    return;
                }
            }
            else {
                goto label_7;
            }
            return;
        }
        catch(Exception exception0) {
            goto label_31;
        }
        try {
        label_7:
            if(d00 != null) {
                b00.b(d00.o());
            }
            intent0 = new Intent(context0, AdPopcornSSPVideoActivity.class).putExtra("is_reward_video_type", true).putExtra("reward_video_complete_url", "").putExtra("vast_video_setting", this.P);
        }
        catch(Exception exception1) {
            goto label_24;
        }
        try {
            if(context0 instanceof Activity) {
                Configuration configuration0 = context0.getResources().getConfiguration();
                if(configuration0 == null || configuration0.orientation != 1) {
                    intent0.putExtra("is_video_landscape_mode", true);
                }
                else {
                    intent0.putExtra("is_video_landscape_mode", false);
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            intent0.setFlags(0x10000000);
            m0.b().a(new com.igaworks.ssp.m0.a() {
                final AdPopcornSSPAdapter a;

                @Override  // com.igaworks.ssp.m0$a
                public void a() {
                    b.c(Thread.currentThread(), "showRewardVideoAd internal onCloseEvent");
                    if(AdPopcornSSPAdapter.this.c != null) {
                        AdPopcornSSPAdapter.this.c.a();
                    }
                }

                @Override  // com.igaworks.ssp.m0$a
                public void b() {
                    b.c(Thread.currentThread(), "showRewardVideoAd internal onClickEvent");
                    if(AdPopcornSSPAdapter.this.c != null) {
                        AdPopcornSSPAdapter.this.c.onClickAd();
                    }
                }

                @Override  // com.igaworks.ssp.m0$a
                public void onPlayCompleted() {
                    b.c(Thread.currentThread(), "showRewardVideoAd internal onPlayCompleted");
                    if(AdPopcornSSPAdapter.this.c != null) {
                        AdPopcornSSPAdapter.this.c.a(i.c.b(), true);
                    }
                }
            });
            context0.startActivity(intent0);
            l0 l01 = this.c;
            if(l01 != null) {
                l01.a(v);
                return;
            }
            return;
        }
        catch(Exception exception1) {
        }
        try {
        label_24:
            exception1.printStackTrace();
            l0 l02 = this.c;
            if(l02 != null) {
                l02.c(v);
            }
        }
        catch(Exception exception0) {
        label_31:
            l0 l03 = this.c;
            if(l03 != null) {
                l03.c(v);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void startBannerAd(Context context0, AdSize adSize0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, d0 d00, boolean z, int v) {
        this.j = true;
        this.b0 = v;
        if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
            if(this.Z == null) {
                this.Z = new Handler();
            }
            if(this.a0 == null) {
                this.a0 = new Runnable() {
                    final AdPopcornSSPAdapter a;

                    @Override
                    public void run() {
                        if(AdPopcornSSPAdapter.this.j) {
                            b.b(Thread.currentThread(), "Time out in : ADPOPCORN");
                            if(AdPopcornSSPAdapter.this.a != null) {
                                AdPopcornSSPAdapter.this.a.a(AdPopcornSSPAdapter.this.b0);
                            }
                        }
                    }
                };
            }
        }
        try {
            this.Z.postDelayed(this.a0, adPopcornSSPBannerAd0.getNetworkScheduleTimeout() + 2000L);
            if(d00.b() != null && d00.b().size() > 0) {
                b.a(Thread.currentThread(), "AdPopcornSSPAdapter.startBannerAd()");
                if(this.k == null) {
                    this.k = new e(context0.getApplicationContext(), adSize0, adPopcornSSPBannerAd0.getAutoBgColor());
                }
                else {
                    b.a(Thread.currentThread(), "already exist AdPopcorn AdView");
                    this.k.c(context0.getApplicationContext());
                }
                this.k.setInnerAdPopcornSSPBannerViewListener(new o() {
                    final AdPopcornSSPAdapter c;

                    @Override  // com.igaworks.ssp.e$o
                    public void a() {
                        b.a(Thread.currentThread(), "onClick");
                        if(AdPopcornSSPAdapter.this.a != null) {
                            AdPopcornSSPAdapter.this.a.a();
                        }
                    }

                    @Override  // com.igaworks.ssp.e$o
                    public void b() {
                        b.a(Thread.currentThread(), "onFail");
                        AdPopcornSSPAdapter.this.stopBannerTimer();
                        if(AdPopcornSSPAdapter.this.a != null) {
                            AdPopcornSSPAdapter.this.a.a(v);
                        }
                    }

                    @Override  // com.igaworks.ssp.e$o
                    public void onSuccess() {
                        try {
                            AdPopcornSSPAdapter.this.stopBannerTimer();
                            adPopcornSSPBannerAd0.removeAllViews();
                            adPopcornSSPBannerAd0.removeAllViewsInLayout();
                            adPopcornSSPBannerAd0.addView(AdPopcornSSPAdapter.this.k);
                            if(AdPopcornSSPAdapter.this.a != null) {
                                AdPopcornSSPAdapter.this.a.b(v);
                            }
                        }
                        catch(Exception exception0) {
                            AdPopcornSSPAdapter.this.stopBannerTimer();
                            b.a(Thread.currentThread(), exception0);
                            if(AdPopcornSSPAdapter.this.a != null) {
                                AdPopcornSSPAdapter.this.a.a(v);
                            }
                        }
                    }
                });
                if(this.k == null) {
                    this.stopBannerTimer();
                    C c0 = this.a;
                    if(c0 != null) {
                        c0.a(v);
                    }
                    return;
                }
                g g0 = (g)d00.b().get(0);
                g0.d(d00.l());
                this.R = "";
                this.k.a(context0.getApplicationContext(), g0, d00.m());
                return;
            }
            b.a(Thread.currentThread(), "AdPopcornSSPAdapter.startBannerAd() : Empty campaign");
            this.stopBannerTimer();
            C c1 = this.a;
            if(c1 != null) {
                c1.a(v);
            }
            this.k = null;
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.stopBannerTimer();
        C c2 = this.a;
        if(c2 != null) {
            c2.a(v);
        }
    }

    public void stopBannerTimer() {
        try {
            this.j = false;
            Handler handler0 = this.Z;
            if(handler0 != null) {
                handler0.removeCallbacks(this.a0);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    static g x(AdPopcornSSPAdapter adPopcornSSPAdapter0) {
        return adPopcornSSPAdapter0.t;
    }

    static g0 y(AdPopcornSSPAdapter adPopcornSSPAdapter0) {
        return adPopcornSSPAdapter0.g;
    }
}

