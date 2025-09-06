package com.fsn.cauly;

public interface CaulyAdBannerViewListener {
    void onCloseLandingScreen(CaulyAdBannerView arg1);

    void onFailedToReceiveAd(CaulyAdBannerView arg1, int arg2, String arg3);

    void onReceiveAd(CaulyAdBannerView arg1, boolean arg2);

    void onShowLandingScreen(CaulyAdBannerView arg1);

    void onTimeout(CaulyAdBannerView arg1, String arg2);
}

