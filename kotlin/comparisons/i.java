package kotlin.comparisons;

import java.util.Comparator;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

class i extends h {
    @h0(version = "1.4")
    public static final Object A0(Object object0, @l Object[] arr_object, @l Comparator comparator0) {
        L.p(arr_object, "other");
        L.p(comparator0, "comparator");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object1 = arr_object[v];
            if(comparator0.compare(object0, object1) < 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @h0(version = "1.1")
    public static final Object B0(Object object0, Object object1, Object object2, @l Comparator comparator0) {
        L.p(comparator0, "comparator");
        return i.C0(object0, i.C0(object1, object2, comparator0), comparator0);
    }

    @h0(version = "1.1")
    public static final Object C0(Object object0, Object object1, @l Comparator comparator0) {
        L.p(comparator0, "comparator");
        return comparator0.compare(object0, object1) <= 0 ? object0 : object1;
    }

    @h0(version = "1.4")
    public static final Object D0(Object object0, @l Object[] arr_object, @l Comparator comparator0) {
        L.p(arr_object, "other");
        L.p(comparator0, "comparator");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object1 = arr_object[v];
            if(comparator0.compare(object0, object1) > 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @h0(version = "1.1")
    public static final Object y0(Object object0, Object object1, Object object2, @l Comparator comparator0) {
        L.p(comparator0, "comparator");
        return i.z0(object0, i.z0(object1, object2, comparator0), comparator0);
    }

    @h0(version = "1.1")
    public static final Object z0(Object object0, Object object1, @l Comparator comparator0) {
        L.p(comparator0, "comparator");
        return comparator0.compare(object0, object1) >= 0 ? object0 : object1;
    }
}

