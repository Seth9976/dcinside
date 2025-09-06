package io.reactivex.internal.operators.single;

import e3.g;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;

public final class m extends K {
    static final class a implements N, c {
        final N a;
        final g b;
        c c;

        a(N n0, g g0) {
            this.a = n0;
            this.b = g0;
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

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            this.a.onSuccess(object0);
            try {
                this.b.accept(object0);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                io.reactivex.plugins.a.Y(throwable0);
            }
        }
    }

    final Q a;
    final g b;

    public m(Q q0, g g0) {
        this.a = q0;
        this.b = g0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a m$a0 = new a(n0, this.b);
        this.a.e(m$a0);
    }
}

