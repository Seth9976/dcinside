package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public final class FontFeatureSpan extends MetricAffectingSpan {
    @l
    private final String a;
    public static final int b;

    static {
    }

    public FontFeatureSpan(@l String s) {
        L.p(s, "fontFeatureSettings");
        super();
        this.a = s;
    }

    @l
    public final String a() {
        return this.a;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint0) {
        L.p(textPaint0, "textPaint");
        textPaint0.setFontFeatureSettings(this.a);
    }

    @Override  // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@l TextPaint textPaint0) {
        L.p(textPaint0, "textPaint");
        textPaint0.setFontFeatureSettings(this.a);
    }
}

