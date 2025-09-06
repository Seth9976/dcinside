package io.reactivex.internal.operators.maybe;

import e3.d;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class v extends K {
    static final class a extends AtomicInteger implements c {
        final N a;
        final b b;
        final b c;
        final d d;

        a(N n0, d d0) {
            super(2);
            this.a = n0;
            this.d = d0;
            this.b = new b(this);
            this.c = new b(this);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return io.reactivex.internal.disposables.d.c(((c)this.b.get()));
        }

        void b() {
            boolean z;
            if(this.decrementAndGet() == 0) {
                Object object0 = this.b.b;
                Object object1 = this.c.b;
                if(object0 != null && object1 != null) {
                    try {
                        z = this.d.a(object0, object1);
                    }
                    catch(Throwable throwable0) {
                        io.reactivex.exceptions.b.b(throwable0);
                        this.a.onError(throwable0);
                        return;
                    }
                    this.a.onSuccess(Boolean.valueOf(z));
                    return;
                }
                this.a.onSuccess(Boolean.valueOf(object0 == null && object1 == null));
            }
        }

        void c(b v$b0, Throwable throwable0) {
            if(this.getAndSet(0) > 0) {
                b v$b1 = this.b;
                if(v$b0 == v$b1) {
                    this.c.a();
                }
                else {
                    v$b1.a();
                }
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        void d(y y0, y y1) {
            y0.a(this.b);
            y1.a(this.c);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.b.a();
            this.c.a();
        }
    }

    static final class b extends AtomicReference implements io.reactivex.v {
        final a a;
        Object b;
        private static final long c = -3031974433025990931L;

        b(a v$a0) {
            this.a = v$a0;
        }

        public void a() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            io.reactivex.internal.disposables.d.g(this, c0);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.a.b();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.a.c(this, throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.b = object0;
            this.a.b();
        }
    }

    final y a;
    final y b;
    final d c;

    public v(y y0, y y1, d d0) {
        this.a = y0;
        this.b = y1;
        this.c = d0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a v$a0 = new a(n0, this.c);
        n0.b(v$a0);
        v$a0.d(this.a, this.b);
    }
}

