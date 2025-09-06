package com.gomfactory.adpie.sdk.event;

import com.gomfactory.adpie.sdk.common.AdResponse;

public interface AdEventListener {
    void notifyAdClicked();

    void notifyAdDismissed();

    void notifyAdFailedToLoad(int arg1);

    void notifyAdLoaded(Object[] arg1);

    void notifyAdShown();

    void notifyVideoAdCompleted();

    void notifyVideoAdError();

    void notifyVideoAdPaused();

    void notifyVideoAdSkipped();

    void notifyVideoAdStarted();

    void notifyVideoAdStopped();

    void receivedResponse(AdResponse arg1);
}

