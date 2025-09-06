package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class r extends a implements q {
    static final class io.reactivex.internal.operators.flowable.r.a extends AtomicInteger implements e {
        final d a;
        final r b;
        final AtomicLong c;
        b d;
        int e;
        long f;
        private static final long g = 0x5DF4BA2BA2D80AFAL;

        io.reactivex.internal.operators.flowable.r.a(d d0, r r0) {
            this.a = d0;
            this.b = r0;
            this.d = r0.g;
            this.c = new AtomicLong();
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(this.c.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
                this.b.S8(this);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.b(this.c, v);
                this.b.T8(this);
            }
        }
    }

    static final class b {
        final Object[] a;
        volatile b b;

        b(int v) {
            this.a = new Object[v];
        }
    }

    final AtomicBoolean c;
    final int d;
    final AtomicReference e;
    volatile long f;
    final b g;
    b h;
    int i;
    Throwable j;
    volatile boolean k;
    static final io.reactivex.internal.operators.flowable.r.a[] l;
    static final io.reactivex.internal.operators.flowable.r.a[] m;

    static {
        r.l = new io.reactivex.internal.operators.flowable.r.a[0];
        r.m = new io.reactivex.internal.operators.flowable.r.a[0];
    }

    public r(l l0, int v) {
        super(l0);
        this.d = v;
        this.c = new AtomicBoolean();
        b r$b0 = new b(v);
        this.g = r$b0;
        this.h = r$b0;
        this.e = new AtomicReference(r.l);
    }

    void O8(io.reactivex.internal.operators.flowable.r.a r$a0) {
        do {
            io.reactivex.internal.operators.flowable.r.a[] arr_r$a = (io.reactivex.internal.operators.flowable.r.a[])this.e.get();
            if(arr_r$a == r.m) {
                return;
            }
            io.reactivex.internal.operators.flowable.r.a[] arr_r$a1 = new io.reactivex.internal.operators.flowable.r.a[arr_r$a.length + 1];
            System.arraycopy(arr_r$a, 0, arr_r$a1, 0, arr_r$a.length);
            arr_r$a1[arr_r$a.length] = r$a0;
        }
        while(!androidx.compose.animation.core.d.a(this.e, arr_r$a, arr_r$a1));
    }

    long P8() {
        return this.f;
    }

    boolean Q8() {
        return ((io.reactivex.internal.operators.flowable.r.a[])this.e.get()).length != 0;
    }

    boolean R8() {
        return this.c.get();
    }

    void S8(io.reactivex.internal.operators.flowable.r.a r$a0) {
        io.reactivex.internal.operators.flowable.r.a[] arr_r$a1;
        do {
            io.reactivex.internal.operators.flowable.r.a[] arr_r$a = (io.reactivex.internal.operators.flowable.r.a[])this.e.get();
            int v = arr_r$a.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_r$a[v1] == r$a0) {
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
                arr_r$a1 = r.l;
            }
            else {
                io.reactivex.internal.operators.flowable.r.a[] arr_r$a2 = new io.reactivex.internal.operators.flowable.r.a[v - 1];
                System.arraycopy(arr_r$a, 0, arr_r$a2, 0, v1);
                System.arraycopy(arr_r$a, v1 + 1, arr_r$a2, v1, v - v1 - 1);
                arr_r$a1 = arr_r$a2;
            }
        }
        while(!androidx.compose.animation.core.d.a(this.e, arr_r$a, arr_r$a1));
    }

    void T8(io.reactivex.internal.operators.flowable.r.a r$a0) {
        if(r$a0.getAndIncrement() != 0) {
            return;
        }
        long v = r$a0.f;
        int v1 = r$a0.e;
        b r$b0 = r$a0.d;
        AtomicLong atomicLong0 = r$a0.c;
        d d0 = r$a0.a;
        int v2 = this.d;
        int v3 = 1;
        while(true) {
            boolean z = this.f == v;
            if(this.k && z) {
                r$a0.d = null;
                Throwable throwable0 = this.j;
                if(throwable0 != null) {
                    d0.onError(throwable0);
                    return;
                }
                d0.onComplete();
                return;
            }
            if(!z) {
                long v4 = atomicLong0.get();
                if(v4 == 0x8000000000000000L) {
                    r$a0.d = null;
                    return;
                }
                if(v4 != v) {
                    if(v1 == v2) {
                        r$b0 = r$b0.b;
                        v1 = 0;
                    }
                    d0.onNext(r$b0.a[v1]);
                    ++v1;
                    ++v;
                    continue;
                }
            }
            r$a0.f = v;
            r$a0.e = v1;
            r$a0.d = r$b0;
            v3 = r$a0.addAndGet(-v3);
            if(v3 == 0) {
                break;
            }
        }
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        e0.request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.r.a r$a0 = new io.reactivex.internal.operators.flowable.r.a(d0, this);
        d0.g(r$a0);
        this.O8(r$a0);
        if(!this.c.get() && this.c.compareAndSet(false, true)) {
            this.b.l6(this);
            return;
        }
        this.T8(r$a0);
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        this.k = true;
        io.reactivex.internal.operators.flowable.r.a[] arr_r$a = (io.reactivex.internal.operators.flowable.r.a[])this.e.getAndSet(r.m);
        for(int v = 0; v < arr_r$a.length; ++v) {
            this.T8(arr_r$a[v]);
        }
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        if(this.k) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        this.j = throwable0;
        this.k = true;
        io.reactivex.internal.operators.flowable.r.a[] arr_r$a = (io.reactivex.internal.operators.flowable.r.a[])this.e.getAndSet(r.m);
        for(int v = 0; v < arr_r$a.length; ++v) {
            this.T8(arr_r$a[v]);
        }
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        int v = this.i;
        if(v == this.d) {
            b r$b0 = new b(v);
            r$b0.a[0] = object0;
            this.i = 1;
            this.h.b = r$b0;
            this.h = r$b0;
        }
        else {
            this.h.a[v] = object0;
            this.i = v + 1;
        }
        ++this.f;
        io.reactivex.internal.operators.flowable.r.a[] arr_r$a = (io.reactivex.internal.operators.flowable.r.a[])this.e.get();
        for(int v1 = 0; v1 < arr_r$a.length; ++v1) {
            this.T8(arr_r$a[v1]);
        }
    }
}

