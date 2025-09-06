package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class TextFieldSelectionDelegateKt {
    public static final long a(@m TextLayoutResult textLayoutResult0, int v, int v1, @m TextRange textRange0, boolean z, @l SelectionAdjustment selectionAdjustment0) {
        L.p(selectionAdjustment0, "adjustment");
        if(textLayoutResult0 != null) {
            long v2 = TextRangeKt.b(v, v1);
            return textRange0 != null || !L.g(selectionAdjustment0, SelectionAdjustment.a.c()) ? selectionAdjustment0.a(textLayoutResult0, v2, -1, z, textRange0) : v2;
        }
        return TextRangeKt.b(0, 0);
    }
}

