package io.reactivex.internal.observers;

import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.a;
import io.reactivex.observers.g;
import java.util.concurrent.atomic.AtomicReference;

public final class k extends AtomicReference implements N, c, g {
    final e3.g a;
    final e3.g b;
    private static final long c = 0x9EB00EEA81AA343DL;

    public k(e3.g g0, e3.g g1) {
        this.a = g0;
        this.b = g1;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.get() == d.a;
    }

    @Override  // io.reactivex.N
    public void b(c c0) {
        d.g(this, c0);
    }

    @Override  // io.reactivex.observers.g
    public boolean c() {
        return this.b != a.f;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        d.b(this);
    }

    @Override  // io.reactivex.N
    public void onError(Throwable throwable0) {
        this.lazySet(d.a);
        try {
            this.b.accept(throwable0);
        }
        catch(Throwable throwable1) {
            b.b(throwable1);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1}));
        }
    }

    @Override  // io.reactivex.N
    public void onSuccess(Object object0) {
        this.lazySet(d.a);
        try {
            this.a.accept(object0);
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            io.reactivex.plugins.a.Y(throwable0);
        }
    }
}

