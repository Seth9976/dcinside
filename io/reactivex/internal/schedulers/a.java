package io.reactivex.internal.schedulers;

import io.reactivex.disposables.c;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

abstract class a extends AtomicReference implements c, io.reactivex.schedulers.a {
    protected final Runnable a;
    protected Thread b;
    private static final long c = 0x1924F211B909B42FL;
    protected static final FutureTask d;
    protected static final FutureTask e;

    static {
        a.d = new FutureTask(io.reactivex.internal.functions.a.b, null);
        a.e = new FutureTask(io.reactivex.internal.functions.a.b, null);
    }

    a(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        Future future0 = (Future)this.get();
        return future0 == a.d || future0 == a.e;
    }

    @Override  // io.reactivex.schedulers.a
    public Runnable b() {
        return this.a;
    }

    public final void c(Future future0) {
        do {
            Future future1 = (Future)this.get();
            if(future1 == a.d) {
                break;
            }
            if(future1 == a.e) {
                future0.cancel(this.b != Thread.currentThread());
                return;
            }
        }
        while(!this.compareAndSet(future1, future0));
    }

    @Override  // io.reactivex.disposables.c
    public final void dispose() {
        Future future0 = (Future)this.get();
        if(future0 != a.d && (future0 != a.e && this.compareAndSet(future0, a.e) && future0 != null)) {
            future0.cancel(this.b != Thread.currentThread());
        }
    }
}

