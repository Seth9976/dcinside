package androidx.compose.ui.layout;

import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class e {
    public static int a(MeasurePolicy measurePolicy0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(list0, "measurables");
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.b, IntrinsicWidthHeight.b));
        }
        long v3 = ConstraintsKt.b(0, v, 0, 0, 13, null);
        return measurePolicy0.a(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v3).getHeight();
    }

    public static int b(MeasurePolicy measurePolicy0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(list0, "measurables");
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.b, IntrinsicWidthHeight.a));
        }
        long v3 = ConstraintsKt.b(0, 0, 0, v, 7, null);
        return measurePolicy0.a(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v3).getWidth();
    }

    public static int c(MeasurePolicy measurePolicy0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(list0, "measurables");
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.a, IntrinsicWidthHeight.b));
        }
        long v3 = ConstraintsKt.b(0, v, 0, 0, 13, null);
        return measurePolicy0.a(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v3).getHeight();
    }

    public static int d(MeasurePolicy measurePolicy0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(list0, "measurables");
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.a, IntrinsicWidthHeight.a));
        }
        long v3 = ConstraintsKt.b(0, 0, 0, v, 7, null);
        return measurePolicy0.a(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v3).getWidth();
    }
}

