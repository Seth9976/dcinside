package com.igaworks.ssp.common.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.fsn.cauly.CaulyAdInfo;
import com.fsn.cauly.CaulyAdInfoBuilder;
import com.fsn.cauly.CaulyAdView;
import com.fsn.cauly.CaulyAdViewListener;
import com.fsn.cauly.CaulyInterstitialAd;
import com.fsn.cauly.CaulyInterstitialAdListener;
import com.fsn.cauly.Logger.LogLevel;
import com.fsn.cauly.Logger;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.C;
import com.igaworks.ssp.E0;
import com.igaworks.ssp.SdkInitListener;
import com.igaworks.ssp.T;
import com.igaworks.ssp.V;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.b0;
import com.igaworks.ssp.b;
import com.igaworks.ssp.c0;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.g0;
import com.igaworks.ssp.l0;
import com.igaworks.ssp.p0;
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
import java.util.HashMap;

public class CaulyAdapter implements BaseMediationAdapter, VideoMixAdMediationAdapter {
    private C a;
    private T b;
    private r0 c;
    private g0 d;
    private b0 e;
    private E0 f;
    private boolean g;
    private CaulyAdView h;
    private CaulyInterstitialAd i;
    private CaulyAdViewListener j;
    private Handler k;
    private Runnable l;
    private int m;
    private CaulyInterstitialAd n;

    public CaulyAdapter() {
        this.g = true;
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
    }

