package io.reactivex.internal.operators.maybe;

import androidx.compose.animation.core.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends s implements v {
    static final class a extends AtomicReference implements io.reactivex.disposables.c {
        final v a;
        private static final long b = 0xAF9F345921498E0DL;

        a(v v0, c c0) {
            super(c0);
            this.a = v0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == null;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            c c0 = (c)this.getAndSet(null);
            if(c0 != null) {
                c0.g2(this);
            }
        }
    }

    final AtomicReference a;
    final AtomicReference b;
    Object c;
    Throwable d;
    static final a[] e;
    static final a[] f;

    static {
        c.e = new a[0];
        c.f = new a[0];
    }

    public c(y y0) {
        this.a = new AtomicReference(y0);
        this.b = new AtomicReference(c.e);
    }

    @Override  // io.reactivex.v
    public void b(io.reactivex.disposables.c c0) {
    }

    boolean f2(a c$a0) {
        do {
            a[] arr_c$a = (a[])this.b.get();
            if(arr_c$a == c.f) {
                return false;
            }
            a[] arr_c$a1 = new a[arr_c$a.length + 1];
            System.arraycopy(arr_c$a, 0, arr_c$a1, 0, arr_c$a.length);
            arr_c$a1[arr_c$a.length] = c$a0;
        }
        while(!d.a(this.b, arr_c$a, arr_c$a1));
        return true;
    }

    void g2(a c$a0) {
        a[] arr_c$a1;
        do {
            a[] arr_c$a = (a[])this.b.get();
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
                arr_c$a1 = c.e;
            }
            else {
                a[] arr_c$a2 = new a[v - 1];
                System.arraycopy(arr_c$a, 0, arr_c$a2, 0, v1);
                System.arraycopy(arr_c$a, v1 + 1, arr_c$a2, v1, v - v1 - 1);
                arr_c$a1 = arr_c$a2;
            }
        }
        while(!d.a(this.b, arr_c$a, arr_c$a1));
    }

    @Override  // io.reactivex.v
    public void onComplete() {
        a[] arr_c$a = (a[])this.b.getAndSet(c.f);
        for(int v = 0; v < arr_c$a.length; ++v) {
            a c$a0 = arr_c$a[v];
            if(!c$a0.a()) {
                c$a0.a.onComplete();
            }
        }
    }

    @Override  // io.reactivex.v
    public void onError(Throwable throwable0) {
        this.d = throwable0;
        a[] arr_c$a = (a[])this.b.getAndSet(c.f);
        for(int v = 0; v < arr_c$a.length; ++v) {
            a c$a0 = arr_c$a[v];
            if(!c$a0.a()) {
                c$a0.a.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.v
    public void onSuccess(Object object0) {
        this.c = object0;
        a[] arr_c$a = (a[])this.b.getAndSet(c.f);
        for(int v = 0; v < arr_c$a.length; ++v) {
            a c$a0 = arr_c$a[v];
            if(!c$a0.a()) {
                c$a0.a.onSuccess(object0);
            }
        }
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        a c$a0 = new a(v0, this);
        v0.b(c$a0);
        if(this.f2(c$a0)) {
            if(c$a0.a()) {
                this.g2(c$a0);
                return;
            }
            y y0 = (y)this.a.getAndSet(null);
            if(y0 != null) {
                y0.a(this);
            }
            return;
        }
        if(!c$a0.a()) {
            Throwable throwable0 = this.d;
            if(throwable0 != null) {
                v0.onError(throwable0);
                return;
            }
            Object object0 = this.c;
            if(object0 != null) {
                v0.onSuccess(object0);
                return;
            }
            v0.onComplete();
        }
    }
}

