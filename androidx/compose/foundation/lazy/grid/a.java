package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;

public final class a {
    public static Modifier a(LazyGridItemScope lazyGridItemScope0, Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 1, null);
        }
        return lazyGridItemScope0.a(modifier0, finiteAnimationSpec0);
    }
}

