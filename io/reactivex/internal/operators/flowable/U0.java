package io.reactivex.internal.operators.flowable;

import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.schedulers.s;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class u0 extends l {
    static final class a extends AtomicLong implements Runnable, e {
        final d a;
        long b;
        final AtomicReference c;
        private static final long d = 0xD902BD31A5E97959L;

        a(d d0) {
            this.c = new AtomicReference();
            this.a = d0;
        }

        public void a(c c0) {
            io.reactivex.internal.disposables.d.g(this.c, c0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            io.reactivex.internal.disposables.d.b(this.c);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this, v);
            }
        }

        @Override
        public void run() {
            if(this.c.get() != io.reactivex.internal.disposables.d.a) {
                if(this.get() != 0L) {
                    long v = this.b;
                    this.b = v + 1L;
                    this.a.onNext(v);
                    io.reactivex.internal.util.d.e(this, 1L);
                    return;
                }
                io.reactivex.exceptions.c c0 = new io.reactivex.exceptions.c("Can\'t deliver value " + this.b + " due to lack of requests");
                this.a.onError(c0);
                io.reactivex.internal.disposables.d.b(this.c);
            }
        }
    }

    final J b;
    final long c;
    final long d;
    final TimeUnit e;

    public u0(long v, long v1, TimeUnit timeUnit0, J j0) {
        this.c = v;
        this.d = v1;
        this.e = timeUnit0;
        this.b = j0;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        a u0$a0 = new a(d0);
        d0.g(u0$a0);
        J j0 = this.b;
        if(j0 instanceof s) {
            io.reactivex.J.c j$c0 = j0.d();
            u0$a0.a(j$c0);
            j$c0.e(u0$a0, this.c, this.d, this.e);
            return;
        }
        u0$a0.a(j0.h(u0$a0, this.c, this.d, this.e));
    }
}

