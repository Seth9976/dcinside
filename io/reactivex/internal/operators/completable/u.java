package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.f;
import io.reactivex.plugins.a;

public final class u extends c {
    final Runnable a;

    public u(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        io.reactivex.disposables.c c0 = d.b();
        f0.b(c0);
        try {
            this.a.run();
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            if(!c0.a()) {
                f0.onError(throwable0);
                return;
            }
            a.Y(throwable0);
            return;
        }
        if(!c0.a()) {
            f0.onComplete();
        }
    }
}

