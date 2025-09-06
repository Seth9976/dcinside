package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import y4.l;

@LazyScopeMarker
@Stable
public interface LazyItemScope {
    public static final class DefaultImpls {
        public static Modifier a(LazyItemScope lazyItemScope0, Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, int v, Object object0) {
            return a.a(lazyItemScope0, modifier0, finiteAnimationSpec0, v, object0);
        }

        public static Modifier b(LazyItemScope lazyItemScope0, Modifier modifier0, float f, int v, Object object0) {
            return a.b(lazyItemScope0, modifier0, f, v, object0);
        }

        public static Modifier c(LazyItemScope lazyItemScope0, Modifier modifier0, float f, int v, Object object0) {
            return a.c(lazyItemScope0, modifier0, f, v, object0);
        }

        public static Modifier d(LazyItemScope lazyItemScope0, Modifier modifier0, float f, int v, Object object0) {
            return a.d(lazyItemScope0, modifier0, f, v, object0);
        }
    }

    @ExperimentalFoundationApi
    @l
    Modifier a(@l Modifier arg1, @l FiniteAnimationSpec arg2);

    @l
    Modifier b(@l Modifier arg1, float arg2);

    @l
    Modifier c(@l Modifier arg1, float arg2);

    @l
    Modifier d(@l Modifier arg1, float arg2);
}

