package androidx.compose.ui.layout;

import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.L;
import y4.l;

public final class MultiContentMeasurePolicyKt {
    @b0
    @l
    public static final MeasurePolicy a(@l MultiContentMeasurePolicy multiContentMeasurePolicy0) {
        L.p(multiContentMeasurePolicy0, "measurePolicy");
        return new MeasurePolicy() {
            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                L.p(measureScope0, "$this$measure");
                L.p(list0, "measurables");
                List list1 = MeasureScopeWithLayoutNodeKt.a(measureScope0);
                return multiContentMeasurePolicy0.a(measureScope0, list1, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int b(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                List list1 = MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope0);
                return multiContentMeasurePolicy0.b(intrinsicMeasureScope0, list1, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int c(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                List list1 = MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope0);
                return multiContentMeasurePolicy0.c(intrinsicMeasureScope0, list1, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int d(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                List list1 = MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope0);
                return multiContentMeasurePolicy0.d(intrinsicMeasureScope0, list1, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                List list1 = MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope0);
                return multiContentMeasurePolicy0.e(intrinsicMeasureScope0, list1, v);
            }
        };
    }
}

