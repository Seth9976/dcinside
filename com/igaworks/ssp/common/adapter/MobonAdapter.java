package com.igaworks.ssp.common.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.C;
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
import com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd;
import com.igaworks.ssp.part.nativead.AdPopcornSSPNativeAd;
import com.igaworks.ssp.part.splash.AdPopcornSSPSplashAd;
import com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd;
import com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd;
import com.igaworks.ssp.r0;
import com.mobon.sdk.InterstitialDialog;
import com.mobon.sdk.Key.INTERSTITIAL_KEYCODE;
import com.mobon.sdk.Key.INTERSTITIAL_TYPE;
import com.mobon.sdk.MobonSDK;
import com.mobon.sdk.NativeAdView;
import com.mobon.sdk.RectBannerView;
import com.mobon.sdk.callback.iMobonBannerCallback;
import com.mobon.sdk.callback.iMobonInterstitialAdCallback;
import com.mobon.sdk.callback.iMobonNativeCallback;
import java.util.HashMap;

public class MobonAdapter implements BaseMediationAdapter {
    private C a;
    private T b;
    private c0 c;
    private r0 d;
    private g0 e;
    private b0 f;
    private boolean g;
    private MobonSDK h;
    private RectBannerView i;
    private InterstitialDialog j;
    private NativeAdView k;
    private iMobonBannerCallback l;
    private iMobonNativeCallback m;
    private Handler n;
    private Runnable o;
    private int p;

    public MobonAdapter() {
        this.g = true;
        this.n = new Handler(Looper.getMainLooper());
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
    }

