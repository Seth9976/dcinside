package com.fsn.cauly;

public interface CaulyAdViewListener {
    void onCloseLandingScreen(CaulyAdView arg1);

    void onFailedToReceiveAd(CaulyAdView arg1, int arg2, String arg3);

    void onReceiveAd(CaulyAdView arg1, boolean arg2);

    void onShowLandingScreen(CaulyAdView arg1);
}

