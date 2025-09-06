package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public final class TextDecorationSpan extends CharacterStyle {
    private final boolean a;
    private final boolean b;
    public static final int c;

    static {
    }

    public TextDecorationSpan(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint0) {
        L.p(textPaint0, "textPaint");
        textPaint0.setUnderlineText(this.a);
        textPaint0.setStrikeThruText(this.b);
    }
}

