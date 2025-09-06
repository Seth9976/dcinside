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
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

final class AlignmentLineOffsetTextUnit extends InspectorValueInfo implements LayoutModifier {
    @l
    private final AlignmentLine d;
    private final long e;
    private final long f;

    private AlignmentLineOffsetTextUnit(AlignmentLine alignmentLine0, long v, long v1, Function1 function10) {
        super(function10);
        this.d = alignmentLine0;
        this.e = v;
        this.f = v1;
    }

    public AlignmentLineOffsetTextUnit(AlignmentLine alignmentLine0, long v, long v1, Function1 function10, w w0) {
        this(alignmentLine0, v, v1, function10);
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
        AlignmentLineOffsetTextUnit alignmentLineOffsetTextUnit0 = object0 instanceof AlignmentLineOffsetTextUnit ? ((AlignmentLineOffsetTextUnit)object0) : null;
        return alignmentLineOffsetTextUnit0 == null ? false : L.g(this.d, alignmentLineOffsetTextUnit0.d) && TextUnit.j(this.e, alignmentLineOffsetTextUnit0.e) && TextUnit.j(this.f, alignmentLineOffsetTextUnit0.f);
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
        float f = TextUnitKt.s(this.e) ? NaNf : measureScope0.p(this.e);
        return TextUnitKt.s(this.f) ? AlignmentLineKt.c(measureScope0, this.d, f, NaNf, measurable0, v) : AlignmentLineKt.c(measureScope0, this.d, f, measureScope0.p(this.f), measurable0, v);
    }

    @Override
    public int hashCode() {
        return (this.d.hashCode() * 0x1F + TextUnit.o(this.e)) * 0x1F + TextUnit.o(this.f);
    }

    public final long j() {
        return this.f;
    }

    @l
    public final AlignmentLine l() {
        return this.d;
    }

    public final long m() {
        return this.e;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override
    @l
    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.d + ", before=" + TextUnit.u(this.e) + ", after=" + TextUnit.u(this.f) + ')';
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

