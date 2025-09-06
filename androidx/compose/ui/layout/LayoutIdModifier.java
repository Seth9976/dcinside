package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class LayoutIdModifier extends Node implements LayoutIdParentData, ParentDataModifierNode {
    @l
    private Object l;

    public LayoutIdModifier(@l Object object0) {
        L.p(object0, "layoutId");
        super();
        this.l = object0;
    }

    @Override  // androidx.compose.ui.node.ParentDataModifierNode
    @m
    public Object E(@l Density density0, @m Object object0) {
        L.p(density0, "<this>");
        return this;
    }

    public void i0(@l Object object0) {
        L.p(object0, "<set-?>");
        this.l = object0;
    }

    @Override  // androidx.compose.ui.layout.LayoutIdParentData
    @l
    public Object u() {
        return this.l;
    }
}

