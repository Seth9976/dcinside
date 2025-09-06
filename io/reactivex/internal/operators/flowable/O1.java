package io.reactivex.internal.operators.flowable;

import e3.c;
import f3.n;
import io.reactivex.internal.queue.b;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class o1 extends a {
    static final class io.reactivex.internal.operators.flowable.o1.a extends AtomicInteger implements q, e {
        final d a;
        final c b;
        final n c;
        final AtomicLong d;
        final int e;
        final int f;
        volatile boolean g;
        volatile boolean h;
        Throwable i;
        e j;
        Object k;
        int l;
        private static final long m = 0xE7578DD9D682051BL;

        io.reactivex.internal.operators.flowable.o1.a(d d0, c c0, Object object0, int v) {
            this.a = d0;
            this.b = c0;
            this.k = object0;
            this.e = v;
            this.f = v - (v >> 2);
            b b0 = new b(v);
            this.c = b0;
            b0.offer(object0);
            this.d = new AtomicLong();
        }

        void a() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            d d0 = this.a;
            n n0 = this.c;
            int v = this.f;
            int v1 = this.l;
            int v2 = 1;
            do {
                long v3 = this.d.get();
                long v4 = 0L;
                int v5;
                while((v5 = Long.compare(v4, v3)) != 0) {
                    if(this.g) {
                        n0.clear();
                        return;
                    }
                    boolean z = this.h;
                    if(z) {
                        Throwable throwable0 = this.i;
                        if(throwable0 != null) {
                            n0.clear();
                            d0.onError(throwable0);
                            return;
                        }
                    }
                    Object object0 = n0.poll();
                    if(z && object0 == null) {
                        d0.onComplete();
                        return;
                    }
                    if(object0 == null) {
                        break;
                    }
                    d0.onNext(object0);
                    ++v4;
                    if(v1 + 1 == v) {
                        this.j.request(((long)v));
                        v1 = 0;
                    }
                    else {
                        ++v1;
                    }
                }
                if(v5 == 0 && this.h) {
                    Throwable throwable1 = this.i;
                    if(throwable1 != null) {
                        n0.clear();
                        d0.onError(throwable1);
                        return;
                    }
                    if(n0.isEmpty()) {
                        d0.onComplete();
                        return;
                    }
                }
                if(v4 != 0L) {
                    io.reactivex.internal.util.d.e(this.d, v4);
                }
                this.l = v1;
                v2 = this.addAndGet(-v2);
            }
            while(v2 != 0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.g = true;
            this.j.cancel();
            if(this.getAndIncrement() == 0) {
                this.c.clear();
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.j, e0)) {
                this.j = e0;
                this.a.g(this);
                e0.request(((long)(this.e - 1)));
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.h) {
                return;
            }
            this.h = true;
            this.a();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.h) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.i = throwable0;
            this.h = true;
            this.a();
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Object object1;
            if(this.h) {
                return;
            }
            try {
                object1 = io.reactivex.internal.functions.b.g(this.b.apply(this.k, object0), "The accumulator returned a null value");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.j.cancel();
                this.onError(throwable0);
                return;
            }
            this.k = object1;
            this.c.offer(object1);
            this.a();
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.d, v);
                this.a();
            }
        }
    }

    final c c;
    final Callable d;

    public o1(l l0, Callable callable0, c c0) {
        super(l0);
        this.c = c0;
        this.d = callable0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        Object object0;
        try {
            object0 = io.reactivex.internal.functions.b.g(this.d.call(), "The seed supplied is null");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            g.b(throwable0, d0);
            return;
        }
        io.reactivex.internal.operators.flowable.o1.a o1$a0 = new io.reactivex.internal.operators.flowable.o1.a(d0, this.c, object0, 0x80);
        this.b.l6(o1$a0);
    }
}