    public void checkAdPopcornSSPReactNativeImpression() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkValidMediation() {
        this.l = new iMobonBannerCallback() {
            final MobonAdapter a;

            public void onAdClicked() {
            }

            public void onLoadedAdInfo(boolean z, String s) {
            }
        };
        this.m = new iMobonNativeCallback() {
            final MobonAdapter a;

            public void onAdClicked() {
            }

            public void onLoadedAdInfo(boolean z, String s) {
            }
        };
        if(this.l != null) {
            b.a(Thread.currentThread(), "MobonAdapter SDK imported");
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            b.a(Thread.currentThread(), "MobonAdapter.destroyBannerAd");
            RectBannerView rectBannerView0 = this.i;
            if(rectBannerView0 != null) {
                ((ViewGroup)rectBannerView0).removeAllViews();
                this.i.destroyAd();
                this.i = null;
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
        InterstitialDialog interstitialDialog0 = this.j;
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
        NativeAdView nativeAdView0 = this.k;
        if(nativeAdView0 != null) {
            nativeAdView0.destroyAd();
        }
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

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getBiddingToken(Context context0) {
        return null;
    }

    // 去混淆评级： 低(20)
    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getNetworkName() [...] // 潜在的解密器

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void initializeSDK(Context context0, p0 p00, SdkInitListener sdkInitListener0) {
        b.a(Thread.currentThread(), "MobonAdapter initializeSDK");
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        try {
            b.a(Thread.currentThread(), "MobonAdapter.internalStopBannerAd");
            this.a = null;
            this.stopBannerTimer();
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        try {
            String s = ((a0)d00.e().a().get(v)).a("MobonMediaCode");
            String s1 = ((a0)d00.e().a().get(v)).a("MobonUnitId");
            if(this.h == null) {
                this.h = new MobonSDK(context0, s);
            }
            this.h.setLog(true);
            this.j = new InterstitialDialog(context0).setType(Key.INTERSTITIAL_TYPE.NORMAL).setUnitId(s1).build();
            b.c(Thread.currentThread(), "MobonAdapter loadInterstitial");
            this.j.setAdListener(new iMobonInterstitialAdCallback() {
                final MobonAdapter b;

                public void onClickEvent(Key.INTERSTITIAL_KEYCODE key$INTERSTITIAL_KEYCODE0) {
                    b.b(Thread.currentThread(), "MobonAdapter InterstitialAd onClick");
                    if(MobonAdapter.this.b != null) {
                        MobonAdapter.this.b.a();
                    }
                }

                public void onClosed() {
                    b.c(Thread.currentThread(), "MobonAdapter onClosed");
                    if(MobonAdapter.this.b != null) {
                        MobonAdapter.this.b.e(0);
                    }
                }

                public void onLoadedAdInfo(boolean z, String s) {
                    if(z) {
                        b.a(Thread.currentThread(), "MobonAdapter InterstitialAd : Success to load in Mobon");
                        if(MobonAdapter.this.b != null) {
                            MobonAdapter.this.b.b(v);
                        }
                    }
                    else {
                        b.b(Thread.currentThread(), "MobonAdapter InterstitialAd : failed to load in Mobon, error str : " + s);
                        if(MobonAdapter.this.b != null) {
                            MobonAdapter.this.b.d(v);
                        }
                    }
                }

                public void onOpened() {
                    b.c(Thread.currentThread(), "MobonAdapter onOpened");
                }
            });
            this.j.loadAd();
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        T t0 = this.b;
        if(t0 != null) {
            t0.d(v);
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
            if(adPopcornSSPNativeAd0.getMobonViewBinder() == null) {
                b.c(Thread.currentThread(), "MobonAdapter viewBinder is null");
                c0 c00 = this.c;
                if(c00 != null) {
                    c00.a(v, 3);
                    return;
                }
                return;
            }
            String s = ((a0)d00.e().a().get(v)).a("MobonMediaCode");
            String s1 = ((a0)d00.e().a().get(v)).a("MobonUnitId");
            if(this.h == null) {
                this.h = new MobonSDK(context0, s);
            }
            this.h.setLog(true);
            NativeAdView nativeAdView0 = new NativeAdView(context0, ((ViewGroup)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMobonViewBinder().nativeAdViewId)));
            this.k = nativeAdView0;
            nativeAdView0.setUnitId(s1);
            if(adPopcornSSPNativeAd0.getMobonViewBinder().titleViewId != 0) {
                this.k.setAdImageView(((ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMobonViewBinder().mainImageViewId)));
            }
            if(adPopcornSSPNativeAd0.getMobonViewBinder().logoImageViewId != 0) {
                this.k.setAdLogoView(((ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMobonViewBinder().logoImageViewId)));
            }
            if(adPopcornSSPNativeAd0.getMobonViewBinder().titleViewId != 0) {
                this.k.setTitleView(((TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMobonViewBinder().titleViewId)));
            }
            if(adPopcornSSPNativeAd0.getMobonViewBinder().descViewId != 0) {
                this.k.setDescritionView(((TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMobonViewBinder().descViewId)));
            }
            if(adPopcornSSPNativeAd0.getMobonViewBinder().priceViewId != 0) {
                this.k.setAdPriceView(((TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMobonViewBinder().priceViewId)));
            }
            this.k.setAdListener(new iMobonNativeCallback() {
                final MobonAdapter b;

                public void onAdClicked() {
                    b.c(Thread.currentThread(), "MobonAdapter Native ad onAdClicked");
                    if(MobonAdapter.this.c != null) {
                        MobonAdapter.this.c.onClicked();
                    }
                }

                public void onLoadedAdInfo(boolean z, String s) {
                    if(z) {
                        b.c(Thread.currentThread(), "MobonAdapter Native ad loaded!");
                        if(MobonAdapter.this.c != null) {
                            MobonAdapter.this.c.a(v);
                        }
                    }
                    else {
                        b.c(Thread.currentThread(), "MobonAdapter Native ad onLoadedAdInfo : " + s);
                        if(MobonAdapter.this.c != null) {
                            MobonAdapter.this.c.a(v, 2);
                        }
                    }
                }
            });
            this.k.loadAd();
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

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void pauseInterstitialVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void pauseRewardVideoAd() {
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

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "MobonAdapter showInterstitial");
            if(this.j == null || !this.j.isLoaded()) {
                T t1 = this.b;
                if(t1 != null) {
                    t1.c(v);
                    return;
                }
            }
            else {
                if(context0 instanceof Activity) {
                    ((Dialog)this.j).setOwnerActivity(((Activity)context0));
                }
                else {
                    b.c(Thread.currentThread(), "MobonAdapter showInterstitial not activity context");
                }
                this.j.show();
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
            String s = ((a0)d00.e().a().get(v)).a("MobonMediaCode");
            String s1 = ((a0)d00.e().a().get(v)).a("MobonUnitId");
            if(this.h == null) {
                this.h = new MobonSDK(context0, s);
            }
            this.h.setLog(true);
            this.g = true;
            this.p = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.n == null) {
                    this.n = new Handler();
                }
                if(this.o == null) {
                    this.o = new Runnable() {
                        final MobonAdapter a;

                        @Override
                        public void run() {
                            if(MobonAdapter.this.g) {
                                b.b(Thread.currentThread(), "Time out in : Mobon");
                                if(MobonAdapter.this.a != null) {
                                    MobonAdapter.this.a.a(MobonAdapter.this.p);
                                }
                            }
                        }
                    };
                }
                this.n.postDelayed(this.o, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            b.a(Thread.currentThread(), "MobonAdapter.startBannerAd() : mediaCode : " + s + ", unitId : " + s1);
            RectBannerView rectBannerView0 = this.i;
            if(rectBannerView0 != null) {
                rectBannerView0.destroyAd();
                this.i = null;
            }
            if(this.i != null) {
                b.a(Thread.currentThread(), "already exist Mobon AdView");
            }
            else if(adSize0 == AdSize.BANNER_320x50) {
                this.i = new RectBannerView(context0, "BANNER_320x50").setBannerUnitId(s1);
            }
            else if(adSize0 == AdSize.BANNER_320x100) {
                this.i = new RectBannerView(context0, "BANNER_320x100").setBannerUnitId(s1);
            }
            else {
                this.i = new RectBannerView(context0, "BANNER_300x250").setBannerUnitId(s1);
            }
            this.i.setAdListener(new iMobonBannerCallback() {
                final MobonAdapter b;

                public void onAdClicked() {
                    b.b(Thread.currentThread(), "MobonAdapter banner onAdClicked");
                    if(MobonAdapter.this.a != null) {
                        MobonAdapter.this.a.a();
                    }
                }

                public void onLoadedAdInfo(boolean z, String s) {
                    try {
                        if(z) {
                            if(adPopcornSSPBannerAd0 == null || MobonAdapter.this.i == null) {
                                b.b(Thread.currentThread(), "MobonAdapter view is null");
                                MobonAdapter.this.stopBannerTimer();
                                if(MobonAdapter.this.a != null) {
                                    MobonAdapter.this.a.a(MobonAdapter.this.p);
                                }
                                return;
                            }
                            adPopcornSSPBannerAd0.removeAllViewsInLayout();
                            adPopcornSSPBannerAd0.removeAllViews();
                            adPopcornSSPBannerAd0.addView(((View)MobonAdapter.this.i));
                            MobonAdapter.this.stopBannerTimer();
                            if(MobonAdapter.this.a != null) {
                                MobonAdapter.this.a.b(MobonAdapter.this.p);
                            }
                            if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                                adPopcornSSPBannerAd0.setVisibility(4);
                                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                    final com.igaworks.ssp.common.adapter.MobonAdapter.4 a;

                                    @Override
                                    public void run() {
                                        AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                        try {
                                            try {
                                                ((View)MobonAdapter.this.i).buildDrawingCache();
                                                Bitmap bitmap0 = ((View)MobonAdapter.this.i).getDrawingCache();
                                                if(bitmap0 != null) {
                                                    int v = bitmap0.getPixel(1, 1);
                                                    com.igaworks.ssp.common.adapter.MobonAdapter.4.this.a.setBackgroundColor(v);
                                                }
                                                goto label_17;
                                            }
                                            catch(Exception exception0) {
                                            }
                                            b.a(Thread.currentThread(), exception0);
                                            adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.MobonAdapter.4.this.a;
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
                                        AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.MobonAdapter.4.this.a;
                                        if(adPopcornSSPBannerAd1 != null) {
                                            adPopcornSSPBannerAd1.setVisibility(0);
                                        }
                                        throw throwable0;
                                    label_17:
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.MobonAdapter.4.this.a;
                                        if(adPopcornSSPBannerAd0 != null) {
                                            adPopcornSSPBannerAd0.setVisibility(0);
                                        }
                                    }
                                }, 350L);
                            }
                        }
                        else {
                            b.b(Thread.currentThread(), "failed to load in Mobon, errorStr : " + s);
                            MobonAdapter.this.stopBannerTimer();
                            if(MobonAdapter.this.a != null) {
                                MobonAdapter.this.a.a(MobonAdapter.this.p);
                            }
                        }
                    }
                    catch(Exception unused_ex) {
                        b.b(Thread.currentThread(), "MobonAdapter Exception : Mobon");
                        MobonAdapter.this.stopBannerTimer();
                        if(MobonAdapter.this.a != null) {
                            MobonAdapter.this.a.a(MobonAdapter.this.p);
                        }
                    }
                }
            });
            this.i.loadAd();
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.stopBannerTimer();
        C c0 = this.a;
        if(c0 != null) {
            c0.a(this.p);
        }
    }

    public void stopBannerTimer() {
        try {
            this.g = false;
            Handler handler0 = this.n;
            if(handler0 != null) {
                handler0.removeCallbacks(this.o);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

