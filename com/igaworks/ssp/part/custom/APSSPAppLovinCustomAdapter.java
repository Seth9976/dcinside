package com.igaworks.ssp.part.custom;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter.InitializationStatus;
import com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd.Builder;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdk;
import com.igaworks.ssp.AdPopcornSSP;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.SdkInitListener;
import com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd;
import com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener;
import com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd;
import com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener;
import com.igaworks.ssp.part.nativead.AdPopcornSSPNativeAd;
import com.igaworks.ssp.part.nativead.binder.AdFitViewBinder;
import com.igaworks.ssp.part.nativead.binder.AdPopcornSSPViewBinder.Builder;
import com.igaworks.ssp.part.nativead.binder.AdPopcornSSPViewBinder;
import com.igaworks.ssp.part.nativead.binder.NAMViewBinder;
import com.igaworks.ssp.part.nativead.listener.INativeAdEventCallbackListener;
import com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd;
import com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener;
import java.util.List;

public class APSSPAppLovinCustomAdapter extends MediationAdapterBase implements MaxAdViewAdapter, MaxInterstitialAdapter, MaxRewardedAdapter {
    class b implements IBannerEventCallbackListener {
        final APSSPAppLovinCustomAdapter a;

        @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
        public void OnBannerAdClicked() {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnBannerAdClicked");
            APSSPAppLovinCustomAdapter.this.log("OnBannerAdClicked");
            if(APSSPAppLovinCustomAdapter.this.e != null) {
                APSSPAppLovinCustomAdapter.this.e.onAdViewAdClicked();
            }
        }

        @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
        public void OnBannerAdReceiveFailed(SSPErrorCode sSPErrorCode0) {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnBannerAdReceiveFailed");
            APSSPAppLovinCustomAdapter.this.log("OnBannerAdReceiveFailed : " + sSPErrorCode0.getErrorCode() + ", " + sSPErrorCode0.getErrorMessage());
            if(APSSPAppLovinCustomAdapter.this.e != null) {
                MaxAdapterError maxAdapterError0 = APSSPAppLovinCustomAdapter.b(sSPErrorCode0);
                APSSPAppLovinCustomAdapter.this.e.onAdViewAdLoadFailed(maxAdapterError0);
            }
        }

        @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
        public void OnBannerAdReceiveSuccess() {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnBannerAdReceiveSuccess");
            APSSPAppLovinCustomAdapter.this.log("OnBannerAdReceiveSuccess");
            if(APSSPAppLovinCustomAdapter.this.e != null) {
                AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = APSSPAppLovinCustomAdapter.this.a;
                APSSPAppLovinCustomAdapter.this.e.onAdViewAdLoaded(adPopcornSSPBannerAd0);
            }
        }
    }

    class c implements IInterstitialEventCallbackListener {
        final APSSPAppLovinCustomAdapter a;

        @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
        public void OnInterstitialClicked() {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnInterstitialClicked");
            APSSPAppLovinCustomAdapter.this.log("OnInterstitialClicked");
            if(APSSPAppLovinCustomAdapter.this.f != null) {
                APSSPAppLovinCustomAdapter.this.f.onInterstitialAdClicked();
            }
        }

        @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
        public void OnInterstitialClosed(int v) {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnInterstitialClosed");
            APSSPAppLovinCustomAdapter.this.log("OnInterstitialClosed");
            if(APSSPAppLovinCustomAdapter.this.f != null) {
                APSSPAppLovinCustomAdapter.this.f.onInterstitialAdHidden();
            }
        }

        @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
        public void OnInterstitialLoaded() {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnInterstitialLoaded");
            APSSPAppLovinCustomAdapter.this.log("OnInterstitialLoaded");
            if(APSSPAppLovinCustomAdapter.this.f != null) {
                APSSPAppLovinCustomAdapter.this.f.onInterstitialAdLoaded();
            }
        }

