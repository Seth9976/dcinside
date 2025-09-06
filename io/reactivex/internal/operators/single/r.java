package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;

public final class r extends K {
    final class a implements N {
        private final N a;
        final r b;

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
                r.this.b.accept(null, throwable0);
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
                r.this.b.accept(object0, null);
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
    final e3.b b;

    public r(Q q0, e3.b b0) {
        this.a = q0;
        this.b = b0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a r$a0 = new a(this, n0);
        this.a.e(r$a0);
    }
}

