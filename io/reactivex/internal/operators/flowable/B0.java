package io.reactivex.internal.operators.flowable;

import d3.g;
import e3.o;
import io.reactivex.disposables.b;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.subscriptions.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class b0 extends a {
    static final class io.reactivex.internal.operators.flowable.b0.a extends c implements q {
        final class io.reactivex.internal.operators.flowable.b0.a.a extends AtomicReference implements io.reactivex.disposables.c, f {
            final io.reactivex.internal.operators.flowable.b0.a a;
            private static final long b = 0x77710B9F43210614L;

            @Override  // io.reactivex.disposables.c
            public boolean a() {
                return d.c(((io.reactivex.disposables.c)this.get()));
            }

            @Override  // io.reactivex.f
            public void b(io.reactivex.disposables.c c0) {
                d.g(this, c0);
            }

            @Override  // io.reactivex.disposables.c
            public void dispose() {
                d.b(this);
            }

            @Override  // io.reactivex.f
            public void onComplete() {
                io.reactivex.internal.operators.flowable.b0.a.this.a(this);
            }

            @Override  // io.reactivex.f
            public void onError(Throwable throwable0) {
                io.reactivex.internal.operators.flowable.b0.a.this.f(this, throwable0);
            }
        }

        final org.reactivestreams.d b;
        final io.reactivex.internal.util.c c;
        final o d;
        final boolean e;
        final b f;
        final int g;
        e h;
        volatile boolean i;
        private static final long j = 0x752C1CE874ED53BFL;

        io.reactivex.internal.operators.flowable.b0.a(org.reactivestreams.d d0, o o0, boolean z, int v) {
            this.b = d0;
            this.d = o0;
            this.e = z;
            this.c = new io.reactivex.internal.util.c();
            this.f = new b();
            this.g = v;
            this.lazySet(1);
        }

        void a(io.reactivex.internal.operators.flowable.b0.a.a b0$a$a0) {
            this.f.c(b0$a$a0);
            this.onComplete();
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.i = true;
            this.h.cancel();
            this.f.dispose();
        }

        @Override  // f3.o
        public void clear() {
        }

        void f(io.reactivex.internal.operators.flowable.b0.a.a b0$a$a0, Throwable throwable0) {
            this.f.c(b0$a$a0);
            this.onError(throwable0);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.h, e0)) {
                this.h = e0;
                this.b.g(this);
                int v = this.g;
                if(v == 0x7FFFFFFF) {
                    e0.request(0x7FFFFFFFFFFFFFFFL);
                    return;
                }
                e0.request(((long)v));
            }
        }

        @Override  // f3.k
        public int i(int v) {
            return v & 2;
        }

        @Override  // f3.o
        public boolean isEmpty() {
            return true;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.decrementAndGet() == 0) {
                Throwable throwable0 = this.c.c();
                if(throwable0 != null) {
                    this.b.onError(throwable0);
                    return;
                }
                this.b.onComplete();
                return;
            }
            if(this.g != 0x7FFFFFFF) {
                this.h.request(1L);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(!this.c.a(throwable0)) {
                io.reactivex.plugins.a.Y(throwable0);
            }
            else if(this.e) {
                if(this.decrementAndGet() == 0) {
                    Throwable throwable1 = this.c.c();
                    this.b.onError(throwable1);
                    return;
                }
                if(this.g != 0x7FFFFFFF) {
                    this.h.request(1L);
                }
            }
            else {
                this.cancel();
                if(this.getAndSet(0) > 0) {
                    Throwable throwable2 = this.c.c();
                    this.b.onError(throwable2);
                }
            }
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            i i0;
            try {
                i0 = (i)io.reactivex.internal.functions.b.g(this.d.apply(object0), "The mapper returned a null CompletableSource");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.h.cancel();
                this.onError(throwable0);
                return;
            }
            this.getAndIncrement();
            io.reactivex.internal.operators.flowable.b0.a.a b0$a$a0 = new io.reactivex.internal.operators.flowable.b0.a.a(this);
            if(!this.i && this.f.d(b0$a$a0)) {
                i0.e(b0$a$a0);
            }
        }

        @Override  // f3.o
        @g
        public Object poll() throws Exception {
            return null;
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
        }
    }

    final o c;
    final int d;
    final boolean e;

    public b0(l l0, o o0, boolean z, int v) {
        super(l0);
        this.c = o0;
        this.e = z;
        this.d = v;
    }

    @Override  // io.reactivex.l
    protected void m6(org.reactivestreams.d d0) {
        io.reactivex.internal.operators.flowable.b0.a b0$a0 = new io.reactivex.internal.operators.flowable.b0.a(d0, this.c, this.e, this.d);
        this.b.l6(b0$a0);
    }
}

