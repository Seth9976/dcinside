package com.igaworks.ssp.common.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
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
import com.igaworks.ssp.i;
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
import com.kakao.adfit.ads.AdListener;
import com.kakao.adfit.ads.ba.BannerAdView;
import com.kakao.adfit.ads.na.AdFitAdInfoIconPosition;
import com.kakao.adfit.ads.na.AdFitBizBoardAdTemplateLayout;
import com.kakao.adfit.ads.na.AdFitMediaView;
import com.kakao.adfit.ads.na.AdFitNativeAdBinder.OnAdClickListener;
import com.kakao.adfit.ads.na.AdFitNativeAdBinder;
import com.kakao.adfit.ads.na.AdFitNativeAdLayout;
import com.kakao.adfit.ads.na.AdFitNativeAdLoader.AdLoadListener;
import com.kakao.adfit.ads.na.AdFitNativeAdLoader;
import com.kakao.adfit.ads.na.AdFitNativeAdRequest.Builder;
import com.kakao.adfit.ads.na.AdFitNativeAdRequest;
import com.kakao.adfit.ads.na.AdFitNativeAdView;
import com.kakao.adfit.ads.na.AdFitVideoAutoPlayPolicy;
import java.util.HashMap;

public class AdFitAdapter implements BaseMediationAdapter {
    private C a;
    private c0 b;
    private r0 c;
    private g0 d;
    private b0 e;
    private boolean f;
    private BannerAdView g;
    private AdFitNativeAdView h;
    private AdFitBizBoardAdTemplateLayout i;
    private AdFitNativeAdLoader j;
    private AdFitNativeAdBinder k;
    private boolean l;
    private AdListener m;
    private Handler n;
    private Runnable o;
    private int p;

    public AdFitAdapter() {
        this.f = true;
        this.l = false;
        this.n = new Handler(Looper.getMainLooper());
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
    }

    public void checkAdPopcornSSPReactNativeImpression() {
    }

