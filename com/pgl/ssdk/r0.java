package com.pgl.ssdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class r0 {
    public static class a {
        public final Class a;
        public final Object b;

    }

    private static final Map a;

    static {
        HashMap hashMap0 = new HashMap();
        r0.a = hashMap0;
        Class class0 = Boolean.TYPE;
        hashMap0.put(Boolean.class, class0);
        Class class1 = Byte.TYPE;
        hashMap0.put(Byte.class, class1);
        Class class2 = Character.TYPE;
        hashMap0.put(Character.class, class2);
        Class class3 = Short.TYPE;
        hashMap0.put(Short.class, class3);
        Class class4 = Integer.TYPE;
        hashMap0.put(Integer.class, class4);
        Class class5 = Float.TYPE;
        hashMap0.put(Float.class, class5);
        Class class6 = Long.TYPE;
        hashMap0.put(Long.class, class6);
        Class class7 = Double.TYPE;
        hashMap0.put(Double.class, class7);
        hashMap0.put(class0, class0);
        hashMap0.put(class1, class1);
        hashMap0.put(class2, class2);
        hashMap0.put(class3, class3);
        hashMap0.put(class4, class4);
        hashMap0.put(class5, class5);
        hashMap0.put(class6, class6);
        hashMap0.put(class7, class7);
    }

    private static Method a(Class class0, String s, Class[] arr_class) throws NoSuchMethodException, SecurityException {
        Method method0 = r0.a(class0.getDeclaredMethods(), s, arr_class);
        if(method0 == null) {
            if(class0.getSuperclass() == null) {
                throw new NoSuchMethodException();
            }
            return r0.a(class0.getSuperclass(), s, arr_class);
        }
        method0.setAccessible(true);
        return method0;
    }

    private static Method a(Method[] arr_method, String s, Class[] arr_class) {
        if(s == null) {
            throw new NullPointerException("Method name must not be null.");
        }
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            if(method0.getName().equals(s) && r0.a(method0.getParameterTypes(), arr_class)) {
                return method0;
            }
        }
        return null;
    }

    public static void a(Class class0, String s, Object[] arr_object) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        r0.a(class0, s, r0.a(arr_object)).invoke(null, r0.b(arr_object));
    }

    public static void a(String s, String s1, Object[] arr_object) {
        try {
            r0.a(Class.forName(s), s1, arr_object);
        }
        catch(Exception unused_ex) {
        }
    }

    private static boolean a(Class[] arr_class, Class[] arr_class1) {
        if(arr_class == null) {
            return arr_class1 == null || arr_class1.length == 0;
        }
        if(arr_class1 == null) {
            return arr_class.length == 0;
        }
        if(arr_class.length != arr_class1.length) {
            return false;
        }
        for(int v = 0; v < arr_class.length; ++v) {
            if(!arr_class[v].isAssignableFrom(arr_class1[v]) && (!r0.a.containsKey(arr_class[v]) || !((Class)r0.a.get(arr_class[v])).equals(r0.a.get(arr_class1[v])))) {
                return false;
            }
        }
        return true;
    }

    private static Class[] a(Object[] arr_object) {
        if(arr_object != null && arr_object.length > 0) {
            Class[] arr_class = new Class[arr_object.length];
            for(int v = 0; v < arr_object.length; ++v) {
                Object object0 = arr_object[v];
                if(object0 == null || !(object0 instanceof a)) {
                    arr_class[v] = object0 == null ? null : object0.getClass();
                }
                else {
                    arr_class[v] = ((a)object0).a;
                }
            }
            return arr_class;
        }
        return null;
    }

    private static Object[] b(Object[] arr_object) {
        if(arr_object != null && arr_object.length > 0) {
            Object[] arr_object1 = new Object[arr_object.length];
            for(int v = 0; v < arr_object.length; ++v) {
                Object object0 = arr_object[v];
                arr_object1[v] = object0 == null || !(object0 instanceof a) ? object0 : ((a)object0).b;
            }
            return arr_object1;
        }
        return null;
    }
}

