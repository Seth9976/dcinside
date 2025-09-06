package com.fsn.cauly;

public interface CaulyVideoAdViewListener {
    void onFailToReceiveVideoAd(CaulyVideoAdView arg1, int arg2, String arg3);

    void onFinishVideoAd(int arg1, String arg2);

    void onReceiveVideoAd(CaulyVideoAdView arg1, boolean arg2);

    void onStartVideoAd();
}

