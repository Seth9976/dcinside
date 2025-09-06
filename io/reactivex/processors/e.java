package io.reactivex.processors;

import d3.f;
import d3.g;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;

public final class e extends c {
    static final class a extends AtomicLong implements org.reactivestreams.e {
        final d a;
        final e b;
        private static final long c = 0x3171D4005EBF93FEL;

        a(d d0, e e0) {
            this.a = d0;
            this.b = e0;
        }

        public boolean a() {
            return this.get() == 0x8000000000000000L;
        }

        boolean b() {
            return this.get() == 0L;
        }

        public void c() {
            if(this.get() != 0x8000000000000000L) {
                this.a.onComplete();
            }
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(this.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
                this.b.W8(this);
            }
        }

        public void d(Throwable throwable0) {
            if(this.get() != 0x8000000000000000L) {
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        public void e(Object object0) {
            long v = this.get();
            if(v == 0x8000000000000000L) {
                return;
            }
            if(v != 0L) {
                this.a.onNext(object0);
                io.reactivex.internal.util.d.f(this, 1L);
                return;
            }
            this.cancel();
            io.reactivex.exceptions.c c0 = new io.reactivex.exceptions.c("Could not emit value due to lack of requests");
            this.a.onError(c0);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.b(this, v);
            }
        }
    }

    final AtomicReference b;
    Throwable c;
    static final a[] d;
    static final a[] e;

    static {
        e.d = new a[0];
        e.e = new a[0];
    }

    e() {
        this.b = new AtomicReference(e.e);
    }

    @Override  // io.reactivex.processors.c
    @g
    public Throwable O8() {
        return this.b.get() == e.d ? this.c : null;
    }

    @Override  // io.reactivex.processors.c
    public boolean P8() {
        return this.b.get() == e.d && this.c == null;
    }

    @Override  // io.reactivex.processors.c
    public boolean Q8() {
        return ((a[])this.b.get()).length != 0;
    }

    @Override  // io.reactivex.processors.c
    public boolean R8() {
        return this.b.get() == e.d && this.c != null;
    }

    boolean T8(a e$a0) {
        do {
            a[] arr_e$a = (a[])this.b.get();
            if(arr_e$a == e.d) {
                return false;
            }
            a[] arr_e$a1 = new a[arr_e$a.length + 1];
            System.arraycopy(arr_e$a, 0, arr_e$a1, 0, arr_e$a.length);
            arr_e$a1[arr_e$a.length] = e$a0;
        }
        while(!androidx.compose.animation.core.d.a(this.b, arr_e$a, arr_e$a1));
        return true;
    }

    @d3.d
    @f
    public static e U8() {
        return new e();
    }

    public boolean V8(Object object0) {
        if(object0 == null) {
            this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        a[] arr_e$a = (a[])this.b.get();
        for(int v1 = 0; v1 < arr_e$a.length; ++v1) {
            if(arr_e$a[v1].b()) {
                return false;
            }
        }
        for(int v = 0; v < arr_e$a.length; ++v) {
            arr_e$a[v].e(object0);
        }
        return true;
    }

    void W8(a e$a0) {
        a[] arr_e$a1;
        do {
            a[] arr_e$a = (a[])this.b.get();
            if(arr_e$a == e.d || arr_e$a == e.e) {
                break;
            }
            int v = arr_e$a.length;
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_e$a[v1] == e$a0) {
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
                arr_e$a1 = e.e;
            }
            else {
                a[] arr_e$a2 = new a[v - 1];
                System.arraycopy(arr_e$a, 0, arr_e$a2, 0, v1);
                System.arraycopy(arr_e$a, v1 + 1, arr_e$a2, v1, v - v1 - 1);
                arr_e$a1 = arr_e$a2;
            }
        }
        while(!androidx.compose.animation.core.d.a(this.b, arr_e$a, arr_e$a1));
    }

    @Override  // io.reactivex.q, org.reactivestreams.d
    public void g(org.reactivestreams.e e0) {
        if(this.b.get() == e.d) {
            e0.cancel();
            return;
        }
        e0.request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        a e$a0 = new a(d0, this);
        d0.g(e$a0);
        if(!this.T8(e$a0)) {
            Throwable throwable0 = this.c;
            if(throwable0 != null) {
                d0.onError(throwable0);
                return;
            }
            d0.onComplete();
        }
        else if(e$a0.a()) {
            this.W8(e$a0);
        }
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        Object object0 = this.b.get();
        a[] arr_e$a = e.d;
        if(object0 == arr_e$a) {
            return;
        }
        a[] arr_e$a1 = (a[])this.b.getAndSet(arr_e$a);
        for(int v = 0; v < arr_e$a1.length; ++v) {
            arr_e$a1[v].c();
        }
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object object0 = this.b.get();
        a[] arr_e$a = e.d;
        if(object0 == arr_e$a) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        this.c = throwable0;
        a[] arr_e$a1 = (a[])this.b.getAndSet(arr_e$a);
        for(int v = 0; v < arr_e$a1.length; ++v) {
            arr_e$a1[v].d(throwable0);
        }
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        b.g(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        a[] arr_e$a = (a[])this.b.get();
        for(int v = 0; v < arr_e$a.length; ++v) {
            arr_e$a[v].e(object0);
        }
    }
}

