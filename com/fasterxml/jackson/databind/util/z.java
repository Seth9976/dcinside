package com.fasterxml.jackson.databind.util;

import java.lang.reflect.InvocationTargetException;

public class z {
    private static final boolean a;

    static {
        z.a = System.getProperty("org.graalvm.nativeimage.imagecode") != null;
    }

    public static boolean a() {
        return z.a;
    }

    // 去混淆评级： 低(20)
    public static boolean b() {
        return z.a && "runtime".equals(System.getProperty("org.graalvm.nativeimage.imagecode"));
    }

    public static boolean c(Throwable throwable0) {
        if(!z.b()) {
            return false;
        }
        if(throwable0 instanceof InvocationTargetException) {
            throwable0 = throwable0.getCause();
        }
        return throwable0.getClass().getName().equals("com.oracle.svm.core.jdk.UnsupportedFeatureError");
    }

    // 去混淆评级： 低(30)
    public static boolean d(Class class0) {
        return z.b() ? (class0.getDeclaredFields().length == 0 || h.h0(class0)) && class0.getDeclaredMethods().length == 0 && class0.getDeclaredConstructors().length == 0 : false;
    }
}

