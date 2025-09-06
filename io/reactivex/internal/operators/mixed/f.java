package io.reactivex.internal.operators.mixed;

import e3.o;
import io.reactivex.c;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class f extends c {
    static final class a implements io.reactivex.disposables.c, q {
        static final class io.reactivex.internal.operators.mixed.f.a.a extends AtomicReference implements io.reactivex.f {
            final a a;
            private static final long b = -8003404460084760287L;

            io.reactivex.internal.operators.mixed.f.a.a(a f$a0) {
                this.a = f$a0;
            }

            void a() {
                d.b(this);
            }

            @Override  // io.reactivex.f
            public void b(io.reactivex.disposables.c c0) {
                d.g(this, c0);
            }

            @Override  // io.reactivex.f
            public void onComplete() {
                this.a.c(this);
            }

            @Override  // io.reactivex.f
            public void onError(Throwable throwable0) {
                this.a.d(this, throwable0);
            }
        }

        final io.reactivex.f a;
        final o b;
        final boolean c;
        final io.reactivex.internal.util.c d;
        final AtomicReference e;
        volatile boolean f;
        e g;
        static final io.reactivex.internal.operators.mixed.f.a.a h;

        static {
            a.h = new io.reactivex.internal.operators.mixed.f.a.a(null);
        }

        a(io.reactivex.f f0, o o0, boolean z) {
            this.a = f0;
            this.b = o0;
            this.c = z;
            this.d = new io.reactivex.internal.util.c();
            this.e = new AtomicReference();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.e.get() == a.h;
        }

        void b() {
            io.reactivex.internal.operators.mixed.f.a.a f$a$a0 = (io.reactivex.internal.operators.mixed.f.a.a)this.e.getAndSet(a.h);
            if(f$a$a0 != null && f$a$a0 != a.h) {
                f$a$a0.a();
            }
        }

        void c(io.reactivex.internal.operators.mixed.f.a.a f$a$a0) {
            if(androidx.compose.animation.core.d.a(this.e, f$a$a0, null) && this.f) {
                Throwable throwable0 = this.d.c();
                if(throwable0 == null) {
                    this.a.onComplete();
                    return;
                }
                this.a.onError(throwable0);
            }
        }

        void d(io.reactivex.internal.operators.mixed.f.a.a f$a$a0, Throwable throwable0) {
            if(androidx.compose.animation.core.d.a(this.e, f$a$a0, null) && this.d.a(throwable0)) {
                if(!this.c) {
                    this.dispose();
                    Throwable throwable2 = this.d.c();
                    if(throwable2 != k.a) {
                        this.a.onError(throwable2);
                    }
                }
                else if(this.f) {
                    Throwable throwable1 = this.d.c();
                    this.a.onError(throwable1);
                    return;
                }
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.g.cancel();
            this.b();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.g, e0)) {
                this.g = e0;
                this.a.b(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.f = true;
            if(this.e.get() == null) {
                Throwable throwable0 = this.d.c();
                if(throwable0 == null) {
                    this.a.onComplete();
                    return;
                }
                this.a.onError(throwable0);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.d.a(throwable0)) {
                if(this.c) {
                    this.onComplete();
                    return;
                }
                this.b();
                Throwable throwable1 = this.d.c();
                if(throwable1 != k.a) {
                    this.a.onError(throwable1);
                }
            }
            else {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            i i0;
            try {
                i0 = (i)b.g(this.b.apply(object0), "The mapper returned a null CompletableSource");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.g.cancel();
                this.onError(throwable0);
                return;
            }
            io.reactivex.internal.operators.mixed.f.a.a f$a$a0 = new io.reactivex.internal.operators.mixed.f.a.a(this);
            io.reactivex.internal.operators.mixed.f.a.a f$a$a1;
            while((f$a$a1 = (io.reactivex.internal.operators.mixed.f.a.a)this.e.get()) != a.h) {
                if(androidx.compose.animation.core.d.a(this.e, f$a$a1, f$a$a0)) {
                    if(f$a$a1 != null) {
                        f$a$a1.a();
                    }
                    i0.e(f$a$a0);
                    return;
                }
            }
        }
    }

    final l a;
    final o b;
    final boolean c;

    public f(l l0, o o0, boolean z) {
        this.a = l0;
        this.b = o0;
        this.c = z;
    }

    @Override  // io.reactivex.c
    protected void J0(io.reactivex.f f0) {
        a f$a0 = new a(f0, this.b, this.c);
        this.a.l6(f$a0);
    }
}

