package com.pgl.ssdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class t0 {
    private static Method a;
    private static Method b;
    private static Method c;

    static {
        try {
            t0.a = Class.class.getDeclaredMethod("forName", String.class);
            t0.b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            t0.c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        }
        catch(NoSuchMethodException | NullPointerException unused_ex) {
        }
    }

    public static Object a(Object object0, Class class0, String s, Object object1) {
        try {
            Field field0 = t0.a(class0, s);
            if(field0 == null) {
                return object1;
            }
            field0.setAccessible(true);
            return field0.get(object0);
        }
        catch(Throwable unused_ex) {
            return object1;
        }
    }

    public static Object a(Object object0, Class class0, String s, Class[] arr_class, Object[] arr_object) {
        Object object1;
        try {
            Method method0 = t0.a(class0, s, arr_class);
            object1 = null;
            return method0 == null ? null : method0.invoke(object0, arr_object);
        }
        catch(Throwable unused_ex) {
        }
        return object1;
    }

    public static Field a(Class class0, String s) {
        Field field0;
        try {
            field0 = (Field)t0.c.invoke(class0, s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
        try {
            field0.setAccessible(true);
        }
        catch(Throwable unused_ex) {
        }
        return field0;
    }

    public static Method a(Class class0, String s, Class[] arr_class) {
        Method method0;
        try {
            method0 = (Method)t0.b.invoke(class0, s, arr_class);
        }
        catch(Throwable unused_ex) {
            return null;
        }
        try {
            method0.setAccessible(true);
        }
        catch(Throwable unused_ex) {
        }
        return method0;
    }

    private static boolean a() [...] // 潜在的解密器
}

