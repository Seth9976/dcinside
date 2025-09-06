package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class OnPreviewKeyEvent extends ModifierNodeElement {
    @l
    private final Function1 c;

    public OnPreviewKeyEvent(@l Function1 function10) {
        L.p(function10, "onPreviewKeyEvent");
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
        return object0 instanceof OnPreviewKeyEvent ? L.g(this.c, ((OnPreviewKeyEvent)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("onPreviewKeyEvent");
        inspectorInfo0.b().c("onPreviewKeyEvent", this.c);
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
    public final OnPreviewKeyEvent q(@l Function1 function10) {
        L.p(function10, "onPreviewKeyEvent");
        return new OnPreviewKeyEvent(function10);
    }

    public static OnPreviewKeyEvent r(OnPreviewKeyEvent onPreviewKeyEvent0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = onPreviewKeyEvent0.c;
        }
        return onPreviewKeyEvent0.q(function10);
    }

    @l
    public KeyInputInputModifierNodeImpl s() {
        return new KeyInputInputModifierNodeImpl(null, this.c);
    }

    @l
    public final Function1 t() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "OnPreviewKeyEvent(onPreviewKeyEvent=" + this.c + ')';
    }

    @l
    public KeyInputInputModifierNodeImpl w(@l KeyInputInputModifierNodeImpl keyInputInputModifierNodeImpl0) {
        L.p(keyInputInputModifierNodeImpl0, "node");
        keyInputInputModifierNodeImpl0.l0(this.c);
        keyInputInputModifierNodeImpl0.k0(null);
        return keyInputInputModifierNodeImpl0;
    }
}

