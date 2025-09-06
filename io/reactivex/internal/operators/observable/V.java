package io.reactivex.internal.operators.observable;

import e3.o;
import f3.j;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.observers.m;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class v extends a {
    static final class io.reactivex.internal.operators.observable.v.a extends AtomicInteger implements I, c {
        static final class io.reactivex.internal.operators.observable.v.a.a extends AtomicReference implements I {
            final I a;
            final io.reactivex.internal.operators.observable.v.a b;
            private static final long c = 0x245CA3BDFB16B82CL;

            io.reactivex.internal.operators.observable.v.a.a(I i0, io.reactivex.internal.operators.observable.v.a v$a0) {
                this.a = i0;
                this.b = v$a0;
            }

            void a() {
                d.b(this);
            }

            @Override  // io.reactivex.I
            public void b(c c0) {
                d.d(this, c0);
            }

            @Override  // io.reactivex.I
            public void onComplete() {
                this.b.i = false;
                this.b.c();
            }

            @Override  // io.reactivex.I
            public void onError(Throwable throwable0) {
                io.reactivex.internal.operators.observable.v.a v$a0 = this.b;
                if(v$a0.d.a(throwable0)) {
                    if(!v$a0.f) {
                        v$a0.h.dispose();
                    }
                    v$a0.i = false;
                    v$a0.c();
                    return;
                }
                io.reactivex.plugins.a.Y(throwable0);
            }

            @Override  // io.reactivex.I
            public void onNext(Object object0) {
                this.a.onNext(object0);
            }
        }

        final I a;
        final o b;
        final int c;
        final io.reactivex.internal.util.c d;
        final io.reactivex.internal.operators.observable.v.a.a e;
        final boolean f;
        f3.o g;
        c h;
        volatile boolean i;
        volatile boolean j;
        volatile boolean k;
        int l;
        private static final long m = 0x9F88BB6078833019L;

        io.reactivex.internal.operators.observable.v.a(I i0, o o0, int v, boolean z) {
            this.a = i0;
            this.b = o0;
            this.c = v;
            this.f = z;
            this.d = new io.reactivex.internal.util.c();
            this.e = new io.reactivex.internal.operators.observable.v.a.a(i0, this);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.k;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.h, c0)) {
                this.h = c0;
                if(c0 instanceof j) {
                    int v = ((j)c0).i(3);
                    if(v == 1) {
                        this.l = 1;
                        this.g = (j)c0;
                        this.j = true;
                        this.a.b(this);
                        this.c();
                        return;
                    }
                    if(v == 2) {
                        this.l = 2;
                        this.g = (j)c0;
                        this.a.b(this);
                        return;
                    }
                }
                this.g = new io.reactivex.internal.queue.c(this.c);
                this.a.b(this);
            }
        }

        void c() {
            Object object1;
            G g0;
            Object object0;
            if(this.getAndIncrement() != 0) {
                return;
            }
            I i0 = this.a;
            f3.o o0 = this.g;
            io.reactivex.internal.util.c c0 = this.d;
            while(true) {
                if(!this.i) {
                    if(this.k) {
                        o0.clear();
                        return;
                    }
                    if(!this.f && ((Throwable)c0.get()) != null) {
                        o0.clear();
                        this.k = true;
                        i0.onError(c0.c());
                        return;
                    }
                    try {
                        boolean z = this.j;
                        object0 = o0.poll();
                    }
                    catch(Throwable throwable0) {
                        b.b(throwable0);
                        this.k = true;
                        this.h.dispose();
                        c0.a(throwable0);
                        i0.onError(c0.c());
                        return;
                    }
                    if(z && object0 == null) {
                        this.k = true;
                        Throwable throwable1 = c0.c();
                        if(throwable1 != null) {
                            i0.onError(throwable1);
                            return;
                        }
                        i0.onComplete();
                        return;
                    }
                    if(object0 != null) {
                        try {
                            g0 = (G)io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null ObservableSource");
                        }
                        catch(Throwable throwable2) {
                            b.b(throwable2);
                            this.k = true;
                            this.h.dispose();
                            o0.clear();
                            c0.a(throwable2);
                            i0.onError(c0.c());
                            return;
                        }
                        if(g0 instanceof Callable) {
                            try {
                                object1 = ((Callable)g0).call();
                                if(object1 == null || this.k) {
                                    continue;
                                }
                            }
                            catch(Throwable throwable3) {
                                b.b(throwable3);
                                c0.a(throwable3);
                                continue;
                            }
                            i0.onNext(object1);
                            continue;
                        }
                        else {
                            this.i = true;
                            g0.d(this.e);
                        }
                    }
                }
                if(this.decrementAndGet() == 0) {
                    break;
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.k = true;
            this.h.dispose();
            this.e.a();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.j = true;
            this.c();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.d.a(throwable0)) {
                this.j = true;
                this.c();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.l == 0) {
                this.g.offer(object0);
            }
            this.c();
        }
    }

    static final class io.reactivex.internal.operators.observable.v.b extends AtomicInteger implements I, c {
        static final class io.reactivex.internal.operators.observable.v.b.a extends AtomicReference implements I {
            final I a;
            final io.reactivex.internal.operators.observable.v.b b;
            private static final long c = 0x989F8DABFE7FF127L;

            io.reactivex.internal.operators.observable.v.b.a(I i0, io.reactivex.internal.operators.observable.v.b v$b0) {
                this.a = i0;
                this.b = v$b0;
            }

            void a() {
                d.b(this);
            }

            @Override  // io.reactivex.I
            public void b(c c0) {
                d.d(this, c0);
            }

            @Override  // io.reactivex.I
            public void onComplete() {
                this.b.d();
            }

            @Override  // io.reactivex.I
            public void onError(Throwable throwable0) {
                this.b.dispose();
                this.a.onError(throwable0);
            }

            @Override  // io.reactivex.I
            public void onNext(Object object0) {
                this.a.onNext(object0);
            }
        }

        final I a;
        final o b;
        final io.reactivex.internal.operators.observable.v.b.a c;
        final int d;
        f3.o e;
        c f;
        volatile boolean g;
        volatile boolean h;
        volatile boolean i;
        int j;
        private static final long k = 0x7A85719C209CA572L;

        io.reactivex.internal.operators.observable.v.b(I i0, o o0, int v) {
            this.a = i0;
            this.b = o0;
            this.d = v;
            this.c = new io.reactivex.internal.operators.observable.v.b.a(i0, this);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.h;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.f, c0)) {
                this.f = c0;
                if(c0 instanceof j) {
                    int v = ((j)c0).i(3);
                    if(v == 1) {
                        this.j = 1;
                        this.e = (j)c0;
                        this.i = true;
                        this.a.b(this);
                        this.c();
                        return;
                    }
                    if(v == 2) {
                        this.j = 2;
                        this.e = (j)c0;
                        this.a.b(this);
                        return;
                    }
                }
                this.e = new io.reactivex.internal.queue.c(this.d);
                this.a.b(this);
            }
        }

        void c() {
            G g0;
            Object object0;
            if(this.getAndIncrement() != 0) {
                return;
            }
            do {
                if(this.h) {
                    this.e.clear();
                    return;
                }
                if(!this.g) {
                    try {
                        boolean z = this.i;
                        object0 = this.e.poll();
                    }
                    catch(Throwable throwable0) {
                        b.b(throwable0);
                        this.dispose();
                        this.e.clear();
                        this.a.onError(throwable0);
                        return;
                    }
                    if(z && object0 == null) {
                        this.h = true;
                        this.a.onComplete();
                        return;
                    }
                    if(object0 != null) {
                        try {
                            g0 = (G)io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null ObservableSource");
                        }
                        catch(Throwable throwable1) {
                            b.b(throwable1);
                            this.dispose();
                            this.e.clear();
                            this.a.onError(throwable1);
                            return;
                        }
                        this.g = true;
                        g0.d(this.c);
                    }
                }
            }
            while(this.decrementAndGet() != 0);
        }

        void d() {
            this.g = false;
            this.c();
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.h = true;
            this.c.a();
            this.f.dispose();
            if(this.getAndIncrement() == 0) {
                this.e.clear();
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(this.i) {
                return;
            }
            this.i = true;
            this.c();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.i) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.i = true;
            this.dispose();
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.i) {
                return;
            }
            if(this.j == 0) {
                this.e.offer(object0);
            }
            this.c();
        }
    }

    final o b;
    final int c;
    final io.reactivex.internal.util.j d;

    public v(G g0, o o0, int v, io.reactivex.internal.util.j j0) {
        super(g0);
        this.b = o0;
        this.d = j0;
        this.c = Math.max(8, v);
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        if(a1.b(this.a, i0, this.b)) {
            return;
        }
        if(this.d == io.reactivex.internal.util.j.a) {
            io.reactivex.internal.operators.observable.v.b v$b0 = new io.reactivex.internal.operators.observable.v.b(new m(i0), this.b, this.c);
            this.a.d(v$b0);
            return;
        }
        this.a.d(new io.reactivex.internal.operators.observable.v.a(i0, this.b, this.c, this.d == io.reactivex.internal.util.j.c));
    }
}

