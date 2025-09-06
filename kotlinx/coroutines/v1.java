package kotlinx.coroutines;

import kotlin.coroutines.g;
import y4.l;

public final class v1 extends K {
    @l
    public static final v1 b;

    static {
        v1.b = new v1();
    }

    @Override  // kotlinx.coroutines.K
    public void b1(@l g g0, @l Runnable runnable0) {
        z1 z10 = (z1)g0.get(z1.b);
        if(z10 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        z10.a = true;
    }

    @Override  // kotlinx.coroutines.K
    public boolean i1(@l g g0) {
        return false;
    }

    @Override  // kotlinx.coroutines.K
    @x0
    @l
    public K j1(int v) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override  // kotlinx.coroutines.K
    @l
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}

