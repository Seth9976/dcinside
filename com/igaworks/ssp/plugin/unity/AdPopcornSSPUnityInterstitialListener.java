package com.igaworks.ssp.plugin.unity;

public interface AdPopcornSSPUnityInterstitialListener {
    void OnInterstitialClicked();

    void OnInterstitialClosed(int arg1);

    void OnInterstitialLoaded();

    void OnInterstitialOpenFailed(int arg1, String arg2);

    void OnInterstitialOpened();

    void OnInterstitialReceiveFailed(int arg1, String arg2);
}

