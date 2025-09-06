package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class SelectionAdjustment.Companion.Paragraph.1 implements SelectionAdjustment {
    @Override  // androidx.compose.foundation.text.selection.SelectionAdjustment
    public long a(@l TextLayoutResult textLayoutResult0, long v, int v1, boolean z, @m TextRange textRange0) {
        L.p(textLayoutResult0, "textLayoutResult");
        androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.Paragraph.1.adjust.boundaryFun.1 selectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$10 = new Function1() {
            {
                super(1, object0, StringHelpersKt.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
            }

            public final long a(int v) {
                return StringHelpersKt.c(((CharSequence)this.receiver), v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return TextRange.b(this.a(((Number)object0).intValue()));
            }
        };
        return Companion.a.b(textLayoutResult0, v, selectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$10);
    }
}

