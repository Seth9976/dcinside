package io.reactivex.internal.operators.parallel;

import e3.c;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class n extends l {
    static final class a extends AtomicReference implements q {
        final b a;
        final c b;
        Object c;
        boolean d;
        private static final long e = 0x919C231384E0BE23L;

        a(b n$b0, c c0) {
            this.a = n$b0;
            this.b = c0;
        }

        void a() {
            j.a(this);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.i(this, e0, 0x7FFFFFFFFFFFFFFFL);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(!this.d) {
                this.d = true;
                this.a.p(this.c);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.d) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.d = true;
            this.a.c(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(!this.d) {
                try {
                    Object object1 = this.c;
                    if(object1 == null) {
                        this.c = object0;
                        return;
                    }
                    this.c = io.reactivex.internal.functions.b.g(this.b.apply(object1, object0), "The reducer returned a null value");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    ((e)this.get()).cancel();
                    this.onError(throwable0);
                }
            }
        }
    }

    static final class b extends f {
        final a[] m;
        final c n;
        final AtomicReference o;
        final AtomicInteger p;
        final AtomicReference q;
        private static final long r = -5370107872170712765L;

        b(d d0, int v, c c0) {
            super(d0);
            this.o = new AtomicReference();
            this.p = new AtomicInteger();
            this.q = new AtomicReference();
            a[] arr_n$a = new a[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_n$a[v1] = new a(this, c0);
            }
            this.m = arr_n$a;
            this.n = c0;
            this.p.lazySet(v);
        }

        void c(Throwable throwable0) {
            if(androidx.compose.animation.core.d.a(this.q, null, throwable0)) {
                this.cancel();
                this.b.onError(throwable0);
                return;
            }
            if(throwable0 != this.q.get()) {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // io.reactivex.internal.subscriptions.f
        public void cancel() {
            a[] arr_n$a = this.m;
            for(int v = 0; v < arr_n$a.length; ++v) {
                arr_n$a[v].a();
            }
        }

        io.reactivex.internal.operators.parallel.n.c o(Object object0) {
            io.reactivex.internal.operators.parallel.n.c n$c0;
            while(true) {
                n$c0 = (io.reactivex.internal.operators.parallel.n.c)this.o.get();
                if(n$c0 == null) {
                    n$c0 = new io.reactivex.internal.operators.parallel.n.c();
                    if(androidx.compose.animation.core.d.a(this.o, null, n$c0)) {
                        goto label_4;
                    }
                }
                else {
                label_4:
                    int v = n$c0.b();
                    if(v >= 0) {
                        break;
                    }
                    androidx.compose.animation.core.d.a(this.o, n$c0, null);
                }
            }
            if(v == 0) {
                n$c0.a = object0;
            }
            else {
                n$c0.b = object0;
            }
            if(n$c0.a()) {
                androidx.compose.animation.core.d.a(this.o, n$c0, null);
                return n$c0;
            }
            return null;
        }

        void p(Object object0) {
            if(object0 != null) {
                io.reactivex.internal.operators.parallel.n.c n$c0;
                while((n$c0 = this.o(object0)) != null) {
                    try {
                        object0 = io.reactivex.internal.functions.b.g(this.n.apply(n$c0.a, n$c0.b), "The reducer returned a null value");
                    }
                    catch(Throwable throwable0) {
                        io.reactivex.exceptions.b.b(throwable0);
                        this.c(throwable0);
                        return;
                    }
                }
            }
            if(this.p.decrementAndGet() == 0) {
                io.reactivex.internal.operators.parallel.n.c n$c1 = (io.reactivex.internal.operators.parallel.n.c)this.o.get();
                this.o.lazySet(null);
                if(n$c1 != null) {
                    this.a(n$c1.a);
                    return;
                }
                this.b.onComplete();
            }
        }
    }

    static final class io.reactivex.internal.operators.parallel.n.c extends AtomicInteger {
        Object a;
        Object b;
        final AtomicInteger c;
        private static final long d = 0x693E266F84553F6L;

        io.reactivex.internal.operators.parallel.n.c() {
            this.c = new AtomicInteger();
        }

        boolean a() {
            return this.c.incrementAndGet() == 2;
        }

        int b() {
            int v;
            do {
                v = this.get();
                if(v >= 2) {
                    return -1;
                }
            }
            while(!this.compareAndSet(v, v + 1));
            return v;
        }
    }

    final io.reactivex.parallel.b b;
    final c c;

    public n(io.reactivex.parallel.b b0, c c0) {
        this.b = b0;
        this.c = c0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        b n$b0 = new b(d0, this.b.F(), this.c);
        d0.g(n$b0);
        this.b.Q(n$b0.m);
    }
}

