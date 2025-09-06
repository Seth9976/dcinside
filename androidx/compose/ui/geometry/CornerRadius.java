package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.b0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n34#2:165\n41#2:166\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n49#1:165\n53#1:166\n*E\n"})
@g
public final class CornerRadius {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final long a() [...] // 潜在的解密器

        @Stable
        public static void b() {
        }
    }

    private final long a;
    @l
    public static final Companion b;
    private static final long c;

    static {
        CornerRadius.b = new Companion(null);
        CornerRadius.c = 0L;
    }

    private CornerRadius(long v) {
        this.a = v;
    }

    public static final long a() [...] // 潜在的解密器

    public static final CornerRadius b(long v) {
        return new CornerRadius(v);
    }

    @Stable
    public static final float c(long v) {
        return CornerRadius.m(v);
    }

    @Stable
    public static final float d(long v) {
        return CornerRadius.o(v);
    }

    public static long e(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return CornerRadius.i(this.a, object0);
    }

    public static final long f(long v, float f, float f1) {
        return CornerRadiusKt.a(f, f1);
    }

    public static long g(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = CornerRadius.m(v);
        }
        if((v1 & 2) != 0) {
            f1 = CornerRadius.o(v);
        }
        return CornerRadius.f(v, f, f1);
    }

    @Stable
    public static final long h(long v, float f) {
        return CornerRadiusKt.a(CornerRadius.m(v) / f, CornerRadius.o(v) / f);
    }

    @Override
    public int hashCode() {
        return CornerRadius.p(this.a);
    }

    public static boolean i(long v, Object object0) {
        return object0 instanceof CornerRadius ? v == ((CornerRadius)object0).v() : false;
    }

    public static final boolean j(long v, long v1) {
        return v == v1;
    }

    @b0
    public static void k() {
    }

    @Stable
    public static void l() {
    }

    public static final float m(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Stable
    public static void n() {
    }

    public static final float o(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static int p(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Stable
    public static final long q(long v, long v1) {
        return CornerRadiusKt.a(CornerRadius.m(v) - CornerRadius.m(v1), CornerRadius.o(v) - CornerRadius.o(v1));
    }

    @Stable
    public static final long r(long v, long v1) {
        return CornerRadiusKt.a(CornerRadius.m(v) + CornerRadius.m(v1), CornerRadius.o(v) + CornerRadius.o(v1));
    }

    @Stable
    public static final long s(long v, float f) {
        return CornerRadiusKt.a(CornerRadius.m(v) * f, CornerRadius.o(v) * f);
    }

    @l
    public static String t(long v) {
        return CornerRadius.m(v) == CornerRadius.o(v) ? "CornerRadius.circular(" + GeometryUtilsKt.a(CornerRadius.m(v), 1) + ')' : "CornerRadius.elliptical(" + GeometryUtilsKt.a(CornerRadius.m(v), 1) + ", " + GeometryUtilsKt.a(CornerRadius.o(v), 1) + ')';
    }

    @Override
    @l
    public String toString() {
        return CornerRadius.t(this.a);
    }

    @Stable
    public static final long u(long v) {
        return CornerRadiusKt.a(-CornerRadius.m(v), -CornerRadius.o(v));
    }

    public final long v() {
        return this.a;
    }
}

