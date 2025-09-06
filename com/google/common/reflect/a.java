package com.google.common.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

@d
public abstract class a implements InvocationHandler {
    private static final Object[] a;

    static {
        a.a = new Object[0];
    }

    @o3.a
    protected abstract Object a(Object arg1, Method arg2, Object[] arg3) throws Throwable;

    // 去混淆评级： 低(30)
    private static boolean b(Object object0, Class class0) {
        return class0.isInstance(object0) || Proxy.isProxyClass(object0.getClass()) && Arrays.equals(object0.getClass().getInterfaces(), class0.getInterfaces());
    }

    @Override
    public boolean equals(@o3.a Object object0) {
        return super.equals(object0);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    @o3.a
    public final Object invoke(Object object0, Method method0, @o3.a Object[] arr_object) throws Throwable {
        if(arr_object == null) {
            arr_object = a.a;
        }
        boolean z = true;
        if(arr_object.length == 0 && method0.getName().equals("hashCode")) {
            return this.hashCode();
        }
        if(arr_object.length == 1 && method0.getName().equals("equals") && method0.getParameterTypes()[0] == Object.class) {
            Object object1 = arr_object[0];
            if(object1 == null) {
                return false;
            }
            if(object0 == object1) {
                return true;
            }
            if(!a.b(object1, object0.getClass()) || !this.equals(Proxy.getInvocationHandler(object1))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return arr_object.length == 0 && method0.getName().equals("toString") ? "jebdyn.dexdec.irsb.Object_a708dadb@466b5389" : this.a(object0, method0, arr_object);
    }

    @Override
    public String toString() [...] // 潜在的解密器
}

