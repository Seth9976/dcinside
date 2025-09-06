package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class SkuDetailsResponseListenerProxy extends GenericListenerProxy {
    private static final String onSkuDetailsResponseMethodName = "onSkuDetailsResponse";
    private SkuDetailsResponseListener skuDetailsResponseListener;

    public SkuDetailsResponseListenerProxy(SkuDetailsResponseListener skuDetailsResponseListener0) {
        this.skuDetailsResponseListener = skuDetailsResponseListener0;
    }

    @Override  // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class getProxyClass() throws ClassNotFoundException {
        return SkuDetailsResponseListenerProxy.getProxyListenerClass();
    }

    public static Class getProxyListenerClass() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.SkuDetailsResponseListener");
    }

    @Override  // com.unity3d.services.core.reflection.GenericListenerProxy
    public Object invoke(Object object0, Method method0, Object[] arr_object) throws Throwable {
        if(method0.getName().equals("onSkuDetailsResponse")) {
            this.onSkuDetailsResponse(arr_object[0], ((List)arr_object[1]));
            return null;
        }
        return super.invoke(object0, method0, arr_object);
    }

    public void onSkuDetailsResponse(Object object0, List list0) {
        ArrayList arrayList0;
        if(list0 == null) {
            arrayList0 = null;
        }
        else {
            arrayList0 = new ArrayList();
            for(Object object1: list0) {
                arrayList0.add(new SkuDetailsBridge(object1));
            }
        }
        SkuDetailsResponseListener skuDetailsResponseListener0 = this.skuDetailsResponseListener;
        if(skuDetailsResponseListener0 != null) {
            skuDetailsResponseListener0.onSkuDetailsUpdated(new BillingResultBridge(object0), arrayList0);
        }
    }
}

