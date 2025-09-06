package org.jsoup.select;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.jsoup.helper.i;
import org.jsoup.nodes.o;

public class n {
    public static class a extends IllegalStateException {
        public a(String s) {
            super(s);
        }

        public a(String s, Object[] arr_object) {
            super(String.format(s, arr_object));
        }

        public a(Throwable throwable0, String s, Object[] arr_object) {
            super(String.format(s, arr_object), throwable0);
        }
    }

    static e a(Collection collection0, Collection collection1) {
        e e0 = new e();
        Iterator iterator0 = collection0.iterator();
    label_2:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            o o0 = (o)object0;
            for(Object object1: collection1) {
                if(o0.equals(((o)object1))) {
                    continue label_2;
                }
                if(false) {
                    break;
                }
            }
            e0.add(o0);
        }
        return e0;
    }

    public static e b(String s, Iterable iterable0) {
        i.l(s);
        i.o(iterable0);
        g g0 = m.t(s);
        e e0 = new e();
        IdentityHashMap identityHashMap0 = new IdentityHashMap();
        for(Object object0: iterable0) {
            for(Object object1: n.d(g0, ((o)object0))) {
                o o0 = (o)object1;
                if(identityHashMap0.put(o0, Boolean.TRUE) == null) {
                    e0.add(o0);
                }
            }
        }
        return e0;
    }

    public static e c(String s, o o0) {
        i.l(s);
        return n.d(m.t(s), o0);
    }

    public static e d(g g0, o o0) {
        i.o(g0);
        i.o(o0);
        return b.a(g0, o0);
    }

    public static o e(String s, o o0) {
        i.l(s);
        return b.b(m.t(s), o0);
    }
}

