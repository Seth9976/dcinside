package androidx.lifecycle;

import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.h0;
import y4.l;
import z3.f;

public final class PausingDispatcher extends K {
    @l
    @f
    public final DispatchQueue b;

    public PausingDispatcher() {
        this.b = new DispatchQueue();
    }

    @Override  // kotlinx.coroutines.K
    public void b1(@l g g0, @l Runnable runnable0) {
        L.p(g0, "context");
        L.p(runnable0, "block");
        this.b.c(g0, runnable0);
    }

    @Override  // kotlinx.coroutines.K
    public boolean i1(@l g g0) {
        L.p(g0, "context");
        return h0.e().u1().i1(g0) ? true : !this.b.b();
    }
}

