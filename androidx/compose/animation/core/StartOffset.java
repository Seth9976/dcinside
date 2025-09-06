package androidx.compose.animation.core;

import kotlin.jvm.internal.w;
import z3.g;

@g
public final class StartOffset {
    private final long a;

    private StartOffset(long v) {
        this.a = v;
    }

    public static final StartOffset a(long v) {
        return new StartOffset(v);
    }

    public static long b(int v, int v1) {
        return (long)(v * v1);
    }

    private static long c(long v) [...] // Inlined contents

    public static long d(int v, int v1, int v2, w w0) [...] // 潜在的解密器

    public static boolean e(long v, Object object0) {
        return object0 instanceof StartOffset ? v == ((StartOffset)object0).k() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return StartOffset.e(this.a, object0);
    }

    public static final boolean f(long v, long v1) {
        return v == v1;
    }

    public static final int g(long v) {
        return Math.abs(((int)v));
    }

    // 去混淆评级： 中等(70)
    public static final int h(long v) {
        return v <= 0L ? 1 : -1;
    }

    @Override
    public int hashCode() {
        return StartOffset.i(this.a);
    }

    public static int i(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static String j(long v) {
        return "StartOffset(value=" + v + ')';
    }

    public final long k() {
        return this.a;
    }

    @Override
    public String toString() {
        return StartOffset.j(this.a);
    }
}

