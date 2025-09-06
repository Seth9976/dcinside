package io.reactivex.subjects;

import androidx.compose.animation.core.d;
import d3.f;
import d3.g;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class h extends K implements N {
    static final class a extends AtomicReference implements c {
        final N a;
        private static final long b = -7650903191002190468L;

        a(N n0, h h0) {
            this.a = n0;
            this.lazySet(h0);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == null;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            h h0 = (h)this.getAndSet(null);
            if(h0 != null) {
                h0.W1(this);
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
        h.e = new a[0];
        h.f = new a[0];
    }

    h() {
        this.b = new AtomicBoolean();
        this.a = new AtomicReference(h.e);
    }

    boolean O1(@f a h$a0) {
        do {
            a[] arr_h$a = (a[])this.a.get();
            if(arr_h$a == h.f) {
                return false;
            }
            a[] arr_h$a1 = new a[arr_h$a.length + 1];
            System.arraycopy(arr_h$a, 0, arr_h$a1, 0, arr_h$a.length);
            arr_h$a1[arr_h$a.length] = h$a0;
        }
        while(!d.a(this.a, arr_h$a, arr_h$a1));
        return true;
    }

    @d3.d
    @f
    public static h P1() {
        return new h();
    }

    @g
    public Throwable Q1() {
        return this.a.get() == h.f ? this.d : null;
    }

    @g
    public Object R1() {
        return this.a.get() == h.f ? this.c : null;
    }

    public boolean S1() {
        return ((a[])this.a.get()).length != 0;
    }

    public boolean T1() {
        return this.a.get() == h.f && this.d != null;
    }

    public boolean U1() {
        return this.a.get() == h.f && this.c != null;
    }

    int V1() {
        return ((a[])this.a.get()).length;
    }

    void W1(@f a h$a0) {
        a[] arr_h$a1;
        do {
            a[] arr_h$a = (a[])this.a.get();
            int v = arr_h$a.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_h$a[v1] == h$a0) {
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
                arr_h$a1 = h.e;
            }
            else {
                a[] arr_h$a2 = new a[v - 1];
                System.arraycopy(arr_h$a, 0, arr_h$a2, 0, v1);
                System.arraycopy(arr_h$a, v1 + 1, arr_h$a2, v1, v - v1 - 1);
                arr_h$a1 = arr_h$a2;
            }
        }
        while(!d.a(this.a, arr_h$a, arr_h$a1));
    }

    @Override  // io.reactivex.N
    public void b(@f c c0) {
        if(this.a.get() == h.f) {
            c0.dispose();
        }
    }

    @Override  // io.reactivex.K
    protected void c1(@f N n0) {
        a h$a0 = new a(n0, this);
        n0.b(h$a0);
        if(!this.O1(h$a0)) {
            Throwable throwable0 = this.d;
            if(throwable0 != null) {
                n0.onError(throwable0);
                return;
            }
            n0.onSuccess(this.c);
        }
        else if(h$a0.a()) {
            this.W1(h$a0);
        }
    }

    @Override  // io.reactivex.N
    public void onError(@f Throwable throwable0) {
        b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.b.compareAndSet(false, true)) {
            this.d = throwable0;
            a[] arr_h$a = (a[])this.a.getAndSet(h.f);
            for(int v = 0; v < arr_h$a.length; ++v) {
                arr_h$a[v].a.onError(throwable0);
            }
            return;
        }
        io.reactivex.plugins.a.Y(throwable0);
    }

    @Override  // io.reactivex.N
    public void onSuccess(@f Object object0) {
        b.g(object0, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.b.compareAndSet(false, true)) {
            this.c = object0;
            a[] arr_h$a = (a[])this.a.getAndSet(h.f);
            for(int v = 0; v < arr_h$a.length; ++v) {
                arr_h$a[v].a.onSuccess(object0);
            }
        }
    }
}

