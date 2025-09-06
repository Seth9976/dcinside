package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class StringHelpersKt {
    public static final int a(@l CharSequence charSequence0, int v) {
        L.p(charSequence0, "<this>");
        int v1 = v + 1;
        int v2 = charSequence0.length();
        while(v1 < v2) {
            if(charSequence0.charAt(v1) == 10) {
                return v1;
            }
            ++v1;
        }
        return charSequence0.length();
    }

    public static final int b(@l CharSequence charSequence0, int v) {
        L.p(charSequence0, "<this>");
        for(int v1 = v - 1; v1 > 0; --v1) {
            if(charSequence0.charAt(v1 - 1) == 10) {
                return v1;
            }
        }
        return 0;
    }

    public static final long c(@l CharSequence charSequence0, int v) {
        L.p(charSequence0, "<this>");
        return TextRangeKt.b(StringHelpersKt.b(charSequence0, v), StringHelpersKt.a(charSequence0, v));
    }
}