        @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
        public void OnInterstitialOpenFailed(SSPErrorCode sSPErrorCode0) {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnInterstitialOpenFailed");
            APSSPAppLovinCustomAdapter.this.log("OnInterstitialOpenFailed");
            if(APSSPAppLovinCustomAdapter.this.f != null) {
                MaxAdapterError maxAdapterError0 = APSSPAppLovinCustomAdapter.b(sSPErrorCode0);
                APSSPAppLovinCustomAdapter.this.f.onInterstitialAdDisplayFailed(maxAdapterError0);
            }
        }

        @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
        public void OnInterstitialOpened() {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnInterstitialOpened");
            APSSPAppLovinCustomAdapter.this.log("OnInterstitialOpened");
            if(APSSPAppLovinCustomAdapter.this.f != null) {
                APSSPAppLovinCustomAdapter.this.f.onInterstitialAdDisplayed();
            }
        }

        @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
        public void OnInterstitialReceiveFailed(SSPErrorCode sSPErrorCode0) {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnInterstitialReceiveFailed");
            APSSPAppLovinCustomAdapter.this.log("OnInterstitialReceiveFailed : " + sSPErrorCode0.getErrorCode() + ", " + sSPErrorCode0.getErrorMessage());
            if(APSSPAppLovinCustomAdapter.this.f != null) {
                MaxAdapterError maxAdapterError0 = APSSPAppLovinCustomAdapter.b(sSPErrorCode0);
                APSSPAppLovinCustomAdapter.this.f.onInterstitialAdLoadFailed(maxAdapterError0);
            }
        }
    }

    class d implements IRewardVideoAdEventCallbackListener {
        final APSSPAppLovinCustomAdapter a;

        @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
        public void OnRewardPlusCompleted(boolean z, int v, int v1) {
        }

        @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
        public void OnRewardVideoAdClicked() {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnRewardVideoAdClicked");
            APSSPAppLovinCustomAdapter.this.log("OnRewardVideoAdClicked");
            if(APSSPAppLovinCustomAdapter.this.g != null) {
                APSSPAppLovinCustomAdapter.this.g.onRewardedAdClicked();
            }
        }

        @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
        public void OnRewardVideoAdClosed() {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnRewardVideoAdClosed");
            APSSPAppLovinCustomAdapter.this.log("OnRewardVideoAdClosed");
            if(APSSPAppLovinCustomAdapter.this.g != null) {
                APSSPAppLovinCustomAdapter.this.g.onRewardedAdHidden();
            }
        }

        @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
        public void OnRewardVideoAdLoadFailed(SSPErrorCode sSPErrorCode0) {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnRewardVideoAdLoadFailed");
            APSSPAppLovinCustomAdapter.this.log("OnRewardVideoAdLoadFailed : " + sSPErrorCode0.getErrorCode() + ", " + sSPErrorCode0.getErrorMessage());
            if(APSSPAppLovinCustomAdapter.this.g != null) {
                MaxAdapterError maxAdapterError0 = APSSPAppLovinCustomAdapter.b(sSPErrorCode0);
                APSSPAppLovinCustomAdapter.this.g.onRewardedAdLoadFailed(maxAdapterError0);
            }
        }

        @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
        public void OnRewardVideoAdLoaded() {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnRewardVideoAdLoaded");
            APSSPAppLovinCustomAdapter.this.log("OnRewardVideoAdLoaded");
            if(APSSPAppLovinCustomAdapter.this.g != null) {
                APSSPAppLovinCustomAdapter.this.g.onRewardedAdLoaded();
            }
        }

        @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
        public void OnRewardVideoAdOpenFalied() {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnRewardVideoAdOpenFalied");
            APSSPAppLovinCustomAdapter.this.log("OnRewardVideoAdOpenFalied");
            if(APSSPAppLovinCustomAdapter.this.g != null) {
                MaxAdapterError maxAdapterError0 = APSSPAppLovinCustomAdapter.b(new SSPErrorCode(5005));
                APSSPAppLovinCustomAdapter.this.g.onRewardedAdDisplayFailed(maxAdapterError0);
            }
        }

        @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
        public void OnRewardVideoAdOpened() {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnRewardVideoAdOpened");
            APSSPAppLovinCustomAdapter.this.log("OnRewardVideoAdOpened");
            if(APSSPAppLovinCustomAdapter.this.g != null) {
                APSSPAppLovinCustomAdapter.this.g.onRewardedAdDisplayed();
            }
        }

