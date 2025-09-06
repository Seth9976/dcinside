package io.reactivex.internal.observers;

import e3.a;
import e3.g;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.f;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends AtomicReference implements g, c, f, io.reactivex.observers.g {
    final g a;
    final a b;
    private static final long c = 0xC37999502F055A56L;

    public j(a a0) {
        this.a = this;
        this.b = a0;
    }

    public j(g g0, a a0) {
        this.a = g0;
        this.b = a0;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.get() == d.a;
    }

    @Override  // e3.g
    public void accept(Object object0) throws Exception {
        this.d(((Throwable)object0));
    }

    @Override  // io.reactivex.f
    public void b(c c0) {
        d.g(this, c0);
    }

    @Override  // io.reactivex.observers.g
    public boolean c() {
        return this.a != this;
    }

    public void d(Throwable throwable0) {
        io.reactivex.plugins.a.Y(new io.reactivex.exceptions.d(throwable0));
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        d.b(this);
    }

    @Override  // io.reactivex.f
    public void onComplete() {
        try {
            this.b.run();
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            io.reactivex.plugins.a.Y(throwable0);
        }
        this.lazySet(d.a);
    }

    @Override  // io.reactivex.f
    public void onError(Throwable throwable0) {
        try {
            this.a.accept(throwable0);
        }
        catch(Throwable throwable1) {
            b.b(throwable1);
            io.reactivex.plugins.a.Y(throwable1);
        }
        this.lazySet(d.a);
    }
}

