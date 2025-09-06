package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import y4.l;

public final class DensityKt {
    @Stable
    @l
    public static final Density a(float f, float f1) {
        return new DensityImpl(f, f1);
    }

    public static Density b(float f, float f1, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = 1.0f;
        }
        return DensityKt.a(f, f1);
    }
}

