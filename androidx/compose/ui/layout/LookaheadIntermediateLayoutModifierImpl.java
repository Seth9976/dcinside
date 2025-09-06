package androidx.compose.ui.layout;

import A3.o;
import A3.q;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LookaheadIntermediateLayoutModifierImpl extends InspectorValueInfo implements IntermediateLayoutModifier {
    @l
    private final q d;
    private long e;

    public LookaheadIntermediateLayoutModifierImpl(@l q q0, @l Function1 function10) {
        L.p(q0, "measureBlock");
        L.p(function10, "inspectorInfo");
        super(function10);
        this.d = q0;
        this.e = 0L;
    }

    @Override  // androidx.compose.ui.layout.IntermediateLayoutModifier
    public void B(long v) {
        this.e = v;
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
        return object0 instanceof LookaheadIntermediateLayoutModifierImpl ? L.g(this.d, ((LookaheadIntermediateLayoutModifierImpl)object0).d) && IntSize.h(this.k(), ((LookaheadIntermediateLayoutModifierImpl)object0).k()) : false;
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
        Constraints constraints0 = Constraints.b(v);
        IntSize intSize0 = IntSize.b(this.k());
        return (MeasureResult)this.d.T0(measureScope0, measurable0, constraints0, intSize0);
    }

    @Override
    public int hashCode() {
        return this.d.hashCode() * 0x1F + IntSize.n(this.k());
    }

    @l
    public final q j() {
        return this.d;
    }

    @Override  // androidx.compose.ui.layout.IntermediateLayoutModifier
    public long k() {
        return this.e;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

