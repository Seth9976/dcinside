package com.igaworks.ssp.common.adapter;

import J.d;
import J.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.coupang.ads.interstitial.a;
import com.coupang.ads.view.banner.AdsBannerView;
import com.coupang.ads.viewmodels.AdsRequest;
import com.coupang.ads.viewmodels.AdsViewModel;
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
import java.util.HashMap;

public class CoupangAdapter implements BaseMediationAdapter {
    private C a;
    private T b;
    private r0 c;
    private g0 d;
    private b0 e;
    private boolean f;
    private AdsViewModel g;
    private AdsViewModel h;
    private AdsBannerView i;
    private a j;
    private L.a k;
    private Handler l;
    private Runnable m;
    private int n;

    public CoupangAdapter() {
        this.f = true;
        this.l = new Handler(Looper.getMainLooper());
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
    }

    public void checkAdPopcornSSPReactNativeImpression() {
    }

    public boolean checkMinimumTargetAPI() {
        if(Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        b.a(Thread.currentThread(), "CoupangAdapter checkMinimumTargetAPI false");
        return false;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkValidMediation() {
        this.k = new L.a() {
            final CoupangAdapter a;

            @Override  // L.a
            public void onAdClicked() {
            }

            @Override  // L.a
            public void onAdFailedToLoad(String s) {
            }

            @Override  // L.a
            public void onAdLoaded() {
            }
        };
        b.a(Thread.currentThread(), "CoupangAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            b.a(Thread.currentThread(), "CoupangAdapter.destroyBannerAd");
            if(this.i != null) {
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

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getBiddingToken(Context context0) {
        return null;
    }

    // 去混淆评级： 低(20)
    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getNetworkName() [...] // 潜在的解密器

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void initializeSDK(Context context0, p0 p00, SdkInitListener sdkInitListener0) {
        b.a(Thread.currentThread(), "CoupangAdapter initializeSDK");
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        try {
            b.a(Thread.currentThread(), "CoupangAdapter.internalStopBannerAd");
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
            if(!this.checkMinimumTargetAPI()) {
                T t0 = this.b;
                if(t0 != null) {
                    t0.d(v);
                    return;
                }
                return;
            }
            b.c(Thread.currentThread(), "CoupangAdapter loadInterstitial");
            ((a0)d00.e().a().get(v)).a("CoupangAffiliateId");
            ((a0)d00.e().a().get(v)).a("CoupangSubId");
            String s = ((a0)d00.e().a().get(v)).a("CoupangWidgetId");
            if(this.j == null) {
                this.j = new a();
            }
            if(this.h == null) {
                AdsViewModel adsViewModel0 = new AdsViewModel(new AdsRequest(s, J.b.k, d.a, "", "", ""));
                this.h = adsViewModel0;
                adsViewModel0.observeJava(((LifecycleOwner)context0), new Observer() {
                    final CoupangAdapter b;

                    public void a(M.a a0) {
                        if(a0.e()) {
                            b.a(Thread.currentThread(), "CoupangAdapter interstitial onAdLoaded");
                            if(CoupangAdapter.this.b != null) {
                                try {
                                    CoupangAdapter.this.b.b(v);
                                }
                                catch(Exception exception0) {
                                    b.a(Thread.currentThread(), exception0);
                                    if(CoupangAdapter.this.b != null) {
                                        CoupangAdapter.this.b.d(v);
                                    }
                                }
                            }
                        }
                        else {
                            try {
                                b.a(Thread.currentThread(), "CoupangAdapter failed to load in : " + a0.a());
                                if(CoupangAdapter.this.b != null) {
                                    CoupangAdapter.this.b.d(v);
                                }
                            }
                            catch(Exception exception1) {
                                b.a(Thread.currentThread(), exception1);
                            }
                        }
                    }

                    @Override  // androidx.lifecycle.Observer
                    public void onChanged(Object object0) {
                        this.a(((M.a)object0));
                    }
                });
                this.j.d(new com.coupang.ads.interstitial.b() {
                    final CoupangAdapter b;

                    @Override  // com.coupang.ads.interstitial.b
                    public void onAdDismissed() {
                        b.a(Thread.currentThread(), "CoupangAdapter interstitial onAdDismissed");
                        if(CoupangAdapter.this.b != null) {
                            CoupangAdapter.this.b.e(0);
                        }
                    }

                    @Override  // com.coupang.ads.interstitial.b
                    public void onAdFailedToShow(com.coupang.ads.b b0) {
                        b.a(Thread.currentThread(), "CoupangAdapter interstitial onAdFailedToShow : " + b0.a());
                        if(CoupangAdapter.this.b != null) {
                            CoupangAdapter.this.b.c(v);
                        }
                    }

                    @Override  // com.coupang.ads.interstitial.b
                    public void onAdShowed() {
                        b.a(Thread.currentThread(), "CoupangAdapter interstitial onAdShowed");
                        if(CoupangAdapter.this.b != null) {
                            CoupangAdapter.this.b.a(v);
                        }
                    }

                    @Override  // com.coupang.ads.interstitial.b
                    public boolean onClick(f f0) {
                        b.a(Thread.currentThread(), "CoupangAdapter interstitial onClick");
                        if(CoupangAdapter.this.b != null) {
                            CoupangAdapter.this.b.a();
                        }
                        return false;
                    }
                });
                this.j.m(this.h);
            }
            this.h.loadAdData();
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
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadReactNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0) {
        g0 g00 = this.d;
        if(g00 != null) {
            g00.a(v, 2);
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
        this.e = b00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setNativeMediationAdapterEventListener(c0 c00) {
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
        try {
            b.a(Thread.currentThread(), "CoupangAdapter showInterstitial : " + context0.getClass());
            if(this.j != null && this.j.C()) {
                this.j.X(context0);
                return;
            }
            T t0 = this.b;
            if(t0 != null) {
                t0.c(v);
            }
        }
        catch(Exception unused_ex) {
            T t1 = this.b;
            if(t1 != null) {
                t1.c(v);
            }
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
        J.b b1;
        try {
            if(!this.checkMinimumTargetAPI()) {
                C c0 = this.a;
                if(c0 != null) {
                    c0.a(v);
                    return;
                }
                return;
            }
            this.f = true;
            this.n = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.l == null) {
                    this.l = new Handler();
                }
                if(this.m == null) {
                    this.m = new Runnable() {
                        final CoupangAdapter a;

                        @Override
                        public void run() {
                            if(CoupangAdapter.this.f) {
                                b.b(Thread.currentThread(), "Time out in : COUPANG");
                                if(CoupangAdapter.this.a != null) {
                                    CoupangAdapter.this.a.a(CoupangAdapter.this.n);
                                }
                            }
                        }
                    };
                }
                this.l.postDelayed(this.m, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            b.a(Thread.currentThread(), "CoupangAdapter.startBannerAd()");
            ((a0)d00.e().a().get(v)).a("CoupangAffiliateId");
            ((a0)d00.e().a().get(v)).a("CoupangSubId");
            String s = ((a0)d00.e().a().get(v)).a("CoupangWidgetId");
            J.b b0 = J.b.a;
            if(this.i == null) {
                this.i = new AdsBannerView(context0);
                if(adSize0 == AdSize.BANNER_320x100) {
                    b1 = J.b.b;
                }
                else if(adSize0 != AdSize.BANNER_300x250 && adSize0 != AdSize.BANNER_ADAPTIVE_SIZE) {
                    b1 = b0;
                }
                else {
                    b1 = J.b.c;
                }
            }
            else {
                b.a(Thread.currentThread(), "already exist Coupang AdsBannerView");
                b1 = b0;
            }
            if(this.g == null) {
                this.g = new AdsViewModel(new AdsRequest(s, b1, d.a, null, null, null));
            }
            this.g.observeJava(((LifecycleOwner)context0), new Observer() {
                final CoupangAdapter c;

                public void a(M.a a0) {
                    if(a0.e()) {
                        b.a(Thread.currentThread(), "CoupangAdapter banner onAdLoaded");
                        try {
                            adPopcornSSPBannerAd0.removeAllViewsInLayout();
                            adPopcornSSPBannerAd0.removeAllViews();
                            adPopcornSSPBannerAd0.addView(CoupangAdapter.this.i);
                            CoupangAdapter.this.i.c(((LifecycleOwner)context0), CoupangAdapter.this.g);
                            CoupangAdapter.this.stopBannerTimer();
                            if(CoupangAdapter.this.a != null) {
                                CoupangAdapter.this.a.b(CoupangAdapter.this.n);
                            }
                            if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                    final com.igaworks.ssp.common.adapter.CoupangAdapter.3 a;

                                    @Override
                                    public void run() {
                                        AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                        try {
                                            try {
                                                com.igaworks.ssp.common.adapter.CoupangAdapter.3.this.a.setVisibility(4);
                                                CoupangAdapter.this.i.buildDrawingCache();
                                                Bitmap bitmap0 = CoupangAdapter.this.i.getDrawingCache();
                                                if(bitmap0 != null) {
                                                    int v = bitmap0.getPixel(1, 1);
                                                    com.igaworks.ssp.common.adapter.CoupangAdapter.3.this.a.setBackgroundColor(v);
                                                }
                                                goto label_18;
                                            }
                                            catch(Exception exception0) {
                                            }
                                            b.a(Thread.currentThread(), exception0);
                                            adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.CoupangAdapter.3.this.a;
                                            if(adPopcornSSPBannerAd0 != null) {
                                                goto label_11;
                                            }
                                            return;
                                        }
                                        catch(Throwable throwable0) {
                                            goto label_14;
                                        }
                                    label_11:
                                        adPopcornSSPBannerAd0.setVisibility(0);
                                        return;
                                    label_14:
                                        AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.CoupangAdapter.3.this.a;
                                        if(adPopcornSSPBannerAd1 != null) {
                                            adPopcornSSPBannerAd1.setVisibility(0);
                                        }
                                        throw throwable0;
                                    label_18:
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.CoupangAdapter.3.this.a;
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
                        CoupangAdapter.this.stopBannerTimer();
                        if(CoupangAdapter.this.a != null) {
                            CoupangAdapter.this.a.a(CoupangAdapter.this.n);
                        }
                    }
                    else {
                        try {
                            b.a(Thread.currentThread(), "CoupangAdapter failed to load in : " + a0.a());
                            CoupangAdapter.this.stopBannerTimer();
                            if(CoupangAdapter.this.a != null) {
                                CoupangAdapter.this.a.a(CoupangAdapter.this.n);
                            }
                        }
                        catch(Exception exception1) {
                            b.a(Thread.currentThread(), exception1);
                        }
                    }
                }

                @Override  // androidx.lifecycle.Observer
                public void onChanged(Object object0) {
                    this.a(((M.a)object0));
                }
            });
            this.g.loadAdData();
        }
        catch(Exception exception0) {
            this.f = false;
            C c1 = this.a;
            if(c1 != null) {
                c1.a(this.n);
            }
            b.a(Thread.currentThread(), exception0);
        }
    }

    public void stopBannerTimer() {
        try {
            this.f = false;
            Handler handler0 = this.l;
            if(handler0 != null) {
                handler0.removeCallbacks(this.m);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

