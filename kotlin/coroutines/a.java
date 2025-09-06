package kotlin.coroutines;

import A3.o;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@h0(version = "1.3")
public abstract class a implements b {
    @l
    private final c key;

    public a(@l c g$c0) {
        L.p(g$c0, "key");
        super();
        this.key = g$c0;
    }

    @Override  // kotlin.coroutines.g$b
    public Object fold(Object object0, @l o o0) {
        return kotlin.coroutines.g.b.a.a(this, object0, o0);
    }

    @Override  // kotlin.coroutines.g$b
    @m
    public b get(@l c g$c0) {
        return kotlin.coroutines.g.b.a.b(this, g$c0);
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public c getKey() {
        return this.key;
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public g minusKey(@l c g$c0) {
        return kotlin.coroutines.g.b.a.c(this, g$c0);
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        return kotlin.coroutines.g.b.a.d(this, g0);
    }
}

