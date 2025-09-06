package kotlin;

import androidx.collection.b;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.B;
import kotlin.ranges.x;
import y4.l;
import z3.g;

@W0(markerClass = {t.class})
@h0(version = "1.5")
@g
public final class z0 implements Comparable {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final byte a;
    @l
    public static final a b = null;
    public static final byte c = 0;
    public static final byte d = -1;
    public static final int e = 1;
    public static final int f = 8;

    static {
        z0.b = new a(null);
    }

    @b0
    @kotlin.internal.g
    private z0(byte b) {
        this.a = b;
    }

    @f
    private static final int A(byte b, byte b1) {
        return (b & 0xFF) - (b1 & 0xFF);
    }

    @f
    private static final long B(byte b, long v) {
        return (((long)b) & 0xFFL) - v;
    }

    @f
    private static final int C(byte b, int v) {
        return (b & 0xFF) - v;
    }

    @f
    private static final int D(byte b, short v) {
        return (b & 0xFF) - (v & 0xFFFF);
    }

    @f
    private static final byte E(byte b, byte b1) {
        return z0.h(((byte)(((int)((((long)D0.h(b & 0xFF)) & 0xFFFFFFFFL) % (((long)D0.h(b1 & 0xFF)) & 0xFFFFFFFFL))))));
    }

    @f
    private static final long F(byte b, long v) {
        return w0.a(((long)b) & 0xFFL, v);
    }

    @f
    private static final int G(byte b, int v) {
        return v0.a(D0.h(b & 0xFF), v);
    }

    @f
    private static final short H(byte b, short v) {
        return N0.h(((short)(((int)((((long)(b & 0xFF)) & 0xFFFFFFFFL) % (((long)(v & 0xFFFF)) & 0xFFFFFFFFL))))));
    }

    @f
    private static final byte I(byte b, byte b1) {
        return (byte)(b | b1);
    }

    @f
    private static final int J(byte b, byte b1) {
        return (b & 0xFF) + (b1 & 0xFF);
    }

    @f
    private static final long K(byte b, long v) {
        return (((long)b) & 0xFFL) + v;
    }

    @f
    private static final int L(byte b, int v) {
        return (b & 0xFF) + v;
    }

    @f
    private static final int M(byte b, short v) {
        return (b & 0xFF) + (v & 0xFFFF);
    }

