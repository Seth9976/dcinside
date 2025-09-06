package com.google.common.reflect;

import com.google.common.base.H;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@d
public final class l {
    public static String a(Class class0) {
        return l.b(class0.getName());
    }

    public static String b(String s) {
        int v = s.lastIndexOf(46);
        return v >= 0 ? s.substring(0, v) : "";
    }

    public static void c(Class[] arr_class) {
        for(int v = 0; v < arr_class.length; ++v) {
            Class class0 = arr_class[v];
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new AssertionError(classNotFoundException0);
            }
        }
    }

    public static Object d(Class class0, InvocationHandler invocationHandler0) {
        H.E(invocationHandler0);
        H.u(class0.isInterface(), "%s is not an interface", class0);
        return class0.cast(Proxy.newProxyInstance(class0.getClassLoader(), new Class[]{class0}, invocationHandler0));
    }
}

