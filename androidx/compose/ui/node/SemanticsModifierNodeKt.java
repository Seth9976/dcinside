package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,73:1\n73#2:74\n73#2:76\n73#2:77\n308#3:75\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n48#1:74\n68#1:76\n71#1:77\n48#1:75\n*E\n"})
public final class SemanticsModifierNodeKt {
    @ExperimentalComposeUiApi
    @l
    public static final SemanticsConfiguration a(@l SemanticsModifierNode semanticsModifierNode0) {
        L.p(semanticsModifierNode0, "<this>");
        Node modifier$Node0 = DelegatableNodeKt.i(semanticsModifierNode0, 8);
        if(!(modifier$Node0 instanceof SemanticsModifierNode)) {
            modifier$Node0 = null;
        }
        if(((SemanticsModifierNode)modifier$Node0) != null && !semanticsModifierNode0.c0().j()) {
            SemanticsConfiguration semanticsConfiguration0 = semanticsModifierNode0.c0().d();
            semanticsConfiguration0.b(SemanticsModifierNodeKt.a(((SemanticsModifierNode)modifier$Node0)));
            return semanticsConfiguration0;
        }
        return semanticsModifierNode0.c0();
    }

    public static final boolean b(@l SemanticsModifierNode semanticsModifierNode0) {
        L.p(semanticsModifierNode0, "<this>");
        return SemanticsConfigurationKt.a(semanticsModifierNode0.c0(), SemanticsActions.a.h()) != null;
    }

    public static void c(SemanticsModifierNode semanticsModifierNode0) {
    }

    @ExperimentalComposeUiApi
    public static final void d(@l SemanticsModifierNode semanticsModifierNode0) {
        L.p(semanticsModifierNode0, "<this>");
        DelegatableNodeKt.q(semanticsModifierNode0).z();
    }

    @l
    public static final Rect e(@l SemanticsModifierNode semanticsModifierNode0) {
        L.p(semanticsModifierNode0, "<this>");
        if(!semanticsModifierNode0.getNode().Q()) {
            return Rect.e.a();
        }
        return SemanticsModifierNodeKt.b(semanticsModifierNode0) ? DelegatableNodeKt.o(semanticsModifierNode0, 8).A3() : LayoutCoordinatesKt.b(DelegatableNodeKt.o(semanticsModifierNode0, 8));
    }
}

