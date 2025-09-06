package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class OnPreRotaryScrollEventElement extends ModifierNodeElement {
    @l
    private final Function1 c;

    public OnPreRotaryScrollEventElement(@l Function1 function10) {
        L.p(function10, "onPreRotaryScrollEvent");
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
        return object0 instanceof OnPreRotaryScrollEventElement ? L.g(this.c, ((OnPreRotaryScrollEventElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("onPreRotaryScrollEvent");
        inspectorInfo0.b().c("onPreRotaryScrollEvent", this.c);
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
    public final OnPreRotaryScrollEventElement q(@l Function1 function10) {
        L.p(function10, "onPreRotaryScrollEvent");
        return new OnPreRotaryScrollEventElement(function10);
    }

    public static OnPreRotaryScrollEventElement r(OnPreRotaryScrollEventElement onPreRotaryScrollEventElement0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = onPreRotaryScrollEventElement0.c;
        }
        return onPreRotaryScrollEventElement0.q(function10);
    }

    @l
    public RotaryInputModifierNodeImpl s() {
        return new RotaryInputModifierNodeImpl(null, this.c);
    }

    @l
    public final Function1 t() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "OnPreRotaryScrollEventElement(onPreRotaryScrollEvent=" + this.c + ')';
    }

    @l
    public RotaryInputModifierNodeImpl w(@l RotaryInputModifierNodeImpl rotaryInputModifierNodeImpl0) {
        L.p(rotaryInputModifierNodeImpl0, "node");
        rotaryInputModifierNodeImpl0.l0(this.c);
        rotaryInputModifierNodeImpl0.k0(null);
        return rotaryInputModifierNodeImpl0;
    }
}

