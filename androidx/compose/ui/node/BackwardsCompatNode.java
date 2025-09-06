package androidx.compose.ui.node;

import A3.a;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.layout.IntermediateLayoutModifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.LookaheadOnPlacedModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.BackwardsCompatLocalMap;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalNode;
import androidx.compose.ui.modifier.ModifierLocalNodeKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.b;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashSet;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,471:1\n77#2:472\n73#2:474\n77#2:478\n71#2:480\n69#2:482\n81#2:484\n83#2:486\n75#2:490\n73#2:492\n81#2:494\n77#2:495\n196#3:473\n196#3:475\n196#3:479\n196#3:481\n196#3:483\n196#3:485\n196#3:487\n196#3:491\n196#3:493\n735#4,2:476\n728#4,2:488\n314#5:496\n78#5,17:497\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n*L\n120#1:472\n130#1:474\n141#1:478\n152#1:480\n160#1:482\n176#1:484\n201#1:486\n214#1:490\n219#1:492\n229#1:494\n265#1:495\n120#1:473\n130#1:475\n141#1:479\n152#1:481\n160#1:483\n176#1:485\n201#1:487\n214#1:491\n219#1:493\n134#1:476,2\n212#1:488,2\n265#1:496\n265#1:497,17\n*E\n"})
public final class BackwardsCompatNode extends Node implements BuildDrawCacheParams, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, ModifierLocalNode, ModifierLocalReadScope, DrawModifierNode, GlobalPositionAwareModifierNode, IntermediateLayoutModifierNode, LayoutAwareModifierNode, LayoutModifierNode, OwnerScope, ParentDataModifierNode, PointerInputModifierNode, SemanticsModifierNode {
    @l
    private Element l;
    private boolean m;
    @m
    private BackwardsCompatLocalMap n;
    @l
    private HashSet o;
    @m
    private LayoutCoordinates p;

    public BackwardsCompatNode(@l Element modifier$Element0) {
        L.p(modifier$Element0, "element");
        super();
        this.b0(NodeKindKt.e(modifier$Element0));
        this.l = modifier$Element0;
        this.m = true;
        this.o = new HashSet();
    }

    @Override  // androidx.compose.ui.node.IntermediateLayoutModifierNode
    public void B(long v) {
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        ((IntermediateLayoutModifier)modifier$Element0).B(v);
    }

