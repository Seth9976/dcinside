package androidx.compose.ui.draw;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import y4.l;

public interface BuildDrawCacheParams {
    long b();

    @l
    Density getDensity();

    @l
    LayoutDirection getLayoutDirection();
}

