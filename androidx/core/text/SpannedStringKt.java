package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import kotlin.jvm.internal.L;
import y4.l;

public final class SpannedStringKt {
    public static final Object[] a(Spanned spanned0, int v, int v1) {
        L.y(4, "T");
        return spanned0.getSpans(v, v1, Object.class);
    }

    public static Object[] b(Spanned spanned0, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = spanned0.length();
        }
        L.y(4, "T");
        return spanned0.getSpans(v, v1, Object.class);
    }

    @l
    public static final Spanned c(@l CharSequence charSequence0) {
        return SpannedString.valueOf(charSequence0);
    }
}

