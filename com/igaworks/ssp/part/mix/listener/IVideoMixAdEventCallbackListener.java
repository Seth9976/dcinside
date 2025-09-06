package com.igaworks.ssp.part.mix.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface IVideoMixAdEventCallbackListener {
    void OnVideoMixAdClicked();

    void OnVideoMixAdClosed(int arg1);

    void OnVideoMixAdLoadFailed(SSPErrorCode arg1);

    void OnVideoMixAdLoaded();

    void OnVideoMixAdOpenFailed();

    void OnVideoMixAdOpened();

    void OnVideoMixPlayCompleted(int arg1, boolean arg2);
}

