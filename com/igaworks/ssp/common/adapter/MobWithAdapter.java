package com.igaworks.ssp.common.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.mobwith.sdk.InterstitialDialog;
import com.mobwith.sdk.Key.INTERSTITIAL_KEYCODE;
import com.mobwith.sdk.Key.INTERSTITIAL_TYPE;
import com.mobwith.sdk.MobwithBannerView;
import com.mobwith.sdk.MobwithNativeAdView;
import com.mobwith.sdk.callback.iBannerCallback;
import com.mobwith.sdk.callback.iInterstitialCallback;
import java.util.HashMap;

public class MobWithAdapter implements BaseMediationAdapter, VideoMixAdMediationAdapter {
    private C a;
    private T b;
    private c0 c;
    private r0 d;
    private g0 e;
    private b0 f;
    private E0 g;
    private boolean h;
    private Handler i;
    private Runnable j;
    private int k;
    private iBannerCallback l;
    private MobwithBannerView m;
    private InterstitialDialog n;
    private MobwithNativeAdView o;
    private Handler p;
    private int q;
    private InterstitialDialog r;

    public MobWithAdapter() {
        this.h = true;
        this.i = new Handler(Looper.getMainLooper());
        this.p = new Handler(Looper.getMainLooper());
        this.q = 0;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
    }

