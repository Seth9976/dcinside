package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Node;

public final class NodeCoordinatorKt {
    private static final Object b(DelegatableNode delegatableNode0, int v, int v1) {
        Node modifier$Node0 = delegatableNode0.getNode().F();
        if(modifier$Node0 == null) {
            return null;
        }
        if((modifier$Node0.D() & v) == 0) {
            return null;
        }
        while(modifier$Node0 != null) {
            int v2 = modifier$Node0.J();
            if((v2 & v1) != 0) {
                return null;
            }
            if((v2 & v) != 0) {
                return modifier$Node0;
            }
            modifier$Node0 = modifier$Node0.F();
        }
        return null;
    }
}

