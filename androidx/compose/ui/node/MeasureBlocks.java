package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import java.util.List;
import kotlin.k;
import y4.l;

@k(message = "MeasureBlocks was deprecated. Please use MeasurePolicy instead.")
public interface MeasureBlocks {
    @l
    MeasureResult a(@l MeasureScope arg1, @l List arg2, long arg3);

    int b(@l IntrinsicMeasureScope arg1, @l List arg2, int arg3);

    int c(@l IntrinsicMeasureScope arg1, @l List arg2, int arg3);

    int d(@l IntrinsicMeasureScope arg1, @l List arg2, int arg3);

    int e(@l IntrinsicMeasureScope arg1, @l List arg2, int arg3);
}

