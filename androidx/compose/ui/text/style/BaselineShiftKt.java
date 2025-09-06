package androidx.compose.ui.text.style;

import androidx.compose.runtime.Stable;

public final class BaselineShiftKt {
    @Stable
    public static final float a(float f, float f1, float f2) {
        return (1.0f - f2) * f + f2 * f1;
    }
}

