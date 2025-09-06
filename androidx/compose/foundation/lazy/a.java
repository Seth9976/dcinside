package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;

public final class a {
    public static Modifier a(LazyItemScope lazyItemScope0, Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 1, null);
        }
        return lazyItemScope0.a(modifier0, finiteAnimationSpec0);
    }

    public static Modifier b(LazyItemScope lazyItemScope0, Modifier modifier0, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope0.b(modifier0, f);
    }

    public static Modifier c(LazyItemScope lazyItemScope0, Modifier modifier0, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope0.d(modifier0, f);
    }

    public static Modifier d(LazyItemScope lazyItemScope0, Modifier modifier0, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope0.c(modifier0, f);
    }
}

