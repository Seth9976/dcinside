package androidx.compose.ui.text.android.style;

import android.graphics.Paint.FontMetricsInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public final class LineHeightSpan implements android.text.style.LineHeightSpan {
    private final float a;
    public static final int b;

    static {
    }

    public LineHeightSpan(float f) {
        this.a = f;
    }

    public final float a() {
        return this.a;
    }

    @Override  // android.text.style.LineHeightSpan
    public void chooseHeight(@l CharSequence charSequence0, int v, int v1, int v2, int v3, @l Paint.FontMetricsInt paint$FontMetricsInt0) {
        L.p(charSequence0, "text");
        L.p(paint$FontMetricsInt0, "fontMetricsInt");
        int v4 = LineHeightStyleSpanKt.a(paint$FontMetricsInt0);
        if(v4 <= 0) {
            return;
        }
        int v5 = (int)(((float)Math.ceil(this.a)));
        int v6 = (int)Math.ceil(((double)paint$FontMetricsInt0.descent) * ((double)(((float)v5) * 1.0f / ((float)v4))));
        paint$FontMetricsInt0.descent = v6;
        paint$FontMetricsInt0.ascent = v6 - v5;
    }
}

