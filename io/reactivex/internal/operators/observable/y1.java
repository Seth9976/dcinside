package io.reactivex.internal.operators.observable;

import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class y1 extends a {
    static final class io.reactivex.internal.operators.observable.y1.a extends AtomicInteger implements I, c, Runnable {
        final I a;
        final long b;
        final TimeUnit c;
        final io.reactivex.J.c d;
        final boolean e;
        final AtomicReference f;
        c g;
        volatile boolean h;
        Throwable i;
        volatile boolean j;
        volatile boolean k;
        boolean l;
        private static final long m = 0x8CDC3D32432535EAL;

        io.reactivex.internal.operators.observable.y1.a(I i0, long v, TimeUnit timeUnit0, io.reactivex.J.c j$c0, boolean z) {
            this.a = i0;
            this.b = v;
            this.c = timeUnit0;
            this.d = j$c0;
            this.e = z;
            this.f = new AtomicReference();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.j;
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
            AtomicReference atomicReference0 = this.f;
            I i0 = this.a;
            int v = 1;
            while(true) {
                if(this.j) {
                    atomicReference0.lazySet(null);
                    return;
                }
                boolean z = this.h;
                if(z && this.i != null) {
                    atomicReference0.lazySet(null);
                    i0.onError(this.i);
                    this.d.dispose();
                    return;
                }
                boolean z1 = atomicReference0.get() == null;
                if(z) {
                    Object object0 = atomicReference0.getAndSet(null);
                    if(!z1 && this.e) {
                        i0.onNext(object0);
                    }
                    i0.onComplete();
                    this.d.dispose();
                    return;
                }
                if(!z1) {
                    if(this.l && !this.k) {
                        goto label_28;
                    }
                }
                else if(this.k) {
                    this.l = false;
                    this.k = false;
                    goto label_28;
                }
                else {
                label_28:
                    v = this.addAndGet(-v);
                    if(v != 0) {
                        continue;
                    }
                    return;
                }
                i0.onNext(atomicReference0.getAndSet(null));
                this.k = false;
                this.l = true;
                this.d.d(this, this.b, this.c);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.j = true;
            this.g.dispose();
            this.d.dispose();
            if(this.getAndIncrement() == 0) {
                this.f.lazySet(null);
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.h = true;
            this.c();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.i = throwable0;
            this.h = true;
            this.c();
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.f.set(object0);
            this.c();
        }

        @Override
        public void run() {
            this.k = true;
            this.c();
        }
    }

    final long b;
    final TimeUnit c;
    final J d;
    final boolean e;

    public y1(B b0, long v, TimeUnit timeUnit0, J j0, boolean z) {
        super(b0);
        this.b = v;
        this.c = timeUnit0;
        this.d = j0;
        this.e = z;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.J.c j$c0 = this.d.d();
        io.reactivex.internal.operators.observable.y1.a y1$a0 = new io.reactivex.internal.operators.observable.y1.a(i0, this.b, this.c, j$c0, this.e);
        this.a.d(y1$a0);
    }
}

