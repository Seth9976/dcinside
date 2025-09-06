package kotlinx.coroutines;

import kotlinx.coroutines.internal.V;
import y4.l;
import z3.f;

public final class q {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 29;
    private static final int e = 0x1FFFFFFF;
    private static final int f = 0x1FFFFFFF;
    @l
    @f
    public static final V g;

    static {
        q.g = new V("RESUME_TOKEN");
    }

    private static final int a(int v, int v1) {
        return (v << 29) + v1;
    }

    private static final int b(int v) {
        return v >> 29;
    }

    private static final int c(int v) {
        return v & 0x1FFFFFFF;
    }
}

