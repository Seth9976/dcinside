package kotlin.comparisons;

import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import y4.l;

class h extends g {
    @h0(version = "1.1")
    @f
    private static final byte I(byte b, byte b1) {
        return (byte)Math.max(b, b1);
    }

    @h0(version = "1.1")
    @f
    private static final byte J(byte b, byte b1, byte b2) {
        return (byte)Math.max(b, Math.max(b1, b2));
    }

    @h0(version = "1.4")
    public static final byte K(byte b, @l byte[] arr_b) {
        L.p(arr_b, "other");
        for(int v = 0; v < arr_b.length; ++v) {
            b = (byte)Math.max(b, arr_b[v]);
        }
        return b;
    }

    @h0(version = "1.1")
    @f
    private static final double L(double f, double f1) {
        return Math.max(f, f1);
    }

    @h0(version = "1.1")
    @f
    private static final double M(double f, double f1, double f2) {
        return Math.max(f, Math.max(f1, f2));
    }

    @h0(version = "1.4")
    public static final double N(double f, @l double[] arr_f) {
        L.p(arr_f, "other");
        for(int v = 0; v < arr_f.length; ++v) {
            f = Math.max(f, arr_f[v]);
        }
        return f;
    }

    @h0(version = "1.1")
    @f
    private static final float O(float f, float f1) {
        return Math.max(f, f1);
    }

    @h0(version = "1.1")
    @f
    private static final float P(float f, float f1, float f2) {
        return Math.max(f, Math.max(f1, f2));
    }

    @h0(version = "1.4")
    public static float Q(float f, @l float[] arr_f) {
        L.p(arr_f, "other");
        for(int v = 0; v < arr_f.length; ++v) {
            f = Math.max(f, arr_f[v]);
        }
        return f;
    }

    @h0(version = "1.1")
    @f
    private static final int R(int v, int v1) {
        return Math.max(v, v1);
    }

    @h0(version = "1.1")
    @f
    private static final int S(int v, int v1, int v2) {
        return Math.max(v, Math.max(v1, v2));
    }

