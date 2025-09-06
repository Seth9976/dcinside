package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.L;
import kotlin.math.b;
import y4.l;

public final class IntRectKt {
    @Stable
    @l
    public static final IntRect a(long v, long v1) {
        return new IntRect(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)), ((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)));
    }

    @Stable
    @l
    public static final IntRect b(long v, long v1) {
        return new IntRect(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)), ((int)(v >> 0x20)) + ((int)(v1 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL)));
    }

    @Stable
    @l
    public static final IntRect c(long v, int v1) {
        return new IntRect(((int)(v >> 0x20)) - v1, ((int)(v & 0xFFFFFFFFL)) - v1, ((int)(v >> 0x20)) + v1, ((int)(v & 0xFFFFFFFFL)) + v1);
    }

    @Stable
    @l
    public static final IntRect d(@l IntRect intRect0, @l IntRect intRect1, float f) {
        L.p(intRect0, "start");
        L.p(intRect1, "stop");
        return new IntRect(MathHelpersKt.b(intRect0.t(), intRect1.t(), f), MathHelpersKt.b(intRect0.B(), intRect1.B(), f), MathHelpersKt.b(intRect0.x(), intRect1.x(), f), MathHelpersKt.b(intRect0.j(), intRect1.j(), f));
    }

    @Stable
    @l
    public static final IntRect e(@l Rect rect0) {
        L.p(rect0, "<this>");
        return new IntRect(b.L0(rect0.t()), b.L0(rect0.B()), b.L0(rect0.x()), b.L0(rect0.j()));
    }

    @Stable
    @l
    public static final Rect f(@l IntRect intRect0) {
        L.p(intRect0, "<this>");
        return new Rect(((float)intRect0.t()), ((float)intRect0.B()), ((float)intRect0.x()), ((float)intRect0.j()));
    }
}

