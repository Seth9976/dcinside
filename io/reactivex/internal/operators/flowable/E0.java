package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.l;
import io.reactivex.q;
import org.reactivestreams.c;
import org.reactivestreams.d;

public final class e0 extends l {
    final c b;
    final o c;
    final boolean d;
    final int e;
    final int f;

    public e0(c c0, o o0, boolean z, int v, int v1) {
        this.b = c0;
        this.c = o0;
        this.d = z;
        this.e = v;
        this.f = v1;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        if(m1.b(this.b, d0, this.c)) {
            return;
        }
        q q0 = a0.O8(d0, this.c, this.d, this.e, this.f);
        this.b.e(q0);
    }
}

