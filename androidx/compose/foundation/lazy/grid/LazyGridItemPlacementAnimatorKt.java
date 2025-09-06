package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.unit.IntOffset;
import y4.l;

public final class LazyGridItemPlacementAnimatorKt {
    @l
    private static final SpringSpec a;

    static {
        LazyGridItemPlacementAnimatorKt.a = AnimationSpecKt.o(0.0f, 400.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 1, null);
    }
}

