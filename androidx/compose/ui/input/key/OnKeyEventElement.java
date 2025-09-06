package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class OnKeyEventElement extends ModifierNodeElement {
    @l
    private final Function1 c;

    public OnKeyEventElement(@l Function1 function10) {
        L.p(function10, "onKeyEvent");
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
        return object0 instanceof OnKeyEventElement ? L.g(this.c, ((OnKeyEventElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("onKeyEvent");
        inspectorInfo0.b().c("onKeyEvent", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.w(((KeyInputInputModifierNodeImpl)modifier$Node0));
    }

    @l
    public final Function1 p() {
        return this.c;
    }

    @l
    public final OnKeyEventElement q(@l Function1 function10) {
        L.p(function10, "onKeyEvent");
        return new OnKeyEventElement(function10);
    }

    public static OnKeyEventElement r(OnKeyEventElement onKeyEventElement0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = onKeyEventElement0.c;
        }
        return onKeyEventElement0.q(function10);
    }

    @l
    public KeyInputInputModifierNodeImpl s() {
        return new KeyInputInputModifierNodeImpl(this.c, null);
    }

    @l
    public final Function1 t() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "OnKeyEventElement(onKeyEvent=" + this.c + ')';
    }

    @l
    public KeyInputInputModifierNodeImpl w(@l KeyInputInputModifierNodeImpl keyInputInputModifierNodeImpl0) {
        L.p(keyInputInputModifierNodeImpl0, "node");
        keyInputInputModifierNodeImpl0.k0(this.c);
        keyInputInputModifierNodeImpl0.l0(null);
        return keyInputInputModifierNodeImpl0;
    }
}

