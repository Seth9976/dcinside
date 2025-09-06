package com.igaworks.ssp.common.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
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
import com.igaworks.ssp.g0;
import com.igaworks.ssp.g;
import com.igaworks.ssp.i;
import com.igaworks.ssp.l0;
import com.igaworks.ssp.n.d;
import com.igaworks.ssp.n;
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
import java.util.ArrayList;
import java.util.HashMap;

public class PangleAdapter implements BaseMediationAdapter, VideoMixAdMediationAdapter {
    private PAGBannerSize A;
    private PAGBannerAd B;
    private PAGRewardedAd C;
    private PAGInterstitialAd D;
    private View E;
    private boolean F;
    private Handler G;
    private Runnable H;
    private boolean I;
    private Context J;
    private g K;
    private g L;
    private g M;
    private g N;
    private int O;
    private boolean P;
    private Runnable Q;
    private boolean R;
    private String S;
    private PAGRewardedAd T;
    private PAGInterstitialAd U;
    private g V;
    private final PAGRewardedAdLoadListener W;
    private final PAGRewardedAdInteractionListener X;
    private final PAGInterstitialAdLoadListener Y;
    private PAGInterstitialAdInteractionListener Z;
    private C a;
    private final PAGInterstitialAdLoadListener a0;
    private T b;
    private final PAGRewardedAdLoadListener b0;
    private c0 c;
    private final PAGInterstitialAdInteractionListener c0;
    private l0 d;
    private final PAGRewardedAdInteractionListener d0;
    private V e;
    private r0 f;
    private g0 g;
    private b0 h;
    private E0 i;
    private String j;
    private String k;
    private String l;
    private String m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private Handler u;
    private Runnable v;
    private Runnable w;
    private boolean x;
    private boolean y;
    private PAGInitCallback z;

