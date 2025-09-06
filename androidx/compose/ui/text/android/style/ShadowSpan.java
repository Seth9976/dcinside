package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public final class ShadowSpan extends CharacterStyle {
    private final int a;
    private final float b;
    private final float c;
    private final float d;
    public static final int e;

    static {
    }

    public ShadowSpan(int v, float f, float f1, float f2) {
        this.a = v;
        this.b = f;
        this.c = f1;
        this.d = f2;
    }

    public final int a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public final float d() {
        return this.d;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint0) {
        L.p(textPaint0, "tp");
        textPaint0.setShadowLayer(this.d, this.b, this.c, this.a);
    }
}

