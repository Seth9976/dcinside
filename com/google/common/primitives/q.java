package com.google.common.primitives;

import J1.b;
import com.google.common.base.H;
import j..util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@b
@f
public final class q {
    private static final Map a;
    private static final Map b;

    static {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(16);
        q.a(linkedHashMap0, linkedHashMap1, Boolean.TYPE, Boolean.class);
        q.a(linkedHashMap0, linkedHashMap1, Byte.TYPE, Byte.class);
        q.a(linkedHashMap0, linkedHashMap1, Character.TYPE, Character.class);
        q.a(linkedHashMap0, linkedHashMap1, Double.TYPE, Double.class);
        q.a(linkedHashMap0, linkedHashMap1, Float.TYPE, Float.class);
        q.a(linkedHashMap0, linkedHashMap1, Integer.TYPE, Integer.class);
        q.a(linkedHashMap0, linkedHashMap1, Long.TYPE, Long.class);
        q.a(linkedHashMap0, linkedHashMap1, Short.TYPE, Short.class);
        q.a(linkedHashMap0, linkedHashMap1, Void.TYPE, Void.class);
        q.a = DesugarCollections.unmodifiableMap(linkedHashMap0);
        q.b = DesugarCollections.unmodifiableMap(linkedHashMap1);
    }

    private static void a(Map map0, Map map1, Class class0, Class class1) {
        map0.put(class0, class1);
        map1.put(class1, class0);
    }

    public static Set b() {
        return q.a.keySet();
    }

    public static Set c() {
        return q.b.keySet();
    }

    public static boolean d(Class class0) {
        Object object0 = H.E(class0);
        return q.b.containsKey(object0);
    }

    public static Class e(Class class0) {
        H.E(class0);
        Class class1 = (Class)q.b.get(class0);
        return class1 == null ? class0 : class1;
    }

    public static Class f(Class class0) {
        H.E(class0);
        Class class1 = (Class)q.a.get(class0);
        return class1 == null ? class0 : class1;
    }
}

