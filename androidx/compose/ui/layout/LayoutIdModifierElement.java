package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class LayoutIdModifierElement extends ModifierNodeElement {
    @l
    private final Object c;

    public LayoutIdModifierElement(@l Object object0) {
        L.p(object0, "layoutId");
        super();
        this.c = object0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node a() {
        return this.s();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LayoutIdModifierElement ? L.g(this.c, ((LayoutIdModifierElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("layoutId");
        inspectorInfo0.e(this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.t(((LayoutIdModifier)modifier$Node0));
    }

    private final Object p() {
        return this.c;
    }

    @l
    public final LayoutIdModifierElement q(@l Object object0) {
        L.p(object0, "layoutId");
        return new LayoutIdModifierElement(object0);
    }

    public static LayoutIdModifierElement r(LayoutIdModifierElement layoutIdModifierElement0, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = layoutIdModifierElement0.c;
        }
        return layoutIdModifierElement0.q(object0);
    }

    @l
    public LayoutIdModifier s() {
        return new LayoutIdModifier(this.c);
    }

    @l
    public LayoutIdModifier t(@l LayoutIdModifier layoutIdModifier0) {
        L.p(layoutIdModifier0, "node");
        layoutIdModifier0.i0(this.c);
        return layoutIdModifier0;
    }

    @Override
    @l
    public String toString() {
        return "LayoutIdModifierElement(layoutId=" + this.c + ')';
    }
}

