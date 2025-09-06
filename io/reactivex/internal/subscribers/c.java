package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import io.reactivex.q;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.e;

public abstract class c extends CountDownLatch implements q {
    Object a;
    Throwable b;
    e c;
    volatile boolean d;

    public c() {
        super(1);
    }

    public final Object a() {
        if(this.getCount() != 0L) {
            try {
                io.reactivex.internal.util.e.b();
                this.await();
            }
            catch(InterruptedException interruptedException0) {
                e e0 = this.c;
                this.c = j.a;
                if(e0 != null) {
                    e0.cancel();
                }
                throw k.f(interruptedException0);
            }
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw k.f(throwable0);
        }
        return this.a;
    }

    @Override  // io.reactivex.q
    public final void g(e e0) {
        if(j.k(this.c, e0)) {
            this.c = e0;
            if(!this.d) {
                e0.request(0x7FFFFFFFFFFFFFFFL);
                if(this.d) {
                    this.c = j.a;
                    e0.cancel();
                }
            }
        }
    }

    @Override  // org.reactivestreams.d
    public final void onComplete() {
        this.countDown();
    }
}

