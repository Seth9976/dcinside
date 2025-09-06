package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class n extends a {
    static final class io.reactivex.internal.operators.flowable.n.a extends AtomicInteger implements q, e {
        static final class io.reactivex.internal.operators.flowable.n.a.a extends AtomicReference implements c, q {
            final io.reactivex.internal.operators.flowable.n.a a;
            private static final long b = 0x8A0EBA2505783C5AL;

            io.reactivex.internal.operators.flowable.n.a.a(io.reactivex.internal.operators.flowable.n.a n$a0) {
                this.a = n$a0;
            }

            @Override  // io.reactivex.disposables.c
            public boolean a() {
                return this.get() == j.a;
            }

            @Override  // io.reactivex.disposables.c
            public void dispose() {
                j.a(this);
            }

            @Override  // io.reactivex.q
            public void g(e e0) {
                j.i(this, e0, 0x7FFFFFFFFFFFFFFFL);
            }

            @Override  // org.reactivestreams.d
            public void onComplete() {
                this.lazySet(j.a);
                this.a.e(this);
            }

            @Override  // org.reactivestreams.d
            public void onError(Throwable throwable0) {
                this.lazySet(j.a);
                this.a.a(this, throwable0);
            }

            @Override  // org.reactivestreams.d
            public void onNext(Object object0) {
                this.a.d(object0);
            }
        }

        final d a;
        final Callable b;
        final org.reactivestreams.c c;
        final o d;
        final b e;
        final AtomicLong f;
        final AtomicReference g;
        final io.reactivex.internal.util.c h;
        volatile boolean i;
        final io.reactivex.internal.queue.c j;
        volatile boolean k;
        long l;
        Map m;
        long n;
        private static final long o = 0x8A813D2E91500BFCL;

        io.reactivex.internal.operators.flowable.n.a(d d0, org.reactivestreams.c c0, o o0, Callable callable0) {
            this.a = d0;
            this.b = callable0;
            this.c = c0;
            this.d = o0;
            this.j = new io.reactivex.internal.queue.c(0x80);
            this.e = new b();
            this.f = new AtomicLong();
            this.g = new AtomicReference();
            this.m = new LinkedHashMap();
            this.h = new io.reactivex.internal.util.c();
        }

        void a(c c0, Throwable throwable0) {
            j.a(this.g);
            this.e.c(c0);
            this.onError(throwable0);
        }

        void b(io.reactivex.internal.operators.flowable.n.b n$b0, long v) {
            boolean z;
            this.e.c(n$b0);
            if(this.e.h() == 0) {
                j.a(this.g);
                z = true;
            }
            else {
                z = false;
            }
            synchronized(this) {
                Map map0 = this.m;
                if(map0 == null) {
                    return;
                }
                Object object0 = map0.remove(v);
                this.j.offer(object0);
            }
            if(z) {
                this.i = true;
            }
            this.c();
        }

        void c() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            long v = this.n;
            d d0 = this.a;
            io.reactivex.internal.queue.c c0 = this.j;
            int v1 = 1;
            do {
                long v2 = this.f.get();
                int v3;
                while((v3 = Long.compare(v, v2)) != 0) {
                    if(this.k) {
                        c0.clear();
                        return;
                    }
                    boolean z = this.i;
                    if(z && this.h.get() != null) {
                        c0.clear();
                        d0.onError(this.h.c());
                        return;
                    }
                    Collection collection0 = (Collection)c0.poll();
                    if(z && collection0 == null) {
                        d0.onComplete();
                        return;
                    }
                    if(collection0 == null) {
                        break;
                    }
                    d0.onNext(collection0);
                    ++v;
                }
                if(v3 == 0) {
                    if(this.k) {
                        c0.clear();
                        return;
                    }
                    if(this.i) {
                        if(this.h.get() != null) {
                            c0.clear();
                            d0.onError(this.h.c());
                            return;
                        }
                        if(c0.isEmpty()) {
                            d0.onComplete();
                            return;
                        }
                    }
                }
                this.n = v;
                v1 = this.addAndGet(-v1);
            }
            while(v1 != 0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(j.a(this.g)) {
                this.k = true;
                this.e.dispose();
                synchronized(this) {
                    this.m = null;
                }
                if(this.getAndIncrement() != 0) {
                    this.j.clear();
                }
            }
        }

        void d(Object object0) {
            org.reactivestreams.c c0;
            Collection collection0;
            try {
                collection0 = (Collection)io.reactivex.internal.functions.b.g(this.b.call(), "The bufferSupplier returned a null Collection");
                c0 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.d.apply(object0), "The bufferClose returned a null Publisher");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                j.a(this.g);
                this.onError(throwable0);
                return;
            }
            long v = this.l;
            this.l = v + 1L;
            synchronized(this) {
                Map map0 = this.m;
                if(map0 == null) {
                    return;
                }
                map0.put(v, collection0);
            }
            io.reactivex.internal.operators.flowable.n.b n$b0 = new io.reactivex.internal.operators.flowable.n.b(this, v);
            this.e.d(n$b0);
            c0.e(n$b0);
        }

        void e(io.reactivex.internal.operators.flowable.n.a.a n$a$a0) {
            this.e.c(n$a$a0);
            if(this.e.h() == 0) {
                j.a(this.g);
                this.i = true;
                this.c();
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.h(this.g, e0)) {
                io.reactivex.internal.operators.flowable.n.a.a n$a$a0 = new io.reactivex.internal.operators.flowable.n.a.a(this);
                this.e.d(n$a$a0);
                this.c.e(n$a$a0);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.e.dispose();
            synchronized(this) {
                Map map0 = this.m;
                if(map0 == null) {
                    return;
                }
                for(Object object0: map0.values()) {
                    this.j.offer(((Collection)object0));
                }
                this.m = null;
            }
            this.i = true;
            this.c();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.h.a(throwable0)) {
                this.e.dispose();
                synchronized(this) {
                    this.m = null;
                }
                this.i = true;
                this.c();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            synchronized(this) {
                Map map0 = this.m;
                if(map0 == null) {
                    return;
                }
                for(Object object1: map0.values()) {
                    ((Collection)object1).add(object0);
                }
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            io.reactivex.internal.util.d.a(this.f, v);
            this.c();
        }
    }

    static final class io.reactivex.internal.operators.flowable.n.b extends AtomicReference implements c, q {
        final io.reactivex.internal.operators.flowable.n.a a;
        final long b;
        private static final long c = 0x8A0EBA2505783C5AL;

        io.reactivex.internal.operators.flowable.n.b(io.reactivex.internal.operators.flowable.n.a n$a0, long v) {
            this.a = n$a0;
            this.b = v;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == j.a;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            j.a(this);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.i(this, e0, 0x7FFFFFFFFFFFFFFFL);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            Object object0 = this.get();
            j j0 = j.a;
            if(object0 != j0) {
                this.lazySet(j0);
                this.a.b(this, this.b);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            Object object0 = this.get();
            j j0 = j.a;
            if(object0 != j0) {
                this.lazySet(j0);
                this.a.a(this, throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            e e0 = (e)this.get();
            j j0 = j.a;
            if(e0 != j0) {
                this.lazySet(j0);
                e0.cancel();
                this.a.b(this, this.b);
            }
        }
    }

    final Callable c;
    final org.reactivestreams.c d;
    final o e;

    public n(l l0, org.reactivestreams.c c0, o o0, Callable callable0) {
        super(l0);
        this.d = c0;
        this.e = o0;
        this.c = callable0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.n.a n$a0 = new io.reactivex.internal.operators.flowable.n.a(d0, this.d, this.e, this.c);
        d0.g(n$a0);
        this.b.l6(n$a0);
    }
}

