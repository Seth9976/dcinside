package com.igaworks.ssp.plugin.unity;

public interface AdPopcornSSPUnityVideoMixListener {
    void OnVideoMixAdClicked();

    void OnVideoMixAdClosed(int arg1);

    void OnVideoMixAdLoadFailed(int arg1, String arg2);

    void OnVideoMixAdLoaded();

    void OnVideoMixAdOpenFailed();

    void OnVideoMixAdOpened();

    void OnVideoMixPlayCompleted(int arg1, boolean arg2);
}

