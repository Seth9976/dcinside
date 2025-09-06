package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset.Companion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.L;
import y4.l;

public final class VectorConvertersKt {
    @l
    private static final TwoWayConverter a;
    @l
    private static final TwoWayConverter b;
    @l
    private static final TwoWayConverter c;
    @l
    private static final TwoWayConverter d;
    @l
    private static final TwoWayConverter e;
    @l
    private static final TwoWayConverter f;
    @l
    private static final TwoWayConverter g;
    @l
    private static final TwoWayConverter h;
    @l
    private static final TwoWayConverter i;

    static {
        VectorConvertersKt.a = VectorConvertersKt.a(VectorConvertersKt.FloatToVector.1.e, VectorConvertersKt.FloatToVector.2.e);
        VectorConvertersKt.b = VectorConvertersKt.a(VectorConvertersKt.IntToVector.1.e, VectorConvertersKt.IntToVector.2.e);
        VectorConvertersKt.c = VectorConvertersKt.a(VectorConvertersKt.DpToVector.1.e, VectorConvertersKt.DpToVector.2.e);
        VectorConvertersKt.d = VectorConvertersKt.a(VectorConvertersKt.DpOffsetToVector.1.e, VectorConvertersKt.DpOffsetToVector.2.e);
        VectorConvertersKt.e = VectorConvertersKt.a(VectorConvertersKt.SizeToVector.1.e, VectorConvertersKt.SizeToVector.2.e);
        VectorConvertersKt.f = VectorConvertersKt.a(VectorConvertersKt.OffsetToVector.1.e, VectorConvertersKt.OffsetToVector.2.e);
        VectorConvertersKt.g = VectorConvertersKt.a(VectorConvertersKt.IntOffsetToVector.1.e, VectorConvertersKt.IntOffsetToVector.2.e);
        VectorConvertersKt.h = VectorConvertersKt.a(VectorConvertersKt.IntSizeToVector.1.e, VectorConvertersKt.IntSizeToVector.2.e);
        VectorConvertersKt.i = VectorConvertersKt.a(VectorConvertersKt.RectToVector.1.e, VectorConvertersKt.RectToVector.2.e);
    }

    @l
    public static final TwoWayConverter a(@l Function1 function10, @l Function1 function11) {
        L.p(function10, "convertToVector");
        L.p(function11, "convertFromVector");
        return new TwoWayConverterImpl(function10, function11);
    }

    @l
    public static final TwoWayConverter b(@l Companion offset$Companion0) {
        L.p(offset$Companion0, "<this>");
        return VectorConvertersKt.f;
    }

    @l
    public static final TwoWayConverter c(@l androidx.compose.ui.geometry.Rect.Companion rect$Companion0) {
        L.p(rect$Companion0, "<this>");
        return VectorConvertersKt.i;
    }

    @l
    public static final TwoWayConverter d(@l androidx.compose.ui.geometry.Size.Companion size$Companion0) {
        L.p(size$Companion0, "<this>");
        return VectorConvertersKt.e;
    }

    @l
    public static final TwoWayConverter e(@l androidx.compose.ui.unit.Dp.Companion dp$Companion0) {
        L.p(dp$Companion0, "<this>");
        return VectorConvertersKt.c;
    }

    @l
    public static final TwoWayConverter f(@l androidx.compose.ui.unit.DpOffset.Companion dpOffset$Companion0) {
        L.p(dpOffset$Companion0, "<this>");
        return VectorConvertersKt.d;
    }

    @l
    public static final TwoWayConverter g(@l androidx.compose.ui.unit.IntOffset.Companion intOffset$Companion0) {
        L.p(intOffset$Companion0, "<this>");
        return VectorConvertersKt.g;
    }

    @l
    public static final TwoWayConverter h(@l androidx.compose.ui.unit.IntSize.Companion intSize$Companion0) {
        L.p(intSize$Companion0, "<this>");
        return VectorConvertersKt.h;
    }

    @l
    public static final TwoWayConverter i(@l A a0) {
        L.p(a0, "<this>");
        return VectorConvertersKt.a;
    }

    @l
    public static final TwoWayConverter j(@l J j0) {
        L.p(j0, "<this>");
        return VectorConvertersKt.b;
    }

    public static final float k(float f, float f1, float f2) {
        return f * (1.0f - f2) + f1 * f2;
    }
}

