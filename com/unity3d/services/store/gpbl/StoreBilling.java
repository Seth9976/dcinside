package com.unity3d.services.store.gpbl;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientBuilderFactory;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class StoreBilling {
    private final IBillingClient _billingClientBridge;

    public StoreBilling(Context context0, PurchaseUpdatedResponseListener purchaseUpdatedResponseListener0) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        this._billingClientBridge = BillingClientBuilderFactory.getBillingClientBuilder(context0).setListener(new PurchaseUpdatedListenerProxy(purchaseUpdatedResponseListener0)).enablePendingPurchases().build();
    }

    public void getPurchaseHistory(String s, int v, PurchaseHistoryResponseListener purchaseHistoryResponseListener0) throws ClassNotFoundException {
        PurchaseHistoryResponseListenerProxy purchaseHistoryResponseListenerProxy0 = new PurchaseHistoryResponseListenerProxy(purchaseHistoryResponseListener0, v);
        this._billingClientBridge.queryPurchaseHistoryAsync(s, purchaseHistoryResponseListenerProxy0);
    }

    public void getPurchases(String s, PurchasesResponseListener purchasesResponseListener0) throws ClassNotFoundException {
        PurchasesResponseListenerProxy purchasesResponseListenerProxy0 = new PurchasesResponseListenerProxy(purchasesResponseListener0);
        this._billingClientBridge.queryPurchasesAsync(s, purchasesResponseListenerProxy0);
    }

    public void getSkuDetails(String s, List list0, SkuDetailsResponseListener skuDetailsResponseListener0) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        SkuDetailsParamsBridge skuDetailsParamsBridge0 = SkuDetailsParamsBridge.newBuilder().setSkuList(list0).setType(s).build();
        SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy0 = new SkuDetailsResponseListenerProxy(skuDetailsResponseListener0);
        this._billingClientBridge.querySkuDetailsAsync(skuDetailsParamsBridge0, skuDetailsResponseListenerProxy0);
    }

    public void initialize(BillingClientStateListener billingClientStateListener0) throws ClassNotFoundException {
        BillingClientStateListenerProxy billingClientStateListenerProxy0 = new BillingClientStateListenerProxy(billingClientStateListener0);
        this._billingClientBridge.startConnection(billingClientStateListenerProxy0);
    }

    public int isFeatureSupported(String s) {
        if(s.equals("inapp")) {
            return this._billingClientBridge.isReady() ? 0 : -1;
        }
        if(s.equals("subs")) {
            s = "subscriptions";
        }
        return this._billingClientBridge.isFeatureSupported(s) == BillingResultResponseCode.OK ? 0 : -1;
    }
}

