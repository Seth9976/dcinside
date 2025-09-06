package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

public final class ListImplementation {
    @l
    public static final ListImplementation a;

    static {
        ListImplementation.a = new ListImplementation();
    }

    @n
    public static final void a(int v, int v1) {
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException("index: " + v + ", size: " + v1);
        }
    }

    @n
    public static final void b(int v, int v1) {
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException("index: " + v + ", size: " + v1);
        }
    }

    @n
    public static final void c(int v, int v1, int v2) {
        if(v < 0 || v1 > v2) {
            throw new IndexOutOfBoundsException("fromIndex: " + v + ", toIndex: " + v1 + ", size: " + v2);
        }
        if(v > v1) {
            throw new IllegalArgumentException("fromIndex: " + v + " > toIndex: " + v1);
        }
    }

    @n
    public static final boolean d(@l Collection collection0, @l Collection collection1) {
        L.p(collection0, "c");
        L.p(collection1, "other");
        if(collection0.size() != collection1.size()) {
            return false;
        }
        Iterator iterator0 = collection1.iterator();
        for(Object object0: collection0) {
            Object object1 = iterator0.next();
            if(!L.g(object0, object1)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @n
    public static final int e(@l Collection collection0) {
        L.p(collection0, "c");
        int v = 1;
        for(Object object0: collection0) {
            v = v * 0x1F + (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }
}

