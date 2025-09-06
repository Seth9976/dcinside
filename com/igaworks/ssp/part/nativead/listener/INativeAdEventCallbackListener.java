package com.igaworks.ssp.part.nativead.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface INativeAdEventCallbackListener {
    void onAdHidden();

    void onClicked();

    void onImpression();

    void onNativeAdLoadFailed(SSPErrorCode arg1);

    void onNativeAdLoadSuccess();
}

