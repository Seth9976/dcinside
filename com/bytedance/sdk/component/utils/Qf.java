package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Qf {
    public static final Class[] PjT;
    private static final HashMap ReZ;
    private static Map Zh;

    static {
        Qf.Zh = new HashMap();
        HashMap hashMap0 = new HashMap();
        Qf.ReZ = hashMap0;
        hashMap0.put(Boolean.TYPE, Boolean.class);
        hashMap0.put(Byte.TYPE, Byte.class);
        hashMap0.put(Character.TYPE, Character.class);
        hashMap0.put(Short.TYPE, Short.class);
        hashMap0.put(Integer.TYPE, Integer.class);
        hashMap0.put(Long.TYPE, Long.class);
        hashMap0.put(Double.TYPE, Double.class);
        hashMap0.put(Float.TYPE, Float.class);
        hashMap0.put(Void.TYPE, Void.class);
        Qf.PjT = new Class[0];
    }

    public static int PjT(Context context0) {
        return context0.getResources().getDisplayMetrics().widthPixels;
    }

    public static int PjT(Context context0, float f) {
        return (int)(f * context0.getResources().getDisplayMetrics().density + 0.5f);
    }

    public static Object PjT(Object object0, String s, Object[] arr_object) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return Qf.PjT(object0, s, arr_object, Qf.PjT(arr_object));
    }

    public static Object PjT(Object object0, String s, Object[] arr_object, Class[] arr_class) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method method0 = Qf.PjT(object0.getClass(), s, arr_class);
        if(method0 == null) {
            throw new NoSuchMethodException(s);
        }
        return method0.invoke(object0, arr_object);
    }

    public static Method PjT(Class class0, String s, Class[] arr_class) {
        Method method0;
        String s1 = Qf.Zh(class0, s, arr_class);
        synchronized(Qf.Zh) {
            method0 = (Method)Qf.Zh.get(s1);
        }
        if(method0 != null) {
            if(!method0.isAccessible()) {
                method0.setAccessible(true);
            }
            return method0;
        }
        while(class0 != null) {
            try {
                method0 = class0.getDeclaredMethod(s, arr_class);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            if(method0 == null) {
                try {
                    Method[] arr_method = class0.getDeclaredMethods();
                    int v1 = arr_method.length;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Method method1 = arr_method[v2];
                        if(method1 != null && TextUtils.equals(method1.getName(), s)) {
                            Class[] arr_class1 = method1.getParameterTypes();
                            if(arr_class != null && arr_class1 != null && arr_class.length == arr_class1.length) {
                                boolean z = true;
                                for(int v3 = 0; v3 < arr_class.length; ++v3) {
                                    if(!Qf.PjT(arr_class[v3], arr_class1[v3])) {
                                        z = false;
                                    }
                                }
                                if(z) {
                                    method0 = method1;
                                }
                            }
                        }
                    }
                }
                catch(Throwable unused_ex) {
                }
            }
            if(method0 != null) {
                method0.setAccessible(true);
                synchronized(Qf.Zh) {
                    Qf.Zh.put(s1, method0);
                    return method0;
                }
            }
            class0 = class0.getSuperclass();
        }
        return null;
    }

    public static boolean PjT(Class class0, Class class1) {
        if(class1 == null) {
            return false;
        }
        if(class0 == null) {
            return !class1.isPrimitive();
        }
        if(class0.isPrimitive() && !class1.isPrimitive()) {
            class0 = (Class)Qf.ReZ.get(class0);
        }
        if(class1.isPrimitive() && !class0.isPrimitive()) {
            class1 = (Class)Qf.ReZ.get(class1);
        }
        return class1.isAssignableFrom(class0);
    }

    public static Class[] PjT(Object[] arr_object) {
        if(arr_object != null && arr_object.length != 0) {
            Class[] arr_class = new Class[arr_object.length];
            for(int v = 0; v < arr_object.length; ++v) {
                Object object0 = arr_object[v];
                arr_class[v] = object0 == null ? null : object0.getClass();
            }
            return arr_class;
        }
        return Qf.PjT;
    }

    private static String Zh(Class class0, String s, Class[] arr_class) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(class0.toString());
        stringBuilder0.append("#");
        stringBuilder0.append(s);
        stringBuilder0.append("#");
        Integer integer0 = class0.getClassLoader() == null ? "" : class0.getClassLoader().hashCode();
        stringBuilder0.append(integer0);
        if(arr_class != null && arr_class.length > 0) {
            for(int v = 0; v < arr_class.length; ++v) {
                stringBuilder0.append(arr_class[v].toString());
                stringBuilder0.append("#");
            }
            return stringBuilder0.toString();
        }
        stringBuilder0.append("class java.lang.Void");
        return stringBuilder0.toString();
    }
}

