package com.igaworks.ssp.common.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder.Builder;
import com.applovin.sdk.AppLovinSdk.SdkInitializationListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.C;
import com.igaworks.ssp.E0;
import com.igaworks.ssp.J;
import com.igaworks.ssp.SdkInitListener;
import com.igaworks.ssp.T;
import com.igaworks.ssp.V;
import com.igaworks.ssp.Y.a;
import com.igaworks.ssp.Y;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.b0;
import com.igaworks.ssp.b;
import com.igaworks.ssp.c0;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.g0;
import com.igaworks.ssp.i;
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
import com.igaworks.ssp.s0;
import java.util.HashMap;

public class AppLovinMaxDynamicBidAdapter implements BaseMediationAdapter, VideoMixAdMediationAdapter {
    private boolean A;
    private MaxInterstitialAd B;
    private MaxRewardedAd C;
    MaxRewardedAdListener D;
    MaxRewardedAdListener E;
    private C a;
    private T b;
    private c0 c;
    private l0 d;
    private V e;
    private r0 f;
    private g0 g;
    private b0 h;
    private E0 i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private MaxAdView s;
    private MaxInterstitialAd t;
    private MaxInterstitialAd u;
    private MaxRewardedAd v;
    private MaxNativeAdLoader w;
    private MaxAd x;
    private MaxRewardedAdListener y;
    private int z;

    public AppLovinMaxDynamicBidAdapter() {
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = false;
        this.p = false;
        this.y = null;
        this.z = 0;
        this.A = false;
        this.D = new MaxRewardedAdListener() {
            final AppLovinMaxDynamicBidAdapter a;

            public void onAdClicked(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter RewardVideo onAdClicked");
                if(AppLovinMaxDynamicBidAdapter.this.d != null) {
                    AppLovinMaxDynamicBidAdapter.this.d.onClickAd();
                }
            }

            public void onAdDisplayFailed(MaxAd maxAd0, MaxError maxError0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter RewardVideo onAdDisplayFailed");
            }

            public void onAdDisplayed(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter RewardVideo onAdDisplayed");
                if(AppLovinMaxDynamicBidAdapter.this.o && AppLovinMaxDynamicBidAdapter.this.d != null) {
                    AppLovinMaxDynamicBidAdapter.this.d.a(AppLovinMaxDynamicBidAdapter.this.m);
                }
            }

            public void onAdHidden(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter RewardVideo onAdHidden");
                if(AppLovinMaxDynamicBidAdapter.this.d != null) {
                    AppLovinMaxDynamicBidAdapter.this.d.a();
                }
                AppLovinMaxDynamicBidAdapter.this.o = false;
            }

            public void onAdLoadFailed(String s, MaxError maxError0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter RewardVideo onAdLoadFailed : " + maxError0.getMessage());
                if(AppLovinMaxDynamicBidAdapter.this.o && AppLovinMaxDynamicBidAdapter.this.d != null) {
                    AppLovinMaxDynamicBidAdapter.this.d.d(AppLovinMaxDynamicBidAdapter.this.m);
                }
            }

            public void onAdLoaded(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter RewardVideo onAdLoaded");
                if(AppLovinMaxDynamicBidAdapter.this.o && AppLovinMaxDynamicBidAdapter.this.d != null) {
                    AppLovinMaxDynamicBidAdapter.this.d.b(AppLovinMaxDynamicBidAdapter.this.m);
                }
            }

            public void onUserRewarded(MaxAd maxAd0, MaxReward maxReward0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter onUserRewarded");
                if(AppLovinMaxDynamicBidAdapter.this.d != null) {
                    AppLovinMaxDynamicBidAdapter.this.d.a(i.z.b(), true);
                }
            }
        };
        this.E = new MaxRewardedAdListener() {
            final AppLovinMaxDynamicBidAdapter a;

            public void onAdClicked(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdClicked");
                if(AppLovinMaxDynamicBidAdapter.this.i != null) {
                    AppLovinMaxDynamicBidAdapter.this.i.onClickAd();
                }
            }

            public void onAdDisplayFailed(MaxAd maxAd0, MaxError maxError0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdDisplayFailed");
            }

            public void onAdDisplayed(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdDisplayed");
                if(AppLovinMaxDynamicBidAdapter.this.A && AppLovinMaxDynamicBidAdapter.this.i != null) {
                    AppLovinMaxDynamicBidAdapter.this.i.a(AppLovinMaxDynamicBidAdapter.this.z);
                }
            }

            public void onAdHidden(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdHidden");
                if(AppLovinMaxDynamicBidAdapter.this.i != null) {
                    AppLovinMaxDynamicBidAdapter.this.i.a();
                }
                AppLovinMaxDynamicBidAdapter.this.A = false;
            }

            public void onAdLoadFailed(String s, MaxError maxError0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdLoadFailed : " + maxError0.getMessage());
                if(AppLovinMaxDynamicBidAdapter.this.A && AppLovinMaxDynamicBidAdapter.this.i != null) {
                    AppLovinMaxDynamicBidAdapter.this.i.d(AppLovinMaxDynamicBidAdapter.this.z);
                }
            }

            public void onAdLoaded(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdLoaded");
                if(AppLovinMaxDynamicBidAdapter.this.A && AppLovinMaxDynamicBidAdapter.this.i != null) {
                    AppLovinMaxDynamicBidAdapter.this.i.b(AppLovinMaxDynamicBidAdapter.this.z);
                }
            }

            public void onUserRewarded(MaxAd maxAd0, MaxReward maxReward0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onUserRewarded");
                if(AppLovinMaxDynamicBidAdapter.this.i != null) {
                    AppLovinMaxDynamicBidAdapter.this.i.a(i.z.b(), true);
                }
            }
        };
    }

