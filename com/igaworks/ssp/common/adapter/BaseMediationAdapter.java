package com.igaworks.ssp.common.adapter;

import android.content.Context;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.C;
import com.igaworks.ssp.SdkInitListener;
import com.igaworks.ssp.T;
import com.igaworks.ssp.V;
import com.igaworks.ssp.b0;
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

public interface BaseMediationAdapter {
    void checkAdPopcornSSPNativeImpression();

    void checkValidMediation();

    void destroyBannerAd();

    void destroyInterstitial();

    void destroyInterstitialVideoAd();

    void destroyModalAd();

    void destroyNativeAd();

    void destroyReactNativeAd();

    void destroyRewardVideoAd();

    void destroySplashAd();

    String getBiddingToken(Context arg1);

    String getNetworkName();

    void initializeSDK(Context arg1, p0 arg2, SdkInitListener arg3);

    void internalStopBannerAd();

    void loadInterstitial(Context arg1, AdPopcornSSPInterstitialAd arg2, d0 arg3, boolean arg4, int arg5);

    void loadInterstitialVideoAd(Context arg1, AdPopcornSSPInterstitialVideoAd arg2, d0 arg3, boolean arg4, int arg5);

    void loadModalAd(Context arg1, d0 arg2, int arg3, AdPopcornSSPModalAd arg4);

    void loadNativeAd(Context arg1, d0 arg2, boolean arg3, int arg4, AdPopcornSSPNativeAd arg5);

    void loadReactNativeAd(Context arg1, d0 arg2, boolean arg3, int arg4, AdPopcornSSPReactNativeAd arg5);

    void loadRewardVideoAd(Context arg1, AdPopcornSSPRewardVideoAd arg2, d0 arg3, boolean arg4, int arg5);

    void loadSplashAd(Context arg1, d0 arg2, int arg3, AdPopcornSSPSplashAd arg4);

    void onPauseBanner();

    void onResumeBanner();

    void pauseInterstitialVideoAd();

    void pauseRewardVideoAd();

    void resumeInterstitial();

    void resumeInterstitialVideoAd();

    void resumeRewardVideoAd();

    void setBannerMediationAdapterEventListener(C arg1);

    void setCustomExtras(HashMap arg1);

    void setInterstitialMediationAdapterEventListener(T arg1);

    void setInterstitialVideoMediationAdapterEventListener(V arg1);

    void setModalAdMediationAdapterEventListener(b0 arg1);

    void setNativeMediationAdapterEventListener(c0 arg1);

    void setReactNativeMediationAdapterEventListener(g0 arg1);

    void setRewardVideoMediationAdapterEventListener(l0 arg1);

    void setSplashMediationAdapterEventListener(r0 arg1);

    void showInterstitial(Context arg1, d0 arg2, boolean arg3, int arg4);

    void showInterstitialVideoAd(Context arg1, d0 arg2, boolean arg3, int arg4);

    void showModalAd(Context arg1, d0 arg2, int arg3, AdPopcornSSPModalAd arg4);

    void showRewardVideoAd(Context arg1, d0 arg2, boolean arg3, int arg4);

    void startBannerAd(Context arg1, AdSize arg2, AdPopcornSSPBannerAd arg3, d0 arg4, boolean arg5, int arg6);
}

