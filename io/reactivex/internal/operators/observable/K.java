package io.reactivex.internal.operators.observable;

import e3.g;
import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.observables.a;
import java.util.concurrent.atomic.AtomicInteger;

public final class k extends B {
    final a a;
    final int b;
    final g c;
    final AtomicInteger d;

    public k(a a0, int v, g g0) {
        this.a = a0;
        this.b = v;
        this.c = g0;
        this.d = new AtomicInteger();
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        this.a.d(i0);
        if(this.d.incrementAndGet() == this.b) {
            this.a.m8(this.c);
        }
    }
}

