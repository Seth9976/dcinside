package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class m extends a {
    static final class io.reactivex.internal.operators.maybe.m.a implements c, v {
        final b a;
        final org.reactivestreams.c b;
        c c;

        io.reactivex.internal.operators.maybe.m.a(v v0, org.reactivestreams.c c0) {
            this.a = new b(v0);
            this.b = c0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.a.get() == j.a;
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(d.i(this.c, c0)) {
                this.c = c0;
                this.a.a.b(this);
            }
        }

        void c() {
            this.b.e(this.a);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
            this.c = d.a;
            j.a(this.a);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.c = d.a;
            this.c();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.c = d.a;
            this.a.c = throwable0;
            this.c();
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.c = d.a;
            this.a.b = object0;
            this.c();
        }
    }

    static final class b extends AtomicReference implements q {
        final v a;
        Object b;
        Throwable c;
        private static final long d = -1215060610805418006L;

        b(v v0) {
            this.a = v0;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.i(this, e0, 0x7FFFFFFFFFFFFFFFL);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            Throwable throwable0 = this.c;
            if(throwable0 != null) {
                this.a.onError(throwable0);
                return;
            }
            Object object0 = this.b;
            if(object0 != null) {
                this.a.onSuccess(object0);
                return;
            }
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            Throwable throwable1 = this.c;
            if(throwable1 == null) {
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.exceptions.a a0 = new io.reactivex.exceptions.a(new Throwable[]{throwable1, throwable0});
            this.a.onError(a0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            e e0 = (e)this.get();
            j j0 = j.a;
            if(e0 != j0) {
                this.lazySet(j0);
                e0.cancel();
                this.onComplete();
            }
        }
    }

    final org.reactivestreams.c b;

    public m(y y0, org.reactivestreams.c c0) {
        super(y0);
        this.b = c0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.m.a m$a0 = new io.reactivex.internal.operators.maybe.m.a(v0, this.b);
        this.a.a(m$a0);
    }
}

