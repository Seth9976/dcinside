package io.reactivex.internal.operators.observable;

import androidx.compose.animation.core.d;
import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class r extends a implements I {
    static final class io.reactivex.internal.operators.observable.r.a extends AtomicInteger implements c {
        final I a;
        final r b;
        b c;
        int d;
        long e;
        volatile boolean f;
        private static final long g = 0x5DF4BA2BA2D80AFAL;

        io.reactivex.internal.operators.observable.r.a(I i0, r r0) {
            this.a = i0;
            this.b = r0;
            this.c = r0.f;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.f;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.f) {
                this.f = true;
                this.b.m8(this);
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

    final AtomicBoolean b;
    final int c;
    final AtomicReference d;
    volatile long e;
    final b f;
    b g;
    int h;
    Throwable i;
    volatile boolean j;
    static final io.reactivex.internal.operators.observable.r.a[] k;
    static final io.reactivex.internal.operators.observable.r.a[] l;

    static {
        r.k = new io.reactivex.internal.operators.observable.r.a[0];
        r.l = new io.reactivex.internal.operators.observable.r.a[0];
    }

    public r(B b0, int v) {
        super(b0);
        this.c = v;
        this.b = new AtomicBoolean();
        b r$b0 = new b(v);
        this.f = r$b0;
        this.g = r$b0;
        this.d = new AtomicReference(r.k);
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.internal.operators.observable.r.a r$a0 = new io.reactivex.internal.operators.observable.r.a(i0, this);
        i0.b(r$a0);
        this.i8(r$a0);
        if(!this.b.get() && this.b.compareAndSet(false, true)) {
            this.a.d(this);
            return;
        }
        this.n8(r$a0);
    }

    @Override  // io.reactivex.I
    public void b(c c0) {
    }

    void i8(io.reactivex.internal.operators.observable.r.a r$a0) {
        do {
            io.reactivex.internal.operators.observable.r.a[] arr_r$a = (io.reactivex.internal.operators.observable.r.a[])this.d.get();
            if(arr_r$a == r.l) {
                return;
            }
            io.reactivex.internal.operators.observable.r.a[] arr_r$a1 = new io.reactivex.internal.operators.observable.r.a[arr_r$a.length + 1];
            System.arraycopy(arr_r$a, 0, arr_r$a1, 0, arr_r$a.length);
            arr_r$a1[arr_r$a.length] = r$a0;
        }
        while(!d.a(this.d, arr_r$a, arr_r$a1));
    }

    long j8() {
        return this.e;
    }

    boolean k8() {
        return ((io.reactivex.internal.operators.observable.r.a[])this.d.get()).length != 0;
    }

    boolean l8() {
        return this.b.get();
    }

    void m8(io.reactivex.internal.operators.observable.r.a r$a0) {
        io.reactivex.internal.operators.observable.r.a[] arr_r$a1;
        do {
            io.reactivex.internal.operators.observable.r.a[] arr_r$a = (io.reactivex.internal.operators.observable.r.a[])this.d.get();
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
                arr_r$a1 = r.k;
            }
            else {
                io.reactivex.internal.operators.observable.r.a[] arr_r$a2 = new io.reactivex.internal.operators.observable.r.a[v - 1];
                System.arraycopy(arr_r$a, 0, arr_r$a2, 0, v1);
                System.arraycopy(arr_r$a, v1 + 1, arr_r$a2, v1, v - v1 - 1);
                arr_r$a1 = arr_r$a2;
            }
        }
        while(!d.a(this.d, arr_r$a, arr_r$a1));
    }

    void n8(io.reactivex.internal.operators.observable.r.a r$a0) {
        if(r$a0.getAndIncrement() != 0) {
            return;
        }
        long v = r$a0.e;
        int v1 = r$a0.d;
        b r$b0 = r$a0.c;
        I i0 = r$a0.a;
        int v2 = this.c;
        int v3 = 1;
        while(true) {
            if(r$a0.f) {
                r$a0.c = null;
                return;
            }
            boolean z = this.e == v;
            if(this.j && z) {
                r$a0.c = null;
                Throwable throwable0 = this.i;
                if(throwable0 != null) {
                    i0.onError(throwable0);
                    return;
                }
                i0.onComplete();
                return;
            }
            if(z) {
                r$a0.e = v;
                r$a0.d = v1;
                r$a0.c = r$b0;
                v3 = r$a0.addAndGet(-v3);
                if(v3 == 0) {
                    break;
                }
            }
            else {
                if(v1 == v2) {
                    r$b0 = r$b0.b;
                    v1 = 0;
                }
                i0.onNext(r$b0.a[v1]);
                ++v1;
                ++v;
            }
        }
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        this.j = true;
        io.reactivex.internal.operators.observable.r.a[] arr_r$a = (io.reactivex.internal.operators.observable.r.a[])this.d.getAndSet(r.l);
        for(int v = 0; v < arr_r$a.length; ++v) {
            this.n8(arr_r$a[v]);
        }
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        this.i = throwable0;
        this.j = true;
        io.reactivex.internal.operators.observable.r.a[] arr_r$a = (io.reactivex.internal.operators.observable.r.a[])this.d.getAndSet(r.l);
        for(int v = 0; v < arr_r$a.length; ++v) {
            this.n8(arr_r$a[v]);
        }
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        int v = this.h;
        if(v == this.c) {
            b r$b0 = new b(v);
            r$b0.a[0] = object0;
            this.h = 1;
            this.g.b = r$b0;
            this.g = r$b0;
        }
        else {
            this.g.a[v] = object0;
            this.h = v + 1;
        }
        ++this.e;
        io.reactivex.internal.operators.observable.r.a[] arr_r$a = (io.reactivex.internal.operators.observable.r.a[])this.d.get();
        for(int v1 = 0; v1 < arr_r$a.length; ++v1) {
            this.n8(arr_r$a[v1]);
        }
    }
}

