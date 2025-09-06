package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class OnRotaryScrollEventElement extends ModifierNodeElement {
    @l
    private final Function1 c;

    public OnRotaryScrollEventElement(@l Function1 function10) {
        L.p(function10, "onRotaryScrollEvent");
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
        return object0 instanceof OnRotaryScrollEventElement ? L.g(this.c, ((OnRotaryScrollEventElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("onRotaryScrollEvent");
        inspectorInfo0.b().c("onRotaryScrollEvent", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.w(((RotaryInputModifierNodeImpl)modifier$Node0));
    }

    @l
    public final Function1 p() {
        return this.c;
    }

    @l
    public final OnRotaryScrollEventElement q(@l Function1 function10) {
        L.p(function10, "onRotaryScrollEvent");
        return new OnRotaryScrollEventElement(function10);
    }

    public static OnRotaryScrollEventElement r(OnRotaryScrollEventElement onRotaryScrollEventElement0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = onRotaryScrollEventElement0.c;
        }
        return onRotaryScrollEventElement0.q(function10);
    }

    @l
    public RotaryInputModifierNodeImpl s() {
        return new RotaryInputModifierNodeImpl(this.c, null);
    }

    @l
    public final Function1 t() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "OnRotaryScrollEventElement(onRotaryScrollEvent=" + this.c + ')';
    }

    @l
    public RotaryInputModifierNodeImpl w(@l RotaryInputModifierNodeImpl rotaryInputModifierNodeImpl0) {
        L.p(rotaryInputModifierNodeImpl0, "node");
        rotaryInputModifierNodeImpl0.k0(this.c);
        rotaryInputModifierNodeImpl0.l0(null);
        return rotaryInputModifierNodeImpl0;
    }
}

