package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import y4.l;

public final class TextSelectionColorsKt {
    @l
    private static final ProvidableCompositionLocal a;
    private static final long b;
    @l
    private static final TextSelectionColors c;

    static {
        TextSelectionColorsKt.a = CompositionLocalKt.d(null, TextSelectionColorsKt.LocalTextSelectionColors.1.e, 1, null);
        TextSelectionColorsKt.b = 0xFF4286F400000000L;
        TextSelectionColorsKt.c = new TextSelectionColors(0xFF4286F400000000L, Color.w(0xFF4286F400000000L, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    @Stable
    private static void b() {
    }

    @l
    public static final ProvidableCompositionLocal c() {
        return TextSelectionColorsKt.a;
    }
}

