package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.internal.functions.b;
import java.util.concurrent.Callable;

public final class e extends K {
    final Callable a;

    public e(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        Q q0;
        try {
            q0 = (Q)b.g(this.a.call(), "The singleSupplier returned a null SingleSource");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            io.reactivex.internal.disposables.e.m(throwable0, n0);
            return;
        }
        q0.e(n0);
    }
}

