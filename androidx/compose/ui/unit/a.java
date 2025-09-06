package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.jvm.internal.L;
import kotlin.math.b;
import y4.l;

public final class a {
    @Stable
    public static int a(Density density0, long v) {
        return b.L0(density0.g1(v));
    }

    @Stable
    public static int b(Density density0, float f) {
        float f1 = density0.y1(f);
        return Float.isInfinite(f1) ? 0x7FFFFFFF : b.L0(f1);
    }

    @Stable
    public static float c(Density density0, long v) {
        if(!TextUnitType.g(TextUnit.m(v), 0x100000000L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return Dp.g(TextUnit.n(v) * density0.w1());
    }

    @Stable
    public static float d(Density density0, float f) {
        return Dp.g(f / density0.getDensity());
    }

    @Stable
    public static float e(Density density0, int v) {
        return Dp.g(((float)v) / density0.getDensity());
    }

    // 去混淆评级： 低(40)
    @Stable
    public static long f(Density density0, long v) {
        return v == 0x7FC000007FC00000L ? 0x7FC000007FC00000L : DpKt.b(density0.D(Size.t(v)), density0.D(Size.m(v)));
    }

    @Stable
    public static float g(Density density0, long v) {
        if(!TextUnitType.g(TextUnit.m(v), 0x100000000L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return TextUnit.n(v) * density0.w1() * density0.getDensity();
    }

    @Stable
    public static float h(Density density0, float f) {
        return f * density0.getDensity();
    }

    @Stable
    @l
    public static Rect i(Density density0, @l DpRect dpRect0) {
        L.p(dpRect0, "<this>");
        return new Rect(density0.y1(dpRect0.i()), density0.y1(dpRect0.m()), density0.y1(dpRect0.k()), density0.y1(dpRect0.g()));
    }

    // 去混淆评级： 低(40)
    @Stable
    public static long j(Density density0, long v) {
        return v == 0x7FC000007FC00000L ? 0x7FC000007FC00000L : SizeKt.a(density0.y1(DpSize.p(v)), density0.y1(DpSize.m(v)));
    }

    @Stable
    public static long k(Density density0, float f) {
        return TextUnitKt.l(f / density0.w1());
    }

    @Stable
    public static long l(Density density0, float f) {
        return TextUnitKt.l(f / (density0.w1() * density0.getDensity()));
    }

    @Stable
    public static long m(Density density0, int v) {
        return TextUnitKt.l(((float)v) / (density0.w1() * density0.getDensity()));
    }
}