    @Override  // androidx.compose.ui.node.ParentDataModifierNode
    @m
    public Object E(@l Density density0, @m Object object0) {
        L.p(density0, "<this>");
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((ParentDataModifier)modifier$Element0).E(density0, object0);
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean H() {
        return this.Q();
    }

    @Override  // androidx.compose.ui.focus.FocusEventModifierNode
    public void K(@l FocusState focusState0) {
        L.p(focusState0, "focusState");
        Element modifier$Element0 = this.l;
        if(!(modifier$Element0 instanceof FocusEventModifier)) {
            throw new IllegalStateException("Check failed.");
        }
        ((FocusEventModifier)modifier$Element0).K(focusState0);
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void L(long v) {
        Element modifier$Element0 = this.l;
        if(modifier$Element0 instanceof OnRemeasuredModifier) {
            ((OnRemeasuredModifier)modifier$Element0).L(v);
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void S() {
        this.l0(true);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void T() {
        this.p0();
    }

    @Override  // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void X(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "coordinates");
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((OnGloballyPositionedModifier)modifier$Element0).X(layoutCoordinates0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public Object a(@l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "<this>");
        this.o.add(modifierLocal0);
        if(!this.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = this.getNode().O();
        LayoutNode layoutNode0 = DelegatableNodeKt.p(this);
        while(layoutNode0 != null) {
            if((layoutNode0.x0().m().D() & 0x20) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.J() & 0x20) != 0 && modifier$Node0 instanceof ModifierLocalNode && ((ModifierLocalNode)modifier$Node0).j().a(modifierLocal0)) {
                        return ((ModifierLocalNode)modifier$Node0).j().b(modifierLocal0);
                    }
                    modifier$Node0 = modifier$Node0.O();
                }
            }
            layoutNode0 = layoutNode0.C0();
            if(layoutNode0 != null) {
                NodeChain nodeChain0 = layoutNode0.x0();
                if(nodeChain0 != null) {
                    modifier$Node0 = nodeChain0.r();
                    continue;
                }
            }
            modifier$Node0 = null;
        }
        return modifierLocal0.a().invoke();
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    public long b() {
        return IntSizeKt.f(DelegatableNodeKt.o(this, 0x80).a());
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int c(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier)modifier$Element0).c(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    @l
    public SemanticsConfiguration c0() {
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((SemanticsModifier)modifier$Element0).c0();
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public void d() {
        c.a(this);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier)modifier$Element0).e(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int f(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier)modifier$Element0).f(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int g(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier)modifier$Element0).g(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    @l
    public Density getDensity() {
        return DelegatableNodeKt.p(this).getDensity();
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    @l
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.p(this).getLayoutDirection();
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier)modifier$Element0).h(measureScope0, measurable0, v);
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public boolean i() {
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier)modifier$Element0).t1().A1();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalNode
    @l
    public ModifierLocalMap j() {
        return this.n == null ? ModifierLocalNodeKt.a() : this.n;
    }

    @l
    public final Element j0() {
        return this.l;
    }

    @Override  // androidx.compose.ui.node.IntermediateLayoutModifierNode
    public long k() {
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        return ((IntermediateLayoutModifier)modifier$Element0).k();
    }

    @l
    public final HashSet k0() {
        return this.o;
    }

    @Override  // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void l(@l FocusProperties focusProperties0) {
        L.p(focusProperties0, "focusProperties");
        Element modifier$Element0 = this.l;
        if(!(modifier$Element0 instanceof FocusOrderModifier)) {
            throw new IllegalStateException("Check failed.");
        }
        new FocusOrderModifierToProperties(((FocusOrderModifier)modifier$Element0)).invoke(focusProperties0);
    }

    private final void l0(boolean z) {
        if(!this.Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Element modifier$Element0 = this.l;
        if((0x20 & this.J()) != 0) {
            if(modifier$Element0 instanceof ModifierLocalProvider) {
                this.s0(((ModifierLocalProvider)modifier$Element0));
            }
            if(modifier$Element0 instanceof ModifierLocalConsumer) {
                if(z) {
                    this.r0();
                }
                else {
                    this.g0(new a() {
                        final BackwardsCompatNode e;

                        {
                            this.e = backwardsCompatNode0;
                            super(0);
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            this.invoke();
                            return S0.a;
                        }

                        public final void invoke() {
                            this.e.r0();
                        }
                    });
                }
            }
        }
        if((4 & this.J()) != 0) {
            if(modifier$Element0 instanceof DrawCacheModifier) {
                this.m = true;
            }
            if(!z) {
                LayoutModifierNodeKt.a(this);
            }
        }
        if((2 & this.J()) != 0) {
            if(DelegatableNodeKt.p(this).x0().r().Q()) {
                NodeCoordinator nodeCoordinator0 = this.G();
                L.m(nodeCoordinator0);
                ((LayoutModifierNodeCoordinator)nodeCoordinator0).P3(this);
                nodeCoordinator0.f3();
            }
            if(!z) {
                LayoutModifierNodeKt.a(this);
                DelegatableNodeKt.p(this).T0();
            }
        }
        if(modifier$Element0 instanceof RemeasurementModifier) {
            ((RemeasurementModifier)modifier$Element0).h1(this);
        }
        if((0x80 & this.J()) != 0) {
            if(modifier$Element0 instanceof OnRemeasuredModifier && DelegatableNodeKt.p(this).x0().r().Q()) {
                DelegatableNodeKt.p(this).T0();
            }
            if(modifier$Element0 instanceof OnPlacedModifier) {
                this.p = null;
                if(DelegatableNodeKt.p(this).x0().r().Q()) {
                    DelegatableNodeKt.q(this).e(new OnLayoutCompletedListener() {
                        @Override  // androidx.compose.ui.node.Owner$OnLayoutCompletedListener
                        public void s() {
                            if(this.a.p == null) {
                                NodeCoordinator nodeCoordinator0 = DelegatableNodeKt.o(this.a, 0x80);
                                this.a.o(nodeCoordinator0);
                            }
                        }
                    });
                }
            }
        }
        if((0x100 & this.J()) != 0 && modifier$Element0 instanceof OnGloballyPositionedModifier && DelegatableNodeKt.p(this).x0().r().Q()) {
            DelegatableNodeKt.p(this).T0();
        }
        if(modifier$Element0 instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier)modifier$Element0).g0().f().b(this);
        }
        if((16 & this.J()) != 0 && modifier$Element0 instanceof PointerInputModifier) {
            ((PointerInputModifier)modifier$Element0).t1().y0(this.G());
        }
        if((8 & this.J()) != 0) {
            DelegatableNodeKt.q(this).z();
        }
    }

    public final void m0() {
        this.m = true;
        DrawModifierNodeKt.a(this);
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void n() {
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier)modifier$Element0).t1().j0();
    }

    public final void n0(@l Element modifier$Element0) {
        L.p(modifier$Element0, "value");
        if(this.Q()) {
            this.p0();
        }
        this.l = modifier$Element0;
        this.b0(NodeKindKt.e(modifier$Element0));
        if(this.Q()) {
            this.l0(false);
        }
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void o(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "coordinates");
        this.p = layoutCoordinates0;
        Element modifier$Element0 = this.l;
        if(modifier$Element0 instanceof OnPlacedModifier) {
            ((OnPlacedModifier)modifier$Element0).o(layoutCoordinates0);
        }
    }

    public final void o0(@l HashSet hashSet0) {
        L.p(hashSet0, "<set-?>");
        this.o = hashSet0;
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void p() {
        this.m = true;
        DrawModifierNodeKt.a(this);
    }

    private final void p0() {
        if(!this.Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Element modifier$Element0 = this.l;
        if((0x20 & this.J()) != 0) {
            if(modifier$Element0 instanceof ModifierLocalProvider) {
                DelegatableNodeKt.q(this).getModifierLocalManager().e(this, ((ModifierLocalProvider)modifier$Element0).getKey());
            }
            if(modifier$Element0 instanceof ModifierLocalConsumer) {
                ((ModifierLocalConsumer)modifier$Element0).r1(BackwardsCompatNodeKt.a);
            }
        }
        if((8 & this.J()) != 0) {
            DelegatableNodeKt.q(this).z();
        }
        if(modifier$Element0 instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier)modifier$Element0).g0().f().a0(this);
        }
    }

    private final void q0() {
        Element modifier$Element0 = this.l;
        if(modifier$Element0 instanceof DrawCacheModifier) {
            DelegatableNodeKt.q(this).getSnapshotObserver().i(this, BackwardsCompatNodeKt.b, new a(this) {
                final Element e;
                final BackwardsCompatNode f;

                {
                    this.e = modifier$Element0;
                    this.f = backwardsCompatNode0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    ((DrawCacheModifier)this.e).D0(this.f);
                }
            });
        }
        this.m = false;
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void r(@l PointerEvent pointerEvent0, @l PointerEventPass pointerEventPass0, long v) {
        L.p(pointerEvent0, "pointerEvent");
        L.p(pointerEventPass0, "pass");
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier)modifier$Element0).t1().m0(pointerEvent0, pointerEventPass0, v);
    }

