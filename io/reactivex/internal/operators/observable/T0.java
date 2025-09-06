package io.reactivex.internal.operators.observable;

import f3.m;
import io.reactivex.B;
import io.reactivex.I;

public final class t0 extends B implements m {
    private final Object a;

    public t0(Object object0) {
        this.a = object0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        a a1$a0 = new a(i0, this.a);
        i0.b(a1$a0);
        a1$a0.run();
    }

    @Override  // f3.m
    public Object call() {
        return this.a;
    }
}

