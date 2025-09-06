package io.reactivex.processors;

import d3.a;
import d3.b;
import d3.f;
import d3.h;
import f3.o;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

@b(a.b)
@h("none")
public final class d extends c {
    static final class io.reactivex.processors.d.a extends AtomicLong implements e {
        final org.reactivestreams.d a;
        final d b;
        long c;
        private static final long d = 0xFAF55C61FFFA8983L;

        io.reactivex.processors.d.a(org.reactivestreams.d d0, d d1) {
            this.a = d0;
            this.b = d1;
        }

        void a() {
            if(this.get() != 0x8000000000000000L) {
                this.a.onComplete();
            }
        }

        void b(Throwable throwable0) {
            if(this.get() != 0x8000000000000000L) {
                this.a.onError(throwable0);
            }
        }

        void c(Object object0) {
            if(this.get() != 0x8000000000000000L) {
                ++this.c;
                this.a.onNext(object0);
            }
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(this.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
                this.b.a9(this);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                while(true) {
                    long v1 = 0x7FFFFFFFFFFFFFFFL;
                    long v2 = this.get();
                    if(v2 == 0x8000000000000000L || v2 == 0x7FFFFFFFFFFFFFFFL) {
                        break;
                    }
                    long v3 = v2 + v;
                    if(v3 >= 0L) {
                        v1 = v3;
                    }
                    if(this.compareAndSet(v2, v1)) {
                        this.b.Y8();
                        return;
                    }
                }
            }
        }
    }

    final AtomicInteger b;
    final AtomicReference c;
    final AtomicReference d;
    final AtomicBoolean e;
    final int f;
    final int g;
    final boolean h;
    volatile o i;
    volatile boolean j;
    volatile Throwable k;
    int l;
    int m;
    static final io.reactivex.processors.d.a[] n;
    static final io.reactivex.processors.d.a[] o;

    static {
        d.n = new io.reactivex.processors.d.a[0];
        d.o = new io.reactivex.processors.d.a[0];
    }

    d(int v, boolean z) {
        io.reactivex.internal.functions.b.h(v, "bufferSize");
        this.f = v;
        this.g = v - (v >> 2);
        this.b = new AtomicInteger();
        this.d = new AtomicReference(d.n);
        this.c = new AtomicReference();
        this.h = z;
        this.e = new AtomicBoolean();
    }

    // 去混淆评级： 低(20)
    @Override  // io.reactivex.processors.c
    public Throwable O8() {
        return this.e.get() ? this.k : null;
    }

    @Override  // io.reactivex.processors.c
    public boolean P8() {
        return this.e.get() && this.k == null;
    }

    @Override  // io.reactivex.processors.c
    public boolean Q8() {
        return ((io.reactivex.processors.d.a[])this.d.get()).length != 0;
    }

    @Override  // io.reactivex.processors.c
    public boolean R8() {
        return this.e.get() && this.k != null;
    }

    boolean T8(io.reactivex.processors.d.a d$a0) {
        do {
            io.reactivex.processors.d.a[] arr_d$a = (io.reactivex.processors.d.a[])this.d.get();
            if(arr_d$a == d.o) {
                return false;
            }
            io.reactivex.processors.d.a[] arr_d$a1 = new io.reactivex.processors.d.a[arr_d$a.length + 1];
            System.arraycopy(arr_d$a, 0, arr_d$a1, 0, arr_d$a.length);
            arr_d$a1[arr_d$a.length] = d$a0;
        }
        while(!androidx.compose.animation.core.d.a(this.d, arr_d$a, arr_d$a1));
        return true;
    }

    @d3.d
    @f
    public static d U8() {
        return new d(l.a0(), false);
    }

    @d3.d
    @f
    public static d V8(int v) {
        return new d(v, false);
    }

    @d3.d
    @f
    public static d W8(int v, boolean z) {
        return new d(v, z);
    }

    // 去混淆评级： 低(20)
    @d3.d
    @f
    public static d X8(boolean z) {
        return new d(0x80, z);
    }

