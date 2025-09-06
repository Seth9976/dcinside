package io.reactivex.observers;

import io.reactivex.f;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.i;
import java.util.concurrent.atomic.AtomicReference;

public abstract class c implements io.reactivex.disposables.c, f {
    final AtomicReference a;

    public c() {
        this.a = new AtomicReference();
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        return this.a.get() == d.a;
    }

    @Override  // io.reactivex.f
    public final void b(@d3.f io.reactivex.disposables.c c0) {
        Class class0 = this.getClass();
        boolean z = !i.c(this.a, c0, class0);
    }

    protected void c() {
    }

    @Override  // io.reactivex.disposables.c
    public final void dispose() {
        d.b(this.a);
    }
}

