package com.facebook.common.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import k1.n.a;
import k1.n;

@n(a.a)
public final class p {
    public static CopyOnWriteArraySet a() {
        return new CopyOnWriteArraySet();
    }

    public static HashSet b() {
        return new HashSet();
    }

    // 去混淆评级： 低(20)
    public static HashSet c(Iterable iterable0) {
        return iterable0 instanceof Collection ? new HashSet(((Collection)iterable0)) : p.d(iterable0.iterator());
    }

    public static HashSet d(Iterator iterator0) {
        HashSet hashSet0 = p.b();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            hashSet0.add(object0);
        }
        return hashSet0;
    }

    public static HashSet e(Object[] arr_object) {
        HashSet hashSet0 = p.f(arr_object.length);
        Collections.addAll(hashSet0, arr_object);
        return hashSet0;
    }

    public static HashSet f(int v) {
        return new HashSet(v);
    }

    public static Set g() {
        return p.i(new IdentityHashMap());
    }

    public static LinkedHashSet h() {
        return new LinkedHashSet();
    }

    public static Set i(Map map0) {
        return Collections.newSetFromMap(map0);
    }
}

