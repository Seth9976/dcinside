package androidx.compose.ui.node;

import kotlin.jvm.internal.L;
import y4.l;

public final class LayoutNodeKt {
    private static final boolean a = false;

    public static final void a(@l LayoutNode layoutNode0, @l LayoutNode layoutNode1) {
        L.p(layoutNode0, "<this>");
        L.p(layoutNode1, "child");
        layoutNode0.O0(layoutNode0.a0().size(), layoutNode1);
    }

    @l
    public static final Owner b(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "<this>");
        Owner owner0 = layoutNode0.B0();
        if(owner0 == null) {
            throw new IllegalStateException("LayoutNode should be attached to an owner");
        }
        return owner0;
    }
}

