package io.reactivex.internal.operators.completable;

import d3.e;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.c;
import io.reactivex.internal.operators.mixed.i;

@e
public final class z extends K {
    final c a;

    public z(c c0) {
        this.a = c0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        i i0 = new i(n0);
        this.a.e(i0);
    }
}

