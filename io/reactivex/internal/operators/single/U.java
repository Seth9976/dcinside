package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;

public final class u extends K {
    final class a implements N {
        final N a;
        final u b;

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
                u.this.b.run();
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                throwable0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
            }
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            try {
                u.this.b.run();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            this.a.onSuccess(object0);
        }
    }

    final Q a;
    final e3.a b;

    public u(Q q0, e3.a a0) {
        this.a = q0;
        this.b = a0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a u$a0 = new a(this, n0);
        this.a.e(u$a0);
    }
}

