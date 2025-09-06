package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;

public final class n extends K {
    static final class a implements N, c {
        final N a;
        final e3.a b;
        c c;

        a(N n0, e3.a a0) {
            this.a = n0;
            this.b = a0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.a();
        }

        @Override  // io.reactivex.N
        public void b(c c0) {
            if(d.i(this.c, c0)) {
                this.c = c0;
                this.a.b(this);
            }
        }

        private void c() {
            try {
                this.b.run();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
            this.c();
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            this.a.onSuccess(object0);
            this.c();
        }
    }

    final Q a;
    final e3.a b;

    public n(Q q0, e3.a a0) {
        this.a = q0;
        this.b = a0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a n$a0 = new a(n0, this.b);
        this.a.e(n$a0);
    }
}

