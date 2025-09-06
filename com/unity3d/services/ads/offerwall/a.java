package com.unity3d.services.ads.offerwall;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class a implements InvocationHandler {
    public final OfferwallAdapterBridge a;

    public a(OfferwallAdapterBridge offerwallAdapterBridge0) {
        this.a = offerwallAdapterBridge0;
    }

    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        return OfferwallAdapterBridge.tapjoyPlacementListener$lambda$0(this.a, object0, method0, arr_object);
    }
}

