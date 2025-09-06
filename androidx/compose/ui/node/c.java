package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import kotlin.jvm.internal.L;
import y4.l;

public final class c {
    public static void a(LayoutModifierNode layoutModifierNode0) {
        DelegatableNodeKt.p(layoutModifierNode0).d();
    }

    public static int b(LayoutModifierNode layoutModifierNode0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return NodeMeasuringIntrinsics.a.a(layoutModifierNode0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    public static int c(LayoutModifierNode layoutModifierNode0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return NodeMeasuringIntrinsics.a.b(layoutModifierNode0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    public static int d(LayoutModifierNode layoutModifierNode0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return NodeMeasuringIntrinsics.a.c(layoutModifierNode0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    public static int e(LayoutModifierNode layoutModifierNode0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(intrinsicMeasureScope0, "<this>");
        L.p(intrinsicMeasurable0, "measurable");
        return NodeMeasuringIntrinsics.a.d(layoutModifierNode0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }
}

