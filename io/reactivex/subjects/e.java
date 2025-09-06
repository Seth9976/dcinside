package io.reactivex.subjects;

import androidx.compose.animation.core.d;
import d3.f;
import d3.g;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class e extends i {
    static final class a extends AtomicBoolean implements c {
        final I a;
        final e b;
        private static final long c = 0x3171D4005EBF93FEL;

        a(I i0, e e0) {
            this.a = i0;
            this.b = e0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get();
        }

        public void b() {
            if(!this.get()) {
                this.a.onComplete();
            }
        }

        public void c(Throwable throwable0) {
            if(this.get()) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.a.onError(throwable0);
        }

        public void d(Object object0) {
            if(!this.get()) {
                this.a.onNext(object0);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.compareAndSet(false, true)) {
                this.b.p8(this);
            }
        }
    }

    final AtomicReference a;
    Throwable b;
    static final a[] c;
    static final a[] d;

    static {
        e.c = new a[0];
        e.d = new a[0];
    }

    e() {
        this.a = new AtomicReference(e.d);
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        a e$a0 = new a(i0, this);
        i0.b(e$a0);
        if(!this.n8(e$a0)) {
            Throwable throwable0 = this.b;
            if(throwable0 != null) {
                i0.onError(throwable0);
                return;
            }
            i0.onComplete();
        }
        else if(e$a0.a()) {
            this.p8(e$a0);
        }
    }

    @Override  // io.reactivex.I
    public void b(c c0) {
        if(this.a.get() == e.c) {
            c0.dispose();
        }
    }

    @Override  // io.reactivex.subjects.i
    @g
    public Throwable i8() {
        return this.a.get() == e.c ? this.b : null;
    }

    @Override  // io.reactivex.subjects.i
    public boolean j8() {
        return this.a.get() == e.c && this.b == null;
    }

    @Override  // io.reactivex.subjects.i
    public boolean k8() {
        return ((a[])this.a.get()).length != 0;
    }

    @Override  // io.reactivex.subjects.i
    public boolean l8() {
        return this.a.get() == e.c && this.b != null;
    }

    boolean n8(a e$a0) {
        do {
            a[] arr_e$a = (a[])this.a.get();
            if(arr_e$a == e.c) {
                return false;
            }
            a[] arr_e$a1 = new a[arr_e$a.length + 1];
            System.arraycopy(arr_e$a, 0, arr_e$a1, 0, arr_e$a.length);
            arr_e$a1[arr_e$a.length] = e$a0;
        }
        while(!d.a(this.a, arr_e$a, arr_e$a1));
        return true;
    }

    @d3.d
    @f
    public static e o8() {
        return new e();
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        Object object0 = this.a.get();
        a[] arr_e$a = e.c;
        if(object0 == arr_e$a) {
            return;
        }
        a[] arr_e$a1 = (a[])this.a.getAndSet(arr_e$a);
        for(int v = 0; v < arr_e$a1.length; ++v) {
            arr_e$a1[v].b();
        }
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object object0 = this.a.get();
        a[] arr_e$a = e.c;
        if(object0 == arr_e$a) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        this.b = throwable0;
        a[] arr_e$a1 = (a[])this.a.getAndSet(arr_e$a);
        for(int v = 0; v < arr_e$a1.length; ++v) {
            arr_e$a1[v].c(throwable0);
        }
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        b.g(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        a[] arr_e$a = (a[])this.a.get();
        for(int v = 0; v < arr_e$a.length; ++v) {
            arr_e$a[v].d(object0);
        }
    }

    void p8(a e$a0) {
        a[] arr_e$a1;
        do {
            a[] arr_e$a = (a[])this.a.get();
            if(arr_e$a == e.c || arr_e$a == e.d) {
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
                arr_e$a1 = e.d;
            }
            else {
                a[] arr_e$a2 = new a[v - 1];
                System.arraycopy(arr_e$a, 0, arr_e$a2, 0, v1);
                System.arraycopy(arr_e$a, v1 + 1, arr_e$a2, v1, v - v1 - 1);
                arr_e$a1 = arr_e$a2;
            }
        }
        while(!d.a(this.a, arr_e$a, arr_e$a1));
    }
}

