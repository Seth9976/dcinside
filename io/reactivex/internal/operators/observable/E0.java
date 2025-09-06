package io.reactivex.internal.operators.observable;

import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.observers.l;
import io.reactivex.plugins.a;
import java.util.concurrent.Callable;

public final class e0 extends B implements Callable {
    final Callable a;

    public e0(Callable callable0) {
        this.a = callable0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        Object object0;
        l l0 = new l(i0);
        i0.b(l0);
        if(l0.a()) {
            return;
        }
        try {
            object0 = b.g(this.a.call(), "Callable returned null");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            if(!l0.a()) {
                i0.onError(throwable0);
                return;
            }
            a.Y(throwable0);
            return;
        }
        l0.d(object0);
    }

    @Override
    public Object call() throws Exception {
        return b.g(this.a.call(), "The callable returned a null value");
    }
}

