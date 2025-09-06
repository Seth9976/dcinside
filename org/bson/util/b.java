package org.bson.util;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

class b {
    private static final ConcurrentMap a;

    static {
        b.a = e.i();
    }

    private static List a(Class class0) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(Object.class);
        b.b(class0, arrayList0);
        Collections.reverse(arrayList0);
        return DesugarCollections.unmodifiableList(new ArrayList(arrayList0));
    }

    private static void b(Class class0, List list0) {
        if(class0 != null && class0 != Object.class) {
            Class[] arr_class = class0.getInterfaces();
            for(int v = arr_class.length - 1; v >= 0; --v) {
                b.b(arr_class[v], list0);
            }
            b.b(class0.getSuperclass(), list0);
            if(!list0.contains(class0)) {
                list0.add(class0);
            }
        }
    }

    public static List c(Class class0) {
        ConcurrentMap concurrentMap0 = b.d();
        List list0;
        while((list0 = (List)concurrentMap0.get(class0)) == null) {
            concurrentMap0.putIfAbsent(class0, b.a(class0));
        }
        return list0;
    }

    private static ConcurrentMap d() {
        return b.a;
    }
}

