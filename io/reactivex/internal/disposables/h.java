package io.reactivex.internal.disposables;

import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class h extends AtomicReference implements c {
    private static final long a = 0xF5860F8A57BA5918L;

    public h() {
    }

    public h(c c0) {
        this.lazySet(c0);
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return d.c(((c)this.get()));
    }

    public boolean b(c c0) {
        return d.d(this, c0);
    }

    public boolean c(c c0) {
        return d.f(this, c0);
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        d.b(this);
    }
}

