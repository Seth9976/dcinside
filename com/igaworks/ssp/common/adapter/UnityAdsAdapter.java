package com.igaworks.ssp.common.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
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
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds.UnityAdsInitializationError;
import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;
import com.unity3d.ads.UnityAds.UnityAdsShowError;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView.IListener;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.HashMap;

public class UnityAdsAdapter implements BaseMediationAdapter, VideoMixAdMediationAdapter {
    private boolean A;
    private boolean B;
    private BannerView C;
    private IUnityAdsInitializationListener D;
    private Handler E;
    private Runnable F;
    private int G;
    private boolean H;
    private Runnable I;
    private boolean J;
    private String K;
    private final boolean L;
    IUnityAdsLoadListener M;
    IUnityAdsLoadListener N;
    IUnityAdsLoadListener O;
    IUnityAdsLoadListener P;
    private C a;
    private T b;
    private c0 c;
    private l0 d;
    private V e;
    private r0 f;
    private g0 g;
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
    private boolean u;
    private boolean v;
    private Handler w;
    private Runnable x;
    private Runnable y;
    private Runnable z;

    public UnityAdsAdapter() {
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = true;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = new Handler(Looper.getMainLooper());
        this.A = false;
        this.B = false;
        this.E = new Handler(Looper.getMainLooper());
        this.G = 0;
        this.H = true;
        this.J = false;
        this.L = false;
        this.M = new IUnityAdsLoadListener() {
            final UnityAdsAdapter a;

            @Override  // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String s) {
                if(s != null && s.contentEquals(UnityAdsAdapter.this.l)) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter interstital onUnityAdsAdLoaded : " + UnityAdsAdapter.this.l);
                    if(UnityAdsAdapter.this.b != null) {
                        UnityAdsAdapter.this.b.b(UnityAdsAdapter.this.p);
                    }
                    UnityAdsAdapter.this.t = false;
                    UnityAdsAdapter.this.w.removeCallbacks(UnityAdsAdapter.this.x);
                }
            }

