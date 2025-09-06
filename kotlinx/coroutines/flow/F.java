package kotlinx.coroutines.flow;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.flow.internal.e;
import y4.l;
import y4.m;

class f extends e {
    @l
    private final o d;

    public f(@l o o0, @l g g0, int v, @l i i0) {
        super(g0, v, i0);
        this.d = o0;
    }

    public f(o o0, g g0, int v, i i0, int v1, w w0) {
        if((v1 & 2) != 0) {
            g0 = kotlin.coroutines.i.a;
        }
        if((v1 & 4) != 0) {
            v = -2;
        }
        if((v1 & 8) != 0) {
            i0 = i.a;
        }
        this(o0, g0, v, i0);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @m
    protected Object h(@l D d0, @l d d1) {
        return f.n(this, d0, d1);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    protected e i(@l g g0, int v, @l i i0) {
        return new f(this.d, g0, v, i0);
    }

    static Object n(f f0, D d0, d d1) {
        Object object0 = f0.d.invoke(d0, d1);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    public String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}

