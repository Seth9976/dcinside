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
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
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

public class GAMAdapter implements BaseMediationAdapter, VideoMixAdMediationAdapter {
    private boolean A;
    private boolean B;
    private AdListener C;
    private Handler D;
    private Runnable E;
    private int F;
    private boolean G;
    private int H;
    private boolean I;
    private Runnable J;
    private boolean K;
    private AdManagerInterstitialAd L;
    private RewardedAd M;
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
    private AdManagerAdView k;
    private AdManagerAdRequest l;
    private AdManagerInterstitialAd m;
    private AdManagerInterstitialAd n;
    private AdLoader o;
    private NativeAdView p;
    private NativeAd q;
    private RewardedAd r;
    private String s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private Handler x;
    private Runnable y;
    private Runnable z;

    public GAMAdapter() {
        this.j = true;
        this.v = true;
        this.w = true;
        this.x = new Handler(Looper.getMainLooper());
        this.A = false;
        this.B = false;
        this.D = new Handler(Looper.getMainLooper());
        this.H = 0;
        this.I = true;
        this.K = false;
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
        if(adPopcornSSPNativeAd0.getGAMViewBinder().mediaViewId != 0) {
            MediaView mediaView0 = (MediaView)this.p.findViewById(adPopcornSSPNativeAd0.getGAMViewBinder().mediaViewId);
            this.p.setMediaView(mediaView0);
        }
        if(adPopcornSSPNativeAd0.getGAMViewBinder().headlineViewId != 0) {
            this.p.setHeadlineView(this.p.findViewById(adPopcornSSPNativeAd0.getGAMViewBinder().headlineViewId));
        }
        if(adPopcornSSPNativeAd0.getGAMViewBinder().bodyViewId != 0) {
            this.p.setBodyView(this.p.findViewById(adPopcornSSPNativeAd0.getGAMViewBinder().bodyViewId));
        }
        if(adPopcornSSPNativeAd0.getGAMViewBinder().callToActionId != 0) {
            this.p.setCallToActionView(this.p.findViewById(adPopcornSSPNativeAd0.getGAMViewBinder().callToActionId));
        }
        if(adPopcornSSPNativeAd0.getGAMViewBinder().iconViewId != 0) {
            this.p.setIconView(this.p.findViewById(adPopcornSSPNativeAd0.getGAMViewBinder().iconViewId));
        }
        if(adPopcornSSPNativeAd0.getGAMViewBinder().priceViewId != 0) {
            this.p.setPriceView(this.p.findViewById(adPopcornSSPNativeAd0.getGAMViewBinder().priceViewId));
        }
        if(adPopcornSSPNativeAd0.getGAMViewBinder().starRatingViewId != 0) {
            this.p.setStarRatingView(this.p.findViewById(adPopcornSSPNativeAd0.getGAMViewBinder().starRatingViewId));
        }
        if(adPopcornSSPNativeAd0.getGAMViewBinder().storeViewId != 0) {
            this.p.setStoreView(this.p.findViewById(adPopcornSSPNativeAd0.getGAMViewBinder().storeViewId));
        }
        if(adPopcornSSPNativeAd0.getGAMViewBinder().advertiserViewId != 0) {
            this.p.setAdvertiserView(this.p.findViewById(adPopcornSSPNativeAd0.getGAMViewBinder().advertiserViewId));
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
                this.v = false;
                Handler handler0 = this.x;
                if(handler0 != null) {
                    handler0.removeCallbacks(this.y);
                }
            }
            else {
                this.w = false;
                Handler handler1 = this.x;
                if(handler1 != null) {
                    handler1.removeCallbacks(this.z);
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
        this.C = new AdListener() {
            final GAMAdapter a;

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError0) {
            }
        };
        b.a(Thread.currentThread(), "GAMAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void destroyAd() {
        try {
            this.K = false;
            this.removeVideoMixTimeoutHandler();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            b.a(Thread.currentThread(), "GAMAdapter.destroyBannerAd");
            AdManagerAdView adManagerAdView0 = this.k;
            if(adManagerAdView0 != null) {
                adManagerAdView0.removeAllViews();
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
            b.a(Thread.currentThread(), "GAMAdapter.destroyInterstitialVideoAd() : " + this.n);
            this.B = false;
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
            b.a(Thread.currentThread(), "GAMAdapter.destroyRewardVideoAd() : " + this.r);
            this.A = false;
            this.G = false;
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
            b.a(Thread.currentThread(), "GAMAdapter initializeSDK");
            new Thread(() -> MobileAds.initialize(context0, new com.igaworks.ssp.common.adapter.GAMAdapter.17(this, sdkInitListener0))).start();
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

        class com.igaworks.ssp.common.adapter.GAMAdapter.17 implements OnInitializationCompleteListener {
            final GAMAdapter b;

            com.igaworks.ssp.common.adapter.GAMAdapter.17(SdkInitListener sdkInitListener0) {
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
            b.a(Thread.currentThread(), "GAMAdapter.internalStopBannerAd");
            AdManagerAdView adManagerAdView0 = this.k;
            if(adManagerAdView0 != null) {
                adManagerAdView0.setAdListener(null);
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
            b.a(Thread.currentThread(), "GAMAdapter videoMix loadAd : " + v1);
            this.I = true;
            this.H = v;
            this.K = true;
            if(this.x == null) {
                this.x = new Handler();
            }
            if(this.J == null) {
                this.J = new Runnable() {
                    final GAMAdapter a;

                    @Override
                    public void run() {
                        if(GAMAdapter.this.I) {
                            b.b(Thread.currentThread(), "Time out in : GAM");
                            if(GAMAdapter.this.i != null) {
                                GAMAdapter.this.i.d(GAMAdapter.this.H);
                            }
                        }
                    }
                };
            }
            this.x.postDelayed(this.J, adPopcornSSPVideoMixAd0.getNetworkScheduleTimeout());
            this.a(context0);
            switch(v1) {
                case 4: {
                    try {
                        b.a(Thread.currentThread(), "GAMAdapter videoMix load ad");
                        this.G = false;
                        this.s = ((a0)d00.e().a().get(v)).a("GAM");
                        AdManagerAdRequest adManagerAdRequest0 = new Builder().build();
                        RewardedAd.load(context0, this.s, adManagerAdRequest0, new RewardedAdLoadCallback() {
                            final GAMAdapter a;

                            @Override  // com.google.android.gms.ads.AdLoadCallback
                            public void onAdFailedToLoad(LoadAdError loadAdError0) {
                                b.a(Thread.currentThread(), "GAMAdapter videoMix onAdFailedToLoad() : " + loadAdError0.getMessage());
                                GAMAdapter.this.M = null;
                                GAMAdapter.this.removeVideoMixTimeoutHandler();
                                if(GAMAdapter.this.K && GAMAdapter.this.i != null) {
                                    GAMAdapter.this.i.d(GAMAdapter.this.u);
                                }
                            }

                            public void onAdLoaded(RewardedAd rewardedAd0) {
                                b.a(Thread.currentThread(), "GAMAdapter videoMix onAdLoaded");
                                GAMAdapter.this.removeVideoMixTimeoutHandler();
                                GAMAdapter.this.M = rewardedAd0;
                                if(GAMAdapter.this.K && GAMAdapter.this.i != null) {
                                    GAMAdapter.this.i.b(GAMAdapter.this.u);
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
                            e00.d(this.u);
                            return;
                        }
                        break;
                    }
                label_30:
                    b.a(Thread.currentThread(), "GAMAdapter not support videoMix campaign type");
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
                    String s = ((a0)d00.e().a().get(v)).a("GAM");
                    if(this.L != null) {
                        this.L = null;
                    }
                    AdManagerInterstitialAd.load(context0, s, new Builder().build(), new AdManagerInterstitialAdLoadCallback() {
                        final GAMAdapter b;

                        @Override  // com.google.android.gms.ads.AdLoadCallback
                        public void onAdFailedToLoad(LoadAdError loadAdError0) {
                            GAMAdapter.this.L = null;
                            b.c(Thread.currentThread(), "GAMAdapter videoMix onAdFailedToLoad " + loadAdError0.getCode() + ", message : " + loadAdError0.getMessage());
                            GAMAdapter.this.removeVideoMixTimeoutHandler();
                            if(GAMAdapter.this.i != null) {
                                GAMAdapter.this.i.d(v);
                            }
                        }

                        public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd0) {
                            b.c(Thread.currentThread(), "GAMAdapter videoMix onAdLoaded");
                            GAMAdapter.this.L = adManagerInterstitialAd0;
                            GAMAdapter.this.removeVideoMixTimeoutHandler();
                            if(GAMAdapter.this.i != null) {
                                GAMAdapter.this.i.b(v);
                            }
                        }

                        @Override  // com.google.android.gms.ads.AdLoadCallback
                        public void onAdLoaded(Object object0) {
                            this.onAdLoaded(((AdManagerInterstitialAd)object0));
                        }
                    });
                    return;
                }
                default: {
                    goto label_30;
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
            b.c(Thread.currentThread(), "GAMAdapter loadInterstitial");
            this.a(context0);
            String s = ((a0)d00.e().a().get(v)).a("GAM");
            if(this.m != null) {
                this.m = null;
            }
            AdManagerInterstitialAd.load(context0, s, new Builder().build(), new AdManagerInterstitialAdLoadCallback() {
                final GAMAdapter b;

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    GAMAdapter.this.m = null;
                    b.c(Thread.currentThread(), "GAMAdapter interstitial onAdFailedToLoad " + String.format("domain: %s, code: %d, message: %s", loadAdError0.getDomain(), loadAdError0.getCode(), loadAdError0.getMessage()));
                    if(GAMAdapter.this.b != null) {
                        GAMAdapter.this.b.d(v);
                    }
                }

                public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd0) {
                    b.c(Thread.currentThread(), "GAMAdapter loadInterstitial onAdLoaded");
                    GAMAdapter.this.m = adManagerInterstitialAd0;
                    if(GAMAdapter.this.b != null) {
                        GAMAdapter.this.b.b(v);
                    }
                }

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(Object object0) {
                    this.onAdLoaded(((AdManagerInterstitialAd)object0));
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
            b.c(Thread.currentThread(), "GAMAdapter loadInterstitialVideoAd");
            this.B = true;
            this.t = v;
            this.w = true;
            if(adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.x == null) {
                    this.x = new Handler();
                }
                if(this.z == null) {
                    this.z = new Runnable() {
                        final GAMAdapter a;

                        @Override
                        public void run() {
                            if(GAMAdapter.this.w) {
                                b.b(Thread.currentThread(), "Time out in : GAM");
                                GAMAdapter.this.a(false);
                                if(GAMAdapter.this.B && GAMAdapter.this.e != null) {
                                    GAMAdapter.this.e.d(GAMAdapter.this.t);
                                }
                            }
                        }
                    };
                }
                this.x.postDelayed(this.z, adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout());
            }
            this.a(context0);
            String s = ((a0)d00.e().a().get(v)).a("GAM");
            if(this.n != null) {
                this.n = null;
            }
            AdManagerInterstitialAd.load(context0, s, new Builder().build(), new AdManagerInterstitialAdLoadCallback() {
                final GAMAdapter a;

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    GAMAdapter.this.n = null;
                    b.c(Thread.currentThread(), "GAMAdapter interstitialVideo onAdFailedToLoad " + String.format("domain: %s, code: %d, message: %s", loadAdError0.getDomain(), loadAdError0.getCode(), loadAdError0.getMessage()));
                    GAMAdapter.this.a(false);
                    if(GAMAdapter.this.B && GAMAdapter.this.e != null) {
                        GAMAdapter.this.e.d(GAMAdapter.this.t);
                    }
                }

                public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd0) {
                    b.c(Thread.currentThread(), "GAMAdapter interstitialVideo onAdLoaded");
                    GAMAdapter.this.n = adManagerInterstitialAd0;
                    GAMAdapter.this.a(false);
                    if(GAMAdapter.this.B && GAMAdapter.this.e != null) {
                        GAMAdapter.this.e.b(GAMAdapter.this.t);
                    }
                }

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(Object object0) {
                    this.onAdLoaded(((AdManagerInterstitialAd)object0));
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
            v1.d(this.t);
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
            if(adPopcornSSPNativeAd0.getGAMViewBinder() == null) {
                b.c(Thread.currentThread(), "GAMAdapter viewBinder is null");
                c0 c00 = this.c;
                if(c00 != null) {
                    c00.a(v, 3);
                    return;
                }
                return;
            }
            b.c(Thread.currentThread(), "GAMAdapter loadNativeAd");
            com.google.android.gms.ads.AdLoader.Builder adLoader$Builder0 = new com.google.android.gms.ads.AdLoader.Builder(context0, ((a0)d00.e().a().get(v)).a("GAM"));
            adLoader$Builder0.forNativeAd(new OnNativeAdLoadedListener() {
                final GAMAdapter c;

                @Override  // com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener
                public void onNativeAdLoaded(NativeAd nativeAd0) {
                    try {
                        b.c(Thread.currentThread(), "GAMAdapter onNativeAdLoaded");
                        if(GAMAdapter.this.q != null) {
                            GAMAdapter.this.q.destroy();
                        }
                        GAMAdapter.this.q = nativeAd0;
                        GAMAdapter.this.a(GAMAdapter.this.q, adPopcornSSPNativeAd0);
                        if(GAMAdapter.this.c != null) {
                            GAMAdapter.this.c.a(v);
                        }
                        if(GAMAdapter.this.p != null) {
                            GAMAdapter.this.p.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    exception0.printStackTrace();
                    if(GAMAdapter.this.c != null) {
                        GAMAdapter.this.c.a(v, 1);
                    }
                }
            });
            AdLoader adLoader0 = adLoader$Builder0.withAdListener(new AdListener() {
                final GAMAdapter b;

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdClicked() {
                    super.onAdClicked();
                    b.c(Thread.currentThread(), "GAMAdapter nativeAd onAdClicked");
                    if(GAMAdapter.this.c != null) {
                        GAMAdapter.this.c.onClicked();
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    b.c(Thread.currentThread(), "GAMAdapter NativeAd onAdFailedToLoad : " + String.format("domain: %s, code: %d, message: %s", loadAdError0.getDomain(), loadAdError0.getCode(), loadAdError0.getMessage()));
                    if(GAMAdapter.this.c != null) {
                        GAMAdapter.this.c.a(v, 2);
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdImpression() {
                    super.onAdImpression();
                    b.c(Thread.currentThread(), "GAMAdapter nativeAd onAdImpression");
                    if(GAMAdapter.this.c != null) {
                        GAMAdapter.this.c.onImpression();
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
            if(adPopcornSSPNativeAd0.getGAMViewBinder().nativeAdViewId != 0) {
                this.p = (NativeAdView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getGAMViewBinder().nativeAdViewId);
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
            this.A = true;
            this.u = v;
            b.a(Thread.currentThread(), "GAMAdapter.loadRewardVideoAd()");
            this.a(context0);
            this.v = true;
            this.G = false;
            if(adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.x == null) {
                    this.x = new Handler();
                }
                if(this.y == null) {
                    this.y = new Runnable() {
                        final GAMAdapter a;

                        @Override
                        public void run() {
                            if(GAMAdapter.this.v) {
                                b.b(Thread.currentThread(), "Time out in : GAM");
                                GAMAdapter.this.a(true);
                                if(GAMAdapter.this.A && GAMAdapter.this.d != null) {
                                    GAMAdapter.this.d.d(GAMAdapter.this.u);
                                }
                            }
                        }
                    };
                }
                this.x.postDelayed(this.y, adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout());
            }
            b.a(Thread.currentThread(), "GAMAdapter.loadRewardVideoAd() load ad");
            this.s = ((a0)d00.e().a().get(v)).a("GAM");
            AdManagerAdRequest adManagerAdRequest0 = new Builder().build();
            RewardedAd.load(context0, this.s, adManagerAdRequest0, new RewardedAdLoadCallback() {
                final GAMAdapter a;

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    b.a(Thread.currentThread(), "GAMAdapter RV onAdFailedToLoad() : " + loadAdError0.getMessage() + ", code : " + loadAdError0.getCode());
                    GAMAdapter.this.a(true);
                    GAMAdapter.this.r = null;
                    if(GAMAdapter.this.A && GAMAdapter.this.d != null) {
                        GAMAdapter.this.d.d(GAMAdapter.this.u);
                    }
                }

                public void onAdLoaded(RewardedAd rewardedAd0) {
                    b.a(Thread.currentThread(), "GAMAdapter RV onAdLoaded");
                    GAMAdapter.this.a(true);
                    GAMAdapter.this.r = rewardedAd0;
                    if(GAMAdapter.this.A && GAMAdapter.this.d != null) {
                        GAMAdapter.this.d.b(GAMAdapter.this.u);
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
            l00.d(v);
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
            b.a(Thread.currentThread(), "GAMAdapter.pauseRewardVideoAd()");
        }
        catch(Exception unused_ex) {
        }
    }

    public void removeVideoMixTimeoutHandler() {
        try {
            this.I = false;
            Handler handler0 = this.x;
            if(handler0 != null) {
                handler0.removeCallbacks(this.J);
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
            b.a(Thread.currentThread(), "GAMAdapter.resumeRewardVideoAd()");
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
        try {
            b.a(Thread.currentThread(), "GAMAdapter videoMix showAd : " + v1);
            switch(v1) {
                case 4: {
                    RewardedAd rewardedAd0 = this.M;
                    if(rewardedAd0 != null) {
                        rewardedAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                            final GAMAdapter b;

                            @Override  // com.google.android.gms.ads.FullScreenContentCallback
                            public void onAdDismissedFullScreenContent() {
                                b.a(Thread.currentThread(), "GAMAdapter videoMix onAdDismissedFullScreenContent()");
                                GAMAdapter.this.M = null;
                                if(GAMAdapter.this.i != null) {
                                    GAMAdapter.this.i.a();
                                }
                            }

                            @Override  // com.google.android.gms.ads.FullScreenContentCallback
                            public void onAdFailedToShowFullScreenContent(AdError adError0) {
                                b.a(Thread.currentThread(), "GAMAdapter videoMix onAdFailedToShowFullScreenContent() : " + adError0.getMessage());
                                GAMAdapter.this.M = null;
                                if(GAMAdapter.this.K && GAMAdapter.this.i != null) {
                                    GAMAdapter.this.i.c(v);
                                }
                            }

                            @Override  // com.google.android.gms.ads.FullScreenContentCallback
                            public void onAdShowedFullScreenContent() {
                                b.a(Thread.currentThread(), "GAMAdapter videoMix onAdShowedFullScreenContent()");
                                if(GAMAdapter.this.K && GAMAdapter.this.i != null) {
                                    GAMAdapter.this.i.a(v);
                                }
                            }
                        });
                        this.M.show(((Activity)context0), new OnUserEarnedRewardListener() {
                            final GAMAdapter a;

                            @Override  // com.google.android.gms.ads.OnUserEarnedRewardListener
                            public void onUserEarnedReward(RewardItem rewardItem0) {
                                b.a(Thread.currentThread(), "GAMAdapter videoMix onUserEarnedReward() : " + GAMAdapter.this.G);
                                if(!GAMAdapter.this.G) {
                                    if(GAMAdapter.this.i != null) {
                                        GAMAdapter.this.i.a(i.w.b(), true);
                                    }
                                    GAMAdapter.this.K = false;
                                    GAMAdapter.this.G = true;
                                }
                            }
                        });
                        return;
                    }
                    if(this.K) {
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
                    AdManagerInterstitialAd adManagerInterstitialAd0 = this.L;
                    if(adManagerInterstitialAd0 != null) {
                        adManagerInterstitialAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                            final GAMAdapter b;

                            @Override  // com.google.android.gms.ads.FullScreenContentCallback
                            public void onAdDismissedFullScreenContent() {
                                b.c(Thread.currentThread(), "GAMAdapter videoMix onAdDismissedFullScreenContent");
                                GAMAdapter.this.L = null;
                                if(GAMAdapter.this.i != null) {
                                    GAMAdapter.this.i.a();
                                }
                            }

                            @Override  // com.google.android.gms.ads.FullScreenContentCallback
                            public void onAdFailedToShowFullScreenContent(AdError adError0) {
                                b.c(Thread.currentThread(), "GAMAdapter videoMix onAdFailedToShowFullScreenContent : " + adError0.getMessage());
                                GAMAdapter.this.L = null;
                                if(GAMAdapter.this.i != null) {
                                    GAMAdapter.this.i.c(v);
                                }
                            }

                            @Override  // com.google.android.gms.ads.FullScreenContentCallback
                            public void onAdShowedFullScreenContent() {
                                b.c(Thread.currentThread(), "GAMAdapter videoMix onAdShowedFullScreenContent");
                                if(GAMAdapter.this.i != null) {
                                    GAMAdapter.this.i.a(v);
                                }
                            }
                        });
                        this.L.show(((Activity)context0));
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
                    b.a(Thread.currentThread(), "AdMobAdapter not support videoMix campaign type");
                    E0 e00 = this.i;
                    if(e00 != null) {
                        e00.c(v);
                    }
                }
            }
        }
        catch(Exception unused_ex) {
            E0 e03 = this.i;
            if(e03 != null) {
                e03.c(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "GAMAdapter showInterstitial");
            AdManagerInterstitialAd adManagerInterstitialAd0 = this.m;
            if(adManagerInterstitialAd0 != null) {
                adManagerInterstitialAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                    final GAMAdapter b;

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        b.c(Thread.currentThread(), "GAMAdapter interstitial onAdDismissedFullScreenContent");
                        GAMAdapter.this.m = null;
                        if(GAMAdapter.this.b != null) {
                            GAMAdapter.this.b.e(0);
                        }
                    }

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError0) {
                        b.c(Thread.currentThread(), "GAMAdapter interstitial onAdFailedToShowFullScreenContent");
                        GAMAdapter.this.m = null;
                        if(GAMAdapter.this.b != null) {
                            GAMAdapter.this.b.c(v);
                        }
                    }

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        b.c(Thread.currentThread(), "GAMAdapter interstitial onAdShowedFullScreenContent");
                        if(GAMAdapter.this.b != null) {
                            GAMAdapter.this.b.a(v);
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
        this.t = v;
        if(Looper.myLooper() == Looper.getMainLooper()) {
            try {
                b.c(Thread.currentThread(), "GAMAdapter showInterstitialVideoAd");
                AdManagerInterstitialAd adManagerInterstitialAd0 = this.n;
                if(adManagerInterstitialAd0 != null) {
                    adManagerInterstitialAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                        final GAMAdapter a;

                        @Override  // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdDismissedFullScreenContent() {
                            b.c(Thread.currentThread(), "GAMAdapter interstitialVideo onAdDismissedFullScreenContent");
                            GAMAdapter.this.n = null;
                            if(GAMAdapter.this.e != null) {
                                GAMAdapter.this.e.a();
                            }
                            GAMAdapter.this.B = false;
                        }

                        @Override  // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdFailedToShowFullScreenContent(AdError adError0) {
                            b.c(Thread.currentThread(), "GAMAdapter interstitialVideo onAdFailedToShowFullScreenContent : " + adError0.getMessage());
                            GAMAdapter.this.n = null;
                            if(GAMAdapter.this.B && GAMAdapter.this.e != null) {
                                GAMAdapter.this.e.c(GAMAdapter.this.t);
                            }
                        }

                        @Override  // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdShowedFullScreenContent() {
                            b.c(Thread.currentThread(), "GAMAdapter interstitialVideo onAdShowedFullScreenContent");
                            if(GAMAdapter.this.B && GAMAdapter.this.e != null) {
                                GAMAdapter.this.e.a(GAMAdapter.this.t);
                            }
                        }
                    });
                    this.n.show(((Activity)context0));
                    return;
                }
                if(this.B) {
                    V v1 = this.e;
                    if(v1 != null) {
                        v1.c(this.t);
                        return;
                    }
                }
                return;
            }
            catch(Exception exception0) {
            }
            b.a(Thread.currentThread(), exception0);
            if(this.B) {
                V v2 = this.e;
                if(v2 != null) {
                    v2.c(this.t);
                }
            }
        }
        else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                final GAMAdapter b;

                @Override
                public void run() {
                    try {
                        b.c(Thread.currentThread(), "GAMAdapter showInterstitialVideoAd");
                        if(GAMAdapter.this.n != null) {
                            GAMAdapter.this.n.setFullScreenContentCallback(new FullScreenContentCallback() {
                                final com.igaworks.ssp.common.adapter.GAMAdapter.16 a;

                                @Override  // com.google.android.gms.ads.FullScreenContentCallback
                                public void onAdDismissedFullScreenContent() {
                                    b.c(Thread.currentThread(), "GAMAdapter interstitialVideo onAdDismissedFullScreenContent");
                                    GAMAdapter.this.n = null;
                                    if(GAMAdapter.this.e != null) {
                                        GAMAdapter.this.e.a();
                                    }
                                    GAMAdapter.this.B = false;
                                }

                                @Override  // com.google.android.gms.ads.FullScreenContentCallback
                                public void onAdFailedToShowFullScreenContent(AdError adError0) {
                                    b.c(Thread.currentThread(), "GAMAdapter interstitialVideo onAdFailedToShowFullScreenContent : " + adError0.getMessage());
                                    GAMAdapter.this.n = null;
                                    if(GAMAdapter.this.B && GAMAdapter.this.e != null) {
                                        GAMAdapter.this.e.c(GAMAdapter.this.t);
                                    }
                                }

                                @Override  // com.google.android.gms.ads.FullScreenContentCallback
                                public void onAdShowedFullScreenContent() {
                                    b.c(Thread.currentThread(), "GAMAdapter interstitialVideo onAdShowedFullScreenContent");
                                    if(GAMAdapter.this.B && GAMAdapter.this.e != null) {
                                        GAMAdapter.this.e.a(GAMAdapter.this.t);
                                    }
                                }
                            });
                            GAMAdapter.this.n.show(((Activity)context0));
                            return;
                        }
                        if(GAMAdapter.this.B && GAMAdapter.this.e != null) {
                            GAMAdapter.this.e.c(GAMAdapter.this.t);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    b.a(Thread.currentThread(), exception0);
                    if(GAMAdapter.this.B && GAMAdapter.this.e != null) {
                        GAMAdapter.this.e.c(GAMAdapter.this.t);
                    }
                }
            });
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showRewardVideoAd(Context context0, d0 d00, boolean z, int v) {
        if(Looper.myLooper() == Looper.getMainLooper()) {
            b.a(Thread.currentThread(), "GAMAdapter.showRewardVideoAd() UI Thread");
            RewardedAd rewardedAd0 = this.r;
            if(rewardedAd0 != null) {
                rewardedAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                    final GAMAdapter b;

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        b.a(Thread.currentThread(), "GAMAdapter RV onAdDismissedFullScreenContent()");
                        GAMAdapter.this.r = null;
                        if(GAMAdapter.this.d != null) {
                            GAMAdapter.this.d.a();
                        }
                    }

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError0) {
                        b.a(Thread.currentThread(), "GAMAdapter RV onAdFailedToShowFullScreenContent() : " + adError0.getMessage());
                        GAMAdapter.this.r = null;
                        if(GAMAdapter.this.A && GAMAdapter.this.d != null) {
                            GAMAdapter.this.d.c(v);
                        }
                    }

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        b.a(Thread.currentThread(), "GAMAdapter RV onAdShowedFullScreenContent()");
                        if(GAMAdapter.this.A && GAMAdapter.this.d != null) {
                            GAMAdapter.this.d.a(v);
                        }
                    }
                });
                this.r.show(((Activity)context0), new OnUserEarnedRewardListener() {
                    final GAMAdapter a;

                    @Override  // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public void onUserEarnedReward(RewardItem rewardItem0) {
                        b.a(Thread.currentThread(), "GAMAdapter RV onUserEarnedReward() : " + GAMAdapter.this.G);
                        if(!GAMAdapter.this.G) {
                            if(GAMAdapter.this.d != null) {
                                GAMAdapter.this.d.a(i.w.b(), true);
                            }
                            GAMAdapter.this.A = false;
                            GAMAdapter.this.G = true;
                        }
                    }
                });
                return;
            }
            if(this.A) {
                l0 l00 = this.d;
                if(l00 != null) {
                    l00.c(v);
                }
            }
        }
        else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                final GAMAdapter c;

                @Override
                public void run() {
                    b.a(Thread.currentThread(), "GAMAdapter.showRewardVideoAd() new UI Thread");
                    if(GAMAdapter.this.r != null) {
                        GAMAdapter.this.r.setFullScreenContentCallback(new FullScreenContentCallback() {
                            final com.igaworks.ssp.common.adapter.GAMAdapter.10 a;

                            @Override  // com.google.android.gms.ads.FullScreenContentCallback
                            public void onAdDismissedFullScreenContent() {
                                b.a(Thread.currentThread(), "GAMAdapter RV onAdDismissedFullScreenContent()");
                                GAMAdapter.this.r = null;
                                if(GAMAdapter.this.d != null) {
                                    GAMAdapter.this.d.a();
                                }
                            }

                            @Override  // com.google.android.gms.ads.FullScreenContentCallback
                            public void onAdFailedToShowFullScreenContent(AdError adError0) {
                                b.a(Thread.currentThread(), "GAMAdapter RV onAdFailedToShowFullScreenContent() : " + adError0.getMessage());
                                GAMAdapter.this.r = null;
                                if(GAMAdapter.this.A && GAMAdapter.this.d != null) {
                                    GAMAdapter.this.d.c(com.igaworks.ssp.common.adapter.GAMAdapter.10.this.a);
                                }
                            }

                            @Override  // com.google.android.gms.ads.FullScreenContentCallback
                            public void onAdShowedFullScreenContent() {
                                b.a(Thread.currentThread(), "GAMAdapter RV onAdShowedFullScreenContent()");
                                if(GAMAdapter.this.A && GAMAdapter.this.d != null) {
                                    GAMAdapter.this.d.a(com.igaworks.ssp.common.adapter.GAMAdapter.10.this.a);
                                }
                            }
                        });
                        com.igaworks.ssp.common.adapter.GAMAdapter.10.2 gAMAdapter$10$20 = new OnUserEarnedRewardListener() {
                            final com.igaworks.ssp.common.adapter.GAMAdapter.10 a;

                            @Override  // com.google.android.gms.ads.OnUserEarnedRewardListener
                            public void onUserEarnedReward(RewardItem rewardItem0) {
                                if(GAMAdapter.this.d != null) {
                                    GAMAdapter.this.d.a(i.w.b(), true);
                                }
                                GAMAdapter.this.A = false;
                            }
                        };
                        GAMAdapter.this.r.show(((Activity)context0), gAMAdapter$10$20);
                        return;
                    }
                    if(GAMAdapter.this.A && GAMAdapter.this.d != null) {
                        GAMAdapter.this.d.c(v);
                    }
                }
            });
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void startBannerAd(Context context0, AdSize adSize0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, d0 d00, boolean z, int v) {
        try {
            this.j = true;
            this.F = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.D == null) {
                    this.D = new Handler();
                }
                if(this.E == null) {
                    this.E = new Runnable() {
                        final GAMAdapter a;

                        @Override
                        public void run() {
                            if(GAMAdapter.this.j) {
                                b.b(Thread.currentThread(), "Time out in : GAM");
                                if(GAMAdapter.this.a != null) {
                                    GAMAdapter.this.a.a(GAMAdapter.this.F);
                                }
                            }
                        }
                    };
                }
                this.D.postDelayed(this.E, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            this.a(context0);
            b.a(Thread.currentThread(), "GAMAdapter.startBannerAd()");
            String s = ((a0)d00.e().a().get(v)).a("GAM");
            if(this.k == null) {
                AdManagerAdView adManagerAdView0 = new AdManagerAdView(context0);
                this.k = adManagerAdView0;
                if(adSize0 == AdSize.BANNER_320x50) {
                    adManagerAdView0.setAdSize(com.google.android.gms.ads.AdSize.BANNER);
                }
                else if(adSize0 == AdSize.BANNER_320x100) {
                    adManagerAdView0.setAdSize(com.google.android.gms.ads.AdSize.LARGE_BANNER);
                }
                else {
                    adManagerAdView0.setAdSize(com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE);
                }
                this.k.setAdUnitId(s);
            }
            else {
                b.a(Thread.currentThread(), "GAMAdapter already exist AdManagerAdView");
            }
            this.l = new Builder().build();
            this.k.setAdListener(new AdListener() {
                final GAMAdapter b;

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdClicked() {
                    super.onAdClicked();
                    b.b(Thread.currentThread(), "GAMAdapter banner onAdClicked");
                    if(GAMAdapter.this.a != null) {
                        GAMAdapter.this.a.a();
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    super.onAdFailedToLoad(loadAdError0);
                    try {
                        b.b(Thread.currentThread(), "GAMAdapter failed to load in GAM, error code : " + loadAdError0.getCode());
                        GAMAdapter.this.stopBannerTimer();
                        if(GAMAdapter.this.a != null) {
                            GAMAdapter.this.a.a(GAMAdapter.this.F);
                        }
                    }
                    catch(Exception exception0) {
                        b.a(Thread.currentThread(), exception0);
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    super.onAdLoaded();
                    b.b(Thread.currentThread(), "GAMAdapter banner onAdLoaded");
                    try {
                        adPopcornSSPBannerAd0.removeAllViewsInLayout();
                        adPopcornSSPBannerAd0.removeAllViews();
                        adPopcornSSPBannerAd0.addView(GAMAdapter.this.k);
                        GAMAdapter.this.stopBannerTimer();
                        if(GAMAdapter.this.a != null) {
                            GAMAdapter.this.a.b(GAMAdapter.this.F);
                        }
                        if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                            adPopcornSSPBannerAd0.setVisibility(4);
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                final com.igaworks.ssp.common.adapter.GAMAdapter.3 a;

                                @Override
                                public void run() {
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                    try {
                                        try {
                                            GAMAdapter.this.k.buildDrawingCache();
                                            Bitmap bitmap0 = GAMAdapter.this.k.getDrawingCache();
                                            if(bitmap0 != null) {
                                                int v = bitmap0.getPixel(1, 1);
                                                com.igaworks.ssp.common.adapter.GAMAdapter.3.this.a.setBackgroundColor(v);
                                            }
                                            goto label_17;
                                        }
                                        catch(Exception exception0) {
                                        }
                                        b.a(Thread.currentThread(), exception0);
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.GAMAdapter.3.this.a;
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
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.GAMAdapter.3.this.a;
                                    if(adPopcornSSPBannerAd1 != null) {
                                        adPopcornSSPBannerAd1.setVisibility(0);
                                    }
                                    throw throwable0;
                                label_17:
                                    adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.GAMAdapter.3.this.a;
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
                    GAMAdapter.this.stopBannerTimer();
                    if(GAMAdapter.this.a != null) {
                        GAMAdapter.this.a.a(GAMAdapter.this.F);
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
            c0.a(this.F);
        }
        b.a(Thread.currentThread(), exception0);
    }

    public void stopBannerTimer() {
        try {
            this.j = false;
            Handler handler0 = this.D;
            if(handler0 != null) {
                handler0.removeCallbacks(this.E);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

