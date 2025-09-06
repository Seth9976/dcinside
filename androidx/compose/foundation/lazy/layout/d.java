package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

public final class d {
    @Stable
    public static float a(LazyLayoutMeasureScope lazyLayoutMeasureScope0, long v) {
        if(!TextUnitType.g(TextUnit.m(v), 0x100000000L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return Dp.g(TextUnit.n(v) * lazyLayoutMeasureScope0.w1());
    }

    @Stable
    public static float b(LazyLayoutMeasureScope lazyLayoutMeasureScope0, float f) {
        return Dp.g(f / lazyLayoutMeasureScope0.getDensity());
    }

    @Stable
    public static float c(LazyLayoutMeasureScope lazyLayoutMeasureScope0, int v) {
        return Dp.g(((float)v) / lazyLayoutMeasureScope0.getDensity());
    }

    // 去混淆评级： 低(40)
    @Stable
    public static long d(LazyLayoutMeasureScope lazyLayoutMeasureScope0, long v) {
        return v == 0x7FC000007FC00000L ? 0x7FC000007FC00000L : DpKt.b(lazyLayoutMeasureScope0.D(Size.t(v)), lazyLayoutMeasureScope0.D(Size.m(v)));
    }

    // 去混淆评级： 低(40)
    @Stable
    public static long e(LazyLayoutMeasureScope lazyLayoutMeasureScope0, long v) {
        return v == 0x7FC000007FC00000L ? 0x7FC000007FC00000L : SizeKt.a(lazyLayoutMeasureScope0.y1(DpSize.p(v)), lazyLayoutMeasureScope0.y1(DpSize.m(v)));
    }

    @Stable
    public static long f(LazyLayoutMeasureScope lazyLayoutMeasureScope0, float f) {
        return TextUnitKt.l(f / lazyLayoutMeasureScope0.w1());
    }

    @Stable
    public static long g(LazyLayoutMeasureScope lazyLayoutMeasureScope0, float f) {
        return TextUnitKt.l(f / (lazyLayoutMeasureScope0.w1() * lazyLayoutMeasureScope0.getDensity()));
    }

    @Stable
    public static long h(LazyLayoutMeasureScope lazyLayoutMeasureScope0, int v) {
        return TextUnitKt.l(((float)v) / (lazyLayoutMeasureScope0.w1() * lazyLayoutMeasureScope0.getDensity()));
    }
}

