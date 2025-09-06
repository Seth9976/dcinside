package io.reactivex.internal.operators.single;

import androidx.compose.animation.core.d;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class b extends K implements N {
    static final class a extends AtomicBoolean implements c {
        final N a;
        final b b;
        private static final long c = 0x6848778996CDF194L;

        a(N n0, b b0) {
            this.a = n0;
            this.b = b0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get();
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.compareAndSet(false, true)) {
                this.b.P1(this);
            }
        }
    }

    final Q a;
    final AtomicInteger b;
    final AtomicReference c;
    Object d;
    Throwable e;
    static final a[] f;
    static final a[] g;

    static {
        b.f = new a[0];
        b.g = new a[0];
    }

    public b(Q q0) {
        this.a = q0;
        this.b = new AtomicInteger();
        this.c = new AtomicReference(b.f);
    }

    boolean O1(a b$a0) {
        do {
            a[] arr_b$a = (a[])this.c.get();
            if(arr_b$a == b.g) {
                return false;
            }
            a[] arr_b$a1 = new a[arr_b$a.length + 1];
            System.arraycopy(arr_b$a, 0, arr_b$a1, 0, arr_b$a.length);
            arr_b$a1[arr_b$a.length] = b$a0;
        }
        while(!d.a(this.c, arr_b$a, arr_b$a1));
        return true;
    }

    void P1(a b$a0) {
        a[] arr_b$a1;
        do {
            a[] arr_b$a = (a[])this.c.get();
            int v = arr_b$a.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_b$a[v1] == b$a0) {
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
                arr_b$a1 = b.f;
            }
            else {
                a[] arr_b$a2 = new a[v - 1];
                System.arraycopy(arr_b$a, 0, arr_b$a2, 0, v1);
                System.arraycopy(arr_b$a, v1 + 1, arr_b$a2, v1, v - v1 - 1);
                arr_b$a1 = arr_b$a2;
            }
        }
        while(!d.a(this.c, arr_b$a, arr_b$a1));
    }

    @Override  // io.reactivex.N
    public void b(c c0) {
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a b$a0 = new a(n0, this);
        n0.b(b$a0);
        if(this.O1(b$a0)) {
            if(b$a0.a()) {
                this.P1(b$a0);
            }
            if(this.b.getAndIncrement() == 0) {
                this.a.e(this);
            }
            return;
        }
        Throwable throwable0 = this.e;
        if(throwable0 != null) {
            n0.onError(throwable0);
            return;
        }
        n0.onSuccess(this.d);
    }

    @Override  // io.reactivex.N
    public void onError(Throwable throwable0) {
        this.e = throwable0;
        a[] arr_b$a = (a[])this.c.getAndSet(b.g);
        for(int v = 0; v < arr_b$a.length; ++v) {
            a b$a0 = arr_b$a[v];
            if(!b$a0.a()) {
                b$a0.a.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.N
    public void onSuccess(Object object0) {
        this.d = object0;
        a[] arr_b$a = (a[])this.c.getAndSet(b.g);
        for(int v = 0; v < arr_b$a.length; ++v) {
            a b$a0 = arr_b$a[v];
            if(!b$a0.a()) {
                b$a0.a.onSuccess(object0);
            }
        }
    }
}

