package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import y4.l;

@LazyGridScopeMarker
@Stable
public interface LazyGridItemScope {
    @ExperimentalFoundationApi
    @l
    Modifier a(@l Modifier arg1, @l FiniteAnimationSpec arg2);
}

