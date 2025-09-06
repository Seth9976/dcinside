package com.igaworks.ssp.part.video.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface IInterstitialVideoAdEventCallbackListener {
    void OnInterstitialVideoAdClicked();

    void OnInterstitialVideoAdClosed();

    void OnInterstitialVideoAdLoadFailed(SSPErrorCode arg1);

    void OnInterstitialVideoAdLoaded();

    void OnInterstitialVideoAdOpenFalied();

    void OnInterstitialVideoAdOpened();
}

