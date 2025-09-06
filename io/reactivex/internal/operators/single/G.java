package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.observers.z;
import java.util.concurrent.atomic.AtomicReference;

public final class g extends K {
    static final class a extends AtomicReference implements c, f {
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

        @Override  // io.reactivex.f
        public void b(c c0) {
            if(d.g(this, c0)) {
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.f
        public void onComplete() {
            z z0 = new z(this, this.a);
            this.b.e(z0);
        }

        @Override  // io.reactivex.f
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }
    }

    final Q a;
    final i b;

    public g(Q q0, i i0) {
        this.a = q0;
        this.b = i0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a g$a0 = new a(n0, this.a);
        this.b.e(g$a0);
    }
}

