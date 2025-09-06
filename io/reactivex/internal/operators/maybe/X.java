package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.s;
import io.reactivex.v;
import java.util.concurrent.Callable;

public final class x extends s {
    final Callable a;

    public x(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        v0.b(d.a());
        try {
            throwable0 = (Throwable)b.g(this.a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
        }
        v0.onError(throwable0);
    }
}

