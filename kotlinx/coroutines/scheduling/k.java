package kotlinx.coroutines.scheduling;

import kotlin.b0;
import y4.l;
import z3.f;

@b0
public abstract class k implements Runnable {
    @f
    public long a;
    @l
    @f
    public kotlinx.coroutines.scheduling.l b;

    public k() {
        this(0L, o.i);
    }

    public k(long v, @l kotlinx.coroutines.scheduling.l l0) {
        this.a = v;
        this.b = l0;
    }

    public final int a() {
        return this.b.d0();
    }
}

