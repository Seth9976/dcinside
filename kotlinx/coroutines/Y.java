package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.selects.g;
import y4.l;
import y4.m;

final class y extends Q0 implements x {
    public y(@m I0 i00) {
        super(true);
        this.S0(i00);
    }

    @Override  // kotlinx.coroutines.Q0
    public boolean G0() {
        return true;
    }

    @Override  // kotlinx.coroutines.x
    public boolean Q(Object object0) {
        return this.h1(object0);
    }

    @Override  // kotlinx.coroutines.X
    @l
    public g a1() {
        g g0 = this.D0();
        L.n(g0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return g0;
    }

    @Override  // kotlinx.coroutines.x
    public boolean f(@l Throwable throwable0) {
        return this.h1(new C(throwable0, false, 2, null));
    }

    @Override  // kotlinx.coroutines.X
    public Object j() {
        return this.w0();
    }

    @Override  // kotlinx.coroutines.X
    @m
    public Object o(@l d d0) {
        return this.d0(d0);
    }
}

