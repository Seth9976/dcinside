package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.d;
import io.reactivex.s;
import io.reactivex.v;

public final class w extends s {
    final Throwable a;

    public w(Throwable throwable0) {
        this.a = throwable0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        v0.b(d.a());
        v0.onError(this.a);
    }
}

