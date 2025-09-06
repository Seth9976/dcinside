package com.igaworks.ssp.part.interstitial.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface IInterstitialLoadEventCallbackListener {
    void OnInterstitialLoaded();

    void OnInterstitialReceiveFailed(SSPErrorCode arg1);
}

