package io.reactivex.internal.observers;

import e3.b;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;

public final class d extends AtomicReference implements N, c {
    final b a;
    private static final long b = 0x44996DC9AB295821L;

    public d(b b0) {
        this.a = b0;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.get() == io.reactivex.internal.disposables.d.a;
    }

    @Override  // io.reactivex.N
    public void b(c c0) {
        io.reactivex.internal.disposables.d.g(this, c0);
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.internal.disposables.d.b(this);
    }

    @Override  // io.reactivex.N
    public void onError(Throwable throwable0) {
        try {
            this.lazySet(io.reactivex.internal.disposables.d.a);
            this.a.accept(null, throwable0);
        }
        catch(Throwable throwable1) {
            io.reactivex.exceptions.b.b(throwable1);
            a.Y(new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1}));
        }
    }

    @Override  // io.reactivex.N
    public void onSuccess(Object object0) {
        try {
            this.lazySet(io.reactivex.internal.disposables.d.a);
            this.a.accept(object0, null);
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            a.Y(throwable0);
        }
    }
}

