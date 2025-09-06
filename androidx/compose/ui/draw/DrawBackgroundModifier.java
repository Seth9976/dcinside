package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class DrawBackgroundModifier extends Node implements DrawModifierNode {
    @l
    private Function1 l;

    public DrawBackgroundModifier(@l Function1 function10) {
        L.p(function10, "onDraw");
        super();
        this.l = function10;
    }

    @l
    public final Function1 i0() {
        return this.l;
    }

    public final void j0(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.l = function10;
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void p() {
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void v(@l ContentDrawScope contentDrawScope0) {
        L.p(contentDrawScope0, "<this>");
        this.l.invoke(contentDrawScope0);
        contentDrawScope0.Q0();
    }
}

