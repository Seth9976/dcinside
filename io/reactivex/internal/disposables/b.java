package io.reactivex.internal.disposables;

import e3.f;
import io.reactivex.disposables.c;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;

public final class b extends AtomicReference implements c {
    private static final long a = 0x4F5C453163A88DC2L;

    public b(f f0) {
        super(f0);
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.get() == null;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        if(this.get() != null) {
            f f0 = (f)this.getAndSet(null);
            if(f0 != null) {
                try {
                    f0.cancel();
                }
                catch(Exception exception0) {
                    io.reactivex.exceptions.b.b(exception0);
                    a.Y(exception0);
                }
            }
        }
    }
}

