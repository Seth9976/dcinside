package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class n extends a {
    static final class io.reactivex.internal.operators.maybe.n.a extends AtomicReference implements v {
        final v a;
        private static final long b = 706635022205076709L;

        io.reactivex.internal.operators.maybe.n.a(v v0) {
            this.a = v0;
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            d.g(this, c0);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.a.onSuccess(object0);
        }
    }

    static final class b implements c, q {
        final io.reactivex.internal.operators.maybe.n.a a;
        y b;
        e c;

        b(v v0, y y0) {
            this.a = new io.reactivex.internal.operators.maybe.n.a(v0);
            this.b = y0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.a.get()));
        }

        void b() {
            y y0 = this.b;
            this.b = null;
            y0.a(this.a);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.cancel();
            this.c = j.a;
            d.b(this.a);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.c, e0)) {
                this.c = e0;
                this.a.a.b(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            j j0 = j.a;
            if(this.c != j0) {
                this.c = j0;
                this.b();
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            j j0 = j.a;
            if(this.c != j0) {
                this.c = j0;
                this.a.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            e e0 = this.c;
            j j0 = j.a;
            if(e0 != j0) {
                e0.cancel();
                this.c = j0;
                this.b();
            }
        }
    }

    final org.reactivestreams.c b;

    public n(y y0, org.reactivestreams.c c0) {
        super(y0);
        this.b = c0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        b n$b0 = new b(v0, this.a);
        this.b.e(n$b0);
    }
}

