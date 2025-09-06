package io.reactivex.internal.operators.maybe;

import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.s;
import io.reactivex.v;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class m0 extends s {
    static final class a extends AtomicReference implements c, Runnable {
        final v a;
        private static final long b = 2875964065294031672L;

        a(v v0) {
            this.a = v0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        void b(c c0) {
            d.d(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override
        public void run() {
            this.a.onSuccess(0L);
        }
    }

    final long a;
    final TimeUnit b;
    final J c;

    public m0(long v, TimeUnit timeUnit0, J j0) {
        this.a = v;
        this.b = timeUnit0;
        this.c = j0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        a m0$a0 = new a(v0);
        v0.b(m0$a0);
        m0$a0.b(this.c.g(m0$a0, this.a, this.b));
    }
}

