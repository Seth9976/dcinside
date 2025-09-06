package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.internal.util.j;
import io.reactivex.l;
import org.reactivestreams.c;
import org.reactivestreams.d;

public final class y extends l {
    final c b;
    final o c;
    final int d;
    final int e;
    final j f;

    public y(c c0, o o0, int v, int v1, j j0) {
        this.b = c0;
        this.c = o0;
        this.d = v;
        this.e = v1;
        this.f = j0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        a x$a0 = new a(d0, this.c, this.d, this.e, this.f);
        this.b.e(x$a0);
    }
}

