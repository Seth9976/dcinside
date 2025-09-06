package io.reactivex.internal.operators.single;

import e3.g;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;

public final class t extends K {
    final class a implements N {
        final N a;
        final t b;

        a(N n0) {
            this.a = n0;
        }

        @Override  // io.reactivex.N
        public void b(c c0) {
            this.a.b(c0);
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            try {
                t.this.b.accept(object0);
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
    final g b;

    public t(Q q0, g g0) {
        this.a = q0;
        this.b = g0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a t$a0 = new a(this, n0);
        this.a.e(t$a0);
    }
}

