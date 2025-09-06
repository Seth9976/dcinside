package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public class SkewXSpan extends MetricAffectingSpan {
    private final float a;
    public static final int b;

    static {
    }

    public SkewXSpan(float f) {
        this.a = f;
    }

    public final float a() {
        return this.a;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint0) {
        L.p(textPaint0, "textPaint");
        float f = textPaint0.getTextSkewX();
        textPaint0.setTextSkewX(this.a + f);
    }

    @Override  // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@l TextPaint textPaint0) {
        L.p(textPaint0, "textPaint");
        float f = textPaint0.getTextSkewX();
        textPaint0.setTextSkewX(this.a + f);
    }
}

