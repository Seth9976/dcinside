package com.unity3d.services.store.gpbl.bridges.billingclient;

import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import java.lang.reflect.InvocationTargetException;

public interface IBillingClientBuilderBridge {
    IBillingClient build() throws ClassNotFoundException;

    IBillingClientBuilderBridge enablePendingPurchases();

    IBillingClientBuilderBridge setListener(PurchaseUpdatedListenerProxy arg1) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException;
}

