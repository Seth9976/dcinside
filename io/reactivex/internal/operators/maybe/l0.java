package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class l0 extends a {
    static final class io.reactivex.internal.operators.maybe.l0.a extends AtomicReference implements v {
        final v a;
        private static final long b = 8663801314800248617L;

        io.reactivex.internal.operators.maybe.l0.a(v v0) {
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

    static final class b extends AtomicReference implements c, v {
        final v a;
        final io.reactivex.internal.operators.maybe.l0.c b;
        final y c;
        final io.reactivex.internal.operators.maybe.l0.a d;
        private static final long e = 0xAD5A9003C1146489L;

        b(v v0, y y0) {
            this.a = v0;
            this.b = new io.reactivex.internal.operators.maybe.l0.c(this);
            this.c = y0;
            this.d = y0 == null ? null : new io.reactivex.internal.operators.maybe.l0.a(v0);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            d.g(this, c0);
        }

        public void c() {
            if(d.b(this)) {
                y y0 = this.c;
                if(y0 == null) {
                    TimeoutException timeoutException0 = new TimeoutException();
                    this.a.onError(timeoutException0);
                    return;
                }
                y0.a(this.d);
            }
        }

        public void d(Throwable throwable0) {
            if(d.b(this)) {
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
            j.a(this.b);
            io.reactivex.internal.operators.maybe.l0.a l0$a0 = this.d;
            if(l0$a0 != null) {
                d.b(l0$a0);
            }
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            j.a(this.b);
            if(this.getAndSet(d.a) != d.a) {
                this.a.onComplete();
            }
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            j.a(this.b);
            if(this.getAndSet(d.a) != d.a) {
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            j.a(this.b);
            if(this.getAndSet(d.a) != d.a) {
                this.a.onSuccess(object0);
            }
        }
    }

    static final class io.reactivex.internal.operators.maybe.l0.c extends AtomicReference implements q {
        final b a;
        private static final long b = 8663801314800248617L;

        io.reactivex.internal.operators.maybe.l0.c(b l0$b0) {
            this.a = l0$b0;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.i(this, e0, 0x7FFFFFFFFFFFFFFFL);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a.c();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.d(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            ((e)this.get()).cancel();
            this.a.c();
        }
    }

    final org.reactivestreams.c b;
    final y c;

    public l0(y y0, org.reactivestreams.c c0, y y1) {
        super(y0);
        this.b = c0;
        this.c = y1;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        b l0$b0 = new b(v0, this.c);
        v0.b(l0$b0);
        this.b.e(l0$b0.b);
        this.a.a(l0$b0);
    }
}

