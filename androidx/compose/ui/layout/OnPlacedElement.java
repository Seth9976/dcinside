package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class OnPlacedElement extends ModifierNodeElement {
    @l
    private final Function1 c;

    public OnPlacedElement(@l Function1 function10) {
        L.p(function10, "onPlaced");
        super();
        this.c = function10;
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
        return object0 instanceof OnPlacedElement ? L.g(this.c, ((OnPlacedElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("onPlaced");
        inspectorInfo0.b().c("onPlaced", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.w(((OnPlacedModifierImpl)modifier$Node0));
    }

    @l
    public final Function1 p() {
        return this.c;
    }

    @l
    public final OnPlacedElement q(@l Function1 function10) {
        L.p(function10, "onPlaced");
        return new OnPlacedElement(function10);
    }

    public static OnPlacedElement r(OnPlacedElement onPlacedElement0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = onPlacedElement0.c;
        }
        return onPlacedElement0.q(function10);
    }

    @l
    public OnPlacedModifierImpl s() {
        return new OnPlacedModifierImpl(this.c);
    }

    @l
    public final Function1 t() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "OnPlacedElement(onPlaced=" + this.c + ')';
    }

    @l
    public OnPlacedModifierImpl w(@l OnPlacedModifierImpl onPlacedModifierImpl0) {
        L.p(onPlacedModifierImpl0, "node");
        onPlacedModifierImpl0.j0(this.c);
        return onPlacedModifierImpl0;
    }
}

