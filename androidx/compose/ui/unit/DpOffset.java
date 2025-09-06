package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.b0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n337#3:564\n154#3:565\n58#4:562\n51#4:563\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n273#1:558\n286#1:560\n273#1:559\n286#1:561\n311#1:564\n321#1:565\n300#1:562\n307#1:563\n*E\n"})
@g
public final class DpOffset {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final long a() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long b() {
            return 0L;
        }
    }

    private final long a;
    @l
    public static final Companion b;
    private static final long c;
    private static final long d;

    // 去混淆评级： 低(20)
    static {
        DpOffset.b = new Companion(null);
        DpOffset.c = 0L;
        DpOffset.d = 0x7FC000007FC00000L;
    }

    private DpOffset(long v) {
        this.a = v;
    }

    public static final long a() [...] // 潜在的解密器

    public static final long b() [...] // 潜在的解密器

    public static final DpOffset c(long v) {
        return new DpOffset(v);
    }

    public static long d(long v) [...] // Inlined contents

    public static final long e(long v, float f, float f1) {
        return DpKt.a(f, f1);
    }

    @Override
    public boolean equals(Object object0) {
        return DpOffset.g(this.a, object0);
    }

    public static long f(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = DpOffset.j(v);
        }
        if((v1 & 2) != 0) {
            f1 = DpOffset.l(v);
        }
        return DpOffset.e(v, f, f1);
    }

    public static boolean g(long v, Object object0) {
        return object0 instanceof DpOffset ? v == ((DpOffset)object0).r() : false;
    }

    public static final boolean h(long v, long v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return DpOffset.n(this.a);
    }

    @b0
    public static void i() {
    }

    public static final float j(long v) {
        if(v == DpOffset.d) {
            throw new IllegalStateException("DpOffset is unspecified");
        }
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Stable
    public static void k() {
    }

    public static final float l(long v) {
        if(v == DpOffset.d) {
            throw new IllegalStateException("DpOffset is unspecified");
        }
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Stable
    public static void m() {
    }

    public static int n(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Stable
    public static final long o(long v, long v1) {
        return DpKt.a(Dp.g(DpOffset.j(v) - DpOffset.j(v1)), Dp.g(DpOffset.l(v) - DpOffset.l(v1)));
    }

    @Stable
    public static final long p(long v, long v1) {
        return DpKt.a(Dp.g(DpOffset.j(v) + DpOffset.j(v1)), Dp.g(DpOffset.l(v) + DpOffset.l(v1)));
    }

    // 去混淆评级： 低(20)
    @Stable
    @l
    public static String q(long v) {
        return v == 0x7FC000007FC00000L ? "DpOffset.Unspecified" : '(' + Dp.u(DpOffset.j(v)) + ", " + Dp.u(DpOffset.l(v)) + ')';
    }

    public final long r() {
        return this.a;
    }

    @Override
    @Stable
    @l
    public String toString() {
        return DpOffset.q(this.a);
    }
}

