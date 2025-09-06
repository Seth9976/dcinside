package kotlin.coroutines;

import A3.o;
import java.io.Serializable;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@h0(version = "1.3")
public final class i implements Serializable, g {
    @l
    public static final i a;
    private static final long b;

    static {
        i.a = new i();
    }

    private final Object b() {
        return i.a;
    }

    @Override  // kotlin.coroutines.g
    public Object fold(Object object0, @l o o0) {
        L.p(o0, "operation");
        return object0;
    }

    @Override  // kotlin.coroutines.g
    @m
    public b get(@l c g$c0) {
        L.p(g$c0, "key");
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override  // kotlin.coroutines.g
    @l
    public g minusKey(@l c g$c0) {
        L.p(g$c0, "key");
        return this;
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        L.p(g0, "context");
        return g0;
    }

    @Override
    @l
    public String toString() {
        return "EmptyCoroutineContext";
    }
}

