package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

@StabilityInferred(parameters = 0)
@k(level = m.b, message = "It is a test API, do not use it in the real applications")
public final class TestModifierUpdater {
    @l
    private final LayoutNode a;
    public static final int b = 8;

    static {
    }

    public TestModifierUpdater(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "node");
        super();
        this.a = layoutNode0;
    }

    public final void a(@l Modifier modifier0) {
        L.p(modifier0, "modifier");
        this.a.m(modifier0);
    }
}

