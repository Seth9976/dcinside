package com.igaworks.ssp.plugin.unity;

public interface AdPopcornSSPUnityRewardVideoListener {
    void OnRewardPlusCompleteResult(boolean arg1, int arg2, int arg3);

    void OnRewardVideoAdClicked();

    void OnRewardVideoAdClosed();

    void OnRewardVideoAdLoadFailed(int arg1, String arg2);

    void OnRewardVideoAdLoaded();

    void OnRewardVideoAdOpenFalied();

    void OnRewardVideoAdOpened();

    void OnRewardVideoPlayCompleted(int arg1, boolean arg2);
}

