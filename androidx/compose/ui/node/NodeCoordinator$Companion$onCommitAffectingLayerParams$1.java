package androidx.compose.ui.node;

import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class NodeCoordinator.Companion.onCommitAffectingLayerParams.1 extends N implements Function1 {
    public static final NodeCoordinator.Companion.onCommitAffectingLayerParams.1 e;

    static {
        NodeCoordinator.Companion.onCommitAffectingLayerParams.1.e = new NodeCoordinator.Companion.onCommitAffectingLayerParams.1();
    }

    NodeCoordinator.Companion.onCommitAffectingLayerParams.1() {
        super(1);
    }

    public final void a(@l NodeCoordinator nodeCoordinator0) {
        L.p(nodeCoordinator0, "coordinator");
        if(nodeCoordinator0.H()) {
            LayerPositionalProperties layerPositionalProperties0 = nodeCoordinator0.w;
            if(layerPositionalProperties0 == null) {
                nodeCoordinator0.F3();
                return;
            }
            NodeCoordinator.G.b(layerPositionalProperties0);
            nodeCoordinator0.F3();
            if(!NodeCoordinator.G.c(layerPositionalProperties0)) {
                LayoutNode layoutNode0 = nodeCoordinator0.M0();
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0.k0();
                if(layoutNodeLayoutDelegate0.m() > 0) {
                    if(layoutNodeLayoutDelegate0.n()) {
                        LayoutNode.A1(layoutNode0, false, 1, null);
                    }
                    layoutNodeLayoutDelegate0.x().Y1();
                }
                Owner owner0 = layoutNode0.B0();
                if(owner0 != null) {
                    owner0.c(layoutNode0);
                }
            }
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((NodeCoordinator)object0));
        return S0.a;
    }
}

