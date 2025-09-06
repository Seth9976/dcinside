package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import java.lang.reflect.Method;

public class BillingClientStateListenerProxy extends GenericListenerProxy {
    private BillingClientStateListener billingClientStateListener;
    private static String onBillingServiceDisconnectedMethodName = "onBillingServiceDisconnected";
    private static String onBillingSetupFinishedMethodName = "onBillingSetupFinished";

    static {
    }

    public BillingClientStateListenerProxy(BillingClientStateListener billingClientStateListener0) {
        this.billingClientStateListener = billingClientStateListener0;
    }

    @Override  // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class getProxyClass() throws ClassNotFoundException {
        return BillingClientStateListenerProxy.getProxyListenerClass();
    }

    public static Class getProxyListenerClass() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.BillingClientStateListener");
    }

    @Override  // com.unity3d.services.core.reflection.GenericListenerProxy
    public Object invoke(Object object0, Method method0, Object[] arr_object) throws Throwable {
        if(method0.getName().equals("onBillingSetupFinished")) {
            this.onBillingSetupFinished(arr_object[0]);
            return null;
        }
        if(method0.getName().equals("onBillingServiceDisconnected")) {
            this.onBillingServiceDisconnected();
            return null;
        }
        return super.invoke(object0, method0, arr_object);
    }

    private void onBillingServiceDisconnected() {
        BillingClientStateListener billingClientStateListener0 = this.billingClientStateListener;
        if(billingClientStateListener0 != null) {
            billingClientStateListener0.onBillingServiceDisconnected();
        }
    }

    private void onBillingSetupFinished(Object object0) {
        BillingClientStateListener billingClientStateListener0 = this.billingClientStateListener;
        if(billingClientStateListener0 != null) {
            billingClientStateListener0.onBillingSetupFinished(new BillingResultBridge(object0));
        }
    }
}

