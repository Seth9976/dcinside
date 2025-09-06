package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class FocusEventElement extends ModifierNodeElement {
    @l
    private final Function1 c;

    public FocusEventElement(@l Function1 function10) {
        L.p(function10, "onFocusEvent");
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
        return object0 instanceof FocusEventElement ? L.g(this.c, ((FocusEventElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("onFocusEvent");
        inspectorInfo0.b().c("onFocusEvent", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.w(((FocusEventModifierNodeImpl)modifier$Node0));
    }

    @l
    public final Function1 p() {
        return this.c;
    }

    @l
    public final FocusEventElement q(@l Function1 function10) {
        L.p(function10, "onFocusEvent");
        return new FocusEventElement(function10);
    }

    public static FocusEventElement r(FocusEventElement focusEventElement0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = focusEventElement0.c;
        }
        return focusEventElement0.q(function10);
    }

    @l
    public FocusEventModifierNodeImpl s() {
        return new FocusEventModifierNodeImpl(this.c);
    }

    @l
    public final Function1 t() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "FocusEventElement(onFocusEvent=" + this.c + ')';
    }

    @l
    public FocusEventModifierNodeImpl w(@l FocusEventModifierNodeImpl focusEventModifierNodeImpl0) {
        L.p(focusEventModifierNodeImpl0, "node");
        focusEventModifierNodeImpl0.j0(this.c);
        return focusEventModifierNodeImpl0;
    }
}

