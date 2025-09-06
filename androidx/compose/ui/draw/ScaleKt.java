package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class ScaleKt {
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, float f) {
        L.p(modifier0, "<this>");
        return ScaleKt.b(modifier0, f, f);
    }

    @Stable
    @l
    public static final Modifier b(@l Modifier modifier0, float f, float f1) {
        L.p(modifier0, "<this>");
        return f != 1.0f || f1 != 1.0f ? GraphicsLayerModifierKt.e(modifier0, f, f1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFC, null) : modifier0;
    }
}

