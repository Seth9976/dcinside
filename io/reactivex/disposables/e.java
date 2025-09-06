package io.reactivex.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

final class e extends AtomicReference implements c {
    private final boolean a;
    private static final long b = 0x5AD55FAD22D3C507L;

    e(Future future0, boolean z) {
        super(future0);
        this.a = z;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        Future future0 = (Future)this.get();
        return future0 == null || future0.isDone();
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        Future future0 = (Future)this.getAndSet(null);
        if(future0 != null) {
            future0.cancel(this.a);
        }
    }
}