    public boolean checkMinimumTargetAPI() [...] // Inlined contents

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkValidMediation() {
        this.m = new AdListener() {
            final AdFitAdapter a;

            @Override  // com.kakao.adfit.ads.AdListener
            public void onAdClicked() {
            }

            @Override  // com.kakao.adfit.ads.AdListener
            public void onAdFailed(int v) {
            }

            @Override  // com.kakao.adfit.ads.AdListener
            public void onAdLoaded() {
            }
        };
        b.a(Thread.currentThread(), "AdFitAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            b.a(Thread.currentThread(), "AdFitAdapter.destroyBannerAd");
            BannerAdView bannerAdView0 = this.g;
            if(bannerAdView0 != null) {
                bannerAdView0.pause();
                this.g.removeAllViews();
                this.g.setAdListener(null);
                this.g.destroy();
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
        b.c(Thread.currentThread(), "AdFitAdapter destroyNativeAd");
        AdFitNativeAdBinder adFitNativeAdBinder0 = this.k;
        if(adFitNativeAdBinder0 != null) {
            adFitNativeAdBinder0.unbind();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyReactNativeAd() {
        b.c(Thread.currentThread(), "AdFitAdapter destroyReactNativeAd");
        AdFitNativeAdBinder adFitNativeAdBinder0 = this.k;
        if(adFitNativeAdBinder0 != null) {
            adFitNativeAdBinder0.unbind();
        }
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
        b.a(Thread.currentThread(), "AdFitAdapter initializeSDK");
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        try {
            b.a(Thread.currentThread(), "AdFitAdapter.internalStopBannerAd");
            BannerAdView bannerAdView0 = this.g;
            if(bannerAdView0 != null) {
                bannerAdView0.pause();
                this.g.removeAllViews();
                this.g.setAdListener(null);
                this.g.destroy();
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
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
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
        boolean z1;
        try {
            if(adPopcornSSPNativeAd0.getAdFitViewBinder() == null) {
                b.c(Thread.currentThread(), "AdFitAdapter viewBinder is null");
                c0 c00 = this.b;
                if(c00 != null) {
                    c00.a(v, 3);
                }
                return;
            }
            String s = ((a0)d00.e().a().get(v)).a("AdFit");
            b.a(Thread.currentThread(), "AdFitAdapter clientId : " + s);
            if(this.j == null) {
                this.j = AdFitNativeAdLoader.create(context0, s);
            }
            if(adPopcornSSPNativeAd0.getAdFitViewBinder() == null) {
                z1 = false;
            }
            else {
                z1 = adPopcornSSPNativeAd0.getAdFitViewBinder().isTestMode;
                this.l = adPopcornSSPNativeAd0.getAdFitViewBinder().isBizBoard;
                b.c(Thread.currentThread(), "AdFitAdapter nativeTestMode " + z1 + ", isBizBoardAd : " + this.l);
            }
            AdFitNativeAdRequest adFitNativeAdRequest0 = new Builder().setAdInfoIconPosition(AdFitAdInfoIconPosition.RIGHT_TOP).setVideoAutoPlayPolicy(AdFitVideoAutoPlayPolicy.WIFI_ONLY).setTestModeEnabled(z1).build();
            this.j.loadAd(adFitNativeAdRequest0, new AdLoadListener() {
                final AdFitAdapter c;

                @Override  // com.kakao.adfit.ads.na.AdFitNativeAdLoader$AdLoadListener
                public void onAdLoadError(int v) {
                    b.c(Thread.currentThread(), "AdFitAdapter Native ad onAdLoadError : " + v);
                    if(AdFitAdapter.this.b != null) {
                        AdFitAdapter.this.b.a(v, 2);
                    }
                }

                @Override  // com.kakao.adfit.ads.na.AdFitNativeAdLoader$AdLoadListener
                public void onAdLoaded(AdFitNativeAdBinder adFitNativeAdBinder0) {
                    b.c(Thread.currentThread(), "AdFitAdapter Native ad loaded!");
                    try {
                        if(AdFitAdapter.this.j != null && (AdFitAdapter.this.h != null || AdFitAdapter.this.i != null)) {
                            if(AdFitAdapter.this.k != null) {
                                AdFitAdapter.this.k.unbind();
                            }
                            if(AdFitAdapter.this.l) {
                                AdFitAdapter.this.k = adFitNativeAdBinder0;
                                if(AdFitAdapter.this.i != null) {
                                    AdFitAdapter.this.k.bind(AdFitAdapter.this.i);
                                    goto label_29;
                                }
                                b.c(Thread.currentThread(), "AdFitAdapter adFitBizBoardAdTemplateLayout is null");
                                if(AdFitAdapter.this.b != null) {
                                    AdFitAdapter.this.b.a(v, 2);
                                }
                                return;
                            }
                            else {
                                com.kakao.adfit.ads.na.AdFitNativeAdLayout.Builder adFitNativeAdLayout$Builder0 = new com.kakao.adfit.ads.na.AdFitNativeAdLayout.Builder(AdFitAdapter.this.h);
                                if(adPopcornSSPNativeAd0.getAdFitViewBinder().titleViewId != 0) {
                                    adFitNativeAdLayout$Builder0.setTitleView(((TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getAdFitViewBinder().titleViewId)));
                                }
                                if(adPopcornSSPNativeAd0.getAdFitViewBinder().bodyViewId != 0) {
                                    adFitNativeAdLayout$Builder0.setBodyView(((TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getAdFitViewBinder().bodyViewId)));
                                }
                                if(adPopcornSSPNativeAd0.getAdFitViewBinder().callToActionButtonId != 0) {
                                    adFitNativeAdLayout$Builder0.setCallToActionButton(((Button)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getAdFitViewBinder().callToActionButtonId)));
                                }
                                if(adPopcornSSPNativeAd0.getAdFitViewBinder().profileNameViewId != 0) {
                                    adFitNativeAdLayout$Builder0.setProfileNameView(((TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getAdFitViewBinder().profileNameViewId)));
                                }
                                if(adPopcornSSPNativeAd0.getAdFitViewBinder().profileIconViewId != 0) {
                                    adFitNativeAdLayout$Builder0.setProfileIconView(((ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getAdFitViewBinder().profileIconViewId)));
                                }
                                if(adPopcornSSPNativeAd0.getAdFitViewBinder().mediaViewId != 0) {
                                    adFitNativeAdLayout$Builder0.setMediaView(((AdFitMediaView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getAdFitViewBinder().mediaViewId)));
                                }
                                AdFitNativeAdLayout adFitNativeAdLayout0 = adFitNativeAdLayout$Builder0.build();
                                AdFitAdapter.this.k = adFitNativeAdBinder0;
                                AdFitAdapter.this.k.bind(adFitNativeAdLayout0);
                            }
                        label_29:
                            AdFitAdapter.this.k.setOnAdClickListener(new OnAdClickListener() {
                                final com.igaworks.ssp.common.adapter.AdFitAdapter.4 a;

                                @Override  // com.kakao.adfit.ads.na.AdFitNativeAdBinder$OnAdClickListener
                                public void onAdClicked(View view0) {
                                    if(AdFitAdapter.this.b != null) {
                                        AdFitAdapter.this.b.onClicked();
                                    }
                                }
                            });
                            if(AdFitAdapter.this.b != null) {
                                AdFitAdapter.this.b.a(v);
                            }
                            return;
                        }
                        if(AdFitAdapter.this.b != null) {
                            AdFitAdapter.this.b.a(v, 2);
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    exception0.printStackTrace();
                    if(AdFitAdapter.this.b != null) {
                        AdFitAdapter.this.b.a(v, 2);
                    }
                }
            });
            if(this.l) {
                if(adPopcornSSPNativeAd0.getAdFitViewBinder().nativeAdViewId != 0) {
                    this.i = (AdFitBizBoardAdTemplateLayout)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getAdFitViewBinder().nativeAdViewId);
                    return;
                }
            }
            else if(adPopcornSSPNativeAd0.getAdFitViewBinder().nativeAdViewId != 0) {
                this.h = (AdFitNativeAdView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getAdFitViewBinder().nativeAdViewId);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        c0 c01 = this.b;
        if(c01 != null) {
            c01.a(v, 0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadReactNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0) {
        try {
            String s = ((a0)d00.e().a().get(v)).a("AdFit");
            b.a(Thread.currentThread(), "AdFitAdapter ReactNative clientId : " + s);
            if(this.j == null) {
                this.j = AdFitNativeAdLoader.create(context0, s);
            }
            AdFitNativeAdRequest adFitNativeAdRequest0 = new Builder().setAdInfoIconPosition(AdFitAdInfoIconPosition.RIGHT_TOP).setVideoAutoPlayPolicy(AdFitVideoAutoPlayPolicy.WIFI_ONLY).build();
            if(this.i == null) {
                this.i = new AdFitBizBoardAdTemplateLayout(context0);
            }
            int v1 = adPopcornSSPReactNativeAd0.getReactNativeWidth();
            int v2 = adPopcornSSPReactNativeAd0.getReactNativeHeight();
            if(v1 == 0) {
                v1 = -1;
            }
            if(v2 == 0) {
                v2 = -2;
            }
            this.i.setLayoutParams(new FrameLayout.LayoutParams(v1, v2));
            this.j.loadAd(adFitNativeAdRequest0, new AdLoadListener() {
                final AdFitAdapter c;

                @Override  // com.kakao.adfit.ads.na.AdFitNativeAdLoader$AdLoadListener
                public void onAdLoadError(int v) {
                    b.c(Thread.currentThread(), "AdFitAdapter ReactNative ad onAdLoadError : " + v);
                    if(AdFitAdapter.this.d != null) {
                        AdFitAdapter.this.d.a(v, 2);
                    }
                }

                @Override  // com.kakao.adfit.ads.na.AdFitNativeAdLoader$AdLoadListener
                public void onAdLoaded(AdFitNativeAdBinder adFitNativeAdBinder0) {
                    b.c(Thread.currentThread(), "AdFitAdapter ReactNative ad loaded!");
                    try {
                        if(AdFitAdapter.this.k != null) {
                            AdFitAdapter.this.k.unbind();
                        }
                        adPopcornSSPReactNativeAd0.removeAllViewsInLayout();
                        adPopcornSSPReactNativeAd0.removeAllViews();
                        adPopcornSSPReactNativeAd0.addView(AdFitAdapter.this.i);
                        AdFitAdapter.this.k = adFitNativeAdBinder0;
                        if(AdFitAdapter.this.i == null) {
                            b.c(Thread.currentThread(), "AdFitAdapter ReactNative adFitBizBoardAdTemplateLayout is null");
                            if(AdFitAdapter.this.d != null) {
                                AdFitAdapter.this.d.a(v, 2);
                            }
                            return;
                        }
                        AdFitAdapter.this.k.bind(AdFitAdapter.this.i);
                        com.igaworks.ssp.common.adapter.AdFitAdapter.5.1 adFitAdapter$5$10 = new OnAdClickListener() {
                            final com.igaworks.ssp.common.adapter.AdFitAdapter.5 a;

                            @Override  // com.kakao.adfit.ads.na.AdFitNativeAdBinder$OnAdClickListener
                            public void onAdClicked(View view0) {
                                b.c(Thread.currentThread(), "AdFitAdapter ReactNative onAdClicked");
                                if(AdFitAdapter.this.d != null) {
                                    AdFitAdapter.this.d.onClicked();
                                }
                            }
                        };
                        AdFitAdapter.this.k.setOnAdClickListener(adFitAdapter$5$10);
                        if(AdFitAdapter.this.d != null) {
                            int v = AdFitAdapter.this.i.getWidth();
                            int v1 = AdFitAdapter.this.i.getHeight();
                            AdFitAdapter.this.d.a(v, v, v1, i.n.b());
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    exception0.printStackTrace();
                    if(AdFitAdapter.this.d != null) {
                        AdFitAdapter.this.d.a(v, 2);
                    }
                }
            });
        }
        catch(Exception exception0) {
            g0 g00 = this.d;
            if(g00 != null) {
                g00.a(v, 0);
            }
            b.a(Thread.currentThread(), exception0);
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
        b.a(Thread.currentThread(), "AdFitAdapter.onPauseBanner");
        BannerAdView bannerAdView0 = this.g;
        if(bannerAdView0 != null) {
            bannerAdView0.pause();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void onResumeBanner() {
        b.a(Thread.currentThread(), "AdFitAdapter.onResumeBanner");
        BannerAdView bannerAdView0 = this.g;
        if(bannerAdView0 != null) {
            bannerAdView0.resume();
        }
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
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setInterstitialVideoMediationAdapterEventListener(V v0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setModalAdMediationAdapterEventListener(b0 b00) {
        this.e = b00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setNativeMediationAdapterEventListener(c0 c00) {
        this.b = c00;
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

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
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
            this.f = true;
            this.p = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.n == null) {
                    this.n = new Handler();
                }
                if(this.o == null) {
                    this.o = new Runnable() {
                        final AdFitAdapter a;

                        @Override
                        public void run() {
                            if(AdFitAdapter.this.f) {
                                b.b(Thread.currentThread(), "Time out in : AdFit");
                                if(AdFitAdapter.this.a != null) {
                                    AdFitAdapter.this.a.a(AdFitAdapter.this.p);
                                }
                            }
                        }
                    };
                }
                this.n.postDelayed(this.o, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            b.a(Thread.currentThread(), "AdFitAdapter.startBannerAd()");
            String s = ((a0)d00.e().a().get(v)).a("AdFit");
            if(this.g != null) {
                b.a(Thread.currentThread(), "Destroy already exist AdFitView");
                this.g.pause();
                this.g.setAdListener(null);
                this.g.destroy();
            }
            BannerAdView bannerAdView0 = new BannerAdView(context0);
            this.g = bannerAdView0;
            bannerAdView0.setClientId(s);
            this.g.setAdListener(new AdListener() {
                final AdFitAdapter b;

                @Override  // com.kakao.adfit.ads.AdListener
                public void onAdClicked() {
                    b.b(Thread.currentThread(), "AdFitAdapter banner onAdClicked");
                    if(AdFitAdapter.this.a != null) {
                        AdFitAdapter.this.a.a();
                    }
                }

                @Override  // com.kakao.adfit.ads.AdListener
                public void onAdFailed(int v) {
                    try {
                        b.b(Thread.currentThread(), "AdFitAdapter failed to load in AdFit, error code : " + v);
                        AdFitAdapter.this.stopBannerTimer();
                        if(AdFitAdapter.this.a != null) {
                            AdFitAdapter.this.a.a(AdFitAdapter.this.p);
                        }
                    }
                    catch(Exception exception0) {
                        b.a(Thread.currentThread(), exception0);
                    }
                }

                @Override  // com.kakao.adfit.ads.AdListener
                public void onAdLoaded() {
                    try {
                        adPopcornSSPBannerAd0.removeAllViewsInLayout();
                        adPopcornSSPBannerAd0.removeAllViews();
                        adPopcornSSPBannerAd0.addView(AdFitAdapter.this.g);
                        AdFitAdapter.this.stopBannerTimer();
                        if(AdFitAdapter.this.a != null) {
                            AdFitAdapter.this.a.b(AdFitAdapter.this.p);
                        }
                        if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                            adPopcornSSPBannerAd0.setVisibility(4);
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                final com.igaworks.ssp.common.adapter.AdFitAdapter.3 a;

                                @Override
                                public void run() {
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                    try {
                                        try {
                                            AdFitAdapter.this.g.buildDrawingCache();
                                            Bitmap bitmap0 = AdFitAdapter.this.g.getDrawingCache();
                                            if(bitmap0 != null) {
                                                int v = bitmap0.getPixel(1, 1);
                                                com.igaworks.ssp.common.adapter.AdFitAdapter.3.this.a.setBackgroundColor(v);
                                            }
                                            goto label_17;
                                        }
                                        catch(Exception exception0) {
                                        }
                                        b.a(Thread.currentThread(), exception0);
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.AdFitAdapter.3.this.a;
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
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.AdFitAdapter.3.this.a;
                                    if(adPopcornSSPBannerAd1 != null) {
                                        adPopcornSSPBannerAd1.setVisibility(0);
                                    }
                                    throw throwable0;
                                label_17:
                                    adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.AdFitAdapter.3.this.a;
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
                    AdFitAdapter.this.stopBannerTimer();
                    if(AdFitAdapter.this.a != null) {
                        AdFitAdapter.this.a.a(AdFitAdapter.this.p);
                    }
                }
            });
            this.g.loadAd();
        }
        catch(Exception exception0) {
            this.f = false;
            C c0 = this.a;
            if(c0 != null) {
                c0.a(this.p);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    public void stopBannerTimer() {
        try {
            this.f = false;
            Handler handler0 = this.n;
            if(handler0 != null) {
                handler0.removeCallbacks(this.o);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

