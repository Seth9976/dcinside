package kotlinx.coroutines.flow.internal;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.j;
import y4.l;
import y4.m;

public final class i extends h {
    public i(@l kotlinx.coroutines.flow.i i0, @l g g0, int v, @l kotlinx.coroutines.channels.i i1) {
        super(i0, g0, v, i1);
    }

    public i(kotlinx.coroutines.flow.i i0, g g0, int v, kotlinx.coroutines.channels.i i1, int v1, w w0) {
        if((v1 & 2) != 0) {
            g0 = kotlin.coroutines.i.a;
        }
        if((v1 & 4) != 0) {
            v = -3;
        }
        if((v1 & 8) != 0) {
            i1 = kotlinx.coroutines.channels.i.a;
        }
        this(i0, g0, v, i1);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    protected e i(@l g g0, int v, @l kotlinx.coroutines.channels.i i0) {
        return new i(this.d, g0, v, i0);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    public kotlinx.coroutines.flow.i j() {
        return this.d;
    }

    @Override  // kotlinx.coroutines.flow.internal.h
    @m
    protected Object r(@l j j0, @l d d0) {
        Object object0 = this.d.collect(j0, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

