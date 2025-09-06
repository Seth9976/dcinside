package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.observers.z;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class i extends K {
    static final class a extends AtomicReference implements c, q {
        final N a;
        final Q b;
        boolean c;
        e d;
        private static final long e = 0x892208164F72DE58L;

        a(N n0, Q q0) {
            this.a = n0;
            this.b = q0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.d.cancel();
            d.b(this);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.d, e0)) {
                this.d = e0;
                this.a.b(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.c) {
                return;
            }
            this.c = true;
            z z0 = new z(this, this.a);
            this.b.e(z0);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.c) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.c = true;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.d.cancel();
            this.onComplete();
        }
    }

    final Q a;
    final org.reactivestreams.c b;

    public i(Q q0, org.reactivestreams.c c0) {
        this.a = q0;
        this.b = c0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a i$a0 = new a(n0, this.a);
        this.b.e(i$a0);
    }
}

