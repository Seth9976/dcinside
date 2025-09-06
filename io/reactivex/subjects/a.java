package io.reactivex.subjects;

import androidx.compose.animation.core.d;
import d3.f;
import d3.g;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.observers.l;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class a extends i {
    static final class io.reactivex.subjects.a.a extends l {
        final a j;
        private static final long k = 0x4E215678802BC8D0L;

        io.reactivex.subjects.a.a(I i0, a a0) {
            super(i0);
            this.j = a0;
        }

        @Override  // io.reactivex.internal.observers.l
        public void dispose() {
            if(super.f()) {
                this.j.t8(this);
            }
        }

        void onComplete() {
            if(!this.a()) {
                this.b.onComplete();
            }
        }

        void onError(Throwable throwable0) {
            if(this.a()) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.b.onError(throwable0);
        }
    }

    final AtomicReference a;
    Throwable b;
    Object c;
    static final io.reactivex.subjects.a.a[] d;
    static final io.reactivex.subjects.a.a[] e;

    static {
        a.d = new io.reactivex.subjects.a.a[0];
        a.e = new io.reactivex.subjects.a.a[0];
    }

    a() {
        this.a = new AtomicReference(a.d);
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.subjects.a.a a$a0 = new io.reactivex.subjects.a.a(i0, this);
        i0.b(a$a0);
        if(!this.n8(a$a0)) {
            Throwable throwable0 = this.b;
            if(throwable0 != null) {
                i0.onError(throwable0);
                return;
            }
            Object object0 = this.c;
            if(object0 != null) {
                a$a0.d(object0);
                return;
            }
            a$a0.onComplete();
        }
        else if(a$a0.a()) {
            this.t8(a$a0);
        }
    }

    @Override  // io.reactivex.I
    public void b(c c0) {
        if(this.a.get() == a.e) {
            c0.dispose();
        }
    }

    @Override  // io.reactivex.subjects.i
    public Throwable i8() {
        return this.a.get() == a.e ? this.b : null;
    }

    @Override  // io.reactivex.subjects.i
    public boolean j8() {
        return this.a.get() == a.e && this.b == null;
    }

    @Override  // io.reactivex.subjects.i
    public boolean k8() {
        return ((io.reactivex.subjects.a.a[])this.a.get()).length != 0;
    }

    @Override  // io.reactivex.subjects.i
    public boolean l8() {
        return this.a.get() == a.e && this.b != null;
    }

    boolean n8(io.reactivex.subjects.a.a a$a0) {
        do {
            io.reactivex.subjects.a.a[] arr_a$a = (io.reactivex.subjects.a.a[])this.a.get();
            if(arr_a$a == a.e) {
                return false;
            }
            io.reactivex.subjects.a.a[] arr_a$a1 = new io.reactivex.subjects.a.a[arr_a$a.length + 1];
            System.arraycopy(arr_a$a, 0, arr_a$a1, 0, arr_a$a.length);
            arr_a$a1[arr_a$a.length] = a$a0;
        }
        while(!d.a(this.a, arr_a$a, arr_a$a1));
        return true;
    }

    @d3.d
    @f
    public static a o8() {
        return new a();
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        Object object0 = this.a.get();
        io.reactivex.subjects.a.a[] arr_a$a = a.e;
        if(object0 == arr_a$a) {
            return;
        }
        Object object1 = this.c;
        io.reactivex.subjects.a.a[] arr_a$a1 = (io.reactivex.subjects.a.a[])this.a.getAndSet(arr_a$a);
        int v = 0;
        if(object1 == null) {
            while(v < arr_a$a1.length) {
                arr_a$a1[v].onComplete();
                ++v;
            }
            return;
        }
        while(v < arr_a$a1.length) {
            arr_a$a1[v].d(object1);
            ++v;
        }
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object object0 = this.a.get();
        io.reactivex.subjects.a.a[] arr_a$a = a.e;
        if(object0 == arr_a$a) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        this.c = null;
        this.b = throwable0;
        io.reactivex.subjects.a.a[] arr_a$a1 = (io.reactivex.subjects.a.a[])this.a.getAndSet(arr_a$a);
        for(int v = 0; v < arr_a$a1.length; ++v) {
            arr_a$a1[v].onError(throwable0);
        }
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        b.g(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.a.get() == a.e) {
            return;
        }
        this.c = object0;
    }

    @g
    public Object p8() {
        return this.a.get() == a.e ? this.c : null;
    }

    @Deprecated
    public Object[] q8() {
        Object object0 = this.p8();
        return object0 == null ? new Object[0] : new Object[]{object0};
    }

    @Deprecated
    public Object[] r8(Object[] arr_object) {
        Object object0 = this.p8();
        if(object0 == null) {
            if(arr_object.length != 0) {
                arr_object[0] = null;
            }
            return arr_object;
        }
        if(arr_object.length == 0) {
            arr_object = Arrays.copyOf(arr_object, 1);
        }
        arr_object[0] = object0;
        if(arr_object.length != 1) {
            arr_object[1] = null;
        }
        return arr_object;
    }

    public boolean s8() {
        return this.a.get() == a.e && this.c != null;
    }

    void t8(io.reactivex.subjects.a.a a$a0) {
        io.reactivex.subjects.a.a[] arr_a$a1;
        do {
            io.reactivex.subjects.a.a[] arr_a$a = (io.reactivex.subjects.a.a[])this.a.get();
            int v = arr_a$a.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_a$a[v1] == a$a0) {
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
                arr_a$a1 = a.d;
            }
            else {
                io.reactivex.subjects.a.a[] arr_a$a2 = new io.reactivex.subjects.a.a[v - 1];
                System.arraycopy(arr_a$a, 0, arr_a$a2, 0, v1);
                System.arraycopy(arr_a$a, v1 + 1, arr_a$a2, v1, v - v1 - 1);
                arr_a$a1 = arr_a$a2;
            }
        }
        while(!d.a(this.a, arr_a$a, arr_a$a1));
    }
}

