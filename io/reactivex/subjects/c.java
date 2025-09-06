package io.reactivex.subjects;

import androidx.compose.animation.core.d;
import d3.g;
import io.reactivex.f;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends io.reactivex.c implements f {
    static final class a extends AtomicReference implements io.reactivex.disposables.c {
        final f a;
        private static final long b = -7650903191002190468L;

        a(f f0, c c0) {
            this.a = f0;
            this.lazySet(c0);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == null;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            c c0 = (c)this.getAndSet(null);
            if(c0 != null) {
                c0.p1(this);
            }
        }
    }

    final AtomicReference a;
    final AtomicBoolean b;
    Throwable c;
    static final a[] d;
    static final a[] e;

    static {
        c.d = new a[0];
        c.e = new a[0];
    }

    c() {
        this.b = new AtomicBoolean();
        this.a = new AtomicReference(c.d);
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a c$a0 = new a(f0, this);
        f0.b(c$a0);
        if(!this.i1(c$a0)) {
            Throwable throwable0 = this.c;
            if(throwable0 != null) {
                f0.onError(throwable0);
                return;
            }
            f0.onComplete();
        }
        else if(c$a0.a()) {
            this.p1(c$a0);
        }
    }

    @Override  // io.reactivex.f
    public void b(io.reactivex.disposables.c c0) {
        if(this.a.get() == c.e) {
            c0.dispose();
        }
    }

    boolean i1(a c$a0) {
        do {
            a[] arr_c$a = (a[])this.a.get();
            if(arr_c$a == c.e) {
                return false;
            }
            a[] arr_c$a1 = new a[arr_c$a.length + 1];
            System.arraycopy(arr_c$a, 0, arr_c$a1, 0, arr_c$a.length);
            arr_c$a1[arr_c$a.length] = c$a0;
        }
        while(!d.a(this.a, arr_c$a, arr_c$a1));
        return true;
    }

    @d3.d
    @d3.f
    public static c j1() {
        return new c();
    }

    @g
    public Throwable k1() {
        return this.a.get() == c.e ? this.c : null;
    }

    public boolean l1() {
        return this.a.get() == c.e && this.c == null;
    }

    public boolean m1() {
        return ((a[])this.a.get()).length != 0;
    }

    public boolean n1() {
        return this.a.get() == c.e && this.c != null;
    }

    int o1() {
        return ((a[])this.a.get()).length;
    }

    @Override  // io.reactivex.f
    public void onComplete() {
        if(this.b.compareAndSet(false, true)) {
            a[] arr_c$a = (a[])this.a.getAndSet(c.e);
            for(int v = 0; v < arr_c$a.length; ++v) {
                arr_c$a[v].a.onComplete();
            }
        }
    }

    @Override  // io.reactivex.f
    public void onError(Throwable throwable0) {
        b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.b.compareAndSet(false, true)) {
            this.c = throwable0;
            a[] arr_c$a = (a[])this.a.getAndSet(c.e);
            for(int v = 0; v < arr_c$a.length; ++v) {
                arr_c$a[v].a.onError(throwable0);
            }
            return;
        }
        io.reactivex.plugins.a.Y(throwable0);
    }

    void p1(a c$a0) {
        a[] arr_c$a1;
        do {
            a[] arr_c$a = (a[])this.a.get();
            int v = arr_c$a.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_c$a[v1] == c$a0) {
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
                arr_c$a1 = c.d;
            }
            else {
                a[] arr_c$a2 = new a[v - 1];
                System.arraycopy(arr_c$a, 0, arr_c$a2, 0, v1);
                System.arraycopy(arr_c$a, v1 + 1, arr_c$a2, v1, v - v1 - 1);
                arr_c$a1 = arr_c$a2;
            }
        }
        while(!d.a(this.a, arr_c$a, arr_c$a1));
    }
}

