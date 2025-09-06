package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Node;
import kotlin.jvm.internal.s0;

@s0({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,114:1\n71#2:115\n69#2:116\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n101#1:115\n102#1:116\n*E\n"})
public final class LayoutNodeDrawScopeKt {
    private static final DrawModifierNode b(DelegatableNode delegatableNode0) {
        Node modifier$Node0 = delegatableNode0.getNode().F();
        if(modifier$Node0 == null) {
            return null;
        }
        if((modifier$Node0.D() & 4) == 0) {
            return null;
        }
        while(true) {
            if(modifier$Node0 == null || (modifier$Node0.J() & 2) != 0) {
                return null;
            }
            if((modifier$Node0.J() & 4) != 0) {
                return (DrawModifierNode)modifier$Node0;
            }
            modifier$Node0 = modifier$Node0.F();
        }
    }
}

