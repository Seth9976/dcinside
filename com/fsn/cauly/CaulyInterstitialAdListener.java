package com.fsn.cauly;

public interface CaulyInterstitialAdListener {
    void onClosedInterstitialAd(CaulyInterstitialAd arg1);

    void onFailedToReceiveInterstitialAd(CaulyInterstitialAd arg1, int arg2, String arg3);

    void onLeaveInterstitialAd(CaulyInterstitialAd arg1);

    void onReceiveInterstitialAd(CaulyInterstitialAd arg1, boolean arg2);
}

