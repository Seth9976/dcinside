package androidx.compose.animation.core;

public final class b {
    public static int a(double f) {
        long v = Double.doubleToLongBits(f);
        return (int)(v ^ v >>> 0x20);
    }
}

