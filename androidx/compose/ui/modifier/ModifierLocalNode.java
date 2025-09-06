package androidx.compose.ui.modifier;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.jvm.internal.s0;
import y4.l;

@ExperimentalComposeUiApi
@s0({"SMAP\nModifierLocalNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,220:1\n77#2:221\n314#3:222\n78#3,17:223\n*S KotlinDebug\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNode\n*L\n170#1:221\n170#1:222\n170#1:223,17\n*E\n"})
public interface ModifierLocalNode extends ModifierLocalReadScope, DelegatableNode {
    @Override  // androidx.compose.ui.modifier.ModifierLocalReadScope
    Object a(@l ModifierLocal arg1);

    @l
    ModifierLocalMap j();

    void y(@l ModifierLocal arg1, Object arg2);
}

