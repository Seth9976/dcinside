package com.unity3d.services.store;

import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.core.StoreLifecycleListener;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import y4.l;
import y4.m;

public final class StoreMonitor {
    @l
    private final E _isInitialized;
    @m
    private StoreBilling storeBilling;
    @l
    private final StoreExceptionHandler storeExceptionHandler;
    @m
    private StoreLifecycleListener storeLifecycleListener;

    public StoreMonitor(@l StoreExceptionHandler storeExceptionHandler0) {
        L.p(storeExceptionHandler0, "storeExceptionHandler");
        super();
        this.storeExceptionHandler = storeExceptionHandler0;
        this._isInitialized = W.a(Boolean.FALSE);
    }

    public final void getPurchaseHistory(int v, @m String s, int v1, @l PurchaseHistoryResponseListener purchaseHistoryResponseListener0) {
        L.p(purchaseHistoryResponseListener0, "purchaseHistoryResponseListener");
        StoreBilling storeBilling0 = this.storeBilling;
        if(storeBilling0 != null) {
            try {
                storeBilling0.getPurchaseHistory(s, v1, purchaseHistoryResponseListener0);
            }
            catch(Exception exception0) {
                this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_ERROR, v, exception0);
            }
        }
    }

    public final void getPurchases(int v, @m String s, @l PurchasesResponseListener purchasesResponseListener0) {
        L.p(purchasesResponseListener0, "purchasesResponseListener");
        try {
            StoreBilling storeBilling0 = this.storeBilling;
            if(storeBilling0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            storeBilling0.getPurchases(s, purchasesResponseListener0);
            return;
        }
        catch(Exception exception0) {
        }
        this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASES_REQUEST_ERROR, v, exception0);
    }

    public final void getSkuDetails(int v, @m String s, @m List list0, @l SkuDetailsResponseListener skuDetailsResponseListener0) {
        L.p(skuDetailsResponseListener0, "skuDetailsResponseListener");
        StoreBilling storeBilling0 = this.storeBilling;
        if(storeBilling0 != null) {
            try {
                storeBilling0.getSkuDetails(s, list0, skuDetailsResponseListener0);
            }
            catch(Exception exception0) {
                this.storeExceptionHandler.handleStoreException(StoreEvent.SKU_DETAILS_LIST_REQUEST_ERROR, v, exception0);
            }
        }
    }

    public final void initialize(@l BillingInitializationListener billingInitializationListener0) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        L.p(billingInitializationListener0, "billingInitializationListener");
        if(this.isInitialized()) {
            billingInitializationListener0.onIsAlreadyInitialized();
            return;
        }
        StoreBilling storeBilling0 = new StoreBilling(ClientProperties.getApplicationContext(), billingInitializationListener0);
        this.storeBilling = storeBilling0;
        storeBilling0.initialize(billingInitializationListener0);
        this._isInitialized.setValue(Boolean.TRUE);
    }

    public final int isFeatureSupported(int v, @m String s, @l FeatureSupportedListener featureSupportedListener0) {
        L.p(featureSupportedListener0, "featureSupportedListener");
        int v1 = -1;
        try {
            StoreBilling storeBilling0 = this.storeBilling;
            if(storeBilling0 != null) {
                v1 = storeBilling0.isFeatureSupported(s);
            }
            featureSupportedListener0.onFeatureSupported(v1);
            return v1;
        }
        catch(Exception exception0) {
        }
        this.storeExceptionHandler.handleStoreException(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_ERROR, v, exception0);
        return v1;
    }

    public final boolean isInitialized() {
        return ((Boolean)this._isInitialized.getValue()).booleanValue();
    }

    public final void startPurchaseTracking(@l ArrayList arrayList0, @l StoreEventListener storeEventListener0) {
        L.p(arrayList0, "purchaseTypes");
        L.p(storeEventListener0, "storeEventListener");
        if(this.storeLifecycleListener != null) {
            this.stopPurchaseTracking();
        }
        StoreBilling storeBilling0 = this.storeBilling;
        L.m(storeBilling0);
        this.storeLifecycleListener = new StoreLifecycleListener(arrayList0, storeBilling0, storeEventListener0);
        ClientProperties.getApplication().registerActivityLifecycleCallbacks(this.storeLifecycleListener);
    }

    public final void stopPurchaseTracking() {
        if(this.storeLifecycleListener != null) {
            ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(this.storeLifecycleListener);
            this.storeLifecycleListener = null;
        }
    }
}

