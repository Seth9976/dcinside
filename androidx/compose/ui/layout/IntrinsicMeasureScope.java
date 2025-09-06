package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import y4.l;

public interface IntrinsicMeasureScope extends Density {
    @l
    LayoutDirection getLayoutDirection();
}

