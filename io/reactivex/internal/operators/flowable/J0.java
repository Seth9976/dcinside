package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.l;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.d;

public final class j0 extends l {
    final Future b;
    final long c;
    final TimeUnit d;

    public j0(Future future0, long v, TimeUnit timeUnit0) {
        this.b = future0;
        this.c = v;
        this.d = timeUnit0;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        Object object0;
        f f0 = new f(d0);
        d0.g(f0);
        try {
            TimeUnit timeUnit0 = this.d;
            object0 = timeUnit0 == null ? this.b.get() : this.b.get(this.c, timeUnit0);
            goto label_13;
        }
        catch(Throwable throwable0) {
        }
        b.b(throwable0);
        if(!f0.f()) {
            d0.onError(throwable0);
        }
        return;
    label_13:
        if(object0 == null) {
            d0.onError(new NullPointerException("The future returned null"));
            return;
        }
        f0.a(object0);
    }
}

