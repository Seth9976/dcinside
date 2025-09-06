package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class SelectionAdjustment.Companion.Character.1 implements SelectionAdjustment {
    @Override  // androidx.compose.foundation.text.selection.SelectionAdjustment
    public long a(@l TextLayoutResult textLayoutResult0, long v, int v1, boolean z, @m TextRange textRange0) {
        L.p(textLayoutResult0, "textLayoutResult");
        if(TextRange.h(v)) {
            return textRange0 == null ? SelectionAdjustmentKt.a(textLayoutResult0.l().n().j(), ((int)(v >> 0x20)), v.j3(textLayoutResult0.l().n()), z, false) : SelectionAdjustmentKt.a(textLayoutResult0.l().n().j(), ((int)(v >> 0x20)), v.j3(textLayoutResult0.l().n()), z, TextRange.m(textRange0.r()));
        }
        return v;
    }
}

