package io.reactivex.internal.operators.flowable;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import java.util.concurrent.Callable;
import org.reactivestreams.c;

public final class b1 extends K {
    final c a;
    final Callable b;
    final e3.c c;

    public b1(c c0, Callable callable0, e3.c c1) {
        this.a = c0;
        this.b = callable0;
        this.c = c1;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        Object object0;
        try {
            object0 = b.g(this.b.call(), "The seedSupplier returned a null value");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            e.m(throwable0, n0);
            return;
        }
        a a1$a0 = new a(n0, this.c, object0);
        this.a.e(a1$a0);
    }
}

