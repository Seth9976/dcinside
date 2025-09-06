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

public final class v0 extends l {
    static final class a extends AtomicLong implements Runnable, e {
        final d a;
        final long b;
        long c;
        final AtomicReference d;
        private static final long e = 0xD902BD31A5E97959L;

        a(d d0, long v, long v1) {
            this.d = new AtomicReference();
            this.a = d0;
            this.c = v;
            this.b = v1;
        }

        public void a(c c0) {
            io.reactivex.internal.disposables.d.g(this.d, c0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            io.reactivex.internal.disposables.d.b(this.d);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this, v);
            }
        }

        @Override
        public void run() {
            Object object0 = this.d.get();
            io.reactivex.internal.disposables.d d0 = io.reactivex.internal.disposables.d.a;
            if(object0 != d0) {
                long v = this.get();
                if(v == 0L) {
                    io.reactivex.exceptions.c c0 = new io.reactivex.exceptions.c("Can\'t deliver value " + this.c + " due to lack of requests");
                    this.a.onError(c0);
                    io.reactivex.internal.disposables.d.b(this.d);
                }
                else {
                    long v1 = this.c;
                    this.a.onNext(v1);
                    if(v1 == this.b) {
                        if(this.d.get() != d0) {
                            this.a.onComplete();
                        }
                        io.reactivex.internal.disposables.d.b(this.d);
                        return;
                    }
                    this.c = v1 + 1L;
                    if(v != 0x7FFFFFFFFFFFFFFFL) {
                        this.decrementAndGet();
                    }
                }
            }
        }
    }

    final J b;
    final long c;
    final long d;
    final long e;
    final long f;
    final TimeUnit g;

    public v0(long v, long v1, long v2, long v3, TimeUnit timeUnit0, J j0) {
        this.e = v2;
        this.f = v3;
        this.g = timeUnit0;
        this.b = j0;
        this.c = v;
        this.d = v1;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        a v0$a0 = new a(d0, this.c, this.d);
        d0.g(v0$a0);
        J j0 = this.b;
        if(j0 instanceof s) {
            io.reactivex.J.c j$c0 = j0.d();
            v0$a0.a(j$c0);
            j$c0.e(v0$a0, this.e, this.f, this.g);
            return;
        }
        v0$a0.a(j0.h(v0$a0, this.e, this.f, this.g));
    }
}

