package com.igaworks.ssp.plugin.unity;

public interface AdPopcornSSPUnityBannerListener {
    void OnBannerAdClicked();

    void OnBannerAdReceiveFailed(int arg1, String arg2);

    void OnBannerAdReceiveSuccess();
}

