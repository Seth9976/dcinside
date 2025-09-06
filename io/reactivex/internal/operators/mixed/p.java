package io.reactivex.internal.operators.mixed;

import e3.o;
import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class p extends B {
    static final class a extends AtomicInteger implements I, c {
        static final class io.reactivex.internal.operators.mixed.p.a.a extends AtomicReference implements v {
            final a a;
            volatile Object b;
            private static final long c = 0x6F9E30E36197FFC7L;

            io.reactivex.internal.operators.mixed.p.a.a(a p$a0) {
                this.a = p$a0;
            }

            void a() {
                d.b(this);
            }

            @Override  // io.reactivex.v
            public void b(c c0) {
                d.g(this, c0);
            }

            @Override  // io.reactivex.v
            public void onComplete() {
                this.a.e(this);
            }

            @Override  // io.reactivex.v
            public void onError(Throwable throwable0) {
                this.a.f(this, throwable0);
            }

            @Override  // io.reactivex.v
            public void onSuccess(Object object0) {
                this.b = object0;
                this.a.d();
            }
        }

        final I a;
        final o b;
        final boolean c;
        final io.reactivex.internal.util.c d;
        final AtomicReference e;
        c f;
        volatile boolean g;
        volatile boolean h;
        private static final long i = 0xB50790B94F8997BEL;
        static final io.reactivex.internal.operators.mixed.p.a.a j;

        static {
            a.j = new io.reactivex.internal.operators.mixed.p.a.a(null);
        }

        a(I i0, o o0, boolean z) {
            this.a = i0;
            this.b = o0;
            this.c = z;
            this.d = new io.reactivex.internal.util.c();
            this.e = new AtomicReference();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.h;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.f, c0)) {
                this.f = c0;
                this.a.b(this);
            }
        }

        void c() {
            io.reactivex.internal.operators.mixed.p.a.a p$a$a0 = (io.reactivex.internal.operators.mixed.p.a.a)this.e.getAndSet(a.j);
            if(p$a$a0 != null && p$a$a0 != a.j) {
                p$a$a0.a();
            }
        }

        void d() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            I i0 = this.a;
            io.reactivex.internal.util.c c0 = this.d;
            AtomicReference atomicReference0 = this.e;
            int v = 1;
            while(true) {
                if(this.h) {
                    return;
                }
                if(c0.get() != null && !this.c) {
                    i0.onError(c0.c());
                    return;
                }
                boolean z = this.g;
                io.reactivex.internal.operators.mixed.p.a.a p$a$a0 = (io.reactivex.internal.operators.mixed.p.a.a)atomicReference0.get();
                if(z && p$a$a0 == null) {
                    Throwable throwable0 = c0.c();
                    if(throwable0 != null) {
                        i0.onError(throwable0);
                        return;
                    }
                    i0.onComplete();
                    return;
                }
                if(p$a$a0 != null && p$a$a0.b != null) {
                    androidx.compose.animation.core.d.a(atomicReference0, p$a$a0, null);
                    i0.onNext(p$a$a0.b);
                }
                else {
                    v = this.addAndGet(-v);
                    if(v == 0) {
                        break;
                    }
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.h = true;
            this.f.dispose();
            this.c();
        }

        void e(io.reactivex.internal.operators.mixed.p.a.a p$a$a0) {
            if(androidx.compose.animation.core.d.a(this.e, p$a$a0, null)) {
                this.d();
            }
        }

        void f(io.reactivex.internal.operators.mixed.p.a.a p$a$a0, Throwable throwable0) {
            if(androidx.compose.animation.core.d.a(this.e, p$a$a0, null) && this.d.a(throwable0)) {
                if(!this.c) {
                    this.f.dispose();
                    this.c();
                }
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.g = true;
            this.d();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.d.a(throwable0)) {
                if(!this.c) {
                    this.c();
                }
                this.g = true;
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            y y0;
            io.reactivex.internal.operators.mixed.p.a.a p$a$a0 = (io.reactivex.internal.operators.mixed.p.a.a)this.e.get();
            if(p$a$a0 != null) {
                p$a$a0.a();
            }
            try {
                y0 = (y)b.g(this.b.apply(object0), "The mapper returned a null MaybeSource");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.f.dispose();
                this.e.getAndSet(a.j);
                this.onError(throwable0);
                return;
            }
            io.reactivex.internal.operators.mixed.p.a.a p$a$a1 = new io.reactivex.internal.operators.mixed.p.a.a(this);
            io.reactivex.internal.operators.mixed.p.a.a p$a$a2;
            while((p$a$a2 = (io.reactivex.internal.operators.mixed.p.a.a)this.e.get()) != a.j) {
                if(androidx.compose.animation.core.d.a(this.e, p$a$a2, p$a$a1)) {
                    y0.a(p$a$a1);
                    return;
                }
            }
        }
    }

    final B a;
    final o b;
    final boolean c;

    public p(B b0, o o0, boolean z) {
        this.a = b0;
        this.b = o0;
        this.c = z;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        if(!r.b(this.a, this.b, i0)) {
            a p$a0 = new a(i0, this.b, this.c);
            this.a.d(p$a0);
        }
    }
}

