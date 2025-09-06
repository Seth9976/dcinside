package io.reactivex.internal.operators.flowable;

import io.reactivex.l;
import org.reactivestreams.c;
import org.reactivestreams.d;

public final class m0 extends l {
    final c b;

    public m0(c c0) {
        this.b = c0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        this.b.e(d0);
    }
}

