package io.reactivex.observers;

import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.i;
import java.util.concurrent.atomic.AtomicReference;

public abstract class f implements N, c {
    final AtomicReference a;

    public f() {
        this.a = new AtomicReference();
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        return this.a.get() == d.a;
    }

    @Override  // io.reactivex.N
    public final void b(@d3.f c c0) {
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

