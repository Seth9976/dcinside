package io.reactivex.internal.operators.parallel;

import f3.l;
import f3.o;
import io.reactivex.exceptions.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.d;
import io.reactivex.parallel.b;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import org.reactivestreams.e;

public final class h extends b {
    static final class a extends AtomicInteger implements q {
        final class io.reactivex.internal.operators.parallel.h.a.a implements e {
            final int a;
            final int b;
            final a c;

            io.reactivex.internal.operators.parallel.h.a.a(int v, int v1) {
                this.a = v;
                this.b = v1;
            }

            @Override  // org.reactivestreams.e
            public void cancel() {
                if(a.this.b.compareAndSet(this.a + this.b, 0L, 1L)) {
                    a.this.a(this.b + this.b);
                }
            }

            @Override  // org.reactivestreams.e
            public void request(long v) {
                if(j.j(v)) {
                    AtomicLongArray atomicLongArray0 = a.this.b;
                    do {
                        long v1 = atomicLongArray0.get(this.a);
                        if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                            return;
                        }
                    }
                    while(!atomicLongArray0.compareAndSet(this.a, v1, d.c(v1, v)));
                    if(a.this.l.get() == this.b) {
                        a.this.b();
                    }
                }
            }
        }

        final org.reactivestreams.d[] a;
        final AtomicLongArray b;
        final long[] c;
        final int d;
        final int e;
        e f;
        o g;
        Throwable h;
        volatile boolean i;
        int j;
        volatile boolean k;
        final AtomicInteger l;
        int m;
        int n;
        private static final long o = 0xC1F51E0C5F2F71A7L;

        a(org.reactivestreams.d[] arr_d, int v) {
            this.l = new AtomicInteger();
            this.a = arr_d;
            this.d = v;
            this.e = v - (v >> 2);
            int v1 = arr_d.length + arr_d.length;
            AtomicLongArray atomicLongArray0 = new AtomicLongArray(v1 + 1);
            this.b = atomicLongArray0;
            atomicLongArray0.lazySet(v1, ((long)arr_d.length));
            this.c = new long[arr_d.length];
        }

        void a(int v) {
            if(this.b.decrementAndGet(v) == 0L) {
                this.k = true;
                this.f.cancel();
                if(this.getAndIncrement() == 0) {
                    this.g.clear();
                }
            }
        }

