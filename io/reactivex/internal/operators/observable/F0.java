package io.reactivex.internal.operators.observable;

import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.observers.l;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class f0 extends B {
    final Future a;
    final long b;
    final TimeUnit c;

    public f0(Future future0, long v, TimeUnit timeUnit0) {
        this.a = future0;
        this.b = v;
        this.c = timeUnit0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        Object object0;
        l l0 = new l(i0);
        i0.b(l0);
        if(!l0.a()) {
            try {
                object0 = b.g((this.c == null ? this.a.get() : this.a.get(this.b, this.c)), "Future returned null");
                goto label_10;
            }
            catch(Throwable throwable0) {
            }
            io.reactivex.exceptions.b.b(throwable0);
            if(!l0.a()) {
                i0.onError(throwable0);
                return;
            label_10:
                l0.d(object0);
            }
        }
    }
}

