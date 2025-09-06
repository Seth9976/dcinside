package io.reactivex.internal.operators.maybe;

import e3.a;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.observers.g;
import io.reactivex.v;
import java.util.concurrent.atomic.AtomicReference;

public final class d extends AtomicReference implements c, g, v {
    final e3.g a;
    final e3.g b;
    final a c;
    private static final long d = 0xABAA5414D0791FE6L;

    public d(e3.g g0, e3.g g1, a a0) {
        this.a = g0;
        this.b = g1;
        this.c = a0;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return io.reactivex.internal.disposables.d.c(((c)this.get()));
    }

    @Override  // io.reactivex.v
    public void b(c c0) {
        io.reactivex.internal.disposables.d.g(this, c0);
    }

    @Override  // io.reactivex.observers.g
    public boolean c() {
        return this.b != io.reactivex.internal.functions.a.f;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.internal.disposables.d.b(this);
    }

    @Override  // io.reactivex.v
    public void onComplete() {
        this.lazySet(io.reactivex.internal.disposables.d.a);
        try {
            this.c.run();
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            io.reactivex.plugins.a.Y(throwable0);
        }
    }

    @Override  // io.reactivex.v
    public void onError(Throwable throwable0) {
        this.lazySet(io.reactivex.internal.disposables.d.a);
        try {
            this.b.accept(throwable0);
        }
        catch(Throwable throwable1) {
            b.b(throwable1);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1}));
        }
    }

    @Override  // io.reactivex.v
    public void onSuccess(Object object0) {
        this.lazySet(io.reactivex.internal.disposables.d.a);
        try {
            this.a.accept(object0);
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            io.reactivex.plugins.a.Y(throwable0);
        }
    }
}

