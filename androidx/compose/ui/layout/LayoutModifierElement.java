package androidx.compose.ui.layout;

import A3.p;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class LayoutModifierElement extends ModifierNodeElement {
    @l
    private final p c;

    public LayoutModifierElement(@l p p0) {
        L.p(p0, "measure");
        super();
        this.c = p0;
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
        return object0 instanceof LayoutModifierElement ? L.g(this.c, ((LayoutModifierElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("layout");
        inspectorInfo0.b().c("measure", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.w(((LayoutModifierImpl)modifier$Node0));
    }

    @l
    public final p p() {
        return this.c;
    }

    @l
    public final LayoutModifierElement q(@l p p0) {
        L.p(p0, "measure");
        return new LayoutModifierElement(p0);
    }

    public static LayoutModifierElement r(LayoutModifierElement layoutModifierElement0, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            p0 = layoutModifierElement0.c;
        }
        return layoutModifierElement0.q(p0);
    }

    @l
    public LayoutModifierImpl s() {
        return new LayoutModifierImpl(this.c);
    }

    @l
    public final p t() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "LayoutModifierElement(measure=" + this.c + ')';
    }

    @l
    public LayoutModifierImpl w(@l LayoutModifierImpl layoutModifierImpl0) {
        L.p(layoutModifierImpl0, "node");
        layoutModifierImpl0.j0(this.c);
        return layoutModifierImpl0;
    }
}

