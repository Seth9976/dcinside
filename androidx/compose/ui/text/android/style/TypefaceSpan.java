package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public final class TypefaceSpan extends MetricAffectingSpan {
    @l
    private final Typeface a;
    public static final int b = 8;

    static {
    }

    public TypefaceSpan(@l Typeface typeface0) {
        L.p(typeface0, "typeface");
        super();
        this.a = typeface0;
    }

    @l
    public final Typeface a() {
        return this.a;
    }

    private final void b(Paint paint0) {
        paint0.setTypeface(this.a);
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint0) {
        L.p(textPaint0, "ds");
        this.b(textPaint0);
    }

    @Override  // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@l TextPaint textPaint0) {
        L.p(textPaint0, "paint");
        this.b(textPaint0);
    }
}

