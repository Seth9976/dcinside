package io.reactivex.internal.operators.flowable;

import d3.g;
import e3.o;
import f3.l;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import io.reactivex.q;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class g0 extends a {
    static final class io.reactivex.internal.operators.flowable.g0.a extends c implements q {
        final d b;
        final o c;
        final int d;
        final int e;
        final AtomicLong f;
        e g;
        f3.o h;
        volatile boolean i;
        volatile boolean j;
        final AtomicReference k;
        Iterator l;
        int m;
        int n;
        private static final long o = 0xD508CC0E16FCE595L;

        io.reactivex.internal.operators.flowable.g0.a(d d0, o o0, int v) {
            this.b = d0;
            this.c = o0;
            this.d = v;
            this.e = v - (v >> 2);
            this.k = new AtomicReference();
            this.f = new AtomicLong();
        }

        boolean a(boolean z, boolean z1, d d0, f3.o o0) {
            if(this.j) {
                this.l = null;
                o0.clear();
                return true;
            }
            if(z) {
                if(((Throwable)this.k.get()) != null) {
                    Throwable throwable0 = k.c(this.k);
                    this.l = null;
                    o0.clear();
                    d0.onError(throwable0);
                    return true;
                }
                if(z1) {
                    d0.onComplete();
                    return true;
                }
            }
            return false;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.j) {
                this.j = true;
                this.g.cancel();
                if(this.getAndIncrement() == 0) {
                    this.h.clear();
                }
            }
        }

        @Override  // f3.o
        public void clear() {
            this.l = null;
            this.h.clear();
        }

        void d() {
            Object object2;
            Object object0;
            if(this.getAndIncrement() != 0) {
                return;
            }
            d d0 = this.b;
            f3.o o0 = this.h;
            boolean z = this.n != 1;
            Iterator iterator0 = this.l;
            int v = 1;
            while(true) {
                if(iterator0 == null) {
                    try {
                        boolean z1 = this.i;
                        object0 = o0.poll();
                    }
                    catch(Throwable throwable0) {
                        b.b(throwable0);
                        this.g.cancel();
                        k.a(this.k, throwable0);
                        Throwable throwable1 = k.c(this.k);
                        this.l = null;
                        o0.clear();
                        d0.onError(throwable1);
                        return;
                    }
                    if(this.a(z1, object0 == null, d0, o0)) {
                        return;
                    }
                    if(object0 != null) {
                        try {
                            iterator0 = ((Iterable)this.c.apply(object0)).iterator();
                            if(iterator0.hasNext()) {
                                goto label_35;
                            }
                            else {
                                goto label_32;
                            }
                            goto label_36;
                        }
                        catch(Throwable throwable2) {
                            b.b(throwable2);
                            this.g.cancel();
                            k.a(this.k, throwable2);
                            d0.onError(k.c(this.k));
                            return;
                        }
                    label_32:
                        this.f(z);
                        iterator0 = null;
                        continue;
                    label_35:
                        this.l = iterator0;
                    }
                }
            label_36:
                if(iterator0 == null) {
                label_75:
                    v = this.addAndGet(-v);
                    if(v == 0) {
                        break;
                    }
                }
                else {
                    long v1 = this.f.get();
                    long v2 = 0L;
                    while(v2 != v1) {
                        if(this.a(this.i, false, d0, o0)) {
                            return;
                        }
                        try {
                            Object object1 = iterator0.next();
                            object2 = io.reactivex.internal.functions.b.g(object1, "The iterator returned a null value");
                        }
                        catch(Throwable throwable3) {
                            b.b(throwable3);
                            this.l = null;
                            this.g.cancel();
                            k.a(this.k, throwable3);
                            d0.onError(k.c(this.k));
                            return;
                        }
                        d0.onNext(object2);
                        if(this.a(this.i, false, d0, o0)) {
                            return;
                        }
                        try {
                            ++v2;
                            if(!iterator0.hasNext()) {
                                goto label_65;
                            }
                            goto label_69;
                        }
                        catch(Throwable throwable4) {
                            b.b(throwable4);
                            this.l = null;
                            this.g.cancel();
                            k.a(this.k, throwable4);
                            d0.onError(k.c(this.k));
                            return;
                        }
                    label_65:
                        this.f(z);
                        this.l = null;
                        iterator0 = null;
                        break;
                    label_69:
                        if(false) {
                            break;
                        }
                    }
                    if(v2 == v1 && this.a(this.i, o0.isEmpty() && iterator0 == null, d0, o0)) {
                        return;
                    }
                    if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                        this.f.addAndGet(-v2);
                    }
                    if(iterator0 != null) {
                        goto label_75;
                    }
                }
            }
        }

        void f(boolean z) {
            if(z) {
                int v = this.m + 1;
                if(v == this.e) {
                    this.m = 0;
                    this.g.request(((long)v));
                    return;
                }
                this.m = v;
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.g, e0)) {
                this.g = e0;
                if(e0 instanceof l) {
                    int v = ((l)e0).i(3);
                    if(v == 1) {
                        this.n = 1;
                        this.h = (l)e0;
                        this.i = true;
                        this.b.g(this);
                        return;
                    }
                    if(v == 2) {
                        this.n = 2;
                        this.h = (l)e0;
                        this.b.g(this);
                        e0.request(((long)this.d));
                        return;
                    }
                }
                this.h = new io.reactivex.internal.queue.b(this.d);
                this.b.g(this);
                e0.request(((long)this.d));
            }
        }

        @Override  // f3.k
        public int i(int v) {
            return (v & 1) == 0 || this.n != 1 ? 0 : 1;
        }

        @Override  // f3.o
        public boolean isEmpty() {
            return this.l == null && this.h.isEmpty();
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.i) {
                return;
            }
            this.i = true;
            this.d();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(!this.i && k.a(this.k, throwable0)) {
                this.i = true;
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.i) {
                return;
            }
            if(this.n == 0 && !this.h.offer(object0)) {
                this.onError(new io.reactivex.exceptions.c("Queue is full?!"));
                return;
            }
            this.d();
        }

        @Override  // f3.o
        @g
        public Object poll() throws Exception {
            Iterator iterator0 = this.l;
            while(iterator0 == null) {
                Object object0 = this.h.poll();
                if(object0 == null) {
                    return null;
                }
                iterator0 = ((Iterable)this.c.apply(object0)).iterator();
                if(iterator0.hasNext()) {
                    this.l = iterator0;
                    if(true) {
                        break;
                    }
                }
                else {
                    iterator0 = null;
                }
            }
            Object object1 = iterator0.next();
            Object object2 = io.reactivex.internal.functions.b.g(object1, "The iterator returned a null value");
            if(!iterator0.hasNext()) {
                this.l = null;
            }
            return object2;
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.f, v);
                this.d();
            }
        }
    }

    final o c;
    final int d;

    public g0(io.reactivex.l l0, o o0, int v) {
        super(l0);
        this.c = o0;
        this.d = v;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        Iterator iterator0;
        Object object0;
        io.reactivex.l l0 = this.b;
        if(l0 instanceof Callable) {
            try {
                object0 = ((Callable)l0).call();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                io.reactivex.internal.subscriptions.g.b(throwable0, d0);
                return;
            }
            if(object0 == null) {
                io.reactivex.internal.subscriptions.g.a(d0);
                return;
            }
            try {
                iterator0 = ((Iterable)this.c.apply(object0)).iterator();
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                io.reactivex.internal.subscriptions.g.b(throwable1, d0);
                return;
            }
            k0.O8(d0, iterator0);
            return;
        }
        l0.l6(new io.reactivex.internal.operators.flowable.g0.a(d0, this.c, this.d));
    }
}

