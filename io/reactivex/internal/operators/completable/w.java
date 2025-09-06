package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.i;

public final class w extends c {
    final i a;

    public w(i i0) {
        this.a = i0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        this.a.e(f0);
    }
}

