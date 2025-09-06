package kotlin.collections;

import java.util.Collection;
import kotlin.A0;
import kotlin.D0;
import kotlin.E0;
import kotlin.H0;
import kotlin.I0;
import kotlin.N0;
import kotlin.O0;
import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.t;
import kotlin.z0;
import y4.l;
import z3.i;

class u0 {
    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @i(name = "sumOfUByte")
    public static final int a(@l Iterable iterable0) {
        L.p(iterable0, "<this>");
        int v = 0;
        for(Object object0: iterable0) {
            v = D0.h(v + D0.h(((z0)object0).j0() & 0xFF));
        }
        return v;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @i(name = "sumOfUInt")
    public static final int b(@l Iterable iterable0) {
        L.p(iterable0, "<this>");
        int v = 0;
        for(Object object0: iterable0) {
            v = D0.h(v + ((D0)object0).l0());
        }
        return v;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @i(name = "sumOfULong")
    public static final long c(@l Iterable iterable0) {
        L.p(iterable0, "<this>");
        long v = 0L;
        for(Object object0: iterable0) {
            v = H0.h(v + ((H0)object0).l0());
        }
        return v;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @i(name = "sumOfUShort")
    public static final int d(@l Iterable iterable0) {
        L.p(iterable0, "<this>");
        int v = 0;
        for(Object object0: iterable0) {
            v = D0.h(v + D0.h(((N0)object0).j0() & 0xFFFF));
        }
        return v;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final byte[] e(@l Collection collection0) {
        L.p(collection0, "<this>");
        byte[] arr_b = A0.c(collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            A0.u(arr_b, v, ((z0)object0).j0());
            ++v;
        }
        return arr_b;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final int[] f(@l Collection collection0) {
        L.p(collection0, "<this>");
        int[] arr_v = E0.c(collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            E0.u(arr_v, v, ((D0)object0).l0());
            ++v;
        }
        return arr_v;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final long[] g(@l Collection collection0) {
        L.p(collection0, "<this>");
        long[] arr_v = I0.c(collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            I0.u(arr_v, v, ((H0)object0).l0());
            ++v;
        }
        return arr_v;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final short[] h(@l Collection collection0) {
        L.p(collection0, "<this>");
        short[] arr_v = O0.c(collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            O0.u(arr_v, v, ((N0)object0).j0());
            ++v;
        }
        return arr_v;
    }
}

