package androidx.compose.ui.unit;

import A3.a;
import androidx.compose.runtime.Stable;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,388:1\n250#1:389\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n264#1:389\n*E\n"})
public final class TextUnitKt {
    private static final long a = 0xFF00000000L;
    private static final long b = 0L;
    private static final long c = 0x100000000L;
    private static final long d = 0x200000000L;

    public static final long a(float f, long v) {
        return TextUnitKt.v(v, f);
    }

    @b0
    public static final void b(long v) {
        if(TextUnitKt.s(v)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    @b0
    public static final void c(long v, long v1) {
        if(TextUnitKt.s(v) || TextUnitKt.s(v1)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if(!TextUnitType.g(TextUnit.m(v), TextUnit.m(v1))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + TextUnitType.i(TextUnit.m(v)) + " and " + TextUnitType.i(TextUnit.m(v1))).toString());
        }
    }

    @b0
    public static final void d(long v, long v1, long v2) {
        if(TextUnitKt.s(v) || TextUnitKt.s(v1) || TextUnitKt.s(v2)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if(!TextUnitType.g(TextUnit.m(v), TextUnit.m(v1)) || !TextUnitType.g(TextUnit.m(v1), TextUnit.m(v2))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + TextUnitType.i(TextUnit.m(v)) + " and " + TextUnitType.i(TextUnit.m(v1))).toString());
        }
    }

    public static final long e(double f) {
        return TextUnitKt.v(0x200000000L, ((float)f));
    }

    public static final long f(float f) {
        return TextUnitKt.v(0x200000000L, f);
    }

    public static final long g(int v) {
        return TextUnitKt.v(0x200000000L, ((float)v));
    }

    @Stable
    public static void h(double f) {
    }

    @Stable
    public static void i(float f) {
    }

    @Stable
    public static void j(int v) {
    }

    public static final long k(double f) {
        return TextUnitKt.v(0x100000000L, ((float)f));
    }

    public static final long l(float f) {
        return TextUnitKt.v(0x100000000L, f);
    }

    public static final long m(int v) [...] // 潜在的解密器

    @Stable
    public static void n(double f) {
    }

    @Stable
    public static void o(float f) {
    }

    @Stable
    public static void p(int v) {
    }

    public static final boolean q(long v) {
        return !TextUnitKt.s(v);
    }

    @Stable
    public static void r(long v) {
    }

    public static final boolean s(long v) {
        return (v & 0xFF00000000L) == 0L;
    }

    @Stable
    public static void t(long v) {
    }

    @Stable
    public static final long u(long v, long v1, float f) {
        TextUnitKt.c(v, v1);
        return TextUnitKt.v(v & 0xFF00000000L, (1.0f - f) * TextUnit.n(v) + f * TextUnit.n(v1));
    }

    @b0
    public static final long v(long v, float f) [...] // 潜在的解密器

    public static final long w(long v, @l a a0) {
        L.p(a0, "block");
        return TextUnitKt.s(v) ? ((TextUnit)a0.invoke()).w() : v;
    }

    @Stable
    public static final long x(double f, long v) {
        TextUnitKt.b(v);
        return TextUnitKt.v(v & 0xFF00000000L, ((float)f) * TextUnit.n(v));
    }

    @Stable
    public static final long y(float f, long v) {
        TextUnitKt.b(v);
        return TextUnitKt.v(v & 0xFF00000000L, f * TextUnit.n(v));
    }

    @Stable
    public static final long z(int v, long v1) {
        TextUnitKt.b(v1);
        return TextUnitKt.v(TextUnit.l(v1), ((float)v) * TextUnit.n(v1));
    }
}