    public void checkAdPopcornSSPReactNativeImpression() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void checkValidMediation() {
        this.l = new iBannerCallback() {
            final MobWithAdapter a;

            public void onAdClicked() {
            }

            public void onLoadedAdInfo(boolean z, String s) {
            }
        };
        b.a(Thread.currentThread(), "MobWithAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void destroyAd() {
        InterstitialDialog interstitialDialog0 = this.r;
        if(interstitialDialog0 != null) {
            interstitialDialog0.dismiss();
            this.r = null;
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            b.a(Thread.currentThread(), "MobWithAdapter.destroyBannerAd");
            MobwithBannerView mobwithBannerView0 = this.m;
            if(mobwithBannerView0 != null) {
                ((ViewGroup)mobwithBannerView0).removeAllViews();
                this.m.destroyAd();
                this.m = null;
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
        InterstitialDialog interstitialDialog0 = this.n;
        if(interstitialDialog0 != null) {
            interstitialDialog0.dismiss();
        }
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
        b.a(Thread.currentThread(), "MobWithAdapter initializeSDK");
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        try {
            b.a(Thread.currentThread(), "MobWithAdapter.internalStopBannerAd");
            this.a = null;
            this.stopBannerTimer();
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void loadAd(Context context0, AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0, d0 d00, boolean z, int v, int v1) {
        try {
            b.a(Thread.currentThread(), "MobWithAdapter videoMix loadAd : " + v1);
            this.q = v;
            if(v1 == 2) {
                String s = ((a0)d00.e().a().get(v)).a("MobWithUnitId");
                InterstitialDialog interstitialDialog0 = new InterstitialDialog(context0).setBackCancel(true).setType(Key.INTERSTITIAL_TYPE.FULL).setUnitId(s).build();
                this.r = interstitialDialog0;
                interstitialDialog0.setAdListener(new iInterstitialCallback() {
                    final MobWithAdapter a;

                    public void onClickEvent(Key.INTERSTITIAL_KEYCODE key$INTERSTITIAL_KEYCODE0) {
                        b.b(Thread.currentThread(), "MobWithAdapter videoMix onClick");
                        if(MobWithAdapter.this.g != null) {
                            MobWithAdapter.this.g.onClickAd();
                        }
                    }

                    public void onClosed() {
                        b.c(Thread.currentThread(), "MobWithAdapter videoMix onClosed");
                        if(MobWithAdapter.this.g != null) {
                            MobWithAdapter.this.g.a();
                        }
                    }

                    public void onFailOpened() {
                        b.c(Thread.currentThread(), "MobWithAdapter videoMix onFailOpened");
                        if(MobWithAdapter.this.g != null) {
                            int v = MobWithAdapter.this.q;
                            MobWithAdapter.this.g.c(v);
                        }
                    }

                    public void onLoadedAdInfo(boolean z, String s) {
                        if(z) {
                            b.a(Thread.currentThread(), "MobWithAdapter videoMix : Success to load in MobWith");
                            if(MobWithAdapter.this.g != null) {
                                MobWithAdapter.this.g.b(MobWithAdapter.this.q);
                            }
                        }
                        else {
                            b.b(Thread.currentThread(), "MobWithAdapter videoMix : failed to load in MobWith, error str : " + s);
                            if(MobWithAdapter.this.g != null) {
                                MobWithAdapter.this.g.d(MobWithAdapter.this.q);
                            }
                        }
                    }

                    public void onOpened() {
                        b.c(Thread.currentThread(), "MobWithAdapter videoMix onOpened");
                    }
                });
                this.r.load();
                return;
            }
            b.a(Thread.currentThread(), "MobWithAdapter does not support videoMix campaign type");
            E0 e00 = this.g;
            if(e00 != null) {
                e00.d(this.q);
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "MobWithAdapter videoMix exception");
            E0 e01 = this.g;
            if(e01 != null) {
                e01.d(this.q);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        try {
            String s = ((a0)d00.e().a().get(v)).a("MobWithUnitId");
            this.n = new InterstitialDialog(context0).setBackCancel(true).setType(Key.INTERSTITIAL_TYPE.FULL).setUnitId(s).build();
            b.c(Thread.currentThread(), "MobWithAdapter loadInterstitial");
            this.n.setAdListener(new iInterstitialCallback() {
                final MobWithAdapter b;

                public void onClickEvent(Key.INTERSTITIAL_KEYCODE key$INTERSTITIAL_KEYCODE0) {
                    b.b(Thread.currentThread(), "MobWithAdapter InterstitialAd onClick");
                    if(MobWithAdapter.this.b != null) {
                        MobWithAdapter.this.b.a();
                    }
                }

                public void onClosed() {
                    b.c(Thread.currentThread(), "MobWithAdapter onClosed");
                    if(MobWithAdapter.this.b != null) {
                        MobWithAdapter.this.b.e(0);
                    }
                }

                public void onFailOpened() {
                    b.c(Thread.currentThread(), "MobWithAdapter onFailOpened");
                    if(MobWithAdapter.this.b != null) {
                        MobWithAdapter.this.b.c(v);
                    }
                }

                public void onLoadedAdInfo(boolean z, String s) {
                    if(z) {
                        b.a(Thread.currentThread(), "MobWithAdapter InterstitialAd : Success to load in MobWith");
                        if(MobWithAdapter.this.b != null) {
                            MobWithAdapter.this.b.b(v);
                        }
                    }
                    else {
                        b.b(Thread.currentThread(), "MobWithAdapter InterstitialAd : failed to load in MobWith, error str : " + s);
                        if(MobWithAdapter.this.b != null) {
                            MobWithAdapter.this.b.d(v);
                        }
                    }
                }

                public void onOpened() {
                    b.c(Thread.currentThread(), "MobWithAdapter onOpened");
                }
            });
            this.n.load();
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            T t0 = this.b;
            if(t0 != null) {
                t0.d(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitialVideoAd(Context context0, AdPopcornSSPInterstitialVideoAd adPopcornSSPInterstitialVideoAd0, d0 d00, boolean z, int v) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
        b0 b00 = this.f;
        if(b00 != null) {
            b00.d(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPNativeAd adPopcornSSPNativeAd0) {
        try {
            if(adPopcornSSPNativeAd0.getMobWithViewBinder() == null) {
                b.c(Thread.currentThread(), "MobWithAdapter viewBinder is null");
                c0 c00 = this.c;
                if(c00 != null) {
                    c00.a(v, 3);
                    return;
                }
                return;
            }
            MobwithNativeAdView mobwithNativeAdView0 = new MobwithNativeAdView(context0, ((a0)d00.e().a().get(v)).a("MobWithUnitId"), ((FrameLayout)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMobWithViewBinder().nativeAdViewId)), adPopcornSSPNativeAd0.getMobWithViewBinder().nativeAdUnitLayoutId, adPopcornSSPNativeAd0.getMobWithViewBinder().mediaContainerViewId, adPopcornSSPNativeAd0.getMobWithViewBinder().imageViewADId, adPopcornSSPNativeAd0.getMobWithViewBinder().imageViewLogoId, adPopcornSSPNativeAd0.getMobWithViewBinder().textViewTitleId, adPopcornSSPNativeAd0.getMobWithViewBinder().textViewDescId, adPopcornSSPNativeAd0.getMobWithViewBinder().buttonGoId, adPopcornSSPNativeAd0.getMobWithViewBinder().layoutInfoViewId, adPopcornSSPNativeAd0.getMobWithViewBinder().imageViewInfoId);
            this.o = mobwithNativeAdView0;
            mobwithNativeAdView0.setAdListener(new iBannerCallback() {
                final MobWithAdapter b;

                public void onAdClicked() {
                    b.c(Thread.currentThread(), "MobWithAdapter Native ad onAdClicked");
                    if(MobWithAdapter.this.c != null) {
                        MobWithAdapter.this.c.onClicked();
                    }
                }

                public void onLoadedAdInfo(boolean z, String s) {
                    if(z) {
                        b.c(Thread.currentThread(), "MobWithAdapter Native ad loaded!");
                        if(MobWithAdapter.this.c != null) {
                            MobWithAdapter.this.c.a(v);
                        }
                    }
                    else {
                        b.c(Thread.currentThread(), "MobWithAdapter Native ad onLoadedAdInfo : " + s);
                        if(MobWithAdapter.this.c != null) {
                            MobWithAdapter.this.c.a(v, 2);
                        }
                    }
                }
            });
            this.o.loadAd();
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        c0 c01 = this.c;
        if(c01 != null) {
            c01.a(v, 0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadReactNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0) {
        g0 g00 = this.e;
        if(g00 != null) {
            g00.a(v, 2);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadRewardVideoAd(Context context0, AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0, d0 d00, boolean z, int v) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadSplashAd(Context context0, d0 d00, int v, AdPopcornSSPSplashAd adPopcornSSPSplashAd0) {
        r0 r00 = this.d;
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
        this.g = e00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setModalAdMediationAdapterEventListener(b0 b00) {
        this.f = b00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setNativeMediationAdapterEventListener(c0 c00) {
        this.c = c00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setReactNativeMediationAdapterEventListener(g0 g00) {
        this.e = g00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setRewardVideoMediationAdapterEventListener(l0 l00) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setSplashMediationAdapterEventListener(r0 r00) {
        this.d = r00;
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void showAd(Context context0, d0 d00, boolean z, int v, int v1) {
        try {
            this.q = v;
            b.a(Thread.currentThread(), "MobWithAdapter videoMix showAd : " + v1);
            if(v1 != 2) {
                b.a(Thread.currentThread(), "MobWithAdapter does not support videoMix campaign type");
                E0 e02 = this.g;
                if(e02 != null) {
                    e02.c(this.q);
                }
            }
            else if(this.r != null && this.r.isLoaded()) {
                if(context0 instanceof Activity) {
                    ((Dialog)this.r).setOwnerActivity(((Activity)context0));
                }
                else {
                    b.c(Thread.currentThread(), "MobWithAdapter videoMix showInterstitial not activity context");
                }
                this.r.show();
                E0 e00 = this.g;
                if(e00 != null) {
                    e00.a(this.q);
                }
            }
            else {
                E0 e01 = this.g;
                if(e01 != null) {
                    e01.c(this.q);
                }
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "MobWithAdapter videoMix exception");
            E0 e03 = this.g;
            if(e03 != null) {
                e03.c(this.q);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "MobWithAdapter showInterstitial");
            if(this.n == null || !this.n.isLoaded()) {
                T t1 = this.b;
                if(t1 != null) {
                    t1.c(v);
                    return;
                }
            }
            else {
                if(context0 instanceof Activity) {
                    ((Dialog)this.n).setOwnerActivity(((Activity)context0));
                }
                else {
                    b.c(Thread.currentThread(), "MobWithAdapter showInterstitial not activity context");
                }
                this.n.show();
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
        try {
            String s = ((a0)d00.e().a().get(v)).a("MobWithUnitId");
            this.h = true;
            this.k = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.i == null) {
                    this.i = new Handler();
                }
                if(this.j == null) {
                    this.j = new Runnable() {
                        final MobWithAdapter a;

                        @Override
                        public void run() {
                            if(MobWithAdapter.this.h) {
                                b.b(Thread.currentThread(), "Time out in : MobWith");
                                if(MobWithAdapter.this.a != null) {
                                    MobWithAdapter.this.a.a(MobWithAdapter.this.k);
                                }
                            }
                        }
                    };
                }
                this.i.postDelayed(this.j, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            b.a(Thread.currentThread(), "MobWithAdapter.startBannerAd() : unitId : " + s);
            MobwithBannerView mobwithBannerView0 = this.m;
            if(mobwithBannerView0 != null) {
                mobwithBannerView0.destroyAd();
                this.m = null;
            }
            if(this.m == null) {
                this.m = new MobwithBannerView(context0).setBannerUnitId(s);
            }
            else {
                b.a(Thread.currentThread(), "already exist MobWithBannerView");
            }
            this.m.setAdListener(new iBannerCallback() {
                final MobWithAdapter b;

                public void onAdClicked() {
                    b.b(Thread.currentThread(), "MobWithAdapter banner onAdClicked");
                    if(MobWithAdapter.this.a != null) {
                        MobWithAdapter.this.a.a();
                    }
                }

                public void onLoadedAdInfo(boolean z, String s) {
                    try {
                        if(z) {
                            if(adPopcornSSPBannerAd0 == null || MobWithAdapter.this.m == null) {
                                b.b(Thread.currentThread(), "MobWithAdapter view is null");
                                MobWithAdapter.this.stopBannerTimer();
                                if(MobWithAdapter.this.a != null) {
                                    MobWithAdapter.this.a.a(MobWithAdapter.this.k);
                                }
                                return;
                            }
                            adPopcornSSPBannerAd0.removeAllViewsInLayout();
                            adPopcornSSPBannerAd0.removeAllViews();
                            adPopcornSSPBannerAd0.addView(((View)MobWithAdapter.this.m));
                            MobWithAdapter.this.stopBannerTimer();
                            if(MobWithAdapter.this.a != null) {
                                MobWithAdapter.this.a.b(MobWithAdapter.this.k);
                            }
                            if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                                adPopcornSSPBannerAd0.setVisibility(4);
                                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                    final com.igaworks.ssp.common.adapter.MobWithAdapter.3 a;

                                    @Override
                                    public void run() {
                                        AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                        try {
                                            try {
                                                ((View)MobWithAdapter.this.m).buildDrawingCache();
                                                Bitmap bitmap0 = ((View)MobWithAdapter.this.m).getDrawingCache();
                                                if(bitmap0 != null) {
                                                    int v = bitmap0.getPixel(1, 1);
                                                    com.igaworks.ssp.common.adapter.MobWithAdapter.3.this.a.setBackgroundColor(v);
                                                }
                                                goto label_17;
                                            }
                                            catch(Exception exception0) {
                                            }
                                            b.a(Thread.currentThread(), exception0);
                                            adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.MobWithAdapter.3.this.a;
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
                                        AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.MobWithAdapter.3.this.a;
                                        if(adPopcornSSPBannerAd1 != null) {
                                            adPopcornSSPBannerAd1.setVisibility(0);
                                        }
                                        throw throwable0;
                                    label_17:
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.MobWithAdapter.3.this.a;
                                        if(adPopcornSSPBannerAd0 != null) {
                                            adPopcornSSPBannerAd0.setVisibility(0);
                                        }
                                    }
                                }, 350L);
                            }
                        }
                        else {
                            b.b(Thread.currentThread(), "failed to load in MobWith, errorStr : " + s);
                            MobWithAdapter.this.stopBannerTimer();
                            if(MobWithAdapter.this.a != null) {
                                MobWithAdapter.this.a.a(MobWithAdapter.this.k);
                            }
                        }
                    }
                    catch(Exception unused_ex) {
                        b.b(Thread.currentThread(), "MobWithAdapter Exception : MobWith");
                        MobWithAdapter.this.stopBannerTimer();
                        if(MobWithAdapter.this.a != null) {
                            MobWithAdapter.this.a.a(MobWithAdapter.this.k);
                        }
                    }
                }
            });
            long v1 = adPopcornSSPBannerAd0.getRefreshTime();
            if(((int)(v1 / 1000L)) == -1) {
                this.m.setInterval(0);
            }
            else {
                this.m.setInterval(((int)(v1 / 1000L)));
            }
            this.m.loadAd();
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.stopBannerTimer();
        C c0 = this.a;
        if(c0 != null) {
            c0.a(this.k);
        }
    }

    public void stopBannerTimer() {
        try {
            this.h = false;
            Handler handler0 = this.i;
            if(handler0 != null) {
                handler0.removeCallbacks(this.j);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

