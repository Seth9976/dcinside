package kotlinx.coroutines.flow;

import kotlin.coroutines.d;
import y4.l;
import y4.m;
import z3.f;

public final class a0 implements j {
    @l
    @f
    public final Throwable a;

    public a0(@l Throwable throwable0) {
        this.a = throwable0;
    }

    @Override  // kotlinx.coroutines.flow.j
    @m
    public Object emit(@m Object object0, @l d d0) {
        throw this.a;
    }
}

