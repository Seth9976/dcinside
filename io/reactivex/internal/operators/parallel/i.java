package io.reactivex.internal.operators.parallel;

import f3.n;
import io.reactivex.internal.queue.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class i extends l {
    static final class a extends AtomicReference implements q {
        final c a;
        final int b;
        final int c;
        long d;
        volatile n e;
        private static final long f = 8410034718427740355L;

        a(c i$c0, int v) {
            this.a = i$c0;
            this.b = v;
            this.c = v - (v >> 2);
        }

        public boolean a() {
            return j.a(this);
        }

        n b() {
            n n0 = this.e;
            if(n0 == null) {
                n0 = new b(this.b);
                this.e = n0;
            }
            return n0;
        }

        public void c(long v) {
            long v1 = this.d + v;
            if(v1 >= ((long)this.c)) {
                this.d = 0L;
                ((e)this.get()).request(v1);
                return;
            }
            this.d = v1;
        }

        public void d() {
            long v = this.d + 1L;
            if(v == ((long)this.c)) {
                this.d = 0L;
                ((e)this.get()).request(v);
                return;
            }
            this.d = v;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.i(this, e0, ((long)this.b));
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a.d();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.e(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.a.f(this, object0);
        }
    }

    static final class io.reactivex.internal.operators.parallel.i.b extends c {
        private static final long h = 0x579A0F4F7E6BD483L;

        io.reactivex.internal.operators.parallel.i.b(d d0, int v, int v1) {
            super(d0, v, v1);
        }

        @Override  // io.reactivex.internal.operators.parallel.i$c
        void c() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            this.g();
        }

        @Override  // io.reactivex.internal.operators.parallel.i$c
        public void d() {
            this.f.decrementAndGet();
            this.c();
        }

        @Override  // io.reactivex.internal.operators.parallel.i$c
        public void e(Throwable throwable0) {
            if(this.c.compareAndSet(null, throwable0)) {
                this.a();
                this.c();
                return;
            }
            if(throwable0 != this.c.get()) {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // io.reactivex.internal.operators.parallel.i$c
        public void f(a i$a0, Object object0) {
            if(this.get() != 0 || !this.compareAndSet(0, 1)) {
                if(!i$a0.b().offer(object0)) {
                    this.a();
                    this.e(new io.reactivex.exceptions.c("Queue full?!"));
                    return;
                }
                if(this.getAndIncrement() != 0) {
                    return;
                }
            }
            else {
                if(this.d.get() != 0L) {
                    this.a.onNext(object0);
                    if(this.d.get() != 0x7FFFFFFFFFFFFFFFL) {
                        this.d.decrementAndGet();
                    }
                    i$a0.c(1L);
                }
                else if(!i$a0.b().offer(object0)) {
                    this.a();
                    io.reactivex.exceptions.c c0 = new io.reactivex.exceptions.c("Queue full?!");
                    if(this.c.compareAndSet(null, c0)) {
                        this.a.onError(c0);
                        return;
                    }
                    io.reactivex.plugins.a.Y(c0);
                    return;
                }
                if(this.decrementAndGet() == 0) {
                    return;
                }
            }
            this.g();
        }

        void g() {
            a[] arr_i$a = this.b;
            d d0 = this.a;
            int v = 1;
            while(true) {
                long v1 = this.d.get();
                long v2 = 0L;
            alab1:
                while(v2 != v1) {
                    if(this.e) {
                        this.b();
                        return;
                    }
                    Throwable throwable0 = (Throwable)this.c.get();
                    if(throwable0 != null) {
                        this.b();
                        d0.onError(throwable0);
                        return;
                    }
                    boolean z = this.f.get() == 0;
                    boolean z1 = true;
                    for(int v3 = 0; v3 < arr_i$a.length; ++v3) {
                        a i$a0 = arr_i$a[v3];
                        n n0 = i$a0.e;
                        if(n0 != null) {
                            Object object0 = n0.poll();
                            if(object0 != null) {
                                d0.onNext(object0);
                                i$a0.d();
                                ++v2;
                                if(v2 == v1) {
                                    break alab1;
                                }
                                else {
                                    z1 = false;
                                }
                            }
                        }
                    }
                    if(z && z1) {
                        d0.onComplete();
                        return;
                    }
                    if(z1) {
                        break;
                    }
                }
                if(v2 == v1) {
                    if(this.e) {
                        this.b();
                        return;
                    }
                    Throwable throwable1 = (Throwable)this.c.get();
                    if(throwable1 != null) {
                        this.b();
                        d0.onError(throwable1);
                        return;
                    }
                    boolean z2 = this.f.get() == 0;
                    int v4 = 0;
                    while(true) {
                        boolean z3 = true;
                        if(v4 < arr_i$a.length) {
                            n n1 = arr_i$a[v4].e;
                            if(n1 == null || n1.isEmpty()) {
                                ++v4;
                                continue;
                            }
                            else {
                                z3 = false;
                            }
                        }
                        break;
                    }
                    if(z2 && z3) {
                        d0.onComplete();
                        return;
                    }
                }
                if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                    this.d.addAndGet(-v2);
                }
                int v5 = this.get();
                if(v5 == v) {
                    v5 = this.addAndGet(-v);
                    if(v5 == 0) {
                        return;
                    }
                }
                v = v5;
            }
        }
    }

    static abstract class c extends AtomicInteger implements e {
        final d a;
        final a[] b;
        final io.reactivex.internal.util.c c;
        final AtomicLong d;
        volatile boolean e;
        final AtomicInteger f;
        private static final long g = 3100232009247827843L;

        c(d d0, int v, int v1) {
            this.c = new io.reactivex.internal.util.c();
            this.d = new AtomicLong();
            this.f = new AtomicInteger();
            this.a = d0;
            a[] arr_i$a = new a[v];
            for(int v2 = 0; v2 < v; ++v2) {
                arr_i$a[v2] = new a(this, v1);
            }
            this.b = arr_i$a;
            this.f.lazySet(v);
        }

        void a() {
            a[] arr_i$a = this.b;
            for(int v = 0; v < arr_i$a.length; ++v) {
                arr_i$a[v].a();
            }
        }

        void b() {
            a[] arr_i$a = this.b;
            for(int v = 0; v < arr_i$a.length; ++v) {
                arr_i$a[v].e = null;
            }
        }

        abstract void c();

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.e) {
                this.e = true;
                this.a();
                if(this.getAndIncrement() == 0) {
                    this.b();
                }
            }
        }

        abstract void d();

        abstract void e(Throwable arg1);

        abstract void f(a arg1, Object arg2);

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.d, v);
                this.c();
            }
        }
    }

    static final class io.reactivex.internal.operators.parallel.i.d extends c {
        private static final long h = 0xB05EA70E2BBBD725L;

        io.reactivex.internal.operators.parallel.i.d(d d0, int v, int v1) {
            super(d0, v, v1);
        }

        @Override  // io.reactivex.internal.operators.parallel.i$c
        void c() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            this.g();
        }

        @Override  // io.reactivex.internal.operators.parallel.i$c
        void d() {
            this.f.decrementAndGet();
            this.c();
        }

        @Override  // io.reactivex.internal.operators.parallel.i$c
        void e(Throwable throwable0) {
            this.c.a(throwable0);
            this.f.decrementAndGet();
            this.c();
        }

        @Override  // io.reactivex.internal.operators.parallel.i$c
        void f(a i$a0, Object object0) {
            if(this.get() != 0 || !this.compareAndSet(0, 1)) {
                if(!i$a0.b().offer(object0) && i$a0.a()) {
                    io.reactivex.exceptions.c c1 = new io.reactivex.exceptions.c("Queue full?!");
                    this.c.a(c1);
                    this.f.decrementAndGet();
                }
                if(this.getAndIncrement() != 0) {
                    return;
                }
            }
            else {
                if(this.d.get() != 0L) {
                    this.a.onNext(object0);
                    if(this.d.get() != 0x7FFFFFFFFFFFFFFFL) {
                        this.d.decrementAndGet();
                    }
                    i$a0.c(1L);
                }
                else if(!i$a0.b().offer(object0)) {
                    i$a0.a();
                    io.reactivex.exceptions.c c0 = new io.reactivex.exceptions.c("Queue full?!");
                    this.c.a(c0);
                    this.f.decrementAndGet();
                    this.g();
                    return;
                }
                if(this.decrementAndGet() == 0) {
                    return;
                }
            }
            this.g();
        }

        void g() {
            a[] arr_i$a = this.b;
            d d0 = this.a;
            int v = 1;
            while(true) {
                long v1 = this.d.get();
                long v2 = 0L;
            alab1:
                while(v2 != v1) {
                    if(this.e) {
                        this.b();
                        return;
                    }
                    boolean z = this.f.get() == 0;
                    boolean z1 = true;
                    for(int v3 = 0; v3 < arr_i$a.length; ++v3) {
                        a i$a0 = arr_i$a[v3];
                        n n0 = i$a0.e;
                        if(n0 != null) {
                            Object object0 = n0.poll();
                            if(object0 != null) {
                                d0.onNext(object0);
                                i$a0.d();
                                ++v2;
                                if(v2 == v1) {
                                    break alab1;
                                }
                                else {
                                    z1 = false;
                                }
                            }
                        }
                    }
                    if(z && z1) {
                        if(((Throwable)this.c.get()) != null) {
                            d0.onError(this.c.c());
                            return;
                        }
                        d0.onComplete();
                        return;
                    }
                    if(z1) {
                        break;
                    }
                }
                if(v2 == v1) {
                    if(this.e) {
                        this.b();
                        return;
                    }
                    boolean z2 = this.f.get() == 0;
                    int v4 = 0;
                    while(true) {
                        boolean z3 = true;
                        if(v4 < arr_i$a.length) {
                            n n1 = arr_i$a[v4].e;
                            if(n1 == null || n1.isEmpty()) {
                                ++v4;
                                continue;
                            }
                            else {
                                z3 = false;
                            }
                        }
                        break;
                    }
                    if(z2 && z3) {
                        if(((Throwable)this.c.get()) != null) {
                            d0.onError(this.c.c());
                            return;
                        }
                        d0.onComplete();
                        return;
                    }
                }
                if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                    this.d.addAndGet(-v2);
                }
                int v5 = this.get();
                if(v5 == v) {
                    v5 = this.addAndGet(-v);
                    if(v5 == 0) {
                        return;
                    }
                }
                v = v5;
            }
        }
    }

    final io.reactivex.parallel.b b;
    final int c;
    final boolean d;

    public i(io.reactivex.parallel.b b0, int v, boolean z) {
        this.b = b0;
        this.c = v;
        this.d = z;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.parallel.i.d i$d0 = this.d ? new io.reactivex.internal.operators.parallel.i.d(d0, this.b.F(), this.c) : new io.reactivex.internal.operators.parallel.i.b(d0, this.b.F(), this.c);
        d0.g(i$d0);
        this.b.Q(i$d0.b);
    }
}

