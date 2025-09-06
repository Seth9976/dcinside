package androidx.compose.ui.util;

public final class InlineClassHelperKt {
    public static final long a(float f, float f1) {
        return ((long)Float.floatToIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToIntBits(f)) << 0x20;
    }

    public static final long b(int v, int v1) {
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    public static final float c(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final float d(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static final int e(long v) {
        return (int)(v >> 0x20);
    }

    public static final int f(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }
}

