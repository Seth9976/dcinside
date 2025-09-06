package kotlin.comparisons;

import androidx.collection.b;
import kotlin.A0;
import kotlin.E0;
import kotlin.I0;
import kotlin.O0;
import kotlin.W0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.t;
import kotlin.y0;
import y4.l;

class n {
    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static final short a(short v, short v1) {
        return L.t(v & 0xFFFF, 0xFFFF & v1) >= 0 ? v : v1;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static int b(int v, int v1) {
        return y0.a(v, v1) >= 0 ? v : v1;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static final byte c(byte b, byte b1) {
        return L.t(b & 0xFF, b1 & 0xFF) >= 0 ? b : b1;
    }

    @h0(version = "1.4")
    @t
    public static final int d(int v, @l int[] arr_v) {
        L.p(arr_v, "other");
        int v1 = E0.o(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = m.b(v, E0.l(arr_v, v2));
        }
        return v;
    }

    @h0(version = "1.4")
    @t
    public static final long e(long v, @l long[] arr_v) {
        L.p(arr_v, "other");
        int v1 = I0.o(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = m.j(v, I0.l(arr_v, v2));
        }
        return v;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    private static final short f(short v, short v1, short v2) {
        return n.a(v, n.a(v1, v2));
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    private static final int g(int v, int v1, int v2) {
        return m.b(v, m.b(v1, v2));
    }

    @h0(version = "1.4")
    @t
    public static final byte h(byte b, @l byte[] arr_b) {
        L.p(arr_b, "other");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            b = n.c(b, A0.l(arr_b, v1));
        }
        return b;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    private static final byte i(byte b, byte b1, byte b2) {
        return n.c(b, n.c(b1, b2));
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static long j(long v, long v1) {
        return b.a(v, v1) >= 0 ? v : v1;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    private static final long k(long v, long v1, long v2) {
        return m.j(v, m.j(v1, v2));
    }

    @h0(version = "1.4")
    @t
    public static final short l(short v, @l short[] arr_v) {
        L.p(arr_v, "other");
        int v1 = O0.o(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = n.a(v, O0.l(arr_v, v2));
        }
        return v;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static final short m(short v, short v1) {
        return L.t(v & 0xFFFF, 0xFFFF & v1) <= 0 ? v : v1;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static int n(int v, int v1) {
        return y0.a(v, v1) <= 0 ? v : v1;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static final byte o(byte b, byte b1) {
        return L.t(b & 0xFF, b1 & 0xFF) <= 0 ? b : b1;
    }

    @h0(version = "1.4")
    @t
    public static final int p(int v, @l int[] arr_v) {
        L.p(arr_v, "other");
        int v1 = E0.o(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = m.n(v, E0.l(arr_v, v2));
        }
        return v;
    }

    @h0(version = "1.4")
    @t
    public static final long q(long v, @l long[] arr_v) {
        L.p(arr_v, "other");
        int v1 = I0.o(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = m.v(v, I0.l(arr_v, v2));
        }
        return v;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    private static final short r(short v, short v1, short v2) {
        return n.m(v, n.m(v1, v2));
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    private static final int s(int v, int v1, int v2) {
        return m.n(v, m.n(v1, v2));
    }

    @h0(version = "1.4")
    @t
    public static final byte t(byte b, @l byte[] arr_b) {
        L.p(arr_b, "other");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            b = n.o(b, A0.l(arr_b, v1));
        }
        return b;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    private static final byte u(byte b, byte b1, byte b2) {
        return n.o(b, n.o(b1, b2));
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static long v(long v, long v1) {
        return b.a(v, v1) <= 0 ? v : v1;
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    @f
    private static final long w(long v, long v1, long v2) {
        return m.v(v, m.v(v1, v2));
    }

    @h0(version = "1.4")
    @t
    public static final short x(short v, @l short[] arr_v) {
        L.p(arr_v, "other");
        int v1 = O0.o(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = n.m(v, O0.l(arr_v, v2));
        }
        return v;
    }
}

