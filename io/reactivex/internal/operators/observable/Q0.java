package io.reactivex.internal.operators.observable;

import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.schedulers.s;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class q0 extends B {
    static final class a extends AtomicReference implements c, Runnable {
        final I a;
        long b;
        private static final long c = 0x4CFFCF692D13B6FL;

        a(I i0) {
            this.a = i0;
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
            if(this.get() != d.a) {
                long v = this.b;
                this.b = v + 1L;
                this.a.onNext(v);
            }
        }
    }

    final J a;
    final long b;
    final long c;
    final TimeUnit d;

    public q0(long v, long v1, TimeUnit timeUnit0, J j0) {
        this.b = v;
        this.c = v1;
        this.d = timeUnit0;
        this.a = j0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        a q0$a0 = new a(i0);
        i0.b(q0$a0);
        J j0 = this.a;
        if(j0 instanceof s) {
            io.reactivex.J.c j$c0 = j0.d();
            q0$a0.b(j$c0);
            j$c0.e(q0$a0, this.b, this.c, this.d);
            return;
        }
        q0$a0.b(j0.h(q0$a0, this.b, this.c, this.d));
    }
}

