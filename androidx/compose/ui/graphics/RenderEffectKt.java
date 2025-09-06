package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.OffsetKt;
import y4.l;

public final class RenderEffectKt {
    @Stable
    @l
    public static final BlurEffect a(float f, float f1, int v) {
        return new BlurEffect(null, f, f1, v, null);
    }

    public static BlurEffect b(float f, float f1, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        return RenderEffectKt.a(f, f1, v);
    }

    @Stable
    @l
    public static final OffsetEffect c(float f, float f1) {
        return new OffsetEffect(null, OffsetKt.a(f, f1), null);
    }
}

