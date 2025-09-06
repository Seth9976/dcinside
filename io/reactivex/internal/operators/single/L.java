package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;

public final class l extends K {
    static final class a implements N, c {
        N a;
        c b;

        a(N n0) {
            this.a = n0;
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
            this.a = null;
            this.b.dispose();
            this.b = d.a;
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            this.b = d.a;
            N n0 = this.a;
            if(n0 != null) {
                this.a = null;
                n0.onError(throwable0);
            }
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            this.b = d.a;
            N n0 = this.a;
            if(n0 != null) {
                this.a = null;
                n0.onSuccess(object0);
            }
        }
    }

    final Q a;

    public l(Q q0) {
        this.a = q0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a l$a0 = new a(n0);
        this.a.e(l$a0);
    }
}

