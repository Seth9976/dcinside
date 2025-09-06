package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Remeasurement;
import y4.l;

@ExperimentalComposeUiApi
public interface LayoutModifierNode extends Remeasurement, DelegatableNode {
    int c(@l IntrinsicMeasureScope arg1, @l IntrinsicMeasurable arg2, int arg3);

    @Override  // androidx.compose.ui.layout.Remeasurement
    void d();

    int e(@l IntrinsicMeasureScope arg1, @l IntrinsicMeasurable arg2, int arg3);

    int f(@l IntrinsicMeasureScope arg1, @l IntrinsicMeasurable arg2, int arg3);

    int g(@l IntrinsicMeasureScope arg1, @l IntrinsicMeasurable arg2, int arg3);

    @l
    MeasureResult h(@l MeasureScope arg1, @l Measurable arg2, long arg3);
}

