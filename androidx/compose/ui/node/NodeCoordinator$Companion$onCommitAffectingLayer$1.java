package androidx.compose.ui.node;

import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class NodeCoordinator.Companion.onCommitAffectingLayer.1 extends N implements Function1 {
    public static final NodeCoordinator.Companion.onCommitAffectingLayer.1 e;

    static {
        NodeCoordinator.Companion.onCommitAffectingLayer.1.e = new NodeCoordinator.Companion.onCommitAffectingLayer.1();
    }

    NodeCoordinator.Companion.onCommitAffectingLayer.1() {
        super(1);
    }

    public final void a(@l NodeCoordinator nodeCoordinator0) {
        L.p(nodeCoordinator0, "coordinator");
        OwnedLayer ownedLayer0 = nodeCoordinator0.G2();
        if(ownedLayer0 != null) {
            ownedLayer0.invalidate();
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((NodeCoordinator)object0));
        return S0.a;
    }
}

