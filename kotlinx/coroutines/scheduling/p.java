package kotlinx.coroutines.scheduling;

import kotlin.coroutines.g;
import kotlinx.coroutines.E0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.x0;
import y4.l;

final class p extends K {
    @l
    public static final p b;

    static {
        p.b = new p();
    }

    @Override  // kotlinx.coroutines.K
    public void b1(@l g g0, @l Runnable runnable0) {
        d.h.Q1(runnable0, o.j, false);
    }

    @Override  // kotlinx.coroutines.K
    @E0
    public void h1(@l g g0, @l Runnable runnable0) {
        d.h.Q1(runnable0, o.j, true);
    }

    @Override  // kotlinx.coroutines.K
    @x0
    @l
    public K j1(int v) {
        w.a(v);
        return v >= o.d ? this : super.j1(v);
    }
}

