package io.reactivex.internal.operators.flowable;

import e3.o;
import f3.b;
import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class c0 extends c implements b {
    static final class a extends AtomicInteger implements io.reactivex.disposables.c, q {
        final class io.reactivex.internal.operators.flowable.c0.a.a extends AtomicReference implements io.reactivex.disposables.c, f {
            final a a;
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
                a.this.b(this);
            }

            @Override  // io.reactivex.f
            public void onError(Throwable throwable0) {
                a.this.c(this, throwable0);
            }
        }

        final f a;
        final io.reactivex.internal.util.c b;
        final o c;
        final boolean d;
        final io.reactivex.disposables.b e;
        final int f;
        e g;
        volatile boolean h;
        private static final long i = 0x752C1CE874ED53BFL;

        a(f f0, o o0, boolean z, int v) {
            this.a = f0;
            this.c = o0;
            this.d = z;
            this.b = new io.reactivex.internal.util.c();
            this.e = new io.reactivex.disposables.b();
            this.f = v;
            this.lazySet(1);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.e.a();
        }

        void b(io.reactivex.internal.operators.flowable.c0.a.a c0$a$a0) {
            this.e.c(c0$a$a0);
            this.onComplete();
        }

        void c(io.reactivex.internal.operators.flowable.c0.a.a c0$a$a0, Throwable throwable0) {
            this.e.c(c0$a$a0);
            this.onError(throwable0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.h = true;
            this.g.cancel();
            this.e.dispose();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.g, e0)) {
                this.g = e0;
                this.a.b(this);
                int v = this.f;
                if(v == 0x7FFFFFFF) {
                    e0.request(0x7FFFFFFFFFFFFFFFL);
                    return;
                }
                e0.request(((long)v));
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.decrementAndGet() == 0) {
                Throwable throwable0 = this.b.c();
                if(throwable0 != null) {
                    this.a.onError(throwable0);
                    return;
                }
                this.a.onComplete();
                return;
            }
            if(this.f != 0x7FFFFFFF) {
                this.g.request(1L);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(!this.b.a(throwable0)) {
                io.reactivex.plugins.a.Y(throwable0);
            }
            else if(this.d) {
                if(this.decrementAndGet() == 0) {
                    Throwable throwable1 = this.b.c();
                    this.a.onError(throwable1);
                    return;
                }
                if(this.f != 0x7FFFFFFF) {
                    this.g.request(1L);
                }
            }
            else {
                this.dispose();
                if(this.getAndSet(0) > 0) {
                    Throwable throwable2 = this.b.c();
                    this.a.onError(throwable2);
                }
            }
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            i i0;
            try {
                i0 = (i)io.reactivex.internal.functions.b.g(this.c.apply(object0), "The mapper returned a null CompletableSource");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.g.cancel();
                this.onError(throwable0);
                return;
            }
            this.getAndIncrement();
            io.reactivex.internal.operators.flowable.c0.a.a c0$a$a0 = new io.reactivex.internal.operators.flowable.c0.a.a(this);
            if(!this.h && this.e.d(c0$a$a0)) {
                i0.e(c0$a$a0);
            }
        }
    }

    final l a;
    final o b;
    final int c;
    final boolean d;

    public c0(l l0, o o0, boolean z, int v) {
        this.a = l0;
        this.b = o0;
        this.d = z;
        this.c = v;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a c0$a0 = new a(f0, this.b, this.d, this.c);
        this.a.l6(c0$a0);
    }

    @Override  // f3.b
    public l d() {
        return io.reactivex.plugins.a.P(new b0(this.a, this.b, this.d, this.c));
    }
}

