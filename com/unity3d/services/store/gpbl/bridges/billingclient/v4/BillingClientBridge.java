package com.unity3d.services.store.gpbl.bridges.billingclient.v4;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class BillingClientBridge extends BillingClientBridgeCommon {
    public static class BuilderBridge extends BillingClientBuilderBridgeCommon {
        public BuilderBridge(Object object0) throws ClassNotFoundException {
            super(object0);
        }

        @Override  // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
        public IBillingClient build() throws ClassNotFoundException {
            return this.build();
        }

        public BillingClientBridgeCommon build() throws ClassNotFoundException {
            return new BillingClientBridge(this.callNonVoidMethod("build", this._billingClientBuilderInternalInstance, new Object[0]));
        }
    }

    private static final String queryPurchasesAsyncMethodName = "queryPurchasesAsync";

    public BillingClientBridge(Object object0) throws ClassNotFoundException {
        super(object0, new com.unity3d.services.store.gpbl.bridges.billingclient.v4.BillingClientBridge.1());

        class com.unity3d.services.store.gpbl.bridges.billingclient.v4.BillingClientBridge.1 extends HashMap {
            com.unity3d.services.store.gpbl.bridges.billingclient.v4.BillingClientBridge.1() throws ClassNotFoundException {
                Class class0 = PurchasesResponseListenerProxy.getProxyListenerClass();
                this.put("queryPurchasesAsync", new Class[]{String.class, class0});
            }
        }

    }

    public static boolean isAvailable() {
        try {
            Class class0 = BillingClientBridgeCommon.getClassForBridge();
            Class class1 = PurchasesResponseListenerProxy.getProxyListenerClass();
            class0.getMethod("queryPurchasesAsync", String.class, class1);
            return true;
        }
        catch(NoSuchMethodException | ClassNotFoundException unused_ex) {
            return false;
        }
    }

    public static BuilderBridge newBuilder(Context context0) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        return new BuilderBridge(BillingClientBridgeCommon.callNonVoidStaticMethod("newBuilder", new Object[]{context0}));
    }

    @Override  // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchasesAsync(String s, PurchasesResponseListenerProxy purchasesResponseListenerProxy0) throws ClassNotFoundException {
        Object[] arr_object = {s, purchasesResponseListenerProxy0.getProxyInstance()};
        this.callVoidMethod("queryPurchasesAsync", this._billingClientInternalInstance, arr_object);
    }
}

