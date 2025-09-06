package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.v;
import io.reactivex.l;
import io.reactivex.q;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class m extends a {
    static final class io.reactivex.internal.operators.flowable.m.a implements q, e {
        final d a;
        final Callable b;
        final int c;
        Collection d;
        e e;
        boolean f;
        int g;

        io.reactivex.internal.operators.flowable.m.a(d d0, int v, Callable callable0) {
            this.a = d0;
            this.c = v;
            this.b = callable0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.e.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.e, e0)) {
                this.e = e0;
                this.a.g(this);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.f) {
                return;
            }
            this.f = true;
            Collection collection0 = this.d;
            if(collection0 != null && !collection0.isEmpty()) {
                this.a.onNext(collection0);
            }
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.f) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.f = true;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.f) {
                return;
            }
            Collection collection0 = this.d;
            if(collection0 == null) {
                try {
                    collection0 = (Collection)b.g(this.b.call(), "The bufferSupplier returned a null buffer");
                    this.d = collection0;
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.cancel();
                    this.onError(throwable0);
                    return;
                }
            }
            collection0.add(object0);
            int v = this.g + 1;
            if(v == this.c) {
                this.g = 0;
                this.d = null;
                this.a.onNext(collection0);
                return;
            }
            this.g = v;
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                this.e.request(io.reactivex.internal.util.d.d(v, this.c));
            }
        }
    }

    static final class io.reactivex.internal.operators.flowable.m.b extends AtomicLong implements e3.e, q, e {
        final d a;
        final Callable b;
        final int c;
        final int d;
        final ArrayDeque e;
        final AtomicBoolean f;
        e g;
        boolean h;
        int i;
        volatile boolean j;
        long k;
        private static final long l = 0x99B7A13F45FCBC93L;

        io.reactivex.internal.operators.flowable.m.b(d d0, int v, int v1, Callable callable0) {
            this.a = d0;
            this.c = v;
            this.d = v1;
            this.b = callable0;
            this.f = new AtomicBoolean();
            this.e = new ArrayDeque();
        }

        @Override  // e3.e
        public boolean a() {
            return this.j;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.j = true;
            this.g.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.g, e0)) {
                this.g = e0;
                this.a.g(this);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.h) {
                return;
            }
            this.h = true;
            long v = this.k;
            if(v != 0L) {
                io.reactivex.internal.util.d.e(this, v);
            }
            v.g(this.a, this.e, this, this);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.h) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.h = true;
            this.e.clear();
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Collection collection0;
            if(this.h) {
                return;
            }
            ArrayDeque arrayDeque0 = this.e;
            int v = this.i + 1;
            if(this.i == 0) {
                try {
                    collection0 = (Collection)b.g(this.b.call(), "The bufferSupplier returned a null buffer");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.cancel();
                    this.onError(throwable0);
                    return;
                }
                arrayDeque0.offer(collection0);
            }
            Collection collection1 = (Collection)arrayDeque0.peek();
            if(collection1 != null && collection1.size() + 1 == this.c) {
                arrayDeque0.poll();
                collection1.add(object0);
                ++this.k;
                this.a.onNext(collection1);
            }
            for(Object object1: arrayDeque0) {
                ((Collection)object1).add(object0);
            }
            if(v == this.d) {
                v = 0;
            }
            this.i = v;
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(!j.j(v) || v.i(v, this.a, this.e, this, this)) {
                return;
            }
            if(!this.f.get() && this.f.compareAndSet(false, true)) {
                long v1 = io.reactivex.internal.util.d.d(this.d, v - 1L);
                this.g.request(io.reactivex.internal.util.d.c(this.c, v1));
                return;
            }
            long v2 = io.reactivex.internal.util.d.d(this.d, v);
            this.g.request(v2);
        }
    }

    static final class c extends AtomicInteger implements q, e {
        final d a;
        final Callable b;
        final int c;
        final int d;
        Collection e;
        e f;
        boolean g;
        int h;
        private static final long i = 0xB20F5B5413D80C8FL;

        c(d d0, int v, int v1, Callable callable0) {
            this.a = d0;
            this.c = v;
            this.d = v1;
            this.b = callable0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.f.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.f, e0)) {
                this.f = e0;
                this.a.g(this);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.g) {
                return;
            }
            this.g = true;
            Collection collection0 = this.e;
            this.e = null;
            if(collection0 != null) {
                this.a.onNext(collection0);
            }
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.g) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.g = true;
            this.e = null;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.g) {
                return;
            }
            Collection collection0 = this.e;
            int v = this.h + 1;
            if(this.h == 0) {
                try {
                    collection0 = (Collection)b.g(this.b.call(), "The bufferSupplier returned a null buffer");
                    this.e = collection0;
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.cancel();
                    this.onError(throwable0);
                    return;
                }
            }
            if(collection0 != null) {
                collection0.add(object0);
                if(collection0.size() == this.c) {
                    this.e = null;
                    this.a.onNext(collection0);
                }
            }
            if(v == this.d) {
                v = 0;
            }
            this.h = v;
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                if(this.get() == 0 && this.compareAndSet(0, 1)) {
                    long v1 = io.reactivex.internal.util.d.c(io.reactivex.internal.util.d.d(v, this.c), io.reactivex.internal.util.d.d(this.d - this.c, v - 1L));
                    this.f.request(v1);
                    return;
                }
                this.f.request(io.reactivex.internal.util.d.d(this.d, v));
            }
        }
    }

    final int c;
    final int d;
    final Callable e;

    public m(l l0, int v, int v1, Callable callable0) {
        super(l0);
        this.c = v;
        this.d = v1;
        this.e = callable0;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        int v = this.c;
        int v1 = this.d;
        if(v == v1) {
            io.reactivex.internal.operators.flowable.m.a m$a0 = new io.reactivex.internal.operators.flowable.m.a(d0, v, this.e);
            this.b.l6(m$a0);
            return;
        }
        if(v1 > v) {
            c m$c0 = new c(d0, this.c, this.d, this.e);
            this.b.l6(m$c0);
            return;
        }
        io.reactivex.internal.operators.flowable.m.b m$b0 = new io.reactivex.internal.operators.flowable.m.b(d0, this.c, this.d, this.e);
        this.b.l6(m$b0);
    }
}

