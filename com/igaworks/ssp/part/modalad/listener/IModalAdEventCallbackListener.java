package com.igaworks.ssp.part.modalad.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface IModalAdEventCallbackListener {
    void OnModalAdClicked();

    void OnModalAdClosed();

    void OnModalAdLoadFailed(SSPErrorCode arg1);

    void OnModalAdLoaded();

    void OnModalAdOpenFailed(SSPErrorCode arg1);

    void OnModalAdOpened();
}

