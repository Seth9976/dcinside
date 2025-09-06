package com.igaworks.ssp.common.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk.SdkInitializationListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
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
import java.util.HashMap;
import java.util.Map;

public class AppLovinAdapter implements BaseMediationAdapter, VideoMixAdMediationAdapter {
    private AppLovinIncentivizedInterstitial A;
    private AppLovinSdk.SdkInitializationListener B;
    private boolean C;
    private Handler D;
    private Runnable E;
    private int F;
    private boolean G;
    private Runnable H;
    private boolean I;
    private AppLovinAd J;
    private AppLovinIncentivizedInterstitial K;
    AppLovinAdLoadListener L;
    AppLovinAdDisplayListener M;
    AppLovinAdClickListener N;
    AppLovinAdLoadListener O;
    AppLovinAdDisplayListener P;
    AppLovinAdVideoPlaybackListener Q;
    AppLovinAdRewardListener R;
    AppLovinAdClickListener S;
    AppLovinAdLoadListener T;
    AppLovinAdDisplayListener U;
    AppLovinAdClickListener V;
    AppLovinAdLoadListener W;
    AppLovinAdLoadListener X;
    AppLovinAdDisplayListener Y;
    AppLovinAdClickListener Z;
    private C a;
    AppLovinAdDisplayListener a0;
    private T b;
    AppLovinAdVideoPlaybackListener b0;
    private c0 c;
    AppLovinAdRewardListener c0;
    private l0 d;
    AppLovinAdClickListener d0;
    private V e;
    private r0 f;
    private g0 g;
    private b0 h;
    private E0 i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private Handler q;
    private Runnable r;
    private Runnable s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private AppLovinAdView x;
    private AppLovinAd y;
    private AppLovinAd z;

