package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import kotlin.comparisons.a;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;

public final class LayoutCoordinatesKt {
    @l
    public static final Rect a(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "<this>");
        LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.K();
        if(layoutCoordinates1 != null) {
            Rect rect0 = b.c(layoutCoordinates1, layoutCoordinates0, false, 2, null);
            return rect0 == null ? new Rect(0.0f, 0.0f, ((float)IntSize.m(layoutCoordinates0.a())), ((float)IntSize.j(layoutCoordinates0.a()))) : rect0;
        }
        return new Rect(0.0f, 0.0f, ((float)IntSize.m(layoutCoordinates0.a())), ((float)IntSize.j(layoutCoordinates0.a())));
    }

    @l
    public static final Rect b(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "<this>");
        return b.c(LayoutCoordinatesKt.d(layoutCoordinates0), layoutCoordinates0, false, 2, null);
    }

    @l
    public static final Rect c(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "<this>");
        LayoutCoordinates layoutCoordinates1 = LayoutCoordinatesKt.d(layoutCoordinates0);
        Rect rect0 = LayoutCoordinatesKt.b(layoutCoordinates0);
        float f = (float)IntSize.m(layoutCoordinates1.a());
        float f1 = (float)IntSize.j(layoutCoordinates1.a());
        float f2 = s.H(rect0.t(), 0.0f, f);
        float f3 = s.H(rect0.B(), 0.0f, f1);
        float f4 = s.H(rect0.x(), 0.0f, f);
        float f5 = s.H(rect0.j(), 0.0f, f1);
        if(f2 == f4 || f3 == f5) {
            return Rect.e.a();
        }
        long v = layoutCoordinates1.B(OffsetKt.a(f2, f3));
        long v1 = layoutCoordinates1.B(OffsetKt.a(f4, f3));
        long v2 = layoutCoordinates1.B(OffsetKt.a(f4, f5));
        long v3 = layoutCoordinates1.B(OffsetKt.a(f2, f5));
        return new Rect(a.l0(Offset.p(v), new float[]{Offset.p(v1), Offset.p(v3), Offset.p(v2)}), a.l0(Offset.r(v), new float[]{Offset.r(v1), Offset.r(v3), Offset.r(v2)}), a.Q(Offset.p(v), new float[]{Offset.p(v1), Offset.p(v3), Offset.p(v2)}), a.Q(Offset.r(v), new float[]{Offset.r(v1), Offset.r(v3), Offset.r(v2)}));
    }

    @l
    public static final LayoutCoordinates d(@l LayoutCoordinates layoutCoordinates0) {
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates2;
        L.p(layoutCoordinates0, "<this>");
        for(LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.K(); true; layoutCoordinates1 = layoutCoordinates0.K()) {
            layoutCoordinates2 = layoutCoordinates0;
            layoutCoordinates0 = layoutCoordinates1;
            if(layoutCoordinates0 == null) {
                break;
            }
        }
        NodeCoordinator nodeCoordinator0 = layoutCoordinates2 instanceof NodeCoordinator ? ((NodeCoordinator)layoutCoordinates2) : null;
        if(nodeCoordinator0 == null) {
            return layoutCoordinates2;
        }
        for(NodeCoordinator nodeCoordinator1 = nodeCoordinator0.O2(); true; nodeCoordinator1 = nodeCoordinator0.O2()) {
            layoutCoordinates3 = nodeCoordinator0;
            nodeCoordinator0 = nodeCoordinator1;
            if(nodeCoordinator0 == null) {
                break;
            }
        }
        return layoutCoordinates3;
    }

    public static final long e(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "<this>");
        LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.K();
        return layoutCoordinates1 == null ? 0L : layoutCoordinates1.P(layoutCoordinates0, 0L);
    }

    public static final long f(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "<this>");
        return layoutCoordinates0.L(0L);
    }

    public static final long g(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "<this>");
        return layoutCoordinates0.B(0L);
    }
}

