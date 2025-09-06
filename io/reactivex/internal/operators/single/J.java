package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.observers.z;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends K {
    static final class a extends AtomicReference implements N, c {
        final N a;
        final Q b;
        private static final long c = 0x892208164F72DE58L;

        a(N n0, Q q0) {
            this.a = n0;
            this.b = q0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.N
        public void b(c c0) {
            if(d.g(this, c0)) {
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            z z0 = new z(this, this.a);
            this.b.e(z0);
        }
    }

    final Q a;
    final Q b;

    public j(Q q0, Q q1) {
        this.a = q0;
        this.b = q1;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a j$a0 = new a(n0, this.a);
        this.b.e(j$a0);
    }
}