        @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
        public void OnRewardVideoPlayCompleted(int v, boolean z) {
            class a implements MaxReward {
                final d a;

                public int getAmount() {
                    return 0;
                }

                public String getLabel() {
                    return null;
                }
            }

            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter OnRewardVideoPlayCompleted");
            APSSPAppLovinCustomAdapter.this.log("OnRewardVideoPlayCompleted : " + v + ", isCompleted : " + z);
            if(z && APSSPAppLovinCustomAdapter.this.g != null) {
                a aPSSPAppLovinCustomAdapter$d$a0 = new a(this);
                APSSPAppLovinCustomAdapter.this.g.onUserRewarded(aPSSPAppLovinCustomAdapter$d$a0);
            }
        }
    }

    class e implements INativeAdEventCallbackListener {
        final APSSPAppLovinCustomAdapter a;

        @Override  // com.igaworks.ssp.part.nativead.listener.INativeAdEventCallbackListener
        public void onAdHidden() {
        }

        @Override  // com.igaworks.ssp.part.nativead.listener.INativeAdEventCallbackListener
        public void onClicked() {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter native onClicked");
            APSSPAppLovinCustomAdapter.this.log("nativeAd onClicked");
            if(APSSPAppLovinCustomAdapter.this.h != null) {
                APSSPAppLovinCustomAdapter.this.h.onNativeAdClicked();
            }
        }

        @Override  // com.igaworks.ssp.part.nativead.listener.INativeAdEventCallbackListener
        public void onImpression() {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter native onImpression");
            APSSPAppLovinCustomAdapter.this.log("nativeAd onImpression");
            if(APSSPAppLovinCustomAdapter.this.h != null) {
                APSSPAppLovinCustomAdapter.this.h.onNativeAdDisplayed(null);
            }
        }

        @Override  // com.igaworks.ssp.part.nativead.listener.INativeAdEventCallbackListener
        public void onNativeAdLoadFailed(SSPErrorCode sSPErrorCode0) {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter onNativeAdLoadFailed");
            APSSPAppLovinCustomAdapter.this.log("onNativeAdLoadFailed : " + sSPErrorCode0.getErrorCode() + ", " + sSPErrorCode0.getErrorMessage());
            if(APSSPAppLovinCustomAdapter.this.h != null) {
                MaxAdapterError maxAdapterError0 = APSSPAppLovinCustomAdapter.b(sSPErrorCode0);
                APSSPAppLovinCustomAdapter.this.h.onNativeAdLoadFailed(maxAdapterError0);
            }
        }

