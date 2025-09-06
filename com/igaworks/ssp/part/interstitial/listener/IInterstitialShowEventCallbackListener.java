package com.igaworks.ssp.part.interstitial.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface IInterstitialShowEventCallbackListener {
    void OnInterstitialClicked();

    void OnInterstitialClosed(int arg1);

    void OnInterstitialOpenFailed(SSPErrorCode arg1);

    void OnInterstitialOpened();
}

