package io.reactivex.internal.operators.observable;

import e3.o;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class n extends a {
    static final class io.reactivex.internal.operators.observable.n.a extends AtomicInteger implements I, c {
        static final class io.reactivex.internal.operators.observable.n.a.a extends AtomicReference implements I, c {
            final io.reactivex.internal.operators.observable.n.a a;
            private static final long b = 0x8A0EBA2505783C5AL;

            io.reactivex.internal.operators.observable.n.a.a(io.reactivex.internal.operators.observable.n.a n$a0) {
                this.a = n$a0;
            }

            @Override  // io.reactivex.disposables.c
            public boolean a() {
                return this.get() == d.a;
            }

            @Override  // io.reactivex.I
            public void b(c c0) {
                d.g(this, c0);
            }

            @Override  // io.reactivex.disposables.c
            public void dispose() {
                d.b(this);
            }

            @Override  // io.reactivex.I
            public void onComplete() {
                this.lazySet(d.a);
                this.a.g(this);
            }

            @Override  // io.reactivex.I
            public void onError(Throwable throwable0) {
                this.lazySet(d.a);
                this.a.c(this, throwable0);
            }

            @Override  // io.reactivex.I
            public void onNext(Object object0) {
                this.a.f(object0);
            }
        }

        final I a;
        final Callable b;
        final G c;
        final o d;
        final b e;
        final AtomicReference f;
        final io.reactivex.internal.util.c g;
        volatile boolean h;
        final io.reactivex.internal.queue.c i;
        volatile boolean j;
        long k;
        Map l;
        private static final long m = 0x8A813D2E91500BFCL;

        io.reactivex.internal.operators.observable.n.a(I i0, G g0, o o0, Callable callable0) {
            this.a = i0;
            this.b = callable0;
            this.c = g0;
            this.d = o0;
            this.i = new io.reactivex.internal.queue.c(0x80);
            this.e = new b();
            this.f = new AtomicReference();
            this.l = new LinkedHashMap();
            this.g = new io.reactivex.internal.util.c();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.f.get()));
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.g(this.f, c0)) {
                io.reactivex.internal.operators.observable.n.a.a n$a$a0 = new io.reactivex.internal.operators.observable.n.a.a(this);
                this.e.d(n$a$a0);
                this.c.d(n$a$a0);
            }
        }

        void c(c c0, Throwable throwable0) {
            d.b(this.f);
            this.e.c(c0);
            this.onError(throwable0);
        }

        void d(io.reactivex.internal.operators.observable.n.b n$b0, long v) {
            boolean z;
            this.e.c(n$b0);
            if(this.e.h() == 0) {
                d.b(this.f);
                z = true;
            }
            else {
                z = false;
            }
            synchronized(this) {
                Map map0 = this.l;
                if(map0 == null) {
                    return;
                }
                Object object0 = map0.remove(v);
                this.i.offer(object0);
            }
            if(z) {
                this.h = true;
            }
            this.e();
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(d.b(this.f)) {
                this.j = true;
                this.e.dispose();
                synchronized(this) {
                    this.l = null;
                }
                if(this.getAndIncrement() != 0) {
                    this.i.clear();
                }
            }
        }

        void e() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            I i0 = this.a;
            io.reactivex.internal.queue.c c0 = this.i;
            int v = 1;
            while(true) {
                if(this.j) {
                    c0.clear();
                    return;
                }
                boolean z = this.h;
                if(z && this.g.get() != null) {
                    c0.clear();
                    i0.onError(this.g.c());
                    return;
                }
                Collection collection0 = (Collection)c0.poll();
                if(z && collection0 == null) {
                    i0.onComplete();
                    return;
                }
                if(collection0 == null) {
                    v = this.addAndGet(-v);
                    if(v != 0) {
                        continue;
                    }
                    return;
                }
                i0.onNext(collection0);
            }
        }

        void f(Object object0) {
            G g0;
            Collection collection0;
            try {
                collection0 = (Collection)io.reactivex.internal.functions.b.g(this.b.call(), "The bufferSupplier returned a null Collection");
                g0 = (G)io.reactivex.internal.functions.b.g(this.d.apply(object0), "The bufferClose returned a null ObservableSource");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                d.b(this.f);
                this.onError(throwable0);
                return;
            }
            long v = this.k;
            this.k = v + 1L;
            synchronized(this) {
                Map map0 = this.l;
                if(map0 == null) {
                    return;
                }
                map0.put(v, collection0);
            }
            io.reactivex.internal.operators.observable.n.b n$b0 = new io.reactivex.internal.operators.observable.n.b(this, v);
            this.e.d(n$b0);
            g0.d(n$b0);
        }

        void g(io.reactivex.internal.operators.observable.n.a.a n$a$a0) {
            this.e.c(n$a$a0);
            if(this.e.h() == 0) {
                d.b(this.f);
                this.h = true;
                this.e();
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.e.dispose();
            synchronized(this) {
                Map map0 = this.l;
                if(map0 == null) {
                    return;
                }
                for(Object object0: map0.values()) {
                    this.i.offer(((Collection)object0));
                }
                this.l = null;
            }
            this.h = true;
            this.e();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.g.a(throwable0)) {
                this.e.dispose();
                synchronized(this) {
                    this.l = null;
                }
                this.h = true;
                this.e();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            synchronized(this) {
                Map map0 = this.l;
                if(map0 == null) {
                    return;
                }
                for(Object object1: map0.values()) {
                    ((Collection)object1).add(object0);
                }
            }
        }
    }

    static final class io.reactivex.internal.operators.observable.n.b extends AtomicReference implements I, c {
        final io.reactivex.internal.operators.observable.n.a a;
        final long b;
        private static final long c = 0x8A0EBA2505783C5AL;

        io.reactivex.internal.operators.observable.n.b(io.reactivex.internal.operators.observable.n.a n$a0, long v) {
            this.a = n$a0;
            this.b = v;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == d.a;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            d.g(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            Object object0 = this.get();
            d d0 = d.a;
            if(object0 != d0) {
                this.lazySet(d0);
                this.a.d(this, this.b);
            }
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            Object object0 = this.get();
            d d0 = d.a;
            if(object0 != d0) {
                this.lazySet(d0);
                this.a.c(this, throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            c c0 = (c)this.get();
            d d0 = d.a;
            if(c0 != d0) {
                this.lazySet(d0);
                c0.dispose();
                this.a.d(this, this.b);
            }
        }
    }

    final Callable b;
    final G c;
    final o d;

    public n(G g0, G g1, o o0, Callable callable0) {
        super(g0);
        this.c = g1;
        this.d = o0;
        this.b = callable0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.internal.operators.observable.n.a n$a0 = new io.reactivex.internal.operators.observable.n.a(i0, this.c, this.d, this.b);
        i0.b(n$a0);
        this.a.d(n$a0);
    }
}

