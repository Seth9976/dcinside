package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicInteger;

public final class o extends K {
    static final class a extends AtomicInteger implements N, c {
        final N a;
        final e3.a b;
        c c;
        private static final long d = 0x3907BA0B13897E3DL;

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

        void c() {
            if(this.compareAndSet(0, 1)) {
                try {
                    this.b.run();
                }
                catch(Throwable throwable0) {
                    b.b(throwable0);
                    io.reactivex.plugins.a.Y(throwable0);
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
            this.c();
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

    public o(Q q0, e3.a a0) {
        this.a = q0;
        this.b = a0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a o$a0 = new a(n0, this.b);
        this.a.e(o$a0);
    }
}

