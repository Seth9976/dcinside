package kotlinx.coroutines;

import kotlinx.coroutines.internal.V;
import y4.l;

public final class s0 {
    @l
    private static final V a = null;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final long e = 1000000L;
    private static final long f = 0x8637BD05AF6L;
    private static final long g = 0x3FFFFFFFFFFFFFFFL;
    @l
    private static final V h;

    static {
        s0.a = new V("REMOVED_TASK");
        s0.h = new V("CLOSED_EMPTY");
    }

    public static final long c(long v) [...] // Inlined contents

    public static final long d(long v) {
        if(v > 0L) {
            return v < 0x8637BD05AF6L ? 1000000L * v : 0x7FFFFFFFFFFFFFFFL;
        }
        return 0L;
    }
}

