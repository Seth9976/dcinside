package io.reactivex.internal.observers;

import io.reactivex.disposables.c;
import io.reactivex.f;
import io.reactivex.internal.disposables.d;
import io.reactivex.observers.g;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;

public final class o extends AtomicReference implements c, f, g {
    private static final long a = 0x974A57D8EA57E4DAL;

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.get() == d.a;
    }

    @Override  // io.reactivex.f
    public void b(c c0) {
        d.g(this, c0);
    }

    @Override  // io.reactivex.observers.g
    public boolean c() {
        return false;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        d.b(this);
    }

    @Override  // io.reactivex.f
    public void onComplete() {
        this.lazySet(d.a);
    }

    @Override  // io.reactivex.f
    public void onError(Throwable throwable0) {
        this.lazySet(d.a);
        a.Y(new io.reactivex.exceptions.d(throwable0));
    }
}

