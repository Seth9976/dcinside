package io.reactivex.internal.operators.mixed;

import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.util.k;
import java.util.concurrent.atomic.AtomicReference;

public final class o extends c {
    static final class a implements I, io.reactivex.disposables.c {
        static final class io.reactivex.internal.operators.mixed.o.a.a extends AtomicReference implements f {
            final a a;
            private static final long b = -8003404460084760287L;

            io.reactivex.internal.operators.mixed.o.a.a(a o$a0) {
                this.a = o$a0;
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
                this.a.d(this);
            }

            @Override  // io.reactivex.f
            public void onError(Throwable throwable0) {
                this.a.e(this, throwable0);
            }
        }

        final f a;
        final e3.o b;
        final boolean c;
        final io.reactivex.internal.util.c d;
        final AtomicReference e;
        volatile boolean f;
        io.reactivex.disposables.c g;
        static final io.reactivex.internal.operators.mixed.o.a.a h;

        static {
            a.h = new io.reactivex.internal.operators.mixed.o.a.a(null);
        }

        a(f f0, e3.o o0, boolean z) {
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

        @Override  // io.reactivex.I
        public void b(io.reactivex.disposables.c c0) {
            if(d.i(this.g, c0)) {
                this.g = c0;
                this.a.b(this);
            }
        }

        void c() {
            io.reactivex.internal.operators.mixed.o.a.a o$a$a0 = (io.reactivex.internal.operators.mixed.o.a.a)this.e.getAndSet(a.h);
            if(o$a$a0 != null && o$a$a0 != a.h) {
                o$a$a0.a();
            }
        }

        void d(io.reactivex.internal.operators.mixed.o.a.a o$a$a0) {
            if(androidx.compose.animation.core.d.a(this.e, o$a$a0, null) && this.f) {
                Throwable throwable0 = this.d.c();
                if(throwable0 == null) {
                    this.a.onComplete();
                    return;
                }
                this.a.onError(throwable0);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.g.dispose();
            this.c();
        }

        void e(io.reactivex.internal.operators.mixed.o.a.a o$a$a0, Throwable throwable0) {
            if(androidx.compose.animation.core.d.a(this.e, o$a$a0, null) && this.d.a(throwable0)) {
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

        @Override  // io.reactivex.I
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

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.d.a(throwable0)) {
                if(this.c) {
                    this.onComplete();
                    return;
                }
                this.c();
                Throwable throwable1 = this.d.c();
                if(throwable1 != k.a) {
                    this.a.onError(throwable1);
                }
            }
            else {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            i i0;
            try {
                i0 = (i)b.g(this.b.apply(object0), "The mapper returned a null CompletableSource");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.g.dispose();
                this.onError(throwable0);
                return;
            }
            io.reactivex.internal.operators.mixed.o.a.a o$a$a0 = new io.reactivex.internal.operators.mixed.o.a.a(this);
            io.reactivex.internal.operators.mixed.o.a.a o$a$a1;
            while((o$a$a1 = (io.reactivex.internal.operators.mixed.o.a.a)this.e.get()) != a.h) {
                if(androidx.compose.animation.core.d.a(this.e, o$a$a1, o$a$a0)) {
                    if(o$a$a1 != null) {
                        o$a$a1.a();
                    }
                    i0.e(o$a$a0);
                    return;
                }
            }
        }
    }

    final B a;
    final e3.o b;
    final boolean c;

    public o(B b0, e3.o o0, boolean z) {
        this.a = b0;
        this.b = o0;
        this.c = z;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        if(!r.a(this.a, this.b, f0)) {
            a o$a0 = new a(f0, this.b, this.c);
            this.a.d(o$a0);
        }
    }
}

