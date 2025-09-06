package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class MaxIntrinsicHeightModifier implements IntrinsicSizeModifier {
    @l
    public static final MaxIntrinsicHeightModifier a;

    static {
        MaxIntrinsicHeightModifier.a = new MaxIntrinsicHeightModifier();
    }

    @Override  // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean F1() {
        return true;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    @Override  // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public int c(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return IntrinsicSizeModifier.-CC.f(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public int e(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return IntrinsicSizeModifier.-CC.c(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public int f(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return IntrinsicSizeModifier.-CC.b(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public int g(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return intrinsicMeasurable0.g(v);
    }

    @Override  // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public MeasureResult h(MeasureScope measureScope0, Measurable measurable0, long v) {
        return IntrinsicSizeModifier.-CC.d(this, measureScope0, measurable0, v);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }

    @Override  // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public long u1(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$calculateContentConstraints");
        L.p(measurable0, "measurable");
        int v1 = measurable0.g(Constraints.p(v));
        return Constraints.b.d(v1);
    }
}

