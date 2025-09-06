package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class RotateKt {
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, float f) {
        L.p(modifier0, "<this>");
        return f == 0.0f ? modifier0 : GraphicsLayerModifierKt.e(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FEFF, null);
    }
}

