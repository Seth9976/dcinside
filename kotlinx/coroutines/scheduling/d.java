package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.K;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.x0;
import y4.l;

public final class d extends i {
    @l
    public static final d h;

    static {
        d.h = new d();
    }

    private d() {
        super(o.c, o.d, o.e, "DefaultDispatcher");
    }

    @Override  // kotlinx.coroutines.scheduling.i
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final void i2() {
        super.close();
    }

    @Override  // kotlinx.coroutines.K
    @x0
    @l
    public K j1(int v) {
        w.a(v);
        return v >= o.c ? this : super.j1(v);
    }

    @Override  // kotlinx.coroutines.K
    @l
    public String toString() {
        return "Dispatchers.Default";
    }
}

