package androidx.compose.ui.focus;

import A3.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalNode;
import androidx.compose.ui.modifier.b;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.ObserverNode;
import androidx.compose.ui.node.ObserverNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@s0({"SMAP\nFocusTargetModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetModifierNode.kt\nandroidx/compose/ui/focus/FocusTargetModifierNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,137:1\n89#2:138\n87#2:139\n87#2:150\n91#2:159\n87#2:160\n87#2:171\n47#3:140\n47#3:161\n78#4,9:141\n88#4,7:152\n78#4,9:162\n88#4,7:173\n196#5:151\n196#5:172\n*S KotlinDebug\n*F\n+ 1 FocusTargetModifierNode.kt\nandroidx/compose/ui/focus/FocusTargetModifierNode\n*L\n84#1:138\n84#1:139\n87#1:150\n116#1:159\n116#1:160\n117#1:171\n84#1:140\n116#1:161\n84#1:141,9\n84#1:152,7\n116#1:162,9\n116#1:173,7\n87#1:151\n117#1:172\n*E\n"})
public final class FocusTargetModifierNode extends Node implements ModifierLocalNode, ObserverNode {
    public static final class FocusTargetModifierElement extends ModifierNodeElement {
        @l
        public static final FocusTargetModifierElement c;

        static {
            FocusTargetModifierElement.c = new FocusTargetModifierElement();
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public Node a() {
            return this.p();
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(@m Object object0) {
            return object0 == this;
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return 0x67A7B089;
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public void m(@l InspectorInfo inspectorInfo0) {
            L.p(inspectorInfo0, "<this>");
            inspectorInfo0.d("focusTarget");
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public Node n(Node modifier$Node0) {
            return this.q(((FocusTargetModifierNode)modifier$Node0));
        }

        @l
        public FocusTargetModifierNode p() {
            return new FocusTargetModifierNode();
        }

        @l
        public FocusTargetModifierNode q(@l FocusTargetModifierNode focusTargetModifierNode0) {
            L.p(focusTargetModifierNode0, "node");
            return focusTargetModifierNode0;
        }
    }

    @l
    private FocusStateImpl l;
    public static final int m = 8;

    static {
    }

    public FocusTargetModifierNode() {
        this.l = FocusStateImpl.d;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void U() {
        FocusState focusState0 = this.k0();
        if(focusState0 == FocusStateImpl.a || focusState0 == FocusStateImpl.c) {
            DelegatableNodeKt.q(this).getFocusOwner().m(true);
            return;
        }
        if(focusState0 == FocusStateImpl.b) {
            this.n0();
            this.l = FocusStateImpl.d;
            return;
        }
        if(focusState0 == FocusStateImpl.d) {
            this.n0();
        }
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalNode
    public Object a(ModifierLocal modifierLocal0) {
        return b.a(this, modifierLocal0);
    }

    @ExperimentalComposeUiApi
    @l
    public final FocusProperties i0() {
        FocusProperties focusProperties0 = new FocusPropertiesImpl();
        if(!this.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = this.getNode().O();
        LayoutNode layoutNode0 = DelegatableNodeKt.p(this);
        while(layoutNode0 != null) {
            if((layoutNode0.x0().m().D() & 0xC00) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.J() & 0xC00) != 0) {
                        if((0x400 & modifier$Node0.J()) != 0) {
                            return focusProperties0;
                        }
                        if(!(modifier$Node0 instanceof FocusPropertiesModifierNode)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        ((FocusPropertiesModifierNode)modifier$Node0).l(focusProperties0);
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
        return focusProperties0;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalNode
    public ModifierLocalMap j() {
        return b.b(this);
    }

    @m
    public final BeyondBoundsLayout j0() {
        return (BeyondBoundsLayout)this.a(BeyondBoundsLayoutKt.a());
    }

    @l
    public final FocusState k0() {
        return this.l;
    }

    @l
    public final FocusStateImpl l0() {
        return this.l;
    }

    public final void m0() {
        FocusProperties focusProperties0;
        FocusState focusState0 = this.k0();
        if(focusState0 == FocusStateImpl.a || focusState0 == FocusStateImpl.c) {
            h l0$h0 = new h();
            ObserverNodeKt.a(this, new a(this) {
                final h e;
                final FocusTargetModifierNode f;

                {
                    this.e = l0$h0;
                    this.f = focusTargetModifierNode0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    this.e.a = this.f.i0();
                }
            });
            Object object0 = l0$h0.a;
            if(object0 == null) {
                L.S("focusProperties");
                focusProperties0 = null;
            }
            else {
                focusProperties0 = (FocusProperties)object0;
            }
            if(!focusProperties0.r()) {
                DelegatableNodeKt.q(this).getFocusOwner().m(true);
            }
        }
    }

    public final void n0() {
        if(!this.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = this.getNode().O();
        LayoutNode layoutNode0 = DelegatableNodeKt.p(this);
        while(layoutNode0 != null) {
            if((layoutNode0.x0().m().D() & 0x1400) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.J() & 0x1400) != 0 && (0x400 & modifier$Node0.J()) == 0) {
                        if(!(modifier$Node0 instanceof FocusEventModifierNode)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        DelegatableNodeKt.q(this).getFocusOwner().g(((FocusEventModifierNode)modifier$Node0));
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
    }

    public final void o0(@l FocusStateImpl focusStateImpl0) {
        L.p(focusStateImpl0, "<set-?>");
        this.l = focusStateImpl0;
    }

    @Override  // androidx.compose.ui.node.ObserverNode
    public void t() {
        this.m0();
        if(!L.g(this.k0(), this.k0())) {
            FocusEventModifierNodeKt.b(this);
        }
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalNode
    public void y(ModifierLocal modifierLocal0, Object object0) {
        b.c(this, modifierLocal0, object0);
    }
}

