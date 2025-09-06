package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import y4.l;

interface IntrinsicSizeModifier extends LayoutModifier {
    boolean F1();

    @Override  // androidx.compose.ui.layout.LayoutModifier
    int c(@l IntrinsicMeasureScope arg1, @l IntrinsicMeasurable arg2, int arg3);

    @Override  // androidx.compose.ui.layout.LayoutModifier
    int e(@l IntrinsicMeasureScope arg1, @l IntrinsicMeasurable arg2, int arg3);

    @Override  // androidx.compose.ui.layout.LayoutModifier
    int f(@l IntrinsicMeasureScope arg1, @l IntrinsicMeasurable arg2, int arg3);

    @Override  // androidx.compose.ui.layout.LayoutModifier
    int g(@l IntrinsicMeasureScope arg1, @l IntrinsicMeasurable arg2, int arg3);

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @l
    MeasureResult h(@l MeasureScope arg1, @l Measurable arg2, long arg3);

    long u1(@l MeasureScope arg1, @l Measurable arg2, long arg3);
}

