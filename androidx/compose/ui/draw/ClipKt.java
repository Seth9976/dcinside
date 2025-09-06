package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.L;
import y4.l;

public final class ClipKt {
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, @l Shape shape0) {
        L.p(modifier0, "<this>");
        L.p(shape0, "shape");
        return GraphicsLayerModifierKt.e(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape0, true, null, 0L, 0L, 0, 0x1E7FF, null);
    }

    @Stable
    @l
    public static final Modifier b(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return GraphicsLayerModifierKt.e(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 0x1EFFF, null);
    }
}

