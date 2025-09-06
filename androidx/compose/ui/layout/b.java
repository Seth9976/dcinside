package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.L;
import y4.l;

public final class b {
    public static void a(LayoutCoordinates layoutCoordinates0, @l LayoutCoordinates layoutCoordinates1, @l float[] arr_f) {
        L.p(layoutCoordinates1, "sourceCoordinates");
        L.p(arr_f, "matrix");
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    public static Rect c(LayoutCoordinates layoutCoordinates0, LayoutCoordinates layoutCoordinates1, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if((v & 2) != 0) {
            z = true;
        }
        return layoutCoordinates0.E(layoutCoordinates1, z);
    }
}

