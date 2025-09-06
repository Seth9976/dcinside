package com.igaworks.ssp.part.video.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface IRewardVideoAdEventCallbackListener {
    void OnRewardPlusCompleted(boolean arg1, int arg2, int arg3);

    void OnRewardVideoAdClicked();

    void OnRewardVideoAdClosed();

    void OnRewardVideoAdLoadFailed(SSPErrorCode arg1);

    void OnRewardVideoAdLoaded();

    void OnRewardVideoAdOpenFalied();

    void OnRewardVideoAdOpened();

    void OnRewardVideoPlayCompleted(int arg1, boolean arg2);
}

