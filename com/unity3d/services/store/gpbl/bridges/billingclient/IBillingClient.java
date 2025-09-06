package com.unity3d.services.store.gpbl.bridges.billingclient;

import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;

public interface IBillingClient {
    BillingResultResponseCode isFeatureSupported(String arg1);

    boolean isReady();

    void queryPurchaseHistoryAsync(String arg1, PurchaseHistoryResponseListenerProxy arg2) throws ClassNotFoundException;

    void queryPurchasesAsync(String arg1, PurchasesResponseListenerProxy arg2) throws ClassNotFoundException;

    void querySkuDetailsAsync(SkuDetailsParamsBridge arg1, SkuDetailsResponseListenerProxy arg2) throws ClassNotFoundException;

    void startConnection(BillingClientStateListenerProxy arg1) throws ClassNotFoundException;
}

