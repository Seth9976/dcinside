package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import kotlin.jvm.internal.L;
import y4.l;

public final class b {
    public static Object a(ModifierLocalNode modifierLocalNode0, @l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "<this>");
        if(!modifierLocalNode0.getNode().Q()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(!modifierLocalNode0.getNode().Q()) {
            throw new IllegalStateException("Check failed.");
        }
        Node modifier$Node0 = modifierLocalNode0.getNode().O();
        LayoutNode layoutNode0 = DelegatableNodeKt.p(modifierLocalNode0);
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

    @l
    public static ModifierLocalMap b(ModifierLocalNode modifierLocalNode0) {
        return EmptyMap.b;
    }

    public static void c(ModifierLocalNode modifierLocalNode0, @l ModifierLocal modifierLocal0, Object object0) {
        L.p(modifierLocal0, "key");
        if(modifierLocalNode0.j() == EmptyMap.b) {
            throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if(!modifierLocalNode0.j().a(modifierLocal0)) {
            throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + modifierLocal0 + " was not found.").toString());
        }
        modifierLocalNode0.j().c(modifierLocal0, object0);
    }
}

