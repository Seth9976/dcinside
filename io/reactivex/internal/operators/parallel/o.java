package io.reactivex.internal.operators.parallel;

import io.reactivex.J.c;
import io.reactivex.J;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.d;
import io.reactivex.parallel.b;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.e;

public final class o extends b {
    static abstract class a extends AtomicInteger implements q, Runnable, e {
        final int a;
        final int b;
        final io.reactivex.internal.queue.b c;
        final c d;
        e e;
        volatile boolean f;
        Throwable g;
        final AtomicLong h;
        volatile boolean i;
        int j;
        private static final long k = 0x7FFC3440018B78E6L;

        a(int v, io.reactivex.internal.queue.b b0, c j$c0) {
            this.h = new AtomicLong();
            this.a = v;
            this.c = b0;
            this.b = v - (v >> 2);
            this.d = j$c0;
        }

        final void a() {
            if(this.getAndIncrement() == 0) {
                this.d.c(this);
            }
        }

        @Override  // org.reactivestreams.e
        public final void cancel() {
            if(!this.i) {
                this.i = true;
                this.e.cancel();
                this.d.dispose();
                if(this.getAndIncrement() == 0) {
                    this.c.clear();
                }
            }
        }

        @Override  // org.reactivestreams.d
        public final void onComplete() {
            if(this.f) {
                return;
            }
            this.f = true;
            this.a();
        }

        @Override  // org.reactivestreams.d
        public final void onError(Throwable throwable0) {
            if(this.f) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.g = throwable0;
            this.f = true;
            this.a();
        }

        @Override  // org.reactivestreams.d
        public final void onNext(Object object0) {
            if(this.f) {
                return;
            }
            if(!this.c.offer(object0)) {
                this.e.cancel();
                this.onError(new io.reactivex.exceptions.c("Queue is full?!"));
                return;
            }
            this.a();
        }

        @Override  // org.reactivestreams.e
        public final void request(long v) {
            if(j.j(v)) {
                d.a(this.h, v);
                this.a();
            }
        }
    }

    final class io.reactivex.internal.operators.parallel.o.b implements io.reactivex.internal.schedulers.o.a {
        final org.reactivestreams.d[] a;
        final org.reactivestreams.d[] b;
        final o c;

        io.reactivex.internal.operators.parallel.o.b(org.reactivestreams.d[] arr_d, org.reactivestreams.d[] arr_d1) {
            this.a = arr_d;
            this.b = arr_d1;
        }

        @Override  // io.reactivex.internal.schedulers.o$a
        public void a(int v, c j$c0) {
            o.this.V(v, this.a, this.b, j$c0);
        }
    }

    static final class io.reactivex.internal.operators.parallel.o.c extends a {
        final f3.a l;
        private static final long m = 0xEEB976B788F368AL;

