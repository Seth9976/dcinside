package com.unity3d.services.store.gpbl.listeners;

public interface StoreEventListener extends BillingInitializationListener, FeatureSupportedListener, PurchaseHistoryResponseListener, PurchaseUpdatedResponseListener, PurchasesResponseListener, SkuDetailsResponseListener {
    int getOperationId();
}

