package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.ranges.s;
import kotlinx.coroutines.internal.a0;
import y4.l;
import z3.f;

public final class o {
    @l
    @f
    public static final String a = null;
    @f
    public static final long b = 0L;
    @f
    public static final int c = 0;
    @f
    public static final int d = 0;
    @f
    public static final long e = 0L;
    @l
    @f
    public static j f = null;
    public static final int g = 0;
    public static final int h = 1;
    @l
    @f
    public static final kotlinx.coroutines.scheduling.l i;
    @l
    @f
    public static final kotlinx.coroutines.scheduling.l j;

    static {
        o.a = "DefaultDispatcher";
        o.b = a0.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        o.c = a0.e("kotlinx.coroutines.scheduler.core.pool.size", s.u(8, 2), 1, 0, 8, null);
        o.d = a0.e("kotlinx.coroutines.scheduler.max.pool.size", 0x1FFFFE, 0, 0x1FFFFE, 4, null);
        o.e = TimeUnit.SECONDS.toNanos(a0.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        o.f = h.a;
        o.i = new m(0);
        o.j = new m(1);
    }

    public static final boolean a(@l k k0) {
        return k0.b.d0() == 1;
    }
}