            @Override  // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String s, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s1) {
                b.a(Thread.currentThread(), "UnityAdsAdapter interstitial onUnityAdsFailedToLoad : " + s1);
                if(UnityAdsAdapter.this.b != null) {
                    UnityAdsAdapter.this.w.removeCallbacks(UnityAdsAdapter.this.x);
                    UnityAdsAdapter.this.b.d(UnityAdsAdapter.this.p);
                }
            }
        };
        this.N = new IUnityAdsLoadListener() {
            final UnityAdsAdapter a;

            @Override  // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String s) {
                b.a(Thread.currentThread(), "UnityAdsAdapter onUnityAdsAdLoaded unityRVPlacementId : " + UnityAdsAdapter.this.m + ", placementId : " + s);
                if(s != null && s.contentEquals(UnityAdsAdapter.this.m)) {
                    UnityAdsAdapter.this.a(true);
                    if(UnityAdsAdapter.this.A && UnityAdsAdapter.this.d != null) {
                        UnityAdsAdapter.this.d.b(UnityAdsAdapter.this.q);
                    }
                }
            }

            @Override  // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String s, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s1) {
                b.a(Thread.currentThread(), "UnityAdsAdapter onUnityAdsFailedToLoad : " + unityAds$UnityAdsLoadError0 + ", message : " + s1);
                UnityAdsAdapter.this.a(true);
                if(UnityAdsAdapter.this.A && UnityAdsAdapter.this.d != null) {
                    UnityAdsAdapter.this.d.d(UnityAdsAdapter.this.q);
                }
            }
        };
        this.O = new IUnityAdsLoadListener() {
            final UnityAdsAdapter a;

            @Override  // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String s) {
                if(s != null && s.contentEquals(UnityAdsAdapter.this.n)) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter interstitialVideo onUnityAdsAdLoaded : " + s);
                    UnityAdsAdapter.this.a(false);
                    if(UnityAdsAdapter.this.B && UnityAdsAdapter.this.e != null) {
                        UnityAdsAdapter.this.e.b(UnityAdsAdapter.this.r);
                    }
                }
            }

            @Override  // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String s, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s1) {
                b.a(Thread.currentThread(), "UnityAdsAdapter interstitialVideo onUnityAdsFailedToLoad : " + s + ", message : " + s1);
                UnityAdsAdapter.this.a(false);
                if(UnityAdsAdapter.this.B && UnityAdsAdapter.this.e != null) {
                    UnityAdsAdapter.this.e.d(UnityAdsAdapter.this.r);
                }
            }
        };
        this.P = new IUnityAdsLoadListener() {
            final UnityAdsAdapter a;

            @Override  // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String s) {
                b.a(Thread.currentThread(), "UnityAdsAdapter videoMix onUnityAdsAdLoaded : " + UnityAdsAdapter.this.K);
                if(s != null && s.contentEquals(UnityAdsAdapter.this.K)) {
                    UnityAdsAdapter.this.removeVideoMixTimeoutHandler();
                    if(UnityAdsAdapter.this.i != null) {
                        UnityAdsAdapter.this.i.b(UnityAdsAdapter.this.G);
                    }
                }
            }

            @Override  // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String s, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s1) {
                b.a(Thread.currentThread(), "UnityAdsAdapter videoMix onUnityAdsFailedToLoad : " + s1);
                UnityAdsAdapter.this.removeVideoMixTimeoutHandler();
                if(UnityAdsAdapter.this.i != null) {
                    UnityAdsAdapter.this.i.d(UnityAdsAdapter.this.G);
                }
            }
        };
    }

    private void a(AdPopcornSSPBannerAd adPopcornSSPBannerAd0) {
        try {
            this.C.setListener(new IListener() {
                final UnityAdsAdapter b;

                @Override  // com.unity3d.services.banners.BannerView$IListener
                public void onBannerClick(BannerView bannerView0) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter onBannerClick : " + adPopcornSSPBannerAd0.getPlacementId());
                    if(UnityAdsAdapter.this.a != null) {
                        UnityAdsAdapter.this.a.a();
                    }
                }

                @Override  // com.unity3d.services.banners.BannerView$IListener
                public void onBannerFailedToLoad(BannerView bannerView0, BannerErrorInfo bannerErrorInfo0) {
                    try {
                        b.a(Thread.currentThread(), "UnityAdsAdapter onBannerFailedToLoad : " + bannerView0.getPlacementId() + " with error: [" + bannerErrorInfo0.errorCode + "] " + bannerErrorInfo0.errorMessage);
                        UnityAdsAdapter.this.stopBannerTimer();
                        if(UnityAdsAdapter.this.a != null) {
                            UnityAdsAdapter.this.a.a(UnityAdsAdapter.this.o);
                        }
                    }
                    catch(Exception exception0) {
                        b.a(Thread.currentThread(), exception0);
                    }
                }

                @Override  // com.unity3d.services.banners.BannerView$IListener
                public void onBannerLeftApplication(BannerView bannerView0) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter onBannerLeftApplication : " + adPopcornSSPBannerAd0.getPlacementId());
                }

                @Override  // com.unity3d.services.banners.BannerView$IListener
                public void onBannerLoaded(BannerView bannerView0) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter onBannerLoaded : " + bannerView0.getPlacementId());
                    try {
                        adPopcornSSPBannerAd0.removeAllViewsInLayout();
                        adPopcornSSPBannerAd0.removeAllViews();
                        adPopcornSSPBannerAd0.addView(bannerView0);
                        UnityAdsAdapter.this.stopBannerTimer();
                        if(UnityAdsAdapter.this.a != null) {
                            UnityAdsAdapter.this.a.b(UnityAdsAdapter.this.o);
                        }
                        if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                            adPopcornSSPBannerAd0.setVisibility(4);
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                final com.igaworks.ssp.common.adapter.UnityAdsAdapter.4 a;

                                @Override
                                public void run() {
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                    try {
                                        try {
                                            UnityAdsAdapter.this.C.buildDrawingCache();
                                            Bitmap bitmap0 = UnityAdsAdapter.this.C.getDrawingCache();
                                            if(bitmap0 != null) {
                                                int v = bitmap0.getPixel(1, 1);
                                                com.igaworks.ssp.common.adapter.UnityAdsAdapter.4.this.a.setBackgroundColor(v);
                                            }
                                            goto label_17;
                                        }
                                        catch(Exception exception0) {
                                        }
                                        b.a(Thread.currentThread(), exception0);
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.UnityAdsAdapter.4.this.a;
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
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.UnityAdsAdapter.4.this.a;
                                    if(adPopcornSSPBannerAd1 != null) {
                                        adPopcornSSPBannerAd1.setVisibility(0);
                                    }
                                    throw throwable0;
                                label_17:
                                    adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.UnityAdsAdapter.4.this.a;
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
                    UnityAdsAdapter.this.stopBannerTimer();
                    if(UnityAdsAdapter.this.a != null) {
                        UnityAdsAdapter.this.a.a(UnityAdsAdapter.this.o);
                    }
                }

                @Override  // com.unity3d.services.banners.BannerView$IListener
                public void onBannerShown(BannerView bannerView0) {
                }
            });
            this.C.load();
        }
        catch(Exception exception0) {
            this.stopBannerTimer();
            C c0 = this.a;
            if(c0 != null) {
                c0.a(this.o);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    private void a(boolean z) {
        try {
            if(z) {
                this.u = false;
                Handler handler0 = this.w;
                if(handler0 != null) {
                    handler0.removeCallbacks(this.y);
                }
            }
            else {
                this.v = false;
                Handler handler1 = this.w;
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
        this.D = new IUnityAdsInitializationListener() {
            final UnityAdsAdapter a;

            @Override  // com.unity3d.ads.IUnityAdsInitializationListener
            public void onInitializationComplete() {
            }

            @Override  // com.unity3d.ads.IUnityAdsInitializationListener
            public void onInitializationFailed(UnityAdsInitializationError unityAds$UnityAdsInitializationError0, String s) {
            }
        };
        b.a(Thread.currentThread(), "UnityAdsAdapter SDK imported");
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
        this.stopBannerTimer();
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitialVideoAd() {
        try {
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
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyReactNativeAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyRewardVideoAd() {
        try {
            this.A = false;
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
            b.a(Thread.currentThread(), "UnityAdsAdapter initializeSDK");
            if(!UnityAds.isInitialized()) {
                UnityAds.initialize(context0, p00.a("unity_game_id"), false, new IUnityAdsInitializationListener() {
                    final UnityAdsAdapter b;

                    @Override  // com.unity3d.ads.IUnityAdsInitializationListener
                    public void onInitializationComplete() {
                        b.a(Thread.currentThread(), "UnityAdsAdapter onInitializationComplete");
                        SdkInitListener sdkInitListener0 = sdkInitListener0;
                        if(sdkInitListener0 != null) {
                            sdkInitListener0.onInitializationFinished();
                        }
                    }

                    @Override  // com.unity3d.ads.IUnityAdsInitializationListener
                    public void onInitializationFailed(UnityAdsInitializationError unityAds$UnityAdsInitializationError0, String s) {
                        b.a(Thread.currentThread(), "UnityAdsAdapter onInitializationFailed");
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
            goto label_12;
        }
        catch(Exception unused_ex) {
            goto label_15;
        }
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
            return;
        label_12:
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
                return;
            label_15:
                if(sdkInitListener0 != null) {
                    sdkInitListener0.onInitializationFinished();
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        this.stopBannerTimer();
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void loadAd(Context context0, AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0, d0 d00, boolean z, int v, int v1) {
        try {
            b.a(Thread.currentThread(), "UnityAdsAdapter videoMix loadAd : " + v1);
            this.J = true;
            this.H = true;
            this.G = v;
            if(this.w == null) {
                this.w = new Handler();
            }
            if(this.I == null) {
                this.I = new Runnable() {
                    final UnityAdsAdapter a;

                    @Override
                    public void run() {
                        if(UnityAdsAdapter.this.H) {
                            b.b(Thread.currentThread(), "Time out in : UnityAds");
                            if(UnityAdsAdapter.this.i != null) {
                                UnityAdsAdapter.this.i.d(UnityAdsAdapter.this.G);
                            }
                        }
                    }
                };
            }
            this.w.postDelayed(this.I, adPopcornSSPVideoMixAd0.getNetworkScheduleTimeout());
            if(v1 == 2 || v1 == 4 || v1 == 6) {
                b.c(Thread.currentThread(), "UnityAdsAdapter videoMix load");
                this.j = ((a0)d00.e().a().get(v)).a("UnityGameId");
                this.K = ((a0)d00.e().a().get(v)).a("UnityPlacementId");
                if(!UnityAds.isInitialized()) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter videoMix initialize");
                    UnityAds.initialize(context0, this.j, false, new IUnityAdsInitializationListener() {
                        final UnityAdsAdapter a;

                        @Override  // com.unity3d.ads.IUnityAdsInitializationListener
                        public void onInitializationComplete() {
                            b.a(Thread.currentThread(), "UnityAdsAdapter videoMix onInitializationComplete");
                            UnityAds.load(UnityAdsAdapter.this.K, UnityAdsAdapter.this.P);
                        }

                        @Override  // com.unity3d.ads.IUnityAdsInitializationListener
                        public void onInitializationFailed(UnityAdsInitializationError unityAds$UnityAdsInitializationError0, String s) {
                            b.a(Thread.currentThread(), "UnityAdsAdapter videoMix onInitializationFailed : " + UnityAdsAdapter.this.K + ",  message : " + s);
                            UnityAdsAdapter.this.removeVideoMixTimeoutHandler();
                            if(UnityAdsAdapter.this.i != null) {
                                UnityAdsAdapter.this.i.d(UnityAdsAdapter.this.G);
                            }
                        }
                    });
                    return;
                }
                b.a(Thread.currentThread(), "UnityAdsAdapter videoMix already initialized && load ad");
                UnityAds.load(this.K, this.P);
                return;
            }
            b.a(Thread.currentThread(), "UnityAdsAdapter does not support videoMix campaign type");
            this.removeVideoMixTimeoutHandler();
            E0 e00 = this.i;
            if(e00 != null) {
                e00.d(v);
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "UnityAdsAdapter videoMix exception");
            this.removeVideoMixTimeoutHandler();
            E0 e01 = this.i;
            if(e01 != null) {
                e01.d(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        try {
            this.t = true;
            this.p = v;
            if(this.w == null) {
                this.w = new Handler();
            }
            if(this.x == null) {
                this.x = new Runnable() {
                    final UnityAdsAdapter a;

                    @Override
                    public void run() {
                        if(UnityAdsAdapter.this.t) {
                            b.b(Thread.currentThread(), "Time out in : UnityAds");
                            if(UnityAdsAdapter.this.b != null) {
                                UnityAdsAdapter.this.b.d(UnityAdsAdapter.this.p);
                            }
                        }
                    }
                };
            }
            this.w.postDelayed(this.x, 10000L);
            b.c(Thread.currentThread(), "UnityAdsAdapter loadInterstitial");
            this.j = ((a0)d00.e().a().get(v)).a("UnityGameId");
            this.l = ((a0)d00.e().a().get(v)).a("UnityPlacementId");
            if(!UnityAds.isInitialized()) {
                b.a(Thread.currentThread(), "UnityAdsAdapter interstitial initialize");
                UnityAds.initialize(context0, this.j, false, new IUnityAdsInitializationListener() {
                    final UnityAdsAdapter a;

                    @Override  // com.unity3d.ads.IUnityAdsInitializationListener
                    public void onInitializationComplete() {
                        b.a(Thread.currentThread(), "UnityAdsAdapter interstitial onInitializationComplete");
                        UnityAds.load(UnityAdsAdapter.this.l, UnityAdsAdapter.this.M);
                    }

                    @Override  // com.unity3d.ads.IUnityAdsInitializationListener
                    public void onInitializationFailed(UnityAdsInitializationError unityAds$UnityAdsInitializationError0, String s) {
                        b.a(Thread.currentThread(), "UnityAdsAdapter interstitial onInitializationFailed : " + UnityAdsAdapter.this.l + ",  message : " + s);
                        if(UnityAdsAdapter.this.b != null) {
                            UnityAdsAdapter.this.b.d(UnityAdsAdapter.this.p);
                        }
                        UnityAdsAdapter.this.t = false;
                        UnityAdsAdapter.this.w.removeCallbacks(UnityAdsAdapter.this.x);
                    }
                });
                return;
            }
            b.a(Thread.currentThread(), "UnityAdsAdapter interstitial already initialized && load ad");
            UnityAds.load(this.l, this.M);
        }
        catch(Exception exception0) {
            this.t = false;
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
            this.B = true;
            this.v = true;
            this.r = v;
            if(adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.w == null) {
                    this.w = new Handler();
                }
                if(this.z == null) {
                    this.z = new Runnable() {
                        final UnityAdsAdapter a;

                        @Override
                        public void run() {
                            if(UnityAdsAdapter.this.v) {
                                b.b(Thread.currentThread(), "Time out in : UnityAds");
                                UnityAdsAdapter.this.a(false);
                                if(UnityAdsAdapter.this.B && UnityAdsAdapter.this.e != null) {
                                    UnityAdsAdapter.this.e.d(UnityAdsAdapter.this.r);
                                }
                            }
                        }
                    };
                }
                this.w.postDelayed(this.z, adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout());
            }
            b.a(Thread.currentThread(), "UnityAdsAdapter.loadInterstitialVideoAd()");
            this.j = ((a0)d00.e().a().get(v)).a("UnityGameId");
            this.n = ((a0)d00.e().a().get(v)).a("UnityPlacementId");
            if(!UnityAds.isInitialized()) {
                b.a(Thread.currentThread(), "UnityAdsAdapter interstitialVideo initialize");
                UnityAds.initialize(context0, this.j, false, new IUnityAdsInitializationListener() {
                    final UnityAdsAdapter a;

                    @Override  // com.unity3d.ads.IUnityAdsInitializationListener
                    public void onInitializationComplete() {
                        b.a(Thread.currentThread(), "UnityAdsAdapter interstitialVideo onInitializationComplete");
                        UnityAds.load(UnityAdsAdapter.this.n, UnityAdsAdapter.this.O);
                    }

                    @Override  // com.unity3d.ads.IUnityAdsInitializationListener
                    public void onInitializationFailed(UnityAdsInitializationError unityAds$UnityAdsInitializationError0, String s) {
                        b.a(Thread.currentThread(), "UnityAdsAdapter interstitialVideo onInitializationFailed : " + UnityAdsAdapter.this.n + ",  message : " + s);
                        UnityAdsAdapter.this.a(false);
                        if(UnityAdsAdapter.this.B && UnityAdsAdapter.this.e != null) {
                            UnityAdsAdapter.this.e.b(UnityAdsAdapter.this.r);
                        }
                    }
                });
                return;
            }
            b.a(Thread.currentThread(), "UnityAdsAdapter interstitialVideo already initialized && load ad : " + this.n);
            UnityAds.load(this.n, this.O);
            return;
        }
        catch(Exception exception0) {
        }
        this.a(false);
        b.a(Thread.currentThread(), exception0);
        V v1 = this.e;
        if(v1 != null) {
            v1.d(this.r);
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
        c0 c00 = this.c;
        if(c00 != null) {
            c00.a(v, 3);
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
            this.u = true;
            this.q = v;
            if(adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.w == null) {
                    this.w = new Handler();
                }
                if(this.y == null) {
                    this.y = new Runnable() {
                        final UnityAdsAdapter a;

                        @Override
                        public void run() {
                            if(UnityAdsAdapter.this.u) {
                                b.b(Thread.currentThread(), "Time out in : UnityAds");
                                UnityAdsAdapter.this.a(true);
                                if(UnityAdsAdapter.this.A && UnityAdsAdapter.this.d != null) {
                                    UnityAdsAdapter.this.d.d(UnityAdsAdapter.this.q);
                                }
                            }
                        }
                    };
                }
                this.w.postDelayed(this.y, adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout());
            }
            b.a(Thread.currentThread(), "UnityAdsAdapter.loadRewardVideoAd()");
            this.j = ((a0)d00.e().a().get(v)).a("UnityGameId");
            this.m = ((a0)d00.e().a().get(v)).a("UnityPlacementId");
            if(!UnityAds.isInitialized()) {
                b.a(Thread.currentThread(), "UnityAdsAdapter rewardVideo initialize");
                UnityAds.initialize(context0, this.j, false, new IUnityAdsInitializationListener() {
                    final UnityAdsAdapter a;

                    @Override  // com.unity3d.ads.IUnityAdsInitializationListener
                    public void onInitializationComplete() {
                        b.a(Thread.currentThread(), "UnityAdsAdapter rewardVideo onInitializationComplete");
                        UnityAds.load(UnityAdsAdapter.this.m, UnityAdsAdapter.this.N);
                    }

                    @Override  // com.unity3d.ads.IUnityAdsInitializationListener
                    public void onInitializationFailed(UnityAdsInitializationError unityAds$UnityAdsInitializationError0, String s) {
                        b.a(Thread.currentThread(), "UnityAdsAdapter rewardVideo onInitializationFailed : " + UnityAdsAdapter.this.m + ",  message : " + s);
                        UnityAdsAdapter.this.a(true);
                        if(UnityAdsAdapter.this.A && UnityAdsAdapter.this.d != null) {
                            UnityAdsAdapter.this.d.d(UnityAdsAdapter.this.q);
                        }
                    }
                });
                return;
            }
            b.a(Thread.currentThread(), "UnityAdsAdapter rewardVideo already initialized && load ad");
            UnityAds.load(this.m, this.N);
            return;
        }
        catch(Exception exception0) {
        }
        this.a(true);
        b.a(Thread.currentThread(), exception0);
        l0 l00 = this.d;
        if(l00 != null) {
            l00.d(this.q);
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
            this.G = v;
            b.a(Thread.currentThread(), "UnityAdsAdapter videoMix showAd : " + v1);
            if(v1 == 2 || v1 == 4 || v1 == 6) {
                UnityAds.show(((Activity)context0), this.K, new IUnityAdsShowListener() {
                    final UnityAdsAdapter b;

                    @Override  // com.unity3d.ads.IUnityAdsShowListener
                    public void onUnityAdsShowClick(String s) {
                        b.a(Thread.currentThread(), "UnityAdsAdapter videoMix onUnityAdsShowClick : " + UnityAdsAdapter.this.l + ", placementId : " + s);
                        if(UnityAdsAdapter.this.i != null) {
                            UnityAdsAdapter.this.i.onClickAd();
                        }
                    }

                    @Override  // com.unity3d.ads.IUnityAdsShowListener
                    public void onUnityAdsShowComplete(String s, UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) {
                        b.a(Thread.currentThread(), "UnityAdsAdapter videoMix onUnityAdsShowComplete : " + unityAds$UnityAdsShowCompletionState0 + ", unityInterstitialPlacementId : " + UnityAdsAdapter.this.K + ", placementId: " + s);
                        if(v1 == 4) {
                            if(unityAds$UnityAdsShowCompletionState0 != UnityAdsShowCompletionState.COMPLETED) {
                                if(unityAds$UnityAdsShowCompletionState0 == UnityAdsShowCompletionState.SKIPPED && UnityAdsAdapter.this.i != null) {
                                    UnityAdsAdapter.this.i.a(i.k.b(), false);
                                }
                            }
                            else if(UnityAdsAdapter.this.i != null) {
                                UnityAdsAdapter.this.i.a(i.k.b(), true);
                            }
                        }
                        if(UnityAdsAdapter.this.i != null) {
                            UnityAdsAdapter.this.i.a();
                        }
                        UnityAdsAdapter.this.J = false;
                    }

                    @Override  // com.unity3d.ads.IUnityAdsShowListener
                    public void onUnityAdsShowFailure(String s, UnityAdsShowError unityAds$UnityAdsShowError0, String s1) {
                        b.a(Thread.currentThread(), "UnityAdsAdapter videoMix onUnityAdsShowFailure : " + UnityAdsAdapter.this.K + ", placementId: " + s + ", error : " + unityAds$UnityAdsShowError0);
                        if(UnityAdsAdapter.this.J && UnityAdsAdapter.this.i != null) {
                            UnityAdsAdapter.this.i.c(UnityAdsAdapter.this.G);
                        }
                    }

                    @Override  // com.unity3d.ads.IUnityAdsShowListener
                    public void onUnityAdsShowStart(String s) {
                        b.a(Thread.currentThread(), "UnityAdsAdapter videoMix onUnityAdsShowStart : " + UnityAdsAdapter.this.K + ", placementId: " + s);
                        if(UnityAdsAdapter.this.J && UnityAdsAdapter.this.i != null) {
                            UnityAdsAdapter.this.i.a(UnityAdsAdapter.this.G);
                        }
                    }
                });
                return;
            }
            b.a(Thread.currentThread(), "UnityAdsAdapter does not support videoMix campaign type");
            E0 e00 = this.i;
            if(e00 != null) {
                e00.c(v);
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "UnityAdsAdapter videoMix exception");
            E0 e01 = this.i;
            if(e01 != null) {
                e01.c(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        try {
            this.p = v;
            UnityAds.show(((Activity)context0), this.l, new IUnityAdsShowListener() {
                final UnityAdsAdapter a;

                @Override  // com.unity3d.ads.IUnityAdsShowListener
                public void onUnityAdsShowClick(String s) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter interstitial onUnityAdsShowClick : " + UnityAdsAdapter.this.l + ", placementId : " + s);
                    if(UnityAdsAdapter.this.b != null) {
                        UnityAdsAdapter.this.b.a();
                    }
                }

                @Override  // com.unity3d.ads.IUnityAdsShowListener
                public void onUnityAdsShowComplete(String s, UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter interstitial onUnityAdsShowComplete : " + unityAds$UnityAdsShowCompletionState0 + ", unityInterstitialPlacementId : " + UnityAdsAdapter.this.l + ", placementId: " + s);
                    if(UnityAdsAdapter.this.b != null) {
                        UnityAdsAdapter.this.b.e(0);
                    }
                }

                @Override  // com.unity3d.ads.IUnityAdsShowListener
                public void onUnityAdsShowFailure(String s, UnityAdsShowError unityAds$UnityAdsShowError0, String s1) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter interstitial onUnityAdsShowFailure : " + UnityAdsAdapter.this.l + ", placementId : " + s + ", error : " + unityAds$UnityAdsShowError0);
                    if(UnityAdsAdapter.this.b != null) {
                        UnityAdsAdapter.this.b.c(UnityAdsAdapter.this.p);
                    }
                }

                @Override  // com.unity3d.ads.IUnityAdsShowListener
                public void onUnityAdsShowStart(String s) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter interstitial onUnityAdsShowStart : " + UnityAdsAdapter.this.l + ", placementId : " + s);
                    if(UnityAdsAdapter.this.b != null) {
                        UnityAdsAdapter.this.b.a(UnityAdsAdapter.this.p);
                    }
                }
            });
        }
        catch(Exception unused_ex) {
            T t0 = this.b;
            if(t0 != null) {
                t0.c(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitialVideoAd(Context context0, d0 d00, boolean z, int v) {
        try {
            this.r = v;
            UnityAds.show(((Activity)context0), this.n, new IUnityAdsShowListener() {
                final UnityAdsAdapter a;

                @Override  // com.unity3d.ads.IUnityAdsShowListener
                public void onUnityAdsShowClick(String s) {
                    if(UnityAdsAdapter.this.e != null) {
                        UnityAdsAdapter.this.e.onClickAd();
                    }
                }

                @Override  // com.unity3d.ads.IUnityAdsShowListener
                public void onUnityAdsShowComplete(String s, UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter interstitialVideo onUnityAdsShowComplete : " + unityAds$UnityAdsShowCompletionState0);
                    if(UnityAdsAdapter.this.e != null) {
                        UnityAdsAdapter.this.e.a();
                    }
                    UnityAdsAdapter.this.B = false;
                }

                @Override  // com.unity3d.ads.IUnityAdsShowListener
                public void onUnityAdsShowFailure(String s, UnityAdsShowError unityAds$UnityAdsShowError0, String s1) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter interstitialVideo onUnityAdsShowFailure : " + UnityAdsAdapter.this.n + ", placementId : " + s + ", error : " + unityAds$UnityAdsShowError0);
                    if(UnityAdsAdapter.this.B && UnityAdsAdapter.this.e != null) {
                        UnityAdsAdapter.this.e.c(UnityAdsAdapter.this.r);
                    }
                }

                @Override  // com.unity3d.ads.IUnityAdsShowListener
                public void onUnityAdsShowStart(String s) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter interstitialVideo onUnityAdsShowStart");
                    if(UnityAdsAdapter.this.B && UnityAdsAdapter.this.e != null) {
                        UnityAdsAdapter.this.e.a(UnityAdsAdapter.this.r);
                    }
                }
            });
        }
        catch(Exception unused_ex) {
            if(this.B) {
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
            this.q = v;
            UnityAds.show(((Activity)context0), this.m, new IUnityAdsShowListener() {
                final UnityAdsAdapter a;

                @Override  // com.unity3d.ads.IUnityAdsShowListener
                public void onUnityAdsShowClick(String s) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter onUnityAdsShowClick unityRVPlacementId : " + UnityAdsAdapter.this.m + ", placementId : " + s);
                    if(UnityAdsAdapter.this.d != null) {
                        UnityAdsAdapter.this.d.onClickAd();
                    }
                }

                @Override  // com.unity3d.ads.IUnityAdsShowListener
                public void onUnityAdsShowComplete(String s, UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter onUnityAdsShowComplete : " + unityAds$UnityAdsShowCompletionState0 + ", unityRVPlacementId : " + UnityAdsAdapter.this.m + ", placementId: " + s);
                    if(unityAds$UnityAdsShowCompletionState0 != UnityAdsShowCompletionState.COMPLETED) {
                        if(unityAds$UnityAdsShowCompletionState0 == UnityAdsShowCompletionState.SKIPPED && UnityAdsAdapter.this.d != null) {
                            UnityAdsAdapter.this.d.a(i.k.b(), false);
                        }
                    }
                    else if(UnityAdsAdapter.this.d != null) {
                        UnityAdsAdapter.this.d.a(i.k.b(), true);
                    }
                    if(UnityAdsAdapter.this.d != null) {
                        UnityAdsAdapter.this.d.a();
                    }
                    UnityAdsAdapter.this.A = false;
                }

                @Override  // com.unity3d.ads.IUnityAdsShowListener
                public void onUnityAdsShowFailure(String s, UnityAdsShowError unityAds$UnityAdsShowError0, String s1) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter onUnityAdsShowFailure unityRVPlacementId : " + UnityAdsAdapter.this.m + ", placementId : " + s + ", error : " + unityAds$UnityAdsShowError0);
                    if(UnityAdsAdapter.this.A && UnityAdsAdapter.this.d != null) {
                        UnityAdsAdapter.this.d.c(UnityAdsAdapter.this.q);
                    }
                }

                @Override  // com.unity3d.ads.IUnityAdsShowListener
                public void onUnityAdsShowStart(String s) {
                    b.a(Thread.currentThread(), "UnityAdsAdapter onUnityAdsShowStart unityRVPlacementId : " + UnityAdsAdapter.this.m + ", placementId : " + s);
                    if(UnityAdsAdapter.this.A && UnityAdsAdapter.this.d != null) {
                        UnityAdsAdapter.this.d.a(UnityAdsAdapter.this.q);
                    }
                }
            });
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            if(this.A) {
                l0 l00 = this.d;
                if(l00 != null) {
                    l00.c(v);
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void startBannerAd(Context context0, AdSize adSize0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, d0 d00, boolean z, int v) {
        try {
            this.s = true;
            this.o = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.E == null) {
                    this.E = new Handler();
                }
                if(this.F == null) {
                    this.F = new Runnable() {
                        final UnityAdsAdapter a;

                        @Override
                        public void run() {
                            if(UnityAdsAdapter.this.s) {
                                b.b(Thread.currentThread(), "Time out in : UnityAds");
                                if(UnityAdsAdapter.this.a != null) {
                                    UnityAdsAdapter.this.a.a(UnityAdsAdapter.this.o);
                                }
                            }
                        }
                    };
                }
                this.E.postDelayed(this.F, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            b.a(Thread.currentThread(), "UnityAdsAdapter.startBannerAd()");
            this.j = ((a0)d00.e().a().get(v)).a("UnityGameId");
            this.k = ((a0)d00.e().a().get(v)).a("UnityPlacementId");
            if(!(context0 instanceof Activity)) {
                b.a(Thread.currentThread(), "UnityAdsAdapter context is not activity context");
                this.s = false;
                C c0 = this.a;
                if(c0 != null) {
                    c0.a(v);
                }
                return;
            }
            if(this.C != null) {
                b.a(Thread.currentThread(), "already exist unityBannerView");
            }
            else if(adSize0 == AdSize.BANNER_320x50) {
                this.C = new BannerView(((Activity)context0), this.k, new UnityBannerSize(320, 50));
            }
            else if(adSize0 == AdSize.BANNER_320x100) {
                this.C = new BannerView(((Activity)context0), this.k, new UnityBannerSize(320, 100));
            }
            else {
                this.C = new BannerView(((Activity)context0), this.k, new UnityBannerSize(300, 0xFA));
            }
            if(!UnityAds.isInitialized()) {
                b.a(Thread.currentThread(), "UnityAdsAdapter Banner initialize");
                UnityAds.initialize(context0, this.j, false, new IUnityAdsInitializationListener() {
                    final UnityAdsAdapter b;

                    @Override  // com.unity3d.ads.IUnityAdsInitializationListener
                    public void onInitializationComplete() {
                        b.a(Thread.currentThread(), "UnityAdsAdapter Banner onInitializationComplete");
                        if(UnityAdsAdapter.this.C != null) {
                            UnityAdsAdapter.this.a(adPopcornSSPBannerAd0);
                        }
                    }

                    @Override  // com.unity3d.ads.IUnityAdsInitializationListener
                    public void onInitializationFailed(UnityAdsInitializationError unityAds$UnityAdsInitializationError0, String s) {
                        b.a(Thread.currentThread(), "UnityAdsAdapter Banner onInitializationFailed : " + UnityAdsAdapter.this.k + ",  message : " + s);
                        UnityAdsAdapter.this.stopBannerTimer();
                        if(UnityAdsAdapter.this.a != null) {
                            UnityAdsAdapter.this.a.a(UnityAdsAdapter.this.o);
                        }
                    }
                });
                return;
            }
            b.a(Thread.currentThread(), "UnityAdsAdapter Banner already initialized && load ad");
            this.a(adPopcornSSPBannerAd0);
            return;
        }
        catch(Exception exception0) {
        }
        this.stopBannerTimer();
        C c1 = this.a;
        if(c1 != null) {
            c1.a(this.o);
        }
        b.a(Thread.currentThread(), exception0);
    }

    public void stopBannerTimer() {
        try {
            this.s = false;
            Handler handler0 = this.E;
            if(handler0 != null) {
                handler0.removeCallbacks(this.F);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

