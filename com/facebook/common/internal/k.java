package com.facebook.common.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k1.n.a;
import k1.n;

@n(a.a)
public class k extends HashSet {
    private k(Set set0) {
        super(set0);
    }

    public static k a(Set set0) {
        return new k(set0);
    }

    public static k b(Object[] arr_object) {
        HashSet hashSet0 = new HashSet(arr_object.length);
        Collections.addAll(hashSet0, arr_object);
        return new k(hashSet0);
    }
}

