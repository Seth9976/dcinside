package io.reactivex.internal.observers;

import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.util.k;
import java.util.concurrent.CountDownLatch;

public abstract class e extends CountDownLatch implements I, c {
    Object a;
    Throwable b;
    c c;
    volatile boolean d;

    public e() {
        super(1);
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        return this.d;
    }

    @Override  // io.reactivex.I
    public final void b(c c0) {
        this.c = c0;
        if(this.d) {
            c0.dispose();
        }
    }

    public final Object c() {
        if(this.getCount() != 0L) {
            try {
                io.reactivex.internal.util.e.b();
                this.await();
            }
            catch(InterruptedException interruptedException0) {
                this.dispose();
                throw k.f(interruptedException0);
            }
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw k.f(throwable0);
        }
        return this.a;
    }

    @Override  // io.reactivex.disposables.c
    public final void dispose() {
        this.d = true;
        c c0 = this.c;
        if(c0 != null) {
            c0.dispose();
        }
    }

    @Override  // io.reactivex.I
    public final void onComplete() {
        this.countDown();
    }
}

