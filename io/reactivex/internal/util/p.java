package io.reactivex.internal.util;

import e3.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class p implements c {
    final Comparator a;

    public p(Comparator comparator0) {
        this.a = comparator0;
    }

    public List a(List list0, List list1) throws Exception {
        Object object1;
        int v = list0.size() + list1.size();
        if(v == 0) {
            return new ArrayList();
        }
        List list2 = new ArrayList(v);
        Iterator iterator0 = list0.iterator();
        Iterator iterator1 = list1.iterator();
        Object object0 = iterator0.hasNext() ? iterator0.next() : null;
        if(iterator1.hasNext()) {
            object1 = iterator1.next();
            goto label_11;
        }
        while(true) {
            object1 = null;
        label_11:
            if(object0 == null || object1 == null) {
                break;
            }
            if(this.a.compare(object0, object1) < 0) {
                list2.add(object0);
                object0 = iterator0.hasNext() ? iterator0.next() : null;
                goto label_11;
            }
            list2.add(object1);
            if(!iterator1.hasNext()) {
                continue;
            }
            object1 = iterator1.next();
            goto label_11;
        }
        if(object0 != null) {
            list2.add(object0);
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                list2.add(object2);
            }
            return list2;
        }
        list2.add(object1);
        while(iterator1.hasNext()) {
            Object object3 = iterator1.next();
            list2.add(object3);
        }
        return list2;
    }

    @Override  // e3.c
    public Object apply(Object object0, Object object1) throws Exception {
        return this.a(((List)object0), ((List)object1));
    }
}

