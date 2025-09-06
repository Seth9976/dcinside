package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

final class AlignmentLineOffsetDp extends InspectorValueInfo implements LayoutModifier {
    @l
    private final AlignmentLine d;
    private final float e;
    private final float f;

    private AlignmentLineOffsetDp(AlignmentLine alignmentLine0, float f, float f1, Function1 function10) {
        super(function10);
        this.d = alignmentLine0;
        this.e = f;
        this.f = f1;
        if(f < 0.0f && !Dp.l(f, NaNf) || f1 < 0.0f && !Dp.l(f1, NaNf)) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }

    public AlignmentLineOffsetDp(AlignmentLine alignmentLine0, float f, float f1, Function1 function10, w w0) {
        this(alignmentLine0, f, f1, function10);
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

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int c(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.d(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int e(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.b(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        AlignmentLineOffsetDp alignmentLineOffsetDp0 = object0 instanceof AlignmentLineOffsetDp ? ((AlignmentLineOffsetDp)object0) : null;
        return alignmentLineOffsetDp0 == null ? false : L.g(this.d, alignmentLineOffsetDp0.d) && Dp.l(this.e, alignmentLineOffsetDp0.e) && Dp.l(this.f, alignmentLineOffsetDp0.f);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int f(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.a(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int g(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.c(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        return AlignmentLineKt.c(measureScope0, this.d, this.e, this.f, measurable0, v);
    }

    @Override
    public int hashCode() {
        return (this.d.hashCode() * 0x1F + Dp.n(this.e)) * 0x1F + Dp.n(this.f);
    }

    public final float j() {
        return this.f;
    }

    @l
    public final AlignmentLine l() {
        return this.d;
    }

    public final float m() {
        return this.e;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override
    @l
    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.d + ", before=" + Dp.u(this.e) + ", after=" + Dp.u(this.f) + ')';
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

