package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class k1 extends a {
    static final class io.reactivex.internal.operators.observable.k1.a extends AtomicInteger implements I, c {
        final I a;
        final long b;
        final TimeUnit c;
        final J d;
        final io.reactivex.internal.queue.c e;
        final boolean f;
        c g;
        volatile boolean h;
        volatile boolean i;
        Throwable j;
        private static final long k = -5677354903406201275L;

        io.reactivex.internal.operators.observable.k1.a(I i0, long v, TimeUnit timeUnit0, J j0, int v1, boolean z) {
            this.a = i0;
            this.b = v;
            this.c = timeUnit0;
            this.d = j0;
            this.e = new io.reactivex.internal.queue.c(v1);
            this.f = z;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.h;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.g, c0)) {
                this.g = c0;
                this.a.b(this);
            }
        }

        void c() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            I i0 = this.a;
            io.reactivex.internal.queue.c c0 = this.e;
            boolean z = this.f;
            TimeUnit timeUnit0 = this.c;
            J j0 = this.d;
            long v = this.b;
            int v1 = 1;
            while(true) {
                if(this.h) {
                    this.e.clear();
                    return;
                }
                boolean z1 = this.i;
                Long long0 = (Long)c0.peek();
                boolean z2 = long0 == null || ((long)long0) <= j0.e(timeUnit0) - v ? long0 == null : true;
                if(z1) {
                    if(!z) {
                        Throwable throwable1 = this.j;
                        if(throwable1 != null) {
                            this.e.clear();
                            i0.onError(throwable1);
                            return;
                        }
                        if(z2) {
                            i0.onComplete();
                            return;
                        }
                    }
                    else if(z2) {
                        Throwable throwable0 = this.j;
                        if(throwable0 != null) {
                            i0.onError(throwable0);
                            return;
                        }
                        i0.onComplete();
                        return;
                    }
                }
                if(z2) {
                    v1 = this.addAndGet(-v1);
                    if(v1 != 0) {
                        continue;
                    }
                    return;
                }
                c0.poll();
                i0.onNext(c0.poll());
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.h) {
                this.h = true;
                this.g.dispose();
                if(this.getAndIncrement() == 0) {
                    this.e.clear();
                }
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.i = true;
            this.c();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.j = throwable0;
            this.i = true;
            this.c();
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            Long long0 = this.d.e(this.c);
            this.e.j(long0, object0);
            this.c();
        }
    }

    final long b;
    final TimeUnit c;
    final J d;
    final int e;
    final boolean f;

    public k1(G g0, long v, TimeUnit timeUnit0, J j0, int v1, boolean z) {
        super(g0);
        this.b = v;
        this.c = timeUnit0;
        this.d = j0;
        this.e = v1;
        this.f = z;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.k1.a k1$a0 = new io.reactivex.internal.operators.observable.k1.a(i0, this.b, this.c, this.d, this.e, this.f);
        this.a.d(k1$a0);
    }
}