    public AppLovinAdapter() {
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = new Handler(Looper.getMainLooper());
        this.t = false;
        this.u = false;
        this.C = false;
        this.D = new Handler(Looper.getMainLooper());
        this.F = 0;
        this.G = true;
        this.I = false;
        this.L = new AppLovinAdLoadListener() {
            final AppLovinAdapter a;

            public void adReceived(AppLovinAd appLovinAd0) {
                AppLovinAdapter.this.y = appLovinAd0;
                b.a(Thread.currentThread(), "AppLovinAdapter interstitial adReceived");
                if(AppLovinAdapter.this.b != null) {
                    AppLovinAdapter.this.b.b(AppLovinAdapter.this.k);
                }
            }

            public void failedToReceiveAd(int v) {
                b.a(Thread.currentThread(), "AppLovinAdapter interstitial failedToReceiveAd");
                AppLovinAdapter.this.y = null;
                if(AppLovinAdapter.this.b != null) {
                    AppLovinAdapter.this.b.d(AppLovinAdapter.this.k);
                }
            }
        };
        this.M = new AppLovinAdDisplayListener() {
            final AppLovinAdapter a;

            public void adDisplayed(AppLovinAd appLovinAd0) {
                if(AppLovinAdapter.this.b != null) {
                    AppLovinAdapter.this.b.a(AppLovinAdapter.this.k);
                }
            }

            public void adHidden(AppLovinAd appLovinAd0) {
                if(AppLovinAdapter.this.b != null) {
                    AppLovinAdapter.this.b.e(0);
                }
            }
        };
        this.N = new AppLovinAdClickListener() {
            final AppLovinAdapter a;

            public void adClicked(AppLovinAd appLovinAd0) {
                if(AppLovinAdapter.this.b != null) {
                    AppLovinAdapter.this.b.a();
                }
            }
        };
        this.O = new AppLovinAdLoadListener() {
            final AppLovinAdapter a;

            public void adReceived(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter RewardVideo adReceived");
                AppLovinAdapter.this.a(true);
                if(AppLovinAdapter.this.t && AppLovinAdapter.this.d != null) {
                    AppLovinAdapter.this.d.b(AppLovinAdapter.this.l);
                }
            }

            public void failedToReceiveAd(int v) {
                b.a(Thread.currentThread(), "AppLovinAdapter RewardVideo failedToReceiveAd : " + v);
                AppLovinAdapter.this.a(true);
                if(AppLovinAdapter.this.t && AppLovinAdapter.this.d != null) {
                    AppLovinAdapter.this.d.d(AppLovinAdapter.this.l);
                }
            }
        };
        this.P = new AppLovinAdDisplayListener() {
            final AppLovinAdapter a;

            public void adDisplayed(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter rewardVideo adDisplayed");
                if(AppLovinAdapter.this.t && AppLovinAdapter.this.d != null) {
                    AppLovinAdapter.this.d.a(AppLovinAdapter.this.l);
                }
            }

            public void adHidden(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter rewardVideo adHidden");
                if(AppLovinAdapter.this.d != null) {
                    AppLovinAdapter.this.d.a();
                }
                AppLovinAdapter.this.t = false;
            }
        };
        this.Q = new AppLovinAdVideoPlaybackListener() {
            final AppLovinAdapter a;

            public void videoPlaybackBegan(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter rewardVideo videoPlaybackBegan");
            }

            public void videoPlaybackEnded(AppLovinAd appLovinAd0, double f, boolean z) {
                b.a(Thread.currentThread(), "AppLovinAdapter rewardVideo videoPlaybackEnded : " + z);
                if(z) {
                    if(AppLovinAdapter.this.d != null) {
                        AppLovinAdapter.this.d.a(i.s.b(), AppLovinAdapter.this.C);
                    }
                }
                else if(AppLovinAdapter.this.d != null) {
                    AppLovinAdapter.this.d.a(i.s.b(), false);
                }
            }
        };
        this.R = new AppLovinAdRewardListener() {
            final AppLovinAdapter a;

            public void userOverQuota(AppLovinAd appLovinAd0, Map map0) {
                b.a(Thread.currentThread(), "AppLovinAdapter rewardVideo userOverQuota");
                AppLovinAdapter.this.C = false;
            }

            public void userRewardRejected(AppLovinAd appLovinAd0, Map map0) {
                b.a(Thread.currentThread(), "AppLovinAdapter rewardVideo userRewardRejected");
                AppLovinAdapter.this.C = false;
            }

            public void userRewardVerified(AppLovinAd appLovinAd0, Map map0) {
                b.a(Thread.currentThread(), "AppLovinAdapter rewardVideo userRewardVerified");
                AppLovinAdapter.this.C = true;
            }

            public void validationRequestFailed(AppLovinAd appLovinAd0, int v) {
                b.a(Thread.currentThread(), "AppLovinAdapter rewardVideo validationRequestFailed");
                AppLovinAdapter.this.C = false;
            }
        };
        this.S = new AppLovinAdClickListener() {
            final AppLovinAdapter a;

            public void adClicked(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter RewardVideo adClicked");
                if(AppLovinAdapter.this.d != null) {
                    AppLovinAdapter.this.d.onClickAd();
                }
            }
        };
        this.T = new AppLovinAdLoadListener() {
            final AppLovinAdapter a;

            public void adReceived(AppLovinAd appLovinAd0) {
                AppLovinAdapter.this.z = appLovinAd0;
                AppLovinAdapter.this.a(false);
                b.a(Thread.currentThread(), "AppLovinAdapter interstitialVideo onAdLoaded");
                if(AppLovinAdapter.this.u && AppLovinAdapter.this.e != null) {
                    AppLovinAdapter.this.e.b(AppLovinAdapter.this.m);
                }
            }

            public void failedToReceiveAd(int v) {
                b.a(Thread.currentThread(), "AppLovinAdapter interstitialVideo failedToReceiveAd");
                AppLovinAdapter.this.z = null;
                AppLovinAdapter.this.a(false);
                if(AppLovinAdapter.this.u && AppLovinAdapter.this.e != null) {
                    AppLovinAdapter.this.e.d(AppLovinAdapter.this.m);
                }
            }
        };
        this.U = new AppLovinAdDisplayListener() {
            final AppLovinAdapter a;

            public void adDisplayed(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter interstitialVideo onAdDisplayed");
                if(AppLovinAdapter.this.u && AppLovinAdapter.this.e != null) {
                    AppLovinAdapter.this.e.a(AppLovinAdapter.this.m);
                }
            }

            public void adHidden(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter interstitialVideo onAdHidden");
                if(AppLovinAdapter.this.e != null) {
                    AppLovinAdapter.this.e.a();
                }
                AppLovinAdapter.this.u = false;
            }
        };
        this.V = new AppLovinAdClickListener() {
            final AppLovinAdapter a;

            public void adClicked(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter interstitialVideo onAdClicked");
                if(AppLovinAdapter.this.e != null) {
                    AppLovinAdapter.this.e.onClickAd();
                }
            }
        };
        this.W = new AppLovinAdLoadListener() {
            final AppLovinAdapter a;

            public void adReceived(AppLovinAd appLovinAd0) {
                AppLovinAdapter.this.J = appLovinAd0;
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix adReceived");
                AppLovinAdapter.this.a();
                if(AppLovinAdapter.this.i != null) {
                    AppLovinAdapter.this.i.b(AppLovinAdapter.this.F);
                }
            }

            public void failedToReceiveAd(int v) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix failedToReceiveAd");
                AppLovinAdapter.this.J = null;
                AppLovinAdapter.this.a();
                if(AppLovinAdapter.this.i != null) {
                    AppLovinAdapter.this.i.d(AppLovinAdapter.this.F);
                }
            }
        };
        this.X = new AppLovinAdLoadListener() {
            final AppLovinAdapter a;

            public void adReceived(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix adReceived");
                AppLovinAdapter.this.a();
                if(AppLovinAdapter.this.I && AppLovinAdapter.this.i != null) {
                    AppLovinAdapter.this.i.b(AppLovinAdapter.this.F);
                }
            }

            public void failedToReceiveAd(int v) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix failedToReceiveAd : " + v);
                AppLovinAdapter.this.a();
                if(AppLovinAdapter.this.I && AppLovinAdapter.this.i != null) {
                    AppLovinAdapter.this.i.d(AppLovinAdapter.this.F);
                }
            }
        };
        this.Y = new AppLovinAdDisplayListener() {
            final AppLovinAdapter a;

            public void adDisplayed(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix onAdDisplayed");
                if(AppLovinAdapter.this.I && AppLovinAdapter.this.i != null) {
                    AppLovinAdapter.this.i.a(AppLovinAdapter.this.F);
                }
            }

            public void adHidden(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix onAdHidden");
                if(AppLovinAdapter.this.i != null) {
                    AppLovinAdapter.this.i.a();
                }
                AppLovinAdapter.this.I = false;
            }
        };
        this.Z = new AppLovinAdClickListener() {
            final AppLovinAdapter a;

            public void adClicked(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix onAdClicked");
                if(AppLovinAdapter.this.i != null) {
                    AppLovinAdapter.this.i.onClickAd();
                }
            }
        };
        this.a0 = new AppLovinAdDisplayListener() {
            final AppLovinAdapter a;

            public void adDisplayed(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix adDisplayed");
                if(AppLovinAdapter.this.I && AppLovinAdapter.this.i != null) {
                    AppLovinAdapter.this.i.a(AppLovinAdapter.this.F);
                }
            }

            public void adHidden(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix adHidden");
                if(AppLovinAdapter.this.i != null) {
                    AppLovinAdapter.this.i.a();
                }
                AppLovinAdapter.this.I = false;
            }
        };
        this.b0 = new AppLovinAdVideoPlaybackListener() {
            final AppLovinAdapter a;

            public void videoPlaybackBegan(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix videoPlaybackBegan");
            }

            public void videoPlaybackEnded(AppLovinAd appLovinAd0, double f, boolean z) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix videoPlaybackEnded : " + z);
                if(z) {
                    if(AppLovinAdapter.this.i != null) {
                        AppLovinAdapter.this.i.a(i.s.b(), AppLovinAdapter.this.C);
                    }
                }
                else if(AppLovinAdapter.this.i != null) {
                    AppLovinAdapter.this.i.a(i.s.b(), false);
                }
            }
        };
        this.c0 = new AppLovinAdRewardListener() {
            final AppLovinAdapter a;

            public void userOverQuota(AppLovinAd appLovinAd0, Map map0) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix userOverQuota");
                AppLovinAdapter.this.C = false;
            }

            public void userRewardRejected(AppLovinAd appLovinAd0, Map map0) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix userRewardRejected");
                AppLovinAdapter.this.C = false;
            }

            public void userRewardVerified(AppLovinAd appLovinAd0, Map map0) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix userRewardVerified");
                AppLovinAdapter.this.C = true;
            }

            public void validationRequestFailed(AppLovinAd appLovinAd0, int v) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix validationRequestFailed");
                AppLovinAdapter.this.C = false;
            }
        };
        this.d0 = new AppLovinAdClickListener() {
            final AppLovinAdapter a;

            public void adClicked(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix adClicked");
                if(AppLovinAdapter.this.i != null) {
                    AppLovinAdapter.this.i.onClickAd();
                }
            }
        };
    }

    private void a(Context context0, String s) {
        try {
            if(s != null && s.length() > 0) {
                AppLovinSdk.getInstance(context0).getAdService().loadNextAdForZoneId(s, this.L);
                return;
            }
            AppLovinSdk.getInstance(context0).getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, this.L);
        }
        catch(Exception exception0) {
            T t0 = this.b;
            if(t0 != null) {
                t0.d(this.k);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    private void a(Context context0, String s, AdPopcornSSPBannerAd adPopcornSSPBannerAd0) {
        AppLovinAdView appLovinAdView0 = this.x;
        if(appLovinAdView0 != null) {
            appLovinAdView0.destroy();
        }
        this.x = s == null || s.length() <= 0 ? new AppLovinAdView(AppLovinAdSize.BANNER, context0) : new AppLovinAdView(AppLovinAdSize.BANNER, s, context0);
        ((View)this.x).setLayoutParams(new FrameLayout.LayoutParams(this.v, this.w));
        this.x.setAdLoadListener(new AppLovinAdLoadListener() {
            final AppLovinAdapter b;

            public void adReceived(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter banner adReceived");
                try {
                    adPopcornSSPBannerAd0.removeAllViewsInLayout();
                    adPopcornSSPBannerAd0.removeAllViews();
                    adPopcornSSPBannerAd0.addView(((View)AppLovinAdapter.this.x));
                    AppLovinAdapter.this.b();
                    if(AppLovinAdapter.this.a != null) {
                        AppLovinAdapter.this.a.b(AppLovinAdapter.this.j);
                    }
                    if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                        adPopcornSSPBannerAd0.setVisibility(4);
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            final com.igaworks.ssp.common.adapter.AppLovinAdapter.5 a;

                            @Override
                            public void run() {
                                AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                try {
                                    try {
                                        ((View)AppLovinAdapter.this.x).buildDrawingCache();
                                        Bitmap bitmap0 = ((View)AppLovinAdapter.this.x).getDrawingCache();
                                        if(bitmap0 != null) {
                                            int v = bitmap0.getPixel(1, 1);
                                            com.igaworks.ssp.common.adapter.AppLovinAdapter.5.this.a.setBackgroundColor(v);
                                        }
                                        goto label_17;
                                    }
                                    catch(Exception exception0) {
                                    }
                                    b.a(Thread.currentThread(), exception0);
                                    adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.AppLovinAdapter.5.this.a;
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
                                AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.AppLovinAdapter.5.this.a;
                                if(adPopcornSSPBannerAd1 != null) {
                                    adPopcornSSPBannerAd1.setVisibility(0);
                                }
                                throw throwable0;
                            label_17:
                                adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.AppLovinAdapter.5.this.a;
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
                AppLovinAdapter.this.b();
                if(AppLovinAdapter.this.a != null) {
                    AppLovinAdapter.this.a.a(AppLovinAdapter.this.j);
                }
            }

            public void failedToReceiveAd(int v) {
                b.a(Thread.currentThread(), "AppLovinAdapter banner onAdLoadFailed");
                AppLovinAdapter.this.b();
                if(AppLovinAdapter.this.a != null) {
                    AppLovinAdapter.this.a.a(AppLovinAdapter.this.j);
                }
            }
        });
        this.x.setAdClickListener(new AppLovinAdClickListener() {
            final AppLovinAdapter a;

            public void adClicked(AppLovinAd appLovinAd0) {
                b.a(Thread.currentThread(), "AppLovinAdapter banner adClicked");
                if(AppLovinAdapter.this.a != null) {
                    AppLovinAdapter.this.a.a();
                }
            }
        });
        this.x.loadNextAd();
    }

    private void a(boolean z) {
        try {
            b.b(Thread.currentThread(), "AppLovinAdapter removeTimeoutHandler");
            if(z) {
                this.o = false;
                Handler handler0 = this.q;
                if(handler0 != null) {
                    handler0.removeCallbacks(this.r);
                }
            }
            else {
                this.p = false;
                Handler handler1 = this.q;
                if(handler1 != null) {
                    handler1.removeCallbacks(this.s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void a() {
        try {
            this.G = false;
            Handler handler0 = this.q;
            if(handler0 != null) {
                handler0.removeCallbacks(this.H);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void b(Context context0, String s) {
        try {
            if(s != null && s.length() > 0) {
                AppLovinSdk.getInstance(context0).getAdService().loadNextAdForZoneId(s, this.T);
                return;
            }
            AppLovinSdk.getInstance(context0).getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, this.T);
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.a(false);
        V v0 = this.e;
        if(v0 != null) {
            v0.d(this.m);
        }
    }

    public void b() {
        try {
            this.n = false;
            Handler handler0 = this.D;
            if(handler0 != null) {
                handler0.removeCallbacks(this.E);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void c(Context context0, String s) {
        try {
            if(s != null && !s.isEmpty()) {
                AppLovinSdk.getInstance(context0).getAdService().loadNextAdForZoneId(s, this.W);
                return;
            }
            AppLovinSdk.getInstance(context0).getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, this.W);
            return;
        }
        catch(Exception exception0) {
        }
        this.a();
        E0 e00 = this.i;
        if(e00 != null) {
            e00.d(this.F);
        }
        b.a(Thread.currentThread(), exception0);
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter, com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void checkValidMediation() {
        this.B = new AppLovinSdk.SdkInitializationListener() {
            final AppLovinAdapter a;

            public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
            }
        };
        b.a(Thread.currentThread(), "AppLovinAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void destroyAd() {
        try {
            this.I = false;
            this.a();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        b.a(Thread.currentThread(), "AppLovinAdapter banner destroyBannerAd");
        AppLovinAdView appLovinAdView0 = this.x;
        if(appLovinAdView0 != null) {
            appLovinAdView0.destroy();
        }
        this.b();
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitialVideoAd() {
        try {
            b.a(Thread.currentThread(), "AppLovinAdapter.destroyInterstitialVideoAd()");
            this.u = false;
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
            this.t = false;
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
            b.a(Thread.currentThread(), "AppLovinAdapter initializeSDK");
            AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(p00.a("applovin_sdk_key"), context0).build();
            AppLovinSdk.getInstance(context0).getSettings().setCreativeDebuggerEnabled(false);
            if(!AppLovinSdk.getInstance(context0).isInitialized()) {
                AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                    final AppLovinAdapter b;

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
            goto label_14;
        }
        catch(Exception unused_ex) {
            goto label_17;
        }
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
            return;
        label_14:
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
                return;
            label_17:
                if(sdkInitListener0 != null) {
                    sdkInitListener0.onInitializationFinished();
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        b.a(Thread.currentThread(), "AppLovinAdapter banner internalStopBannerAd");
        AppLovinAdView appLovinAdView0 = this.x;
        if(appLovinAdView0 != null) {
            appLovinAdView0.destroy();
        }
        this.b();
    }

    @Override  // com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter
    public void loadAd(Context context0, AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0, d0 d00, boolean z, int v, int v1) {
        try {
            b.a(Thread.currentThread(), "AppLovinAdapter videoMix loadAd : " + v1);
            this.G = true;
            this.F = v;
            this.I = true;
            if(this.q == null) {
                this.q = new Handler();
            }
            if(this.H == null) {
                this.H = new Runnable() {
                    final AppLovinAdapter a;

                    @Override
                    public void run() {
                        if(AppLovinAdapter.this.G) {
                            b.b(Thread.currentThread(), "Time out in : AppLovin");
                            if(AppLovinAdapter.this.i != null) {
                                AppLovinAdapter.this.i.d(AppLovinAdapter.this.F);
                            }
                        }
                    }
                };
            }
            this.q.postDelayed(this.H, adPopcornSSPVideoMixAd0.getNetworkScheduleTimeout());
            String s = ((a0)d00.e().a().get(v)).a("AppLovinZoneId");
            String s1 = ((a0)d00.e().a().get(v)).a("AppLovinSdkKey");
            if(v1 != 2 && v1 != 6 && v1 != 4) {
                b.a(Thread.currentThread(), "AppLovinAdapter does not support videoMix campaign type");
                this.a();
                E0 e01 = this.i;
                if(e01 != null) {
                    e01.d(v);
                }
            }
            else {
                if(!AppLovinSdk.getInstance(context0).isInitialized()) {
                    Y y0 = Y.b();
                    com.igaworks.ssp.common.adapter.AppLovinAdapter.28 appLovinAdapter$280 = new a() {
                        final AppLovinAdapter d;

                        @Override  // com.igaworks.ssp.Y$a
                        public void a() {
                            b.a(Thread.currentThread(), "AppLovinAdapter videoMix initialized and loadAd");
                            if(v1 == 2 || v1 == 6) {
                                AppLovinAdapter.this.c(context0, s);
                            }
                            else {
                                if(AppLovinAdapter.this.K != null && (AppLovinAdapter.this.K.getZoneId() == null || !AppLovinAdapter.this.K.getZoneId().equals(s))) {
                                    AppLovinAdapter.this.K = null;
                                }
                                if(AppLovinAdapter.this.K == null || !AppLovinAdapter.this.K.isAdReadyToDisplay()) {
                                    goto label_10;
                                }
                                b.a(Thread.currentThread(), "AppLovinAdapter videoMix already ready to display");
                                AppLovinAdapter.this.a();
                                if(AppLovinAdapter.this.I && AppLovinAdapter.this.i != null) {
                                    AppLovinAdapter.this.i.b(AppLovinAdapter.this.F);
                                    return;
                                label_10:
                                    if(s == null || s.isEmpty()) {
                                        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial1 = AppLovinIncentivizedInterstitial.create(context0);
                                        AppLovinAdapter.this.K = appLovinIncentivizedInterstitial1;
                                    }
                                    else {
                                        AppLovinSdk appLovinSdk0 = AppLovinSdk.getInstance(context0);
                                        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial0 = AppLovinIncentivizedInterstitial.create(s, appLovinSdk0);
                                        AppLovinAdapter.this.K = appLovinIncentivizedInterstitial0;
                                    }
                                    AppLovinAdapter.this.K.preload(AppLovinAdapter.this.X);
                                }
                            }
                        }
                    };
                    y0.a(adPopcornSSPVideoMixAd0.getPlacementId(), i.s.b(), appLovinAdapter$280);
                    AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(s1, context0).build();
                    AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                        final AppLovinAdapter b;

                        public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
                            Y.b().a(adPopcornSSPVideoMixAd0.getPlacementId(), i.s.b());
                        }
                    });
                    return;
                }
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix already initialized");
                if(v1 == 2 || v1 == 6) {
                    this.c(context0, s);
                    return;
                }
                if(this.K != null && (this.K.getZoneId() == null || !this.K.getZoneId().equals(s))) {
                    this.K = null;
                }
                if(this.K == null || !this.K.isAdReadyToDisplay()) {
                    this.K = s == null || s.isEmpty() ? AppLovinIncentivizedInterstitial.create(context0) : AppLovinIncentivizedInterstitial.create(s, AppLovinSdk.getInstance(context0));
                    this.K.preload(this.X);
                    return;
                }
                b.a(Thread.currentThread(), "AppLovinAdapter videoMix already ready to display");
                this.a();
                E0 e00 = this.i;
                if(e00 != null) {
                    e00.b(this.F);
                }
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "AppLovinAdapter videoMix exception");
            this.a();
            E0 e02 = this.i;
            if(e02 != null) {
                e02.d(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        try {
            this.k = v;
            String s = ((a0)d00.e().a().get(v)).a("AppLovinZoneId");
            String s1 = ((a0)d00.e().a().get(v)).a("AppLovinSdkKey");
            b.a(Thread.currentThread(), "AppLovinAdapter.loadInterstitial() : " + s);
            if(AppLovinSdk.getInstance(context0).isInitialized()) {
                b.a(Thread.currentThread(), "AppLovinAdapter already initialized");
                this.a(context0, s);
                return;
            }
            Y y0 = Y.b();
            com.igaworks.ssp.common.adapter.AppLovinAdapter.7 appLovinAdapter$70 = new a() {
                final AppLovinAdapter c;

                @Override  // com.igaworks.ssp.Y$a
                public void a() {
                    b.a(Thread.currentThread(), "AppLovinAdapter initialized and loadAd");
                    AppLovinAdapter.this.a(context0, s);
                }
            };
            y0.a(adPopcornSSPInterstitialAd0.getPlacementId(), i.s.b(), appLovinAdapter$70);
            AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(s1, context0).build();
            AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                final AppLovinAdapter b;

                public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
                    Y.b().a(adPopcornSSPInterstitialAd0.getPlacementId(), i.s.b());
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
            this.m = v;
            this.u = true;
            this.p = true;
            if(adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.q == null) {
                    this.q = new Handler();
                }
                if(this.s == null) {
                    this.s = new Runnable() {
                        final AppLovinAdapter a;

                        @Override
                        public void run() {
                            if(AppLovinAdapter.this.p) {
                                b.b(Thread.currentThread(), "Time out in : AppLovin");
                                AppLovinAdapter.this.a(false);
                                if(AppLovinAdapter.this.u && AppLovinAdapter.this.e != null) {
                                    AppLovinAdapter.this.e.d(AppLovinAdapter.this.m);
                                }
                            }
                        }
                    };
                }
                this.q.postDelayed(this.s, adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout());
            }
            String s = ((a0)d00.e().a().get(v)).a("AppLovinZoneId");
            String s1 = ((a0)d00.e().a().get(v)).a("AppLovinSdkKey");
            b.a(Thread.currentThread(), "AppLovinAdapter loadInterstitialVideoAd zoneId : " + s);
            if(AppLovinSdk.getInstance(context0).isInitialized()) {
                b.a(Thread.currentThread(), "AppLovinAdapter already initialized");
                this.b(context0, s);
                return;
            }
            Y y0 = Y.b();
            com.igaworks.ssp.common.adapter.AppLovinAdapter.21 appLovinAdapter$210 = new a() {
                final AppLovinAdapter c;

                @Override  // com.igaworks.ssp.Y$a
                public void a() {
                    b.a(Thread.currentThread(), "AppLovinAdapter initialized and loadAd");
                    AppLovinAdapter.this.b(context0, s);
                }
            };
            y0.a(adPopcornSSPInterstitialVideoAd0.getPlacementId(), i.s.b(), appLovinAdapter$210);
            AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(s1, context0).build();
            AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                final AppLovinAdapter b;

                public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
                    Y.b().a(adPopcornSSPInterstitialVideoAd0.getPlacementId(), i.s.b());
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
            v1.d(this.m);
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
            this.l = v;
            this.t = true;
            this.o = true;
            if(adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.q == null) {
                    this.q = new Handler();
                }
                if(this.r == null) {
                    this.r = new Runnable() {
                        final AppLovinAdapter a;

                        @Override
                        public void run() {
                            if(AppLovinAdapter.this.o) {
                                b.b(Thread.currentThread(), String.format("Time out in : %s, %d", "AppLovin", AppLovinAdapter.this.l));
                                AppLovinAdapter.this.a(true);
                                if(AppLovinAdapter.this.t && AppLovinAdapter.this.d != null) {
                                    AppLovinAdapter.this.d.d(AppLovinAdapter.this.l);
                                }
                            }
                        }
                    };
                }
                this.q.postDelayed(this.r, adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout());
            }
            String s = ((a0)d00.e().a().get(v)).a("AppLovinZoneId");
            String s1 = ((a0)d00.e().a().get(v)).a("AppLovinSdkKey");
            b.a(Thread.currentThread(), "AppLovinAdapter loadRewardVideoAd zoneId : " + s);
            if(!AppLovinSdk.getInstance(context0).isInitialized()) {
                Y y0 = Y.b();
                com.igaworks.ssp.common.adapter.AppLovinAdapter.13 appLovinAdapter$130 = new a() {
                    final AppLovinAdapter c;

                    @Override  // com.igaworks.ssp.Y$a
                    public void a() {
                        if(AppLovinAdapter.this.A == null || !AppLovinAdapter.this.A.isAdReadyToDisplay()) {
                            if(s == null || s.length() <= 0) {
                                AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial1 = AppLovinIncentivizedInterstitial.create(context0);
                                AppLovinAdapter.this.A = appLovinIncentivizedInterstitial1;
                            }
                            else {
                                AppLovinSdk appLovinSdk0 = AppLovinSdk.getInstance(context0);
                                AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial0 = AppLovinIncentivizedInterstitial.create(s, appLovinSdk0);
                                AppLovinAdapter.this.A = appLovinIncentivizedInterstitial0;
                            }
                            AppLovinAdapter.this.A.preload(AppLovinAdapter.this.O);
                        }
                        else {
                            b.a(Thread.currentThread(), "AppLovinAdapter loadRewardVideoAd already ready to display");
                            AppLovinAdapter.this.a(true);
                            if(AppLovinAdapter.this.t && AppLovinAdapter.this.d != null) {
                                AppLovinAdapter.this.d.b(AppLovinAdapter.this.l);
                            }
                        }
                    }
                };
                y0.a(adPopcornSSPRewardVideoAd0.getPlacementId(), i.s.b(), appLovinAdapter$130);
                AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(s1, context0).build();
                AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                    final AppLovinAdapter b;

                    public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
                        Y.b().a(adPopcornSSPRewardVideoAd0.getPlacementId(), i.s.b());
                    }
                });
                return;
            }
            b.a(Thread.currentThread(), "AppLovinAdapter already initialized");
            if(this.A == null || !this.A.isAdReadyToDisplay()) {
                this.A = s == null || s.length() <= 0 ? AppLovinIncentivizedInterstitial.create(context0) : AppLovinIncentivizedInterstitial.create(s, AppLovinSdk.getInstance(context0));
                this.A.preload(this.O);
                return;
            }
            b.a(Thread.currentThread(), "AppLovinAdapter loadRewardVideoAd already ready to display");
            this.a(true);
            l0 l00 = this.d;
            if(l00 != null) {
                l00.b(this.l);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        this.a(true);
        b.a(Thread.currentThread(), exception0);
        l0 l01 = this.d;
        if(l01 != null) {
            l01.d(this.l);
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
            b.a(Thread.currentThread(), "AppLovinAdapter videoMix showAd : " + v1);
            switch(v1) {
                case 4: {
                    if(d00.o()) {
                        AppLovinSdk.getInstance(context0).getSettings().setMuted(d00.o());
                    }
                    if(this.K != null && this.K.isAdReadyToDisplay()) {
                        this.C = false;
                        this.K.show(context0, this.c0, this.b0, this.a0, this.d0);
                        return;
                    }
                    if(this.I) {
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
                    if(this.J != null) {
                        if(d00.o()) {
                            AppLovinSdk.getInstance(context0).getSettings().setMuted(d00.o());
                        }
                        AppLovinInterstitialAdDialog appLovinInterstitialAdDialog0 = AppLovinInterstitialAd.create(AppLovinSdk.getInstance(context0), context0);
                        appLovinInterstitialAdDialog0.setAdDisplayListener(this.Y);
                        appLovinInterstitialAdDialog0.setAdClickListener(this.Z);
                        appLovinInterstitialAdDialog0.showAndRender(this.J);
                        return;
                    }
                    if(this.I) {
                        E0 e01 = this.i;
                        if(e01 != null) {
                            e01.c(this.F);
                            return;
                        }
                    }
                    break;
                }
                default: {
                    b.a(Thread.currentThread(), "AppLovinAdapter does not support videoMix campaign type");
                    E0 e00 = this.i;
                    if(e00 != null) {
                        e00.c(v);
                    }
                }
            }
        }
        catch(Exception unused_ex) {
            b.a(Thread.currentThread(), "AppLovinAdapter exception");
            E0 e03 = this.i;
            if(e03 != null) {
                e03.c(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        try {
            b.a(Thread.currentThread(), "AppLovinAdapter showInterstitial : " + this.y);
            this.k = v;
            if(this.y != null) {
                AppLovinInterstitialAdDialog appLovinInterstitialAdDialog0 = AppLovinInterstitialAd.create(AppLovinSdk.getInstance(context0), context0);
                appLovinInterstitialAdDialog0.setAdDisplayListener(this.M);
                appLovinInterstitialAdDialog0.setAdClickListener(this.N);
                appLovinInterstitialAdDialog0.showAndRender(this.y);
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
            b.a(Thread.currentThread(), "AppLovinAdapter showInterstitialVideoAd : " + this.z);
            this.k = v;
            if(this.z != null) {
                if(d00.o()) {
                    AppLovinSdk.getInstance(context0).getSettings().setMuted(d00.o());
                }
                AppLovinInterstitialAdDialog appLovinInterstitialAdDialog0 = AppLovinInterstitialAd.create(AppLovinSdk.getInstance(context0), context0);
                appLovinInterstitialAdDialog0.setAdDisplayListener(this.U);
                appLovinInterstitialAdDialog0.setAdClickListener(this.V);
                appLovinInterstitialAdDialog0.showAndRender(this.z);
                return;
            }
            if(this.u) {
                V v1 = this.e;
                if(v1 != null) {
                    v1.c(this.m);
                    return;
                label_16:
                    if(this.u) {
                        goto label_17;
                    }
                    goto label_20;
                }
            }
            return;
        }
        catch(Exception exception0) {
            goto label_16;
        }
    label_17:
        V v2 = this.e;
        if(v2 != null) {
            v2.c(v);
        }
    label_20:
        b.a(Thread.currentThread(), exception0);
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showRewardVideoAd(Context context0, d0 d00, boolean z, int v) {
        try {
            this.l = v;
            b.a(Thread.currentThread(), "AppLovinAdapter.showRewardVideoAd()");
            if(d00.o()) {
                AppLovinSdk.getInstance(context0).getSettings().setMuted(d00.o());
            }
            if(this.A != null && this.A.isAdReadyToDisplay()) {
                this.C = false;
                this.A.show(context0, this.R, this.Q, this.P, this.S);
                return;
            }
            if(this.t) {
                l0 l00 = this.d;
                if(l00 != null) {
                    l00.c(v);
                }
            }
        }
        catch(Exception unused_ex) {
            if(this.t) {
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
            this.n = true;
            this.j = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.D == null) {
                    this.D = new Handler();
                }
                if(this.E == null) {
                    this.E = new Runnable() {
                        final AppLovinAdapter a;

                        @Override
                        public void run() {
                            if(AppLovinAdapter.this.n) {
                                b.b(Thread.currentThread(), "Time out in : AppLovin");
                                if(AppLovinAdapter.this.a != null) {
                                    AppLovinAdapter.this.a.a(AppLovinAdapter.this.j);
                                }
                            }
                        }
                    };
                }
                this.D.postDelayed(this.E, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            if(adSize0 == AdSize.BANNER_320x50) {
                b.a(Thread.currentThread(), "AppLovinAdapter BANNER_320x50");
                this.v = -1;
                this.w = (int)J.a(context0, 50.0f);
                String s = ((a0)d00.e().a().get(v)).a("AppLovinZoneId");
                String s1 = ((a0)d00.e().a().get(v)).a("AppLovinSdkKey");
                b.a(Thread.currentThread(), "AppLovinAdapter.startBannerAd() : " + s);
                if(AppLovinSdk.getInstance(context0).isInitialized()) {
                    b.a(Thread.currentThread(), "AppLovinAdapter already initialized");
                    this.a(context0, s, adPopcornSSPBannerAd0);
                    return;
                }
                Y y0 = Y.b();
                com.igaworks.ssp.common.adapter.AppLovinAdapter.3 appLovinAdapter$30 = new a() {
                    final AppLovinAdapter d;

                    @Override  // com.igaworks.ssp.Y$a
                    public void a() {
                        b.a(Thread.currentThread(), "AppLovinAdapter initialized and loadAd");
                        AppLovinAdapter.this.a(context0, s, adPopcornSSPBannerAd0);
                    }
                };
                y0.a(adPopcornSSPBannerAd0.getPlacementId(), i.s.b(), appLovinAdapter$30);
                AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration0 = AppLovinSdkInitializationConfiguration.builder(s1, context0).build();
                AppLovinSdk.getInstance(context0).initialize(appLovinSdkInitializationConfiguration0, new AppLovinSdk.SdkInitializationListener() {
                    final AppLovinAdapter b;

                    public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration0) {
                        Y.b().a(adPopcornSSPBannerAd0.getPlacementId(), i.s.b());
                    }
                });
                return;
            }
            b.a(Thread.currentThread(), "AppLovinAdapter BANNER_320x100 does not support");
            this.n = false;
            C c0 = this.a;
            if(c0 != null) {
                c0.a(v);
            }
        }
        catch(Exception exception0) {
            this.n = false;
            C c1 = this.a;
            if(c1 != null) {
                c1.a(v);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }
}

