package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
public final class SemanticsOwner {
    @l
    private final LayoutNode a;
    public static final int b = 8;

    static {
    }

    public SemanticsOwner(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "rootNode");
        super();
        this.a = layoutNode0;
    }

    @l
    public final SemanticsNode a() {
        SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.j(this.a);
        L.m(semanticsModifierNode0);
        return new SemanticsNode(semanticsModifierNode0, true, null, 4, null);
    }

    @l
    public final SemanticsNode b() {
        SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.j(this.a);
        L.m(semanticsModifierNode0);
        return new SemanticsNode(semanticsModifierNode0, false, null, 4, null);
    }
}

