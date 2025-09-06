package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import j..util.Comparator.-EL;
import j..util.stream.Collector.-CC;
import j..util.stream.Collector.Characteristics;
import j..util.stream.Collector;
import java.util.Comparator;
import java.util.Iterator;

@b
@C1
public final class o1 {
    @G2
    static Collector b(int v, Comparator comparator0) {
        return o1.f(v, Comparator.-EL.reversed(comparator0));
    }

    public static boolean c(Iterable iterable0, Comparator comparator0) {
        H.E(comparator0);
        Iterator iterator0 = iterable0.iterator();
        if(iterator0.hasNext()) {
            for(Object object0 = iterator0.next(); iterator0.hasNext(); object0 = object1) {
                Object object1 = iterator0.next();
                if(comparator0.compare(object0, object1) > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean d(Iterable iterable0, Comparator comparator0) {
        H.E(comparator0);
        Iterator iterator0 = iterable0.iterator();
        if(iterator0.hasNext()) {
            for(Object object0 = iterator0.next(); iterator0.hasNext(); object0 = object1) {
                Object object1 = iterator0.next();
                if(comparator0.compare(object0, object1) >= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @G2
    static Collector f(int v, Comparator comparator0) {
        c1.b(v, "k");
        H.E(comparator0);
        return Collector.-CC.of(new k1(v, comparator0), new l1(), new m1(), new n1(), new Characteristics[]{Characteristics.UNORDERED});
    }

    public static Comparator g(Comparator comparator0) {
        return new s3(((Comparator)H.E(comparator0)));
    }

    public static Comparable h(Comparable comparable0, Comparable comparable1) {
        return comparable0.compareTo(comparable1) >= 0 ? comparable0 : comparable1;
    }

    @d4
    public static Object i(@d4 Object object0, @d4 Object object1, Comparator comparator0) {
        return comparator0.compare(object0, object1) >= 0 ? object0 : object1;
    }

    public static Comparable j(Comparable comparable0, Comparable comparable1) {
        return comparable0.compareTo(comparable1) <= 0 ? comparable0 : comparable1;
    }

    @d4
    public static Object k(@d4 Object object0, @d4 Object object1, Comparator comparator0) {
        return comparator0.compare(object0, object1) <= 0 ? object0 : object1;
    }
}

