package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.b0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n473#3:568\n154#3:569\n58#4:562\n51#4:563\n92#4:564\n88#4:565\n75#4:566\n71#4:567\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n391#1:558\n404#1:560\n391#1:559\n404#1:561\n447#1:568\n457#1:569\n418#1:562\n425#1:563\n434#1:564\n437#1:565\n440#1:566\n443#1:567\n*E\n"})
@g
public final class DpSize {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final long a() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long b() [...] // 潜在的解密器
    }

    private final long a;
    @l
    public static final Companion b;
    private static final long c;
    private static final long d;

    static {
        DpSize.b = new Companion(null);
        DpSize.c = DpKt.b(0.0f, 0.0f);
        DpSize.d = DpKt.b(NaNf, NaNf);
    }

    private DpSize(long v) {
        this.a = v;
    }

    public static final long a() [...] // 潜在的解密器

    public static final long b() [...] // 潜在的解密器

    public static final DpSize c(long v) {
        return new DpSize(v);
    }

    @Stable
    public static final float d(long v) {
        return DpSize.p(v);
    }

    @Stable
    public static final float e(long v) {
        return DpSize.m(v);
    }

    @Override
    public boolean equals(Object object0) {
        return DpSize.k(this.a, object0);
    }

    public static long f(long v) [...] // Inlined contents

    public static final long g(long v, float f, float f1) {
        return DpKt.b(f, f1);
    }

    public static long h(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = DpSize.p(v);
        }
        if((v1 & 2) != 0) {
            f1 = DpSize.m(v);
        }
        return DpSize.g(v, f, f1);
    }

    @Override
    public int hashCode() {
        return DpSize.r(this.a);
    }

    @Stable
    public static final long i(long v, float f) {
        return DpKt.b(Dp.g(DpSize.p(v) / f), Dp.g(DpSize.m(v) / f));
    }

    @Stable
    public static final long j(long v, int v1) {
        return DpKt.b(Dp.g(DpSize.p(v) / ((float)v1)), Dp.g(DpSize.m(v) / ((float)v1)));
    }

    public static boolean k(long v, Object object0) {
        return object0 instanceof DpSize ? v == ((DpSize)object0).x() : false;
    }

    public static final boolean l(long v, long v1) {
        return v == v1;
    }

    public static final float m(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("DpSize is unspecified");
        }
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Stable
    public static void n() {
    }

    @b0
    public static void o() {
    }

    public static final float p(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("DpSize is unspecified");
        }
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Stable
    public static void q() {
    }

    public static int r(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Stable
    public static final long s(long v, long v1) {
        return DpKt.b(Dp.g(DpSize.p(v) - DpSize.p(v1)), Dp.g(DpSize.m(v) - DpSize.m(v1)));
    }

    @Stable
    public static final long t(long v, long v1) {
        return DpKt.b(Dp.g(DpSize.p(v) + DpSize.p(v1)), Dp.g(DpSize.m(v) + DpSize.m(v1)));
    }

    @Override
    @Stable
    @l
    public String toString() {
        return DpSize.w(this.a);
    }

    @Stable
    public static final long u(long v, float f) {
        return DpKt.b(Dp.g(DpSize.p(v) * f), Dp.g(DpSize.m(v) * f));
    }

    @Stable
    public static final long v(long v, int v1) {
        return DpKt.b(Dp.g(DpSize.p(v) * ((float)v1)), Dp.g(DpSize.m(v) * ((float)v1)));
    }

    // 去混淆评级： 低(20)
    @Stable
    @l
    public static String w(long v) {
        return v == 0x7FC000007FC00000L ? "DpSize.Unspecified" : Dp.u(DpSize.p(v)) + " x " + Dp.u(DpSize.m(v));
    }

    public final long x() {
        return this.a;
    }
}

