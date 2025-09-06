package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class SelectionAdjustment.Companion.Word.1 implements SelectionAdjustment {
    @Override  // androidx.compose.foundation.text.selection.SelectionAdjustment
    public long a(@l TextLayoutResult textLayoutResult0, long v, int v1, boolean z, @m TextRange textRange0) {
        L.p(textLayoutResult0, "textLayoutResult");
        androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.Word.1.adjust.1 selectionAdjustment$Companion$Word$1$adjust$10 = new Function1() {
            {
                super(1, object0, TextLayoutResult.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
            }

            public final long a(int v) {
                return ((TextLayoutResult)this.receiver).C(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return TextRange.b(this.a(((Number)object0).intValue()));
            }
        };
        return Companion.a.b(textLayoutResult0, v, selectionAdjustment$Companion$Word$1$adjust$10);
    }
}

