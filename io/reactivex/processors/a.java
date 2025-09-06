package io.reactivex.processors;

import d3.g;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.f;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class a extends c {
    static final class io.reactivex.processors.a.a extends f {
        final a m;
        private static final long n = 0x4E215678802BC8D0L;

        io.reactivex.processors.a.a(d d0, a a0) {
            super(d0);
            this.m = a0;
        }

        @Override  // io.reactivex.internal.subscriptions.f
        public void cancel() {
            if(super.n()) {
                this.m.Z8(this);
            }
        }

        void onComplete() {
            if(!this.f()) {
                this.b.onComplete();
            }
        }

        void onError(Throwable throwable0) {
            if(this.f()) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.b.onError(throwable0);
        }
    }

    final AtomicReference b;
    Throwable c;
    Object d;
    static final io.reactivex.processors.a.a[] e;
    static final io.reactivex.processors.a.a[] f;

    static {
        a.e = new io.reactivex.processors.a.a[0];
        a.f = new io.reactivex.processors.a.a[0];
    }

    a() {
        this.b = new AtomicReference(a.e);
    }

    @Override  // io.reactivex.processors.c
    @g
    public Throwable O8() {
        return this.b.get() == a.f ? this.c : null;
    }

    @Override  // io.reactivex.processors.c
    public boolean P8() {
        return this.b.get() == a.f && this.c == null;
    }

    @Override  // io.reactivex.processors.c
    public boolean Q8() {
        return ((io.reactivex.processors.a.a[])this.b.get()).length != 0;
    }

    @Override  // io.reactivex.processors.c
    public boolean R8() {
        return this.b.get() == a.f && this.c != null;
    }

    boolean T8(io.reactivex.processors.a.a a$a0) {
        do {
            io.reactivex.processors.a.a[] arr_a$a = (io.reactivex.processors.a.a[])this.b.get();
            if(arr_a$a == a.f) {
                return false;
            }
            io.reactivex.processors.a.a[] arr_a$a1 = new io.reactivex.processors.a.a[arr_a$a.length + 1];
            System.arraycopy(arr_a$a, 0, arr_a$a1, 0, arr_a$a.length);
            arr_a$a1[arr_a$a.length] = a$a0;
        }
        while(!androidx.compose.animation.core.d.a(this.b, arr_a$a, arr_a$a1));
        return true;
    }

    @d3.d
    @d3.f
    public static a U8() {
        return new a();
    }

    @g
    public Object V8() {
        return this.b.get() == a.f ? this.d : null;
    }

    @Deprecated
    public Object[] W8() {
        Object object0 = this.V8();
        return object0 == null ? new Object[0] : new Object[]{object0};
    }

    @Deprecated
    public Object[] X8(Object[] arr_object) {
        Object object0 = this.V8();
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

    public boolean Y8() {
        return this.b.get() == a.f && this.d != null;
    }

    void Z8(io.reactivex.processors.a.a a$a0) {
        io.reactivex.processors.a.a[] arr_a$a1;
        do {
            io.reactivex.processors.a.a[] arr_a$a = (io.reactivex.processors.a.a[])this.b.get();
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
                arr_a$a1 = a.e;
            }
            else {
                io.reactivex.processors.a.a[] arr_a$a2 = new io.reactivex.processors.a.a[v - 1];
                System.arraycopy(arr_a$a, 0, arr_a$a2, 0, v1);
                System.arraycopy(arr_a$a, v1 + 1, arr_a$a2, v1, v - v1 - 1);
                arr_a$a1 = arr_a$a2;
            }
        }
        while(!androidx.compose.animation.core.d.a(this.b, arr_a$a, arr_a$a1));
    }

    @Override  // io.reactivex.q, org.reactivestreams.d
    public void g(e e0) {
        if(this.b.get() == a.f) {
            e0.cancel();
            return;
        }
        e0.request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.processors.a.a a$a0 = new io.reactivex.processors.a.a(d0, this);
        d0.g(a$a0);
        if(!this.T8(a$a0)) {
            Throwable throwable0 = this.c;
            if(throwable0 != null) {
                d0.onError(throwable0);
                return;
            }
            Object object0 = this.d;
            if(object0 != null) {
                a$a0.a(object0);
                return;
            }
            a$a0.onComplete();
        }
        else if(a$a0.f()) {
            this.Z8(a$a0);
        }
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        Object object0 = this.b.get();
        io.reactivex.processors.a.a[] arr_a$a = a.f;
        if(object0 == arr_a$a) {
            return;
        }
        Object object1 = this.d;
        io.reactivex.processors.a.a[] arr_a$a1 = (io.reactivex.processors.a.a[])this.b.getAndSet(arr_a$a);
        int v = 0;
        if(object1 == null) {
            while(v < arr_a$a1.length) {
                arr_a$a1[v].onComplete();
                ++v;
            }
            return;
        }
        while(v < arr_a$a1.length) {
            arr_a$a1[v].a(object1);
            ++v;
        }
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object object0 = this.b.get();
        io.reactivex.processors.a.a[] arr_a$a = a.f;
        if(object0 == arr_a$a) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        this.d = null;
        this.c = throwable0;
        io.reactivex.processors.a.a[] arr_a$a1 = (io.reactivex.processors.a.a[])this.b.getAndSet(arr_a$a);
        for(int v = 0; v < arr_a$a1.length; ++v) {
            arr_a$a1[v].onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        b.g(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.b.get() == a.f) {
            return;
        }
        this.d = object0;
    }
}

