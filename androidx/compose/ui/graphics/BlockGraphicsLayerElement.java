package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class BlockGraphicsLayerElement extends ModifierNodeElement {
    @l
    private final Function1 c;

    public BlockGraphicsLayerElement(@l Function1 function10) {
        L.p(function10, "block");
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
        return object0 instanceof BlockGraphicsLayerElement ? L.g(this.c, ((BlockGraphicsLayerElement)object0).c) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("graphicsLayer");
        inspectorInfo0.b().c("block", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.w(((BlockGraphicsLayerModifier)modifier$Node0));
    }

    @l
    public final Function1 p() {
        return this.c;
    }

    @l
    public final BlockGraphicsLayerElement q(@l Function1 function10) {
        L.p(function10, "block");
        return new BlockGraphicsLayerElement(function10);
    }

    public static BlockGraphicsLayerElement r(BlockGraphicsLayerElement blockGraphicsLayerElement0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = blockGraphicsLayerElement0.c;
        }
        return blockGraphicsLayerElement0.q(function10);
    }

    @l
    public BlockGraphicsLayerModifier s() {
        return new BlockGraphicsLayerModifier(this.c);
    }

    @l
    public final Function1 t() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.c + ')';
    }

    @l
    public BlockGraphicsLayerModifier w(@l BlockGraphicsLayerModifier blockGraphicsLayerModifier0) {
        L.p(blockGraphicsLayerModifier0, "node");
        blockGraphicsLayerModifier0.j0(this.c);
        return blockGraphicsLayerModifier0;
    }
}