    void Y8() {
        Object object0;
        boolean z;
        if(this.b.getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference0 = this.d;
        int v = this.l;
        int v1 = this.g;
        int v2 = this.m;
        int v3 = 1;
    alab1:
        while(true) {
            o o0 = this.i;
            if(o0 != null) {
                io.reactivex.processors.d.a[] arr_d$a = (io.reactivex.processors.d.a[])atomicReference0.get();
                if(arr_d$a.length != 0) {
                    int v4 = arr_d$a.length;
                    long v5 = -1L;
                    for(int v6 = 0; v6 < v4; ++v6) {
                        io.reactivex.processors.d.a d$a0 = arr_d$a[v6];
                        long v7 = d$a0.get();
                        if(v7 >= 0L) {
                            v5 = v5 == -1L ? v7 - d$a0.c : Math.min(v5, v7 - d$a0.c);
                        }
                    }
                    int v8 = v;
                    int v9;
                    while((v9 = Long.compare(v5, 0L)) > 0) {
                        io.reactivex.processors.d.a[] arr_d$a1 = (io.reactivex.processors.d.a[])atomicReference0.get();
                        if(arr_d$a1 == d.o) {
                            o0.clear();
                            return;
                        }
                        if(arr_d$a != arr_d$a1) {
                            v = v8;
                            continue alab1;
                        }
                        try {
                            z = this.j;
                            object0 = o0.poll();
                        }
                        catch(Throwable throwable0) {
                            io.reactivex.exceptions.b.b(throwable0);
                            j.a(this.c);
                            this.k = throwable0;
                            this.j = true;
                            object0 = null;
                            z = true;
                        }
                        if(z && object0 == null) {
                            Throwable throwable1 = this.k;
                            if(throwable1 != null) {
                                io.reactivex.processors.d.a[] arr_d$a2 = (io.reactivex.processors.d.a[])atomicReference0.getAndSet(d.o);
                                for(int v10 = 0; v10 < arr_d$a2.length; ++v10) {
                                    arr_d$a2[v10].b(throwable1);
                                }
                                return;
                            }
                            io.reactivex.processors.d.a[] arr_d$a3 = (io.reactivex.processors.d.a[])atomicReference0.getAndSet(d.o);
                            for(int v11 = 0; v11 < arr_d$a3.length; ++v11) {
                                arr_d$a3[v11].a();
                            }
                            return;
                        }
                        if(object0 == null) {
                            break;
                        }
                        int v12 = arr_d$a.length;
                        for(int v13 = 0; v13 < v12; ++v13) {
                            arr_d$a[v13].c(object0);
                        }
                        --v5;
                        if(v2 == 1) {
                        }
                        else if(v8 + 1 == v1) {
                            ((e)this.c.get()).request(((long)v1));
                            v8 = 0;
                        }
                        else {
                            ++v8;
                        }
                    }
                    if(v9 == 0) {
                        io.reactivex.processors.d.a[] arr_d$a4 = (io.reactivex.processors.d.a[])atomicReference0.get();
                        io.reactivex.processors.d.a[] arr_d$a5 = d.o;
                        if(arr_d$a4 == arr_d$a5) {
                            o0.clear();
                            return;
                        }
                        if(arr_d$a != arr_d$a4) {
                            v = v8;
                            continue;
                        }
                        else if(this.j && o0.isEmpty()) {
                            Throwable throwable2 = this.k;
                            if(throwable2 != null) {
                                io.reactivex.processors.d.a[] arr_d$a6 = (io.reactivex.processors.d.a[])atomicReference0.getAndSet(arr_d$a5);
                                for(int v14 = 0; v14 < arr_d$a6.length; ++v14) {
                                    arr_d$a6[v14].b(throwable2);
                                }
                                return;
                            }
                            io.reactivex.processors.d.a[] arr_d$a7 = (io.reactivex.processors.d.a[])atomicReference0.getAndSet(arr_d$a5);
                            for(int v15 = 0; v15 < arr_d$a7.length; ++v15) {
                                arr_d$a7[v15].a();
                            }
                            return;
                        }
                    }
                    v = v8;
                }
            }
            v3 = this.b.addAndGet(-v3);
            if(v3 == 0) {
                break;
            }
        }
    }

    public boolean Z8(Object object0) {
        if(this.e.get()) {
            return false;
        }
        io.reactivex.internal.functions.b.g(object0, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.m == 0 && this.i.offer(object0)) {
            this.Y8();
            return true;
        }
        return false;
    }

    void a9(io.reactivex.processors.d.a d$a0) {
        int v1;
        int v;
        io.reactivex.processors.d.a[] arr_d$a;
    alab1:
        do {
        alab2:
            do {
                while(true) {
                    arr_d$a = (io.reactivex.processors.d.a[])this.d.get();
                    v = arr_d$a.length;
                    if(v == 0) {
                        return;
                    }
                    v1 = 0;
                    while(true) {
                        if(v1 < v) {
                            if(arr_d$a[v1] == d$a0) {
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
                        break alab1;
                    }
                    if(v == 1) {
                        if(this.h) {
                            if(!androidx.compose.animation.core.d.a(this.d, arr_d$a, d.o)) {
                                continue;
                            }
                            break;
                        }
                        else {
                            continue alab2;
                        }
                    }
                    goto label_20;
                }
                j.a(this.c);
                this.e.set(true);
                return;
            }
            while(!androidx.compose.animation.core.d.a(this.d, arr_d$a, d.n));
            return;
        label_20:
            io.reactivex.processors.d.a[] arr_d$a1 = new io.reactivex.processors.d.a[v - 1];
            System.arraycopy(arr_d$a, 0, arr_d$a1, 0, v1);
            System.arraycopy(arr_d$a, v1 + 1, arr_d$a1, v1, v - v1 - 1);
        }
        while(!androidx.compose.animation.core.d.a(this.d, arr_d$a, arr_d$a1));
    }

    public void b9() {
        if(j.h(this.c, g.a)) {
            this.i = new io.reactivex.internal.queue.b(this.f);
        }
    }

    public void c9() {
        if(j.h(this.c, g.a)) {
            this.i = new io.reactivex.internal.queue.c(this.f);
        }
    }

    @Override  // io.reactivex.q, org.reactivestreams.d
    public void g(e e0) {
        if(j.h(this.c, e0)) {
            if(e0 instanceof f3.l) {
                int v = ((f3.l)e0).i(3);
                if(v == 1) {
                    this.m = 1;
                    this.i = (f3.l)e0;
                    this.j = true;
                    this.Y8();
                    return;
                }
                if(v == 2) {
                    this.m = 2;
                    this.i = (f3.l)e0;
                    e0.request(((long)this.f));
                    return;
                }
            }
            this.i = new io.reactivex.internal.queue.b(this.f);
            e0.request(((long)this.f));
        }
    }

    @Override  // io.reactivex.l
    protected void m6(org.reactivestreams.d d0) {
        io.reactivex.processors.d.a d$a0 = new io.reactivex.processors.d.a(d0, this);
        d0.g(d$a0);
        if(this.T8(d$a0)) {
            if(d$a0.get() == 0x8000000000000000L) {
                this.a9(d$a0);
                return;
            }
            this.Y8();
            return;
        }
        if(this.e.get() || !this.h) {
            Throwable throwable0 = this.k;
            if(throwable0 != null) {
                d0.onError(throwable0);
                return;
            }
        }
        d0.onComplete();
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        if(this.e.compareAndSet(false, true)) {
            this.j = true;
            this.Y8();
        }
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        io.reactivex.internal.functions.b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.e.compareAndSet(false, true)) {
            this.k = throwable0;
            this.j = true;
            this.Y8();
            return;
        }
        io.reactivex.plugins.a.Y(throwable0);
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        if(this.e.get()) {
            return;
        }
        if(this.m == 0) {
            io.reactivex.internal.functions.b.g(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if(!this.i.offer(object0)) {
                j.a(this.c);
                this.onError(new io.reactivex.exceptions.c());
                return;
            }
        }
        this.Y8();
    }
}

