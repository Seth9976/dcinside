package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

public final class EditingBufferKt {
    public static final long a(long v, long v1) {
        int v2 = TextRange.l(v);
        int v3 = TextRange.k(v);
        if(TextRange.p(v1, v)) {
            if(TextRange.d(v1, v)) {
                v2 = TextRange.l(v1);
                return TextRangeKt.b(v2, v2);
            }
            if(TextRange.d(v, v1)) {
                return TextRangeKt.b(v2, v3 - TextRange.j(v1));
            }
            return TextRange.e(v1, v2) ? TextRangeKt.b(TextRange.l(v1), v3 - TextRange.j(v1)) : TextRangeKt.b(v2, TextRange.l(v1));
        }
        return v3 <= TextRange.l(v1) ? TextRangeKt.b(v2, v3) : TextRangeKt.b(v2 - TextRange.j(v1), v3 - TextRange.j(v1));
    }
}

