package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.ranges.s;
import kotlinx.coroutines.E0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.x0;
import y4.l;

public final class c extends u0 implements Executor {
    @l
    public static final c c;
    @l
    private static final K d;

    static {
        c.c = new c();
        int v = a0.e("kotlinx.coroutines.io.parallelism", s.u(0x40, 8), 0, 0, 12, null);
        c.d = p.b.j1(v);
    }

    @Override  // kotlinx.coroutines.K
    public void b1(@l g g0, @l Runnable runnable0) {
        c.d.b1(g0, runnable0);
    }

    @Override  // kotlinx.coroutines.u0
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public void execute(@l Runnable runnable0) {
        this.b1(i.a, runnable0);
    }

    @Override  // kotlinx.coroutines.K
    @E0
    public void h1(@l g g0, @l Runnable runnable0) {
        c.d.h1(g0, runnable0);
    }

    @Override  // kotlinx.coroutines.K
    @x0
    @l
    public K j1(int v) {
        return p.b.j1(v);
    }

    @Override  // kotlinx.coroutines.K
    @l
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override  // kotlinx.coroutines.u0
    @l
    public Executor u1() {
        return this;
    }
}

