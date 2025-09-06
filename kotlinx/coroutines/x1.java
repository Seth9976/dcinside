package kotlinx.coroutines;

import A3.o;
import kotlin.coroutines.g.b.a;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import y4.l;
import y4.m;

final class x1 implements b, c {
    @l
    public static final x1 a;

    static {
        x1.a = new x1();
    }

    @Override  // kotlin.coroutines.g$b
    public Object fold(Object object0, @l o o0) {
        return a.a(this, object0, o0);
    }

    @Override  // kotlin.coroutines.g$b
    @m
    public b get(@l c g$c0) {
        return a.b(this, g$c0);
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public c getKey() {
        return this;
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public g minusKey(@l c g$c0) {
        return a.c(this, g$c0);
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        return a.d(this, g0);
    }
}

