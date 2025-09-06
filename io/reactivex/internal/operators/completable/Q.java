package io.reactivex.internal.operators.completable;

import e3.a;
import io.reactivex.c;
import io.reactivex.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.f;

public final class q extends c {
    final a a;

    public q(a a0) {
        this.a = a0;
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
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        if(!c0.a()) {
            f0.onComplete();
        }
    }
}

