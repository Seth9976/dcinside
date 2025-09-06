package kotlinx.coroutines.flow.internal;

import A3.o;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import y4.l;
import y4.m;
import z3.f;

public final class n implements g {
    @l
    @f
    public final Throwable a;
    private final g b;

    public n(@l Throwable throwable0, @l g g0) {
        this.a = throwable0;
        this.b = g0;
    }

    @Override  // kotlin.coroutines.g
    public Object fold(Object object0, @l o o0) {
        return this.b.fold(object0, o0);
    }

    @Override  // kotlin.coroutines.g
    @m
    public b get(@l c g$c0) {
        return this.b.get(g$c0);
    }

    @Override  // kotlin.coroutines.g
    @l
    public g minusKey(@l c g$c0) {
        return this.b.minusKey(g$c0);
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        return this.b.plus(g0);
    }
}

