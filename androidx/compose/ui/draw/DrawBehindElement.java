package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class DrawBehindElement extends ModifierNodeElement {
    @l
    private final Function1 c;

    public DrawBehindElement(@l Function1 function10) {
        L.p(function10, "onDraw");
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
        return object0 instanceof DrawBehindElement ? L.g(this.c, ((DrawBehindElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("drawBehind");
        inspectorInfo0.b().c("onDraw", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.w(((DrawBackgroundModifier)modifier$Node0));
    }

    @l
    public final Function1 p() {
        return this.c;
    }

    @l
    public final DrawBehindElement q(@l Function1 function10) {
        L.p(function10, "onDraw");
        return new DrawBehindElement(function10);
    }

    public static DrawBehindElement r(DrawBehindElement drawBehindElement0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = drawBehindElement0.c;
        }
        return drawBehindElement0.q(function10);
    }

    @l
    public DrawBackgroundModifier s() {
        return new DrawBackgroundModifier(this.c);
    }

    @l
    public final Function1 t() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "DrawBehindElement(onDraw=" + this.c + ')';
    }

    @l
    public DrawBackgroundModifier w(@l DrawBackgroundModifier drawBackgroundModifier0) {
        L.p(drawBackgroundModifier0, "node");
        drawBackgroundModifier0.j0(this.c);
        return drawBackgroundModifier0;
    }
}

