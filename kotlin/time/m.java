package kotlin.time;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class m {
    private static final long a(long v, long v1, long v2) {
        if(e.d0(v1) && (v ^ v2) < 0L) {
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        return v;
    }

    // 去混淆评级： 低(40)
    private static final long b(long v) {
        return Long.compare(v, 0L) >= 0 ? 0x7FFFFFFFFFFFFFFFL : 0x8000000000000003L;
    }

    public static final boolean c(long v) {
        return (v - 1L | 1L) == 0x7FFFFFFFFFFFFFFFL;
    }

    public static final long d(long v, @l h h0, long v1) {
        L.p(h0, "unit");
        long v2 = e.r0(v1, h0);
        if((v - 1L | 1L) == 0x7FFFFFFFFFFFFFFFL) {
            return m.a(v, v1, v2);
        }
        if((1L | v2 - 1L) == 0x7FFFFFFFFFFFFFFFL) {
            return m.e(v, h0, v1);
        }
        long v3 = v + v2;
        if(((v ^ v3) & (v2 ^ v3)) < 0L) {
            return v >= 0L ? 0x7FFFFFFFFFFFFFFFL : 0x8000000000000000L;
        }
        return v3;
    }

    private static final long e(long v, h h0, long v1) {
        long v2 = e.l(v1, 2);
        long v3 = e.r0(v2, h0);
        return (1L | v3 - 1L) == 0x7FFFFFFFFFFFFFFFL ? v3 : m.d(m.d(v, h0, v2), h0, e.g0(v1, v2));
    }

    public static final long f(long v, long v1, @l h h0) {
        L.p(h0, "unit");
        return (1L | v1 - 1L) == 0x7FFFFFFFFFFFFFFFL ? e.z0(m.b(v1)) : m.g(v, v1, h0);
    }

    private static final long g(long v, long v1, h h0) {
        long v2 = v - v1;
        if(((v2 ^ v) & ~(v2 ^ v1)) < 0L) {
            h h1 = h.d;
            if(h0.compareTo(h1) < 0) {
                long v3 = j.b(1L, h1, h0);
                return e.h0(g.n0(v / v3 - v1 / v3, h1), g.n0(v % v3 - v1 % v3, h0));
            }
            return e.z0(m.b(v2));
        }
        return g.n0(v2, h0);
    }

    public static final long h(long v, long v1, @l h h0) {
        L.p(h0, "unit");
        if((v1 - 1L | 1L) == 0x7FFFFFFFFFFFFFFFL) {
            return v == v1 ? 0L : e.z0(m.b(v1));
        }
        return (1L | v - 1L) == 0x7FFFFFFFFFFFFFFFL ? m.b(v) : m.g(v, v1, h0);
    }
}

