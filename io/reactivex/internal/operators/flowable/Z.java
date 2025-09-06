package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.internal.util.j;
import io.reactivex.l;
import org.reactivestreams.c;
import org.reactivestreams.d;

public final class z extends l {
    final c b;
    final o c;
    final int d;
    final j e;

    public z(c c0, o o0, int v, j j0) {
        this.b = c0;
        this.c = o0;
        this.d = v;
        this.e = j0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        if(m1.b(this.b, d0, this.c)) {
            return;
        }
        d d1 = w.O8(d0, this.c, this.d, this.e);
        this.b.e(d1);
    }
}