        void b() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            if(this.n == 1) {
                this.d();
                return;
            }
            this.c();
        }

        void c() {
            Object object0;
            o o0 = this.g;
            org.reactivestreams.d[] arr_d = this.a;
            AtomicLongArray atomicLongArray0 = this.b;
            long[] arr_v = this.c;
            int v = this.j;
            int v1 = this.m;
            int v2 = 1;
            while(true) {
                int v3 = 0;
                int v4 = 0;
                do {
                    if(this.k) {
                        o0.clear();
                        return;
                    }
                    boolean z = this.i;
                    if(z) {
                        Throwable throwable0 = this.h;
                        if(throwable0 != null) {
                            o0.clear();
                            while(v3 < arr_d.length) {
                                arr_d[v3].onError(throwable0);
                                ++v3;
                            }
                            return;
                        }
                    }
                    boolean z1 = o0.isEmpty();
                    if(z && z1) {
                        while(v3 < arr_d.length) {
                            arr_d[v3].onComplete();
                            ++v3;
                        }
                        return;
                    }
                    if(z1) {
                        break;
                    }
                    long v5 = atomicLongArray0.get(v);
                    long v6 = arr_v[v];
                    if(v5 == v6 || atomicLongArray0.get(arr_v.length + v) != 0L) {
                    label_52:
                        ++v4;
                    }
                    else {
                        try {
                            object0 = o0.poll();
                        }
                        catch(Throwable throwable1) {
                            io.reactivex.exceptions.b.b(throwable1);
                            this.f.cancel();
                            while(v3 < arr_d.length) {
                                arr_d[v3].onError(throwable1);
                                ++v3;
                            }
                            return;
                        }
                        if(object0 == null) {
                            break;
                        }
                        else {
                            arr_d[v].onNext(object0);
                            arr_v[v] = v6 + 1L;
                            ++v1;
                            if(v1 == this.e) {
                                this.f.request(((long)v1));
                                v1 = 0;
                            }
                            v4 = 0;
                            goto label_53;
                        }
                        goto label_52;
                    }
                label_53:
                    ++v;
                    v = v == arr_v.length ? 0 : v + 1;
                }
                while(v4 != arr_v.length);
                int v7 = this.get();
                if(v7 == v2) {
                    this.j = v;
                    this.m = v1;
                    v2 = this.addAndGet(-v2);
                    if(v2 != 0) {
                        continue;
                    }
                    return;
                }
                v2 = v7;
            }
        }

        void d() {
            Object object0;
            o o0 = this.g;
            org.reactivestreams.d[] arr_d = this.a;
            AtomicLongArray atomicLongArray0 = this.b;
            long[] arr_v = this.c;
            int v = this.j;
            int v1 = 1;
            while(true) {
                int v2 = 0;
                int v3 = 0;
                do {
                    if(this.k) {
                        o0.clear();
                        return;
                    }
                    if(o0.isEmpty()) {
                        while(v2 < arr_d.length) {
                            arr_d[v2].onComplete();
                            ++v2;
                        }
                        return;
                    }
                    long v4 = atomicLongArray0.get(v);
                    long v5 = arr_v[v];
                    if(v4 == v5 || atomicLongArray0.get(arr_v.length + v) != 0L) {
                        ++v3;
                    }
                    else {
                        try {
                            object0 = o0.poll();
                        }
                        catch(Throwable throwable0) {
                            io.reactivex.exceptions.b.b(throwable0);
                            this.f.cancel();
                            while(v2 < arr_d.length) {
                                arr_d[v2].onError(throwable0);
                                ++v2;
                            }
                            return;
                        }
                        if(object0 == null) {
                            while(v2 < arr_d.length) {
                                arr_d[v2].onComplete();
                                ++v2;
                            }
                            return;
                        }
                        arr_d[v].onNext(object0);
                        arr_v[v] = v5 + 1L;
                        v3 = 0;
                    }
                    ++v;
                    v = v == arr_v.length ? 0 : v + 1;
                }
                while(v3 != arr_v.length);
                int v6 = this.get();
                if(v6 == v1) {
                    this.j = v;
                    v1 = this.addAndGet(-v1);
                    if(v1 != 0) {
                        continue;
                    }
                    return;
                }
                v1 = v6;
            }
        }

        void e() {
            org.reactivestreams.d[] arr_d = this.a;
            for(int v = 0; v < arr_d.length && !this.k; ++v) {
                this.l.lazySet(v + 1);
                arr_d[v].g(new io.reactivex.internal.operators.parallel.h.a.a(this, v, arr_d.length));
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.f, e0)) {
                this.f = e0;
                if(e0 instanceof l) {
                    int v = ((l)e0).i(7);
                    if(v == 1) {
                        this.n = 1;
                        this.g = (l)e0;
                        this.i = true;
                        this.e();
                        this.b();
                        return;
                    }
                    if(v == 2) {
                        this.n = 2;
                        this.g = (l)e0;
                        this.e();
                        e0.request(((long)this.d));
                        return;
                    }
                }
                this.g = new io.reactivex.internal.queue.b(this.d);
                this.e();
                e0.request(((long)this.d));
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.i = true;
            this.b();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.h = throwable0;
            this.i = true;
            this.b();
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.n == 0 && !this.g.offer(object0)) {
                this.f.cancel();
                this.onError(new c("Queue is full?"));
                return;
            }
            this.b();
        }
    }

    final org.reactivestreams.c a;
    final int b;
    final int c;

    public h(org.reactivestreams.c c0, int v, int v1) {
        this.a = c0;
        this.b = v;
        this.c = v1;
    }

    @Override  // io.reactivex.parallel.b
    public int F() {
        return this.b;
    }

    @Override  // io.reactivex.parallel.b
    public void Q(org.reactivestreams.d[] arr_d) {
        if(!this.U(arr_d)) {
            return;
        }
        a h$a0 = new a(arr_d, this.c);
        this.a.e(h$a0);
    }
}

