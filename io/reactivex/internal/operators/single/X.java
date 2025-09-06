package io.reactivex.internal.operators.single;

import e3.o;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicReference;

public final class x extends K {
    static final class a extends AtomicReference implements N, c {
        static final class io.reactivex.internal.operators.single.x.a.a implements N {
            final AtomicReference a;
            final N b;

            io.reactivex.internal.operators.single.x.a.a(AtomicReference atomicReference0, N n0) {
                this.a = atomicReference0;
                this.b = n0;
            }

            @Override  // io.reactivex.N
            public void b(c c0) {
                d.d(this.a, c0);
            }

            @Override  // io.reactivex.N
            public void onError(Throwable throwable0) {
                this.b.onError(throwable0);
            }

            @Override  // io.reactivex.N
            public void onSuccess(Object object0) {
                this.b.onSuccess(object0);
            }
        }

        final N a;
        final o b;
        private static final long c = 3258103020495908596L;

        a(N n0, o o0) {
            this.a = n0;
            this.b = o0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.N
        public void b(c c0) {
            if(d.g(this, c0)) {
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            Q q0;
            try {
                q0 = (Q)b.g(this.b.apply(object0), "The single returned by the mapper is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            if(!this.a()) {
                q0.e(new io.reactivex.internal.operators.single.x.a.a(this, this.a));
            }
        }
    }

    final Q a;
    final o b;

    public x(Q q0, o o0) {
        this.b = o0;
        this.a = q0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a x$a0 = new a(n0, this.b);
        this.a.e(x$a0);
    }
}

