package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import java.util.concurrent.Callable;

public final class p extends c {
    final Callable a;

    public p(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        try {
            throwable0 = (Throwable)b.g(this.a.call(), "The error returned is null");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
        }
        e.e(throwable0, f0);
    }
}

