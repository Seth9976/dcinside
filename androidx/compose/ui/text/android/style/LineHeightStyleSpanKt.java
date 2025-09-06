package androidx.compose.ui.text.android.style;

import android.graphics.Paint.FontMetricsInt;
import kotlin.jvm.internal.L;
import y4.l;

public final class LineHeightStyleSpanKt {
    public static final int a(@l Paint.FontMetricsInt paint$FontMetricsInt0) {
        L.p(paint$FontMetricsInt0, "<this>");
        return paint$FontMetricsInt0.descent - paint$FontMetricsInt0.ascent;
    }
}

