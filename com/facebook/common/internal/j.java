package com.facebook.common.internal;

import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import k1.n.a;
import k1.n;

@n(a.a)
public class j extends HashMap {
    private j(Map map0) {
        super(map0);
    }

    public static j a(Map map0) {
        return new j(map0);
    }

    @Override
    public static Map of() {
        return DesugarCollections.unmodifiableMap(new HashMap());
    }

    @Override
    public static Map of(Object object0, Object object1) {
        HashMap hashMap0 = new HashMap(1);
        hashMap0.put(object0, object1);
        return DesugarCollections.unmodifiableMap(hashMap0);
    }

    @Override
    public static Map of(Object object0, Object object1, Object object2, Object object3) {
        HashMap hashMap0 = new HashMap(2);
        hashMap0.put(object0, object1);
        hashMap0.put(object2, object3);
        return DesugarCollections.unmodifiableMap(hashMap0);
    }

    @Override
    public static Map of(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        HashMap hashMap0 = new HashMap(3);
        hashMap0.put(object0, object1);
        hashMap0.put(object2, object3);
        hashMap0.put(object4, object5);
        return DesugarCollections.unmodifiableMap(hashMap0);
    }

    @Override
    public static Map of(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        HashMap hashMap0 = new HashMap(4);
        hashMap0.put(object0, object1);
        hashMap0.put(object2, object3);
        hashMap0.put(object4, object5);
        hashMap0.put(object6, object7);
        return DesugarCollections.unmodifiableMap(hashMap0);
    }

    @Override
    public static Map of(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        HashMap hashMap0 = new HashMap(5);
        hashMap0.put(object0, object1);
        hashMap0.put(object2, object3);
        hashMap0.put(object4, object5);
        hashMap0.put(object6, object7);
        hashMap0.put(object8, object9);
        return DesugarCollections.unmodifiableMap(hashMap0);
    }

    @Override
    public static Map of(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11) {
        HashMap hashMap0 = new HashMap(6);
        hashMap0.put(object0, object1);
        hashMap0.put(object2, object3);
        hashMap0.put(object4, object5);
        hashMap0.put(object6, object7);
        hashMap0.put(object8, object9);
        hashMap0.put(object10, object11);
        return DesugarCollections.unmodifiableMap(hashMap0);
    }
}

