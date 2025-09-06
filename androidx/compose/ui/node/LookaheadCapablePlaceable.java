package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.a;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode {
    private boolean f;
    private boolean g;

    @Override  // androidx.compose.ui.unit.Density
    public float C(int v) {
        return a.e(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float D(float f) {
        return a.d(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int E1(long v) {
        return a.a(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public Rect H0(DpRect dpRect0) {
        return a.i(this, dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long J(long v) {
        return a.j(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long M(float f) {
        return a.k(this, f);
    }

    @Override  // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @l
    public abstract LayoutNode M0();

    public abstract int S1(@l AlignmentLine arg1);

    @l
    public abstract AlignmentLinesOwner T1();

    @m
    public abstract LookaheadCapablePlaceable U1();

    @l
    public abstract LayoutCoordinates V1();

    public abstract boolean W1();

    @l
    public abstract MeasureResult X1();

    @m
    public abstract LookaheadCapablePlaceable Y1();

    public abstract long Z1();

    protected final void a2(@l NodeCoordinator nodeCoordinator0) {
        L.p(nodeCoordinator0, "<this>");
        NodeCoordinator nodeCoordinator1 = nodeCoordinator0.N2();
        if(!L.g((nodeCoordinator1 == null ? null : nodeCoordinator1.M0()), nodeCoordinator0.M0())) {
            nodeCoordinator0.T1().k().q();
            return;
        }
        AlignmentLinesOwner alignmentLinesOwner0 = nodeCoordinator0.T1().h();
        if(alignmentLinesOwner0 != null) {
            AlignmentLines alignmentLines0 = alignmentLinesOwner0.k();
            if(alignmentLines0 != null) {
                alignmentLines0.q();
            }
        }
    }

    @Override  // androidx.compose.ui.unit.Density
    public int b1(float f) {
        return a.b(this, f);
    }

    public final boolean b2() {
        return this.g;
    }

    public final boolean c2() {
        return this.f;
    }

    public abstract void d2();

    public final void e2(boolean z) {
        this.g = z;
    }

    public final void f2(boolean z) {
        this.f = z;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float g1(long v) {
        return a.g(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long m(long v) {
        return a.f(this, v);
    }

    @Override  // androidx.compose.ui.layout.MeasureScope
    public MeasureResult o1(int v, int v1, Map map0, Function1 function10) {
        return MeasureScope.-CC.a(this, v, v1, map0, function10);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float p(long v) {
        return a.c(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long r(int v) {
        return a.m(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long s(float f) {
        return a.l(this, f);
    }

    @Override  // androidx.compose.ui.layout.Measured
    public final int v(@l AlignmentLine alignmentLine0) {
        L.p(alignmentLine0, "alignmentLine");
        if(!this.W1()) {
            return 0x80000000;
        }
        int v = this.S1(alignmentLine0);
        if(v == 0x80000000) {
            return 0x80000000;
        }
        return alignmentLine0 instanceof VerticalAlignmentLine ? v + ((int)(this.J1() >> 0x20)) : v + ((int)(this.J1() & 0xFFFFFFFFL));
    }

    @Override  // androidx.compose.ui.unit.Density
    public float y1(float f) {
        return a.h(this, f);
    }
}

