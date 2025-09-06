package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PurchaseUpdatedListenerProxy extends GenericListenerProxy {
    private static final String onPurchasesUpdatedMethodName = "onPurchasesUpdated";
    private PurchaseUpdatedResponseListener purchaseUpdatedResponseListener;

    public PurchaseUpdatedListenerProxy(PurchaseUpdatedResponseListener purchaseUpdatedResponseListener0) {
        this.purchaseUpdatedResponseListener = purchaseUpdatedResponseListener0;
    }

    @Override  // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class getProxyClass() throws ClassNotFoundException {
        return PurchaseUpdatedListenerProxy.getProxyListenerClass();
    }

    public static Class getProxyListenerClass() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchasesUpdatedListener");
    }

    @Override  // com.unity3d.services.core.reflection.GenericListenerProxy
    public Object invoke(Object object0, Method method0, Object[] arr_object) throws Throwable {
        if(method0.getName().equals("onPurchasesUpdated")) {
            this.onPurchasesUpdated(arr_object[0], ((List)arr_object[1]));
            return null;
        }
        return super.invoke(object0, method0, arr_object);
    }

    public void onPurchasesUpdated(Object object0, List list0) {
        ArrayList arrayList0;
        if(list0 == null) {
            arrayList0 = null;
        }
        else {
            arrayList0 = new ArrayList();
            for(Object object1: list0) {
                arrayList0.add(new PurchaseBridge(object1));
            }
        }
        PurchaseUpdatedResponseListener purchaseUpdatedResponseListener0 = this.purchaseUpdatedResponseListener;
        if(purchaseUpdatedResponseListener0 != null) {
            purchaseUpdatedResponseListener0.onPurchaseUpdated(new BillingResultBridge(object0), arrayList0);
        }
    }
}

