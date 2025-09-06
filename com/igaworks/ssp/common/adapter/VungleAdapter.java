package com.igaworks.ssp.common.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.C;
import com.igaworks.ssp.E0;
import com.igaworks.ssp.E;
import com.igaworks.ssp.SdkInitListener;
import com.igaworks.ssp.T;
import com.igaworks.ssp.V;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.b0;
import com.igaworks.ssp.b;
import com.igaworks.ssp.c0;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.g;
import com.igaworks.ssp.i;
import com.igaworks.ssp.l0;
import com.igaworks.ssp.p0;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd;
import com.igaworks.ssp.part.custom.AdPopcornSSPReactNativeAd;
import com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd;
import com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd;
import com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd;
import com.igaworks.ssp.part.nativead.AdPopcornSSPNativeAd;
import com.igaworks.ssp.part.splash.AdPopcornSSPSplashAd;
import com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd;
import com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd;
import com.igaworks.ssp.r0;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.vungle.ads.F;
import com.vungle.ads.G;
import com.vungle.ads.H;
import com.vungle.ads.K;
import com.vungle.ads.L;
import com.vungle.ads.R0;
import com.vungle.ads.S0;
import com.vungle.ads.VungleAds;
import com.vungle.ads.d1;
import com.vungle.ads.d;
import com.vungle.ads.f0;
import com.vungle.ads.g0;
import com.vungle.ads.h0;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.y0;
import com.vungle.ads.y;
import java.util.ArrayList;
import java.util.HashMap;

public class VungleAdapter implements BaseMediationAdapter, VideoMixAdMediationAdapter {
    private f0 A;
    private boolean B;
    private g C;
    private g D;
    private g E;
    private g F;
    private boolean G;
    private AdPopcornSSPBannerAd H;
    private G I;
    private y J;
    private H K;
    private R0 L;
    private y0 M;
    private g0 N;
    private AdPopcornSSPNativeAd O;
    private Context P;
    private Handler Q;
    private int R;
    private boolean S;
    private Runnable T;
    private boolean U;
    private g V;
    private String W;
    private R0 X;
    private g0 Y;
    private final F Z;
    private C a;
    private final S0 a0;
    private T b;
    private L b0;
    private c0 c;
    private final h0 c0;
    private l0 d;
    private final h0 d0;
    private V e;
    private final S0 e0;
    private r0 f;
    private com.igaworks.ssp.g0 g;
    private b0 h;
    private E0 i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private Handler u;
    private Runnable v;
    private Runnable w;
    private Runnable x;
    private boolean y;
    private boolean z;

