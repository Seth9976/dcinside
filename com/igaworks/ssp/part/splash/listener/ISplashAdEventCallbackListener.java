package com.igaworks.ssp.part.splash.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface ISplashAdEventCallbackListener {
    void onImpression();

    void onSplashAdLoadFailed(SSPErrorCode arg1);

    void onSplashAdLoadSuccess();
}

