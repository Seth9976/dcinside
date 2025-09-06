package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class RectKt {
    @Stable
    @l
    public static final Rect a(long v, long v1) {
        return new Rect(Offset.p(v), Offset.r(v), Offset.p(v1), Offset.r(v1));
    }

    @Stable
    @l
    public static final Rect b(long v, float f) {
        return new Rect(Offset.p(v) - f, Offset.r(v) - f, Offset.p(v) + f, Offset.r(v) + f);
    }

    @Stable
    @l
    public static final Rect c(long v, long v1) {
        return new Rect(Offset.p(v), Offset.r(v), Offset.p(v) + Size.t(v1), Offset.r(v) + Size.m(v1));
    }

    @Stable
    @l
    public static final Rect d(@l Rect rect0, @l Rect rect1, float f) {
        L.p(rect0, "start");
        L.p(rect1, "stop");
        return new Rect(MathHelpersKt.a(rect0.t(), rect1.t(), f), MathHelpersKt.a(rect0.B(), rect1.B(), f), MathHelpersKt.a(rect0.x(), rect1.x(), f), MathHelpersKt.a(rect0.j(), rect1.j(), f));
    }
}

