package kotlinx.coroutines;

import y4.l;
import y4.m;
import z3.f;

public final class v extends K0 implements u {
    @l
    @f
    public final w e;

    public v(@l w w0) {
        this.e = w0;
    }

    @Override  // kotlinx.coroutines.D0
    public void a(@m Throwable throwable0) {
        Q0 q00 = this.H();
        this.e.p(q00);
    }

    @Override  // kotlinx.coroutines.u
    public boolean b(@l Throwable throwable0) {
        return this.H().n0(throwable0);
    }

    @Override  // kotlinx.coroutines.u
    @l
    public I0 getParent() {
        return this.H();
    }
}