    @h0(version = "1.4")
    public static final int T(int v, @l int[] arr_v) {
        L.p(arr_v, "other");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = Math.max(v, arr_v[v1]);
        }
        return v;
    }

    @h0(version = "1.1")
    @f
    private static final long U(long v, long v1) {
        return Math.max(v, v1);
    }

    @h0(version = "1.1")
    @f
    private static final long V(long v, long v1, long v2) {
        return Math.max(v, Math.max(v1, v2));
    }

    @h0(version = "1.4")
    public static final long W(long v, @l long[] arr_v) {
        L.p(arr_v, "other");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = Math.max(v, arr_v[v1]);
        }
        return v;
    }

    @h0(version = "1.1")
    @l
    public static Comparable X(@l Comparable comparable0, @l Comparable comparable1) {
        L.p(comparable0, "a");
        L.p(comparable1, "b");
        return comparable0.compareTo(comparable1) >= 0 ? comparable0 : comparable1;
    }

    @h0(version = "1.1")
    @l
    public static final Comparable Y(@l Comparable comparable0, @l Comparable comparable1, @l Comparable comparable2) {
        L.p(comparable0, "a");
        L.p(comparable1, "b");
        L.p(comparable2, "c");
        return a.X(comparable0, a.X(comparable1, comparable2));
    }

    @h0(version = "1.4")
    @l
    public static final Comparable Z(@l Comparable comparable0, @l Comparable[] arr_comparable) {
        L.p(comparable0, "a");
        L.p(arr_comparable, "other");
        for(int v = 0; v < arr_comparable.length; ++v) {
            comparable0 = a.X(comparable0, arr_comparable[v]);
        }
        return comparable0;
    }

    @h0(version = "1.1")
    @f
    private static final short a0(short v, short v1) {
        return (short)Math.max(v, v1);
    }

    @h0(version = "1.1")
    @f
    private static final short b0(short v, short v1, short v2) {
        return (short)Math.max(v, Math.max(v1, v2));
    }

    @h0(version = "1.4")
    public static final short c0(short v, @l short[] arr_v) {
        L.p(arr_v, "other");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = (short)Math.max(v, arr_v[v1]);
        }
        return v;
    }

    @h0(version = "1.1")
    @f
    private static final byte d0(byte b, byte b1) {
        return (byte)Math.min(b, b1);
    }

    @h0(version = "1.1")
    @f
    private static final byte e0(byte b, byte b1, byte b2) {
        return (byte)Math.min(b, Math.min(b1, b2));
    }

    @h0(version = "1.4")
    public static final byte f0(byte b, @l byte[] arr_b) {
        L.p(arr_b, "other");
        for(int v = 0; v < arr_b.length; ++v) {
            b = (byte)Math.min(b, arr_b[v]);
        }
        return b;
    }

    @h0(version = "1.1")
    @f
    private static final double g0(double f, double f1) {
        return Math.min(f, f1);
    }

    @h0(version = "1.1")
    @f
    private static final double h0(double f, double f1, double f2) {
        return Math.min(f, Math.min(f1, f2));
    }

    @h0(version = "1.4")
    public static final double i0(double f, @l double[] arr_f) {
        L.p(arr_f, "other");
        for(int v = 0; v < arr_f.length; ++v) {
            f = Math.min(f, arr_f[v]);
        }
        return f;
    }

    @h0(version = "1.1")
    @f
    private static final float j0(float f, float f1) {
        return Math.min(f, f1);
    }

    @h0(version = "1.1")
    @f
    private static final float k0(float f, float f1, float f2) {
        return Math.min(f, Math.min(f1, f2));
    }

    @h0(version = "1.4")
    public static float l0(float f, @l float[] arr_f) {
        L.p(arr_f, "other");
        for(int v = 0; v < arr_f.length; ++v) {
            f = Math.min(f, arr_f[v]);
        }
        return f;
    }

    @h0(version = "1.1")
    @f
    private static final int m0(int v, int v1) {
        return Math.min(v, v1);
    }

    @h0(version = "1.1")
    @f
    private static final int n0(int v, int v1, int v2) {
        return Math.min(v, Math.min(v1, v2));
    }

    @h0(version = "1.4")
    public static final int o0(int v, @l int[] arr_v) {
        L.p(arr_v, "other");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = Math.min(v, arr_v[v1]);
        }
        return v;
    }

    @h0(version = "1.1")
    @f
    private static final long p0(long v, long v1) {
        return Math.min(v, v1);
    }

    @h0(version = "1.1")
    @f
    private static final long q0(long v, long v1, long v2) {
        return Math.min(v, Math.min(v1, v2));
    }

    @h0(version = "1.4")
    public static final long r0(long v, @l long[] arr_v) {
        L.p(arr_v, "other");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = Math.min(v, arr_v[v1]);
        }
        return v;
    }

    @h0(version = "1.1")
    @l
    public static final Comparable s0(@l Comparable comparable0, @l Comparable comparable1) {
        L.p(comparable0, "a");
        L.p(comparable1, "b");
        return comparable0.compareTo(comparable1) <= 0 ? comparable0 : comparable1;
    }

    @h0(version = "1.1")
    @l
    public static final Comparable t0(@l Comparable comparable0, @l Comparable comparable1, @l Comparable comparable2) {
        L.p(comparable0, "a");
        L.p(comparable1, "b");
        L.p(comparable2, "c");
        return h.s0(comparable0, h.s0(comparable1, comparable2));
    }

    @h0(version = "1.4")
    @l
    public static final Comparable u0(@l Comparable comparable0, @l Comparable[] arr_comparable) {
        L.p(comparable0, "a");
        L.p(arr_comparable, "other");
        for(int v = 0; v < arr_comparable.length; ++v) {
            comparable0 = h.s0(comparable0, arr_comparable[v]);
        }
        return comparable0;
    }

    @h0(version = "1.1")
    @f
    private static final short v0(short v, short v1) {
        return (short)Math.min(v, v1);
    }

    @h0(version = "1.1")
    @f
    private static final short w0(short v, short v1, short v2) {
        return (short)Math.min(v, Math.min(v1, v2));
    }

    @h0(version = "1.4")
    public static final short x0(short v, @l short[] arr_v) {
        L.p(arr_v, "other");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = (short)Math.min(v, arr_v[v1]);
        }
        return v;
    }
}

