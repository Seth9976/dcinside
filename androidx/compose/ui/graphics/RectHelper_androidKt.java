package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.ui.unit.IntRect;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class RectHelper_androidKt {
    @k(message = "Converting Rect to android.graphics.Rect is lossy, and requires rounding. The behavior of toAndroidRect() truncates to an integral Rect, but you should choose the method of rounding most suitable for your use case.", replaceWith = @c0(expression = "android.graphics.Rect(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())", imports = {}))
    @l
    public static final Rect a(@l androidx.compose.ui.geometry.Rect rect0) {
        L.p(rect0, "<this>");
        return new Rect(((int)rect0.t()), ((int)rect0.B()), ((int)rect0.x()), ((int)rect0.j()));
    }

    @l
    public static final Rect b(@l IntRect intRect0) {
        L.p(intRect0, "<this>");
        return new Rect(intRect0.t(), intRect0.B(), intRect0.x(), intRect0.j());
    }

    @l
    public static final RectF c(@l androidx.compose.ui.geometry.Rect rect0) {
        L.p(rect0, "<this>");
        return new RectF(rect0.t(), rect0.B(), rect0.x(), rect0.j());
    }

    @l
    public static final IntRect d(@l Rect rect0) {
        L.p(rect0, "<this>");
        return new IntRect(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    @l
    public static final androidx.compose.ui.geometry.Rect e(@l Rect rect0) {
        L.p(rect0, "<this>");
        return new androidx.compose.ui.geometry.Rect(((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom));
    }
}

