package com.unity3d.services.ads.gmascar.listeners;

import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import y4.m;

public interface IBiddingSignalsListener {
    void onSignalsFailure(String arg1);

    void onSignalsReady(@m BiddingSignals arg1);
}

