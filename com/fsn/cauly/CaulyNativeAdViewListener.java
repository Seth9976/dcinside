package com.fsn.cauly;

public interface CaulyNativeAdViewListener {
    void onFailedToReceiveNativeAd(CaulyNativeAdView arg1, int arg2, String arg3);

    void onReceiveNativeAd(CaulyNativeAdView arg1, boolean arg2);
}