    public final void r0() {
        if(this.Q()) {
            this.o.clear();
            DelegatableNodeKt.q(this).getSnapshotObserver().i(this, BackwardsCompatNodeKt.c, new a() {
                final BackwardsCompatNode e;

                {
                    this.e = backwardsCompatNode0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    Element modifier$Element0 = this.e.j0();
                    L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((ModifierLocalConsumer)modifier$Element0).r1(this.e);
                }
            });
        }
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void s(@l LookaheadLayoutCoordinates lookaheadLayoutCoordinates0) {
        L.p(lookaheadLayoutCoordinates0, "coordinates");
        Element modifier$Element0 = this.l;
        if(modifier$Element0 instanceof LookaheadOnPlacedModifier) {
            ((LookaheadOnPlacedModifier)modifier$Element0).d(lookaheadLayoutCoordinates0);
        }
    }

    private final void s0(ModifierLocalProvider modifierLocalProvider0) {
        BackwardsCompatLocalMap backwardsCompatLocalMap0 = this.n;
        if(backwardsCompatLocalMap0 != null && backwardsCompatLocalMap0.a(modifierLocalProvider0.getKey())) {
            backwardsCompatLocalMap0.e(modifierLocalProvider0);
            DelegatableNodeKt.q(this).getModifierLocalManager().g(this, modifierLocalProvider0.getKey());
            return;
        }
        this.n = new BackwardsCompatLocalMap(modifierLocalProvider0);
        if(DelegatableNodeKt.p(this).x0().r().Q()) {
            DelegatableNodeKt.q(this).getModifierLocalManager().b(this, modifierLocalProvider0.getKey());
        }
    }

    @Override
    @l
    public String toString() {
        return this.l.toString();
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void v(@l ContentDrawScope contentDrawScope0) {
        L.p(contentDrawScope0, "<this>");
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        if(this.m && modifier$Element0 instanceof DrawCacheModifier) {
            this.q0();
        }
        ((DrawModifier)modifier$Element0).v(contentDrawScope0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalNode
    public void y(ModifierLocal modifierLocal0, Object object0) {
        b.c(this, modifierLocal0, object0);
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public boolean z() {
        Element modifier$Element0 = this.l;
        L.n(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier)modifier$Element0).t1().Z();
    }
}

