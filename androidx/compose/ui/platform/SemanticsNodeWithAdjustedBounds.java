package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import kotlin.jvm.internal.L;
import y4.l;

public final class SemanticsNodeWithAdjustedBounds {
    @l
    private final SemanticsNode a;
    @l
    private final Rect b;

    public SemanticsNodeWithAdjustedBounds(@l SemanticsNode semanticsNode0, @l Rect rect0) {
        L.p(semanticsNode0, "semanticsNode");
        L.p(rect0, "adjustedBounds");
        super();
        this.a = semanticsNode0;
        this.b = rect0;
    }

    @l
    public final Rect a() {
        return this.b;
    }

    @l
    public final SemanticsNode b() {
        return this.a;
    }
}

