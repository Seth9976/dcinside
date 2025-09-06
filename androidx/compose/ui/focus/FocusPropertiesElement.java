package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class FocusPropertiesElement extends ModifierNodeElement {
    @l
    private final Function1 c;

    public FocusPropertiesElement(@l Function1 function10) {
        L.p(function10, "scope");
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
        return object0 instanceof FocusPropertiesElement ? L.g(this.c, ((FocusPropertiesElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("focusProperties");
        inspectorInfo0.b().c("scope", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.w(((FocusPropertiesModifierNodeImpl)modifier$Node0));
    }

    @l
    public final Function1 p() {
        return this.c;
    }

    @l
    public final FocusPropertiesElement q(@l Function1 function10) {
        L.p(function10, "scope");
        return new FocusPropertiesElement(function10);
    }

    public static FocusPropertiesElement r(FocusPropertiesElement focusPropertiesElement0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = focusPropertiesElement0.c;
        }
        return focusPropertiesElement0.q(function10);
    }

    @l
    public FocusPropertiesModifierNodeImpl s() {
        return new FocusPropertiesModifierNodeImpl(this.c);
    }

    @l
    public final Function1 t() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "FocusPropertiesElement(scope=" + this.c + ')';
    }

    @l
    public FocusPropertiesModifierNodeImpl w(@l FocusPropertiesModifierNodeImpl focusPropertiesModifierNodeImpl0) {
        L.p(focusPropertiesModifierNodeImpl0, "node");
        focusPropertiesModifierNodeImpl0.j0(this.c);
        return focusPropertiesModifierNodeImpl0;
    }
}

