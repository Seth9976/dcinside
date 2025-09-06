package io.reactivex.internal.operators.flowable;

import f3.l;
import f3.n;
import f3.o;
import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import io.reactivex.q;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class a0 extends a {
    static final class io.reactivex.internal.operators.flowable.a0.a extends AtomicReference implements c, q {
        final long a;
        final b b;
        final int c;
        final int d;
        volatile boolean e;
        volatile o f;
        long g;
        int h;
        private static final long i = 0xC01393A8D0182FD9L;

        io.reactivex.internal.operators.flowable.a0.a(b a0$b0, long v) {
            this.a = v;
            this.b = a0$b0;
            this.d = a0$b0.e;
            this.c = a0$b0.e >> 2;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == j.a;
        }

        void b(long v) {
            if(this.h != 1) {
                long v1 = this.g + v;
                if(v1 >= ((long)this.c)) {
                    this.g = 0L;
                    ((e)this.get()).request(v1);
                    return;
                }
                this.g = v1;
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            j.a(this);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.h(this, e0)) {
                if(e0 instanceof l) {
                    int v = ((l)e0).i(7);
                    if(v == 1) {
                        this.h = 1;
                        this.f = (l)e0;
                        this.e = true;
                        this.b.e();
                        return;
                    }
                    if(v == 2) {
                        this.h = 2;
                        this.f = (l)e0;
                    }
                }
                e0.request(((long)this.d));
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.e = true;
            this.b.e();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.lazySet(j.a);
            this.b.j(this, throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.h != 2) {
                this.b.l(object0, this);
                return;
            }
            this.b.e();
        }
    }

    static final class b extends AtomicInteger implements q, e {
        final d a;
        final e3.o b;
        final boolean c;
        final int d;
        final int e;
        volatile n f;
        volatile boolean g;
        final io.reactivex.internal.util.c h;
        volatile boolean i;
        final AtomicReference j;
        final AtomicLong k;
        e l;
        long m;
        long n;
        int o;
        int p;
        final int q;
        private static final long r = -2117620485640801370L;
        static final io.reactivex.internal.operators.flowable.a0.a[] s;
        static final io.reactivex.internal.operators.flowable.a0.a[] t;

        static {
            b.s = new io.reactivex.internal.operators.flowable.a0.a[0];
            b.t = new io.reactivex.internal.operators.flowable.a0.a[0];
        }

        b(d d0, e3.o o0, boolean z, int v, int v1) {
            this.h = new io.reactivex.internal.util.c();
            AtomicReference atomicReference0 = new AtomicReference();
            this.j = atomicReference0;
            this.k = new AtomicLong();
            this.a = d0;
            this.b = o0;
            this.c = z;
            this.d = v;
            this.e = v1;
            this.q = Math.max(1, v >> 1);
            atomicReference0.lazySet(b.s);
        }

        boolean a(io.reactivex.internal.operators.flowable.a0.a a0$a0) {
            do {
                io.reactivex.internal.operators.flowable.a0.a[] arr_a0$a = (io.reactivex.internal.operators.flowable.a0.a[])this.j.get();
                if(arr_a0$a == b.t) {
                    a0$a0.dispose();
                    return false;
                }
                io.reactivex.internal.operators.flowable.a0.a[] arr_a0$a1 = new io.reactivex.internal.operators.flowable.a0.a[arr_a0$a.length + 1];
                System.arraycopy(arr_a0$a, 0, arr_a0$a1, 0, arr_a0$a.length);
                arr_a0$a1[arr_a0$a.length] = a0$a0;
            }
            while(!androidx.compose.animation.core.d.a(this.j, arr_a0$a, arr_a0$a1));
            return true;
        }

        boolean b() {
            if(this.i) {
                this.c();
                return true;
            }
            if(!this.c && this.h.get() != null) {
                this.c();
                Throwable throwable0 = this.h.c();
                if(throwable0 != k.a) {
                    this.a.onError(throwable0);
                }
                return true;
            }
            return false;
        }

        void c() {
            n n0 = this.f;
            if(n0 != null) {
                n0.clear();
            }
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.i) {
                this.i = true;
                this.l.cancel();
                this.d();
                if(this.getAndIncrement() == 0) {
                    n n0 = this.f;
                    if(n0 != null) {
                        n0.clear();
                    }
                }
            }
        }

        void d() {
            io.reactivex.internal.operators.flowable.a0.a[] arr_a0$a = (io.reactivex.internal.operators.flowable.a0.a[])this.j.get();
            io.reactivex.internal.operators.flowable.a0.a[] arr_a0$a1 = b.t;
            if(arr_a0$a != arr_a0$a1) {
                io.reactivex.internal.operators.flowable.a0.a[] arr_a0$a2 = (io.reactivex.internal.operators.flowable.a0.a[])this.j.getAndSet(arr_a0$a1);
                if(arr_a0$a2 != arr_a0$a1) {
                    for(int v = 0; v < arr_a0$a2.length; ++v) {
                        arr_a0$a2[v].dispose();
                    }
                    Throwable throwable0 = this.h.c();
                    if(throwable0 != null && throwable0 != k.a) {
                        io.reactivex.plugins.a.Y(throwable0);
                    }
                }
            }
        }

        void e() {
            if(this.getAndIncrement() == 0) {
                this.f();
            }
        }

        void f() {
            long v14;
            int v13;
            int v11;
            io.reactivex.internal.operators.flowable.a0.a[] arr_a0$a1;
            d d0 = this.a;
            int v = 1;
            while(true) {
                if(this.b()) {
                    return;
                }
                n n0 = this.f;
                long v1 = this.k.get();
                boolean z = v1 == 0x7FFFFFFFFFFFFFFFL;
                long v2 = 0L;
                if(n0 != null) {
                    while(true) {
                        long v3 = 0L;
                        Object object0;
                        for(object0 = null; v1 != 0L; object0 = object1) {
                            Object object1 = n0.poll();
                            if(this.b()) {
                                return;
                            }
                            if(object1 == null) {
                                object0 = null;
                                break;
                            }
                            d0.onNext(object1);
                            ++v2;
                            ++v3;
                            --v1;
                        }
                        if(v3 != 0L) {
                            v1 = z ? 0x7FFFFFFFFFFFFFFFL : this.k.addAndGet(-v3);
                        }
                        if(v1 == 0L || object0 == null) {
                            break;
                        }
                    }
                }
                boolean z1 = this.g;
                n n1 = this.f;
                io.reactivex.internal.operators.flowable.a0.a[] arr_a0$a = (io.reactivex.internal.operators.flowable.a0.a[])this.j.get();
                int v4 = arr_a0$a.length;
                if(z1 && (n1 == null || n1.isEmpty()) && v4 == 0) {
                    Throwable throwable0 = this.h.c();
                    if(throwable0 != k.a) {
                        if(throwable0 == null) {
                            d0.onComplete();
                            return;
                        }
                        d0.onError(throwable0);
                    }
                    return;
                }
                if(v4 == 0) {
                    v14 = v2;
                    v13 = 0;
                }
                else {
                    long v5 = this.n;
                    int v6 = this.o;
                    if(v4 <= v6 || arr_a0$a[v6].a != v5) {
                        if(v4 <= v6) {
                            v6 = 0;
                        }
                        for(int v7 = 0; v7 < v4 && arr_a0$a[v6].a != v5; ++v7) {
                            ++v6;
                            v6 = v6 == v4 ? 0 : v6 + 1;
                        }
                        this.o = v6;
                        this.n = arr_a0$a[v6].a;
                    }
                    int v8 = v6;
                    int v9 = 0;
                    int v10 = 0;
                alab1:
                    while(true) {
                        if(v10 < v4) {
                            if(this.b()) {
                                return;
                            }
                            io.reactivex.internal.operators.flowable.a0.a a0$a0 = arr_a0$a[v8];
                            Object object2 = null;
                            while(true) {
                                if(this.b()) {
                                    return;
                                }
                                o o0 = a0$a0.f;
                                if(o0 == null) {
                                    arr_a0$a1 = arr_a0$a;
                                    v11 = v4;
                                    break;
                                }
                                arr_a0$a1 = arr_a0$a;
                                v11 = v4;
                                long v12 = 0L;
                                while(v1 != 0L) {
                                    try {
                                        object2 = o0.poll();
                                    }
                                    catch(Throwable throwable1) {
                                        io.reactivex.exceptions.b.b(throwable1);
                                        a0$a0.dispose();
                                        this.h.a(throwable1);
                                        if(!this.c) {
                                            this.l.cancel();
                                        }
                                        if(this.b()) {
                                            return;
                                        }
                                        this.k(a0$a0);
                                        v4 = v11;
                                        v9 = 1;
                                        v10 += 2;
                                        arr_a0$a = arr_a0$a1;
                                        continue alab1;
                                    }
                                    if(object2 == null) {
                                        break;
                                    }
                                    d0.onNext(object2);
                                    if(this.b()) {
                                        return;
                                    }
                                    --v1;
                                    ++v12;
                                }
                                if(v12 != 0L) {
                                    v1 = z ? 0x7FFFFFFFFFFFFFFFL : this.k.addAndGet(-v12);
                                    a0$a0.b(v12);
                                }
                                if(v1 == 0L || object2 == null) {
                                    break;
                                }
                                arr_a0$a = arr_a0$a1;
                                v4 = v11;
                            }
                            if(a0$a0.e && (a0$a0.f == null || a0$a0.f.isEmpty())) {
                                this.k(a0$a0);
                                if(this.b()) {
                                    return;
                                }
                                ++v2;
                                v9 = 1;
                            }
                            if(v1 == 0L) {
                                v13 = v9;
                                break;
                            }
                            else {
                                ++v8;
                                v4 = v11;
                                if(v8 == v4) {
                                    v8 = 0;
                                }
                                ++v10;
                                arr_a0$a = arr_a0$a1;
                                continue;
                            }
                        }
                        arr_a0$a1 = arr_a0$a;
                        v13 = v9;
                        break;
                    }
                    this.o = v8;
                    this.n = arr_a0$a1[v8].a;
                    v14 = v2;
                }
                if(v14 != 0L && !this.i) {
                    this.l.request(v14);
                }
                if(v13 == 0) {
                    v = this.addAndGet(-v);
                    if(v == 0) {
                        break;
                    }
                }
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.l, e0)) {
                this.l = e0;
                this.a.g(this);
                if(!this.i) {
                    int v = this.d;
                    if(v == 0x7FFFFFFF) {
                        e0.request(0x7FFFFFFFFFFFFFFFL);
                        return;
                    }
                    e0.request(((long)v));
                }
            }
        }

        o h(io.reactivex.internal.operators.flowable.a0.a a0$a0) {
            o o0 = a0$a0.f;
            if(o0 == null) {
                o0 = new io.reactivex.internal.queue.b(this.e);
                a0$a0.f = o0;
            }
            return o0;
        }

        o i() {
            n n0 = this.f;
            if(n0 == null) {
                n0 = this.d == 0x7FFFFFFF ? new io.reactivex.internal.queue.c(this.e) : new io.reactivex.internal.queue.b(this.d);
                this.f = n0;
            }
            return n0;
        }

        void j(io.reactivex.internal.operators.flowable.a0.a a0$a0, Throwable throwable0) {
            if(this.h.a(throwable0)) {
                a0$a0.e = true;
                if(!this.c) {
                    this.l.cancel();
                    io.reactivex.internal.operators.flowable.a0.a[] arr_a0$a = (io.reactivex.internal.operators.flowable.a0.a[])this.j.getAndSet(b.t);
                    for(int v = 0; v < arr_a0$a.length; ++v) {
                        arr_a0$a[v].dispose();
                    }
                }
                this.e();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        void k(io.reactivex.internal.operators.flowable.a0.a a0$a0) {
            io.reactivex.internal.operators.flowable.a0.a[] arr_a0$a1;
            do {
                io.reactivex.internal.operators.flowable.a0.a[] arr_a0$a = (io.reactivex.internal.operators.flowable.a0.a[])this.j.get();
                int v = arr_a0$a.length;
                if(v == 0) {
                    return;
                }
                int v1 = 0;
                while(true) {
                    if(v1 < v) {
                        if(arr_a0$a[v1] == a0$a0) {
                            break;
                        }
                        else {
                            ++v1;
                            continue;
                        }
                    }
                    v1 = -1;
                    break;
                }
                if(v1 < 0) {
                    return;
                }
                if(v == 1) {
                    arr_a0$a1 = b.s;
                }
                else {
                    io.reactivex.internal.operators.flowable.a0.a[] arr_a0$a2 = new io.reactivex.internal.operators.flowable.a0.a[v - 1];
                    System.arraycopy(arr_a0$a, 0, arr_a0$a2, 0, v1);
                    System.arraycopy(arr_a0$a, v1 + 1, arr_a0$a2, v1, v - v1 - 1);
                    arr_a0$a1 = arr_a0$a2;
                }
            }
            while(!androidx.compose.animation.core.d.a(this.j, arr_a0$a, arr_a0$a1));
        }

        void l(Object object0, io.reactivex.internal.operators.flowable.a0.a a0$a0) {
            if(this.get() != 0 || !this.compareAndSet(0, 1)) {
                o o1 = a0$a0.f;
                if(o1 == null) {
                    o1 = new io.reactivex.internal.queue.b(this.e);
                    a0$a0.f = o1;
                }
                if(!o1.offer(object0)) {
                    this.onError(new io.reactivex.exceptions.c("Inner queue full?!"));
                    return;
                }
                if(this.getAndIncrement() != 0) {
                    return;
                }
            }
            else {
                long v = this.k.get();
                o o0 = a0$a0.f;
                if(v == 0L || o0 != null && !o0.isEmpty()) {
                    if(o0 == null) {
                        o0 = this.h(a0$a0);
                    }
                    if(!o0.offer(object0)) {
                        this.onError(new io.reactivex.exceptions.c("Inner queue full?!"));
                        return;
                    }
                }
                else {
                    this.a.onNext(object0);
                    if(v != 0x7FFFFFFFFFFFFFFFL) {
                        this.k.decrementAndGet();
                    }
                    a0$a0.b(1L);
                }
                if(this.decrementAndGet() == 0) {
                    return;
                }
            }
            this.f();
        }

        void n(Object object0) {
            if(this.get() != 0 || !this.compareAndSet(0, 1)) {
                if(!this.i().offer(object0)) {
                    this.onError(new IllegalStateException("Scalar queue full?!"));
                    return;
                }
                if(this.getAndIncrement() != 0) {
                    return;
                }
            }
            else {
                long v = this.k.get();
                o o0 = this.f;
                if(v == 0L || o0 != null && !o0.isEmpty()) {
                    if(o0 == null) {
                        o0 = this.i();
                    }
                    if(!o0.offer(object0)) {
                        this.onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                else {
                    this.a.onNext(object0);
                    if(v != 0x7FFFFFFFFFFFFFFFL) {
                        this.k.decrementAndGet();
                    }
                    if(this.d != 0x7FFFFFFF && !this.i) {
                        int v1 = this.p + 1;
                        this.p = v1;
                        int v2 = this.q;
                        if(v1 == v2) {
                            this.p = 0;
                            this.l.request(((long)v2));
                        }
                    }
                }
                if(this.decrementAndGet() == 0) {
                    return;
                }
            }
            this.f();
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.g) {
                return;
            }
            this.g = true;
            this.e();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.g) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            if(this.h.a(throwable0)) {
                this.g = true;
                this.e();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Object object1;
            org.reactivestreams.c c0;
            if(this.g) {
                return;
            }
            try {
                c0 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null Publisher");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.l.cancel();
                this.onError(throwable0);
                return;
            }
            if(c0 instanceof Callable) {
                try {
                    object1 = ((Callable)c0).call();
                }
                catch(Throwable throwable1) {
                    io.reactivex.exceptions.b.b(throwable1);
                    this.h.a(throwable1);
                    this.e();
                    return;
                }
                if(object1 != null) {
                    this.n(object1);
                    return;
                }
                if(this.d != 0x7FFFFFFF && !this.i) {
                    int v = this.p + 1;
                    this.p = v;
                    int v1 = this.q;
                    if(v == v1) {
                        this.p = 0;
                        this.l.request(((long)v1));
                    }
                }
            }
            else {
                long v2 = this.m;
                this.m = v2 + 1L;
                io.reactivex.internal.operators.flowable.a0.a a0$a0 = new io.reactivex.internal.operators.flowable.a0.a(this, v2);
                if(this.a(a0$a0)) {
                    c0.e(a0$a0);
                }
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.k, v);
                this.e();
            }
        }
    }

    final e3.o c;
    final boolean d;
    final int e;
    final int f;

    public a0(io.reactivex.l l0, e3.o o0, boolean z, int v, int v1) {
        super(l0);
        this.c = o0;
        this.d = z;
        this.e = v;
        this.f = v1;
    }

    public static q O8(d d0, e3.o o0, boolean z, int v, int v1) {
        return new b(d0, o0, z, v, v1);
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        if(m1.b(this.b, d0, this.c)) {
            return;
        }
        q q0 = a0.O8(d0, this.c, this.d, this.e, this.f);
        this.b.l6(q0);
    }
}

