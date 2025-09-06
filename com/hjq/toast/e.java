package com.hjq.toast;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

final class e implements InvocationHandler {
    private final Object a;

    public e(Object object0) {
        this.a = object0;
    }

    @Override
    public Object invoke(Object object0, Method method0, Object[] arr_object) throws Throwable {
        String s = method0.getName();
        s.hashCode();
        int v = -1;
        switch(s) {
            case "cancelToast": {
                v = 0;
                break;
            }
            case "enqueueToast": {
                v = 2;
                break;
            }
            case "enqueueToastEx": {
                v = 1;
            }
        }
        if(v == 0 || v == 1 || v == 2) {
            arr_object[0] = "android";
        }
        return method0.invoke(this.a, arr_object);
    }
}

