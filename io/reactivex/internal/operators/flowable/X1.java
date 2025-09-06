package io.reactivex.internal.operators.flowable;

import io.reactivex.J;
import io.reactivex.internal.queue.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class x1 extends a {
    static final class io.reactivex.internal.operators.flowable.x1.a extends AtomicInteger implements q, e {
        final d a;
        final long b;
        final TimeUnit c;
        final J d;
        final c e;
        final boolean f;
        e g;
        final AtomicLong h;
        volatile boolean i;
        volatile boolean j;
        Throwable k;
        private static final long l = -5677354903406201275L;

        io.reactivex.internal.operators.flowable.x1.a(d d0, long v, TimeUnit timeUnit0, J j0, int v1, boolean z) {
            this.h = new AtomicLong();
            this.a = d0;
            this.b = v;
            this.c = timeUnit0;
            this.d = j0;
            this.e = new c(v1);
            this.f = z;
        }

        boolean a(boolean z, boolean z1, d d0, boolean z2) {
            if(this.i) {
                this.e.clear();
                return true;
            }
            if(z) {
                if(!z2) {
                    Throwable throwable1 = this.k;
                    if(throwable1 != null) {
                        this.e.clear();
                        d0.onError(throwable1);
                        return true;
                    }
                    if(z1) {
                        d0.onComplete();
                        return true;
                    }
                }
                else if(z1) {
                    Throwable throwable0 = this.k;
                    if(throwable0 != null) {
                        d0.onError(throwable0);
                        return true;
                    }
                    d0.onComplete();
                    return true;
                }
            }
            return false;
        }

        void b() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            d d0 = this.a;
            c c0 = this.e;
            boolean z = this.f;
            TimeUnit timeUnit0 = this.c;
            J j0 = this.d;
            long v = this.b;
            int v1 = 1;
            do {
                long v2 = this.h.get();
                long v3;
                for(v3 = 0L; v3 != v2; ++v3) {
                    boolean z1 = this.j;
                    Long long0 = (Long)c0.peek();
                    boolean z2 = long0 == null;
                    boolean z3 = z2 || ((long)long0) <= j0.e(timeUnit0) - v ? z2 : true;
                    if(this.a(z1, z3, d0, z)) {
                        return;
                    }
                    if(z3) {
                        break;
                    }
                    c0.poll();
                    d0.onNext(c0.poll());
                }
                if(v3 != 0L) {
                    io.reactivex.internal.util.d.e(this.h, v3);
                }
                v1 = this.addAndGet(-v1);
            }
            while(v1 != 0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.i) {
                this.i = true;
                this.g.cancel();
                if(this.getAndIncrement() == 0) {
                    this.e.clear();
                }
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.g, e0)) {
                this.g = e0;
                this.a.g(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.j = true;
            this.b();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.k = throwable0;
            this.j = true;
            this.b();
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Long long0 = this.d.e(this.c);
            this.e.j(long0, object0);
            this.b();
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.h, v);
                this.b();
            }
        }
    }

    final long c;
    final TimeUnit d;
    final J e;
    final int f;
    final boolean g;

    public x1(l l0, long v, TimeUnit timeUnit0, J j0, int v1, boolean z) {
        super(l0);
        this.c = v;
        this.d = timeUnit0;
        this.e = j0;
        this.f = v1;
        this.g = z;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.x1.a x1$a0 = new io.reactivex.internal.operators.flowable.x1.a(d0, this.c, this.d, this.e, this.f, this.g);
        this.b.l6(x1$a0);
    }
}

