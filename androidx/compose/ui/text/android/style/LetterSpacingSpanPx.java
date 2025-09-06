package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.Px;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public final class LetterSpacingSpanPx extends MetricAffectingSpan {
    private final float a;
    public static final int b;

    static {
    }

    public LetterSpacingSpanPx(@Px float f) {
        this.a = f;
    }

    public final float a() {
        return this.a;
    }

    private final void b(TextPaint textPaint0) {
        float f = textPaint0.getTextSize() * textPaint0.getTextScaleX();
        if(f != 0.0f) {
            textPaint0.setLetterSpacing(this.a / f);
        }
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint0) {
        L.p(textPaint0, "textPaint");
        this.b(textPaint0);
    }

    @Override  // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@l TextPaint textPaint0) {
        L.p(textPaint0, "textPaint");
        this.b(textPaint0);
    }
}

