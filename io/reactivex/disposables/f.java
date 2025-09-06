package io.reactivex.disposables;

import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicReference;

abstract class f extends AtomicReference implements c {
    private static final long a = 0x5ABAC7DA20D0AE41L;

    f(Object object0) {
        super(b.g(object0, "value is null"));
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        return this.get() == null;
    }

    protected abstract void b(@d3.f Object arg1);

    @Override  // io.reactivex.disposables.c
    public final void dispose() {
        if(this.get() != null) {
            Object object0 = this.getAndSet(null);
            if(object0 != null) {
                this.b(object0);
            }
        }
    }
}

