package io.reactivex.internal.operators.observable;

import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.schedulers.s;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class r0 extends B {
    static final class a extends AtomicReference implements c, Runnable {
        final I a;
        final long b;
        long c;
        private static final long d = 0x1A41427056E6124CL;

        a(I i0, long v, long v1) {
            this.a = i0;
            this.c = v;
            this.b = v1;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == d.a;
        }

        public void b(c c0) {
            d.g(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override
        public void run() {
            if(!this.a()) {
                long v = this.c;
                this.a.onNext(v);
                if(v == this.b) {
                    d.b(this);
                    this.a.onComplete();
                    return;
                }
                this.c = v + 1L;
            }
        }
    }

    final J a;
    final long b;
    final long c;
    final long d;
    final long e;
    final TimeUnit f;

    public r0(long v, long v1, long v2, long v3, TimeUnit timeUnit0, J j0) {
        this.d = v2;
        this.e = v3;
        this.f = timeUnit0;
        this.a = j0;
        this.b = v;
        this.c = v1;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        a r0$a0 = new a(i0, this.b, this.c);
        i0.b(r0$a0);
        J j0 = this.a;
        if(j0 instanceof s) {
            io.reactivex.J.c j$c0 = j0.d();
            r0$a0.b(j$c0);
            j$c0.e(r0$a0, this.d, this.e, this.f);
            return;
        }
        r0$a0.b(j0.h(r0$a0, this.d, this.e, this.f));
    }
}

