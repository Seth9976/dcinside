package androidx.compose.ui.node;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n75#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n*L\n1242#1:1355\n*E\n"})
public final class NodeCoordinator.Companion.PointerInputSource.1 implements HitTestSource {
    @Override  // androidx.compose.ui.node.NodeCoordinator$HitTestSource
    public int a() {
        return 16;
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator$HitTestSource
    public void b(@l LayoutNode layoutNode0, long v, @l HitTestResult hitTestResult0, boolean z, boolean z1) {
        L.p(layoutNode0, "layoutNode");
        L.p(hitTestResult0, "hitTestResult");
        layoutNode0.J0(v, hitTestResult0, z, z1);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator$HitTestSource
    public boolean c(DelegatableNode delegatableNode0) {
        return this.e(((PointerInputModifierNode)delegatableNode0));
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator$HitTestSource
    public boolean d(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "parentLayoutNode");
        return true;
    }

    public boolean e(@l PointerInputModifierNode pointerInputModifierNode0) {
        L.p(pointerInputModifierNode0, "node");
        return pointerInputModifierNode0.i();
    }
}

