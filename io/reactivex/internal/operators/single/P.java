package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;

public final class p extends K {
    static final class a extends AtomicReference implements N, c {
        final N a;
        c b;
        private static final long c = 0x88E0578D829B6E18L;

        a(N n0, e3.a a0) {
            this.a = n0;
            this.lazySet(a0);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.b.a();
        }

        @Override  // io.reactivex.N
        public void b(c c0) {
            if(d.i(this.b, c0)) {
                this.b = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            e3.a a0 = (e3.a)this.getAndSet(null);
            if(a0 != null) {
                try {
                    a0.run();
                }
                catch(Throwable throwable0) {
                    b.b(throwable0);
                    io.reactivex.plugins.a.Y(throwable0);
                }
                this.b.dispose();
            }
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

    final Q a;
    final e3.a b;

    public p(Q q0, e3.a a0) {
        this.a = q0;
        this.b = a0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a p$a0 = new a(n0, this.b);
        this.a.e(p$a0);
    }
}

