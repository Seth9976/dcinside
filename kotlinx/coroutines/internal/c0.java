package kotlinx.coroutines.internal;

import A3.o;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.k1.a;
import kotlinx.coroutines.k1;
import y4.l;
import y4.m;

public final class c0 implements k1 {
    private final Object a;
    @l
    private final ThreadLocal b;
    @l
    private final c c;

    public c0(Object object0, @l ThreadLocal threadLocal0) {
        this.a = object0;
        this.b = threadLocal0;
        this.c = new d0(threadLocal0);
    }

    @Override  // kotlinx.coroutines.k1
    public void L(@l g g0, Object object0) {
        this.b.set(object0);
    }

    @Override  // kotlinx.coroutines.k1
    public Object d1(@l g g0) {
        Object object0 = this.b.get();
        this.b.set(this.a);
        return object0;
    }

    @Override  // kotlin.coroutines.g$b
    public Object fold(Object object0, @l o o0) {
        return a.a(this, object0, o0);
    }

    @Override  // kotlin.coroutines.g$b
    @m
    public b get(@l c g$c0) {
        if(L.g(this.getKey(), g$c0)) {
            L.n(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
            return this;
        }
        return null;
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public c getKey() {
        return this.c;
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public g minusKey(@l c g$c0) {
        return L.g(this.getKey(), g$c0) ? i.a : this;
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        return a.d(this, g0);
    }

    @Override
    @l
    public String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}

