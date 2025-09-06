package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.l;
import io.reactivex.plugins.a;
import java.util.concurrent.Callable;
import org.reactivestreams.d;

public final class i0 extends l implements Callable {
    final Callable b;

    public i0(Callable callable0) {
        this.b = callable0;
    }

    @Override
    public Object call() throws Exception {
        return b.g(this.b.call(), "The callable returned a null value");
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        Object object0;
        f f0 = new f(d0);
        d0.g(f0);
        try {
            object0 = b.g(this.b.call(), "The callable returned a null value");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            if(f0.f()) {
                a.Y(throwable0);
                return;
            }
            d0.onError(throwable0);
            return;
        }
        f0.a(object0);
    }
}

