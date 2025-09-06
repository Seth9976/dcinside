package com.igaworks.ssp.common.adapter;

import J.d;
import J.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.coupang.ads.custom.AdsNativeView;
import com.coupang.ads.custom.AdsPlacementLayout.Builder;
import com.coupang.ads.custom.widget.AdsProductStarRating;
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

public class CoupangCPMAdapter implements BaseMediationAdapter {
    private C a;
    private T b;
    private r0 c;
    private g0 d;
    private b0 e;
    private c0 f;
    private boolean g;
    private AdsViewModel h;
    private AdsViewModel i;
    private AdsViewModel j;
    private AdsBannerView k;
    private a l;
    private L.a m;
    private Handler n;
    private Runnable o;
    private Context p;
    private int q;
    private int r;
    private AdsNativeView s;
    private AdPopcornSSPNativeAd t;

    public CoupangCPMAdapter() {
        this.g = true;
        this.n = new Handler(Looper.getMainLooper());
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
        b.a(Thread.currentThread(), "CoupangCPMAdapter checkMinimumTargetAPI false");
        return false;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkValidMediation() {
        this.m = new L.a() {
            final CoupangCPMAdapter a;

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
        b.a(Thread.currentThread(), "CoupangCPMAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            b.a(Thread.currentThread(), "CoupangCPMAdapter.destroyBannerAd");
            if(this.k != null) {
                this.k = null;
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
        b.a(Thread.currentThread(), "CoupangCPMAdapter initializeSDK");
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        try {
            b.a(Thread.currentThread(), "CoupangCPMAdapter.internalStopBannerAd");
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
            b.c(Thread.currentThread(), "CoupangCPMAdapter loadInterstitial");
            ((a0)d00.e().a().get(v)).a("CoupangAffiliateId");
            ((a0)d00.e().a().get(v)).a("CoupangSubId");
            String s = ((a0)d00.e().a().get(v)).a("CoupangWidgetId");
            if(this.l == null) {
                this.l = new a();
            }
            if(this.i == null) {
                AdsViewModel adsViewModel0 = new AdsViewModel(new AdsRequest(s, J.b.k, d.a, "", "", ""));
                this.i = adsViewModel0;
                adsViewModel0.observeJava(((LifecycleOwner)context0), new Observer() {
                    final CoupangCPMAdapter b;

                    public void a(M.a a0) {
                        if(a0.e()) {
                            b.a(Thread.currentThread(), "CoupangCPMAdapter interstitial onAdLoaded");
                            if(CoupangCPMAdapter.this.b != null) {
                                try {
                                    CoupangCPMAdapter.this.b.b(v);
                                }
                                catch(Exception exception0) {
                                    b.a(Thread.currentThread(), exception0);
                                    if(CoupangCPMAdapter.this.b != null) {
                                        CoupangCPMAdapter.this.b.d(v);
                                    }
                                }
                            }
                        }
                        else {
                            try {
                                b.a(Thread.currentThread(), "CoupangCPMAdapter failed to load in : " + a0.a());
                                if(CoupangCPMAdapter.this.b != null) {
                                    CoupangCPMAdapter.this.b.d(v);
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
                this.l.d(new com.coupang.ads.interstitial.b() {
                    final CoupangCPMAdapter b;

                    @Override  // com.coupang.ads.interstitial.b
                    public void onAdDismissed() {
                        b.a(Thread.currentThread(), "CoupangCPMAdapter interstitial onAdDismissed");
                        if(CoupangCPMAdapter.this.b != null) {
                            CoupangCPMAdapter.this.b.e(0);
                        }
                    }

                    @Override  // com.coupang.ads.interstitial.b
                    public void onAdFailedToShow(com.coupang.ads.b b0) {
                        b.a(Thread.currentThread(), "CoupangCPMAdapter interstitial onAdFailedToShow : " + b0.a());
                        if(CoupangCPMAdapter.this.b != null) {
                            CoupangCPMAdapter.this.b.c(v);
                        }
                    }

                    @Override  // com.coupang.ads.interstitial.b
                    public void onAdShowed() {
                        b.a(Thread.currentThread(), "CoupangCPMAdapter interstitial onAdShowed");
                        if(CoupangCPMAdapter.this.b != null) {
                            CoupangCPMAdapter.this.b.a(v);
                        }
                    }

                    @Override  // com.coupang.ads.interstitial.b
                    public boolean onClick(f f0) {
                        b.a(Thread.currentThread(), "CoupangCPMAdapter interstitial onClick");
                        if(CoupangCPMAdapter.this.b != null) {
                            CoupangCPMAdapter.this.b.a();
                        }
                        return false;
                    }
                });
                this.l.m(this.i);
            }
            this.i.loadAdData();
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
        b.a(Thread.currentThread(), "CoupangCPMAdapter.loadNativeAd()");
        this.p = context0;
        this.r = v;
        this.t = adPopcornSSPNativeAd0;
        try {
            if(!this.checkMinimumTargetAPI()) {
                c0 c00 = this.f;
                if(c00 != null) {
                    c00.a(v, 4);
                    return;
                }
                return;
            }
            if(adPopcornSSPNativeAd0.getCoupangViewBinder() != null && adPopcornSSPNativeAd0.getCoupangViewBinder().nativeAdViewId != 0) {
                this.s = (AdsNativeView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getCoupangViewBinder().nativeAdViewId);
                this.r = v;
                ((a0)d00.e().a().get(v)).a("CoupangAffiliateId");
                ((a0)d00.e().a().get(v)).a("CoupangSubId");
                String s = ((a0)d00.e().a().get(v)).a("CoupangWidgetId");
                if(this.j == null) {
                    AdsViewModel adsViewModel0 = new AdsViewModel(new AdsRequest(s, J.b.l, d.a, "", "", ""));
                    this.j = adsViewModel0;
                    adsViewModel0.observeJava(((LifecycleOwner)context0), new Observer() {
                        final CoupangCPMAdapter a;

                        public void a(M.a a0) {
                            if(a0.e()) {
                                b.a(Thread.currentThread(), "CoupangCPMAdapter native onChanged success");
                                if(CoupangCPMAdapter.this.f != null) {
                                    try {
                                        CoupangCPMAdapter.this.f.a(CoupangCPMAdapter.this.r);
                                    }
                                    catch(Exception exception0) {
                                        b.a(Thread.currentThread(), exception0);
                                        if(CoupangCPMAdapter.this.f != null) {
                                            CoupangCPMAdapter.this.f.a(CoupangCPMAdapter.this.r, 2);
                                        }
                                    }
                                }
                            }
                            else {
                                try {
                                    b.a(Thread.currentThread(), "CoupangCPMAdapter native onChanged failed to load in : " + a0.a());
                                    if(CoupangCPMAdapter.this.f != null) {
                                        CoupangCPMAdapter.this.f.a(CoupangCPMAdapter.this.r, 2);
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
                }
                this.s.setAdsListener(new L.a() {
                    final CoupangCPMAdapter a;

                    @Override  // L.a
                    public void onAdClicked() {
                        b.a(Thread.currentThread(), "CoupangCPMAdapter native onAdClicked");
                        if(CoupangCPMAdapter.this.f != null) {
                            CoupangCPMAdapter.this.f.onClicked();
                        }
                    }

                    @Override  // L.a
                    public void onAdFailedToLoad(String s) {
                        b.a(Thread.currentThread(), "CoupangCPMAdapter native onAdFailedToLoad");
                    }

                    @Override  // L.a
                    public void onAdLoaded() {
                        b.a(Thread.currentThread(), "CoupangCPMAdapter native onAdLoaded");
                    }
                });
                this.j.loadAdData();
                TextView textView0 = null;
                ImageView imageView0 = adPopcornSSPNativeAd0.getCoupangViewBinder().logoViewId == 0 ? null : ((ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getCoupangViewBinder().logoViewId));
                ImageView imageView1 = adPopcornSSPNativeAd0.getCoupangViewBinder().optOutViewId == 0 ? null : ((ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getCoupangViewBinder().optOutViewId));
                ImageView imageView2 = adPopcornSSPNativeAd0.getCoupangViewBinder().mainImageViewId == 0 ? null : ((ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getCoupangViewBinder().mainImageViewId));
                TextView textView1 = adPopcornSSPNativeAd0.getCoupangViewBinder().titleViewId == 0 ? null : ((TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getCoupangViewBinder().titleViewId));
                ImageView imageView3 = adPopcornSSPNativeAd0.getCoupangViewBinder().deliverViewId == 0 ? null : ((ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getCoupangViewBinder().deliverViewId));
                AdsProductStarRating adsProductStarRating0 = adPopcornSSPNativeAd0.getCoupangViewBinder().ratingViewId == 0 ? null : ((AdsProductStarRating)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getCoupangViewBinder().ratingViewId));
                View view0 = adPopcornSSPNativeAd0.getCoupangViewBinder().callToActionViewId == 0 ? null : adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getCoupangViewBinder().callToActionViewId);
                if(adPopcornSSPNativeAd0.getCoupangViewBinder().priceViewId != 0) {
                    textView0 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getCoupangViewBinder().priceViewId);
                }
                this.s.setAdsPlacementLayout(new Builder().setLogoView(imageView0).setAdsInfoView(imageView1).setProductLayout(new com.coupang.ads.custom.AdsProductLayout.Builder().setTitleView(textView1).setMainImageView(imageView2).setRocketBadgeView(imageView3).setPriceView(textView0).setRatingView(adsProductStarRating0).setCallToActionView(view0).build()).build());
                this.s.bindViewModel(((LifecycleOwner)context0), this.j);
                return;
            }
            b.a(Thread.currentThread(), "CoupangCPMAdapter viewBinder or nativeAdViewId is null");
            c0 c01 = this.f;
            if(c01 != null) {
                c01.a(this.r, 3);
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        c0 c02 = this.f;
        if(c02 != null) {
            c02.a(this.r, 0);
        }
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
        this.f = c00;
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
            b.a(Thread.currentThread(), "CoupangCPMAdapter showInterstitial : " + context0.getClass());
            if(this.l != null && this.l.C()) {
                this.l.X(context0);
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
            this.g = true;
            this.q = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.n == null) {
                    this.n = new Handler();
                }
                if(this.o == null) {
                    this.o = new Runnable() {
                        final CoupangCPMAdapter a;

                        @Override
                        public void run() {
                            if(CoupangCPMAdapter.this.g) {
                                b.b(Thread.currentThread(), "Time out in : COUPANG_CPM");
                                if(CoupangCPMAdapter.this.a != null) {
                                    CoupangCPMAdapter.this.a.a(CoupangCPMAdapter.this.q);
                                }
                            }
                        }
                    };
                }
                this.n.postDelayed(this.o, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            b.a(Thread.currentThread(), "CoupangCPMAdapter.startBannerAd()");
            ((a0)d00.e().a().get(v)).a("CoupangAffiliateId");
            ((a0)d00.e().a().get(v)).a("CoupangSubId");
            String s = ((a0)d00.e().a().get(v)).a("CoupangWidgetId");
            J.b b0 = J.b.a;
            if(this.k == null) {
                this.k = new AdsBannerView(context0);
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
            if(this.h == null) {
                this.h = new AdsViewModel(new AdsRequest(s, b1, d.a, null, null, null));
            }
            this.h.observeJava(((LifecycleOwner)context0), new Observer() {
                final CoupangCPMAdapter c;

                public void a(M.a a0) {
                    if(a0.e()) {
                        b.a(Thread.currentThread(), "CoupangCPMAdapter banner onAdLoaded");
                        try {
                            adPopcornSSPBannerAd0.removeAllViewsInLayout();
                            adPopcornSSPBannerAd0.removeAllViews();
                            adPopcornSSPBannerAd0.addView(CoupangCPMAdapter.this.k);
                            CoupangCPMAdapter.this.k.c(((LifecycleOwner)context0), CoupangCPMAdapter.this.h);
                            CoupangCPMAdapter.this.stopBannerTimer();
                            if(CoupangCPMAdapter.this.a != null) {
                                CoupangCPMAdapter.this.a.b(CoupangCPMAdapter.this.q);
                            }
                            if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                    final com.igaworks.ssp.common.adapter.CoupangCPMAdapter.3 a;

                                    @Override
                                    public void run() {
                                        AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                        try {
                                            try {
                                                com.igaworks.ssp.common.adapter.CoupangCPMAdapter.3.this.a.setVisibility(4);
                                                CoupangCPMAdapter.this.k.buildDrawingCache();
                                                Bitmap bitmap0 = CoupangCPMAdapter.this.k.getDrawingCache();
                                                if(bitmap0 != null) {
                                                    int v = bitmap0.getPixel(1, 1);
                                                    com.igaworks.ssp.common.adapter.CoupangCPMAdapter.3.this.a.setBackgroundColor(v);
                                                }
                                                goto label_18;
                                            }
                                            catch(Exception exception0) {
                                            }
                                            b.a(Thread.currentThread(), exception0);
                                            adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.CoupangCPMAdapter.3.this.a;
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
                                        AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.CoupangCPMAdapter.3.this.a;
                                        if(adPopcornSSPBannerAd1 != null) {
                                            adPopcornSSPBannerAd1.setVisibility(0);
                                        }
                                        throw throwable0;
                                    label_18:
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.CoupangCPMAdapter.3.this.a;
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
                        CoupangCPMAdapter.this.stopBannerTimer();
                        if(CoupangCPMAdapter.this.a != null) {
                            CoupangCPMAdapter.this.a.a(CoupangCPMAdapter.this.q);
                        }
                    }
                    else {
                        try {
                            b.a(Thread.currentThread(), "CoupangCPMAdapter failed to load in : " + a0.a());
                            CoupangCPMAdapter.this.stopBannerTimer();
                            if(CoupangCPMAdapter.this.a != null) {
                                CoupangCPMAdapter.this.a.a(CoupangCPMAdapter.this.q);
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
            this.h.loadAdData();
            this.k.setAdsListener(new L.a() {
                final CoupangCPMAdapter a;

                @Override  // L.a
                public void onAdClicked() {
                    if(CoupangCPMAdapter.this.a != null) {
                        CoupangCPMAdapter.this.a.a();
                    }
                }

                @Override  // L.a
                public void onAdFailedToLoad(String s) {
                }

                @Override  // L.a
                public void onAdLoaded() {
                }
            });
        }
        catch(Exception exception0) {
            this.g = false;
            C c1 = this.a;
            if(c1 != null) {
                c1.a(this.q);
            }
            b.a(Thread.currentThread(), exception0);
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

