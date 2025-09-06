package io.reactivex.internal.operators.single;

import e3.d;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.exceptions.b;

public final class c extends K {
    final class a implements N {
        private final N a;
        final c b;

        a(N n0) {
            this.a = n0;
        }

        @Override  // io.reactivex.N
        public void b(io.reactivex.disposables.c c0) {
            this.a.b(c0);
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            boolean z;
            try {
                z = c.this.c.a(object0, c.this.b);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            this.a.onSuccess(Boolean.valueOf(z));
        }
    }

    final Q a;
    final Object b;
    final d c;

    public c(Q q0, Object object0, d d0) {
        this.a = q0;
        this.b = object0;
        this.c = d0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a c$a0 = new a(this, n0);
        this.a.e(c$a0);
    }
}

