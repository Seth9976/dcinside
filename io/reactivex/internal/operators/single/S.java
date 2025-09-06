package io.reactivex.internal.operators.single;

import e3.g;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.e;

public final class s extends K {
    static final class a implements N {
        final N a;
        final g b;
        boolean c;

        a(N n0, g g0) {
            this.a = n0;
            this.b = g0;
        }

        @Override  // io.reactivex.N
        public void b(c c0) {
            try {
                this.b.accept(c0);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.c = true;
                c0.dispose();
                e.m(throwable0, this.a);
                return;
            }
            this.a.b(c0);
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            if(this.c) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            if(this.c) {
                return;
            }
            this.a.onSuccess(object0);
        }
    }

    final Q a;
    final g b;

    public s(Q q0, g g0) {
        this.a = q0;
        this.b = g0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a s$a0 = new a(n0, this.b);
        this.a.e(s$a0);
    }
}

