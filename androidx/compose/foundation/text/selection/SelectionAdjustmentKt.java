package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class SelectionAdjustmentKt {
    public static final long a(@l String s, int v, int v1, boolean z, boolean z1) {
        L.p(s, "text");
        if(v1 == 0) {
            return TextRangeKt.b(v, v);
        }
        if(v == 0) {
            return z ? TextRangeKt.b(StringHelpers_androidKt.a(s, 0), 0) : TextRangeKt.b(0, StringHelpers_androidKt.a(s, 0));
        }
        if(v == v1) {
            return z ? TextRangeKt.b(StringHelpers_androidKt.b(s, v1), v1) : TextRangeKt.b(v1, StringHelpers_androidKt.b(s, v1));
        }
        if(z) {
            return z1 ? TextRangeKt.b(StringHelpers_androidKt.a(s, v), v) : TextRangeKt.b(StringHelpers_androidKt.b(s, v), v);
        }
        return z1 ? TextRangeKt.b(v, StringHelpers_androidKt.b(s, v)) : TextRangeKt.b(v, StringHelpers_androidKt.a(s, v));
    }
}

