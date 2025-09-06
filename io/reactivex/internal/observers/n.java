package io.reactivex.internal.observers;

import e3.a;
import e3.g;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;

public final class n implements I, c {
    final I a;
    final g b;
    final a c;
    c d;

    public n(I i0, g g0, a a0) {
        this.a = i0;
        this.b = g0;
        this.c = a0;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.d.a();
    }

    @Override  // io.reactivex.I
    public void b(c c0) {
        try {
            this.b.accept(c0);
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            c0.dispose();
            this.d = d.a;
            e.g(throwable0, this.a);
            return;
        }
        if(d.i(this.d, c0)) {
            this.d = c0;
            this.a.b(this);
        }
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        c c0 = this.d;
        d d0 = d.a;
        if(c0 != d0) {
            try {
                this.d = d0;
                this.c.run();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                io.reactivex.plugins.a.Y(throwable0);
            }
            c0.dispose();
        }
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        d d0 = d.a;
        if(this.d != d0) {
            this.d = d0;
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        d d0 = d.a;
        if(this.d != d0) {
            this.d = d0;
            this.a.onError(throwable0);
            return;
        }
        io.reactivex.plugins.a.Y(throwable0);
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        this.a.onNext(object0);
    }
}

