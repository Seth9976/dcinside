package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class IntrinsicSizeModifier.-CC {
    public static boolean a(IntrinsicSizeModifier intrinsicSizeModifier0) [...] // Inlined contents

    public static int b(IntrinsicSizeModifier intrinsicSizeModifier0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return intrinsicMeasurable0.g(v);
    }

    public static int c(IntrinsicSizeModifier intrinsicSizeModifier0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return intrinsicMeasurable0.h1(v);
    }

    @l
    public static MeasureResult d(IntrinsicSizeModifier intrinsicSizeModifier0, @l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        long v1 = intrinsicSizeModifier0.u1(measureScope0, measurable0, v);
        if(intrinsicSizeModifier0.F1()) {
            v1 = ConstraintsKt.e(v, v1);
        }
        Placeable placeable0 = measurable0.r1(v1);
        return MeasureScope.-CC.p(measureScope0, placeable0.N1(), placeable0.K1(), null, new IntrinsicSizeModifier.measure.1(placeable0), 4, null);
    }

    public static int e(IntrinsicSizeModifier intrinsicSizeModifier0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return intrinsicMeasurable0.D0(v);
    }

    public static int f(IntrinsicSizeModifier intrinsicSizeModifier0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return intrinsicMeasurable0.S0(v);
    }
}

