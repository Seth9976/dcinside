package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.g;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.u0;
import y4.l;

public class i extends u0 {
    private final int c;
    private final int d;
    private final long e;
    @l
    private final String f;
    @l
    private a g;

    public i() {
        this(0, 0, 0L, null, 15, null);
    }

    public i(int v, int v1, long v2, @l String s) {
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = s;
        this.g = this.J1();
    }

    public i(int v, int v1, long v2, String s, int v3, w w0) {
        if((v3 & 1) != 0) {
            v = o.c;
        }
        if((v3 & 2) != 0) {
            v1 = o.d;
        }
        if((v3 & 4) != 0) {
            v2 = o.e;
        }
        if((v3 & 8) != 0) {
            s = "CoroutineScheduler";
        }
        this(v, v1, v2, s);
    }

    private final a J1() {
        return new a(this.c, this.d, this.e, this.f);
    }

    public final void Q1(@l Runnable runnable0, @l kotlinx.coroutines.scheduling.l l0, boolean z) {
        this.g.p(runnable0, l0, z);
    }

    @Override  // kotlinx.coroutines.K
    public void b1(@l g g0, @l Runnable runnable0) {
        a.q(this.g, runnable0, null, false, 6, null);
    }

    @Override  // kotlinx.coroutines.u0
    public void close() {
        this.g.close();
    }

    public final void d2() {
        this.g2();
    }

    public final void e2(long v) {
        synchronized(this) {
            this.g.a1(v);
        }
    }

    public final void g2() {
        synchronized(this) {
            this.g.a1(1000L);
            this.g = this.J1();
        }
    }

    @Override  // kotlinx.coroutines.K
    public void h1(@l g g0, @l Runnable runnable0) {
        a.q(this.g, runnable0, null, true, 2, null);
    }

    @Override  // kotlinx.coroutines.u0
    @l
    public Executor u1() {
        return this.g;
    }
}

