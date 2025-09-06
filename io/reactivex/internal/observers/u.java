package io.reactivex.internal.observers;

import e3.a;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.observers.g;
import java.util.concurrent.atomic.AtomicReference;

public final class u extends AtomicReference implements I, c, g {
    final e3.g a;
    final e3.g b;
    final a c;
    final e3.g d;
    private static final long e = 0x9B5ED57B794EA334L;

    public u(e3.g g0, e3.g g1, a a0, e3.g g2) {
        this.a = g0;
        this.b = g1;
        this.c = a0;
        this.d = g2;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.get() == d.a;
    }

    @Override  // io.reactivex.I
    public void b(c c0) {
        if(d.g(this, c0)) {
            try {
                this.d.accept(this);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                c0.dispose();
                this.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.observers.g
    public boolean c() {
        return this.b != io.reactivex.internal.functions.a.f;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        d.b(this);
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        if(!this.a()) {
            this.lazySet(d.a);
            try {
                this.c.run();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                io.reactivex.plugins.a.Y(throwable0);
            }
        }
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        if(!this.a()) {
            this.lazySet(d.a);
            try {
                this.b.accept(throwable0);
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1}));
            }
            return;
        }
        io.reactivex.plugins.a.Y(throwable0);
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        if(!this.a()) {
            try {
                this.a.accept(object0);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                ((c)this.get()).dispose();
                this.onError(throwable0);
            }
        }
    }
}

