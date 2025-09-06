package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public abstract class BillingClientBuilderBridgeCommon extends GenericBridge implements IBillingClientBuilderBridge {
    protected Object _billingClientBuilderInternalInstance;
    protected static final String buildMethodName = "build";
    private static final String enablePendingPurchasesMethodName = "enablePendingPurchases";
    private static final String setListenerMethodName = "setListener";

    public BillingClientBuilderBridgeCommon(Object object0) throws ClassNotFoundException {
        super(new com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon.1());
        this._billingClientBuilderInternalInstance = object0;

        class com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon.1 extends HashMap {
            com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon.1() throws ClassNotFoundException {
                this.put("setListener", new Class[]{PurchaseUpdatedListenerProxy.getProxyListenerClass()});
                this.put("enablePendingPurchases", new Class[0]);
                this.put("build", new Class[0]);
            }
        }

    }

    @Override  // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public IBillingClientBuilderBridge enablePendingPurchases() {
        this._billingClientBuilderInternalInstance = this.callNonVoidMethod("enablePendingPurchases", this._billingClientBuilderInternalInstance, new Object[0]);
        return this;
    }

    @Override  // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.BillingClient$Builder";
    }

    @Override  // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public IBillingClientBuilderBridge setListener(PurchaseUpdatedListenerProxy purchaseUpdatedListenerProxy0) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        this._billingClientBuilderInternalInstance = this.callNonVoidMethod("setListener", this._billingClientBuilderInternalInstance, new Object[]{purchaseUpdatedListenerProxy0.getProxyInstance()});
        return this;
    }
}

