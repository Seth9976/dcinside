package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 5 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n*L\n1#1,277:1\n85#2:278\n85#2:299\n196#3:279\n196#3:300\n306#4,4:280\n360#5,15:284\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n*L\n51#1:278\n210#1:299\n51#1:279\n210#1:300\n153#1:280,4\n197#1:284,15\n*E\n"})
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Paint a() {
            return LayoutModifierNodeCoordinator.N;
        }
    }

    @s0({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,277:1\n173#2,3:278\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier\n*L\n130#1:278,3\n*E\n"})
    final class LookaheadDelegateForIntermediateLayoutModifier extends LookaheadDelegate {
        final class PassThroughMeasureResult implements MeasureResult {
            @l
            private final Map a;
            final LookaheadDelegateForIntermediateLayoutModifier b;

            public PassThroughMeasureResult() {
                this.a = Y.z();
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                LookaheadDelegate lookaheadDelegate0 = LookaheadDelegateForIntermediateLayoutModifier.this.q.O3().I2();
                L.m(lookaheadDelegate0);
                return lookaheadDelegate0.X1().getHeight();
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                LookaheadDelegate lookaheadDelegate0 = LookaheadDelegateForIntermediateLayoutModifier.this.q.O3().I2();
                L.m(lookaheadDelegate0);
                return lookaheadDelegate0.X1().getWidth();
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            @l
            public Map k() {
                return this.a;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public void l() {
                LookaheadDelegate lookaheadDelegate0 = LookaheadDelegateForIntermediateLayoutModifier.this.q.O3().I2();
                L.m(lookaheadDelegate0);
                PlacementScope.p(PlacementScope.a, lookaheadDelegate0, 0, 0, 0.0f, 4, null);
            }
        }

        @l
        private final IntermediateLayoutModifierNode o;
        @l
        private final PassThroughMeasureResult p;
        final LayoutModifierNodeCoordinator q;

        public LookaheadDelegateForIntermediateLayoutModifier(@l LookaheadScope lookaheadScope0, @l IntermediateLayoutModifierNode intermediateLayoutModifierNode0) {
            L.p(lookaheadScope0, "scope");
            L.p(intermediateLayoutModifierNode0, "intermediateMeasureNode");
            this.q = layoutModifierNodeCoordinator0;
            super(layoutModifierNodeCoordinator0, lookaheadScope0);
            this.o = intermediateLayoutModifierNode0;
            this.p = new PassThroughMeasureResult(this);
        }

        @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int S1(@l AlignmentLine alignmentLine0) {
            L.p(alignmentLine0, "alignmentLine");
            int v = LayoutModifierNodeCoordinatorKt.b(this, alignmentLine0);
            this.j2().put(alignmentLine0, v);
            return v;
        }

        @Override  // androidx.compose.ui.layout.Measurable
        @l
        public Placeable r1(long v) {
            this.R1(v);
            LookaheadDelegate lookaheadDelegate0 = this.q.O3().I2();
            L.m(lookaheadDelegate0);
            lookaheadDelegate0.r1(v);
            long v1 = IntSizeKt.a(lookaheadDelegate0.X1().getWidth(), lookaheadDelegate0.X1().getHeight());
            this.o.B(v1);
            this.r2(this.p);
            return this;
        }

        @l
        public final IntermediateLayoutModifierNode s2() {
            return this.o;
        }
    }

    @s0({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,277:1\n173#2,3:278\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n*L\n65#1:278,3\n*E\n"})
    final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        final LayoutModifierNodeCoordinator o;

        public LookaheadDelegateForLayoutModifierNode(@l LookaheadScope lookaheadScope0) {
            L.p(lookaheadScope0, "scope");
            this.o = layoutModifierNodeCoordinator0;
            super(layoutModifierNodeCoordinator0, lookaheadScope0);
        }

        @Override  // androidx.compose.ui.node.LookaheadDelegate
        public int D0(int v) {
            LayoutModifierNode layoutModifierNode0 = this.o.N3();
            LookaheadDelegate lookaheadDelegate0 = this.o.O3().I2();
            L.m(lookaheadDelegate0);
            return layoutModifierNode0.g(this, lookaheadDelegate0, v);
        }

        @Override  // androidx.compose.ui.node.LookaheadDelegate
        public int S0(int v) {
            LookaheadDelegate lookaheadDelegate0 = this.o.O3().I2();
            L.m(lookaheadDelegate0);
            return this.o.N3().c(this, lookaheadDelegate0, v);
        }

        @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int S1(@l AlignmentLine alignmentLine0) {
            L.p(alignmentLine0, "alignmentLine");
            int v = LayoutModifierNodeCoordinatorKt.b(this, alignmentLine0);
            this.j2().put(alignmentLine0, v);
            return v;
        }

        @Override  // androidx.compose.ui.node.LookaheadDelegate
        public int g(int v) {
            LookaheadDelegate lookaheadDelegate0 = this.o.O3().I2();
            L.m(lookaheadDelegate0);
            return this.o.N3().f(this, lookaheadDelegate0, v);
        }

        @Override  // androidx.compose.ui.node.LookaheadDelegate
        public int h1(int v) {
            LookaheadDelegate lookaheadDelegate0 = this.o.O3().I2();
            L.m(lookaheadDelegate0);
            return this.o.N3().e(this, lookaheadDelegate0, v);
        }

        @Override  // androidx.compose.ui.layout.Measurable
        @l
        public Placeable r1(long v) {
            this.R1(v);
            LookaheadDelegate lookaheadDelegate0 = this.o.O3().I2();
            L.m(lookaheadDelegate0);
            this.r2(this.o.N3().h(this, lookaheadDelegate0, v));
            return this;
        }
    }

    @l
    private LayoutModifierNode K;
    @m
    private IntermediateLayoutModifierNode L;
    @l
    public static final Companion M;
    @l
    private static final Paint N;

    static {
        LayoutModifierNodeCoordinator.M = new Companion(null);
        Paint paint0 = AndroidPaint_androidKt.a();
        paint0.g(0xFF0000FF00000000L);
        paint0.q(1.0f);
        paint0.p(1);
        LayoutModifierNodeCoordinator.N = paint0;
    }

    public LayoutModifierNodeCoordinator(@l LayoutNode layoutNode0, @l LayoutModifierNode layoutModifierNode0) {
        L.p(layoutNode0, "layoutNode");
        L.p(layoutModifierNode0, "measureNode");
        super(layoutNode0);
        this.K = layoutModifierNode0;
        this.L = (layoutModifierNode0.getNode().J() & 0x200) == 0 || !(layoutModifierNode0 instanceof IntermediateLayoutModifierNode) ? null : ((IntermediateLayoutModifierNode)layoutModifierNode0);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int D0(int v) {
        return this.K.g(this, this.O3(), v);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    @l
    public Node M2() {
        return this.K.getNode();
    }

    @l
    public final LayoutModifierNode N3() {
        return this.K;
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    protected void O1(long v, float f, @m Function1 function10) {
        super.O1(v, f, function10);
        if(this.c2()) {
            return;
        }
        this.j3();
        LayoutDirection layoutDirection0 = this.getLayoutDirection();
        LayoutDirection layoutDirection1 = PlacementScope.a.m();
        PlacementScope.d = (int)(this.L1() >> 0x20);
        PlacementScope.c = layoutDirection0;
        boolean z = PlacementScope.a.J(this);
        this.X1().l();
        this.e2(z);
        PlacementScope.d = 0;
        PlacementScope.c = layoutDirection1;
        PlacementScope.e = PlacementScope.e;
        PlacementScope.f = PlacementScope.f;
    }

    @l
    public final NodeCoordinator O3() {
        NodeCoordinator nodeCoordinator0 = this.N2();
        L.m(nodeCoordinator0);
        return nodeCoordinator0;
    }

    public final void P3(@l LayoutModifierNode layoutModifierNode0) {
        L.p(layoutModifierNode0, "<set-?>");
        this.K = layoutModifierNode0;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int S0(int v) {
        return this.K.c(this, this.O3(), v);
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int S1(@l AlignmentLine alignmentLine0) {
        L.p(alignmentLine0, "alignmentLine");
        LookaheadDelegate lookaheadDelegate0 = this.I2();
        return lookaheadDelegate0 == null ? LayoutModifierNodeCoordinatorKt.b(this, alignmentLine0) : lookaheadDelegate0.i2(alignmentLine0);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void f3() {
        super.f3();
        LayoutModifierNode layoutModifierNode0 = this.K;
        if((layoutModifierNode0.getNode().J() & 0x200) == 0 || !(layoutModifierNode0 instanceof IntermediateLayoutModifierNode)) {
            this.L = null;
            LookaheadDelegate lookaheadDelegate1 = this.I2();
            if(lookaheadDelegate1 != null) {
                this.G3(new LookaheadDelegateForLayoutModifierNode(this, lookaheadDelegate1.m2()));
            }
        }
        else {
            this.L = (IntermediateLayoutModifierNode)layoutModifierNode0;
            LookaheadDelegate lookaheadDelegate0 = this.I2();
            if(lookaheadDelegate0 != null) {
                this.G3(new LookaheadDelegateForIntermediateLayoutModifier(this, lookaheadDelegate0.m2(), ((IntermediateLayoutModifierNode)layoutModifierNode0)));
            }
        }
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int g(int v) {
        return this.K.f(this, this.O3(), v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int h1(int v) {
        return this.K.e(this, this.O3(), v);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void l3(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        this.O3().y2(canvas0);
        if(LayoutNodeKt.b(this.M0()).getShowLayoutBounds()) {
            this.z2(canvas0, LayoutModifierNodeCoordinator.N);
        }
    }

    @Override  // androidx.compose.ui.layout.Measurable
    @l
    public Placeable r1(long v) {
        this.R1(v);
        this.r3(this.K.h(this, this.O3(), v));
        OwnedLayer ownedLayer0 = this.G2();
        if(ownedLayer0 != null) {
            ownedLayer0.g(this.L1());
        }
        this.i3();
        return this;
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    @l
    public LookaheadDelegate w2(@l LookaheadScope lookaheadScope0) {
        L.p(lookaheadScope0, "scope");
        IntermediateLayoutModifierNode intermediateLayoutModifierNode0 = this.L;
        return intermediateLayoutModifierNode0 != null ? new LookaheadDelegateForIntermediateLayoutModifier(this, lookaheadScope0, intermediateLayoutModifierNode0) : new LookaheadDelegateForLayoutModifierNode(this, lookaheadScope0);
    }
}

