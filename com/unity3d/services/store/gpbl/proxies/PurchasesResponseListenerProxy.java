package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PurchasesResponseListenerProxy extends GenericListenerProxy {
    private static final String onQueryPurchasesResponseMethodName = "onQueryPurchasesResponse";
    private PurchasesResponseListener purchasesResponseListener;

    public PurchasesResponseListenerProxy(PurchasesResponseListener purchasesResponseListener0) {
        this.purchasesResponseListener = purchasesResponseListener0;
    }

    @Override  // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class getProxyClass() throws ClassNotFoundException {
        return PurchasesResponseListenerProxy.getProxyListenerClass();
    }

    public static Class getProxyListenerClass() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchasesResponseListener");
    }

    public PurchasesResponseListener getPurchasesResponseListener() {
        return this.purchasesResponseListener;
    }

    @Override  // com.unity3d.services.core.reflection.GenericListenerProxy
    public Object invoke(Object object0, Method method0, Object[] arr_object) throws Throwable {
        if(method0.getName().equals("onQueryPurchasesResponse")) {
            this.onQueryPurchasesResponse(arr_object[0], ((List)arr_object[1]));
            return null;
        }
        return super.invoke(object0, method0, arr_object);
    }

    public void onQueryPurchasesResponse(Object object0, List list0) {
        ArrayList arrayList0;
        BillingResultBridge billingResultBridge0 = new BillingResultBridge(object0);
        if(list0 == null) {
            arrayList0 = null;
        }
        else {
            arrayList0 = new ArrayList();
            for(Object object1: list0) {
                arrayList0.add(new PurchaseBridge(object1));
            }
        }
        PurchasesResponseListener purchasesResponseListener0 = this.purchasesResponseListener;
        if(purchasesResponseListener0 != null) {
            purchasesResponseListener0.onPurchaseResponse(billingResultBridge0, arrayList0);
        }
    }
}

