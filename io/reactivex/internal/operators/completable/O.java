package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.internal.disposables.e;

public final class o extends c {
    final Throwable a;

    public o(Throwable throwable0) {
        this.a = throwable0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        e.e(this.a, f0);
    }
}

