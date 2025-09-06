package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import androidx.compose.ui.text.android.TextLayoutKt;
import kotlin.jvm.internal.L;
import y4.m;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public final class IndentationFixSpan implements LeadingMarginSpan {
    public static final int a;

    static {
    }

    @Override  // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@m Canvas canvas0, @m Paint paint0, int v, int v1, int v2, int v3, int v4, @m CharSequence charSequence0, int v5, int v6, boolean z, @m Layout layout0) {
        if(layout0 != null && paint0 != null) {
            int v7 = layout0.getLineForOffset(v5);
            if(v7 == layout0.getLineCount() - 1 && TextLayoutKt.k(layout0, v7)) {
                float f = IndentationFixSpanKt.a(layout0, v7, paint0) + IndentationFixSpanKt.c(layout0, v7, paint0);
                if(f != 0.0f) {
                    L.m(canvas0);
                    canvas0.translate(f, 0.0f);
                }
            }
        }
    }

    @Override  // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }
}

