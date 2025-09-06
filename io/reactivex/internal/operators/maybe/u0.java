package io.reactivex.internal.operators.maybe;

import e3.o;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class u0 extends s {
    final class a implements o {
        final u0 a;

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return b.g(u0.this.b.apply(new Object[]{object0}), "The zipper returned a null value");
        }
    }

    static final class io.reactivex.internal.operators.maybe.u0.b extends AtomicInteger implements c {
        final v a;
        final o b;
        final io.reactivex.internal.operators.maybe.u0.c[] c;
        final Object[] d;
        private static final long e = 0xB2E1D6EAC4FBD957L;

        io.reactivex.internal.operators.maybe.u0.b(v v0, int v1, o o0) {
            super(v1);
            this.a = v0;
            this.b = o0;
            io.reactivex.internal.operators.maybe.u0.c[] arr_u0$c = new io.reactivex.internal.operators.maybe.u0.c[v1];
            for(int v2 = 0; v2 < v1; ++v2) {
                arr_u0$c[v2] = new io.reactivex.internal.operators.maybe.u0.c(this, v2);
            }
            this.c = arr_u0$c;
            this.d = new Object[v1];
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() <= 0;
        }

        void b(int v) {
            io.reactivex.internal.operators.maybe.u0.c[] arr_u0$c = this.c;
            for(int v1 = 0; v1 < v; ++v1) {
                arr_u0$c[v1].a();
            }
            while(true) {
                ++v;
                if(v >= arr_u0$c.length) {
                    break;
                }
                arr_u0$c[v].a();
            }
        }

        void c(int v) {
            if(this.getAndSet(0) > 0) {
                this.b(v);
                this.a.onComplete();
            }
        }

        void d(Throwable throwable0, int v) {
            if(this.getAndSet(0) > 0) {
                this.b(v);
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.getAndSet(0) > 0) {
                io.reactivex.internal.operators.maybe.u0.c[] arr_u0$c = this.c;
                for(int v = 0; v < arr_u0$c.length; ++v) {
                    arr_u0$c[v].a();
                }
            }
        }

        void e(Object object0, int v) {
            Object object1;
            this.d[v] = object0;
            if(this.decrementAndGet() == 0) {
                try {
                    object1 = b.g(this.b.apply(this.d), "The zipper returned a null value");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.a.onError(throwable0);
                    return;
                }
                this.a.onSuccess(object1);
            }
        }
    }

    static final class io.reactivex.internal.operators.maybe.u0.c extends AtomicReference implements v {
        final io.reactivex.internal.operators.maybe.u0.b a;
        final int b;
        private static final long c = 0x2E204F2D0E121106L;

        io.reactivex.internal.operators.maybe.u0.c(io.reactivex.internal.operators.maybe.u0.b u0$b0, int v) {
            this.a = u0$b0;
            this.b = v;
        }

        public void a() {
            d.b(this);
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            d.g(this, c0);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.a.c(this.b);
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.a.d(throwable0, this.b);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.a.e(object0, this.b);
        }
    }

    final y[] a;
    final o b;

    public u0(y[] arr_y, o o0) {
        this.a = arr_y;
        this.b = o0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        y[] arr_y = this.a;
        if(arr_y.length == 1) {
            arr_y[0].a(new io.reactivex.internal.operators.maybe.W.a(v0, new a(this)));
            return;
        }
        io.reactivex.internal.operators.maybe.u0.b u0$b0 = new io.reactivex.internal.operators.maybe.u0.b(v0, arr_y.length, this.b);
        v0.b(u0$b0);
        for(int v1 = 0; true; ++v1) {
            if(v1 >= arr_y.length || u0$b0.a()) {
                return;
            }
            y y0 = arr_y[v1];
            if(y0 == null) {
                u0$b0.d(new NullPointerException("One of the sources is null"), v1);
                return;
            }
            y0.a(u0$b0.c[v1]);
        }
    }
}

