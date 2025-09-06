package io.reactivex.internal.operators.maybe;

import f3.f;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class h0 extends K implements f {
    static final class a extends AtomicReference implements c, v {
        static final class io.reactivex.internal.operators.maybe.h0.a.a implements N {
            final N a;
            final AtomicReference b;

            io.reactivex.internal.operators.maybe.h0.a.a(N n0, AtomicReference atomicReference0) {
                this.a = n0;
                this.b = atomicReference0;
            }

            @Override  // io.reactivex.N
            public void b(c c0) {
                d.g(this.b, c0);
            }

            @Override  // io.reactivex.N
            public void onError(Throwable throwable0) {
                this.a.onError(throwable0);
            }

            @Override  // io.reactivex.N
            public void onSuccess(Object object0) {
                this.a.onSuccess(object0);
            }
        }

        final N a;
        final Q b;
        private static final long c = 0x3FE4688D997527B3L;

        a(N n0, Q q0) {
            this.a = n0;
            this.b = q0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(d.g(this, c0)) {
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            c c0 = (c)this.get();
            if(c0 != d.a && this.compareAndSet(c0, null)) {
                io.reactivex.internal.operators.maybe.h0.a.a h0$a$a0 = new io.reactivex.internal.operators.maybe.h0.a.a(this.a, this);
                this.b.e(h0$a$a0);
            }
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.a.onSuccess(object0);
        }
    }

    final y a;
    final Q b;

    public h0(y y0, Q q0) {
        this.a = y0;
        this.b = q0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a h0$a0 = new a(n0, this.b);
        this.a.a(h0$a0);
    }

    @Override  // f3.f
    public y source() {
        return this.a;
    }
}

