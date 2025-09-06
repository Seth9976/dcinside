package com.igaworks.ssp.common.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
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
import java.util.HashMap;

public class AdmobAdapter implements BaseMediationAdapter, VideoMixAdMediationAdapter {
    private boolean A;
    private Handler B;
    private Runnable C;
    private int D;
    private AdListener E;
    private boolean F;
    private int G;
    private boolean H;
    private Runnable I;
    private boolean J;
    private InterstitialAd K;
    private RewardedAd L;
    private C a;
    private T b;
    private c0 c;
    private l0 d;
    private V e;
    private r0 f;
    private g0 g;
    private b0 h;
    private E0 i;
    private boolean j;
    private AdView k;
    private AdRequest l;
    private InterstitialAd m;
    private InterstitialAd n;
    private AdLoader o;
    private NativeAdView p;
    private NativeAd q;
    private RewardedAd r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private Handler w;
    private Runnable x;
    private Runnable y;
    private boolean z;

    public AdmobAdapter() {
        this.j = true;
        this.u = true;
        this.v = true;
        this.w = new Handler(Looper.getMainLooper());
        this.z = false;
        this.A = false;
        this.B = new Handler(Looper.getMainLooper());
        this.G = 0;
        this.H = true;
        this.J = false;
    }

    private void a(Context context0) {
        try {
            MobileAds.initialize(context0);
        }
        catch(Exception unused_ex) {
        }
    }

    // 检测为 Lambda 实现
    private void a(Context context0, SdkInitListener sdkInitListener0) [...]

    private void a(NativeAd nativeAd0, AdPopcornSSPNativeAd adPopcornSSPNativeAd0) {
        if(adPopcornSSPNativeAd0.getAdMobViewBinder().mediaViewId != 0) {
            MediaView mediaView0 = (MediaView)this.p.findViewById(adPopcornSSPNativeAd0.getAdMobViewBinder().mediaViewId);
            this.p.setMediaView(mediaView0);
        }
        if(adPopcornSSPNativeAd0.getAdMobViewBinder().headlineViewId != 0) {
            this.p.setHeadlineView(this.p.findViewById(adPopcornSSPNativeAd0.getAdMobViewBinder().headlineViewId));
        }
        if(adPopcornSSPNativeAd0.getAdMobViewBinder().bodyViewId != 0) {
            this.p.setBodyView(this.p.findViewById(adPopcornSSPNativeAd0.getAdMobViewBinder().bodyViewId));
        }
        if(adPopcornSSPNativeAd0.getAdMobViewBinder().callToActionId != 0) {
            this.p.setCallToActionView(this.p.findViewById(adPopcornSSPNativeAd0.getAdMobViewBinder().callToActionId));
        }
        if(adPopcornSSPNativeAd0.getAdMobViewBinder().iconViewId != 0) {
            this.p.setIconView(this.p.findViewById(adPopcornSSPNativeAd0.getAdMobViewBinder().iconViewId));
        }
        if(adPopcornSSPNativeAd0.getAdMobViewBinder().priceViewId != 0) {
            this.p.setPriceView(this.p.findViewById(adPopcornSSPNativeAd0.getAdMobViewBinder().priceViewId));
        }
        if(adPopcornSSPNativeAd0.getAdMobViewBinder().starRatingViewId != 0) {
            this.p.setStarRatingView(this.p.findViewById(adPopcornSSPNativeAd0.getAdMobViewBinder().starRatingViewId));
        }
        if(adPopcornSSPNativeAd0.getAdMobViewBinder().storeViewId != 0) {
            this.p.setStoreView(this.p.findViewById(adPopcornSSPNativeAd0.getAdMobViewBinder().storeViewId));
        }
        if(adPopcornSSPNativeAd0.getAdMobViewBinder().advertiserViewId != 0) {
            this.p.setAdvertiserView(this.p.findViewById(adPopcornSSPNativeAd0.getAdMobViewBinder().advertiserViewId));
        }
        ((TextView)this.p.getHeadlineView()).setText(nativeAd0.getHeadline());
        if(nativeAd0.getBody() != null) {
            if(this.p.getBodyView() != null) {
                this.p.getBodyView().setVisibility(0);
                ((TextView)this.p.getBodyView()).setText(nativeAd0.getBody());
            }
        }
        else if(this.p.getBodyView() != null) {
            this.p.getBodyView().setVisibility(4);
        }
        if(nativeAd0.getCallToAction() != null) {
            if(this.p.getCallToActionView() != null) {
                this.p.getCallToActionView().setVisibility(0);
                ((Button)this.p.getCallToActionView()).setText(nativeAd0.getCallToAction());
            }
        }
        else if(this.p.getCallToActionView() != null) {
            this.p.getCallToActionView().setVisibility(4);
        }
        if(nativeAd0.getIcon() != null) {
            if(this.p.getIconView() != null) {
                ((ImageView)this.p.getIconView()).setImageDrawable(nativeAd0.getIcon().getDrawable());
                this.p.getIconView().setVisibility(0);
            }
        }
        else if(this.p.getIconView() != null) {
            this.p.getIconView().setVisibility(8);
        }
        if(nativeAd0.getPrice() != null) {
            if(this.p.getPriceView() != null) {
                this.p.getPriceView().setVisibility(0);
                ((TextView)this.p.getPriceView()).setText(nativeAd0.getPrice());
            }
        }
        else if(this.p.getPriceView() != null) {
            this.p.getPriceView().setVisibility(4);
        }
        if(nativeAd0.getStore() != null) {
            if(this.p.getStoreView() != null) {
                this.p.getStoreView().setVisibility(0);
                ((TextView)this.p.getStoreView()).setText(nativeAd0.getStore());
            }
        }
        else if(this.p.getStoreView() != null) {
            this.p.getStoreView().setVisibility(4);
        }
        if(nativeAd0.getStarRating() != null) {
            if(this.p.getStarRatingView() != null) {
                ((RatingBar)this.p.getStarRatingView()).setRating(nativeAd0.getStarRating().floatValue());
                this.p.getStarRatingView().setVisibility(0);
            }
        }
        else if(this.p.getStarRatingView() != null) {
            this.p.getStarRatingView().setVisibility(4);
        }
        if(nativeAd0.getAdvertiser() != null) {
            if(this.p.getAdvertiserView() != null) {
                ((TextView)this.p.getAdvertiserView()).setText(nativeAd0.getAdvertiser());
                this.p.getAdvertiserView().setVisibility(0);
            }
        }
        else if(this.p.getAdvertiserView() != null) {
            this.p.getAdvertiserView().setVisibility(4);
        }
        this.p.setNativeAd(nativeAd0);
        adPopcornSSPNativeAd0.removeView(this.p);
        adPopcornSSPNativeAd0.addView(this.p);
    }

