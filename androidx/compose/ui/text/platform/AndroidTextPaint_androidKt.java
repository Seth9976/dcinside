package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import kotlin.jvm.internal.L;
import kotlin.math.b;
import kotlin.ranges.s;
import y4.l;

public final class AndroidTextPaint_androidKt {
    public static final void a(@l TextPaint textPaint0, float f) {
        L.p(textPaint0, "<this>");
        if(!Float.isNaN(f)) {
            textPaint0.setAlpha(b.L0(s.H(f, 0.0f, 1.0f) * 255.0f));
        }
    }
}