    public void checkAdPopcornSSPReactNativeImpression() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void checkValidMediation() {
        this.j = new CaulyAdViewListener() {
            final CaulyAdapter a;

            public void onClickAd(CaulyAdView caulyAdView0) {
            }

            @Override  // com.fsn.cauly.CaulyAdViewListener
            public void onCloseLandingScreen(CaulyAdView caulyAdView0) {
            }

            @Override  // com.fsn.cauly.CaulyAdViewListener
            public void onFailedToReceiveAd(CaulyAdView caulyAdView0, int v, String s) {
            }

            @Override  // com.fsn.cauly.CaulyAdViewListener
            public void onReceiveAd(CaulyAdView caulyAdView0, boolean z) {
            }

            @Override  // com.fsn.cauly.CaulyAdViewListener
            public void onShowLandingScreen(CaulyAdView caulyAdView0) {
            }
        };
        b.a(Thread.currentThread(), "CaulyAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void destroyAd() {
        CaulyInterstitialAd caulyInterstitialAd0 = this.n;
        if(caulyInterstitialAd0 != null) {
            caulyInterstitialAd0.cancel();
            this.n = null;
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            b.a(Thread.currentThread(), "CaulyAdapter.destroyBannerAd");
            CaulyAdView caulyAdView0 = this.h;
            if(caulyAdView0 != null) {
                caulyAdView0.setAdViewListener(null);
                this.h.destroy();
                this.h.removeAllViews();
            }
            this.a = null;
            this.stopBannerTimer();
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitialVideoAd() {
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
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroySplashAd() {
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
        b.a(Thread.currentThread(), "CaulyAdapter initializeSDK");
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        try {
            b.a(Thread.currentThread(), "CaulyAdapter.internalStopBannerAd");
            CaulyAdView caulyAdView0 = this.h;
            if(caulyAdView0 != null) {
                caulyAdView0.setAdViewListener(null);
            }
            this.a = null;
            this.stopBannerTimer();
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void loadAd(Context context0, AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0, d0 d00, boolean z, int v, int v1) {
        try {
            b.a(Thread.currentThread(), "CaulyAdapter videoMix loadAd : " + v1);
            if(v1 == 2) {
                CaulyAdInfo caulyAdInfo0 = new CaulyAdInfoBuilder(((a0)d00.e().a().get(v)).a("Cauly")).build();
                CaulyInterstitialAd caulyInterstitialAd0 = new CaulyInterstitialAd();
                this.n = caulyInterstitialAd0;
                caulyInterstitialAd0.setAdInfo(caulyAdInfo0);
                this.n.setInterstialAdListener(new CaulyInterstitialAdListener() {
                    final CaulyAdapter b;

                    public void onClickInterstitialAd(CaulyInterstitialAd caulyInterstitialAd0) {
                        b.a(Thread.currentThread(), "CaulyAdapter videoMix onClickInterstitialAd");
                        if(CaulyAdapter.this.f != null) {
                            CaulyAdapter.this.f.onClickAd();
                        }
                    }

                    @Override  // com.fsn.cauly.CaulyInterstitialAdListener
                    public void onClosedInterstitialAd(CaulyInterstitialAd caulyInterstitialAd0) {
                        b.a(Thread.currentThread(), "CaulyAdapter videoMix onClosedInterstitialAd");
                        if(CaulyAdapter.this.f != null) {
                            CaulyAdapter.this.f.a();
                        }
                    }

                    @Override  // com.fsn.cauly.CaulyInterstitialAdListener
                    public void onFailedToReceiveInterstitialAd(CaulyInterstitialAd caulyInterstitialAd0, int v, String s) {
                        b.a(Thread.currentThread(), "CaulyAdapter videoMix failed to load in Cauly, error code : " + v + ", error message : " + s);
                        if(CaulyAdapter.this.f != null) {
                            CaulyAdapter.this.f.d(v);
                        }
                    }

                    @Override  // com.fsn.cauly.CaulyInterstitialAdListener
                    public void onLeaveInterstitialAd(CaulyInterstitialAd caulyInterstitialAd0) {
                        b.a(Thread.currentThread(), "CaulyAdapter videoMix onLeaveInterstitialAd");
                        if(CaulyAdapter.this.f != null) {
                            CaulyAdapter.this.f.a();
                        }
                    }

                    @Override  // com.fsn.cauly.CaulyInterstitialAdListener
                    public void onReceiveInterstitialAd(CaulyInterstitialAd caulyInterstitialAd0, boolean z) {
                        b.a(Thread.currentThread(), "CaulyAdapter videoMix : Success to load in Cauly");
                        if(CaulyAdapter.this.f != null) {
                            CaulyAdapter.this.f.b(v);
                        }
                    }
                });
                if(context0 instanceof Activity) {
                    this.n.requestInterstitialAd(((Activity)context0));
                    return;
                }
                b.b(Thread.currentThread(), "Cauly need activity context");
                E0 e00 = this.f;
                if(e00 != null) {
                    e00.d(v);
                    return;
                }
            }
            else {
                b.a(Thread.currentThread(), "CaulyAdapter does not support videoMix campaign type");
                E0 e01 = this.f;
                if(e01 != null) {
                    e01.d(v);
                    return;
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), "CaulyAdapter videoMix exception");
        b.a(Thread.currentThread(), exception0);
        E0 e02 = this.f;
        if(e02 != null) {
            e02.d(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        try {
            CaulyAdInfo caulyAdInfo0 = new CaulyAdInfoBuilder(((a0)d00.e().a().get(v)).a("Cauly")).build();
            CaulyInterstitialAd caulyInterstitialAd0 = new CaulyInterstitialAd();
            this.i = caulyInterstitialAd0;
            caulyInterstitialAd0.setAdInfo(caulyAdInfo0);
            b.c(Thread.currentThread(), "CaulyAdapter loadInterstitial");
            this.i.setInterstialAdListener(new CaulyInterstitialAdListener() {
                final CaulyAdapter b;

                public void onClickInterstitialAd(CaulyInterstitialAd caulyInterstitialAd0) {
                    b.a(Thread.currentThread(), "CaulyAdapter onClickInterstitialAd");
                    if(CaulyAdapter.this.b != null) {
                        CaulyAdapter.this.b.a();
                    }
                }

                @Override  // com.fsn.cauly.CaulyInterstitialAdListener
                public void onClosedInterstitialAd(CaulyInterstitialAd caulyInterstitialAd0) {
                    b.a(Thread.currentThread(), "CaulyAdapter onClosedInterstitialAd");
                    if(CaulyAdapter.this.b != null) {
                        CaulyAdapter.this.b.e(0);
                    }
                }

                @Override  // com.fsn.cauly.CaulyInterstitialAdListener
                public void onFailedToReceiveInterstitialAd(CaulyInterstitialAd caulyInterstitialAd0, int v, String s) {
                    b.a(Thread.currentThread(), "CaulyAdapter failed to load in Cauly, error code : " + v + ", error message : " + s);
                    if(CaulyAdapter.this.b != null) {
                        CaulyAdapter.this.b.d(v);
                    }
                }

                @Override  // com.fsn.cauly.CaulyInterstitialAdListener
                public void onLeaveInterstitialAd(CaulyInterstitialAd caulyInterstitialAd0) {
                    b.a(Thread.currentThread(), "CaulyAdapter onLeaveInterstitialAd");
                    if(CaulyAdapter.this.b != null) {
                        CaulyAdapter.this.b.e(0);
                    }
                }

                @Override  // com.fsn.cauly.CaulyInterstitialAdListener
                public void onReceiveInterstitialAd(CaulyInterstitialAd caulyInterstitialAd0, boolean z) {
                    b.a(Thread.currentThread(), "CaulyAdapter InterstitialAd : Success to load in Cauly");
                    if(CaulyAdapter.this.b != null) {
                        CaulyAdapter.this.b.b(v);
                    }
                }
            });
            if(context0 instanceof Activity) {
                this.i.requestInterstitialAd(((Activity)context0));
                return;
            }
            b.b(Thread.currentThread(), "Cauly need activity context");
            T t0 = this.b;
            if(t0 != null) {
                t0.d(v);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        T t1 = this.b;
        if(t1 != null) {
            t1.d(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitialVideoAd(Context context0, AdPopcornSSPInterstitialVideoAd adPopcornSSPInterstitialVideoAd0, d0 d00, boolean z, int v) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
        b0 b00 = this.e;
        if(b00 != null) {
            b00.d(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPNativeAd adPopcornSSPNativeAd0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadReactNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0) {
        g0 g00 = this.d;
        if(g00 != null) {
            g00.a(v, 2);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadRewardVideoAd(Context context0, AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0, d0 d00, boolean z, int v) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadSplashAd(Context context0, d0 d00, int v, AdPopcornSSPSplashAd adPopcornSSPSplashAd0) {
        r0 r00 = this.c;
        if(r00 != null) {
            r00.a(v, 2);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void onPauseBanner() {
        b.a(Thread.currentThread(), "CaulyAdapter.onPauseBanner");
        CaulyAdView caulyAdView0 = this.h;
        if(caulyAdView0 != null) {
            caulyAdView0.pause();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void onResumeBanner() {
        b.a(Thread.currentThread(), "CaulyAdapter.onResumeBanner");
        CaulyAdView caulyAdView0 = this.h;
        if(caulyAdView0 != null) {
            caulyAdView0.resume();
        }
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
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setInterstitialMediationAdapterEventListener(T t0) {
        this.b = t0;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setInterstitialVideoMediationAdapterEventListener(V v0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void setMediationAdapterEventListener(E0 e00) {
        this.f = e00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setModalAdMediationAdapterEventListener(b0 b00) {
        this.e = b00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setNativeMediationAdapterEventListener(c0 c00) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setReactNativeMediationAdapterEventListener(g0 g00) {
        this.d = g00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setRewardVideoMediationAdapterEventListener(l0 l00) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setSplashMediationAdapterEventListener(r0 r00) {
        this.c = r00;
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void showAd(Context context0, d0 d00, boolean z, int v, int v1) {
        try {
            b.a(Thread.currentThread(), "CaulyAdapter videoMix showAd : " + v1);
            if(v1 == 2) {
                CaulyInterstitialAd caulyInterstitialAd0 = this.n;
                if(caulyInterstitialAd0 == null) {
                    E0 e01 = this.f;
                    if(e01 != null) {
                        e01.c(v);
                        return;
                    }
                }
                else {
                    caulyInterstitialAd0.show();
                    E0 e00 = this.f;
                    if(e00 != null) {
                        e00.a(v);
                        return;
                    }
                }
            }
            else {
                b.a(Thread.currentThread(), "CaulyAdapter does not support videoMix campaign type");
                E0 e02 = this.f;
                if(e02 != null) {
                    e02.c(v);
                    return;
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), "CaulyAdapter videoMix exception");
        b.a(Thread.currentThread(), exception0);
        E0 e03 = this.f;
        if(e03 != null) {
            e03.c(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "CaulyAdapter showInterstitial");
            CaulyInterstitialAd caulyInterstitialAd0 = this.i;
            if(caulyInterstitialAd0 == null) {
                T t1 = this.b;
                if(t1 != null) {
                    t1.c(v);
                    return;
                }
            }
            else {
                caulyInterstitialAd0.show();
                T t0 = this.b;
                if(t0 != null) {
                    t0.a(v);
                    return;
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        T t2 = this.b;
        if(t2 != null) {
            t2.c(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitialVideoAd(Context context0, d0 d00, boolean z, int v) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showRewardVideoAd(Context context0, d0 d00, boolean z, int v) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void startBannerAd(Context context0, AdSize adSize0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, d0 d00, boolean z, int v) {
        int v4;
        boolean z2;
        int v2;
        int v1;
        String s;
        boolean z1 = true;
        try {
            this.g = true;
            this.m = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.k == null) {
                    this.k = new Handler();
                }
                if(this.l == null) {
                    this.l = new Runnable() {
                        final CaulyAdapter a;

                        @Override
                        public void run() {
                            if(CaulyAdapter.this.g) {
                                b.b(Thread.currentThread(), "Time out in : Cauly");
                                if(CaulyAdapter.this.a != null) {
                                    CaulyAdapter.this.a.a(CaulyAdapter.this.m);
                                }
                            }
                        }
                    };
                }
                this.k.postDelayed(this.l, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            s = ((a0)d00.e().a().get(v)).a("Cauly");
            b.a(Thread.currentThread(), "CaulyAdapter.startBannerAd() : " + s);
            v1 = 20;
            v2 = 5;
        }
        catch(Exception exception0) {
            goto label_48;
        }
        try {
            if(adPopcornSSPBannerAd0.getMediationExtraData("CAULY_DYNAMIC_RELOAD_INTERVAL") != null) {
                z1 = ((Boolean)adPopcornSSPBannerAd0.getMediationExtraData("CAULY_DYNAMIC_RELOAD_INTERVAL")).booleanValue();
                b.a(Thread.currentThread(), "CAULY_DYNAMIC_RELOAD_INTERVAL : " + z1);
            }
            if(adPopcornSSPBannerAd0.getMediationExtraData("CAULY_RELOAD_INTERVAL") != null) {
                v1 = (int)(((Integer)adPopcornSSPBannerAd0.getMediationExtraData("CAULY_RELOAD_INTERVAL")));
                b.a(Thread.currentThread(), "CAULY_RELOAD_INTERVAL : " + v1);
            }
            if(adPopcornSSPBannerAd0.getMediationExtraData("CAULY_THREAD_PRIORITY") != null) {
                v2 = (int)(((Integer)adPopcornSSPBannerAd0.getMediationExtraData("CAULY_THREAD_PRIORITY")));
                b.a(Thread.currentThread(), "CAULY_THREAD_PRIORITY : " + v2);
            }
            if(adPopcornSSPBannerAd0.getMediationExtraData("CAULY_ENABLE_LOCK") == null) {
                goto label_26;
            }
            else {
                z2 = ((Boolean)adPopcornSSPBannerAd0.getMediationExtraData("CAULY_ENABLE_LOCK")).booleanValue();
                goto label_24;
            }
            goto label_27;
        }
        catch(Exception unused_ex) {
            goto label_26;
        }
        try {
        label_24:
            b.a(Thread.currentThread(), "CAULY_ENABLE_LOCK : " + z2);
            goto label_27;
            try {
            label_26:
                z2 = false;
            }
            catch(Exception unused_ex) {
                goto label_26;
            }
        }
        catch(Exception unused_ex) {
        }
        try {
        label_27:
            int v3 = 320;
            if(adSize0 == AdSize.BANNER_320x100) {
                v4 = 100;
            }
            else if(adSize0 == AdSize.BANNER_300x250 || adSize0 == AdSize.BANNER_ADAPTIVE_SIZE) {
                v3 = 300;
                v4 = 0xFA;
            }
            else {
                v4 = 50;
            }
            CaulyAdInfo caulyAdInfo0 = new CaulyAdInfoBuilder(s).bannerHeight("Adaptive").setBannerSize(v3, v4).dynamicReloadInterval(z1).reloadInterval(v1).threadPriority(v2).enableLock(z2).build();
            Logger.setLogLevel(LogLevel.Verbose);
            if(this.h == null) {
                this.h = new CaulyAdView(context0);
            }
            else {
                b.a(Thread.currentThread(), "already exist caulyAdView");
                this.h.destroy();
            }
            this.h.setAdInfo(caulyAdInfo0);
            this.h.setAdViewListener(new CaulyAdViewListener() {
                final CaulyAdapter b;

                public void onClickAd(CaulyAdView caulyAdView0) {
                    b.b(Thread.currentThread(), "CaulyAdapter banner onClickAd");
                    if(CaulyAdapter.this.a != null) {
                        CaulyAdapter.this.a.a();
                    }
                }

                @Override  // com.fsn.cauly.CaulyAdViewListener
                public void onCloseLandingScreen(CaulyAdView caulyAdView0) {
                }

                @Override  // com.fsn.cauly.CaulyAdViewListener
                public void onFailedToReceiveAd(CaulyAdView caulyAdView0, int v, String s) {
                    b.b(Thread.currentThread(), "failed to load in Cauly, error code : " + v + ", error message : " + s);
                    CaulyAdapter.this.stopBannerTimer();
                    if(CaulyAdapter.this.a != null) {
                        CaulyAdapter.this.a.a(CaulyAdapter.this.m);
                    }
                }

                @Override  // com.fsn.cauly.CaulyAdViewListener
                public void onReceiveAd(CaulyAdView caulyAdView0, boolean z) {
                    try {
                        b.a(Thread.currentThread(), "onReceiveAd");
                        CaulyAdapter.this.stopBannerTimer();
                        if(CaulyAdapter.this.a != null) {
                            CaulyAdapter.this.a.b(CaulyAdapter.this.m);
                        }
                        if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                            adPopcornSSPBannerAd0.setVisibility(4);
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                final com.igaworks.ssp.common.adapter.CaulyAdapter.3 a;

                                @Override
                                public void run() {
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                    try {
                                        try {
                                            CaulyAdapter.this.h.buildDrawingCache();
                                            Bitmap bitmap0 = CaulyAdapter.this.h.getDrawingCache();
                                            if(bitmap0 != null) {
                                                int v = bitmap0.getPixel(1, 1);
                                                com.igaworks.ssp.common.adapter.CaulyAdapter.3.this.a.setBackgroundColor(v);
                                            }
                                            goto label_17;
                                        }
                                        catch(Exception exception0) {
                                        }
                                        b.a(Thread.currentThread(), exception0);
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.CaulyAdapter.3.this.a;
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
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.CaulyAdapter.3.this.a;
                                    if(adPopcornSSPBannerAd1 != null) {
                                        adPopcornSSPBannerAd1.setVisibility(0);
                                    }
                                    throw throwable0;
                                label_17:
                                    adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.CaulyAdapter.3.this.a;
                                    if(adPopcornSSPBannerAd0 != null) {
                                        adPopcornSSPBannerAd0.setVisibility(0);
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
                    CaulyAdapter.this.stopBannerTimer();
                    if(CaulyAdapter.this.a != null) {
                        CaulyAdapter.this.a.a(CaulyAdapter.this.m);
                    }
                }

                @Override  // com.fsn.cauly.CaulyAdViewListener
                public void onShowLandingScreen(CaulyAdView caulyAdView0) {
                    b.b(Thread.currentThread(), "CaulyAdapter banner onShowLandingScreen");
                }
            });
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                final CaulyAdapter b;

                @Override
                public void run() {
                    if(CaulyAdapter.this.h != null) {
                        adPopcornSSPBannerAd0.removeAllViewsInLayout();
                        adPopcornSSPBannerAd0.removeAllViews();
                        adPopcornSSPBannerAd0.addView(CaulyAdapter.this.h);
                    }
                }
            });
            return;
        }
        catch(Exception exception0) {
        }
    label_48:
        b.a(Thread.currentThread(), exception0);
        this.g = false;
        C c0 = this.a;
        if(c0 != null) {
            c0.a(this.m);
        }
    }

    public void stopBannerTimer() {
        try {
            this.g = false;
            Handler handler0 = this.k;
            if(handler0 != null) {
                handler0.removeCallbacks(this.l);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

