package com.fsn.cauly;

public interface CaulyIconAdListener {
    void onClosedIconAd(CaulyIconAd arg1);

    void onFailedToReceiveIconAd(CaulyIconAd arg1, int arg2, String arg3);

    void onReceiveIconAd(CaulyIconAd arg1, boolean arg2);
}