    public VungleAdapter() {
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = true;
        this.t = true;
        this.u = new Handler(Looper.getMainLooper());
        this.y = false;
        this.z = false;
        this.G = false;
        this.J = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.Q = new Handler(Looper.getMainLooper());
        this.R = 0;
        this.S = true;
        this.U = false;
        this.W = "";
        this.X = null;
        this.Y = null;
        this.Z = new F() {
            final VungleAdapter a;

            @Override  // com.vungle.ads.L
            public void onAdClicked(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter banner onAdClicked");
                if(VungleAdapter.this.a != null) {
                    VungleAdapter.this.a.a();
                }
                try {
                    if(VungleAdapter.this.C != null && VungleAdapter.this.C.b() != null) {
                        for(int v = 0; v < VungleAdapter.this.C.b().size(); ++v) {
                            String s = (String)VungleAdapter.this.C.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "VungleAdapter onAdClicked url : " + s);
                                E.g().d().a(VungleAdapter.this.P, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdEnd(K k0) {
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToLoad(K k0, d1 d10) {
                try {
                    b.b(Thread.currentThread(), "VungleAdapter onAdFailedToLoad Vungle, error code : " + d10.getLocalizedMessage());
                    VungleAdapter.this.stopBannerTimer();
                    if(VungleAdapter.this.a != null) {
                        VungleAdapter.this.a.a(VungleAdapter.this.o);
                    }
                }
                catch(Exception exception0) {
                    b.a(Thread.currentThread(), exception0);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToPlay(K k0, d1 d10) {
            }

            @Override  // com.vungle.ads.L
            public void onAdImpression(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter banner onAdImpression");
                try {
                    if(VungleAdapter.this.C != null && VungleAdapter.this.C.j() != null) {
                        for(int v = 0; v < VungleAdapter.this.C.j().size(); ++v) {
                            String s = (String)VungleAdapter.this.C.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "VungleAdapter onAdImpression url : " + s);
                                E.g().d().a(VungleAdapter.this.P, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdLeftApplication(K k0) {
            }

            @Override  // com.vungle.ads.L
            public void onAdLoaded(K k0) {
                b.b(Thread.currentThread(), "VungleAdapter banner onAdLoaded : " + VungleAdapter.this.G + ", placementId : " + VungleAdapter.this.k);
                try {
                    H h0 = VungleAdapter.this.J.getBannerView();
                    VungleAdapter.this.K = h0;
                    VungleAdapter.this.H.removeAllViewsInLayout();
                    VungleAdapter.this.H.removeAllViews();
                    VungleAdapter.this.H.addView(VungleAdapter.this.K);
                    VungleAdapter.this.stopBannerTimer();
                    if(VungleAdapter.this.a != null) {
                        VungleAdapter.this.a.b(VungleAdapter.this.o);
                    }
                    if(VungleAdapter.this.H != null && VungleAdapter.this.H.getAutoBgColor()) {
                        VungleAdapter.this.H.setVisibility(4);
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            final com.igaworks.ssp.common.adapter.VungleAdapter.4 a;

                            @Override
                            public void run() {
                                try {
                                    try {
                                        VungleAdapter.this.K.buildDrawingCache();
                                        Bitmap bitmap0 = VungleAdapter.this.K.getDrawingCache();
                                        if(bitmap0 != null) {
                                            int v = bitmap0.getPixel(1, 1);
                                            VungleAdapter.this.H.setBackgroundColor(v);
                                        }
                                        goto label_15;
                                    }
                                    catch(Exception exception0) {
                                    }
                                    b.a(Thread.currentThread(), exception0);
                                    if(VungleAdapter.this.H != null) {
                                        goto label_9;
                                    }
                                    return;
                                }
                                catch(Throwable throwable0) {
                                    goto label_12;
                                }
                            label_9:
                                VungleAdapter.this.H.setVisibility(0);
                                return;
                            label_12:
                                if(VungleAdapter.this.H != null) {
                                    VungleAdapter.this.H.setVisibility(0);
                                }
                                throw throwable0;
                            label_15:
                                if(VungleAdapter.this.H != null) {
                                    VungleAdapter.this.H.setVisibility(0);
                                }
                            }
                        }, 350L);
                        return;
                    }
                    return;
                }
                catch(Exception exception0) {
                }
                b.a(Thread.currentThread(), exception0);
                VungleAdapter.this.stopBannerTimer();
                if(VungleAdapter.this.a != null) {
                    VungleAdapter.this.a.a(VungleAdapter.this.o);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdStart(K k0) {
            }
        };
        this.a0 = new S0() {
            final VungleAdapter a;

            @Override  // com.vungle.ads.L
            public void onAdClicked(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter rewardVideo onAdClicked : " + VungleAdapter.this.l);
                if(VungleAdapter.this.d != null) {
                    VungleAdapter.this.d.onClickAd();
                }
                try {
                    if(VungleAdapter.this.D != null && VungleAdapter.this.D.b() != null) {
                        for(int v = 0; v < VungleAdapter.this.D.b().size(); ++v) {
                            String s = (String)VungleAdapter.this.D.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "VungleAdapter onAdClick url : " + s);
                                E.g().d().a(VungleAdapter.this.P, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdEnd(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter onAdEnd");
                if(VungleAdapter.this.d != null) {
                    VungleAdapter.this.d.a();
                }
                VungleAdapter.this.y = false;
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToLoad(K k0, d1 d10) {
                b.a(Thread.currentThread(), "VungleAdapter onAdFailedToLoad onError : " + d10.getLocalizedMessage());
                if(VungleAdapter.this.y && VungleAdapter.this.d != null) {
                    VungleAdapter.this.d.d(VungleAdapter.this.p);
                }
                VungleAdapter.this.a(true);
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToPlay(K k0, d1 d10) {
                b.a(Thread.currentThread(), "VungleAdapter onAdFailedToPlay : " + d10.getLocalizedMessage());
                if(VungleAdapter.this.y && VungleAdapter.this.d != null) {
                    VungleAdapter.this.d.c(VungleAdapter.this.p);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdImpression(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter rewardVideo onAdImpression");
                try {
                    if(VungleAdapter.this.D != null && VungleAdapter.this.D.j() != null) {
                        for(int v = 0; v < VungleAdapter.this.D.j().size(); ++v) {
                            String s = (String)VungleAdapter.this.D.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "VungleAdapter onAdImpression url : " + s);
                                E.g().d().a(VungleAdapter.this.P, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdLeftApplication(K k0) {
            }

            @Override  // com.vungle.ads.L
            public void onAdLoaded(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter onAdLoaded : " + k0.getPlacementId());
                VungleAdapter.this.a(true);
                if(VungleAdapter.this.y && VungleAdapter.this.d != null) {
                    VungleAdapter.this.d.b(VungleAdapter.this.p);
                }
            }

            @Override  // com.vungle.ads.S0
            public void onAdRewarded(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter onAdRewarded");
                if(VungleAdapter.this.d != null) {
                    VungleAdapter.this.d.a(i.r.b(), true);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdStart(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter onAdStart");
                if(VungleAdapter.this.y && VungleAdapter.this.d != null) {
                    VungleAdapter.this.d.a(VungleAdapter.this.p);
                }
            }
        };
        this.b0 = new L() {
            final VungleAdapter a;

            @Override  // com.vungle.ads.L
            public void onAdClicked(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter nativeAd onAdClicked");
                if(VungleAdapter.this.c != null) {
                    VungleAdapter.this.c.onClicked();
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdEnd(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter nativeAd onAdEnd");
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToLoad(K k0, d1 d10) {
                b.a(Thread.currentThread(), "VungleAdapter nativeAd onAdFailedToLoad : " + d10.getLocalizedMessage());
                if(VungleAdapter.this.c != null) {
                    VungleAdapter.this.c.a(VungleAdapter.this.r, 2);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToPlay(K k0, d1 d10) {
                b.a(Thread.currentThread(), "VungleAdapter nativeAd onAdFailedToPlay : " + d10.getLocalizedMessage());
            }

            @Override  // com.vungle.ads.L
            public void onAdImpression(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter nativeAd onAdImpression");
                if(VungleAdapter.this.c != null) {
                    VungleAdapter.this.c.onImpression();
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdLeftApplication(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter nativeAd onAdLeftApplication");
            }

            @Override  // com.vungle.ads.L
            public void onAdLoaded(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter nativeAd onAdLoaded");
                try {
                    if(k0 != null) {
                        VungleAdapter.this.a(VungleAdapter.this.O);
                    }
                    if(VungleAdapter.this.c != null) {
                        VungleAdapter.this.c.a(VungleAdapter.this.r);
                        return;
                    }
                    return;
                }
                catch(Exception exception0) {
                }
                exception0.printStackTrace();
                if(VungleAdapter.this.c != null) {
                    VungleAdapter.this.c.a(VungleAdapter.this.r, 1);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdStart(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter nativeAd onAdStart");
            }
        };
        this.c0 = new h0() {
            final VungleAdapter a;

            @Override  // com.vungle.ads.L
            public void onAdClicked(K k0) {
                b.c(Thread.currentThread(), "VungleAdapter interstitialVideo onAdClick");
                if(VungleAdapter.this.e != null) {
                    VungleAdapter.this.e.onClickAd();
                }
                try {
                    if(VungleAdapter.this.E != null && VungleAdapter.this.E.b() != null) {
                        for(int v = 0; v < VungleAdapter.this.E.b().size(); ++v) {
                            String s = (String)VungleAdapter.this.E.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "VungleAdapter onAdClick url : " + s);
                                E.g().d().a(VungleAdapter.this.P, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdEnd(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter IV onAdEnd");
                if(VungleAdapter.this.e != null) {
                    VungleAdapter.this.e.a();
                }
                VungleAdapter.this.z = false;
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToLoad(K k0, d1 d10) {
                b.a(Thread.currentThread(), "VungleAdapter IV onAdFailedToLoad : " + d10.getLocalizedMessage());
                VungleAdapter.this.a(false);
                if(VungleAdapter.this.z && VungleAdapter.this.e != null) {
                    VungleAdapter.this.e.d(VungleAdapter.this.q);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToPlay(K k0, d1 d10) {
                b.a(Thread.currentThread(), "VungleAdapter IV onAdFailedToPlay : " + d10.getLocalizedMessage());
                if(VungleAdapter.this.z && VungleAdapter.this.e != null) {
                    VungleAdapter.this.e.c(VungleAdapter.this.q);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdImpression(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter interstitialVideo onAdViewed");
                try {
                    if(VungleAdapter.this.E != null && VungleAdapter.this.E.j() != null) {
                        for(int v = 0; v < VungleAdapter.this.E.j().size(); ++v) {
                            String s = (String)VungleAdapter.this.E.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "VungleAdapter onAdViewed url : " + s);
                                E.g().d().a(VungleAdapter.this.P, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdLeftApplication(K k0) {
            }

            @Override  // com.vungle.ads.L
            public void onAdLoaded(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter IV onAdLoad");
                VungleAdapter.this.a(false);
                if(VungleAdapter.this.z && VungleAdapter.this.e != null) {
                    VungleAdapter.this.e.b(VungleAdapter.this.q);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdStart(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter IV onAdStart");
                if(VungleAdapter.this.z && VungleAdapter.this.e != null) {
                    VungleAdapter.this.e.a(VungleAdapter.this.q);
                }
            }
        };
        this.d0 = new h0() {
            final VungleAdapter a;

            @Override  // com.vungle.ads.L
            public void onAdClicked(K k0) {
                b.c(Thread.currentThread(), "VungleAdapter videoMix onAdClick");
                if(VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.onClickAd();
                }
                try {
                    if(VungleAdapter.this.V != null && VungleAdapter.this.V.b() != null) {
                        for(int v = 0; v < VungleAdapter.this.V.b().size(); ++v) {
                            String s = (String)VungleAdapter.this.V.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "VungleAdapter videoMix onAdClick url : " + s);
                                E.g().d().a(VungleAdapter.this.P, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdEnd(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdEnd");
                if(VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.a();
                }
                VungleAdapter.this.U = false;
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToLoad(K k0, d1 d10) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdFailedToLoad : " + d10.getLocalizedMessage());
                VungleAdapter.this.a(false);
                if(VungleAdapter.this.U && VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.d(VungleAdapter.this.R);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToPlay(K k0, d1 d10) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdFailedToPlay : " + d10.getLocalizedMessage());
                if(VungleAdapter.this.U && VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.c(VungleAdapter.this.R);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdImpression(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdViewed");
                try {
                    if(VungleAdapter.this.V != null && VungleAdapter.this.V.j() != null) {
                        for(int v = 0; v < VungleAdapter.this.V.j().size(); ++v) {
                            String s = (String)VungleAdapter.this.V.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "VungleAdapter onAdViewed url : " + s);
                                E.g().d().a(VungleAdapter.this.P, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdLeftApplication(K k0) {
            }

            @Override  // com.vungle.ads.L
            public void onAdLoaded(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter videoMixInterstitialAd onAdLoad");
                VungleAdapter.this.a(false);
                if(VungleAdapter.this.U && VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.b(VungleAdapter.this.R);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdStart(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdStart");
                if(VungleAdapter.this.U && VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.a(VungleAdapter.this.R);
                }
            }
        };
        this.e0 = new S0() {
            final VungleAdapter a;

            @Override  // com.vungle.ads.L
            public void onAdClicked(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdClicked : " + VungleAdapter.this.l);
                if(VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.onClickAd();
                }
                try {
                    if(VungleAdapter.this.V != null && VungleAdapter.this.V.b() != null) {
                        for(int v = 0; v < VungleAdapter.this.V.b().size(); ++v) {
                            String s = (String)VungleAdapter.this.V.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "VungleAdapter videoMix onAdClick url : " + s);
                                E.g().d().a(VungleAdapter.this.P, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdEnd(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdEnd");
                if(VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.a();
                }
                VungleAdapter.this.U = false;
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToLoad(K k0, d1 d10) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdFailedToLoad onError : " + d10.getLocalizedMessage());
                if(VungleAdapter.this.U && VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.d(VungleAdapter.this.R);
                }
                VungleAdapter.this.a(true);
            }

            @Override  // com.vungle.ads.L
            public void onAdFailedToPlay(K k0, d1 d10) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdFailedToPlay : " + d10.getLocalizedMessage());
                if(VungleAdapter.this.U && VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.c(VungleAdapter.this.R);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdImpression(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdImpression");
                try {
                    if(VungleAdapter.this.V != null && VungleAdapter.this.V.j() != null) {
                        for(int v = 0; v < VungleAdapter.this.V.j().size(); ++v) {
                            String s = (String)VungleAdapter.this.V.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "VungleAdapter videoMix onAdImpression url : " + s);
                                E.g().d().a(VungleAdapter.this.P, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdLeftApplication(K k0) {
            }

            @Override  // com.vungle.ads.L
            public void onAdLoaded(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdLoaded : " + k0.getPlacementId());
                VungleAdapter.this.a(true);
                if(VungleAdapter.this.U && VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.b(VungleAdapter.this.R);
                }
            }

            @Override  // com.vungle.ads.S0
            public void onAdRewarded(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdRewarded");
                if(VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.a(i.r.b(), true);
                }
            }

            @Override  // com.vungle.ads.L
            public void onAdStart(K k0) {
                b.a(Thread.currentThread(), "VungleAdapter videoMix onAdStart");
                if(VungleAdapter.this.U && VungleAdapter.this.i != null) {
                    VungleAdapter.this.i.a(VungleAdapter.this.R);
                }
            }
        };
    }

    private void a(AdPopcornSSPNativeAd adPopcornSSPNativeAd0) {
        TextView textView3;
        MediaView mediaView0;
        TextView textView2;
        ImageView imageView0;
        TextView textView1;
        TextView textView0;
        int v = 0;
        ArrayList arrayList0 = new ArrayList();
        Button button0 = null;
        if(adPopcornSSPNativeAd0.getVungleViewBinder().titleViewId == 0) {
            textView0 = null;
        }
        else {
            textView0 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getVungleViewBinder().titleViewId);
            arrayList0.add(textView0);
        }
        if(adPopcornSSPNativeAd0.getVungleViewBinder().sponsoredByViewId == 0) {
            textView1 = null;
        }
        else {
            textView1 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getVungleViewBinder().sponsoredByViewId);
            arrayList0.add(textView1);
        }
        if(adPopcornSSPNativeAd0.getVungleViewBinder().iconViewId == 0) {
            imageView0 = null;
        }
        else {
            imageView0 = (ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getVungleViewBinder().iconViewId);
            arrayList0.add(imageView0);
        }
        if(adPopcornSSPNativeAd0.getVungleViewBinder().ratingViewId == 0) {
            textView2 = null;
        }
        else {
            textView2 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getVungleViewBinder().ratingViewId);
            arrayList0.add(textView2);
        }
        if(adPopcornSSPNativeAd0.getVungleViewBinder().mediaViewId == 0) {
            mediaView0 = null;
        }
        else {
            mediaView0 = (MediaView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getVungleViewBinder().mediaViewId);
            arrayList0.add(mediaView0);
        }
        if(adPopcornSSPNativeAd0.getVungleViewBinder().bodyViewId == 0) {
            textView3 = null;
        }
        else {
            textView3 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getVungleViewBinder().bodyViewId);
            arrayList0.add(textView3);
        }
        if(adPopcornSSPNativeAd0.getVungleViewBinder().ctaViewId != 0) {
            button0 = (Button)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getVungleViewBinder().ctaViewId);
            arrayList0.add(button0);
        }
        this.M.registerViewForInteraction(adPopcornSSPNativeAd0, mediaView0, imageView0, arrayList0);
        if(textView0 != null) {
            textView0.setText(this.M.getAdTitle());
        }
        if(textView3 != null) {
            textView3.setText(this.M.getAdBodyText());
        }
        if(textView2 != null && this.M.getAdStarRating() != null) {
            textView2.setText(String.format("Rating: %s", this.M.getAdStarRating()));
        }
        if(textView1 != null) {
            textView1.setText(this.M.getAdSponsoredText());
        }
        if(button0 != null) {
            button0.setText(this.M.getAdCallToActionText());
            if(!this.M.hasCallToAction()) {
                v = 8;
            }
            button0.setVisibility(v);
        }
    }

    private void a(boolean z) {
        try {
            if(z) {
                this.s = false;
                Handler handler0 = this.u;
                if(handler0 != null) {
                    handler0.removeCallbacks(this.w);
                }
            }
            else {
                this.t = false;
                Handler handler1 = this.u;
                if(handler1 != null) {
                    handler1.removeCallbacks(this.x);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
    }

    public void checkAdPopcornSSPReactNativeImpression() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void checkValidMediation() {
        this.A = new f0() {
            final VungleAdapter a;

            @Override  // com.vungle.ads.f0
            public void onError(d1 d10) {
            }

            @Override  // com.vungle.ads.f0
            public void onSuccess() {
            }
        };
        b.a(Thread.currentThread(), "VungleAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void destroyAd() {
        try {
            this.U = false;
            this.removeVideoMixTimeoutHandler();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.H;
            if(adPopcornSSPBannerAd0 != null) {
                adPopcornSSPBannerAd0.removeAllViews();
            }
            y y0 = this.J;
            if(y0 != null) {
                y0.finishAd();
                this.J.setAdListener(null);
                this.J = null;
            }
            this.stopBannerTimer();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitialVideoAd() {
        try {
            this.z = false;
            this.a(false);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyModalAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyNativeAd() {
        y0 y00 = this.M;
        if(y00 != null) {
            y00.unregisterView();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyReactNativeAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyRewardVideoAd() {
        try {
            this.y = false;
            this.a(true);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroySplashAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public String getBiddingToken(Context context0) {
        return VungleAds.getBiddingToken(context0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public String getNetworkName() [...] // 潜在的解密器

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void initializeSDK(Context context0, p0 p00, SdkInitListener sdkInitListener0) {
        try {
            b.a(Thread.currentThread(), "VungleAdapter initializeSDK");
            VungleAds.init(context0.getApplicationContext(), p00.a("vungle_app_id"), new f0() {
                final VungleAdapter b;

                @Override  // com.vungle.ads.f0
                public void onError(d1 d10) {
                    SdkInitListener sdkInitListener0 = sdkInitListener0;
                    if(sdkInitListener0 != null) {
                        sdkInitListener0.onInitializationFinished();
                    }
                }

                @Override  // com.vungle.ads.f0
                public void onSuccess() {
                    SdkInitListener sdkInitListener0 = sdkInitListener0;
                    if(sdkInitListener0 != null) {
                        sdkInitListener0.onInitializationFinished();
                    }
                }
            });
        }
        catch(NoClassDefFoundError unused_ex) {
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
            }
        }
        catch(NoSuchMethodError unused_ex) {
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
            }
        }
        catch(Exception unused_ex) {
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        try {
            AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.H;
            if(adPopcornSSPBannerAd0 != null) {
                adPopcornSSPBannerAd0.removeAllViews();
            }
            y y0 = this.J;
            if(y0 != null) {
                y0.finishAd();
                this.J.setAdListener(null);
                this.J = null;
            }
            this.stopBannerTimer();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void loadAd(Context context0, AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0, d0 d00, boolean z, int v, int v1) {
        try {
            b.a(Thread.currentThread(), "VungleAdapter videoMix loadAd : " + v1 + ", isInAppBidding : " + z);
            this.S = true;
            this.R = v;
            this.U = true;
            if(this.u == null) {
                this.u = new Handler();
            }
            if(this.T == null) {
                this.T = new Runnable() {
                    final VungleAdapter a;

                    @Override
                    public void run() {
                        if(VungleAdapter.this.S) {
                            b.b(Thread.currentThread(), "Time out in : Vungle");
                            if(VungleAdapter.this.i != null) {
                                VungleAdapter.this.i.d(VungleAdapter.this.R);
                            }
                        }
                    }
                };
            }
            this.u.postDelayed(this.T, adPopcornSSPVideoMixAd0.getNetworkScheduleTimeout());
            this.G = z;
            if(v1 != 4 && v1 != 6) {
                b.a(Thread.currentThread(), "VungleAdapter does not support videoMix campaign type");
                this.removeVideoMixTimeoutHandler();
                E0 e05 = this.i;
                if(e05 != null) {
                    e05.d(v);
                }
            }
            else {
                if(!z) {
                    this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                    this.W = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
                }
                else if(d00.b() != null && d00.b().get(0) != null) {
                    g g0 = (g)d00.b().get(0);
                    this.V = g0;
                    String s = g0.k();
                    if(s == null || s.isEmpty()) {
                        this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                        this.W = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
                    }
                    else {
                        this.W = p.a(s, "vungle_placement_id");
                    }
                }
                else {
                    this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                    this.W = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
                }
                b.a(Thread.currentThread(), "VungleAdapter videoMix appId : " + this.j + ", placementId : " + this.W);
                if(!VungleAds.isInitialized()) {
                    goto label_65;
                }
                b.a(Thread.currentThread(), "VungleAdapter videoMix already initialized and loadAd : " + this.G);
                if(v1 == 6) {
                    if(this.Y != null && !this.Y.getPlacementId().equals(this.W)) {
                        this.Y = null;
                    }
                    if(this.Y == null || !this.Y.canPlayAd().booleanValue()) {
                        g0 g00 = new g0(context0, this.W, new d());
                        this.Y = g00;
                        g00.setAdListener(this.d0);
                        if(this.G) {
                            this.Y.load(this.V.y());
                            return;
                        }
                        this.Y.load(null);
                        return;
                    }
                    b.a(Thread.currentThread(), "VungleAdapter videoMix canPlayAd");
                    this.removeVideoMixTimeoutHandler();
                    E0 e00 = this.i;
                    if(e00 != null) {
                        e00.b(this.R);
                    }
                }
                else {
                    if(this.X != null && !this.X.getPlacementId().equals(this.W)) {
                        this.X = null;
                    }
                    if(this.X == null || !this.X.canPlayAd().booleanValue()) {
                        R0 r00 = new R0(this.P, this.W, new d());
                        this.X = r00;
                        r00.setAdListener(this.e0);
                        if(this.G) {
                            this.X.load(this.V.y());
                            return;
                        }
                        this.X.load(null);
                        return;
                    }
                    b.a(Thread.currentThread(), "VungleAdapter videoMix canPlayAd");
                    this.a(true);
                    E0 e01 = this.i;
                    if(e01 != null) {
                        e01.b(v);
                        return;
                    label_65:
                        b.a(Thread.currentThread(), "VungleAdapter videoMix call init : " + this.G);
                        try {
                            VungleAds.init(context0.getApplicationContext(), this.j, new f0() {
                                final VungleAdapter b;

                                @Override  // com.vungle.ads.f0
                                public void onError(d1 d10) {
                                    b.a(Thread.currentThread(), "VungleAdapter videoMix init onError : " + d10.getLocalizedMessage());
                                    VungleAdapter.this.removeVideoMixTimeoutHandler();
                                    if(VungleAdapter.this.U && VungleAdapter.this.i != null) {
                                        VungleAdapter.this.i.d(VungleAdapter.this.R);
                                    }
                                }

                                @Override  // com.vungle.ads.f0
                                public void onSuccess() {
                                    b.a(Thread.currentThread(), "VungleAdapter videoMix init onSuccess : " + VungleAdapter.this.G);
                                    if(v1 == 6) {
                                        g0 g00 = new g0(VungleAdapter.this.P, VungleAdapter.this.W, new d());
                                        VungleAdapter.this.Y = g00;
                                        VungleAdapter.this.Y.setAdListener(VungleAdapter.this.d0);
                                        if(VungleAdapter.this.G) {
                                            VungleAdapter.this.Y.load(VungleAdapter.this.V.y());
                                            return;
                                        }
                                        VungleAdapter.this.Y.load(null);
                                        return;
                                    }
                                    R0 r00 = new R0(VungleAdapter.this.P, VungleAdapter.this.W, new d());
                                    VungleAdapter.this.X = r00;
                                    VungleAdapter.this.X.setAdListener(VungleAdapter.this.e0);
                                    if(VungleAdapter.this.G) {
                                        VungleAdapter.this.X.load(VungleAdapter.this.V.y());
                                        return;
                                    }
                                    VungleAdapter.this.X.load(null);
                                }
                            });
                        }
                        catch(NoClassDefFoundError noClassDefFoundError0) {
                            b.a(Thread.currentThread(), "VungleAdapter videoMix init noClassDefFoundError : " + noClassDefFoundError0.getMessage());
                            this.removeVideoMixTimeoutHandler();
                            E0 e02 = this.i;
                            if(e02 != null) {
                                e02.d(this.R);
                            }
                        }
                        catch(NoSuchMethodError noSuchMethodError0) {
                            b.a(Thread.currentThread(), "VungleAdapter videoMix init noSuchMethodError : " + noSuchMethodError0.getMessage());
                            this.removeVideoMixTimeoutHandler();
                            E0 e03 = this.i;
                            if(e03 != null) {
                                e03.d(this.R);
                            }
                        }
                        catch(Exception exception0) {
                            b.a(Thread.currentThread(), "VungleAdapter videoMix init exception : " + exception0.getMessage());
                            this.removeVideoMixTimeoutHandler();
                            E0 e04 = this.i;
                            if(e04 != null) {
                                e04.d(this.R);
                            }
                        }
                    }
                }
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "VungleAdapter videoMix exception");
            E0 e06 = this.i;
            if(e06 != null) {
                e06.d(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        T t0 = this.b;
        if(t0 != null) {
            t0.d(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitialVideoAd(Context context0, AdPopcornSSPInterstitialVideoAd adPopcornSSPInterstitialVideoAd0, d0 d00, boolean z, int v) {
        b.a(Thread.currentThread(), "VungleAdapter.loadInterstitialVideoAd() : " + z);
        this.P = context0;
        this.q = v;
        try {
            this.z = true;
            this.t = true;
            if(adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.u == null) {
                    this.u = new Handler();
                }
                if(this.x == null) {
                    this.x = new Runnable() {
                        final VungleAdapter a;

                        @Override
                        public void run() {
                            if(VungleAdapter.this.t) {
                                VungleAdapter.this.a(false);
                                b.b(Thread.currentThread(), "Time out in : Vungle");
                                if(VungleAdapter.this.z && VungleAdapter.this.e != null) {
                                    VungleAdapter.this.e.d(VungleAdapter.this.q);
                                }
                            }
                        }
                    };
                }
                this.u.postDelayed(this.x, adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout());
            }
            this.G = z;
            if(z) {
                if(d00 == null) {
                    throw new NullPointerException();
                }
                if(d00.b() == null || d00.b().get(0) == null) {
                    this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                    this.m = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
                }
                else {
                    g g0 = (g)d00.b().get(0);
                    this.E = g0;
                    String s = g0.k();
                    if(s == null || s.length() <= 0) {
                        this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                        this.m = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
                    }
                    else {
                        this.m = p.a(s, "vungle_placement_id");
                    }
                }
            }
            else {
                this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                this.m = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
            }
            b.a(Thread.currentThread(), "VungleAdapter loadInterstitialVideoAd appId : " + this.j + ", ivPlacementId : " + this.m);
            if(!VungleAds.isInitialized()) {
                b.a(Thread.currentThread(), "VungleAdapter IV call init : " + this.G);
                goto label_50;
            }
            b.a(Thread.currentThread(), "VungleAdapter loadInterstitialVideoAd already initialized and loadAd : " + this.G);
            if(this.N == null || !this.N.canPlayAd().booleanValue()) {
                g0 g00 = new g0(context0, this.m, new d());
                this.N = g00;
                g00.setAdListener(this.c0);
                if(this.G) {
                    this.N.load(this.E.y());
                    return;
                }
                this.N.load(null);
                return;
            }
            b.a(Thread.currentThread(), "VungleAdapter loadInterstitialVideoAd canPlayAd");
            this.a(false);
            if(this.z) {
                V v1 = this.e;
                if(v1 != null) {
                    v1.b(this.q);
                    return;
                }
            }
            return;
        }
        catch(Exception exception0) {
            goto label_77;
        }
        try {
        label_50:
            VungleAds.init(context0.getApplicationContext(), this.j, new f0() {
                final VungleAdapter a;

                @Override  // com.vungle.ads.f0
                public void onError(d1 d10) {
                    b.a(Thread.currentThread(), "VungleAdapter IV init onError : " + d10.getLocalizedMessage());
                    VungleAdapter.this.a(false);
                    if(VungleAdapter.this.z && VungleAdapter.this.e != null) {
                        VungleAdapter.this.e.d(VungleAdapter.this.q);
                    }
                }

                @Override  // com.vungle.ads.f0
                public void onSuccess() {
                    b.a(Thread.currentThread(), "VungleAdapter interstitial video init onSuccess : " + VungleAdapter.this.G);
                    d d0 = new d();
                    g0 g00 = new g0(VungleAdapter.this.P, VungleAdapter.this.m, d0);
                    VungleAdapter.this.N = g00;
                    VungleAdapter.this.N.setAdListener(VungleAdapter.this.c0);
                    if(VungleAdapter.this.G) {
                        VungleAdapter.this.N.load(VungleAdapter.this.E.y());
                        return;
                    }
                    VungleAdapter.this.N.load(null);
                }
            });
            return;
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
        }
        catch(NoSuchMethodError noSuchMethodError0) {
            goto label_61;
        }
        catch(Exception exception1) {
            goto label_69;
        }
        try {
            b.a(Thread.currentThread(), "VungleAdapter IV init noClassDefFoundError : " + noClassDefFoundError0.getMessage());
            this.a(false);
            if(this.z) {
                V v2 = this.e;
                if(v2 != null) {
                    v2.d(this.q);
                    return;
                label_61:
                    b.a(Thread.currentThread(), "VungleAdapter IV init noSuchMethodError : " + noSuchMethodError0.getMessage());
                    this.a(false);
                    if(this.z) {
                        V v3 = this.e;
                        if(v3 != null) {
                            v3.d(this.q);
                            return;
                        label_69:
                            b.a(Thread.currentThread(), "VungleAdapter IV init exception : " + exception1.getMessage());
                            this.a(false);
                            if(this.z) {
                                V v4 = this.e;
                                if(v4 != null) {
                                    v4.d(this.q);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
    label_77:
        this.a(false);
        b.a(Thread.currentThread(), exception0);
        if(this.z) {
            V v5 = this.e;
            if(v5 != null) {
                v5.d(this.q);
            }
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
        b.a(Thread.currentThread(), "VungleAdapter.loadNativeAd()");
        this.P = context0;
        this.r = v;
        this.O = adPopcornSSPNativeAd0;
        try {
            this.G = z;
            if(z) {
                if(d00 == null) {
                    throw new NullPointerException();
                }
                if(d00.b() == null || d00.b().get(0) == null) {
                    this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                    this.n = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
                }
                else {
                    g g0 = (g)d00.b().get(0);
                    this.F = g0;
                    String s = g0.k();
                    if(s == null || s.length() <= 0) {
                        this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                        this.n = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
                    }
                    else {
                        this.n = p.a(s, "vungle_placement_id");
                    }
                }
            }
            else {
                this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                this.n = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
            }
            if(VungleAds.isInitialized()) {
                b.a(Thread.currentThread(), "VungleAdapter already initialized and loadAd : " + this.n + ", isInappBiddingMode : " + this.G);
                y0 y00 = new y0(context0, this.n);
                this.M = y00;
                y00.setAdListener(this.b0);
                if(this.G) {
                    this.M.load(this.F.y());
                    return;
                }
                this.M.load(null);
                return;
            }
            b.a(Thread.currentThread(), "VungleAdapter call init : " + this.n + ", isInappBiddingMode : " + this.G);
        }
        catch(Exception exception0) {
            goto label_55;
        }
        try {
            VungleAds.init(context0.getApplicationContext(), this.j, new f0() {
                final VungleAdapter a;

                @Override  // com.vungle.ads.f0
                public void onError(d1 d10) {
                    b.a(Thread.currentThread(), "VungleAdapter init onError : " + d10.getLocalizedMessage());
                    if(VungleAdapter.this.c != null) {
                        VungleAdapter.this.c.a(VungleAdapter.this.r, 0);
                    }
                }

                @Override  // com.vungle.ads.f0
                public void onSuccess() {
                    b.a(Thread.currentThread(), "VungleAdapter nativeAd init onSuccess : " + VungleAdapter.this.G);
                    y0 y00 = new y0(VungleAdapter.this.P, VungleAdapter.this.n);
                    VungleAdapter.this.M = y00;
                    VungleAdapter.this.M.setAdListener(VungleAdapter.this.b0);
                    if(VungleAdapter.this.G) {
                        VungleAdapter.this.M.load(VungleAdapter.this.F.y());
                        return;
                    }
                    VungleAdapter.this.M.load(null);
                }
            });
            return;
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
        }
        catch(NoSuchMethodError noSuchMethodError0) {
            goto label_43;
        }
        catch(Exception exception1) {
            goto label_49;
        }
        try {
            b.a(Thread.currentThread(), "VungleAdapter init noClassDefFoundError : " + noClassDefFoundError0.getMessage());
            c0 c00 = this.c;
            if(c00 != null) {
                c00.a(this.r, 0);
                return;
            label_43:
                b.a(Thread.currentThread(), "VungleAdapter init noSuchMethodError : " + noSuchMethodError0.getMessage());
                c0 c01 = this.c;
                if(c01 != null) {
                    c01.a(this.r, 0);
                    return;
                label_49:
                    b.a(Thread.currentThread(), "VungleAdapter init exception : " + exception1.getMessage());
                    c0 c02 = this.c;
                    if(c02 != null) {
                        c02.a(this.r, 0);
                        return;
                    }
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
    label_55:
        b.a(Thread.currentThread(), exception0);
        c0 c03 = this.c;
        if(c03 != null) {
            c03.a(this.r, 0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadReactNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0) {
        com.igaworks.ssp.g0 g00 = this.g;
        if(g00 != null) {
            g00.a(v, 2);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadRewardVideoAd(Context context0, AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0, d0 d00, boolean z, int v) {
        b.a(Thread.currentThread(), "VungleAdapter.loadRewardVideoAd() : " + z);
        this.P = context0;
        this.p = v;
        try {
            this.y = true;
            this.s = true;
            if(adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.u == null) {
                    this.u = new Handler();
                }
                if(this.w == null) {
                    this.w = new Runnable() {
                        final VungleAdapter a;

                        @Override
                        public void run() {
                            if(VungleAdapter.this.s) {
                                b.b(Thread.currentThread(), "Time out in : Vungle");
                                VungleAdapter.this.a(true);
                                if(VungleAdapter.this.y && VungleAdapter.this.d != null) {
                                    VungleAdapter.this.d.d(VungleAdapter.this.p);
                                }
                            }
                        }
                    };
                }
                this.u.postDelayed(this.w, adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout());
            }
            this.G = z;
            if(z) {
                if(d00 == null) {
                    throw new NullPointerException();
                }
                if(d00.b() == null || d00.b().get(0) == null) {
                    this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                    this.l = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
                }
                else {
                    g g0 = (g)d00.b().get(0);
                    this.D = g0;
                    String s = g0.k();
                    if(s == null || s.length() <= 0) {
                        this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                        this.l = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
                    }
                    else {
                        this.l = p.a(s, "vungle_placement_id");
                    }
                }
            }
            else {
                this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                this.l = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
            }
            if(!VungleAds.isInitialized()) {
                b.a(Thread.currentThread(), "VungleAdapter call init : " + this.l + ", isInappBiddingMode : " + this.G);
                goto label_49;
            }
            b.a(Thread.currentThread(), "VungleAdapter already initialized and loadAd : " + this.l + ", isInappBiddingMode : " + this.G);
            if(this.L == null || !this.L.canPlayAd().booleanValue()) {
                R0 r00 = new R0(this.P, this.l, new d());
                this.L = r00;
                r00.setAdListener(this.a0);
                if(this.G) {
                    this.L.load(this.D.y());
                    return;
                }
                this.L.load(null);
                return;
            }
            b.a(Thread.currentThread(), "VungleAdapter loadRewardVideoAd canPlayAd : " + this.l);
            this.a(true);
            if(this.y) {
                l0 l00 = this.d;
                if(l00 != null) {
                    l00.b(v);
                    return;
                }
            }
            return;
        }
        catch(Exception exception0) {
            goto label_76;
        }
        try {
        label_49:
            VungleAds.init(context0.getApplicationContext(), this.j, new f0() {
                final VungleAdapter a;

                @Override  // com.vungle.ads.f0
                public void onError(d1 d10) {
                    b.a(Thread.currentThread(), "VungleAdapter init onError : " + d10.getLocalizedMessage());
                    VungleAdapter.this.a(true);
                    if(VungleAdapter.this.y && VungleAdapter.this.d != null) {
                        VungleAdapter.this.d.d(VungleAdapter.this.p);
                    }
                }

                @Override  // com.vungle.ads.f0
                public void onSuccess() {
                    b.a(Thread.currentThread(), "VungleAdapter reward video init onSuccess : " + VungleAdapter.this.G);
                    d d0 = new d();
                    R0 r00 = new R0(VungleAdapter.this.P, VungleAdapter.this.l, d0);
                    VungleAdapter.this.L = r00;
                    VungleAdapter.this.L.setAdListener(VungleAdapter.this.a0);
                    if(VungleAdapter.this.G) {
                        VungleAdapter.this.L.load(VungleAdapter.this.D.y());
                        return;
                    }
                    VungleAdapter.this.L.load(null);
                }
            });
            return;
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
        }
        catch(NoSuchMethodError noSuchMethodError0) {
            goto label_60;
        }
        catch(Exception exception1) {
            goto label_68;
        }
        try {
            b.a(Thread.currentThread(), "VungleAdapter init noClassDefFoundError : " + noClassDefFoundError0.getMessage());
            this.a(true);
            if(this.y) {
                l0 l01 = this.d;
                if(l01 != null) {
                    l01.d(this.p);
                    return;
                label_60:
                    b.a(Thread.currentThread(), "VungleAdapter init noSuchMethodError : " + noSuchMethodError0.getMessage());
                    this.a(true);
                    if(this.y) {
                        l0 l02 = this.d;
                        if(l02 != null) {
                            l02.d(this.p);
                            return;
                        label_68:
                            b.a(Thread.currentThread(), "VungleAdapter init exception : " + exception1.getMessage());
                            this.a(true);
                            if(this.y) {
                                l0 l03 = this.d;
                                if(l03 != null) {
                                    l03.d(this.p);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
    label_76:
        this.a(true);
        b.a(Thread.currentThread(), exception0);
        if(this.y) {
            l0 l04 = this.d;
            if(l04 != null) {
                l04.d(this.p);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadSplashAd(Context context0, d0 d00, int v, AdPopcornSSPSplashAd adPopcornSSPSplashAd0) {
        r0 r00 = this.f;
        if(r00 != null) {
            r00.a(v, 2);
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

    public void removeVideoMixTimeoutHandler() {
        try {
            this.S = false;
            Handler handler0 = this.u;
            if(handler0 != null) {
                handler0.removeCallbacks(this.T);
            }
        }
        catch(Exception unused_ex) {
        }
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
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setInterstitialMediationAdapterEventListener(T t0) {
        this.b = t0;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setInterstitialVideoMediationAdapterEventListener(V v0) {
        this.e = v0;
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
        this.c = c00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setReactNativeMediationAdapterEventListener(com.igaworks.ssp.g0 g00) {
        this.g = g00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setRewardVideoMediationAdapterEventListener(l0 l00) {
        this.d = l00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setSplashMediationAdapterEventListener(r0 r00) {
        this.f = r00;
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void showAd(Context context0, d0 d00, boolean z, int v, int v1) {
        try {
            b.a(Thread.currentThread(), "VungleAdapter videoMix showAd : " + v1 + ", isInAppBidding : " + z);
            this.P = context0;
            this.G = z;
            switch(v1) {
                case 4: {
                    if(this.X != null && this.X.canPlayAd().booleanValue()) {
                        this.X.play(this.P);
                        return;
                    }
                    if(this.U) {
                        E0 e01 = this.i;
                        if(e01 != null) {
                            e01.c(v);
                            return;
                        }
                    }
                    break;
                }
                case 6: {
                    if(this.Y != null && this.Y.canPlayAd().booleanValue()) {
                        this.Y.play(this.P);
                        return;
                    }
                    if(this.U) {
                        E0 e02 = this.i;
                        if(e02 != null) {
                            e02.c(v);
                            return;
                        }
                    }
                    break;
                }
                default: {
                    b.a(Thread.currentThread(), "VungleAdapter is not supported videoMix campaign type");
                    E0 e00 = this.i;
                    if(e00 != null) {
                        e00.c(v);
                    }
                }
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "VungleAdapter videoMix exception");
            E0 e03 = this.i;
            if(e03 != null) {
                e03.c(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        T t0 = this.b;
        if(t0 != null) {
            t0.c(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitialVideoAd(Context context0, d0 d00, boolean z, int v) {
        try {
            b.a(Thread.currentThread(), "VungleAdapter.showInterstitialVideoAd() : " + z);
            this.P = context0;
            this.G = z;
            if(this.N != null && this.N.canPlayAd().booleanValue()) {
                this.N.play(this.P);
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            if(this.z) {
                V v1 = this.e;
                if(v1 != null) {
                    v1.c(v);
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showRewardVideoAd(Context context0, d0 d00, boolean z, int v) {
        try {
            b.a(Thread.currentThread(), "VungleAdapter.showRewardVideoAd() : " + z);
            this.P = context0;
            this.G = z;
            if(this.L != null && this.L.canPlayAd().booleanValue()) {
                this.L.play(this.P);
                return;
            }
            if(this.y) {
                l0 l00 = this.d;
                if(l00 != null) {
                    l00.c(v);
                }
            }
        }
        catch(Exception unused_ex) {
            if(this.y) {
                l0 l01 = this.d;
                if(l01 != null) {
                    l01.c(v);
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void startBannerAd(Context context0, AdSize adSize0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, d0 d00, boolean z, int v) {
        try {
            this.P = context0;
            this.H = adPopcornSSPBannerAd0;
            this.B = true;
            this.o = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.Q == null) {
                    this.Q = new Handler();
                }
                if(this.v == null) {
                    this.v = new Runnable() {
                        final VungleAdapter a;

                        @Override
                        public void run() {
                            if(VungleAdapter.this.B) {
                                b.b(Thread.currentThread(), "Time out in : Vungle");
                                if(VungleAdapter.this.a != null) {
                                    VungleAdapter.this.a.a(VungleAdapter.this.o);
                                }
                            }
                        }
                    };
                }
                this.Q.postDelayed(this.v, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            b.a(Thread.currentThread(), "VungleAdapter  startBannerAd(), isInAppBidding : " + z);
            this.G = z;
            if(z) {
                if(d00 == null) {
                    throw new NullPointerException();
                }
                if(d00.b() == null || d00.b().get(0) == null) {
                    this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                    this.k = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
                }
                else {
                    g g0 = (g)d00.b().get(0);
                    this.C = g0;
                    String s = g0.k();
                    if(s == null || s.length() <= 0) {
                        this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                        this.k = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
                    }
                    else {
                        this.k = p.a(s, "vungle_placement_id");
                    }
                }
            }
            else {
                this.j = ((a0)d00.e().a().get(v)).a("VungleAppId");
                this.k = ((a0)d00.e().a().get(v)).a("VunglePlacementId");
            }
            if(adSize0 == AdSize.BANNER_320x50) {
                this.I = G.BANNER;
            }
            else {
                if(adSize0 != AdSize.BANNER_300x250) {
                    b.a(Thread.currentThread(), "VungleAdapter BANNER_320x100 is not supported");
                    this.stopBannerTimer();
                    C c0 = this.a;
                    if(c0 != null) {
                        c0.a(v);
                    }
                    return;
                }
                this.I = G.VUNGLE_MREC;
            }
            if(VungleAds.isInitialized()) {
                b.a(Thread.currentThread(), "VungleAdapter already initialized and loadAd : " + this.G);
                y y0 = new y(context0, this.k, this.I);
                this.J = y0;
                y0.setAdListener(this.Z);
                if(z) {
                    this.J.load(this.C.y());
                    return;
                }
                this.J.load(null);
                return;
            }
            b.a(Thread.currentThread(), "VungleAdapter call init : " + this.G);
        }
        catch(Exception exception0) {
            goto label_76;
        }
        try {
            VungleAds.init(context0.getApplicationContext(), this.j, new f0() {
                final VungleAdapter b;

                @Override  // com.vungle.ads.f0
                public void onError(d1 d10) {
                    b.a(Thread.currentThread(), "VungleAdapter init onError : " + d10.getLocalizedMessage());
                    VungleAdapter.this.stopBannerTimer();
                    if(VungleAdapter.this.a != null) {
                        VungleAdapter.this.a.a(VungleAdapter.this.o);
                    }
                }

                @Override  // com.vungle.ads.f0
                public void onSuccess() {
                    b.a(Thread.currentThread(), "VungleAdapter banner init onSuccess : " + VungleAdapter.this.G);
                    y y0 = new y(VungleAdapter.this.P, VungleAdapter.this.k, VungleAdapter.this.I);
                    VungleAdapter.this.J = y0;
                    VungleAdapter.this.J.setAdListener(VungleAdapter.this.Z);
                    if(z) {
                        VungleAdapter.this.J.load(VungleAdapter.this.C.y());
                        return;
                    }
                    VungleAdapter.this.J.load(null);
                }
            });
            return;
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
        }
        catch(NoSuchMethodError noSuchMethodError0) {
            goto label_62;
        }
        catch(Exception exception1) {
            goto label_69;
        }
        try {
            b.a(Thread.currentThread(), "VungleAdapter init noClassDefFoundError : " + noClassDefFoundError0.getMessage());
            this.stopBannerTimer();
            C c1 = this.a;
            if(c1 != null) {
                c1.a(this.o);
                return;
            label_62:
                b.a(Thread.currentThread(), "VungleAdapter init NoSuchMethodError : " + noSuchMethodError0.getMessage());
                this.stopBannerTimer();
                C c2 = this.a;
                if(c2 != null) {
                    c2.a(this.o);
                    return;
                label_69:
                    b.a(Thread.currentThread(), "VungleAdapter init Exception : " + exception1.getMessage());
                    this.stopBannerTimer();
                    C c3 = this.a;
                    if(c3 != null) {
                        c3.a(this.o);
                        return;
                    }
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
    label_76:
        this.stopBannerTimer();
        C c4 = this.a;
        if(c4 != null) {
            c4.a(this.o);
        }
        b.a(Thread.currentThread(), exception0);
    }

    public void stopBannerTimer() {
        try {
            this.B = false;
            Handler handler0 = this.Q;
            if(handler0 != null) {
                handler0.removeCallbacks(this.v);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

