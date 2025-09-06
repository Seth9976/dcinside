package androidx.compose.ui.text;

import java.text.BreakIterator;
import kotlin.jvm.internal.L;
import y4.l;

public final class JvmCharHelpers_androidKt {
    public static final int a(@l String s, int v) {
        L.p(s, "<this>");
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(s);
        return breakIterator0.following(v);
    }

    public static final int b(@l String s, int v) {
        L.p(s, "<this>");
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(s);
        return breakIterator0.preceding(v);
    }
}

