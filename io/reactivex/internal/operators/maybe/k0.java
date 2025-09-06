package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class k0 extends a {
    static final class io.reactivex.internal.operators.maybe.k0.a extends AtomicReference implements v {
        final v a;
        private static final long b = 8663801314800248617L;

        io.reactivex.internal.operators.maybe.k0.a(v v0) {
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
        final io.reactivex.internal.operators.maybe.k0.c b;
        final y c;
        final io.reactivex.internal.operators.maybe.k0.a d;
        private static final long e = 0xAD5A9003C1146489L;

        b(v v0, y y0) {
            this.a = v0;
            this.b = new io.reactivex.internal.operators.maybe.k0.c(this);
            this.c = y0;
            this.d = y0 == null ? null : new io.reactivex.internal.operators.maybe.k0.a(v0);
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
            d.b(this.b);
            io.reactivex.internal.operators.maybe.k0.a k0$a0 = this.d;
            if(k0$a0 != null) {
                d.b(k0$a0);
            }
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            d.b(this.b);
            if(this.getAndSet(d.a) != d.a) {
                this.a.onComplete();
            }
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            d.b(this.b);
            if(this.getAndSet(d.a) != d.a) {
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            d.b(this.b);
            if(this.getAndSet(d.a) != d.a) {
                this.a.onSuccess(object0);
            }
        }
    }

    static final class io.reactivex.internal.operators.maybe.k0.c extends AtomicReference implements v {
        final b a;
        private static final long b = 8663801314800248617L;

        io.reactivex.internal.operators.maybe.k0.c(b k0$b0) {
            this.a = k0$b0;
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            d.g(this, c0);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.a.c();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.a.d(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.a.c();
        }
    }

    final y b;
    final y c;

    public k0(y y0, y y1, y y2) {
        super(y0);
        this.b = y1;
        this.c = y2;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        b k0$b0 = new b(v0, this.c);
        v0.b(k0$b0);
        this.b.a(k0$b0.b);
        this.a.a(k0$b0);
    }
}

