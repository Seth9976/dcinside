package com.igaworks.ssp.common.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
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

public class FyberAdapter implements BaseMediationAdapter, VideoMixAdMediationAdapter {
    private String A;
    private InneractiveAdSpot B;
    private InneractiveAdSpot C;
    private InneractiveAdSpot.RequestListener D;
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
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private Handler p;
    private Runnable q;
    private Runnable r;
    private boolean s;
    private boolean t;
    private InneractiveAdSpot u;
    private InneractiveAdSpot v;
    private int w;
    private boolean x;
    private Runnable y;
    private boolean z;

    public FyberAdapter() {
        this.l = 0;
        this.m = 0;
        this.n = true;
        this.o = true;
        this.p = new Handler(Looper.getMainLooper());
        this.s = false;
        this.t = false;
        this.w = 0;
        this.x = true;
        this.z = false;
    }

    private void a() {
        this.C = InneractiveAdSpotManager.get().createSpot();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController0 = new InneractiveFullscreenUnitController();
        this.C.addUnitController(((InneractiveUnitController)inneractiveFullscreenUnitController0));
        InneractiveAdRequest inneractiveAdRequest0 = new InneractiveAdRequest(this.A);
        this.C.setRequestListener(new InneractiveAdSpot.RequestListener() {
            final FyberAdapter a;

            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot0, InneractiveErrorCode inneractiveErrorCode0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onInneractiveFailedAdRequest");
                FyberAdapter.this.removeVideoMixTimeoutHandler();
                if(FyberAdapter.this.z && FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.d(FyberAdapter.this.w);
                }
            }

            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onInneractiveSuccessfulAdRequest");
                FyberAdapter.this.removeVideoMixTimeoutHandler();
                if(FyberAdapter.this.z && FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.b(FyberAdapter.this.w);
                }
            }
        });
        inneractiveFullscreenUnitController0.setEventsListener(((InneractiveUnitController.EventsListener)new InneractiveFullscreenAdEventsListener() {
            final FyberAdapter a;

            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onAdClicked");
                if(FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.onClickAd();
                }
            }

            public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onAdDismissed");
                if(FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.a();
                }
                FyberAdapter.this.z = false;
            }

            public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot0, InneractiveUnitController.AdDisplayError inneractiveUnitController$AdDisplayError0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onAdEnteredErrorState");
                if(FyberAdapter.this.z && FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.c(FyberAdapter.this.w);
                }
            }

            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onAdImpression");
                if(FyberAdapter.this.z && FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.a(FyberAdapter.this.w);
                }
            }

            public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot0) {
            }

            public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot0) {
            }
        }));
        this.C.requestAd(inneractiveAdRequest0);
    }

    private void a(boolean z) {
        try {
            if(z) {
                this.n = false;
                Handler handler0 = this.p;
                if(handler0 != null) {
                    handler0.removeCallbacks(this.q);
                }
            }
            else {
                this.o = false;
                Handler handler1 = this.p;
                if(handler1 != null) {
                    handler1.removeCallbacks(this.r);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void b() {
        this.B = InneractiveAdSpotManager.get().createSpot();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController0 = new InneractiveFullscreenUnitController();
        this.B.addUnitController(((InneractiveUnitController)inneractiveFullscreenUnitController0));
        InneractiveAdRequest inneractiveAdRequest0 = new InneractiveAdRequest(this.A);
        this.B.setRequestListener(new InneractiveAdSpot.RequestListener() {
            final FyberAdapter a;

            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot0, InneractiveErrorCode inneractiveErrorCode0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onInneractiveFailedAdRequest");
                FyberAdapter.this.removeVideoMixTimeoutHandler();
                if(FyberAdapter.this.z && FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.d(FyberAdapter.this.w);
                }
            }

            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onInneractiveSuccessfulAdRequest");
                FyberAdapter.this.removeVideoMixTimeoutHandler();
                if(FyberAdapter.this.z && FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.b(FyberAdapter.this.w);
                }
            }
        });
        inneractiveFullscreenUnitController0.setEventsListener(((InneractiveUnitController.EventsListener)new InneractiveFullscreenAdEventsListener() {
            final FyberAdapter a;

            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onAdClicked");
                if(FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.onClickAd();
                }
            }

            public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onAdDismissed");
                if(FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.a();
                }
                FyberAdapter.this.z = false;
            }

            public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot0, InneractiveUnitController.AdDisplayError inneractiveUnitController$AdDisplayError0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onAdEnteredErrorState");
                if(FyberAdapter.this.z && FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.c(FyberAdapter.this.w);
                }
            }

            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onAdImpression");
                if(FyberAdapter.this.z && FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.a(FyberAdapter.this.w);
                }
            }

            public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot0) {
            }

            public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot0) {
            }
        }));
        inneractiveFullscreenUnitController0.setRewardedListener(new InneractiveFullScreenAdRewardedListener() {
            final FyberAdapter a;

            public void onAdRewarded(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter videoMix onAdRewarded");
                if(FyberAdapter.this.i != null) {
                    FyberAdapter.this.i.a(i.t.b(), true);
                }
                FyberAdapter.this.z = false;
            }
        });
        this.B.requestAd(inneractiveAdRequest0);
    }

    private void c() {
        this.v = InneractiveAdSpotManager.get().createSpot();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController0 = new InneractiveFullscreenUnitController();
        this.v.addUnitController(((InneractiveUnitController)inneractiveFullscreenUnitController0));
        InneractiveAdRequest inneractiveAdRequest0 = new InneractiveAdRequest(this.k);
        this.v.requestAd(inneractiveAdRequest0);
        this.v.setRequestListener(new InneractiveAdSpot.RequestListener() {
            final FyberAdapter a;

            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot0, InneractiveErrorCode inneractiveErrorCode0) {
                b.a(Thread.currentThread(), "FyberAdapter onInneractiveFailedAdRequest");
                FyberAdapter.this.a(false);
                if(FyberAdapter.this.t && FyberAdapter.this.e != null) {
                    FyberAdapter.this.e.d(FyberAdapter.this.m);
                }
            }

            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter onInneractiveSuccessfulAdRequest");
                FyberAdapter.this.a(false);
                if(FyberAdapter.this.t && FyberAdapter.this.e != null) {
                    FyberAdapter.this.e.b(FyberAdapter.this.m);
                }
            }
        });
        inneractiveFullscreenUnitController0.setEventsListener(((InneractiveUnitController.EventsListener)new InneractiveFullscreenAdEventsListener() {
            final FyberAdapter a;

            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter onAdClicked");
                if(FyberAdapter.this.e != null) {
                    FyberAdapter.this.e.onClickAd();
                }
            }

            public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter onAdDismissed");
                if(FyberAdapter.this.e != null) {
                    FyberAdapter.this.e.a();
                }
            }

            public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot0, InneractiveUnitController.AdDisplayError inneractiveUnitController$AdDisplayError0) {
                b.a(Thread.currentThread(), "FyberAdapter onAdEnteredErrorState");
                if(FyberAdapter.this.t && FyberAdapter.this.e != null) {
                    FyberAdapter.this.e.c(FyberAdapter.this.m);
                }
            }

            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter onAdImpression");
                if(FyberAdapter.this.t && FyberAdapter.this.e != null) {
                    FyberAdapter.this.e.a(FyberAdapter.this.m);
                }
            }

            public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot0) {
            }

            public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot0) {
            }
        }));
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
    }

    public void checkAdPopcornSSPReactNativeImpression() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void checkValidMediation() {
        this.D = new InneractiveAdSpot.RequestListener() {
            final FyberAdapter a;

            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot0, InneractiveErrorCode inneractiveErrorCode0) {
            }

            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot0) {
            }
        };
        b.a(Thread.currentThread(), "FyberAdapter SDK imported");
    }

    private void d() {
        this.u = InneractiveAdSpotManager.get().createSpot();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController0 = new InneractiveFullscreenUnitController();
        this.u.addUnitController(((InneractiveUnitController)inneractiveFullscreenUnitController0));
        InneractiveAdRequest inneractiveAdRequest0 = new InneractiveAdRequest(this.j);
        this.u.requestAd(inneractiveAdRequest0);
        this.u.setRequestListener(new InneractiveAdSpot.RequestListener() {
            final FyberAdapter a;

            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot0, InneractiveErrorCode inneractiveErrorCode0) {
                b.a(Thread.currentThread(), "FyberAdapter onInneractiveFailedAdRequest");
                FyberAdapter.this.a(true);
                if(FyberAdapter.this.s && FyberAdapter.this.d != null) {
                    FyberAdapter.this.d.d(FyberAdapter.this.l);
                }
            }

            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter onInneractiveSuccessfulAdRequest");
                FyberAdapter.this.a(true);
                if(FyberAdapter.this.s && FyberAdapter.this.d != null) {
                    FyberAdapter.this.d.b(FyberAdapter.this.l);
                }
            }
        });
        inneractiveFullscreenUnitController0.setEventsListener(((InneractiveUnitController.EventsListener)new InneractiveFullscreenAdEventsListener() {
            final FyberAdapter a;

            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter onAdClicked");
                if(FyberAdapter.this.d != null) {
                    FyberAdapter.this.d.onClickAd();
                }
            }

            public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter onAdDismissed");
                if(FyberAdapter.this.d != null) {
                    FyberAdapter.this.d.a();
                }
            }

            public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot0, InneractiveUnitController.AdDisplayError inneractiveUnitController$AdDisplayError0) {
                b.a(Thread.currentThread(), "FyberAdapter onAdEnteredErrorState");
                if(FyberAdapter.this.s && FyberAdapter.this.d != null) {
                    FyberAdapter.this.d.c(FyberAdapter.this.l);
                }
            }

            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter onAdImpression");
                if(FyberAdapter.this.s && FyberAdapter.this.d != null) {
                    FyberAdapter.this.d.a(FyberAdapter.this.l);
                }
            }

            public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot0) {
            }

            public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot0) {
            }
        }));
        inneractiveFullscreenUnitController0.setRewardedListener(new InneractiveFullScreenAdRewardedListener() {
            final FyberAdapter a;

            public void onAdRewarded(InneractiveAdSpot inneractiveAdSpot0) {
                b.a(Thread.currentThread(), "FyberAdapter onAdRewarded");
                if(FyberAdapter.this.d != null) {
                    FyberAdapter.this.d.a(i.t.b(), true);
                }
                FyberAdapter.this.s = false;
            }
        });
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void destroyAd() {
        try {
            this.z = false;
            this.removeVideoMixTimeoutHandler();
            InneractiveAdSpot inneractiveAdSpot0 = this.C;
            if(inneractiveAdSpot0 != null) {
                inneractiveAdSpot0.destroy();
                this.C = null;
            }
            InneractiveAdSpot inneractiveAdSpot1 = this.B;
            if(inneractiveAdSpot1 != null) {
                inneractiveAdSpot1.destroy();
                this.B = null;
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitialVideoAd() {
        try {
            this.t = false;
            this.a(false);
            InneractiveAdSpot inneractiveAdSpot0 = this.v;
            if(inneractiveAdSpot0 != null) {
                inneractiveAdSpot0.destroy();
                this.v = null;
            }
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
            this.s = false;
            this.a(true);
            InneractiveAdSpot inneractiveAdSpot0 = this.u;
            if(inneractiveAdSpot0 != null) {
                inneractiveAdSpot0.destroy();
                this.u = null;
            }
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
            b.a(Thread.currentThread(), "FyberAdapter initializeSDK");
            if(!InneractiveAdManager.wasInitialized()) {
                InneractiveAdManager.initialize(context0, p00.a("fyber_app_id"), new OnFyberMarketplaceInitializedListener() {
                    final FyberAdapter b;

                    public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus onFyberMarketplaceInitializedListener$FyberInitStatus0) {
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
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void loadAd(Context context0, AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0, d0 d00, boolean z, int v, int v1) {
        try {
            b.a(Thread.currentThread(), "FyberAdapter videoMix loadAd : " + v1);
            this.x = true;
            this.w = v;
            this.z = true;
            if(this.p == null) {
                this.p = new Handler();
            }
            if(this.y == null) {
                this.y = new Runnable() {
                    final FyberAdapter a;

                    @Override
                    public void run() {
                        if(FyberAdapter.this.x) {
                            b.b(Thread.currentThread(), "Time out in : Fyber");
                            if(FyberAdapter.this.i != null) {
                                FyberAdapter.this.i.d(FyberAdapter.this.w);
                            }
                        }
                    }
                };
            }
            this.p.postDelayed(this.y, adPopcornSSPVideoMixAd0.getNetworkScheduleTimeout());
            if(d00.o()) {
                InneractiveAdManager.setMuteVideo(true);
            }
            String s = ((a0)d00.e().a().get(v)).a("FyberAppId");
            this.A = ((a0)d00.e().a().get(v)).a("FyberSpotId");
            if(v1 == 4 || v1 == 6) {
                if(InneractiveAdManager.wasInitialized()) {
                    b.a(Thread.currentThread(), "FyberAdapter videoMix wasInitialized true");
                    if(v1 == 6) {
                        this.a();
                        return;
                    }
                    this.b();
                    return;
                }
                InneractiveAdManager.initialize(context0, s, new OnFyberMarketplaceInitializedListener() {
                    final FyberAdapter b;

                    public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus onFyberMarketplaceInitializedListener$FyberInitStatus0) {
                        if(onFyberMarketplaceInitializedListener$FyberInitStatus0 == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                            if(v1 == 6) {
                                FyberAdapter.this.a();
                                return;
                            }
                            FyberAdapter.this.b();
                            return;
                        }
                        b.a(Thread.currentThread(), "FyberAdapter videoMix onFyberMarketplaceInitialized failed  : " + onFyberMarketplaceInitializedListener$FyberInitStatus0);
                        FyberAdapter.this.removeVideoMixTimeoutHandler();
                        if(FyberAdapter.this.z && FyberAdapter.this.i != null) {
                            FyberAdapter.this.i.d(FyberAdapter.this.w);
                        }
                    }
                });
                return;
            }
            b.a(Thread.currentThread(), "FyberAdapter does not support videoMix campaign type");
            E0 e00 = this.i;
            if(e00 != null) {
                e00.d(v);
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "FyberAdapter videoMix exception");
            E0 e01 = this.i;
            if(e01 != null) {
                e01.d(v);
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
        b.a(Thread.currentThread(), "FyberAdapter.loadInterstitialVideoAd()");
        this.m = v;
        try {
            this.t = true;
            this.o = true;
            if(adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.p == null) {
                    this.p = new Handler();
                }
                if(this.r == null) {
                    this.r = new Runnable() {
                        final FyberAdapter a;

                        @Override
                        public void run() {
                            if(FyberAdapter.this.o) {
                                b.b(Thread.currentThread(), "Time out in : Fyber");
                                FyberAdapter.this.a(false);
                                if(FyberAdapter.this.t && FyberAdapter.this.e != null) {
                                    FyberAdapter.this.e.d(FyberAdapter.this.m);
                                }
                            }
                        }
                    };
                }
                this.p.postDelayed(this.r, adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout());
            }
            String s = ((a0)d00.e().a().get(v)).a("FyberAppId");
            this.k = ((a0)d00.e().a().get(v)).a("FyberSpotId");
            if(d00.o()) {
                InneractiveAdManager.setMuteVideo(true);
            }
            if(InneractiveAdManager.wasInitialized()) {
                b.a(Thread.currentThread(), "FyberAdapter wasInitialized true");
                this.c();
                return;
            }
            InneractiveAdManager.initialize(context0, s, new OnFyberMarketplaceInitializedListener() {
                final FyberAdapter a;

                public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus onFyberMarketplaceInitializedListener$FyberInitStatus0) {
                    if(onFyberMarketplaceInitializedListener$FyberInitStatus0 == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                        FyberAdapter.this.c();
                        return;
                    }
                    b.a(Thread.currentThread(), "FyberAdapter onFyberMarketplaceInitialized failed  : " + onFyberMarketplaceInitializedListener$FyberInitStatus0);
                    FyberAdapter.this.a(false);
                    if(FyberAdapter.this.t && FyberAdapter.this.e != null) {
                        FyberAdapter.this.e.d(FyberAdapter.this.m);
                    }
                }
            });
            return;
        }
        catch(Exception exception0) {
        }
        this.a(false);
        b.a(Thread.currentThread(), exception0);
        if(this.t) {
            V v1 = this.e;
            if(v1 != null) {
                v1.d(this.m);
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
        b.a(Thread.currentThread(), "FyberAdapter.loadRewardVideoAd()");
        this.l = v;
        try {
            this.s = true;
            this.n = true;
            if(adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.p == null) {
                    this.p = new Handler();
                }
                if(this.q == null) {
                    this.q = new Runnable() {
                        final FyberAdapter a;

                        @Override
                        public void run() {
                            if(FyberAdapter.this.n) {
                                b.b(Thread.currentThread(), "Time out in : Fyber");
                                FyberAdapter.this.a(true);
                                if(FyberAdapter.this.s && FyberAdapter.this.d != null) {
                                    FyberAdapter.this.d.d(FyberAdapter.this.l);
                                }
                            }
                        }
                    };
                }
                this.p.postDelayed(this.q, adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout());
            }
            String s = ((a0)d00.e().a().get(v)).a("FyberAppId");
            this.j = ((a0)d00.e().a().get(v)).a("FyberSpotId");
            if(d00.o()) {
                InneractiveAdManager.setMuteVideo(true);
            }
            if(InneractiveAdManager.wasInitialized()) {
                b.a(Thread.currentThread(), "FyberAdapter wasInitialized true");
                this.d();
                return;
            }
            InneractiveAdManager.initialize(context0, s, new OnFyberMarketplaceInitializedListener() {
                final FyberAdapter a;

                public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus onFyberMarketplaceInitializedListener$FyberInitStatus0) {
                    if(onFyberMarketplaceInitializedListener$FyberInitStatus0 == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                        FyberAdapter.this.d();
                        return;
                    }
                    b.a(Thread.currentThread(), "FyberAdapter onFyberMarketplaceInitialized failed  : " + onFyberMarketplaceInitializedListener$FyberInitStatus0);
                    FyberAdapter.this.a(true);
                    if(FyberAdapter.this.s && FyberAdapter.this.d != null) {
                        FyberAdapter.this.d.d(FyberAdapter.this.l);
                    }
                }
            });
            return;
        }
        catch(Exception exception0) {
        }
        this.a(true);
        b.a(Thread.currentThread(), exception0);
        if(this.s) {
            l0 l00 = this.d;
            if(l00 != null) {
                l00.d(this.l);
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
            this.x = false;
            Handler handler0 = this.p;
            if(handler0 != null) {
                handler0.removeCallbacks(this.y);
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
            b.a(Thread.currentThread(), "FyberAdapter videoMix showAd : " + v1);
            switch(v1) {
                case 4: {
                    if(this.B != null && this.B.isReady()) {
                        ((InneractiveFullscreenUnitController)this.B.getSelectedUnitController()).show(((Activity)context0));
                        return;
                    }
                    if(this.z) {
                        E0 e01 = this.i;
                        if(e01 != null) {
                            e01.c(v);
                            return;
                        }
                    }
                    break;
                }
                case 6: {
                    if(this.C != null && this.C.isReady()) {
                        ((InneractiveFullscreenUnitController)this.C.getSelectedUnitController()).show(((Activity)context0));
                        return;
                    }
                    if(this.z) {
                        E0 e02 = this.i;
                        if(e02 != null) {
                            e02.c(v);
                            return;
                        }
                    }
                    break;
                }
                default: {
                    b.a(Thread.currentThread(), "FyberAdapter does not support videoMix campaign type");
                    E0 e00 = this.i;
                    if(e00 != null) {
                        e00.c(v);
                    }
                }
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "FyberAdapter videoMix exception");
            E0 e03 = this.i;
            if(e03 != null) {
                e03.c(v);
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
            b.a(Thread.currentThread(), "FyberAdapter.showInterstitialVideoAd()");
            if(this.v.isReady()) {
                ((InneractiveFullscreenUnitController)this.v.getSelectedUnitController()).show(((Activity)context0));
                return;
            }
            if(this.t) {
                V v1 = this.e;
                if(v1 != null) {
                    v1.c(v);
                }
            }
        }
        catch(Exception unused_ex) {
            if(this.t) {
                V v2 = this.e;
                if(v2 != null) {
                    v2.c(v);
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
            b.a(Thread.currentThread(), "FyberAdapter.showRewardVideoAd()");
            if(this.u.isReady()) {
                ((InneractiveFullscreenUnitController)this.u.getSelectedUnitController()).show(((Activity)context0));
                return;
            }
            if(this.s) {
                l0 l00 = this.d;
                if(l00 != null) {
                    l00.c(v);
                }
            }
        }
        catch(Exception unused_ex) {
            if(this.s) {
                l0 l01 = this.d;
                if(l01 != null) {
                    l01.c(v);
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void startBannerAd(Context context0, AdSize adSize0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, d0 d00, boolean z, int v) {
        C c0 = this.a;
        if(c0 != null) {
            c0.a(v);
        }
    }

    public void stopBannerTimer() {
    }
}

