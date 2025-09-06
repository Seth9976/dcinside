package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class ShadowKt {
    @Stable
    @l
    public static final Shadow a(@l Shadow shadow0, @l Shadow shadow1, float f) {
        L.p(shadow0, "start");
        L.p(shadow1, "stop");
        return new Shadow(ColorKt.n(shadow0.f(), shadow1.f(), f), OffsetKt.h(shadow0.h(), shadow1.h(), f), MathHelpersKt.a(shadow0.d(), shadow1.d(), f), null);
    }
}

