package com.fsn.cauly;

public interface CaulyCloseAdListener {
    void onFailedToReceiveCloseAd(CaulyCloseAd arg1, int arg2, String arg3);

    void onLeaveCloseAd(CaulyCloseAd arg1);

    void onLeftClicked(CaulyCloseAd arg1);

    void onReceiveCloseAd(CaulyCloseAd arg1, boolean arg2);

    void onRightClicked(CaulyCloseAd arg1);

    void onShowedCloseAd(CaulyCloseAd arg1, boolean arg2);
}