    @f
    private static final x N(byte b, byte b1) {
        return new x(b & 0xFF, b1 & 0xFF, null);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @f
    private static final x O(byte b, byte b1) {
        return B.V(D0.h(b & 0xFF), D0.h(b1 & 0xFF));
    }

    @f
    private static final int P(byte b, byte b1) {
        return (int)((((long)(b & 0xFF)) & 0xFFFFFFFFL) % (((long)(b1 & 0xFF)) & 0xFFFFFFFFL));
    }

    @f
    private static final long Q(byte b, long v) {
        return w0.a(((long)b) & 0xFFL, v);
    }

    @f
    private static final int R(byte b, int v) {
        return (int)((((long)(b & 0xFF)) & 0xFFFFFFFFL) % (((long)v) & 0xFFFFFFFFL));
    }

    @f
    private static final int S(byte b, short v) {
        return (int)((((long)(b & 0xFF)) & 0xFFFFFFFFL) % (((long)(v & 0xFFFF)) & 0xFFFFFFFFL));
    }

    @f
    private static final int T(byte b, byte b1) {
        return (b & 0xFF) * (b1 & 0xFF);
    }

    @f
    private static final long U(byte b, long v) {
        return (((long)b) & 0xFFL) * v;
    }

    @f
    private static final int V(byte b, int v) {
        return (b & 0xFF) * v;
    }

    @f
    private static final int W(byte b, short v) {
        return (b & 0xFF) * (v & 0xFFFF);
    }

    @f
    private static final byte X(byte b) {
        return b;
    }

    @f
    private static final double Z(byte b) {
        return ((double)(0x7FFFFFFF & (b & 0xFF))) + ((double)((b & 0xFF) >>> 0x1F << 30)) * 2.0;
    }

    @f
    private static final byte a(byte b, byte b1) {
        return (byte)(b & b1);
    }

    @f
    private static final float a0(byte b) {
        return (float)V0.h(b & 0xFF);
    }

    public static final z0 b(byte b) {
        return new z0(b);
    }

    @f
    private static final int b0(byte b) {
        return b & 0xFF;
    }

    @f
    private int c(byte b) {
        return L.t(this.j0() & 0xFF, b & 0xFF);
    }

    @f
    private static final long c0(byte b) {
        return ((long)b) & 0xFFL;
    }

    @Override
    public int compareTo(Object object0) {
        return L.t(this.j0() & 0xFF, ((z0)object0).j0() & 0xFF);
    }

    @f
    private static int d(byte b, byte b1) {
        return L.t(b & 0xFF, b1 & 0xFF);
    }

    @f
    private static final short d0(byte b) {
        return (short)(((short)b) & 0xFF);
    }

    @f
    private static final int e(byte b, long v) {
        return b.a(((long)b) & 0xFFL, v);
    }

    @l
    public static String e0(byte b) {
        return String.valueOf(b & 0xFF);
    }

    @Override
    public boolean equals(Object object0) {
        return z0.n(this.a, object0);
    }

    @f
    private static final int f(byte b, int v) {
        return y0.a(b & 0xFF, v);
    }

    @f
    private static final byte f0(byte b) {
        return b;
    }

    @f
    private static final int g(byte b, short v) {
        return L.t(b & 0xFF, v & 0xFFFF);
    }

    @f
    private static final int g0(byte b) {
        return b & 0xFF;
    }

    @b0
    @kotlin.internal.g
    public static byte h(byte b) [...] // Inlined contents

    @f
    private static final long h0(byte b) {
        return ((long)b) & 0xFFL;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @f
    private static final byte i(byte b) {
        return (byte)(b - 1);
    }

    @f
    private static final short i0(byte b) {
        return (short)(((short)b) & 0xFF);
    }

    @f
    private static final int j(byte b, byte b1) {
        return (int)((((long)(b & 0xFF)) & 0xFFFFFFFFL) / (((long)(b1 & 0xFF)) & 0xFFFFFFFFL));
    }

    public final byte j0() {
        return this.a;
    }

    @f
    private static final long k(byte b, long v) {
        return x0.a(((long)b) & 0xFFL, v);
    }

    @f
    private static final byte k0(byte b, byte b1) {
        return (byte)(b ^ b1);
    }

    @f
    private static final int l(byte b, int v) {
        return (int)((((long)(b & 0xFF)) & 0xFFFFFFFFL) / (((long)v) & 0xFFFFFFFFL));
    }

    @f
    private static final int m(byte b, short v) {
        return u0.a(b & 0xFF, v & 0xFFFF);
    }

    public static boolean n(byte b, Object object0) {
        return object0 instanceof z0 ? b == ((z0)object0).j0() : false;
    }

    public static final boolean p(byte b, byte b1) {
        return b == b1;
    }

    @f
    private static final int r(byte b, byte b1) {
        return (int)((((long)(b & 0xFF)) & 0xFFFFFFFFL) / (((long)(b1 & 0xFF)) & 0xFFFFFFFFL));
    }

    @f
    private static final long s(byte b, long v) {
        return x0.a(((long)b) & 0xFFL, v);
    }

    @f
    private static final int t(byte b, int v) {
        return (int)((((long)(b & 0xFF)) & 0xFFFFFFFFL) / (((long)v) & 0xFFFFFFFFL));
    }

    @Override
    @l
    public String toString() {
        return z0.e0(this.a);
    }

    @f
    private static final int u(byte b, short v) {
        return u0.a(b & 0xFF, v & 0xFFFF);
    }

    @b0
    public static void v() {
    }

    public static int w(byte b) [...] // Inlined contents

    @f
    private static final byte y(byte b) {
        return (byte)(b + 1);
    }

    @f
    private static final byte z(byte b) {
        return (byte)(~b);
    }
}

