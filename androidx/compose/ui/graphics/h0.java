package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.L;
import y4.l;

public final class h0 {
    static {
    }

    public static void a(Path path0, @l Rect rect0, float f, float f1, boolean z) {
        L.p(rect0, "rect");
        path0.k(rect0, f * 57.29578f, f1 * 57.29578f, z);
    }

    public static void c(Path path0, Path path1, long v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        path0.l(path1, v);
    }
}

