package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class RoundRectKt {
    @l
    public static final RoundRect a(float f, float f1, float f2, float f3, float f4, float f5) {
        long v = CornerRadiusKt.a(f4, f5);
        return new RoundRect(f, f1, f2, f3, v, v, v, v, null);
    }

    @l
    public static final RoundRect b(@l Rect rect0, float f, float f1) {
        L.p(rect0, "rect");
        return RoundRectKt.a(rect0.t(), rect0.B(), rect0.x(), rect0.j(), f, f1);
    }

    @l
    public static final RoundRect c(@l Rect rect0, long v, long v1, long v2, long v3) {
        L.p(rect0, "rect");
        return new RoundRect(rect0.t(), rect0.B(), rect0.x(), rect0.j(), v, v1, v2, v3, null);
    }

    // 去混淆评级： 低(20)
    public static RoundRect d(Rect rect0, long v, long v1, long v2, long v3, int v4, Object object0) {
        long v5 = (v4 & 2) == 0 ? v : 0L;
        long v6 = (v4 & 4) == 0 ? v1 : 0L;
        long v7 = (v4 & 8) == 0 ? v2 : 0L;
        return (v4 & 16) == 0 ? RoundRectKt.c(rect0, v5, v6, v7, v3) : RoundRectKt.c(rect0, v5, v6, v7, 0L);
    }

    @l
    public static final RoundRect e(float f, float f1, float f2, float f3, long v) {
        return RoundRectKt.a(f, f1, f2, f3, CornerRadius.m(v), CornerRadius.o(v));
    }

    @l
    public static final RoundRect f(@l Rect rect0, long v) {
        L.p(rect0, "rect");
        return RoundRectKt.b(rect0, CornerRadius.m(v), CornerRadius.o(v));
    }

    @l
    public static final Rect g(@l RoundRect roundRect0) {
        L.p(roundRect0, "<this>");
        return new Rect(roundRect0.q(), roundRect0.s(), roundRect0.r(), roundRect0.m());
    }

    public static final long h(@l RoundRect roundRect0) {
        L.p(roundRect0, "<this>");
        return OffsetKt.a(roundRect0.q() + roundRect0.v() / 2.0f, roundRect0.s() + roundRect0.p() / 2.0f);
    }

    public static final float i(@l RoundRect roundRect0) {
        L.p(roundRect0, "<this>");
        return Math.max(Math.abs(roundRect0.v()), Math.abs(roundRect0.p()));
    }

    public static final float j(@l RoundRect roundRect0) {
        L.p(roundRect0, "<this>");
        return Math.min(Math.abs(roundRect0.v()), Math.abs(roundRect0.p()));
    }

    @l
    public static final Rect k(@l RoundRect roundRect0) {
        L.p(roundRect0, "<this>");
        return new Rect(roundRect0.q() + Math.max(CornerRadius.m(roundRect0.n()), CornerRadius.m(roundRect0.t())) * 0.292893f, roundRect0.s() + Math.max(CornerRadius.o(roundRect0.t()), CornerRadius.o(roundRect0.u())) * 0.292893f, roundRect0.r() - Math.max(CornerRadius.m(roundRect0.u()), CornerRadius.m(roundRect0.o())) * 0.292893f, roundRect0.m() - Math.max(CornerRadius.o(roundRect0.o()), CornerRadius.o(roundRect0.n())) * 0.292893f);
    }

    public static final boolean l(@l RoundRect roundRect0) {
        L.p(roundRect0, "<this>");
        return roundRect0.v() == roundRect0.p() && RoundRectKt.m(roundRect0);
    }

    public static final boolean m(@l RoundRect roundRect0) {
        L.p(roundRect0, "<this>");
        return CornerRadius.m(roundRect0.t()) == CornerRadius.m(roundRect0.u()) && CornerRadius.o(roundRect0.t()) == CornerRadius.o(roundRect0.u()) && CornerRadius.m(roundRect0.u()) == CornerRadius.m(roundRect0.o()) && CornerRadius.o(roundRect0.u()) == CornerRadius.o(roundRect0.o()) && CornerRadius.m(roundRect0.o()) == CornerRadius.m(roundRect0.n()) && CornerRadius.o(roundRect0.o()) == CornerRadius.o(roundRect0.n()) && ((double)roundRect0.v()) <= ((double)CornerRadius.m(roundRect0.t())) * 2.0 && ((double)roundRect0.p()) <= ((double)CornerRadius.o(roundRect0.t())) * 2.0;
    }

    public static final boolean n(@l RoundRect roundRect0) {
        L.p(roundRect0, "<this>");
        return roundRect0.q() >= roundRect0.r() || roundRect0.s() >= roundRect0.m();
    }

    public static final boolean o(@l RoundRect roundRect0) {
        L.p(roundRect0, "<this>");
        float f = roundRect0.q();
        if(!Float.isInfinite(f) && !Float.isNaN(f)) {
            float f1 = roundRect0.s();
            if(!Float.isInfinite(f1) && !Float.isNaN(f1)) {
                float f2 = roundRect0.r();
                if(!Float.isInfinite(f2) && !Float.isNaN(f2)) {
                    float f3 = roundRect0.m();
                    return !Float.isInfinite(f3) && !Float.isNaN(f3);
                }
            }
        }
        return false;
    }

    public static final boolean p(@l RoundRect roundRect0) {
        L.p(roundRect0, "<this>");
        return (CornerRadius.m(roundRect0.t()) == 0.0f || CornerRadius.o(roundRect0.t()) == 0.0f) && (CornerRadius.m(roundRect0.u()) == 0.0f || CornerRadius.o(roundRect0.u()) == 0.0f) && (CornerRadius.m(roundRect0.n()) == 0.0f || CornerRadius.o(roundRect0.n()) == 0.0f) && (CornerRadius.m(roundRect0.o()) == 0.0f || CornerRadius.o(roundRect0.o()) == 0.0f);
    }

    public static final boolean q(@l RoundRect roundRect0) {
        L.p(roundRect0, "<this>");
        return CornerRadius.m(roundRect0.t()) == CornerRadius.o(roundRect0.t()) && CornerRadius.m(roundRect0.t()) == CornerRadius.m(roundRect0.u()) && CornerRadius.m(roundRect0.t()) == CornerRadius.o(roundRect0.u()) && CornerRadius.m(roundRect0.t()) == CornerRadius.m(roundRect0.o()) && CornerRadius.m(roundRect0.t()) == CornerRadius.o(roundRect0.o()) && CornerRadius.m(roundRect0.t()) == CornerRadius.m(roundRect0.n()) && CornerRadius.m(roundRect0.t()) == CornerRadius.o(roundRect0.n());
    }

    @l
    public static final RoundRect r(@l RoundRect roundRect0, @l RoundRect roundRect1, float f) {
        L.p(roundRect0, "start");
        L.p(roundRect1, "stop");
        return new RoundRect(MathHelpersKt.a(roundRect0.q(), roundRect1.q(), f), MathHelpersKt.a(roundRect0.s(), roundRect1.s(), f), MathHelpersKt.a(roundRect0.r(), roundRect1.r(), f), MathHelpersKt.a(roundRect0.m(), roundRect1.m(), f), CornerRadiusKt.c(roundRect0.t(), roundRect1.t(), f), CornerRadiusKt.c(roundRect0.u(), roundRect1.u(), f), CornerRadiusKt.c(roundRect0.o(), roundRect1.o(), f), CornerRadiusKt.c(roundRect0.n(), roundRect1.n(), f), null);
    }

    @l
    public static final RoundRect s(@l RoundRect roundRect0, long v) {
        L.p(roundRect0, "$this$translate");
        return new RoundRect(roundRect0.q() + Offset.p(v), roundRect0.s() + Offset.r(v), roundRect0.r() + Offset.p(v), roundRect0.m() + Offset.r(v), roundRect0.t(), roundRect0.u(), roundRect0.o(), roundRect0.n(), null);
    }
}

