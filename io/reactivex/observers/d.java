package io.reactivex.observers;

import d3.f;
import io.reactivex.disposables.c;
import io.reactivex.internal.util.i;
import io.reactivex.v;
import java.util.concurrent.atomic.AtomicReference;

public abstract class d implements c, v {
    final AtomicReference a;

    public d() {
        this.a = new AtomicReference();
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        return this.a.get() == io.reactivex.internal.disposables.d.a;
    }

    @Override  // io.reactivex.v
    public final void b(@f c c0) {
        Class class0 = this.getClass();
        boolean z = !i.c(this.a, c0, class0);
    }

    protected void c() {
    }

    @Override  // io.reactivex.disposables.c
    public final void dispose() {
        io.reactivex.internal.disposables.d.b(this.a);
    }
}

