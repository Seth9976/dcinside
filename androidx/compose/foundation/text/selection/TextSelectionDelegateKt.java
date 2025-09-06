package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.internal.L;
import y4.l;

public final class TextSelectionDelegateKt {
    // 去混淆评级： 低(20)
    public static final float a(@l TextLayoutResult textLayoutResult0, int v, boolean z, boolean z1) {
        L.p(textLayoutResult0, "<this>");
        return textLayoutResult0.j(v, textLayoutResult0.c(((!z || z1) && (z || !z1) ? Math.max(v - 1, 0) : v)) == textLayoutResult0.y(v));
    }

    public static final long b(@l TextLayoutResult textLayoutResult0, int v, boolean z, boolean z1) {
        L.p(textLayoutResult0, "textLayoutResult");
        int v1 = textLayoutResult0.q(v);
        return OffsetKt.a(TextSelectionDelegateKt.a(textLayoutResult0, v, z, z1), textLayoutResult0.m(v1));
    }
}

