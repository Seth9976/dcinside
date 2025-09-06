package com.bytedance.sdk.openadsdk.api.factory;

public interface IADTypeLoaderFactory {
    IADLoader createBannerAdLoader();

    IADLoader createInterstitialAdLoader();

    IADLoader createNativeAdLoader();

    IADLoader createOpenAdLoader();

    IADLoader createRewardAdLoader();
}

