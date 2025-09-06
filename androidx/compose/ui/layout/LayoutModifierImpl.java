package androidx.compose.ui.layout;

import A3.p;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.c;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.L;
import y4.l;

public final class LayoutModifierImpl extends Node implements LayoutModifierNode {
    @l
    private p l;

    public LayoutModifierImpl(@l p p0) {
        L.p(p0, "measureBlock");
        super();
        this.l = p0;
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int c(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.e(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public void d() {
        c.a(this);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int e(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.c(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int f(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.b(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int g(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.d(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        return (MeasureResult)this.l.invoke(measureScope0, measurable0, Constraints.b(v));
    }

    @l
    public final p i0() {
        return this.l;
    }

    public final void j0(@l p p0) {
        L.p(p0, "<set-?>");
        this.l = p0;
    }

    @Override
    @l
    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.l + ')';
    }
}

