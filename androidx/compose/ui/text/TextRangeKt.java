package androidx.compose.ui.text;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,128:1\n48#2:129\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:129\n*E\n"})
public final class TextRangeKt {
    public static final long a(int v) {
        return TextRangeKt.b(v, v);
    }

    public static final long b(int v, int v1) {
        return TextRange.c(TextRangeKt.d(v, v1));
    }

    public static final long c(long v, int v1, int v2) {
        int v3 = s.I(((int)(v >> 0x20)), v1, v2);
        int v4 = s.I(((int)(v & 0xFFFFFFFFL)), v1, v2);
        return v3 != ((int)(v >> 0x20)) || v4 != ((int)(v & 0xFFFFFFFFL)) ? TextRangeKt.b(v3, v4) : v;
    }

    private static final long d(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + v + ", end: " + v1 + ']').toString());
        }
        if(v1 < 0) {
            throw new IllegalArgumentException(("end cannot be negative. [start: " + v + ", end: " + v1 + ']').toString());
        }
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    @l
    public static final String e(@l CharSequence charSequence0, long v) {
        L.p(charSequence0, "$this$substring");
        return charSequence0.subSequence(TextRange.l(v), TextRange.k(v)).toString();
    }
}

