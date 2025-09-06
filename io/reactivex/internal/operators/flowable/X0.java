package io.reactivex.internal.operators.flowable;

import f3.m;
import io.reactivex.internal.subscriptions.h;
import io.reactivex.l;
import org.reactivestreams.d;

public final class x0 extends l implements m {
    private final Object b;

    public x0(Object object0) {
        this.b = object0;
    }

    @Override  // f3.m
    public Object call() {
        return this.b;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        d0.g(new h(d0, this.b));
    }
}

