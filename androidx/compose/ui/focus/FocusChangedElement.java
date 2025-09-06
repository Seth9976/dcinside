package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class FocusChangedElement extends ModifierNodeElement {
    @l
    private final Function1 c;

    public FocusChangedElement(@l Function1 function10) {
        L.p(function10, "onFocusChanged");
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
        return object0 instanceof FocusChangedElement ? L.g(this.c, ((FocusChangedElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("onFocusChanged");
        inspectorInfo0.b().c("onFocusChanged", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.w(((FocusChangedModifierNode)modifier$Node0));
    }

    @l
    public final Function1 p() {
        return this.c;
    }

    @l
    public final FocusChangedElement q(@l Function1 function10) {
        L.p(function10, "onFocusChanged");
        return new FocusChangedElement(function10);
    }

    public static FocusChangedElement r(FocusChangedElement focusChangedElement0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = focusChangedElement0.c;
        }
        return focusChangedElement0.q(function10);
    }

    @l
    public FocusChangedModifierNode s() {
        return new FocusChangedModifierNode(this.c);
    }

    @l
    public final Function1 t() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.c + ')';
    }

    @l
    public FocusChangedModifierNode w(@l FocusChangedModifierNode focusChangedModifierNode0) {
        L.p(focusChangedModifierNode0, "node");
        focusChangedModifierNode0.j0(this.c);
        return focusChangedModifierNode0;
    }
}

