package com.apm.insight.h;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class a {
    public static final class com.apm.insight.h.a.a {
        public final Class a;
        public final Object b;

    }

    private static final Map a;

    static {
        HashMap hashMap0 = new HashMap();
        a.a = hashMap0;
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

    public static Object a(String s, String s1, Object[] arr_object) {
        Method method0;
        Class class1;
        try {
            Class class0 = Class.forName(s);
            Class[] arr_class = new Class[4];
            for(int v1 = 0; v1 < 4; ++v1) {
                Object object0 = arr_object[v1];
                if(object0 == null || !(object0 instanceof com.apm.insight.h.a.a)) {
                    class1 = object0 == null ? null : object0.getClass();
                }
                else {
                    class1 = ((com.apm.insight.h.a.a)object0).a;
                }
                arr_class[v1] = class1;
            }
            while(true) {
                Method[] arr_method = class0.getDeclaredMethods();
            alab1:
                for(int v2 = 0; true; ++v2) {
                    method0 = null;
                    if(v2 >= arr_method.length) {
                        break;
                    }
                    method0 = arr_method[v2];
                    if(method0.getName().equals(s1)) {
                        Class[] arr_class1 = method0.getParameterTypes();
                        if(arr_class1 != null && arr_class1.length == 4) {
                            int v3 = 0;
                            while(v3 < arr_class1.length) {
                                if(!arr_class1[v3].isAssignableFrom(arr_class[v3]) && (!a.a.containsKey(arr_class1[v3]) || !((Class)a.a.get(arr_class1[v3])).equals(a.a.get(arr_class[v3])))) {
                                    continue alab1;
                                }
                                ++v3;
                            }
                            break;
                        }
                    }
                }
                if(method0 != null) {
                    method0.setAccessible(true);
                    Object[] arr_object1 = new Object[4];
                    for(int v = 0; v < 4; ++v) {
                        Object object1 = arr_object[v];
                        arr_object1[v] = object1 == null || !(object1 instanceof com.apm.insight.h.a.a) ? object1 : ((com.apm.insight.h.a.a)object1).b;
                    }
                    return method0.invoke(null, arr_object1);
                }
                if(class0.getSuperclass() == null) {
                    throw new NoSuchMethodException();
                }
                class0 = class0.getSuperclass();
            }
        }
        catch(Exception exception0) {
        }
        Log.w("JavaCalls", "Meet exception when call Method \'" + s1 + "\' in " + s, exception0);
        return null;
    }
}

