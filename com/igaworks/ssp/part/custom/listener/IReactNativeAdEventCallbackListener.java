package com.igaworks.ssp.part.custom.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface IReactNativeAdEventCallbackListener {
    void onClicked();

    void onImpression();

    void onReactNativeAdLoadFailed(SSPErrorCode arg1);

    void onReactNativeAdLoadSuccess(int arg1, int arg2, int arg3);
}

