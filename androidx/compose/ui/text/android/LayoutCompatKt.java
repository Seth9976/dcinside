package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import kotlin.jvm.internal.L;
import y4.l;

public final class LayoutCompatKt {
    @InternalPlatformTextApi
    public static final int a(@l Layout layout0, @IntRange(from = 0L) int v, boolean z) {
        L.p(layout0, "<this>");
        if(v <= 0) {
            return 0;
        }
        if(v >= layout0.getText().length()) {
            return layout0.getLineCount() - 1;
        }
        int v1 = layout0.getLineForOffset(v);
        int v2 = layout0.getLineStart(v1);
        if(v2 != v && layout0.getLineEnd(v1) != v) {
            return v1;
        }
        if(v2 == v) {
            return z ? v1 - 1 : v1;
        }
        return z ? v1 : v1 + 1;
    }
}

