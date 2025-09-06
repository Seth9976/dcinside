package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.Callable;

public final class k extends s {
    final Callable a;

    public k(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        y y0;
        try {
            y0 = (y)b.g(this.a.call(), "The maybeSupplier returned a null MaybeSource");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            e.f(throwable0, v0);
            return;
        }
        y0.a(v0);
    }
}