    public PangleAdapter() {
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = new Handler(Looper.getMainLooper());
        this.x = false;
        this.y = false;
        this.F = false;
        this.G = new Handler(Looper.getMainLooper());
        this.I = false;
        this.O = 0;
        this.P = true;
        this.R = false;
        this.S = "";
        this.W = new PAGRewardedAdLoadListener() {
            final PangleAdapter a;

            public void a(PAGRewardedAd pAGRewardedAd0) {
                b.a(Thread.currentThread(), "PangleAdapter onAdLoaded");
                PangleAdapter.this.a(true);
                PangleAdapter.this.C = pAGRewardedAd0;
                if(PangleAdapter.this.x && PangleAdapter.this.d != null) {
                    PangleAdapter.this.d.b(PangleAdapter.this.p);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(Object object0) {
                this.a(((PAGRewardedAd)object0));
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onError(int v, String s) {
                b.a(Thread.currentThread(), "PangleAdapter onError : " + v + ", message : " + s);
                PangleAdapter.this.a(true);
                if(PangleAdapter.this.x && PangleAdapter.this.d != null) {
                    PangleAdapter.this.d.d(PangleAdapter.this.p);
                }
            }
        };
        this.X = new PAGRewardedAdInteractionListener() {
            final PangleAdapter a;

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdClicked() {
                b.a(Thread.currentThread(), "PangleAdapter onAdClicked");
                if(PangleAdapter.this.d != null) {
                    PangleAdapter.this.d.onClickAd();
                }
                try {
                    if(PangleAdapter.this.L != null && PangleAdapter.this.L.b() != null) {
                        for(int v = 0; v < PangleAdapter.this.L.b().size(); ++v) {
                            String s = (String)PangleAdapter.this.L.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "PangleAdapter onAdClicked url : " + s);
                                E.g().d().a(PangleAdapter.this.J, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdDismissed() {
                try {
                    b.a(Thread.currentThread(), "PangleAdapter.onAdDismissed()");
                    if(PangleAdapter.this.d != null) {
                        PangleAdapter.this.d.a();
                    }
                }
                catch(Exception unused_ex) {
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdShowed() {
                b.a(Thread.currentThread(), "PangleAdapter onAdShowed");
                if(PangleAdapter.this.x && PangleAdapter.this.d != null) {
                    PangleAdapter.this.d.a(PangleAdapter.this.p);
                }
                try {
                    if(PangleAdapter.this.L != null && PangleAdapter.this.L.j() != null) {
                        for(int v = 0; v < PangleAdapter.this.L.j().size(); ++v) {
                            String s = (String)PangleAdapter.this.L.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "PangleAdapter onAdImpression url : " + s);
                                E.g().d().a(PangleAdapter.this.J, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
            public void onUserEarnedReward(PAGRewardItem pAGRewardItem0) {
                b.a(Thread.currentThread(), "PangleAdapter onUserEarnedReward");
                if(PangleAdapter.this.d != null) {
                    PangleAdapter.this.d.a(i.v.b(), true);
                }
                PangleAdapter.this.x = false;
            }

            @Override  // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
            public void onUserEarnedRewardFail(int v, String s) {
                b.a(Thread.currentThread(), "PangleAdapter onUserEarnedRewardFail : " + s);
                if(PangleAdapter.this.d != null) {
                    PangleAdapter.this.d.a(i.v.b(), false);
                }
                PangleAdapter.this.x = false;
            }
        };
        this.Y = new PAGInterstitialAdLoadListener() {
            final PangleAdapter a;

            public void a(PAGInterstitialAd pAGInterstitialAd0) {
                b.a(Thread.currentThread(), "PangleAdapter onFullScreenVideoCached");
                PangleAdapter.this.a(false);
                PangleAdapter.this.D = pAGInterstitialAd0;
                if(PangleAdapter.this.y && PangleAdapter.this.e != null) {
                    PangleAdapter.this.e.b(PangleAdapter.this.q);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(Object object0) {
                this.a(((PAGInterstitialAd)object0));
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onError(int v, String s) {
                b.a(Thread.currentThread(), "PangleAdapter load fail : " + v);
                PangleAdapter.this.a(false);
                if(PangleAdapter.this.y && PangleAdapter.this.e != null) {
                    PangleAdapter.this.e.d(PangleAdapter.this.q);
                }
            }
        };
        this.Z = new PAGInterstitialAdInteractionListener() {
            final PangleAdapter a;

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdClicked() {
                b.a(Thread.currentThread(), "PangleAdapter.onAdClicked()");
                if(PangleAdapter.this.e != null) {
                    PangleAdapter.this.e.onClickAd();
                }
                try {
                    if(PangleAdapter.this.M != null && PangleAdapter.this.M.b() != null) {
                        for(int v = 0; v < PangleAdapter.this.M.b().size(); ++v) {
                            String s = (String)PangleAdapter.this.M.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "PangleAdapter onAdShowed url : " + s);
                                E.g().d().a(PangleAdapter.this.J, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdDismissed() {
                try {
                    b.a(Thread.currentThread(), "PangleAdapter.onAdClose()");
                    if(PangleAdapter.this.e != null) {
                        PangleAdapter.this.e.a();
                    }
                }
                catch(Exception unused_ex) {
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdShowed() {
                b.a(Thread.currentThread(), "PangleAdapter onAdShow");
                if(PangleAdapter.this.y && PangleAdapter.this.e != null) {
                    PangleAdapter.this.e.a(PangleAdapter.this.q);
                }
                try {
                    if(PangleAdapter.this.M != null && PangleAdapter.this.M.j() != null) {
                        for(int v = 0; v < PangleAdapter.this.M.j().size(); ++v) {
                            String s = (String)PangleAdapter.this.M.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "PangleAdapter onAdShowed url : " + s);
                                E.g().d().a(PangleAdapter.this.J, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }
        };
        this.a0 = new PAGInterstitialAdLoadListener() {
            final PangleAdapter a;

            public void a(PAGInterstitialAd pAGInterstitialAd0) {
                b.a(Thread.currentThread(), "PangleAdapter videoMix onAdLoaded");
                PangleAdapter.this.removeVideoMixTimeoutHandler();
                PangleAdapter.this.U = pAGInterstitialAd0;
                if(PangleAdapter.this.R && PangleAdapter.this.i != null) {
                    PangleAdapter.this.i.b(PangleAdapter.this.O);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(Object object0) {
                this.a(((PAGInterstitialAd)object0));
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onError(int v, String s) {
                b.a(Thread.currentThread(), "PangleAdapter videoMix onError : " + v + ", message : " + s);
                PangleAdapter.this.removeVideoMixTimeoutHandler();
                if(PangleAdapter.this.R && PangleAdapter.this.i != null) {
                    PangleAdapter.this.i.d(PangleAdapter.this.O);
                }
            }
        };
        this.b0 = new PAGRewardedAdLoadListener() {
            final PangleAdapter a;

            public void a(PAGRewardedAd pAGRewardedAd0) {
                b.a(Thread.currentThread(), "PangleAdapter videoMix onAdLoaded");
                PangleAdapter.this.removeVideoMixTimeoutHandler();
                PangleAdapter.this.T = pAGRewardedAd0;
                if(PangleAdapter.this.R && PangleAdapter.this.i != null) {
                    PangleAdapter.this.i.b(PangleAdapter.this.O);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(Object object0) {
                this.a(((PAGRewardedAd)object0));
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onError(int v, String s) {
                b.a(Thread.currentThread(), "PangleAdapter videoMix onError : " + v + ", message : " + s);
                PangleAdapter.this.removeVideoMixTimeoutHandler();
                if(PangleAdapter.this.R && PangleAdapter.this.i != null) {
                    PangleAdapter.this.i.d(PangleAdapter.this.O);
                }
            }
        };
        this.c0 = new PAGInterstitialAdInteractionListener() {
            final PangleAdapter a;

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdClicked() {
                b.a(Thread.currentThread(), "PangleAdapter videoMix onAdClicked()");
                if(PangleAdapter.this.i != null) {
                    PangleAdapter.this.i.onClickAd();
                }
                try {
                    if(PangleAdapter.this.V != null && PangleAdapter.this.V.b() != null) {
                        for(int v = 0; v < PangleAdapter.this.V.b().size(); ++v) {
                            String s = (String)PangleAdapter.this.V.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "PangleAdapter videoMix onAdClicked url : " + s);
                                E.g().d().a(PangleAdapter.this.J, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdDismissed() {
                try {
                    b.a(Thread.currentThread(), "PangleAdapter videoMix onAdClose()");
                    if(PangleAdapter.this.i != null) {
                        PangleAdapter.this.i.a();
                    }
                }
                catch(Exception unused_ex) {
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdShowed() {
                b.a(Thread.currentThread(), "PangleAdapter videoMix onAdShow");
                if(PangleAdapter.this.R && PangleAdapter.this.i != null) {
                    PangleAdapter.this.i.a(PangleAdapter.this.O);
                }
                try {
                    if(PangleAdapter.this.V != null && PangleAdapter.this.V.j() != null) {
                        for(int v = 0; v < PangleAdapter.this.V.j().size(); ++v) {
                            String s = (String)PangleAdapter.this.V.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "PangleAdapter videoMix onAdShowed url : " + s);
                                E.g().d().a(PangleAdapter.this.J, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }
        };
        this.d0 = new PAGRewardedAdInteractionListener() {
            final PangleAdapter a;

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdClicked() {
                b.a(Thread.currentThread(), "PangleAdapter videoMix onAdClicked");
                if(PangleAdapter.this.i != null) {
                    PangleAdapter.this.i.onClickAd();
                }
                try {
                    if(PangleAdapter.this.V != null && PangleAdapter.this.V.b() != null) {
                        for(int v = 0; v < PangleAdapter.this.V.b().size(); ++v) {
                            String s = (String)PangleAdapter.this.V.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "PangleAdapter videoMix onAdClicked url : " + s);
                                E.g().d().a(PangleAdapter.this.J, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdDismissed() {
                try {
                    b.a(Thread.currentThread(), "PangleAdapter videoMix onAdDismissed()");
                    if(PangleAdapter.this.i != null) {
                        PangleAdapter.this.i.a();
                    }
                }
                catch(Exception unused_ex) {
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdShowed() {
                b.a(Thread.currentThread(), "PangleAdapter videoMix onAdShowed");
                if(PangleAdapter.this.x && PangleAdapter.this.i != null) {
                    PangleAdapter.this.i.a(PangleAdapter.this.O);
                }
                try {
                    if(PangleAdapter.this.V != null && PangleAdapter.this.V.j() != null) {
                        for(int v = 0; v < PangleAdapter.this.V.j().size(); ++v) {
                            String s = (String)PangleAdapter.this.V.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "PangleAdapter videoMix url : " + s);
                                E.g().d().a(PangleAdapter.this.J, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
            public void onUserEarnedReward(PAGRewardItem pAGRewardItem0) {
                b.a(Thread.currentThread(), "PangleAdapter videoMix onUserEarnedReward");
                if(PangleAdapter.this.i != null) {
                    PangleAdapter.this.i.a(i.v.b(), true);
                }
                PangleAdapter.this.R = false;
            }

            @Override  // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
            public void onUserEarnedRewardFail(int v, String s) {
                b.a(Thread.currentThread(), "PangleAdapter videoMix onUserEarnedRewardFail : " + s);
                if(PangleAdapter.this.i != null) {
                    PangleAdapter.this.i.a(i.v.b(), false);
                }
                PangleAdapter.this.R = false;
            }
        };
    }

    // 去混淆评级： 中等(60)
    private PAGConfig a(String s) {
        return new Builder().appId(s).supportMultiProcess(false).setUserData("[{\"name\":\"mediation\",\"value\":\"AdPopcorn\"},{\"name\":\"adapter_version\",\"value\":\"3.8.2\"}]").build();
    }

    private void a(Context context0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0) {
        PAGBannerRequest pAGBannerRequest0 = new PAGBannerRequest(this.A);
        if(this.I) {
            pAGBannerRequest0.setAdString(this.K.y());
        }
        PAGBannerAd.loadAd(this.j, pAGBannerRequest0, new PAGBannerAdLoadListener() {
            final PangleAdapter b;

            public void a(PAGBannerAd pAGBannerAd0) {
                try {
                    if(pAGBannerAd0 == null) {
                        b.a(Thread.currentThread(), "PangleAdapter banner onAdLoaded No Ads");
                        PangleAdapter.this.stopBannerTimer();
                        if(PangleAdapter.this.a != null) {
                            PangleAdapter.this.a.a(PangleAdapter.this.n);
                            return;
                        }
                        return;
                    }
                    PangleAdapter.this.B = pAGBannerAd0;
                    b.a(Thread.currentThread(), "PangleAdapter banner onAdLoaded");
                }
                catch(Exception exception0) {
                    goto label_28;
                }
                try {
                    adPopcornSSPBannerAd0.removeAllViewsInLayout();
                    adPopcornSSPBannerAd0.removeAllViews();
                    View view0 = PangleAdapter.this.B.getBannerView();
                    adPopcornSSPBannerAd0.addView(view0);
                    PangleAdapter.this.stopBannerTimer();
                    if(PangleAdapter.this.a != null) {
                        PangleAdapter.this.a.b(PangleAdapter.this.n);
                    }
                    if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                        adPopcornSSPBannerAd0.setVisibility(4);
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            final com.igaworks.ssp.common.adapter.PangleAdapter.4 a;

                            @Override
                            public void run() {
                                AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                try {
                                    try {
                                        PangleAdapter.this.B.getBannerView().buildDrawingCache();
                                        Bitmap bitmap0 = PangleAdapter.this.B.getBannerView().getDrawingCache();
                                        if(bitmap0 != null) {
                                            int v = bitmap0.getPixel(1, 1);
                                            com.igaworks.ssp.common.adapter.PangleAdapter.4.this.a.setBackgroundColor(v);
                                        }
                                        goto label_17;
                                    }
                                    catch(Exception exception0) {
                                    }
                                    b.a(Thread.currentThread(), exception0);
                                    adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.PangleAdapter.4.this.a;
                                    if(adPopcornSSPBannerAd0 != null) {
                                        goto label_10;
                                    }
                                    return;
                                }
                                catch(Throwable throwable0) {
                                    goto label_13;
                                }
                            label_10:
                                adPopcornSSPBannerAd0.setVisibility(0);
                                return;
                            label_13:
                                AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.PangleAdapter.4.this.a;
                                if(adPopcornSSPBannerAd1 != null) {
                                    adPopcornSSPBannerAd1.setVisibility(0);
                                }
                                throw throwable0;
                            label_17:
                                adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.PangleAdapter.4.this.a;
                                if(adPopcornSSPBannerAd0 != null) {
                                    adPopcornSSPBannerAd0.setVisibility(0);
                                }
                            }
                        }, 350L);
                    }
                    goto label_25;
                }
                catch(Exception exception1) {
                }
                try {
                    b.a(Thread.currentThread(), exception1);
                    PangleAdapter.this.stopBannerTimer();
                    if(PangleAdapter.this.a != null) {
                        PangleAdapter.this.a.a(PangleAdapter.this.n);
                    }
                label_25:
                    PangleAdapter.this.B.setAdInteractionListener(new PAGBannerAdInteractionListener() {
                        final com.igaworks.ssp.common.adapter.PangleAdapter.4 a;

                        @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
                        public void onAdClicked() {
                            b.a(Thread.currentThread(), "PangleAdapter banner onAdClicked");
                            if(PangleAdapter.this.a != null) {
                                PangleAdapter.this.a.a();
                            }
                            try {
                                if(PangleAdapter.this.K != null && PangleAdapter.this.K.b() != null) {
                                    for(int v = 0; v < PangleAdapter.this.K.b().size(); ++v) {
                                        String s = (String)PangleAdapter.this.K.b().get(v);
                                        if(s0.a(s)) {
                                            b.c(Thread.currentThread(), "PangleAdapter onAdClicked url : " + s);
                                            E.g().d().a(PangleAdapter.this.J, e.i, s);
                                        }
                                    }
                                }
                            }
                            catch(Exception exception0) {
                                exception0.printStackTrace();
                            }
                        }

                        @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
                        public void onAdDismissed() {
                            b.a(Thread.currentThread(), "PangleAdapter banner onAdDismissed");
                        }

                        @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
                        public void onAdShowed() {
                            b.a(Thread.currentThread(), "PangleAdapter banner onAdShowed");
                            try {
                                if(PangleAdapter.this.K != null && PangleAdapter.this.K.j() != null) {
                                    for(int v = 0; v < PangleAdapter.this.K.j().size(); ++v) {
                                        String s = (String)PangleAdapter.this.K.j().get(v);
                                        if(s0.a(s)) {
                                            b.c(Thread.currentThread(), "PangleAdapter onAdImpression url : " + s);
                                            E.g().d().a(PangleAdapter.this.J, e.i, s);
                                        }
                                    }
                                }
                            }
                            catch(Exception exception0) {
                                exception0.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                catch(Exception exception0) {
                }
            label_28:
                PangleAdapter.this.r = false;
                if(PangleAdapter.this.a != null) {
                    PangleAdapter.this.a.a(PangleAdapter.this.n);
                }
                b.a(Thread.currentThread(), exception0);
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(Object object0) {
                this.a(((PAGBannerAd)object0));
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onError(int v, String s) {
                b.a(Thread.currentThread(), "PangleAdapter banner onError : " + s);
                PangleAdapter.this.stopBannerTimer();
                if(PangleAdapter.this.a != null) {
                    PangleAdapter.this.a.a(PangleAdapter.this.n);
                }
            }
        });
    }

    private void a(Context context0, AdPopcornSSPNativeAd adPopcornSSPNativeAd0) {
        PAGNativeRequest pAGNativeRequest0 = new PAGNativeRequest();
        if(this.I) {
            pAGNativeRequest0.setAdString(this.N.y());
        }
        PAGNativeAd.loadAd(this.k, pAGNativeRequest0, new PAGNativeAdLoadListener() {
            final PangleAdapter c;

            public void a(PAGNativeAd pAGNativeAd0) {
                b.a(Thread.currentThread(), "PangleAdapter native onFeedAdLoad");
                try {
                    PangleAdapter.this.F = false;
                    if(pAGNativeAd0 != null) {
                        PangleAdapter.this.a(context0, adPopcornSSPNativeAd0, pAGNativeAd0);
                    }
                    if(PangleAdapter.this.c != null) {
                        PangleAdapter.this.c.a(PangleAdapter.this.o);
                    }
                    PangleAdapter.this.E.setVisibility(0);
                    return;
                }
                catch(Exception exception0) {
                }
                exception0.printStackTrace();
                if(PangleAdapter.this.c != null) {
                    PangleAdapter.this.c.a(PangleAdapter.this.o, 1);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(Object object0) {
                this.a(((PAGNativeAd)object0));
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onError(int v, String s) {
                b.a(Thread.currentThread(), "PangleAdapter native onError : " + s);
                PangleAdapter.this.F = false;
                if(PangleAdapter.this.c != null) {
                    PangleAdapter.this.c.a(PangleAdapter.this.o, 2);
                }
            }
        });
    }

    private void a(Context context0, AdPopcornSSPNativeAd adPopcornSSPNativeAd0, PAGNativeAd pAGNativeAd0) {
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout1;
        Button button1;
        ImageView imageView2;
        ImageView imageView1;
        TextView textView1;
        TextView textView0;
        b.c(Thread.currentThread(), "PangleAdapter inflateAd");
        PAGNativeAdData pAGNativeAdData0 = pAGNativeAd0.getNativeAdData();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        FrameLayout frameLayout0 = null;
        if(adPopcornSSPNativeAd0.getPangleViewBinder().titleViewId == 0) {
            textView0 = null;
        }
        else {
            textView0 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getPangleViewBinder().titleViewId);
            arrayList0.add(textView0);
        }
        if(adPopcornSSPNativeAd0.getPangleViewBinder().descriptionViewId == 0) {
            textView1 = null;
        }
        else {
            textView1 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getPangleViewBinder().descriptionViewId);
            arrayList0.add(textView1);
        }
        if(adPopcornSSPNativeAd0.getPangleViewBinder().iconViewId == 0) {
            imageView1 = null;
        }
        else {
            ImageView imageView0 = (ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getPangleViewBinder().iconViewId);
            arrayList0.add(imageView0);
            imageView1 = imageView0;
        }
        if(adPopcornSSPNativeAd0.getPangleViewBinder().dislikeViewId == 0) {
            imageView2 = null;
        }
        else {
            imageView2 = (ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getPangleViewBinder().dislikeViewId);
            arrayList0.add(imageView2);
        }
        if(adPopcornSSPNativeAd0.getPangleViewBinder().creativeButtonViewId == 0) {
            button1 = null;
        }
        else {
            Button button0 = (Button)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getPangleViewBinder().creativeButtonViewId);
            arrayList0.add(button0);
            arrayList1.add(button0);
            button1 = button0;
        }
        if(adPopcornSSPNativeAd0.getPangleViewBinder().logoViewId == 0) {
            relativeLayout1 = null;
        }
        else {
            RelativeLayout relativeLayout0 = (RelativeLayout)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getPangleViewBinder().logoViewId);
            arrayList0.add(relativeLayout0);
            relativeLayout1 = relativeLayout0;
        }
        if(adPopcornSSPNativeAd0.getPangleViewBinder().mediaViewId != 0) {
            frameLayout0 = (FrameLayout)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getPangleViewBinder().mediaViewId);
            arrayList0.add(frameLayout0);
        }
        if(textView0 != null) {
            textView0.setText(pAGNativeAdData0.getTitle());
        }
        if(textView1 != null) {
            textView1.setText(pAGNativeAdData0.getDescription());
        }
        PAGImageItem pAGImageItem0 = pAGNativeAdData0.getIcon();
        if(imageView1 == null || pAGImageItem0 == null || pAGImageItem0.getImageUrl() == null) {
            relativeLayout2 = relativeLayout1;
        }
        else {
            relativeLayout2 = relativeLayout1;
            n.a(context0, pAGImageItem0.getImageUrl(), imageView1, imageView1.getWidth(), imageView1.getHeight(), new d() {
                final PangleAdapter b;

                @Override  // com.igaworks.ssp.n$d
                public void a(Bitmap bitmap0) {
                    if(bitmap0 != null) {
                        ((ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getPangleViewBinder().iconViewId)).setImageBitmap(bitmap0);
                    }
                }
            });
        }
        if(button1 != null) {
            if(pAGNativeAdData0.getButtonText() == null) {
                button1.setVisibility(4);
            }
            else {
                button1.setVisibility(0);
                button1.setText(pAGNativeAdData0.getButtonText());
            }
        }
        try {
            ImageView imageView3 = (ImageView)pAGNativeAdData0.getAdLogoView();
            if(relativeLayout2 != null && imageView3 != null) {
                relativeLayout2.addView(imageView3, new RelativeLayout.LayoutParams(-1, -1));
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        if(pAGNativeAdData0.getMediaView() == null) {
            if(frameLayout0 != null) {
                frameLayout0.setVisibility(8);
            }
        }
        else if(frameLayout0 != null) {
            PAGMediaView pAGMediaView0 = pAGNativeAdData0.getMediaView();
            if(pAGMediaView0 != null && pAGMediaView0.getParent() == null) {
                frameLayout0.removeAllViews();
                frameLayout0.addView(pAGMediaView0);
            }
        }
        pAGNativeAd0.registerViewForInteraction(((ViewGroup)this.E), arrayList0, arrayList1, imageView2, new PAGNativeAdInteractionListener() {
            final PangleAdapter a;

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdClicked() {
                b.c(Thread.currentThread(), "PangleAdapter onAdClicked");
                if(PangleAdapter.this.c != null) {
                    PangleAdapter.this.c.onClicked();
                }
                try {
                    if(PangleAdapter.this.N != null && PangleAdapter.this.N.b() != null) {
                        for(int v = 0; v < PangleAdapter.this.N.b().size(); ++v) {
                            String s = (String)PangleAdapter.this.N.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "PangleAdapter onAdClicked url : " + s);
                                E.g().d().a(PangleAdapter.this.J, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdDismissed() {
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdShowed() {
                b.c(Thread.currentThread(), "PangleAdapter onAdShowed");
                if(!PangleAdapter.this.F && PangleAdapter.this.c != null) {
                    PangleAdapter.this.c.onImpression();
                }
                PangleAdapter.this.F = true;
                try {
                    if(PangleAdapter.this.N != null && PangleAdapter.this.N.j() != null) {
                        for(int v = 0; v < PangleAdapter.this.N.j().size(); ++v) {
                            String s = (String)PangleAdapter.this.N.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "PangleAdapter onAdShowed url : " + s);
                                E.g().d().a(PangleAdapter.this.J, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }
        });
    }

    private void a(boolean z) {
        try {
            if(z) {
                this.s = false;
                Handler handler0 = this.u;
                if(handler0 != null) {
                    handler0.removeCallbacks(this.v);
                }
            }
            else {
                this.t = false;
                Handler handler1 = this.u;
                if(handler1 != null) {
                    handler1.removeCallbacks(this.w);
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
        this.z = new PAGInitCallback() {
            final PangleAdapter a;

            @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
            public void fail(int v, String s) {
            }

            @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
            public void success() {
            }
        };
        b.a(Thread.currentThread(), "PangleAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void destroyAd() {
        try {
            this.R = false;
            this.removeVideoMixTimeoutHandler();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        PAGBannerAd pAGBannerAd0 = this.B;
        if(pAGBannerAd0 != null) {
            pAGBannerAd0.destroy();
        }
        this.stopBannerTimer();
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitialVideoAd() {
        try {
            b.a(Thread.currentThread(), "PangleAdapter.destroyInterstitialVideoAd()");
            this.y = false;
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
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyReactNativeAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyRewardVideoAd() {
        try {
            this.x = false;
            this.a(true);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroySplashAd() {
    }

    // 去混淆评级： 低(20)
    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public String getBiddingToken(Context context0) {
        return "";
    }

    // 去混淆评级： 低(20)
    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public String getNetworkName() [...] // 潜在的解密器

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void initializeSDK(Context context0, p0 p00, SdkInitListener sdkInitListener0) {
        try {
            b.a(Thread.currentThread(), "PangleAdapter initializeSDK");
            PAGSdk.init(context0, this.a(p00.a("pangle_app_id")), new PAGInitCallback() {
                final PangleAdapter b;

                @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
                public void fail(int v, String s) {
                    b.a(Thread.currentThread(), "PangleAdapter initializeSDK : " + s);
                    SdkInitListener sdkInitListener0 = sdkInitListener0;
                    if(sdkInitListener0 != null) {
                        sdkInitListener0.onInitializationFinished();
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
                public void success() {
                    b.a(Thread.currentThread(), "PangleAdapter initializeSDK success");
                    SdkInitListener sdkInitListener0 = sdkInitListener0;
                    if(sdkInitListener0 != null) {
                        sdkInitListener0.onInitializationFinished();
                    }
                }
            });
            return;
        }
        catch(NoClassDefFoundError unused_ex) {
        }
        catch(NoSuchMethodError unused_ex) {
            goto label_8;
        }
        catch(Exception unused_ex) {
            goto label_11;
        }
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
            return;
        label_8:
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
                return;
            label_11:
                if(sdkInitListener0 != null) {
                    sdkInitListener0.onInitializationFinished();
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        PAGBannerAd pAGBannerAd0 = this.B;
        if(pAGBannerAd0 != null) {
            pAGBannerAd0.destroy();
        }
        this.stopBannerTimer();
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void loadAd(Context context0, AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0, d0 d00, boolean z, int v, int v1) {
        try {
            b.a(Thread.currentThread(), "PangleAdapter videoMix loadAd : " + v1 + ", isInAppBidding : " + z);
            this.P = true;
            this.O = v;
            this.R = true;
            if(this.u == null) {
                this.u = new Handler();
            }
            if(this.Q == null) {
                this.Q = new Runnable() {
                    final PangleAdapter a;

                    @Override
                    public void run() {
                        if(PangleAdapter.this.P) {
                            b.b(Thread.currentThread(), "Time out in : Pangle");
                            if(PangleAdapter.this.i != null) {
                                PangleAdapter.this.i.d(PangleAdapter.this.O);
                            }
                        }
                    }
                };
            }
            String s = "";
            this.u.postDelayed(this.Q, adPopcornSSPVideoMixAd0.getNetworkScheduleTimeout());
            this.I = z;
            if(v1 == 4 || v1 == 6) {
                if(!z) {
                    s = ((a0)d00.e().a().get(v)).a("PangleAppId");
                    this.S = ((a0)d00.e().a().get(v)).a("PanglePlacementId");
                }
                else if(d00.b() != null && d00.b().get(0) != null) {
                    g g0 = (g)d00.b().get(0);
                    this.V = g0;
                    String s1 = g0.k();
                    this.S = s1 == null || s1.isEmpty() ? ((a0)d00.e().a().get(v)).a("PanglePlacementId") : p.a(s1, "pangle_placement_id");
                }
                else {
                    this.S = ((a0)d00.e().a().get(v)).a("PanglePlacementId");
                }
                b.a(Thread.currentThread(), "PangleAdapter videoMix call init");
                PAGSdk.init(context0, this.a(s), new PAGInitCallback() {
                    final PangleAdapter b;

                    @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
                    public void fail(int v, String s) {
                        b.a(Thread.currentThread(), "PangleAdapter videoMix init fail : " + v);
                        PangleAdapter.this.removeVideoMixTimeoutHandler();
                        if(PangleAdapter.this.R && PangleAdapter.this.i != null) {
                            PangleAdapter.this.i.d(PangleAdapter.this.O);
                        }
                    }

                    @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
                    public void success() {
                        b.a(Thread.currentThread(), "PangleAdapter videoMix init success : " + PAGSdk.isInitSuccess());
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            final com.igaworks.ssp.common.adapter.PangleAdapter.19 a;

                            @Override
                            public void run() {
                                if(com.igaworks.ssp.common.adapter.PangleAdapter.19.this.a == 6) {
                                    PAGInterstitialRequest pAGInterstitialRequest0 = new PAGInterstitialRequest();
                                    if(PangleAdapter.this.I) {
                                        pAGInterstitialRequest0.setAdString(PangleAdapter.this.V.y());
                                    }
                                    PAGInterstitialAd.loadAd(PangleAdapter.this.S, pAGInterstitialRequest0, PangleAdapter.this.a0);
                                    return;
                                }
                                PAGRewardedRequest pAGRewardedRequest0 = new PAGRewardedRequest();
                                if(PangleAdapter.this.I) {
                                    pAGRewardedRequest0.setAdString(PangleAdapter.this.V.y());
                                }
                                PAGRewardedAd.loadAd(PangleAdapter.this.S, pAGRewardedRequest0, PangleAdapter.this.b0);
                            }
                        }, 100L);
                    }
                });
                return;
            }
            b.a(Thread.currentThread(), "PangleAdapter does not support videoMix campaign type");
            this.removeVideoMixTimeoutHandler();
            E0 e00 = this.i;
            if(e00 != null) {
                e00.d(this.O);
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "PangleAdapter videomix exception");
            E0 e01 = this.i;
            if(e01 != null) {
                e01.d(this.O);
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
        this.y = true;
        this.q = v;
        this.t = true;
        if(adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout() > 0L) {
            if(this.u == null) {
                this.u = new Handler();
            }
            if(this.w == null) {
                this.w = new Runnable() {
                    final PangleAdapter a;

                    @Override
                    public void run() {
                        if(PangleAdapter.this.t) {
                            b.b(Thread.currentThread(), "Time out in : Pangle");
                            PangleAdapter.this.a(false);
                            if(PangleAdapter.this.y && PangleAdapter.this.e != null) {
                                PangleAdapter.this.e.d(PangleAdapter.this.q);
                            }
                        }
                    }
                };
            }
            this.u.postDelayed(this.w, adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout());
        }
        this.I = z;
        String s = "";
        this.m = "";
        if(!z) {
            s = ((a0)d00.e().a().get(v)).a("PangleAppId");
            this.m = ((a0)d00.e().a().get(v)).a("PanglePlacementId");
        }
        else if(d00 != null && d00.b() != null && d00.b().get(0) != null) {
            g g0 = (g)d00.b().get(0);
            this.M = g0;
            String s1 = g0.k();
            this.m = s1 == null || s1.length() <= 0 ? ((a0)d00.e().a().get(v)).a("PanglePlacementId") : p.a(s1, "pangle_placement_id");
        }
        else {
            this.m = ((a0)d00.e().a().get(v)).a("PanglePlacementId");
        }
        if(PAGSdk.isInitSuccess()) {
            b.a(Thread.currentThread(), "PangleAdapter already initialized and loadAd");
            PAGInterstitialRequest pAGInterstitialRequest0 = new PAGInterstitialRequest();
            if(this.I) {
                pAGInterstitialRequest0.setAdString(this.M.y());
            }
            PAGInterstitialAd.loadAd(this.m, pAGInterstitialRequest0, this.Y);
            return;
        }
        b.a(Thread.currentThread(), "PangleAdapter call init");
        PAGSdk.init(context0, this.a(s), new PAGInitCallback() {
            final PangleAdapter a;

            @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
            public void fail(int v, String s) {
                b.a(Thread.currentThread(), "PangleAdapter init fail : " + v);
                PangleAdapter.this.a(false);
                if(PangleAdapter.this.y && PangleAdapter.this.e != null) {
                    PangleAdapter.this.e.d(PangleAdapter.this.q);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
            public void success() {
                b.a(Thread.currentThread(), "PangleAdapter init success");
                PAGInterstitialRequest pAGInterstitialRequest0 = new PAGInterstitialRequest();
                if(PangleAdapter.this.I) {
                    pAGInterstitialRequest0.setAdString(PangleAdapter.this.M.y());
                }
                PAGInterstitialAd.loadAd(PangleAdapter.this.m, pAGInterstitialRequest0, PangleAdapter.this.Y);
            }
        });
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
        String s = "";
        b.a(Thread.currentThread(), "PangleAdapter.loadNativeAd()");
        this.o = v;
        try {
            this.J = context0;
            this.I = z;
            this.k = "";
            if(!z) {
                s = ((a0)d00.e().a().get(v)).a("PangleAppId");
                this.k = ((a0)d00.e().a().get(v)).a("PanglePlacementId");
            }
            else if(d00 == null) {
                throw new NullPointerException();
            }
            else if(d00.b() == null || d00.b().get(0) == null) {
                this.k = ((a0)d00.e().a().get(v)).a("PanglePlacementId");
            }
            else {
                g g0 = (g)d00.b().get(0);
                this.N = g0;
                String s1 = g0.k();
                this.k = s1 == null || s1.length() <= 0 ? ((a0)d00.e().a().get(v)).a("PanglePlacementId") : p.a(s1, "pangle_placement_id");
            }
            b.a(Thread.currentThread(), "PangleAdapter call init");
            PAGSdk.init(context0, this.a(s), new PAGInitCallback() {
                final PangleAdapter c;

                @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
                public void fail(int v, String s) {
                    b.a(Thread.currentThread(), "PangleAdapter init fail : " + v);
                    if(PangleAdapter.this.c != null) {
                        PangleAdapter.this.c.a(PangleAdapter.this.o, 2);
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
                public void success() {
                    b.a(Thread.currentThread(), "PangleAdapter init success : " + PAGSdk.isInitSuccess());
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        final com.igaworks.ssp.common.adapter.PangleAdapter.9 a;

                        @Override
                        public void run() {
                            PangleAdapter.this.a(com.igaworks.ssp.common.adapter.PangleAdapter.9.this.a, com.igaworks.ssp.common.adapter.PangleAdapter.9.this.b);
                        }
                    }, 100L);
                }
            });
            this.E = adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getPangleViewBinder().nativeAdViewId);
        }
        catch(Exception exception0) {
            c0 c00 = this.c;
            if(c00 != null) {
                c00.a(this.o, 0);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadReactNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0) {
        g0 g00 = this.g;
        if(g00 != null) {
            g00.a(v, 2);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadRewardVideoAd(Context context0, AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0, d0 d00, boolean z, int v) {
        String s = "";
        b.a(Thread.currentThread(), "PangleAdapter.loadRewardVideoAd() : " + z);
        this.p = v;
        this.J = context0;
        try {
            this.x = true;
            this.s = true;
            if(adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.u == null) {
                    this.u = new Handler();
                }
                if(this.v == null) {
                    this.v = new Runnable() {
                        final PangleAdapter a;

                        @Override
                        public void run() {
                            if(PangleAdapter.this.s) {
                                b.b(Thread.currentThread(), "Time out in : Pangle");
                                PangleAdapter.this.a(true);
                                if(PangleAdapter.this.x && PangleAdapter.this.d != null) {
                                    PangleAdapter.this.d.d(PangleAdapter.this.p);
                                }
                            }
                        }
                    };
                }
                this.u.postDelayed(this.v, adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout());
            }
            this.I = z;
            this.l = "";
            if(!z) {
                s = ((a0)d00.e().a().get(v)).a("PangleAppId");
                this.l = ((a0)d00.e().a().get(v)).a("PanglePlacementId");
            }
            else if(d00 == null) {
                throw new NullPointerException();
            }
            else if(d00.b() == null || d00.b().get(0) == null) {
                this.l = ((a0)d00.e().a().get(v)).a("PanglePlacementId");
            }
            else {
                g g0 = (g)d00.b().get(0);
                this.L = g0;
                String s1 = g0.k();
                this.l = s1 == null || s1.length() <= 0 ? ((a0)d00.e().a().get(v)).a("PanglePlacementId") : p.a(s1, "pangle_placement_id");
            }
            b.a(Thread.currentThread(), "PangleAdapter call init");
            PAGSdk.init(context0, this.a(s), new PAGInitCallback() {
                final PangleAdapter a;

                @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
                public void fail(int v, String s) {
                    b.a(Thread.currentThread(), "PangleAdapter init fail : " + v);
                    PangleAdapter.this.a(true);
                    if(PangleAdapter.this.x && PangleAdapter.this.d != null) {
                        PangleAdapter.this.d.d(PangleAdapter.this.p);
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
                public void success() {
                    b.a(Thread.currentThread(), "PangleAdapter init success : " + PAGSdk.isInitSuccess());
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        final com.igaworks.ssp.common.adapter.PangleAdapter.6 a;

                        @Override
                        public void run() {
                            PAGRewardedRequest pAGRewardedRequest0 = new PAGRewardedRequest();
                            if(PangleAdapter.this.I) {
                                pAGRewardedRequest0.setAdString(PangleAdapter.this.L.y());
                            }
                            PAGRewardedAd.loadAd(PangleAdapter.this.l, pAGRewardedRequest0, PangleAdapter.this.W);
                        }
                    }, 100L);
                }
            });
            return;
        }
        catch(Exception exception0) {
        }
        this.a(true);
        b.a(Thread.currentThread(), exception0);
        if(this.x) {
            l0 l00 = this.d;
            if(l00 != null) {
                l00.d(v);
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
            this.P = false;
            Handler handler0 = this.u;
            if(handler0 != null) {
                handler0.removeCallbacks(this.Q);
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
    public void setReactNativeMediationAdapterEventListener(g0 g00) {
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
            b.a(Thread.currentThread(), "PangleAdapter videoMix showAd : " + v1 + ", isInappBiddingMode : " + z);
            this.I = z;
            switch(v1) {
                case 4: {
                    PAGRewardedAd pAGRewardedAd0 = this.T;
                    if(pAGRewardedAd0 != null) {
                        if(context0 instanceof Activity) {
                            pAGRewardedAd0.setAdInteractionListener(this.d0);
                            this.T.show(((Activity)context0));
                            return;
                        }
                        b.a(Thread.currentThread(), "PangleAdapter videoMix showAd : context is not activity context");
                        if(this.R) {
                            E0 e01 = this.i;
                            if(e01 != null) {
                                e01.c(v);
                                return;
                            }
                        }
                    }
                    else if(this.R) {
                        E0 e02 = this.i;
                        if(e02 != null) {
                            e02.c(v);
                            return;
                        }
                    }
                    break;
                }
                case 6: {
                    PAGInterstitialAd pAGInterstitialAd0 = this.U;
                    if(pAGInterstitialAd0 != null) {
                        if(context0 instanceof Activity) {
                            pAGInterstitialAd0.setAdInteractionListener(this.c0);
                            this.U.show(((Activity)context0));
                            return;
                        }
                        b.a(Thread.currentThread(), "PangleAdapter videoMix showAd : context is not activity context");
                        if(this.R) {
                            E0 e03 = this.i;
                            if(e03 != null) {
                                e03.c(v);
                                return;
                            }
                        }
                    }
                    else if(this.R) {
                        E0 e04 = this.i;
                        if(e04 != null) {
                            e04.c(v);
                            return;
                        }
                    }
                    break;
                }
                default: {
                    b.a(Thread.currentThread(), "PangleAdapter does not support videoMix campaign type");
                    E0 e00 = this.i;
                    if(e00 != null) {
                        e00.c(v);
                    }
                }
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "PangleAdapter videoMix exception");
            E0 e05 = this.i;
            if(e05 != null) {
                e05.c(v);
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
            b.a(Thread.currentThread(), "PangleAdapter.showInterstitialVideoAd()");
            PAGInterstitialAd pAGInterstitialAd0 = this.D;
            if(pAGInterstitialAd0 != null) {
                if(context0 instanceof Activity) {
                    pAGInterstitialAd0.setAdInteractionListener(this.Z);
                    this.D.show(((Activity)context0));
                    return;
                }
                b.a(Thread.currentThread(), "PangleAdapter.showInterstitialVideoAd() : context is not activity context");
                if(this.y) {
                    V v1 = this.e;
                    if(v1 != null) {
                        v1.c(v);
                    }
                }
            }
            else if(this.y) {
                V v2 = this.e;
                if(v2 != null) {
                    v2.c(v);
                }
            }
        }
        catch(Exception unused_ex) {
            if(this.y) {
                V v3 = this.e;
                if(v3 != null) {
                    v3.c(v);
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
            b.a(Thread.currentThread(), "PangleAdapter.showRewardVideoAd()");
            PAGRewardedAd pAGRewardedAd0 = this.C;
            if(pAGRewardedAd0 != null) {
                if(context0 instanceof Activity) {
                    pAGRewardedAd0.setAdInteractionListener(this.X);
                    this.C.show(((Activity)context0));
                    return;
                }
                b.a(Thread.currentThread(), "PangleAdapter.showRewardVideoAd() : context is not activity context");
                if(this.x) {
                    l0 l00 = this.d;
                    if(l00 != null) {
                        l00.c(v);
                    }
                }
            }
            else if(this.x) {
                l0 l01 = this.d;
                if(l01 != null) {
                    l01.c(v);
                }
            }
        }
        catch(Exception unused_ex) {
            if(this.x) {
                l0 l02 = this.d;
                if(l02 != null) {
                    l02.c(v);
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void startBannerAd(Context context0, AdSize adSize0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, d0 d00, boolean z, int v) {
        try {
            String s = "";
            this.J = context0;
            this.r = true;
            this.n = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.G == null) {
                    this.G = new Handler();
                }
                if(this.H == null) {
                    this.H = new Runnable() {
                        final PangleAdapter a;

                        @Override
                        public void run() {
                            if(PangleAdapter.this.r) {
                                b.b(Thread.currentThread(), "Time out in : Pangle");
                                if(PangleAdapter.this.a != null) {
                                    PangleAdapter.this.a.a(PangleAdapter.this.n);
                                }
                            }
                        }
                    };
                }
                this.G.postDelayed(this.H, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            this.I = z;
            b.a(Thread.currentThread(), "PangleAdapter.startBannerAd()");
            this.j = "";
            if(!this.I) {
                s = ((a0)d00.e().a().get(v)).a("PangleAppId");
                this.j = ((a0)d00.e().a().get(v)).a("PanglePlacementId");
            }
            else if(d00 == null) {
                throw new NullPointerException();
            }
            else if(d00.b() == null || d00.b().get(0) == null) {
                this.j = ((a0)d00.e().a().get(v)).a("PanglePlacementId");
            }
            else {
                g g0 = (g)d00.b().get(0);
                this.K = g0;
                String s1 = g0.k();
                this.j = s1 == null || s1.length() <= 0 ? ((a0)d00.e().a().get(v)).a("PanglePlacementId") : p.a(s1, "pangle_placement_id");
            }
            if(adSize0 == AdSize.BANNER_320x50) {
                this.A = PAGBannerSize.BANNER_W_320_H_50;
            }
            else {
                if(adSize0 == AdSize.BANNER_320x100) {
                    b.a(Thread.currentThread(), "PangleAdapter BANNER_320x100 is not supported");
                    this.r = false;
                    C c0 = this.a;
                    if(c0 != null) {
                        c0.a(v);
                    }
                    return;
                }
                this.A = PAGBannerSize.BANNER_W_300_H_250;
            }
            b.a(Thread.currentThread(), "PangleAdapter call init");
            PAGSdk.init(context0, this.a(s), new PAGInitCallback() {
                final PangleAdapter c;

                @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
                public void fail(int v, String s) {
                    b.a(Thread.currentThread(), "PangleAdapter init fail : " + v);
                    PangleAdapter.this.stopBannerTimer();
                    if(PangleAdapter.this.a != null) {
                        PangleAdapter.this.a.a(PangleAdapter.this.n);
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
                public void success() {
                    b.a(Thread.currentThread(), "PangleAdapter init success : " + PAGSdk.isInitSuccess());
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        final com.igaworks.ssp.common.adapter.PangleAdapter.3 a;

                        @Override
                        public void run() {
                            PangleAdapter.this.a(com.igaworks.ssp.common.adapter.PangleAdapter.3.this.a, com.igaworks.ssp.common.adapter.PangleAdapter.3.this.b);
                        }
                    }, 100L);
                }
            });
            return;
        }
        catch(Exception exception0) {
        }
        this.stopBannerTimer();
        C c1 = this.a;
        if(c1 != null) {
            c1.a(this.n);
        }
        b.a(Thread.currentThread(), exception0);
    }

    public void stopBannerTimer() {
        try {
            this.r = false;
            Handler handler0 = this.G;
            if(handler0 != null) {
                handler0.removeCallbacks(this.H);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

