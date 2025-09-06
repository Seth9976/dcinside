package androidx.compose.foundation.shape;

import androidx.compose.runtime.Stable;
import y4.l;

public final class CornerSizeKt {
    @l
    private static final CornerSize a;

    static {
        CornerSizeKt.a = new CornerSizeKt.ZeroCornerSize.1();
    }

    @Stable
    @l
    public static final CornerSize a(float f) {
        return new PxCornerSize(f);
    }

    @Stable
    @l
    public static final CornerSize b(int v) {
        return new PercentCornerSize(((float)v));
    }

    @Stable
    @l
    public static final CornerSize c(float f) {
        return new DpCornerSize(f, null);
    }

    @l
    public static final CornerSize d() {
        return CornerSizeKt.a;
    }

    @Stable
    public static void e() {
    }
}

