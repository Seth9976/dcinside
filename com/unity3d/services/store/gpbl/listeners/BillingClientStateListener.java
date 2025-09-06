package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import y4.l;

public interface BillingClientStateListener {
    void onBillingServiceDisconnected();

    void onBillingSetupFinished(@l BillingResultBridge arg1);
}