        @Override  // com.igaworks.ssp.part.nativead.listener.INativeAdEventCallbackListener
        public void onNativeAdLoadSuccess() {
            class com.igaworks.ssp.part.custom.APSSPAppLovinCustomAdapter.e.a implements Runnable {
                final MaxNativeAd a;
                final e b;

                com.igaworks.ssp.part.custom.APSSPAppLovinCustomAdapter.e.a(MaxNativeAd maxNativeAd0) {
                    this.a = maxNativeAd0;
                    super();
                }

                @Override
                public void run() {
                    if(APSSPAppLovinCustomAdapter.this.h != null) {
                        APSSPAppLovinCustomAdapter.this.h.onNativeAdLoaded(this.a, null);
                    }
                }
            }

            com.igaworks.ssp.b.c(Thread.currentThread(), "onNativeAdLoadSuccess");
            switch((APSSPAppLovinCustomAdapter.this.d == null ? -1 : APSSPAppLovinCustomAdapter.this.d.getCurrentNetwork())) {
                case 10: {
                    APSSPAppLovinCustomAdapter.this.log("Adfit onNativeAdLoadSuccess");
                    break;
                }
                case 22: {
                    APSSPAppLovinCustomAdapter.this.log("NAM onNativeAdLoadSuccess");
                    break;
                }
                default: {
                    APSSPAppLovinCustomAdapter.this.log("AdPopcornSSP onNativeAdLoadSuccess");
                }
            }
            MaxNativeAd.Builder maxNativeAd$Builder0 = new MaxNativeAd.Builder();
            f aPSSPAppLovinCustomAdapter$f0 = new f(APSSPAppLovinCustomAdapter.this, maxNativeAd$Builder0);
            new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.custom.APSSPAppLovinCustomAdapter.e.a(this, aPSSPAppLovinCustomAdapter$f0));
        }
    }

    class f extends MaxNativeAd {
        final APSSPAppLovinCustomAdapter a;

        public f(MaxNativeAd.Builder maxNativeAd$Builder0) {
            super(maxNativeAd$Builder0);
        }

        public boolean prepareForInteraction(List list0, ViewGroup viewGroup0) {
            com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter prepareForInteraction");
            AdPopcornSSPNativeAd adPopcornSSPNativeAd0 = APSSPAppLovinCustomAdapter.this.d;
            if(adPopcornSSPNativeAd0 == null) {
                return true;
            }
            viewGroup0.addView(adPopcornSSPNativeAd0);
            return super.prepareForInteraction(list0, viewGroup0);
        }
    }

    private AdPopcornSSPBannerAd a;
    private AdPopcornSSPInterstitialAd b;
    private AdPopcornSSPRewardVideoAd c;
    private AdPopcornSSPNativeAd d;
    private MaxAdViewAdapterListener e;
    private MaxInterstitialAdapterListener f;
    private MaxRewardedAdapterListener g;
    private MaxNativeAdAdapterListener h;
    IBannerEventCallbackListener i;
    IInterstitialEventCallbackListener j;
    IRewardVideoAdEventCallbackListener k;
    INativeAdEventCallbackListener l;

    public APSSPAppLovinCustomAdapter(AppLovinSdk appLovinSdk0) {
        super(appLovinSdk0);
        this.i = new b(this);
        this.j = new c(this);
        this.k = new d(this);
        this.l = new e(this);
    }

    private int a(Context context0, String s, String s1) {
        try {
            return context0.getResources().getIdentifier(s1, s, "com.dcinside.app.android");
        }
        catch(Exception unused_ex) {
            return 0;
        }
    }

    private static MaxAdapterError b(SSPErrorCode sSPErrorCode0) {
        int v = sSPErrorCode0.getErrorCode();
        MaxAdapterError maxAdapterError0 = MaxAdapterError.UNSPECIFIED;
        switch(v) {
            case 1000: 
            case 2000: 
            case 2030: {
                maxAdapterError0 = MaxAdapterError.INVALID_CONFIGURATION;
                return new MaxAdapterError(maxAdapterError0.getErrorCode(), maxAdapterError0.getErrorMessage(), v, sSPErrorCode0.getErrorMessage());
            }
            case 3300: {
                maxAdapterError0 = MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS;
                return new MaxAdapterError(maxAdapterError0.getErrorCode(), maxAdapterError0.getErrorMessage(), 3300, sSPErrorCode0.getErrorMessage());
            }
            case 5000: {
                maxAdapterError0 = MaxAdapterError.NO_CONNECTION;
                return new MaxAdapterError(maxAdapterError0.getErrorCode(), maxAdapterError0.getErrorMessage(), 5000, sSPErrorCode0.getErrorMessage());
            }
            case 5002: {
                maxAdapterError0 = MaxAdapterError.NO_FILL;
                return new MaxAdapterError(maxAdapterError0.getErrorCode(), maxAdapterError0.getErrorMessage(), 5002, sSPErrorCode0.getErrorMessage());
            }
            case 5003: 
            case 5005: 
            case 5009: {
                maxAdapterError0 = MaxAdapterError.AD_DISPLAY_FAILED;
                return new MaxAdapterError(maxAdapterError0.getErrorCode(), maxAdapterError0.getErrorMessage(), v, sSPErrorCode0.getErrorMessage());
            }
            case 200: 
            case 0x270F: {
                maxAdapterError0 = MaxAdapterError.INTERNAL_ERROR;
                return new MaxAdapterError(maxAdapterError0.getErrorCode(), maxAdapterError0.getErrorMessage(), v, sSPErrorCode0.getErrorMessage());
            }
            default: {
                return new MaxAdapterError(maxAdapterError0.getErrorCode(), maxAdapterError0.getErrorMessage(), v, sSPErrorCode0.getErrorMessage());
            }
        }
    }

    // 去混淆评级： 低(40)
    public String getAdapterVersion() {
        return "3.8.2.0";
    }

    // 去混淆评级： 低(20)
    public String getSdkVersion() {
        return "3.8.2";
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters0, Activity activity0, MaxAdapter.OnCompletionListener maxAdapter$OnCompletionListener0) {
        class com.igaworks.ssp.part.custom.APSSPAppLovinCustomAdapter.a implements SdkInitListener {
            final MaxAdapter.OnCompletionListener a;
            final APSSPAppLovinCustomAdapter b;

            com.igaworks.ssp.part.custom.APSSPAppLovinCustomAdapter.a(MaxAdapter.OnCompletionListener maxAdapter$OnCompletionListener0) {
                this.a = maxAdapter$OnCompletionListener0;
                super();
            }

            @Override  // com.igaworks.ssp.SdkInitListener
            public void onInitializationFinished() {
                this.a.onCompletion(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS, null);
            }
        }

        if(AdPopcornSSP.isInitialized(activity0)) {
            maxAdapter$OnCompletionListener0.onCompletion(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS, null);
        }
        else {
            AdPopcornSSP.init(activity0, new com.igaworks.ssp.part.custom.APSSPAppLovinCustomAdapter.a(this, maxAdapter$OnCompletionListener0));
        }
        maxAdapter$OnCompletionListener0.onCompletion(MaxAdapter.InitializationStatus.INITIALIZING, null);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters0, MaxAdFormat maxAdFormat0, Activity activity0, MaxAdViewAdapterListener maxAdViewAdapterListener0) {
        com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter loadAdViewAd");
        String s = maxAdapterResponseParameters0.getThirdPartyAdPlacementId();
        String s1 = maxAdapterResponseParameters0.getCustomParameters().getString("appKey");
        int v = maxAdapterResponseParameters0.getCustomParameters().getInt("adSize");
        this.log("loadAdViewAd appKey : " + s1 + ", placementId : " + s + ", adSize : " + v);
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = new AdPopcornSSPBannerAd(activity0);
        this.a = adPopcornSSPBannerAd0;
        adPopcornSSPBannerAd0.setPlacementAppKey(s1);
        this.a.setPlacementId(s);
        AdSize adSize0 = AdSize.BANNER_320x50;
        if(v == adSize0.getValue()) {
            this.a.setAdSize(adSize0);
        }
        else {
            AdSize adSize1 = AdSize.BANNER_300x250;
            if(v == adSize1.getValue()) {
                this.a.setAdSize(adSize1);
            }
            else {
                AdSize adSize2 = AdSize.BANNER_320x100;
                if(v == adSize2.getValue()) {
                    this.a.setAdSize(adSize2);
                }
                else {
                    this.a.setAdSize(AdSize.BANNER_ADAPTIVE_SIZE);
                }
            }
        }
        this.e = maxAdViewAdapterListener0;
        this.a.setBannerEventCallbackListener(this.i);
        this.a.loadAd();
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters0, Activity activity0, MaxInterstitialAdapterListener maxInterstitialAdapterListener0) {
        com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter loadInterstitialAd");
        String s = maxAdapterResponseParameters0.getThirdPartyAdPlacementId();
        String s1 = maxAdapterResponseParameters0.getCustomParameters().getString("appKey");
        this.log("loadInterstitialAd appKey : " + s1 + ", placementId : " + s);
        AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0 = new AdPopcornSSPInterstitialAd(activity0);
        this.b = adPopcornSSPInterstitialAd0;
        adPopcornSSPInterstitialAd0.setPlacementAppKey(s1);
        this.b.setPlacementId(s);
        this.f = maxInterstitialAdapterListener0;
        this.b.setInterstitialEventCallbackListener(this.j);
        this.b.loadAd();
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters0, Activity activity0, MaxNativeAdAdapterListener maxNativeAdAdapterListener0) {
        com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter loadNativeAd");
        String s = maxAdapterResponseParameters0.getThirdPartyAdPlacementId();
        String s1 = maxAdapterResponseParameters0.getCustomParameters().getString("appKey");
        String s2 = maxAdapterResponseParameters0.getCustomParameters().getString("apsspNativeAdLayoutId");
        String s3 = maxAdapterResponseParameters0.getCustomParameters().getString("apsspNativeAdViewId");
        String s4 = maxAdapterResponseParameters0.getCustomParameters().getString("apsspNativeAdTitleViewId");
        String s5 = maxAdapterResponseParameters0.getCustomParameters().getString("apsspNativeAdDescViewId");
        String s6 = maxAdapterResponseParameters0.getCustomParameters().getString("apsspNativeAdCtaViewId");
        String s7 = maxAdapterResponseParameters0.getCustomParameters().getString("apsspNativeAdIconViewId");
        String s8 = maxAdapterResponseParameters0.getCustomParameters().getString("apsspNativeAdMainViewId");
        String s9 = maxAdapterResponseParameters0.getCustomParameters().getString("apsspNativeAdAdFitViewId");
        String s10 = maxAdapterResponseParameters0.getCustomParameters().getString("apsspNativeAdNamViewId");
        this.log("loadNativeAd appKey : " + s1 + ", placementId : " + s);
        int v = s2 == null || s2.length() <= 0 ? this.a(activity0, "layout", "apssp_applovin_custom_adapter_nativead") : this.a(activity0, "layout", s2);
        com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter nativeAdId : " + v);
        this.log("nativeAdId : " + v);
        if(v == 0) {
            if(maxNativeAdAdapterListener0 != null) {
                maxNativeAdAdapterListener0.onNativeAdLoadFailed(APSSPAppLovinCustomAdapter.b(new SSPErrorCode(3300)));
            }
            return;
        }
        AdPopcornSSPNativeAd adPopcornSSPNativeAd0 = (AdPopcornSSPNativeAd)((LayoutInflater)activity0.getSystemService("layout_inflater")).inflate(v, null, false);
        this.d = adPopcornSSPNativeAd0;
        adPopcornSSPNativeAd0.setPlacementAppKey(s1);
        this.d.setPlacementId(s);
        this.h = maxNativeAdAdapterListener0;
        this.d.setNativeAdEventCallbackListener(this.l);
        int v1 = s3 == null || s3.length() <= 0 ? this.a(activity0, "id", "apssp_applovin_custom_adapter_nativead_apssp_view_id") : this.a(activity0, "id", s3);
        com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter apsspNativeViewId : " + v1);
        this.log("apsspNativeViewId : " + v1);
        if(v1 > 0) {
            int v2 = s4 == null || s4.length() <= 0 ? this.a(activity0, "id", "apssp_applovin_custom_adapter_nativead_apssp_title_view") : this.a(activity0, "id", s4);
            int v3 = s5 == null || s5.length() <= 0 ? this.a(activity0, "id", "apssp_applovin_custom_adapter_nativead_apssp_desc_view") : this.a(activity0, "id", s5);
            int v4 = s6 == null || s6.length() <= 0 ? this.a(activity0, "id", "apssp_applovin_custom_adapter_nativead_apssp_cta_view") : this.a(activity0, "id", s6);
            int v5 = s7 == null || s7.length() <= 0 ? this.a(activity0, "id", "apssp_applovin_custom_adapter_nativead_apssp_icon_view") : this.a(activity0, "id", s7);
            int v6 = s8 == null || s8.length() <= 0 ? this.a(activity0, "id", "apssp_applovin_custom_adapter_nativead_apssp_main_view") : this.a(activity0, "id", s8);
            AdPopcornSSPViewBinder adPopcornSSPViewBinder0 = new Builder(v1).build();
            if(v2 > 0) {
                adPopcornSSPViewBinder0.titleId = v2;
            }
            if(v2 > 0) {
                adPopcornSSPViewBinder0.descId = v3;
            }
            if(v2 > 0) {
                adPopcornSSPViewBinder0.callToActionId = v4;
            }
            if(v2 > 0) {
                adPopcornSSPViewBinder0.iconImageId = v5;
            }
            if(v2 > 0) {
                adPopcornSSPViewBinder0.mainImageId = v6;
            }
            this.d.setAdPopcornSSPViewBinder(adPopcornSSPViewBinder0);
        }
        int v7 = s9 == null || s9.length() <= 0 ? this.a(activity0, "id", "apssp_applovin_custom_adapter_nativead_adfit_view_id") : this.a(activity0, "id", s9);
        com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter adFitNativeViewId : " + v7);
        this.log("adFitNativeViewId : " + v7);
        if(v7 > 0) {
            AdFitViewBinder adFitViewBinder0 = new com.igaworks.ssp.part.nativead.binder.AdFitViewBinder.Builder(v7).bizBoardAd(true).build();
            this.d.setAdFitViewBinder(adFitViewBinder0);
        }
        int v8 = s10 == null || s10.length() <= 0 ? this.a(activity0, "id", "apssp_applovin_custom_adapter_nativead_nam_view_id") : this.a(activity0, "id", s10);
        com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter namNativeViewId : " + v8);
        this.log("namNativeViewId : " + v8);
        if(v8 > 0) {
            NAMViewBinder nAMViewBinder0 = new com.igaworks.ssp.part.nativead.binder.NAMViewBinder.Builder(v8).build();
            this.d.setNamViewBinder(nAMViewBinder0);
        }
        this.d.loadAd();
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters0, Activity activity0, MaxRewardedAdapterListener maxRewardedAdapterListener0) {
        com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter loadRewardedAd");
        String s = maxAdapterResponseParameters0.getThirdPartyAdPlacementId();
        String s1 = maxAdapterResponseParameters0.getCustomParameters().getString("appKey");
        this.log("loadRewardedAd appKey : " + s1 + ", placementId : " + s);
        AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0 = new AdPopcornSSPRewardVideoAd(activity0);
        this.c = adPopcornSSPRewardVideoAd0;
        adPopcornSSPRewardVideoAd0.setPlacementAppKey(s1);
        this.c.setPlacementId(s);
        this.g = maxRewardedAdapterListener0;
        this.c.setRewardVideoAdEventCallbackListener(this.k);
        this.c.loadAd();
    }

    public void onDestroy() {
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.a;
        if(adPopcornSSPBannerAd0 != null) {
            adPopcornSSPBannerAd0.stopAd();
            this.a = null;
        }
        AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0 = this.b;
        if(adPopcornSSPInterstitialAd0 != null) {
            adPopcornSSPInterstitialAd0.destroy();
            this.b = null;
        }
        AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0 = this.c;
        if(adPopcornSSPRewardVideoAd0 != null) {
            adPopcornSSPRewardVideoAd0.destroy();
            this.c = null;
        }
        AdPopcornSSPNativeAd adPopcornSSPNativeAd0 = this.d;
        if(adPopcornSSPNativeAd0 != null) {
            adPopcornSSPNativeAd0.destroy();
            this.d = null;
        }
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters0, Activity activity0, MaxInterstitialAdapterListener maxInterstitialAdapterListener0) {
        com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter showInterstitialAd");
        this.log("showInterstitialAd");
        if(this.b != null && this.b.isLoaded()) {
            this.b.showAd();
            return;
        }
        maxInterstitialAdapterListener0.onInterstitialAdDisplayFailed(APSSPAppLovinCustomAdapter.b(new SSPErrorCode(5003)));
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters0, Activity activity0, MaxRewardedAdapterListener maxRewardedAdapterListener0) {
        com.igaworks.ssp.b.c(Thread.currentThread(), "APSSPAppLovinCustomAdapter showRewardedAd");
        this.log("showRewardedAd");
        if(this.c != null && this.c.isReady()) {
            this.c.showAd();
            return;
        }
        maxRewardedAdapterListener0.onRewardedAdDisplayFailed(APSSPAppLovinCustomAdapter.b(new SSPErrorCode(5005)));
    }
}

