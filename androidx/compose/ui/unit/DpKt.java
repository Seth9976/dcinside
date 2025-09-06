package androidx.compose.ui.unit;

import A3.a;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n130#1:558\n337#1:562\n473#1:566\n544#1:570\n550#1:572\n25#2,3:559\n25#2,3:563\n71#3:567\n58#3:568\n58#3:569\n58#3:571\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n144#1:558\n351#1:562\n487#1:566\n556#1:570\n556#1:572\n254#1:559,3\n372#1:563,3\n495#1:567\n544#1:568\n550#1:569\n556#1:571\n*E\n"})
public final class DpKt {
    @Stable
    public static void A(long v) {
    }

    public static final boolean B(float f) {
        return Float.isNaN(f);
    }

    @Stable
    public static void C(float f) {
    }

    // 去混淆评级： 低(20)
    public static final boolean D(long v) {
        return v == 0x7FC000007FC00000L;
    }

    @Stable
    public static void E(long v) {
    }

    // 去混淆评级： 低(20)
    public static final boolean F(long v) {
        return v == 0x7FC000007FC00000L;
    }

    @Stable
    public static void G(long v) {
    }

    @Stable
    public static final long H(long v, long v1, float f) {
        return DpKt.b(DpKt.I(DpSize.p(v), DpSize.p(v1), f), DpKt.I(DpSize.m(v), DpSize.m(v1), f));
    }

    @Stable
    public static final float I(float f, float f1, float f2) {
        return (1.0f - f2) * f + f2 * f1;
    }

    @Stable
    public static final long J(long v, long v1, float f) {
        return DpKt.a(DpKt.I(DpOffset.j(v), DpOffset.j(v1), f), DpKt.I(DpOffset.l(v), DpOffset.l(v1), f));
    }

    @Stable
    public static final float K(float f, float f1) {
        return Math.max(f, f1);
    }

    @Stable
    public static final float L(float f, float f1) {
        return Math.min(f, f1);
    }

    public static final float M(float f, @l a a0) {
        L.p(a0, "block");
        return Float.isNaN(f) ? ((Dp)a0.invoke()).w() : f;
    }

    public static final long N(long v, @l a a0) {
        L.p(a0, "block");
        return v == 0x7FC000007FC00000L ? ((DpOffset)a0.invoke()).r() : v;
    }

    public static final long O(long v, @l a a0) {
        L.p(a0, "block");
        return v == 0x7FC000007FC00000L ? ((DpSize)a0.invoke()).x() : v;
    }

    @Stable
    public static final float P(double f, float f1) {
        return ((float)f) * f1;
    }

    @Stable
    public static final float Q(float f, float f1) {
        return f * f1;
    }

    @Stable
    public static final float R(int v, float f) {
        return ((float)v) * f;
    }

    @Stable
    public static final long S(float f, long v) {
        return DpSize.u(v, f);
    }

    @Stable
    public static final long T(int v, long v1) {
        return DpSize.v(v1, v);
    }

    @Stable
    public static final long a(float f, float f1) [...] // 潜在的解密器

    @Stable
    public static final long b(float f, float f1) {
        return ((long)Float.floatToIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToIntBits(f)) << 0x20;
    }

    @Stable
    public static final float c(float f, float f1) {
        return Dp.g(s.t(f, f1));
    }

    @Stable
    public static final float d(float f, float f1) {
        return Dp.g(s.A(f, f1));
    }

    @Stable
    public static final float e(float f, float f1, float f2) {
        return Dp.g(s.H(f, f1, f2));
    }

    public static final long f(long v) {
        return DpKt.a(Dp.g(DpSize.p(v) / 2.0f), Dp.g(DpSize.m(v) / 2.0f));
    }

    @Stable
    public static void g(long v) {
    }

    public static final float h(double f) {
        return (float)f;
    }

    public static final float i(float f) {
        return f;
    }

    public static final float j(int v) {
        return (float)v;
    }

    @Stable
    public static void k(double f) {
    }

    @Stable
    public static void l(float f) {
    }

    @Stable
    public static void m(int v) {
    }

    public static final float n(@l DpRect dpRect0) {
        L.p(dpRect0, "<this>");
        return Dp.g(dpRect0.g() - dpRect0.m());
    }

    @Stable
    public static void o(DpRect dpRect0) {
    }

    public static final long p(@l DpRect dpRect0) {
        L.p(dpRect0, "<this>");
        return DpKt.b(Dp.g(dpRect0.k() - dpRect0.i()), Dp.g(dpRect0.g() - dpRect0.m()));
    }

    @Stable
    public static void q(DpRect dpRect0) {
    }

    public static final float r(@l DpRect dpRect0) {
        L.p(dpRect0, "<this>");
        return Dp.g(dpRect0.k() - dpRect0.i());
    }

    @Stable
    public static void s(DpRect dpRect0) {
    }

    public static final boolean t(float f) {
        return f == Infinityf ? 0 : 1;
    }

    @Stable
    public static void u(float f) {
    }

    public static final boolean v(float f) {
        return !Float.isNaN(f);
    }

    @Stable
    public static void w(float f) {
    }

    // 去混淆评级： 低(20)
    public static final boolean x(long v) {
        return v != 0x7FC000007FC00000L;
    }

    @Stable
    public static void y(long v) {
    }

    // 去混淆评级： 低(20)
    public static final boolean z(long v) {
        return v != 0x7FC000007FC00000L;
    }
}