    private void a(boolean z) {
        try {
            if(z) {
                this.u = false;
                Handler handler0 = this.w;
                if(handler0 != null) {
                    handler0.removeCallbacks(this.x);
                }
            }
            else {
                this.v = false;
                Handler handler1 = this.w;
                if(handler1 != null) {
                    handler1.removeCallbacks(this.y);
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
        this.E = new AdListener() {
            final AdmobAdapter a;

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError0) {
            }
        };
        b.a(Thread.currentThread(), "AdmobAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void destroyAd() {
        try {
            this.J = false;
            this.removeVideoMixTimeoutHandler();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            b.a(Thread.currentThread(), "AdMobAdapter.destroyBannerAd");
            AdView adView0 = this.k;
            if(adView0 != null) {
                adView0.removeAllViews();
                this.k.setAdListener(null);
                this.k.destroy();
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
        try {
            b.a(Thread.currentThread(), "AdMobAdapter.destroyInterstitialVideoAd() : " + this.n);
            this.A = false;
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
        NativeAdView nativeAdView0 = this.p;
        if(nativeAdView0 != null) {
            nativeAdView0.destroy();
        }
        if(this.o != null) {
            this.o = null;
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyReactNativeAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyRewardVideoAd() {
        try {
            b.a(Thread.currentThread(), "AdMobAdapter.destroyRewardVideoAd() : " + this.r);
            this.z = false;
            this.F = false;
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
        return null;
    }

    // 去混淆评级： 低(20)
    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public String getNetworkName() [...] // 潜在的解密器

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void initializeSDK(Context context0, p0 p00, SdkInitListener sdkInitListener0) {
        try {
            b.a(Thread.currentThread(), "AdMobAdapter initializeSDK");
            new Thread(() -> MobileAds.initialize(context0, new com.igaworks.ssp.common.adapter.AdmobAdapter.15(this, sdkInitListener0))).start();
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

        class com.igaworks.ssp.common.adapter.AdmobAdapter.15 implements OnInitializationCompleteListener {
            final AdmobAdapter b;

            com.igaworks.ssp.common.adapter.AdmobAdapter.15(SdkInitListener sdkInitListener0) {
            }

            @Override  // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public void onInitializationComplete(InitializationStatus initializationStatus0) {
                SdkInitListener sdkInitListener0 = this.a;
                if(sdkInitListener0 != null) {
                    sdkInitListener0.onInitializationFinished();
                }
            }
        }

    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        try {
            b.a(Thread.currentThread(), "AdMobAdapter.internalStopBannerAd");
            AdView adView0 = this.k;
            if(adView0 != null) {
                adView0.setAdListener(null);
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
            b.a(Thread.currentThread(), "AdMobAdapter videoMix loadAd : " + v1);
            this.H = true;
            this.G = v;
            this.J = true;
            if(this.w == null) {
                this.w = new Handler();
            }
            if(this.I == null) {
                this.I = new Runnable() {
                    final AdmobAdapter a;

                    @Override
                    public void run() {
                        if(AdmobAdapter.this.H) {
                            b.b(Thread.currentThread(), "Time out in : AdMob");
                            if(AdmobAdapter.this.i != null) {
                                AdmobAdapter.this.i.d(AdmobAdapter.this.G);
                            }
                        }
                    }
                };
            }
            this.w.postDelayed(this.I, adPopcornSSPVideoMixAd0.getNetworkScheduleTimeout());
            this.a(context0);
            String s = ((a0)d00.e().a().get(v)).a("AdMob");
            switch(v1) {
                case 4: {
                    try {
                        this.F = false;
                        b.a(Thread.currentThread(), "AdMobAdapter videoMix load ad");
                        RewardedAd.load(context0, s, new Builder().build(), new RewardedAdLoadCallback() {
                            final AdmobAdapter a;

                            @Override  // com.google.android.gms.ads.AdLoadCallback
                            public void onAdFailedToLoad(LoadAdError loadAdError0) {
                                b.a(Thread.currentThread(), "AdMobAdapter videoMix onAdFailedToLoad() : " + loadAdError0.getMessage());
                                AdmobAdapter.this.L = null;
                                AdmobAdapter.this.removeVideoMixTimeoutHandler();
                                if(AdmobAdapter.this.J && AdmobAdapter.this.i != null) {
                                    AdmobAdapter.this.i.d(AdmobAdapter.this.G);
                                }
                            }

                            public void onAdLoaded(RewardedAd rewardedAd0) {
                                b.a(Thread.currentThread(), "AdMobAdapter videoMix onAdLoaded");
                                AdmobAdapter.this.removeVideoMixTimeoutHandler();
                                AdmobAdapter.this.L = rewardedAd0;
                                if(AdmobAdapter.this.J && AdmobAdapter.this.i != null) {
                                    AdmobAdapter.this.i.b(AdmobAdapter.this.G);
                                }
                            }

                            @Override  // com.google.android.gms.ads.AdLoadCallback
                            public void onAdLoaded(Object object0) {
                                this.onAdLoaded(((RewardedAd)object0));
                            }
                        });
                        return;
                    }
                    catch(Exception exception0) {
                        this.removeVideoMixTimeoutHandler();
                        b.a(Thread.currentThread(), exception0);
                        E0 e00 = this.i;
                        if(e00 != null) {
                            e00.d(this.G);
                            return;
                        }
                        break;
                    }
                label_28:
                    b.a(Thread.currentThread(), "AdMobAdapter does not support videoMix campaign type");
                    this.removeVideoMixTimeoutHandler();
                    E0 e01 = this.i;
                    if(e01 != null) {
                        e01.d(v);
                        return;
                    }
                    break;
                }
                case 2: 
                case 6: {
                    if(this.K != null) {
                        this.K = null;
                    }
                    InterstitialAd.load(context0, s, new Builder().build(), new InterstitialAdLoadCallback() {
                        final AdmobAdapter b;

                        @Override  // com.google.android.gms.ads.AdLoadCallback
                        public void onAdFailedToLoad(LoadAdError loadAdError0) {
                            AdmobAdapter.this.K = null;
                            b.c(Thread.currentThread(), "AdmobAdapter videoMix onAdFailedToLoad " + loadAdError0.getCode() + ", message : " + loadAdError0.getMessage());
                            AdmobAdapter.this.removeVideoMixTimeoutHandler();
                            if(AdmobAdapter.this.i != null) {
                                AdmobAdapter.this.i.d(v);
                            }
                        }

                        public void onAdLoaded(InterstitialAd interstitialAd0) {
                            b.c(Thread.currentThread(), "AdmobAdapter videoMix onAdLoaded");
                            AdmobAdapter.this.K = interstitialAd0;
                            AdmobAdapter.this.removeVideoMixTimeoutHandler();
                            if(AdmobAdapter.this.i != null) {
                                AdmobAdapter.this.i.b(v);
                            }
                        }

                        @Override  // com.google.android.gms.ads.AdLoadCallback
                        public void onAdLoaded(Object object0) {
                            this.onAdLoaded(((InterstitialAd)object0));
                        }
                    });
                    return;
                }
                default: {
                    goto label_28;
                }
            }
        }
        catch(Exception unused_ex) {
            this.removeVideoMixTimeoutHandler();
            E0 e02 = this.i;
            if(e02 != null) {
                e02.d(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "AdmobAdapter loadInterstitial");
            this.a(context0);
            String s = ((a0)d00.e().a().get(v)).a("AdMob");
            if(this.m != null) {
                this.m = null;
            }
            InterstitialAd.load(context0, s, new Builder().build(), new InterstitialAdLoadCallback() {
                final AdmobAdapter b;

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    AdmobAdapter.this.m = null;
                    b.c(Thread.currentThread(), "AdmobAdapter interstitial onAdFailedToLoad " + String.format("domain: %s, code: %d, message: %s", loadAdError0.getDomain(), loadAdError0.getCode(), loadAdError0.getMessage()));
                    if(AdmobAdapter.this.b != null) {
                        AdmobAdapter.this.b.d(v);
                    }
                }

                public void onAdLoaded(InterstitialAd interstitialAd0) {
                    b.c(Thread.currentThread(), "AdmobAdapter loadInterstitial onAdLoaded");
                    AdmobAdapter.this.m = interstitialAd0;
                    if(AdmobAdapter.this.b != null) {
                        AdmobAdapter.this.b.b(v);
                    }
                }

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(Object object0) {
                    this.onAdLoaded(((InterstitialAd)object0));
                }
            });
        }
        catch(Exception exception0) {
            T t0 = this.b;
            if(t0 != null) {
                t0.d(v);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitialVideoAd(Context context0, AdPopcornSSPInterstitialVideoAd adPopcornSSPInterstitialVideoAd0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "AdmobAdapter loadInterstitialVideoAd");
            this.A = true;
            this.s = v;
            this.v = true;
            if(adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.w == null) {
                    this.w = new Handler();
                }
                if(this.y == null) {
                    this.y = new Runnable() {
                        final AdmobAdapter a;

                        @Override
                        public void run() {
                            if(AdmobAdapter.this.v) {
                                b.b(Thread.currentThread(), "Time out in : AdMob");
                                AdmobAdapter.this.a(false);
                                if(AdmobAdapter.this.A && AdmobAdapter.this.e != null) {
                                    AdmobAdapter.this.e.d(AdmobAdapter.this.s);
                                }
                            }
                        }
                    };
                }
                this.w.postDelayed(this.y, adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout());
            }
            this.a(context0);
            String s = ((a0)d00.e().a().get(v)).a("AdMob");
            if(this.n != null) {
                this.n = null;
            }
            InterstitialAd.load(context0, s, new Builder().build(), new InterstitialAdLoadCallback() {
                final AdmobAdapter a;

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    AdmobAdapter.this.m = null;
                    b.c(Thread.currentThread(), "AdmobAdapter interstitialVideo onAdFailedToLoad " + String.format("domain: %s, code: %d, message: %s", loadAdError0.getDomain(), loadAdError0.getCode(), loadAdError0.getMessage()));
                    AdmobAdapter.this.a(false);
                    if(AdmobAdapter.this.A && AdmobAdapter.this.e != null) {
                        AdmobAdapter.this.e.d(AdmobAdapter.this.s);
                    }
                }

                public void onAdLoaded(InterstitialAd interstitialAd0) {
                    b.c(Thread.currentThread(), "AdmobAdapter interstitialVideo onAdLoaded");
                    AdmobAdapter.this.n = interstitialAd0;
                    AdmobAdapter.this.a(false);
                    if(AdmobAdapter.this.A && AdmobAdapter.this.e != null) {
                        AdmobAdapter.this.e.b(AdmobAdapter.this.s);
                    }
                }

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(Object object0) {
                    this.onAdLoaded(((InterstitialAd)object0));
                }
            });
            return;
        }
        catch(Exception exception0) {
        }
        this.a(false);
        b.a(Thread.currentThread(), exception0);
        V v1 = this.e;
        if(v1 != null) {
            v1.d(this.s);
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
            if(adPopcornSSPNativeAd0.getAdMobViewBinder() == null) {
                b.c(Thread.currentThread(), "AdmobAdapter viewBinder is null");
                c0 c00 = this.c;
                if(c00 != null) {
                    c00.a(v, 3);
                    return;
                }
                return;
            }
            b.c(Thread.currentThread(), "AdmobAdapter loadNativeAd");
            com.google.android.gms.ads.AdLoader.Builder adLoader$Builder0 = new com.google.android.gms.ads.AdLoader.Builder(context0, ((a0)d00.e().a().get(v)).a("AdMob"));
            adLoader$Builder0.forNativeAd(new OnNativeAdLoadedListener() {
                final AdmobAdapter c;

                @Override  // com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener
                public void onNativeAdLoaded(NativeAd nativeAd0) {
                    try {
                        b.c(Thread.currentThread(), "AdmobAdapter onNativeAdLoaded");
                        if(AdmobAdapter.this.q != null) {
                            AdmobAdapter.this.q.destroy();
                        }
                        AdmobAdapter.this.q = nativeAd0;
                        AdmobAdapter.this.a(AdmobAdapter.this.q, adPopcornSSPNativeAd0);
                        if(AdmobAdapter.this.c != null) {
                            AdmobAdapter.this.c.a(v);
                        }
                        if(AdmobAdapter.this.p != null) {
                            AdmobAdapter.this.p.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    exception0.printStackTrace();
                    if(AdmobAdapter.this.c != null) {
                        AdmobAdapter.this.c.a(v, 1);
                    }
                }
            });
            AdLoader adLoader0 = adLoader$Builder0.withAdListener(new AdListener() {
                final AdmobAdapter b;

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdClicked() {
                    super.onAdClicked();
                    b.c(Thread.currentThread(), "AdmobAdapter nativeAd onAdClicked");
                    if(AdmobAdapter.this.c != null) {
                        AdmobAdapter.this.c.onClicked();
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    b.c(Thread.currentThread(), "AdmobAdapter NativeAd onAdFailedToLoad : " + String.format("responseInfo: %s, code: %d, message: %s", loadAdError0.getResponseInfo(), loadAdError0.getCode(), loadAdError0.getMessage()));
                    if(AdmobAdapter.this.c != null) {
                        AdmobAdapter.this.c.a(v, 2);
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdImpression() {
                    super.onAdImpression();
                    b.c(Thread.currentThread(), "AdmobAdapter nativeAd onAdImpression");
                    if(AdmobAdapter.this.c != null) {
                        AdmobAdapter.this.c.onImpression();
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    super.onAdLoaded();
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdOpened() {
                    super.onAdOpened();
                }
            }).build();
            if(adPopcornSSPNativeAd0.getAdMobViewBinder().nativeAdViewId != 0) {
                this.p = (NativeAdView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getAdMobViewBinder().nativeAdViewId);
            }
            adLoader0.loadAd(new Builder().build());
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
        g0 g00 = this.g;
        if(g00 != null) {
            g00.a(v, 2);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadRewardVideoAd(Context context0, AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0, d0 d00, boolean z, int v) {
        try {
            this.z = true;
            b.a(Thread.currentThread(), "AdMobAdapter.loadRewardVideoAd()");
            this.t = v;
            this.u = true;
            this.F = false;
            if(adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.w == null) {
                    this.w = new Handler();
                }
                if(this.x == null) {
                    this.x = new Runnable() {
                        final AdmobAdapter a;

                        @Override
                        public void run() {
                            if(AdmobAdapter.this.u) {
                                b.b(Thread.currentThread(), "Time out in : AdMob");
                                AdmobAdapter.this.a(true);
                                if(AdmobAdapter.this.z && AdmobAdapter.this.d != null) {
                                    AdmobAdapter.this.d.d(AdmobAdapter.this.t);
                                }
                            }
                        }
                    };
                }
                this.w.postDelayed(this.x, adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout());
            }
            b.a(Thread.currentThread(), "AdMobAdapter.loadRewardVideoAd() load ad");
            RewardedAd.load(context0, ((a0)d00.e().a().get(v)).a("AdMob"), new Builder().build(), new RewardedAdLoadCallback() {
                final AdmobAdapter a;

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    b.a(Thread.currentThread(), "AdMobAdapter RV onAdFailedToLoad() : " + loadAdError0.getMessage());
                    AdmobAdapter.this.r = null;
                    AdmobAdapter.this.a(true);
                    if(AdmobAdapter.this.z && AdmobAdapter.this.d != null) {
                        AdmobAdapter.this.d.d(AdmobAdapter.this.t);
                    }
                }

                public void onAdLoaded(RewardedAd rewardedAd0) {
                    b.a(Thread.currentThread(), "AdMobAdapter RV onAdLoaded");
                    AdmobAdapter.this.a(true);
                    AdmobAdapter.this.r = rewardedAd0;
                    if(AdmobAdapter.this.z && AdmobAdapter.this.d != null) {
                        AdmobAdapter.this.d.b(AdmobAdapter.this.t);
                    }
                }

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(Object object0) {
                    this.onAdLoaded(((RewardedAd)object0));
                }
            });
            return;
        }
        catch(Exception exception0) {
        }
        this.a(true);
        b.a(Thread.currentThread(), exception0);
        l0 l00 = this.d;
        if(l00 != null) {
            l00.d(this.t);
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
        try {
            b.a(Thread.currentThread(), "AdMobAdapter.pauseRewardVideoAd()");
        }
        catch(Exception unused_ex) {
        }
    }

    public void removeVideoMixTimeoutHandler() {
        try {
            this.H = false;
            Handler handler0 = this.w;
            if(handler0 != null) {
                handler0.removeCallbacks(this.I);
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
        try {
            b.a(Thread.currentThread(), "AdMobAdapter.resumeRewardVideoAd()");
        }
        catch(Exception unused_ex) {
        }
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
        b.a(Thread.currentThread(), "AdMobAdapter videoMix showAd : " + v1);
        switch(v1) {
            case 4: {
                RewardedAd rewardedAd0 = this.L;
                if(rewardedAd0 != null) {
                    rewardedAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                        final AdmobAdapter b;

                        @Override  // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdDismissedFullScreenContent() {
                            b.a(Thread.currentThread(), "AdMobAdapter videoMix onAdDismissedFullScreenContent()");
                            AdmobAdapter.this.L = null;
                            if(AdmobAdapter.this.i != null) {
                                AdmobAdapter.this.i.a();
                            }
                        }

                        @Override  // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdFailedToShowFullScreenContent(AdError adError0) {
                            b.a(Thread.currentThread(), "AdMobAdapter videoMix onAdFailedToShowFullScreenContent() : " + adError0.getMessage());
                            AdmobAdapter.this.L = null;
                            if(AdmobAdapter.this.J && AdmobAdapter.this.i != null) {
                                AdmobAdapter.this.i.c(v);
                            }
                        }

                        @Override  // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdShowedFullScreenContent() {
                            b.a(Thread.currentThread(), "AdMobAdapter videoMix onAdShowedFullScreenContent()");
                            if(AdmobAdapter.this.J && AdmobAdapter.this.i != null) {
                                AdmobAdapter.this.i.a(v);
                            }
                        }
                    });
                    this.L.show(((Activity)context0), new OnUserEarnedRewardListener() {
                        final AdmobAdapter a;

                        @Override  // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public void onUserEarnedReward(RewardItem rewardItem0) {
                            b.a(Thread.currentThread(), "AdmobAdapter videoMix onUserEarnedReward() : " + AdmobAdapter.this.F);
                            if(!AdmobAdapter.this.F) {
                                if(AdmobAdapter.this.i != null) {
                                    AdmobAdapter.this.i.a(i.d.b(), true);
                                }
                                AdmobAdapter.this.J = false;
                                AdmobAdapter.this.F = true;
                            }
                        }
                    });
                    return;
                }
                if(this.J) {
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
                InterstitialAd interstitialAd0 = this.K;
                if(interstitialAd0 != null) {
                    interstitialAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                        final AdmobAdapter b;

                        @Override  // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdDismissedFullScreenContent() {
                            b.c(Thread.currentThread(), "AdmobAdapter videoMix onAdDismissedFullScreenContent");
                            AdmobAdapter.this.K = null;
                            if(AdmobAdapter.this.i != null) {
                                AdmobAdapter.this.i.a();
                            }
                        }

                        @Override  // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdFailedToShowFullScreenContent(AdError adError0) {
                            b.c(Thread.currentThread(), "AdmobAdapter videoMix onAdFailedToShowFullScreenContent : " + adError0.getMessage());
                            AdmobAdapter.this.K = null;
                            if(AdmobAdapter.this.i != null) {
                                AdmobAdapter.this.i.c(v);
                            }
                        }

                        @Override  // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdShowedFullScreenContent() {
                            b.c(Thread.currentThread(), "AdmobAdapter videoMix onAdShowedFullScreenContent");
                            if(AdmobAdapter.this.i != null) {
                                AdmobAdapter.this.i.a(v);
                            }
                        }
                    });
                    this.K.show(((Activity)context0));
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
                b.a(Thread.currentThread(), "AdMobAdapter does not support videoMix campaign type");
                E0 e00 = this.i;
                if(e00 != null) {
                    e00.c(v);
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "AdmobAdapter showInterstitial");
            InterstitialAd interstitialAd0 = this.m;
            if(interstitialAd0 != null) {
                interstitialAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                    final AdmobAdapter b;

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        b.c(Thread.currentThread(), "AdmobAdapter interstitial onAdDismissedFullScreenContent");
                        AdmobAdapter.this.m = null;
                        if(AdmobAdapter.this.b != null) {
                            AdmobAdapter.this.b.e(0);
                        }
                    }

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError0) {
                        b.c(Thread.currentThread(), "AdmobAdapter interstitial onAdFailedToShowFullScreenContent : " + adError0.getMessage());
                        AdmobAdapter.this.m = null;
                        if(AdmobAdapter.this.b != null) {
                            AdmobAdapter.this.b.c(v);
                        }
                    }

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        b.c(Thread.currentThread(), "AdmobAdapter interstitial onAdShowedFullScreenContent");
                        if(AdmobAdapter.this.b != null) {
                            AdmobAdapter.this.b.a(v);
                        }
                    }
                });
                this.m.show(((Activity)context0));
                return;
            }
            T t0 = this.b;
            if(t0 != null) {
                t0.c(v);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        T t1 = this.b;
        if(t1 != null) {
            t1.c(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitialVideoAd(Context context0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "AdmobAdapter showInterstitialVideoAd");
            InterstitialAd interstitialAd0 = this.n;
            if(interstitialAd0 != null) {
                interstitialAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                    final AdmobAdapter a;

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        b.c(Thread.currentThread(), "AdmobAdapter interstitialVideo onAdDismissedFullScreenContent");
                        AdmobAdapter.this.n = null;
                        if(AdmobAdapter.this.e != null) {
                            AdmobAdapter.this.e.a();
                        }
                        AdmobAdapter.this.A = false;
                    }

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError0) {
                        b.c(Thread.currentThread(), "AdmobAdapter interstitialVideo onAdFailedToShowFullScreenContent");
                        AdmobAdapter.this.n = null;
                        if(AdmobAdapter.this.A && AdmobAdapter.this.e != null) {
                            AdmobAdapter.this.e.c(AdmobAdapter.this.s);
                        }
                    }

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        b.c(Thread.currentThread(), "AdmobAdapter interstitialVideo onAdShowedFullScreenContent");
                        if(AdmobAdapter.this.A && AdmobAdapter.this.e != null) {
                            AdmobAdapter.this.e.a(AdmobAdapter.this.s);
                        }
                    }
                });
                this.n.show(((Activity)context0));
                return;
            }
            if(this.A) {
                V v1 = this.e;
                if(v1 != null) {
                    v1.c(this.s);
                    return;
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        if(this.A) {
            V v2 = this.e;
            if(v2 != null) {
                v2.c(this.s);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showRewardVideoAd(Context context0, d0 d00, boolean z, int v) {
        b.a(Thread.currentThread(), "AdMobAdapter.showRewardVideoAd()");
        RewardedAd rewardedAd0 = this.r;
        if(rewardedAd0 != null) {
            rewardedAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                final AdmobAdapter b;

                @Override  // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    b.a(Thread.currentThread(), "AdMobAdapter RV onAdDismissedFullScreenContent()");
                    AdmobAdapter.this.r = null;
                    if(AdmobAdapter.this.d != null) {
                        AdmobAdapter.this.d.a();
                    }
                }

                @Override  // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError0) {
                    b.a(Thread.currentThread(), "AdMobAdapter RV onAdFailedToShowFullScreenContent() : " + adError0.getMessage());
                    AdmobAdapter.this.r = null;
                    if(AdmobAdapter.this.z && AdmobAdapter.this.d != null) {
                        AdmobAdapter.this.d.c(v);
                    }
                }

                @Override  // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    b.a(Thread.currentThread(), "AdMobAdapter RV onAdShowedFullScreenContent()");
                    if(AdmobAdapter.this.z && AdmobAdapter.this.d != null) {
                        AdmobAdapter.this.d.a(v);
                    }
                }
            });
            this.r.show(((Activity)context0), new OnUserEarnedRewardListener() {
                final AdmobAdapter a;

                @Override  // com.google.android.gms.ads.OnUserEarnedRewardListener
                public void onUserEarnedReward(RewardItem rewardItem0) {
                    b.a(Thread.currentThread(), "AdmobAdapter RV onUserEarnedReward() : " + AdmobAdapter.this.F);
                    if(!AdmobAdapter.this.F) {
                        if(AdmobAdapter.this.d != null) {
                            AdmobAdapter.this.d.a(i.d.b(), true);
                        }
                        AdmobAdapter.this.z = false;
                        AdmobAdapter.this.F = true;
                    }
                }
            });
            return;
        }
        if(this.z) {
            l0 l00 = this.d;
            if(l00 != null) {
                l00.c(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void startBannerAd(Context context0, AdSize adSize0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, d0 d00, boolean z, int v) {
        try {
            this.j = true;
            this.D = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.B == null) {
                    this.B = new Handler();
                }
                if(this.C == null) {
                    this.C = new Runnable() {
                        final AdmobAdapter a;

                        @Override
                        public void run() {
                            if(AdmobAdapter.this.j) {
                                b.b(Thread.currentThread(), "Time out in : AdMob");
                                if(AdmobAdapter.this.a != null) {
                                    AdmobAdapter.this.a.a(AdmobAdapter.this.D);
                                }
                            }
                        }
                    };
                }
                this.B.postDelayed(this.C, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            this.a(context0);
            b.a(Thread.currentThread(), "AdmobAdapter.startBannerAd()");
            String s = ((a0)d00.e().a().get(v)).a("AdMob");
            if(this.k == null) {
                AdView adView0 = new AdView(context0);
                this.k = adView0;
                if(adSize0 == AdSize.BANNER_320x50) {
                    adView0.setAdSize(com.google.android.gms.ads.AdSize.BANNER);
                }
                else if(adSize0 == AdSize.BANNER_320x100) {
                    adView0.setAdSize(com.google.android.gms.ads.AdSize.LARGE_BANNER);
                }
                else {
                    adView0.setAdSize(com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE);
                }
                this.k.setAdUnitId(s);
            }
            else {
                b.a(Thread.currentThread(), "already exist AdMobView");
            }
            this.l = new Builder().build();
            this.k.setAdListener(new AdListener() {
                final AdmobAdapter b;

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdClicked() {
                    super.onAdClicked();
                    b.b(Thread.currentThread(), "AdMobAdapter banner onAdClicked");
                    if(AdmobAdapter.this.a != null) {
                        AdmobAdapter.this.a.a();
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    super.onAdFailedToLoad(loadAdError0);
                    try {
                        b.b(Thread.currentThread(), "AdMobAdapter failed to load in AdMob, error code : " + loadAdError0.getCode());
                        AdmobAdapter.this.stopBannerTimer();
                        if(AdmobAdapter.this.a != null) {
                            AdmobAdapter.this.a.a(AdmobAdapter.this.D);
                        }
                    }
                    catch(Exception exception0) {
                        b.a(Thread.currentThread(), exception0);
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    super.onAdLoaded();
                    b.b(Thread.currentThread(), "AdMobAdapter banner onAdLoaded");
                    try {
                        adPopcornSSPBannerAd0.removeAllViewsInLayout();
                        adPopcornSSPBannerAd0.removeAllViews();
                        adPopcornSSPBannerAd0.addView(AdmobAdapter.this.k);
                        AdmobAdapter.this.stopBannerTimer();
                        if(AdmobAdapter.this.a != null) {
                            AdmobAdapter.this.a.b(AdmobAdapter.this.D);
                        }
                        if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                            adPopcornSSPBannerAd0.setVisibility(4);
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                final com.igaworks.ssp.common.adapter.AdmobAdapter.3 a;

                                @Override
                                public void run() {
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                    try {
                                        try {
                                            AdmobAdapter.this.k.buildDrawingCache();
                                            Bitmap bitmap0 = AdmobAdapter.this.k.getDrawingCache();
                                            if(bitmap0 != null) {
                                                int v = bitmap0.getPixel(1, 1);
                                                com.igaworks.ssp.common.adapter.AdmobAdapter.3.this.a.setBackgroundColor(v);
                                            }
                                            goto label_17;
                                        }
                                        catch(Exception exception0) {
                                        }
                                        b.a(Thread.currentThread(), exception0);
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.AdmobAdapter.3.this.a;
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
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.AdmobAdapter.3.this.a;
                                    if(adPopcornSSPBannerAd1 != null) {
                                        adPopcornSSPBannerAd1.setVisibility(0);
                                    }
                                    throw throwable0;
                                label_17:
                                    adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.AdmobAdapter.3.this.a;
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
                    AdmobAdapter.this.stopBannerTimer();
                    if(AdmobAdapter.this.a != null) {
                        AdmobAdapter.this.a.a(AdmobAdapter.this.D);
                    }
                }
            });
            this.k.loadAd(this.l);
            return;
        }
        catch(Exception exception0) {
        }
        this.stopBannerTimer();
        C c0 = this.a;
        if(c0 != null) {
            c0.a(this.D);
        }
        b.a(Thread.currentThread(), exception0);
    }

    public void stopBannerTimer() {
        try {
            this.j = false;
            Handler handler0 = this.B;
            if(handler0 != null) {
                handler0.removeCallbacks(this.C);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

