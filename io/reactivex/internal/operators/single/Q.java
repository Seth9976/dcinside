package io.reactivex.internal.operators.single;

import e3.g;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;

public final class q extends K {
    final class a implements N {
        private final N a;
        final q b;

        a(N n0) {
            this.a = n0;
        }

        @Override  // io.reactivex.N
        public void b(c c0) {
            this.a.b(c0);
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            try {
                q.this.b.accept(throwable0);
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                throwable0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
            }
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            this.a.onSuccess(object0);
        }
    }

    final Q a;
    final g b;

    public q(Q q0, g g0) {
        this.a = q0;
        this.b = g0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a q$a0 = new a(this, n0);
        this.a.e(q$a0);
    }
}

