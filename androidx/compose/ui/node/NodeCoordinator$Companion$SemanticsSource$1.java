package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n73#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n*L\n1263#1:1355\n*E\n"})
public final class NodeCoordinator.Companion.SemanticsSource.1 implements HitTestSource {
    @Override  // androidx.compose.ui.node.NodeCoordinator$HitTestSource
    public int a() {
        return 8;
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator$HitTestSource
    public void b(@l LayoutNode layoutNode0, long v, @l HitTestResult hitTestResult0, boolean z, boolean z1) {
        L.p(layoutNode0, "layoutNode");
        L.p(hitTestResult0, "hitTestResult");
        layoutNode0.L0(v, hitTestResult0, z, z1);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator$HitTestSource
    public boolean c(DelegatableNode delegatableNode0) {
        return this.e(((SemanticsModifierNode)delegatableNode0));
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator$HitTestSource
    public boolean d(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "parentLayoutNode");
        SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.j(layoutNode0);
        int v = 0;
        if(semanticsModifierNode0 != null) {
            SemanticsConfiguration semanticsConfiguration0 = SemanticsModifierNodeKt.a(semanticsModifierNode0);
            if(semanticsConfiguration0 != null && semanticsConfiguration0.j()) {
                v = 1;
            }
        }
        return v ^ 1;
    }

    public boolean e(@l SemanticsModifierNode semanticsModifierNode0) {
        L.p(semanticsModifierNode0, "node");
        return false;
    }
}

