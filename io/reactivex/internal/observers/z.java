package io.reactivex.internal.observers;

import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;

public final class z implements N {
    final AtomicReference a;
    final N b;

    public z(AtomicReference atomicReference0, N n0) {
        this.a = atomicReference0;
        this.b = n0;
    }

    @Override  // io.reactivex.N
    public void b(c c0) {
        d.d(this.a, c0);
    }

    @Override  // io.reactivex.N
    public void onError(Throwable throwable0) {
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.N
    public void onSuccess(Object object0) {
        this.b.onSuccess(object0);
    }
}

