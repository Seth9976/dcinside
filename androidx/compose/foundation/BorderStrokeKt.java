package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.SolidColor;
import y4.l;

public final class BorderStrokeKt {
    @Stable
    @l
    public static final BorderStroke a(float f, long v) {
        return new BorderStroke(f, new SolidColor(v, null), null);
    }
}

