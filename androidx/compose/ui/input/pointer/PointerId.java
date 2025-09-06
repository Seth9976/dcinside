package androidx.compose.ui.input.pointer;

import z3.g;

@g
public final class PointerId {
    private final long a;

    private PointerId(long v) {
        this.a = v;
    }

    public static final PointerId a(long v) {
        return new PointerId(v);
    }

    public static long b(long v) [...] // Inlined contents

    public static boolean c(long v, Object object0) {
        return object0 instanceof PointerId ? v == ((PointerId)object0).h() : false;
    }

    public static final boolean d(long v, long v1) {
        return v == v1;
    }

    public final long e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        return PointerId.c(this.a, object0);
    }

    public static int f(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static String g(long v) {
        return "PointerId(value=" + v + ')';
    }

    public final long h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return PointerId.f(this.a);
    }

    @Override
    public String toString() {
        return PointerId.g(this.a);
    }
}

