package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlinx.coroutines.internal.Q;
import y4.l;
import z3.f;

final class t1 extends Q implements Runnable {
    @f
    public final long e;

    public t1(long v, @l d d0) {
        super(d0.getContext(), d0);
        this.e = v;
    }

    @Override  // kotlinx.coroutines.a
    @l
    public String k1() {
        return super.k1() + "(timeMillis=" + this.e + ')';
    }

    @Override
    public void run() {
        Z z0 = a0.d(this.getContext());
        this.h0(u1.a(this.e, z0, this));
    }
}

