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
import java.util.HashMap;

public class AdForusAdapter implements BaseMediationAdapter {
    private boolean A;
    private Handler B;
    private Runnable C;
    private int D;
    private AdListener E;
    private boolean F;
    private C a;
    private T b;
    private c0 c;
    private l0 d;
    private V e;
    private r0 f;
    private g0 g;
    private b0 h;
    private boolean i;
    private AdView j;
    private AdRequest k;
    private InterstitialAd l;
    private InterstitialAd m;
    private AdLoader n;
    private NativeAdView o;
    private NativeAd p;
    private RewardedAd q;
    private String r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private Handler w;
    private Runnable x;
    private Runnable y;
    private boolean z;

    public AdForusAdapter() {
        this.i = true;
        this.u = true;
        this.v = true;
        this.w = new Handler(Looper.getMainLooper());
        this.z = false;
        this.A = false;
        this.B = new Handler(Looper.getMainLooper());
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
        if(adPopcornSSPNativeAd0.getAdForusViewBinder().mediaViewId != 0) {
            MediaView mediaView0 = (MediaView)this.o.findViewById(adPopcornSSPNativeAd0.getAdForusViewBinder().mediaViewId);
            this.o.setMediaView(mediaView0);
        }
        if(adPopcornSSPNativeAd0.getAdForusViewBinder().headlineViewId != 0) {
            this.o.setHeadlineView(this.o.findViewById(adPopcornSSPNativeAd0.getAdForusViewBinder().headlineViewId));
        }
        if(adPopcornSSPNativeAd0.getAdForusViewBinder().bodyViewId != 0) {
            this.o.setBodyView(this.o.findViewById(adPopcornSSPNativeAd0.getAdForusViewBinder().bodyViewId));
        }
        if(adPopcornSSPNativeAd0.getAdForusViewBinder().callToActionId != 0) {
            this.o.setCallToActionView(this.o.findViewById(adPopcornSSPNativeAd0.getAdForusViewBinder().callToActionId));
        }
        if(adPopcornSSPNativeAd0.getAdForusViewBinder().iconViewId != 0) {
            this.o.setIconView(this.o.findViewById(adPopcornSSPNativeAd0.getAdForusViewBinder().iconViewId));
        }
        if(adPopcornSSPNativeAd0.getAdForusViewBinder().priceViewId != 0) {
            this.o.setPriceView(this.o.findViewById(adPopcornSSPNativeAd0.getAdForusViewBinder().priceViewId));
        }
        if(adPopcornSSPNativeAd0.getAdForusViewBinder().starRatingViewId != 0) {
            this.o.setStarRatingView(this.o.findViewById(adPopcornSSPNativeAd0.getAdForusViewBinder().starRatingViewId));
        }
        if(adPopcornSSPNativeAd0.getAdForusViewBinder().storeViewId != 0) {
            this.o.setStoreView(this.o.findViewById(adPopcornSSPNativeAd0.getAdForusViewBinder().storeViewId));
        }
        if(adPopcornSSPNativeAd0.getAdForusViewBinder().advertiserViewId != 0) {
            this.o.setAdvertiserView(this.o.findViewById(adPopcornSSPNativeAd0.getAdForusViewBinder().advertiserViewId));
        }
        ((TextView)this.o.getHeadlineView()).setText(nativeAd0.getHeadline());
        if(nativeAd0.getBody() != null) {
            if(this.o.getBodyView() != null) {
                this.o.getBodyView().setVisibility(0);
                ((TextView)this.o.getBodyView()).setText(nativeAd0.getBody());
            }
        }
        else if(this.o.getBodyView() != null) {
            this.o.getBodyView().setVisibility(4);
        }
        if(nativeAd0.getCallToAction() != null) {
            if(this.o.getCallToActionView() != null) {
                this.o.getCallToActionView().setVisibility(0);
                ((Button)this.o.getCallToActionView()).setText(nativeAd0.getCallToAction());
            }
        }
        else if(this.o.getCallToActionView() != null) {
            this.o.getCallToActionView().setVisibility(4);
        }
        if(nativeAd0.getIcon() != null) {
            if(this.o.getIconView() != null) {
                ((ImageView)this.o.getIconView()).setImageDrawable(nativeAd0.getIcon().getDrawable());
                this.o.getIconView().setVisibility(0);
            }
        }
        else if(this.o.getIconView() != null) {
            this.o.getIconView().setVisibility(8);
        }
        if(nativeAd0.getPrice() != null) {
            if(this.o.getPriceView() != null) {
                this.o.getPriceView().setVisibility(0);
                ((TextView)this.o.getPriceView()).setText(nativeAd0.getPrice());
            }
        }
        else if(this.o.getPriceView() != null) {
            this.o.getPriceView().setVisibility(4);
        }
        if(nativeAd0.getStore() != null) {
            if(this.o.getStoreView() != null) {
                this.o.getStoreView().setVisibility(0);
                ((TextView)this.o.getStoreView()).setText(nativeAd0.getStore());
            }
        }
        else if(this.o.getStoreView() != null) {
            this.o.getStoreView().setVisibility(4);
        }
        if(nativeAd0.getStarRating() != null) {
            if(this.o.getStarRatingView() != null) {
                ((RatingBar)this.o.getStarRatingView()).setRating(nativeAd0.getStarRating().floatValue());
                this.o.getStarRatingView().setVisibility(0);
            }
        }
        else if(this.o.getStarRatingView() != null) {
            this.o.getStarRatingView().setVisibility(4);
        }
        if(nativeAd0.getAdvertiser() != null) {
            if(this.o.getAdvertiserView() != null) {
                ((TextView)this.o.getAdvertiserView()).setText(nativeAd0.getAdvertiser());
                this.o.getAdvertiserView().setVisibility(0);
            }
        }
        else if(this.o.getAdvertiserView() != null) {
            this.o.getAdvertiserView().setVisibility(4);
        }
        this.o.setNativeAd(nativeAd0);
        adPopcornSSPNativeAd0.removeView(this.o);
        adPopcornSSPNativeAd0.addView(this.o);
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

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkValidMediation() {
        this.E = new AdListener() {
            final AdForusAdapter a;

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError0) {
            }
        };
        b.a(Thread.currentThread(), "AdForusAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            b.a(Thread.currentThread(), "AdForusAdapter.destroyBannerAd");
            AdView adView0 = this.j;
            if(adView0 != null) {
                adView0.removeAllViews();
                this.j.setAdListener(null);
                this.j.destroy();
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
            b.a(Thread.currentThread(), "AdForusAdapter.destroyInterstitialVideoAd() : " + this.m);
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
        NativeAdView nativeAdView0 = this.o;
        if(nativeAdView0 != null) {
            nativeAdView0.destroy();
        }
        if(this.n != null) {
            this.n = null;
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyReactNativeAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyRewardVideoAd() {
        try {
            b.a(Thread.currentThread(), "AdForusAdapter.destroyRewardVideoAd() : " + this.q);
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

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getBiddingToken(Context context0) {
        return null;
    }

    // 去混淆评级： 低(20)
    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getNetworkName() [...] // 潜在的解密器

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void initializeSDK(Context context0, p0 p00, SdkInitListener sdkInitListener0) {
        try {
            b.a(Thread.currentThread(), "AdForusAdapter initializeSDK");
            new Thread(() -> MobileAds.initialize(context0, new com.igaworks.ssp.common.adapter.AdForusAdapter.15(this, sdkInitListener0))).start();
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

        class com.igaworks.ssp.common.adapter.AdForusAdapter.15 implements OnInitializationCompleteListener {
            final AdForusAdapter b;

            com.igaworks.ssp.common.adapter.AdForusAdapter.15(SdkInitListener sdkInitListener0) {
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
            b.a(Thread.currentThread(), "AdForusAdapter.internalStopBannerAd");
            AdView adView0 = this.j;
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

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "AdForusAdapter loadInterstitial");
            this.a(context0);
            String s = ((a0)d00.e().a().get(v)).a("AdForus");
            if(this.l != null) {
                this.l = null;
            }
            InterstitialAd.load(context0, s, new Builder().build(), new InterstitialAdLoadCallback() {
                final AdForusAdapter b;

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    AdForusAdapter.this.l = null;
                    b.c(Thread.currentThread(), "AdForusAdapter interstitial onAdFailedToLoad " + String.format("domain: %s, code: %d, message: %s", loadAdError0.getDomain(), loadAdError0.getCode(), loadAdError0.getMessage()));
                    if(AdForusAdapter.this.b != null) {
                        AdForusAdapter.this.b.d(v);
                    }
                }

                public void onAdLoaded(InterstitialAd interstitialAd0) {
                    b.c(Thread.currentThread(), "AdForusAdapter loadInterstitial onAdLoaded");
                    AdForusAdapter.this.l = interstitialAd0;
                    if(AdForusAdapter.this.b != null) {
                        AdForusAdapter.this.b.b(v);
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
            b.c(Thread.currentThread(), "AdForusAdapter loadInterstitialVideoAd");
            this.A = true;
            this.s = v;
            this.v = true;
            if(adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.w == null) {
                    this.w = new Handler();
                }
                if(this.y == null) {
                    this.y = new Runnable() {
                        final AdForusAdapter a;

                        @Override
                        public void run() {
                            if(AdForusAdapter.this.v) {
                                b.b(Thread.currentThread(), "Time out in : AdForus");
                                AdForusAdapter.this.a(false);
                                if(AdForusAdapter.this.A && AdForusAdapter.this.e != null) {
                                    AdForusAdapter.this.e.d(AdForusAdapter.this.s);
                                }
                            }
                        }
                    };
                }
                this.w.postDelayed(this.y, adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout());
            }
            this.a(context0);
            String s = ((a0)d00.e().a().get(v)).a("AdForus");
            if(this.m != null) {
                this.m = null;
            }
            InterstitialAd.load(context0, s, new Builder().build(), new InterstitialAdLoadCallback() {
                final AdForusAdapter a;

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    AdForusAdapter.this.l = null;
                    b.c(Thread.currentThread(), "AdForusAdapter interstitialVideo onAdFailedToLoad " + String.format("domain: %s, code: %d, message: %s", loadAdError0.getDomain(), loadAdError0.getCode(), loadAdError0.getMessage()));
                    AdForusAdapter.this.a(false);
                    if(AdForusAdapter.this.A && AdForusAdapter.this.e != null) {
                        AdForusAdapter.this.e.d(AdForusAdapter.this.s);
                    }
                }

                public void onAdLoaded(InterstitialAd interstitialAd0) {
                    b.c(Thread.currentThread(), "AdForusAdapter interstitialVideo onAdLoaded");
                    AdForusAdapter.this.m = interstitialAd0;
                    AdForusAdapter.this.a(false);
                    if(AdForusAdapter.this.A && AdForusAdapter.this.e != null) {
                        AdForusAdapter.this.e.b(AdForusAdapter.this.s);
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
            if(adPopcornSSPNativeAd0.getAdForusViewBinder() == null) {
                b.c(Thread.currentThread(), "AdForusAdapter viewBinder is null");
                c0 c00 = this.c;
                if(c00 != null) {
                    c00.a(v, 3);
                    return;
                }
                return;
            }
            b.c(Thread.currentThread(), "AdForusAdapter loadNativeAd");
            com.google.android.gms.ads.AdLoader.Builder adLoader$Builder0 = new com.google.android.gms.ads.AdLoader.Builder(context0, ((a0)d00.e().a().get(v)).a("AdForus"));
            adLoader$Builder0.forNativeAd(new OnNativeAdLoadedListener() {
                final AdForusAdapter c;

                @Override  // com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener
                public void onNativeAdLoaded(NativeAd nativeAd0) {
                    try {
                        b.c(Thread.currentThread(), "AdForusAdapter onNativeAdLoaded");
                        if(AdForusAdapter.this.p != null) {
                            AdForusAdapter.this.p.destroy();
                        }
                        AdForusAdapter.this.p = nativeAd0;
                        AdForusAdapter.this.a(AdForusAdapter.this.p, adPopcornSSPNativeAd0);
                        if(AdForusAdapter.this.c != null) {
                            AdForusAdapter.this.c.a(v);
                        }
                        if(AdForusAdapter.this.o != null) {
                            AdForusAdapter.this.o.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    exception0.printStackTrace();
                    if(AdForusAdapter.this.c != null) {
                        AdForusAdapter.this.c.a(v, 1);
                    }
                }
            });
            AdLoader adLoader0 = adLoader$Builder0.withAdListener(new AdListener() {
                final AdForusAdapter b;

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdClicked() {
                    super.onAdClicked();
                    b.c(Thread.currentThread(), "AdForusAdapter nativeAd onAdClicked");
                    if(AdForusAdapter.this.c != null) {
                        AdForusAdapter.this.c.onClicked();
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    b.c(Thread.currentThread(), "AdForusAdapter NativeAd onAdFailedToLoad : " + String.format("responseInfo: %s, code: %d, message: %s", loadAdError0.getResponseInfo(), loadAdError0.getCode(), loadAdError0.getMessage()));
                    if(AdForusAdapter.this.c != null) {
                        AdForusAdapter.this.c.a(v, 2);
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdImpression() {
                    super.onAdImpression();
                    b.c(Thread.currentThread(), "AdForusAdapter nativeAd onAdImpression");
                    if(AdForusAdapter.this.c != null) {
                        AdForusAdapter.this.c.onImpression();
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
            if(adPopcornSSPNativeAd0.getAdForusViewBinder().nativeAdViewId != 0) {
                this.o = (NativeAdView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getAdForusViewBinder().nativeAdViewId);
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
            b.a(Thread.currentThread(), "AdForusAdapter.loadRewardVideoAd()");
            this.t = v;
            this.u = true;
            this.F = false;
            if(adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.w == null) {
                    this.w = new Handler();
                }
                if(this.x == null) {
                    this.x = new Runnable() {
                        final AdForusAdapter a;

                        @Override
                        public void run() {
                            if(AdForusAdapter.this.u) {
                                b.b(Thread.currentThread(), "Time out in : AdForus");
                                AdForusAdapter.this.a(true);
                                if(AdForusAdapter.this.z && AdForusAdapter.this.d != null) {
                                    AdForusAdapter.this.d.d(AdForusAdapter.this.t);
                                }
                            }
                        }
                    };
                }
                this.w.postDelayed(this.x, adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout());
            }
            b.a(Thread.currentThread(), "AdForusAdapter.loadRewardVideoAd() load ad");
            this.r = ((a0)d00.e().a().get(v)).a("AdForus");
            AdRequest adRequest0 = new Builder().build();
            RewardedAd.load(context0, this.r, adRequest0, new RewardedAdLoadCallback() {
                final AdForusAdapter a;

                @Override  // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    b.a(Thread.currentThread(), "AdForusAdapter RV onAdFailedToLoad() : " + loadAdError0.getMessage());
                    AdForusAdapter.this.a(true);
                    AdForusAdapter.this.q = null;
                    if(AdForusAdapter.this.z && AdForusAdapter.this.d != null) {
                        AdForusAdapter.this.d.d(AdForusAdapter.this.t);
                    }
                }

                public void onAdLoaded(RewardedAd rewardedAd0) {
                    b.a(Thread.currentThread(), "AdForusAdapter RV onAdLoaded");
                    AdForusAdapter.this.a(true);
                    AdForusAdapter.this.q = rewardedAd0;
                    if(AdForusAdapter.this.z && AdForusAdapter.this.d != null) {
                        AdForusAdapter.this.d.b(AdForusAdapter.this.t);
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

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void pauseInterstitialVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void pauseRewardVideoAd() {
        try {
            b.a(Thread.currentThread(), "AdForusAdapter.pauseRewardVideoAd()");
        }
        catch(Exception unused_ex) {
        }
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
            b.a(Thread.currentThread(), "AdForusAdapter.resumeRewardVideoAd()");
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

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "AdForusAdapter showInterstitial");
            InterstitialAd interstitialAd0 = this.l;
            if(interstitialAd0 != null) {
                interstitialAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                    final AdForusAdapter b;

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        b.c(Thread.currentThread(), "AdForusAdapter interstitial onAdDismissedFullScreenContent");
                        AdForusAdapter.this.l = null;
                        if(AdForusAdapter.this.b != null) {
                            AdForusAdapter.this.b.e(0);
                        }
                    }

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError0) {
                        b.c(Thread.currentThread(), "AdForusAdapter interstitial onAdFailedToShowFullScreenContent");
                        AdForusAdapter.this.l = null;
                        if(AdForusAdapter.this.b != null) {
                            AdForusAdapter.this.b.c(v);
                        }
                    }

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        b.c(Thread.currentThread(), "AdForusAdapter interstitial onAdShowedFullScreenContent");
                        if(AdForusAdapter.this.b != null) {
                            AdForusAdapter.this.b.a(v);
                        }
                    }
                });
                this.l.show(((Activity)context0));
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
            b.c(Thread.currentThread(), "AdForusAdapter showInterstitialVideoAd");
            InterstitialAd interstitialAd0 = this.m;
            if(interstitialAd0 != null) {
                interstitialAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                    final AdForusAdapter a;

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        b.c(Thread.currentThread(), "AdForusAdapter interstitialVideo onAdDismissedFullScreenContent");
                        AdForusAdapter.this.m = null;
                        if(AdForusAdapter.this.e != null) {
                            AdForusAdapter.this.e.a();
                        }
                        AdForusAdapter.this.A = false;
                    }

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError0) {
                        b.c(Thread.currentThread(), "AdForusAdapter interstitialVideo onAdFailedToShowFullScreenContent");
                        AdForusAdapter.this.m = null;
                        if(AdForusAdapter.this.A && AdForusAdapter.this.e != null) {
                            AdForusAdapter.this.e.c(AdForusAdapter.this.s);
                        }
                    }

                    @Override  // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        b.c(Thread.currentThread(), "AdForusAdapter interstitialVideo onAdShowedFullScreenContent");
                        if(AdForusAdapter.this.A && AdForusAdapter.this.e != null) {
                            AdForusAdapter.this.e.a(AdForusAdapter.this.s);
                        }
                    }
                });
                this.m.show(((Activity)context0));
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
        b.a(Thread.currentThread(), "AdForusAdapter.showRewardVideoAd()");
        this.t = v;
        RewardedAd rewardedAd0 = this.q;
        if(rewardedAd0 != null) {
            rewardedAd0.setFullScreenContentCallback(new FullScreenContentCallback() {
                final AdForusAdapter a;

                @Override  // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    b.a(Thread.currentThread(), "AdForusAdapter RV onAdDismissedFullScreenContent()");
                    AdForusAdapter.this.q = null;
                    if(AdForusAdapter.this.d != null) {
                        AdForusAdapter.this.d.a();
                    }
                }

                @Override  // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError0) {
                    b.a(Thread.currentThread(), "AdForusAdapter RV onAdFailedToShowFullScreenContent()");
                    AdForusAdapter.this.q = null;
                    if(AdForusAdapter.this.z && AdForusAdapter.this.d != null) {
                        AdForusAdapter.this.d.c(AdForusAdapter.this.t);
                    }
                }

                @Override  // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    b.a(Thread.currentThread(), "AdForusAdapter RV onAdShowedFullScreenContent()");
                    if(AdForusAdapter.this.z && AdForusAdapter.this.d != null) {
                        AdForusAdapter.this.d.a(AdForusAdapter.this.t);
                    }
                }
            });
            this.q.show(((Activity)context0), new OnUserEarnedRewardListener() {
                final AdForusAdapter a;

                @Override  // com.google.android.gms.ads.OnUserEarnedRewardListener
                public void onUserEarnedReward(RewardItem rewardItem0) {
                    b.a(Thread.currentThread(), "AdForusAdapter RV onUserEarnedReward() : " + AdForusAdapter.this.F);
                    if(!AdForusAdapter.this.F) {
                        if(AdForusAdapter.this.d != null) {
                            AdForusAdapter.this.d.a(i.D.b(), true);
                        }
                        AdForusAdapter.this.z = false;
                        AdForusAdapter.this.F = true;
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
            this.i = true;
            this.D = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.B == null) {
                    this.B = new Handler();
                }
                if(this.C == null) {
                    this.C = new Runnable() {
                        final AdForusAdapter a;

                        @Override
                        public void run() {
                            if(AdForusAdapter.this.i) {
                                b.b(Thread.currentThread(), "Time out in : AdForus");
                                if(AdForusAdapter.this.a != null) {
                                    AdForusAdapter.this.a.a(AdForusAdapter.this.D);
                                }
                            }
                        }
                    };
                }
                this.B.postDelayed(this.C, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            this.a(context0);
            b.a(Thread.currentThread(), "AdForusAdapter.startBannerAd()");
            String s = ((a0)d00.e().a().get(v)).a("AdForus");
            if(this.j == null) {
                AdView adView0 = new AdView(context0);
                this.j = adView0;
                if(adSize0 == AdSize.BANNER_320x50) {
                    adView0.setAdSize(com.google.android.gms.ads.AdSize.BANNER);
                }
                else if(adSize0 == AdSize.BANNER_320x100) {
                    adView0.setAdSize(com.google.android.gms.ads.AdSize.LARGE_BANNER);
                }
                else {
                    adView0.setAdSize(com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE);
                }
                this.j.setAdUnitId(s);
            }
            else {
                b.a(Thread.currentThread(), "already exist AdForus AdMobView");
            }
            this.k = new Builder().build();
            this.j.setAdListener(new AdListener() {
                final AdForusAdapter b;

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdClicked() {
                    super.onAdClicked();
                    b.b(Thread.currentThread(), "AdForusAdapter banner onAdClicked");
                    if(AdForusAdapter.this.a != null) {
                        AdForusAdapter.this.a.a();
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError0) {
                    super.onAdFailedToLoad(loadAdError0);
                    try {
                        b.b(Thread.currentThread(), "AdForusAdapter failed to load in AdForus, error code : " + loadAdError0.getCode());
                        AdForusAdapter.this.stopBannerTimer();
                        if(AdForusAdapter.this.a != null) {
                            AdForusAdapter.this.a.a(AdForusAdapter.this.D);
                        }
                    }
                    catch(Exception exception0) {
                        b.a(Thread.currentThread(), exception0);
                    }
                }

                @Override  // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    super.onAdLoaded();
                    b.a(Thread.currentThread(), "AdForusAdapter banner onAdLoaded");
                    try {
                        adPopcornSSPBannerAd0.removeAllViewsInLayout();
                        adPopcornSSPBannerAd0.removeAllViews();
                        adPopcornSSPBannerAd0.addView(AdForusAdapter.this.j);
                        AdForusAdapter.this.stopBannerTimer();
                        if(AdForusAdapter.this.a != null) {
                            AdForusAdapter.this.a.b(AdForusAdapter.this.D);
                        }
                        if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                            adPopcornSSPBannerAd0.setVisibility(4);
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                final com.igaworks.ssp.common.adapter.AdForusAdapter.3 a;

                                @Override
                                public void run() {
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                    try {
                                        try {
                                            AdForusAdapter.this.j.buildDrawingCache();
                                            Bitmap bitmap0 = AdForusAdapter.this.j.getDrawingCache();
                                            if(bitmap0 != null) {
                                                int v = bitmap0.getPixel(1, 1);
                                                com.igaworks.ssp.common.adapter.AdForusAdapter.3.this.a.setBackgroundColor(v);
                                            }
                                            goto label_17;
                                        }
                                        catch(Exception exception0) {
                                        }
                                        b.a(Thread.currentThread(), exception0);
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.AdForusAdapter.3.this.a;
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
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.AdForusAdapter.3.this.a;
                                    if(adPopcornSSPBannerAd1 != null) {
                                        adPopcornSSPBannerAd1.setVisibility(0);
                                    }
                                    throw throwable0;
                                label_17:
                                    adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.AdForusAdapter.3.this.a;
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
                    AdForusAdapter.this.stopBannerTimer();
                    if(AdForusAdapter.this.a != null) {
                        AdForusAdapter.this.a.a(AdForusAdapter.this.D);
                    }
                }
            });
            this.j.loadAd(this.k);
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
            this.i = false;
            Handler handler0 = this.B;
            if(handler0 != null) {
                handler0.removeCallbacks(this.C);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