    private MaxNativeAdView a(Context context0, AdPopcornSSPNativeAd adPopcornSSPNativeAd0) {
        return new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(adPopcornSSPNativeAd0.getAppLovinMaxViewBinder().nativeAdUnitLayoutId).setTitleTextViewId(adPopcornSSPNativeAd0.getAppLovinMaxViewBinder().titleViewId).setBodyTextViewId(adPopcornSSPNativeAd0.getAppLovinMaxViewBinder().bodyViewId).setAdvertiserTextViewId(adPopcornSSPNativeAd0.getAppLovinMaxViewBinder().advertiserViewId).setIconImageViewId(adPopcornSSPNativeAd0.getAppLovinMaxViewBinder().iconViewId).setMediaContentViewGroupId(adPopcornSSPNativeAd0.getAppLovinMaxViewBinder().mediaViewId).setOptionsContentViewGroupId(adPopcornSSPNativeAd0.getAppLovinMaxViewBinder().optionViewId).setCallToActionButtonId(adPopcornSSPNativeAd0.getAppLovinMaxViewBinder().ctaViewId).build(), ((Activity)context0));
    }

    private void a(Context context0, String s, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, String s1, AdSize adSize0) {
        MaxAdView maxAdView0 = this.s;
        if(maxAdView0 != null) {
            maxAdView0.destroy();
        }
        this.s = adSize0 == AdSize.BANNER_320x50 ? new MaxAdView(s, context0) : new MaxAdView(s, MaxAdFormat.MREC, context0);
        this.s.setExtraParameter("disable_auto_retries", "true");
        if(s0.a(s1)) {
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter banner price : " + s1);
            this.s.setExtraParameter("jC7Fp", s1);
        }
        this.s.setListener(new MaxAdViewAdListener() {
            final AppLovinMaxDynamicBidAdapter b;

            public void onAdClicked(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter banner onAdClicked");
                if(AppLovinMaxDynamicBidAdapter.this.a != null) {
                    AppLovinMaxDynamicBidAdapter.this.a.a();
                }
            }

            public void onAdCollapsed(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter banner onAdCollapsed");
            }

            public void onAdDisplayFailed(MaxAd maxAd0, MaxError maxError0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter banner onAdDisplayFailed");
            }

            public void onAdDisplayed(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter banner onAdDisplayed");
            }

            public void onAdExpanded(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter banner onAdExpanded");
            }

            public void onAdHidden(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter banner onAdHidden");
            }

            public void onAdLoadFailed(String s, MaxError maxError0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter banner onAdLoadFailed : " + maxError0.getMessage());
                if(AppLovinMaxDynamicBidAdapter.this.a != null) {
                    AppLovinMaxDynamicBidAdapter.this.a.a(AppLovinMaxDynamicBidAdapter.this.j);
                }
            }

            public void onAdLoaded(MaxAd maxAd0) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter banner onAdLoaded");
                try {
                    adPopcornSSPBannerAd0.removeAllViewsInLayout();
                    adPopcornSSPBannerAd0.removeAllViews();
                    adPopcornSSPBannerAd0.addView(((View)AppLovinMaxDynamicBidAdapter.this.s));
                    if(AppLovinMaxDynamicBidAdapter.this.a != null) {
                        AppLovinMaxDynamicBidAdapter.this.a.b(AppLovinMaxDynamicBidAdapter.this.j);
                    }
                    if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                        adPopcornSSPBannerAd0.setVisibility(4);
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            final com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter.4 a;

                            @Override
                            public void run() {
                                AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                try {
                                    try {
                                        ((View)AppLovinMaxDynamicBidAdapter.this.s).buildDrawingCache();
                                        Bitmap bitmap0 = ((View)AppLovinMaxDynamicBidAdapter.this.s).getDrawingCache();
                                        if(bitmap0 != null) {
                                            int v = bitmap0.getPixel(1, 1);
                                            com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter.4.this.a.setBackgroundColor(v);
                                        }
                                        goto label_17;
                                    }
                                    catch(Exception exception0) {
                                    }
                                    b.a(Thread.currentThread(), exception0);
                                    adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter.4.this.a;
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
                                AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter.4.this.a;
                                if(adPopcornSSPBannerAd1 != null) {
                                    adPopcornSSPBannerAd1.setVisibility(0);
                                }
                                throw throwable0;
                            label_17:
                                adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter.4.this.a;
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
                if(AppLovinMaxDynamicBidAdapter.this.a != null) {
                    AppLovinMaxDynamicBidAdapter.this.a.a(AppLovinMaxDynamicBidAdapter.this.j);
                }
            }
        });
        ((View)this.s).setLayoutParams(new FrameLayout.LayoutParams(this.q, this.r));
        this.s.loadAd();
    }

    private void a(Context context0, String s, AdPopcornSSPNativeAd adPopcornSSPNativeAd0, String s1) {
        try {
            this.w = new MaxNativeAdLoader(s, ((Activity)context0));
            if(s0.a(s1)) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter native price : " + s1);
                this.w.setExtraParameter("jC7Fp", s1);
            }
            this.w.setExtraParameter("disable_auto_retries", "true");
            this.w.setRevenueListener(new MaxAdRevenueListener() {
                final AppLovinMaxDynamicBidAdapter a;

                public void onAdRevenuePaid(MaxAd maxAd0) {
                }
            });
            this.w.setNativeAdListener(new MaxNativeAdListener() {
                final AppLovinMaxDynamicBidAdapter b;

                public void onNativeAdClicked(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter onNativeAdClicked");
                    if(AppLovinMaxDynamicBidAdapter.this.c != null) {
                        AppLovinMaxDynamicBidAdapter.this.c.onClicked();
                    }
                }

                public void onNativeAdLoadFailed(String s, MaxError maxError0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter onNativeAdLoadFailed : " + maxError0.getMessage());
                    if(AppLovinMaxDynamicBidAdapter.this.c != null) {
                        AppLovinMaxDynamicBidAdapter.this.c.a(AppLovinMaxDynamicBidAdapter.this.l, 2);
                    }
                }

                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView0, MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter onNativeAdLoaded");
                    try {
                        if(AppLovinMaxDynamicBidAdapter.this.x != null) {
                            AppLovinMaxDynamicBidAdapter.this.w.destroy(AppLovinMaxDynamicBidAdapter.this.x);
                        }
                        AppLovinMaxDynamicBidAdapter.this.x = maxAd0;
                        adPopcornSSPNativeAd0.removeAllViews();
                        adPopcornSSPNativeAd0.addView(((View)maxNativeAdView0));
                        if(AppLovinMaxDynamicBidAdapter.this.c != null) {
                            AppLovinMaxDynamicBidAdapter.this.c.a(AppLovinMaxDynamicBidAdapter.this.l);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    exception0.printStackTrace();
                    if(AppLovinMaxDynamicBidAdapter.this.c != null) {
                        AppLovinMaxDynamicBidAdapter.this.c.a(AppLovinMaxDynamicBidAdapter.this.l, 1);
                    }
                }
            });
            this.w.loadAd(this.a(context0, adPopcornSSPNativeAd0));
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        c0 c00 = this.c;
        if(c00 != null) {
            c00.a(this.l, 1);
        }
    }

    private void a(Context context0, String s, String s1) {
        try {
            this.u = new MaxInterstitialAd(s, ((Activity)context0));
            if(s0.a(s1)) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial video price : " + s1);
                this.u.setExtraParameter("jC7Fp", s1);
            }
            this.u.setExtraParameter("disable_auto_retries", "true");
            this.u.setListener(((MaxAdListener)new MaxAdViewAdListener() {
                final AppLovinMaxDynamicBidAdapter a;

                public void onAdClicked(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial video onAdClicked");
                    if(AppLovinMaxDynamicBidAdapter.this.e != null) {
                        AppLovinMaxDynamicBidAdapter.this.e.onClickAd();
                    }
                }

                public void onAdCollapsed(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial video onAdCollapsed");
                }

                public void onAdDisplayFailed(MaxAd maxAd0, MaxError maxError0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial video onAdDisplayFailed");
                }

                public void onAdDisplayed(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial video onAdDisplayed");
                    if(AppLovinMaxDynamicBidAdapter.this.p && AppLovinMaxDynamicBidAdapter.this.e != null) {
                        AppLovinMaxDynamicBidAdapter.this.e.a(AppLovinMaxDynamicBidAdapter.this.n);
                    }
                }

                public void onAdExpanded(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial video onAdExpanded");
                }

                public void onAdHidden(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial video onAdHidden");
                    if(AppLovinMaxDynamicBidAdapter.this.e != null) {
                        AppLovinMaxDynamicBidAdapter.this.e.a();
                    }
                    AppLovinMaxDynamicBidAdapter.this.p = false;
                }

                public void onAdLoadFailed(String s, MaxError maxError0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial video onAdLoadFailed");
                    if(AppLovinMaxDynamicBidAdapter.this.p && AppLovinMaxDynamicBidAdapter.this.e != null) {
                        AppLovinMaxDynamicBidAdapter.this.e.d(AppLovinMaxDynamicBidAdapter.this.n);
                    }
                }

                public void onAdLoaded(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial video onAdLoaded");
                    if(AppLovinMaxDynamicBidAdapter.this.p && AppLovinMaxDynamicBidAdapter.this.e != null) {
                        AppLovinMaxDynamicBidAdapter.this.e.b(AppLovinMaxDynamicBidAdapter.this.n);
                    }
                }
            }));
            this.u.loadAd();
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        V v0 = this.e;
        if(v0 != null) {
            v0.d(this.n);
        }
    }

    private void a(boolean z) {
    }

    public void a() {
    }

    private void b(Context context0, String s, String s1) {
        try {
            this.t = new MaxInterstitialAd(s, ((Activity)context0));
            if(s0.a(s1)) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial price : " + s1);
                this.t.setExtraParameter("jC7Fp", s1);
            }
            this.t.setExtraParameter("disable_auto_retries", "true");
            this.t.setListener(((MaxAdListener)new MaxAdViewAdListener() {
                final AppLovinMaxDynamicBidAdapter a;

                public void onAdClicked(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial onAdClicked");
                    if(AppLovinMaxDynamicBidAdapter.this.b != null) {
                        AppLovinMaxDynamicBidAdapter.this.b.a();
                    }
                }

                public void onAdCollapsed(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial onAdCollapsed");
                }

                public void onAdDisplayFailed(MaxAd maxAd0, MaxError maxError0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial onAdDisplayFailed");
                }

                public void onAdDisplayed(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial onAdDisplayed");
                }

                public void onAdExpanded(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial onAdExpanded");
                }

                public void onAdHidden(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial onAdHidden");
                    if(AppLovinMaxDynamicBidAdapter.this.b != null) {
                        AppLovinMaxDynamicBidAdapter.this.b.e(0);
                    }
                }

                public void onAdLoadFailed(String s, MaxError maxError0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial onAdLoadFailed");
                    if(AppLovinMaxDynamicBidAdapter.this.b != null) {
                        int v = AppLovinMaxDynamicBidAdapter.this.k;
                        AppLovinMaxDynamicBidAdapter.this.b.d(v);
                    }
                }

                public void onAdLoaded(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter interstitial onAdLoaded");
                    if(AppLovinMaxDynamicBidAdapter.this.b != null) {
                        AppLovinMaxDynamicBidAdapter.this.b.b(AppLovinMaxDynamicBidAdapter.this.k);
                    }
                }
            }));
            this.t.loadAd();
        }
        catch(Exception exception0) {
            T t0 = this.b;
            if(t0 != null) {
                t0.d(this.k);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    private void c(Context context0, String s, String s1) {
        try {
            this.B = new MaxInterstitialAd(s, ((Activity)context0));
            if(s0.a(s1)) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix price : " + s1);
                this.B.setExtraParameter("jC7Fp", s1);
            }
            this.B.setExtraParameter("disable_auto_retries", "true");
            this.B.setListener(((MaxAdListener)new MaxAdViewAdListener() {
                final AppLovinMaxDynamicBidAdapter a;

                public void onAdClicked(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdClicked");
                    if(AppLovinMaxDynamicBidAdapter.this.i != null) {
                        AppLovinMaxDynamicBidAdapter.this.i.onClickAd();
                    }
                }

                public void onAdCollapsed(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdCollapsed");
                }

                public void onAdDisplayFailed(MaxAd maxAd0, MaxError maxError0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdDisplayFailed");
                }

                public void onAdDisplayed(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdDisplayed");
                }

                public void onAdExpanded(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdExpanded");
                }

                public void onAdHidden(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdHidden");
                    if(AppLovinMaxDynamicBidAdapter.this.i != null) {
                        AppLovinMaxDynamicBidAdapter.this.i.a();
                    }
                }

                public void onAdLoadFailed(String s, MaxError maxError0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdLoadFailed");
                    if(AppLovinMaxDynamicBidAdapter.this.i != null) {
                        int v = AppLovinMaxDynamicBidAdapter.this.z;
                        AppLovinMaxDynamicBidAdapter.this.i.d(v);
                    }
                }

                public void onAdLoaded(MaxAd maxAd0) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix onAdLoaded");
                    if(AppLovinMaxDynamicBidAdapter.this.i != null) {
                        int v = AppLovinMaxDynamicBidAdapter.this.z;
                        AppLovinMaxDynamicBidAdapter.this.i.b(v);
                    }
                }
            }));
            this.B.loadAd();
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        E0 e00 = this.i;
        if(e00 != null) {
            e00.d(this.z);
        }
    }

    static void c(AppLovinMaxDynamicBidAdapter appLovinMaxDynamicBidAdapter0, boolean z) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void checkValidMediation() {
        this.y = new MaxRewardedAdListener() {
            final AppLovinMaxDynamicBidAdapter a;

            public void onAdClicked(MaxAd maxAd0) {
            }

            public void onAdDisplayFailed(MaxAd maxAd0, MaxError maxError0) {
            }

            public void onAdDisplayed(MaxAd maxAd0) {
            }

            public void onAdHidden(MaxAd maxAd0) {
            }

            public void onAdLoadFailed(String s, MaxError maxError0) {
            }

            public void onAdLoaded(MaxAd maxAd0) {
            }

            public void onUserRewarded(MaxAd maxAd0, MaxReward maxReward0) {
            }
        };
        b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void destroyAd() {
        this.A = false;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter banner destroyBannerAd");
        MaxAdView maxAdView0 = this.s;
        if(maxAdView0 != null) {
            maxAdView0.destroy();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitialVideoAd() {
        try {
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter.destroyInterstitialVideoAd()");
            this.p = false;
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyModalAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyNativeAd() {
        b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter destroyNativeAd");
        MaxAd maxAd0 = this.x;
        if(maxAd0 != null) {
            MaxNativeAdLoader maxNativeAdLoader0 = this.w;
            if(maxNativeAdLoader0 != null) {
                maxNativeAdLoader0.destroy(maxAd0);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyReactNativeAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyRewardVideoAd() {
        this.o = false;
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
    public String getNetworkName() {
        return "APPLOVIN_MAX_DYNAMIC_BID";
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void initializeSDK(Context context0, p0 p00, SdkInitListener sdkInitListener0) {
        try {
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter initializeSDK");
            if(!AppLovinSdk.getInstance(context0).isInitialized()) {
                AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(p00.a("applovin_sdk_key"), context0).setMediationProvider("max").build();
                AppLovinSdkSettings appLovinSdkSettings0 = AppLovinSdk.getInstance(context0).getSettings();
                appLovinSdkSettings0.setExtraParameter("enable_black_screen_fixes", "true");
                appLovinSdkSettings0.setCreativeDebuggerEnabled(false);
                AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                    final AppLovinMaxDynamicBidAdapter b;

                    public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
                        SdkInitListener sdkInitListener0 = sdkInitListener0;
                        if(sdkInitListener0 != null) {
                            sdkInitListener0.onInitializationFinished();
                        }
                    }
                });
                return;
            }
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
                return;
            }
            return;
        }
        catch(NoClassDefFoundError unused_ex) {
        }
        catch(NoSuchMethodError unused_ex) {
            goto label_16;
        }
        catch(Exception unused_ex) {
            goto label_19;
        }
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
            return;
        label_16:
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
                return;
            label_19:
                if(sdkInitListener0 != null) {
                    sdkInitListener0.onInitializationFinished();
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter banner internalStopBannerAd");
        MaxAdView maxAdView0 = this.s;
        if(maxAdView0 != null) {
            maxAdView0.destroy();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void loadAd(Context context0, AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0, d0 d00, boolean z, int v, int v1) {
        try {
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix loadAd : " + v1);
            this.z = v;
            this.A = true;
            if(v1 != 2 && v1 != 6 && v1 != 4) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter does not support videoMix campaign type");
                E0 e02 = this.i;
                if(e02 != null) {
                    e02.d(v);
                }
            }
            else {
                if(!(context0 instanceof Activity)) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix context is not activity context");
                    E0 e00 = this.i;
                    if(e00 != null) {
                        e00.d(v);
                    }
                    return;
                }
                String s = ((a0)d00.e().a().get(v)).a("AppLovinMaxUnitId");
                String s1 = ((a0)d00.e().a().get(v)).a("price");
                String s2 = ((a0)d00.e().a().get(v)).a("AppLovinSdkKey");
                if(!AppLovinSdk.getInstance(context0).isInitialized()) {
                    Y y0 = Y.b();
                    com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter.19 appLovinMaxDynamicBidAdapter$190 = new a() {
                        final AppLovinMaxDynamicBidAdapter e;

                        @Override  // com.igaworks.ssp.Y$a
                        public void a() {
                            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix initialized and loadAd");
                            if(v1 == 2 || v1 == 6) {
                                AppLovinMaxDynamicBidAdapter.this.c(context0, s, s1);
                            }
                            else {
                                MaxRewardedAd maxRewardedAd0 = MaxRewardedAd.getInstance(s, ((Activity)context0));
                                AppLovinMaxDynamicBidAdapter.this.C = maxRewardedAd0;
                                if(AppLovinMaxDynamicBidAdapter.this.C == null || !AppLovinMaxDynamicBidAdapter.this.C.isReady()) {
                                    goto label_9;
                                }
                                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix already ready to display");
                                if(AppLovinMaxDynamicBidAdapter.this.A && AppLovinMaxDynamicBidAdapter.this.i != null) {
                                    AppLovinMaxDynamicBidAdapter.this.i.b(AppLovinMaxDynamicBidAdapter.this.z);
                                    return;
                                label_9:
                                    if(s0.a(s1)) {
                                        b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix price : " + s1);
                                        AppLovinMaxDynamicBidAdapter.this.C.setExtraParameter("jC7Fp", s1);
                                    }
                                    AppLovinMaxDynamicBidAdapter.this.C.setExtraParameter("disable_auto_retries", "true");
                                    AppLovinMaxDynamicBidAdapter.this.C.setListener(AppLovinMaxDynamicBidAdapter.this.E);
                                    AppLovinMaxDynamicBidAdapter.this.C.loadAd();
                                }
                            }
                        }
                    };
                    y0.a(adPopcornSSPVideoMixAd0.getPlacementId(), i.z.b(), appLovinMaxDynamicBidAdapter$190);
                    AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(s2, context0).setMediationProvider("max").build();
                    AppLovinSdkSettings appLovinSdkSettings0 = AppLovinSdk.getInstance(context0).getSettings();
                    appLovinSdkSettings0.setExtraParameter("enable_black_screen_fixes", "true");
                    appLovinSdkSettings0.setCreativeDebuggerEnabled(false);
                    AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                        final AppLovinMaxDynamicBidAdapter b;

                        public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
                            Y.b().a(adPopcornSSPVideoMixAd0.getPlacementId(), i.z.b());
                        }
                    });
                    return;
                }
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix already initialized");
                if(v1 == 2 || v1 == 6) {
                    this.c(context0, s, s1);
                    return;
                }
                MaxRewardedAd maxRewardedAd0 = MaxRewardedAd.getInstance(s, ((Activity)context0));
                this.C = maxRewardedAd0;
                if(maxRewardedAd0 == null || !maxRewardedAd0.isReady()) {
                    if(s0.a(s1)) {
                        b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix price : " + s1);
                        this.C.setExtraParameter("jC7Fp", s1);
                    }
                    this.C.setExtraParameter("disable_auto_retries", "true");
                    this.C.setListener(this.E);
                    this.C.loadAd();
                    return;
                }
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix already ready to display");
                E0 e01 = this.i;
                if(e01 != null) {
                    e01.b(this.z);
                }
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix exception");
            E0 e03 = this.i;
            if(e03 != null) {
                e03.d(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        try {
            this.k = v;
            if(!(context0 instanceof Activity)) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter context is not activity context");
                T t0 = this.b;
                if(t0 != null) {
                    t0.d(v);
                    return;
                }
                return;
            }
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter.loadInterstitial()");
            String s = ((a0)d00.e().a().get(v)).a("AppLovinMaxUnitId");
            String s1 = ((a0)d00.e().a().get(v)).a("price");
            String s2 = ((a0)d00.e().a().get(v)).a("AppLovinSdkKey");
            if(AppLovinSdk.getInstance(context0).isInitialized()) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter already initialized");
                this.b(context0, s, s1);
                return;
            }
            Y y0 = Y.b();
            com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter.5 appLovinMaxDynamicBidAdapter$50 = new a() {
                final AppLovinMaxDynamicBidAdapter d;

                @Override  // com.igaworks.ssp.Y$a
                public void a() {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter initialized and loadAd");
                    AppLovinMaxDynamicBidAdapter.this.b(context0, s, s1);
                }
            };
            y0.a(adPopcornSSPInterstitialAd0.getPlacementId(), i.z.b(), appLovinMaxDynamicBidAdapter$50);
            AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(s2, context0).setMediationProvider("max").build();
            AppLovinSdkSettings appLovinSdkSettings0 = AppLovinSdk.getInstance(context0).getSettings();
            appLovinSdkSettings0.setExtraParameter("enable_black_screen_fixes", "true");
            appLovinSdkSettings0.setCreativeDebuggerEnabled(false);
            AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                final AppLovinMaxDynamicBidAdapter b;

                public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
                    Y.b().a(adPopcornSSPInterstitialAd0.getPlacementId(), i.z.b());
                }
            });
        }
        catch(Exception exception0) {
            T t1 = this.b;
            if(t1 != null) {
                t1.d(v);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitialVideoAd(Context context0, AdPopcornSSPInterstitialVideoAd adPopcornSSPInterstitialVideoAd0, d0 d00, boolean z, int v) {
        try {
            this.n = v;
            if(!(context0 instanceof Activity)) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter loadInterstitialVideoAd context is not activity context");
                V v1 = this.e;
                if(v1 != null) {
                    v1.d(this.n);
                    return;
                }
                return;
            }
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter.loadInterstitialVideoAd()");
            this.p = true;
            String s = ((a0)d00.e().a().get(v)).a("AppLovinMaxUnitId");
            String s1 = ((a0)d00.e().a().get(v)).a("price");
            String s2 = ((a0)d00.e().a().get(v)).a("AppLovinSdkKey");
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter call init unitId : " + s);
            if(AppLovinSdk.getInstance(context0).isInitialized()) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter already initialized");
                this.a(context0, s, s1);
                return;
            }
            Y y0 = Y.b();
            com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter.15 appLovinMaxDynamicBidAdapter$150 = new a() {
                final AppLovinMaxDynamicBidAdapter d;

                @Override  // com.igaworks.ssp.Y$a
                public void a() {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter initialized and loadAd");
                    AppLovinMaxDynamicBidAdapter.this.a(context0, s, s1);
                }
            };
            y0.a(adPopcornSSPInterstitialVideoAd0.getPlacementId(), i.z.b(), appLovinMaxDynamicBidAdapter$150);
            AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(s2, context0).setMediationProvider("max").build();
            AppLovinSdkSettings appLovinSdkSettings0 = AppLovinSdk.getInstance(context0).getSettings();
            appLovinSdkSettings0.setExtraParameter("enable_black_screen_fixes", "true");
            appLovinSdkSettings0.setCreativeDebuggerEnabled(false);
            AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                final AppLovinMaxDynamicBidAdapter b;

                public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
                    Y.b().a(adPopcornSSPInterstitialVideoAd0.getPlacementId(), i.z.b());
                }
            });
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        if(this.p) {
            V v2 = this.e;
            if(v2 != null) {
                v2.d(this.n);
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
        b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter.loadNativeAd()");
        this.l = v;
        try {
            if(!(context0 instanceof Activity)) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter loadNativeAd context is not activity context");
                c0 c00 = this.c;
                if(c00 != null) {
                    c00.a(this.l, 0);
                    return;
                }
                return;
            }
            String s = ((a0)d00.e().a().get(v)).a("AppLovinMaxUnitId");
            String s1 = ((a0)d00.e().a().get(v)).a("price");
            String s2 = ((a0)d00.e().a().get(v)).a("AppLovinSdkKey");
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter call init unitId : " + s);
            if(AppLovinSdk.getInstance(context0).isInitialized()) {
                this.a(context0, s, adPopcornSSPNativeAd0, s1);
                return;
            }
            Y y0 = Y.b();
            com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter.11 appLovinMaxDynamicBidAdapter$110 = new a() {
                final AppLovinMaxDynamicBidAdapter e;

                @Override  // com.igaworks.ssp.Y$a
                public void a() {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter initialized and loadAd");
                    AppLovinMaxDynamicBidAdapter.this.a(context0, s, adPopcornSSPNativeAd0, s1);
                }
            };
            y0.a(adPopcornSSPNativeAd0.getPlacementId(), i.z.b(), appLovinMaxDynamicBidAdapter$110);
            AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(s2, context0).setMediationProvider("max").build();
            AppLovinSdkSettings appLovinSdkSettings0 = AppLovinSdk.getInstance(context0).getSettings();
            appLovinSdkSettings0.setExtraParameter("enable_black_screen_fixes", "true");
            appLovinSdkSettings0.setCreativeDebuggerEnabled(false);
            AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                final AppLovinMaxDynamicBidAdapter b;

                public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
                    Y.b().a(adPopcornSSPNativeAd0.getPlacementId(), i.z.b());
                }
            });
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        c0 c01 = this.c;
        if(c01 != null) {
            c01.a(this.l, 0);
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
        try {
            this.m = v;
            if(!(context0 instanceof Activity)) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter loadRewardVideoAd context is not activity context");
                l0 l00 = this.d;
                if(l00 != null) {
                    l00.d(v);
                    return;
                }
                return;
            }
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter.loadRewardVideoAd()");
            this.o = true;
            String s = ((a0)d00.e().a().get(v)).a("AppLovinMaxUnitId");
            String s1 = ((a0)d00.e().a().get(v)).a("price");
            String s2 = ((a0)d00.e().a().get(v)).a("AppLovinSdkKey");
            if(!AppLovinSdk.getInstance(context0).isInitialized()) {
                Y y0 = Y.b();
                com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter.8 appLovinMaxDynamicBidAdapter$80 = new a() {
                    final AppLovinMaxDynamicBidAdapter d;

                    @Override  // com.igaworks.ssp.Y$a
                    public void a() {
                        if(AppLovinMaxDynamicBidAdapter.this.v == null || !AppLovinMaxDynamicBidAdapter.this.v.isReady()) {
                            MaxRewardedAd maxRewardedAd0 = MaxRewardedAd.getInstance(s, ((Activity)context0));
                            AppLovinMaxDynamicBidAdapter.this.v = maxRewardedAd0;
                            if(s0.a(s1)) {
                                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter loadRewardVideoAd price : " + s1);
                                AppLovinMaxDynamicBidAdapter.this.v.setExtraParameter("jC7Fp", s1);
                            }
                            AppLovinMaxDynamicBidAdapter.this.v.setExtraParameter("disable_auto_retries", "true");
                            AppLovinMaxDynamicBidAdapter.this.v.setListener(AppLovinMaxDynamicBidAdapter.this.D);
                            AppLovinMaxDynamicBidAdapter.this.v.loadAd();
                        }
                        else {
                            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter loadRewardVideoAd already ready to display");
                            if(AppLovinMaxDynamicBidAdapter.this.o && AppLovinMaxDynamicBidAdapter.this.d != null) {
                                AppLovinMaxDynamicBidAdapter.this.d.b(AppLovinMaxDynamicBidAdapter.this.m);
                            }
                        }
                    }
                };
                y0.a(adPopcornSSPRewardVideoAd0.getPlacementId(), i.z.b(), appLovinMaxDynamicBidAdapter$80);
                AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(s2, context0).setMediationProvider("max").build();
                AppLovinSdkSettings appLovinSdkSettings0 = AppLovinSdk.getInstance(context0).getSettings();
                appLovinSdkSettings0.setExtraParameter("enable_black_screen_fixes", "true");
                appLovinSdkSettings0.setCreativeDebuggerEnabled(false);
                AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                    final AppLovinMaxDynamicBidAdapter b;

                    public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
                        Y.b().a(adPopcornSSPRewardVideoAd0.getPlacementId(), i.z.b());
                    }
                });
                return;
            }
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter already initialized");
            if(this.v == null || !this.v.isReady()) {
                this.v = MaxRewardedAd.getInstance(s, ((Activity)context0));
                if(s0.a(s1)) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter loadRewardVideoAd price : " + s1);
                    this.v.setExtraParameter("jC7Fp", s1);
                }
                this.v.setExtraParameter("disable_auto_retries", "true");
                this.v.setListener(this.D);
                this.v.loadAd();
                return;
            }
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter loadRewardVideoAd already ready to display");
            if(this.o) {
                l0 l01 = this.d;
                if(l01 != null) {
                    l01.b(v);
                    return;
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        if(this.o) {
            l0 l02 = this.d;
            if(l02 != null) {
                l02.d(this.m);
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
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix showAd : " + v1);
            switch(v1) {
                case 4: {
                    if(this.C.isReady()) {
                        if(context0 instanceof Activity) {
                            this.C.showAd(((Activity)context0));
                            return;
                        }
                        this.C.showAd();
                        return;
                    }
                    if(this.A) {
                        E0 e02 = this.i;
                        if(e02 != null) {
                            e02.c(v);
                            return;
                        }
                    }
                    break;
                }
                case 2: 
                case 6: {
                    if(this.B.isReady()) {
                        if(context0 instanceof Activity) {
                            this.B.showAd(((Activity)context0));
                            return;
                        }
                        this.B.showAd();
                        return;
                    }
                    E0 e01 = this.i;
                    if(e01 != null) {
                        e01.c(v);
                        return;
                    }
                    break;
                }
                default: {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter does not support videoMix campaign type");
                    E0 e00 = this.i;
                    if(e00 != null) {
                        e00.c(v);
                    }
                }
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter videoMix exception");
            E0 e03 = this.i;
            if(e03 != null) {
                e03.c(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        try {
            if(this.t.isReady()) {
                if(context0 instanceof Activity) {
                    this.t.showAd(((Activity)context0));
                    return;
                }
                this.t.showAd();
                return;
            }
            T t0 = this.b;
            if(t0 != null) {
                t0.c(v);
            }
        }
        catch(Exception exception0) {
            T t1 = this.b;
            if(t1 != null) {
                t1.c(v);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitialVideoAd(Context context0, d0 d00, boolean z, int v) {
        try {
            if(this.u.isReady()) {
                if(context0 instanceof Activity) {
                    this.u.showAd(((Activity)context0));
                    return;
                }
                this.u.showAd();
                return;
            }
            if(this.p) {
                V v1 = this.e;
                if(v1 != null) {
                    v1.c(v);
                    return;
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        V v2 = this.e;
        if(v2 != null) {
            v2.c(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showRewardVideoAd(Context context0, d0 d00, boolean z, int v) {
        try {
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter.showRewardVideoAd()");
            if(this.v.isReady()) {
                if(context0 instanceof Activity) {
                    this.v.showAd(((Activity)context0));
                    return;
                }
                this.v.showAd();
                return;
            }
            if(this.o) {
                l0 l00 = this.d;
                if(l00 != null) {
                    l00.c(v);
                }
            }
        }
        catch(Exception unused_ex) {
            if(this.o) {
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
            this.j = v;
            if(adSize0 == AdSize.BANNER_320x50) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter BANNER_320x50");
                this.q = -1;
                this.r = (int)J.a(context0, 50.0f);
            }
            else {
                if(adSize0 != AdSize.BANNER_300x250 && adSize0 != AdSize.BANNER_ADAPTIVE_SIZE) {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter BANNER_320x100 does not support");
                    C c0 = this.a;
                    if(c0 != null) {
                        c0.a(v);
                    }
                    return;
                }
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter BANNER_300x250");
                this.q = (int)J.a(context0, 300.0f);
                this.r = (int)J.a(context0, 250.0f);
            }
            if(!(context0 instanceof Activity)) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter context is not activity context");
                C c1 = this.a;
                if(c1 != null) {
                    c1.a(v);
                }
                return;
            }
            b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter.startBannerAd()");
            String s = ((a0)d00.e().a().get(v)).a("AppLovinMaxUnitId");
            String s1 = ((a0)d00.e().a().get(v)).a("price");
            String s2 = ((a0)d00.e().a().get(v)).a("AppLovinSdkKey");
            if(AppLovinSdk.getInstance(context0).isInitialized()) {
                b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter already initialized");
                this.a(context0, s, adPopcornSSPBannerAd0, s1, adSize0);
                return;
            }
            Y y0 = Y.b();
            com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter.2 appLovinMaxDynamicBidAdapter$20 = new a() {
                final AppLovinMaxDynamicBidAdapter f;

                @Override  // com.igaworks.ssp.Y$a
                public void a() {
                    b.a(Thread.currentThread(), "AppLovinMaxDynamicBidAdapter initialized and loadAd");
                    AppLovinMaxDynamicBidAdapter.this.a(context0, s, adPopcornSSPBannerAd0, s1, adSize0);
                }
            };
            y0.a(adPopcornSSPBannerAd0.getPlacementId(), i.z.b(), appLovinMaxDynamicBidAdapter$20);
            AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(s2, context0).setMediationProvider("max").build();
            AppLovinSdkSettings appLovinSdkSettings0 = AppLovinSdk.getInstance(context0).getSettings();
            appLovinSdkSettings0.setExtraParameter("enable_black_screen_fixes", "true");
            appLovinSdkSettings0.setCreativeDebuggerEnabled(false);
            AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                final AppLovinMaxDynamicBidAdapter b;

                public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
                    Y.b().a(adPopcornSSPBannerAd0.getPlacementId(), i.z.b());
                }
            });
        }
        catch(Exception exception0) {
            C c2 = this.a;
            if(c2 != null) {
                c2.a(v);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }
}

