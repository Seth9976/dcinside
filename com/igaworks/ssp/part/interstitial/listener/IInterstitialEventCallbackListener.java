package com.igaworks.ssp.part.interstitial.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface IInterstitialEventCallbackListener {
    void OnInterstitialClicked();

    void OnInterstitialClosed(int arg1);

    void OnInterstitialLoaded();

    void OnInterstitialOpenFailed(SSPErrorCode arg1);

    void OnInterstitialOpened();

    void OnInterstitialReceiveFailed(SSPErrorCode arg1);
}

