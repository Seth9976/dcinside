package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,223:1\n306#2,2:224\n308#2,2:238\n163#3:226\n460#4,11:227\n460#4,11:240\n222#4,11:253\n178#5,2:251\n180#5,2:264\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n96#1:224,2\n96#1:238,2\n98#1:226\n98#1:227,11\n149#1:240,11\n185#1:253,11\n182#1:251,2\n182#1:264,2\n*E\n"})
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Paint a() {
            return InnerNodeCoordinator.M;
        }
    }

    @s0({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,223:1\n173#2,2:224\n175#2:238\n163#3:226\n460#4,11:227\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n53#1:224,2\n53#1:238\n55#1:226\n55#1:227,11\n*E\n"})
    final class LookaheadDelegateImpl extends LookaheadDelegate {
        final InnerNodeCoordinator o;

        public LookaheadDelegateImpl(@l LookaheadScope lookaheadScope0) {
            L.p(lookaheadScope0, "scope");
            this.o = innerNodeCoordinator0;
            super(innerNodeCoordinator0, lookaheadScope0);
        }

        @Override  // androidx.compose.ui.node.LookaheadDelegate
        public int D0(int v) {
            return this.M0().i0().j(v);
        }

        @Override  // androidx.compose.ui.node.LookaheadDelegate
        public int S0(int v) {
            return this.M0().i0().k(v);
        }

        @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int S1(@l AlignmentLine alignmentLine0) {
            L.p(alignmentLine0, "alignmentLine");
            Integer integer0 = (Integer)this.T1().e().get(alignmentLine0);
            int v = integer0 == null ? 0x80000000 : ((int)integer0);
            this.j2().put(alignmentLine0, v);
            return v;
        }

        @Override  // androidx.compose.ui.node.LookaheadDelegate
        public int g(int v) {
            return this.M0().i0().e(v);
        }

        @Override  // androidx.compose.ui.node.LookaheadDelegate
        public int h1(int v) {
            return this.M0().i0().f(v);
        }

        @Override  // androidx.compose.ui.node.LookaheadDelegate
        protected void o2() {
            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.M0().k0().w();
            L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
            layoutNodeLayoutDelegate$LookaheadPassDelegate0.f2();
            this.T1().r0();
        }

        @Override  // androidx.compose.ui.layout.Measurable
        @l
        public Placeable r1(long v) {
            this.R1(v);
            MutableVector mutableVector0 = this.M0().I0();
            int v1 = mutableVector0.J();
            if(v1 > 0) {
                Object[] arr_object = mutableVector0.F();
                int v2 = 0;
                while(true) {
                    ((LayoutNode)arr_object[v2]).O1(UsageByParent.c);
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                }
            }
            this.r2(this.M0().t().a(this, this.M0().Y(), v));
            return this;
        }
    }

    @l
    private final Node K;
    @l
    public static final Companion L;
    @l
    private static final Paint M;

    static {
        InnerNodeCoordinator.L = new Companion(null);
        Paint paint0 = AndroidPaint_androidKt.a();
        paint0.g(0xFFFF000000000000L);
        paint0.q(1.0f);
        paint0.p(1);
        InnerNodeCoordinator.M = paint0;
    }

    public InnerNodeCoordinator(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "layoutNode");
        super(layoutNode0);
        this.K = new androidx.compose.ui.node.InnerNodeCoordinator.tail.1();
        this.M2().h0(this);

        public final class androidx.compose.ui.node.InnerNodeCoordinator.tail.1 extends Node {
            @Override
            @l
            public String toString() {
                return "<tail>";
            }
        }

    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int D0(int v) {
        return this.M0().i0().h(v);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    @l
    public Node M2() {
        return this.K;
    }

    public static void N3() {
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    protected void O1(long v, float f, @m Function1 function10) {
        super.O1(v, f, function10);
        if(this.c2()) {
            return;
        }
        this.j3();
        this.M0().m1();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int S0(int v) {
        return this.M0().i0().i(v);
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int S1(@l AlignmentLine alignmentLine0) {
        L.p(alignmentLine0, "alignmentLine");
        LookaheadDelegate lookaheadDelegate0 = this.I2();
        if(lookaheadDelegate0 != null) {
            return lookaheadDelegate0.S1(alignmentLine0);
        }
        Integer integer0 = (Integer)this.T1().e().get(alignmentLine0);
        return integer0 == null ? 0x80000000 : ((int)integer0);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void X2(@l HitTestSource nodeCoordinator$HitTestSource0, long v, @l HitTestResult hitTestResult0, boolean z, boolean z1) {
        boolean z3;
        L.p(nodeCoordinator$HitTestSource0, "hitTestSource");
        L.p(hitTestResult0, "hitTestResult");
        boolean z2 = false;
        if(!nodeCoordinator$HitTestSource0.d(this.M0())) {
            z3 = z1;
        }
        else if(this.L3(v)) {
            z3 = z1;
            z2 = true;
        }
        else if(z) {
            float f = this.x2(v, this.J2());
            if(Float.isInfinite(f) || Float.isNaN(f)) {
                z3 = z1;
            }
            else {
                z2 = true;
                z3 = false;
            }
        }
        else {
            z3 = z1;
        }
        if(z2) {
            int v1 = hitTestResult0.c;
            MutableVector mutableVector0 = this.M0().G0();
            int v2 = mutableVector0.J();
            if(v2 > 0) {
                Object[] arr_object = mutableVector0.F();
                int v3 = v2 - 1;
                while(true) {
                    LayoutNode layoutNode0 = (LayoutNode)arr_object[v3];
                    if(layoutNode0.u()) {
                        nodeCoordinator$HitTestSource0.b(layoutNode0, v, hitTestResult0, z, z3);
                        if(hitTestResult0.j()) {
                            if(!layoutNode0.A0().w3()) {
                                break;
                            }
                            hitTestResult0.a();
                        }
                    }
                    --v3;
                    if(v3 < 0) {
                        break;
                    }
                }
            }
            hitTestResult0.c = v1;
        }
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int g(int v) {
        return this.M0().i0().c(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int h1(int v) {
        return this.M0().i0().d(v);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void l3(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        Owner owner0 = LayoutNodeKt.b(this.M0());
        MutableVector mutableVector0 = this.M0().G0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.u()) {
                    layoutNode0.Q(canvas0);
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        if(owner0.getShowLayoutBounds()) {
            this.z2(canvas0, InnerNodeCoordinator.M);
        }
    }

    @Override  // androidx.compose.ui.layout.Measurable
    @l
    public Placeable r1(long v) {
        this.R1(v);
        MutableVector mutableVector0 = this.M0().I0();
        int v1 = mutableVector0.J();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.F();
            int v2 = 0;
            while(true) {
                ((LayoutNode)arr_object[v2]).N1(UsageByParent.c);
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        this.r3(this.M0().t().a(this, this.M0().Z(), v));
        this.i3();
        return this;
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    @l
    public LookaheadDelegate w2(@l LookaheadScope lookaheadScope0) {
        L.p(lookaheadScope0, "scope");
        return new LookaheadDelegateImpl(this, lookaheadScope0);
    }
}

