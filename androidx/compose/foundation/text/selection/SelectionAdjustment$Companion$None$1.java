package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class SelectionAdjustment.Companion.None.1 implements SelectionAdjustment {
    @Override  // androidx.compose.foundation.text.selection.SelectionAdjustment
    public long a(@l TextLayoutResult textLayoutResult0, long v, int v1, boolean z, @m TextRange textRange0) {
        L.p(textLayoutResult0, "textLayoutResult");
        return v;
    }
}

