package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class OnPlacedModifierImpl extends Node implements LayoutAwareModifierNode {
    @l
    private Function1 l;

    public OnPlacedModifierImpl(@l Function1 function10) {
        L.p(function10, "callback");
        super();
        this.l = function10;
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void L(long v) {
    }

    @l
    public final Function1 i0() {
        return this.l;
    }

    public final void j0(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.l = function10;
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void o(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "coordinates");
        this.l.invoke(layoutCoordinates0);
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void s(LookaheadLayoutCoordinates lookaheadLayoutCoordinates0) {
        b.a(this, lookaheadLayoutCoordinates0);
    }
}