        io.reactivex.internal.operators.parallel.o.c(f3.a a0, int v, io.reactivex.internal.queue.b b0, c j$c0) {
            super(v, b0, j$c0);
            this.l = a0;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.e, e0)) {
                this.e = e0;
                this.l.g(this);
                e0.request(((long)this.a));
            }
        }

        @Override
        public void run() {
            int v = this.j;
            io.reactivex.internal.queue.b b0 = this.c;
            f3.a a0 = this.l;
            int v1 = this.b;
            int v2 = 1;
            while(true) {
                long v3 = this.h.get();
                long v4 = 0L;
                int v5;
                while((v5 = Long.compare(v4, v3)) != 0) {
                    if(this.i) {
                        b0.clear();
                        return;
                    }
                    boolean z = this.f;
                    if(z) {
                        Throwable throwable0 = this.g;
                        if(throwable0 != null) {
                            b0.clear();
                            a0.onError(throwable0);
                            this.d.dispose();
                            return;
                        }
                    }
                    Object object0 = b0.poll();
                    if(z && object0 == null) {
                        a0.onComplete();
                        this.d.dispose();
                        return;
                    }
                    if(object0 == null) {
                        break;
                    }
                    if(a0.m(object0)) {
                        ++v4;
                    }
                    ++v;
                    if(v == v1) {
                        this.e.request(((long)v));
                        v = 0;
                    }
                }
                if(v5 == 0) {
                    if(this.i) {
                        b0.clear();
                        return;
                    }
                    if(this.f) {
                        Throwable throwable1 = this.g;
                        if(throwable1 != null) {
                            b0.clear();
                            a0.onError(throwable1);
                            this.d.dispose();
                            return;
                        }
                        if(b0.isEmpty()) {
                            a0.onComplete();
                            this.d.dispose();
                            return;
                        }
                    }
                }
                if(v4 != 0L && v3 != 0x7FFFFFFFFFFFFFFFL) {
                    this.h.addAndGet(-v4);
                }
                int v6 = this.get();
                if(v6 == v2) {
                    this.j = v;
                    v2 = this.addAndGet(-v2);
                    if(v2 != 0) {
                        continue;
                    }
                    return;
                }
                v2 = v6;
            }
        }
    }

    static final class io.reactivex.internal.operators.parallel.o.d extends a {
        final org.reactivestreams.d l;
        private static final long m = 0xEEB976B788F368AL;

        io.reactivex.internal.operators.parallel.o.d(org.reactivestreams.d d0, int v, io.reactivex.internal.queue.b b0, c j$c0) {
            super(v, b0, j$c0);
            this.l = d0;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.e, e0)) {
                this.e = e0;
                this.l.g(this);
                e0.request(((long)this.a));
            }
        }

        @Override
        public void run() {
            int v = this.j;
            io.reactivex.internal.queue.b b0 = this.c;
            org.reactivestreams.d d0 = this.l;
            int v1 = this.b;
            int v2 = 1;
            while(true) {
                long v3 = this.h.get();
                long v4 = 0L;
                int v5;
                while((v5 = Long.compare(v4, v3)) != 0) {
                    if(this.i) {
                        b0.clear();
                        return;
                    }
                    boolean z = this.f;
                    if(z) {
                        Throwable throwable0 = this.g;
                        if(throwable0 != null) {
                            b0.clear();
                            d0.onError(throwable0);
                            this.d.dispose();
                            return;
                        }
                    }
                    Object object0 = b0.poll();
                    if(z && object0 == null) {
                        d0.onComplete();
                        this.d.dispose();
                        return;
                    }
                    if(object0 == null) {
                        break;
                    }
                    d0.onNext(object0);
                    ++v4;
                    ++v;
                    if(v == v1) {
                        this.e.request(((long)v));
                        v = 0;
                    }
                }
                if(v5 == 0) {
                    if(this.i) {
                        b0.clear();
                        return;
                    }
                    if(this.f) {
                        Throwable throwable1 = this.g;
                        if(throwable1 != null) {
                            b0.clear();
                            d0.onError(throwable1);
                            this.d.dispose();
                            return;
                        }
                        if(b0.isEmpty()) {
                            d0.onComplete();
                            this.d.dispose();
                            return;
                        }
                    }
                }
                if(v4 != 0L && v3 != 0x7FFFFFFFFFFFFFFFL) {
                    this.h.addAndGet(-v4);
                }
                int v6 = this.get();
                if(v6 == v2) {
                    this.j = v;
                    v2 = this.addAndGet(-v2);
                    if(v2 != 0) {
                        continue;
                    }
                    return;
                }
                v2 = v6;
            }
        }
    }

    final b a;
    final J b;
    final int c;

    public o(b b0, J j0, int v) {
        this.a = b0;
        this.b = j0;
        this.c = v;
    }

    @Override  // io.reactivex.parallel.b
    public int F() {
        return this.a.F();
    }

    @Override  // io.reactivex.parallel.b
    public void Q(org.reactivestreams.d[] arr_d) {
        if(!this.U(arr_d)) {
            return;
        }
        org.reactivestreams.d[] arr_d1 = new org.reactivestreams.d[arr_d.length];
        J j0 = this.b;
        if(j0 instanceof io.reactivex.internal.schedulers.o) {
            io.reactivex.internal.operators.parallel.o.b o$b0 = (int v, c j$c0) -> {
                org.reactivestreams.d d0 = arr_d[v];
                io.reactivex.internal.queue.b b0 = new io.reactivex.internal.queue.b(o.this.c);
                if(d0 instanceof f3.a) {
                    arr_d1[v] = new io.reactivex.internal.operators.parallel.o.c(((f3.a)d0), o.this.c, b0, j$c0);
                    return;
                }
                arr_d1[v] = new io.reactivex.internal.operators.parallel.o.d(d0, o.this.c, b0, j$c0);
            };
            ((io.reactivex.internal.schedulers.o)j0).b(arr_d.length, o$b0);
        }
        else {
            for(int v = 0; v < arr_d.length; ++v) {
                this.V(v, arr_d, arr_d1, this.b.d());
            }
        }
        this.a.Q(arr_d1);
    }

    // 检测为 Lambda 实现
    void V(int v, org.reactivestreams.d[] arr_d, org.reactivestreams.d[] arr_d1, c j$c0) [...]
}

