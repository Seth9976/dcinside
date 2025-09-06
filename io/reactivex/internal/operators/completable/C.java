package io.reactivex.internal.operators.completable;

import androidx.compose.animation.core.d;
import io.reactivex.f;
import io.reactivex.i;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends io.reactivex.c implements f {
    final class a extends AtomicBoolean implements io.reactivex.disposables.c {
        final f a;
        final c b;
        private static final long c = 0x7C1C7632007DB36CL;

        a(f f0) {
            this.a = f0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get();
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.compareAndSet(false, true)) {
                c.this.j1(this);
            }
        }
    }

    final i a;
    final AtomicReference b;
    final AtomicBoolean c;
    Throwable d;
    static final a[] e;
    static final a[] f;

    static {
        c.e = new a[0];
        c.f = new a[0];
    }

    public c(i i0) {
        this.a = i0;
        this.b = new AtomicReference(c.e);
        this.c = new AtomicBoolean();
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a c$a0 = new a(this, f0);
        f0.b(c$a0);
        if(this.i1(c$a0)) {
            if(c$a0.a()) {
                this.j1(c$a0);
            }
            if(this.c.compareAndSet(false, true)) {
                this.a.e(this);
            }
        }
        else {
            Throwable throwable0 = this.d;
            if(throwable0 != null) {
                f0.onError(throwable0);
                return;
            }
            f0.onComplete();
        }
    }

    @Override  // io.reactivex.f
    public void b(io.reactivex.disposables.c c0) {
    }

    boolean i1(a c$a0) {
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

    void j1(a c$a0) {
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

    @Override  // io.reactivex.f
    public void onComplete() {
        a[] arr_c$a = (a[])this.b.getAndSet(c.f);
        for(int v = 0; v < arr_c$a.length; ++v) {
            a c$a0 = arr_c$a[v];
            if(!c$a0.get()) {
                c$a0.a.onComplete();
            }
        }
    }

    @Override  // io.reactivex.f
    public void onError(Throwable throwable0) {
        this.d = throwable0;
        a[] arr_c$a = (a[])this.b.getAndSet(c.f);
        for(int v = 0; v < arr_c$a.length; ++v) {
            a c$a0 = arr_c$a[v];
            if(!c$a0.get()) {
                c$a0.a.onError(throwable0);
            }
        }
    }
}

