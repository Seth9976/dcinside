package androidx.compose.ui.layout;

import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class g {
    public static int a(MultiContentMeasurePolicy multiContentMeasurePolicy0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(list0, "measurables");
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            List list1 = (List)list0.get(v2);
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList1.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list1.get(v4)), IntrinsicMinMax.b, IntrinsicWidthHeight.b));
            }
            arrayList0.add(arrayList1);
        }
        long v5 = ConstraintsKt.b(0, v, 0, 0, 13, null);
        return multiContentMeasurePolicy0.a(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v5).getHeight();
    }

    public static int b(MultiContentMeasurePolicy multiContentMeasurePolicy0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(list0, "measurables");
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            List list1 = (List)list0.get(v2);
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList1.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list1.get(v4)), IntrinsicMinMax.b, IntrinsicWidthHeight.a));
            }
            arrayList0.add(arrayList1);
        }
        long v5 = ConstraintsKt.b(0, 0, 0, v, 7, null);
        return multiContentMeasurePolicy0.a(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v5).getWidth();
    }

    public static int c(MultiContentMeasurePolicy multiContentMeasurePolicy0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(list0, "measurables");
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            List list1 = (List)list0.get(v2);
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList1.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list1.get(v4)), IntrinsicMinMax.a, IntrinsicWidthHeight.b));
            }
            arrayList0.add(arrayList1);
        }
        long v5 = ConstraintsKt.b(0, v, 0, 0, 13, null);
        return multiContentMeasurePolicy0.a(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v5).getHeight();
    }

    public static int d(MultiContentMeasurePolicy multiContentMeasurePolicy0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(list0, "measurables");
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            List list1 = (List)list0.get(v2);
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList1.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list1.get(v4)), IntrinsicMinMax.a, IntrinsicWidthHeight.a));
            }
            arrayList0.add(arrayList1);
        }
        long v5 = ConstraintsKt.b(0, 0, 0, v, 7, null);
        return multiContentMeasurePolicy0.a(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v5).getWidth();
    }
}

