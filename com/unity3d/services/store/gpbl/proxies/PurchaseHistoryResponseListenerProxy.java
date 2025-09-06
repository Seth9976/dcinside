package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PurchaseHistoryResponseListenerProxy extends GenericListenerProxy {
    private int _maxPurchases;
    private static final String onPurchaseHistoryResponseMethodName = "onPurchaseHistoryResponse";
    private PurchaseHistoryResponseListener purchaseHistoryResponseListener;

    public PurchaseHistoryResponseListenerProxy(PurchaseHistoryResponseListener purchaseHistoryResponseListener0, int v) {
        this.purchaseHistoryResponseListener = purchaseHistoryResponseListener0;
        this._maxPurchases = v;
    }

    @Override  // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class getProxyClass() throws ClassNotFoundException {
        return PurchaseHistoryResponseListenerProxy.getProxyListenerClass();
    }

    public static Class getProxyListenerClass() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchaseHistoryResponseListener");
    }

    @Override  // com.unity3d.services.core.reflection.GenericListenerProxy
    public Object invoke(Object object0, Method method0, Object[] arr_object) throws Throwable {
        if(method0.getName().equals("onPurchaseHistoryResponse")) {
            this.onPurchaseHistoryResponse(arr_object[0], ((List)arr_object[1]));
            return null;
        }
        return super.invoke(object0, method0, arr_object);
    }

    public void onPurchaseHistoryResponse(Object object0, List list0) {
        ArrayList arrayList0;
        if(list0 == null) {
            arrayList0 = null;
        }
        else {
            arrayList0 = new ArrayList();
            for(int v = 0; v < this._maxPurchases && v < list0.size(); ++v) {
                arrayList0.add(new PurchaseHistoryRecordBridge(list0.get(v)));
            }
        }
        PurchaseHistoryResponseListener purchaseHistoryResponseListener0 = this.purchaseHistoryResponseListener;
        if(purchaseHistoryResponseListener0 != null) {
            purchaseHistoryResponseListener0.onPurchaseHistoryUpdated(new BillingResultBridge(object0), arrayList0);
        }
    }
}

