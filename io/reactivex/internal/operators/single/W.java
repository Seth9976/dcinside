package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import java.util.concurrent.Callable;

public final class w extends K {
    final Callable a;

    public w(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        try {
            throwable0 = (Throwable)b.g(this.a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
        }
        e.m(throwable0, n0);
    }
}

