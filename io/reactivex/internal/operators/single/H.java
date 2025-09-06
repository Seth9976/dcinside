package io.reactivex.internal.operators.single;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.observers.z;
import java.util.concurrent.atomic.AtomicReference;

public final class h extends K {
    static final class a extends AtomicReference implements I, c {
        final N a;
        final Q b;
        boolean c;
        private static final long d = 0x892208164F72DE58L;

        a(N n0, Q q0) {
            this.a = n0;
            this.b = q0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.f(this, c0)) {
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(this.c) {
                return;
            }
            this.c = true;
            z z0 = new z(this, this.a);
            this.b.e(z0);
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.c) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.c = true;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            ((c)this.get()).dispose();
            this.onComplete();
        }
    }

    final Q a;
    final G b;

    public h(Q q0, G g0) {
        this.a = q0;
        this.b = g0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a h$a0 = new a(n0, this.a);
        this.b.d(h$a0);
    }
}

