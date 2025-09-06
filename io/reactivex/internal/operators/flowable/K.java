package io.reactivex.internal.operators.flowable;

import e3.g;
import io.reactivex.flowables.a;
import io.reactivex.l;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.d;

public final class k extends l {
    final a b;
    final int c;
    final g d;
    final AtomicInteger e;

    public k(a a0, int v, g g0) {
        this.b = a0;
        this.c = v;
        this.d = g0;
        this.e = new AtomicInteger();
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        this.b.e(d0);
        if(this.e.incrementAndGet() == this.c) {
            this.b.S8(this.d);
        }
    }
}

