package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import java.util.concurrent.Callable;

public final class h extends c {
    final Callable a;

    public h(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        i i0;
        try {
            i0 = (i)b.g(this.a.call(), "The completableSupplier returned a null CompletableSource");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            e.e(throwable0, f0);
            return;
        }
        i0.e(f0);
    }
}

