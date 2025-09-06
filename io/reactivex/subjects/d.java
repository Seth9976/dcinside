package io.reactivex.subjects;

import d3.f;
import d3.g;
import io.reactivex.disposables.c;
import io.reactivex.internal.functions.b;
import io.reactivex.s;
import io.reactivex.v;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class d extends s implements v {
    static final class a extends AtomicReference implements c {
        final v a;
        private static final long b = -7650903191002190468L;

        a(v v0, d d0) {
            this.a = v0;
            this.lazySet(d0);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == null;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d d0 = (d)this.getAndSet(null);
            if(d0 != null) {
                d0.o2(this);
            }
        }
    }

    final AtomicReference a;
    final AtomicBoolean b;
    Object c;
    Throwable d;
    static final a[] e;
    static final a[] f;

    static {
        d.e = new a[0];
        d.f = new a[0];
    }

    d() {
        this.b = new AtomicBoolean();
        this.a = new AtomicReference(d.e);
    }

    @Override  // io.reactivex.v
    public void b(c c0) {
        if(this.a.get() == d.f) {
            c0.dispose();
        }
    }

    boolean f2(a d$a0) {
        do {
            a[] arr_d$a = (a[])this.a.get();
            if(arr_d$a == d.f) {
                return false;
            }
            a[] arr_d$a1 = new a[arr_d$a.length + 1];
            System.arraycopy(arr_d$a, 0, arr_d$a1, 0, arr_d$a.length);
            arr_d$a1[arr_d$a.length] = d$a0;
        }
        while(!androidx.compose.animation.core.d.a(this.a, arr_d$a, arr_d$a1));
        return true;
    }

    @d3.d
    @f
    public static d g2() {
        return new d();
    }

    @g
    public Throwable h2() {
        return this.a.get() == d.f ? this.d : null;
    }

    @g
    public Object i2() {
        return this.a.get() == d.f ? this.c : null;
    }

    public boolean j2() {
        return this.a.get() == d.f && this.c == null && this.d == null;
    }

    public boolean k2() {
        return ((a[])this.a.get()).length != 0;
    }

    public boolean l2() {
        return this.a.get() == d.f && this.d != null;
    }

    public boolean m2() {
        return this.a.get() == d.f && this.c != null;
    }

    int n2() {
        return ((a[])this.a.get()).length;
    }

    void o2(a d$a0) {
        a[] arr_d$a1;
        do {
            a[] arr_d$a = (a[])this.a.get();
            int v = arr_d$a.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
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
                return;
            }
            if(v == 1) {
                arr_d$a1 = d.e;
            }
            else {
                a[] arr_d$a2 = new a[v - 1];
                System.arraycopy(arr_d$a, 0, arr_d$a2, 0, v1);
                System.arraycopy(arr_d$a, v1 + 1, arr_d$a2, v1, v - v1 - 1);
                arr_d$a1 = arr_d$a2;
            }
        }
        while(!androidx.compose.animation.core.d.a(this.a, arr_d$a, arr_d$a1));
    }

    @Override  // io.reactivex.v
    public void onComplete() {
        if(this.b.compareAndSet(false, true)) {
            a[] arr_d$a = (a[])this.a.getAndSet(d.f);
            for(int v = 0; v < arr_d$a.length; ++v) {
                arr_d$a[v].a.onComplete();
            }
        }
    }

    @Override  // io.reactivex.v
    public void onError(Throwable throwable0) {
        b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.b.compareAndSet(false, true)) {
            this.d = throwable0;
            a[] arr_d$a = (a[])this.a.getAndSet(d.f);
            for(int v = 0; v < arr_d$a.length; ++v) {
                arr_d$a[v].a.onError(throwable0);
            }
            return;
        }
        io.reactivex.plugins.a.Y(throwable0);
    }

    @Override  // io.reactivex.v
    public void onSuccess(Object object0) {
        b.g(object0, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.b.compareAndSet(false, true)) {
            this.c = object0;
            a[] arr_d$a = (a[])this.a.getAndSet(d.f);
            for(int v = 0; v < arr_d$a.length; ++v) {
                arr_d$a[v].a.onSuccess(object0);
            }
        }
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        a d$a0 = new a(v0, this);
        v0.b(d$a0);
        if(!this.f2(d$a0)) {
            Throwable throwable0 = this.d;
            if(throwable0 != null) {
                v0.onError(throwable0);
                return;
            }
            Object object0 = this.c;
            if(object0 == null) {
                v0.onComplete();
                return;
            }
            v0.onSuccess(object0);
        }
        else if(d$a0.a()) {
            this.o2(d$a0);
        }
    }
}

