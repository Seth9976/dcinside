package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import java.util.List;
import y4.l;
import y4.m;

public interface PurchaseHistoryResponseListener {
    void onPurchaseHistoryUpdated(@l BillingResultBridge arg1, @m List arg2);
}

