package io.reactivex.subjects;

import androidx.compose.animation.core.d;
import d3.f;
import d3.g;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.util.k;
import io.reactivex.internal.util.q;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class b extends i {
    static final class a implements c, io.reactivex.internal.util.a.a {
        final I a;
        final b b;
        boolean c;
        boolean d;
        io.reactivex.internal.util.a e;
        boolean f;
        volatile boolean g;
        long h;

        a(I i0, b b0) {
            this.a = i0;
            this.b = b0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.g;
        }

        void b() {
            if(this.g) {
                return;
            }
            synchronized(this) {
                if(this.g) {
                    return;
                }
                if(this.c) {
                    return;
                }
                this.b.d.lock();
                this.h = this.b.g;
                Object object0 = this.b.a.get();
                this.b.d.unlock();
                this.d = object0 != null;
                this.c = true;
            }
            if(object0 == null || this.test(object0)) {
                return;
            }
            this.c();
        }

        void c() {
            io.reactivex.internal.util.a a0;
            while(true) {
                if(this.g) {
                    return;
                }
                synchronized(this) {
                    a0 = this.e;
                    if(a0 == null) {
                        this.d = false;
                        return;
                    }
                    this.e = null;
                }
                a0.d(this);
            }
        }

        void d(Object object0, long v) {
            if(this.g) {
                return;
            }
            if(!this.f) {
                synchronized(this) {
                    if(this.g) {
                        return;
                    }
                    if(this.h == v) {
                        return;
                    }
                    if(this.d) {
                        io.reactivex.internal.util.a a0 = this.e;
                        if(a0 == null) {
                            a0 = new io.reactivex.internal.util.a(4);
                            this.e = a0;
                        }
                        a0.c(object0);
                        return;
                    }
                    this.c = true;
                }
                this.f = true;
            }
            this.test(object0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.g) {
                this.g = true;
                this.b.u8(this);
            }
        }

        // 去混淆评级： 低(20)
        @Override  // io.reactivex.internal.util.a$a
        public boolean test(Object object0) {
            return this.g || q.a(object0, this.a);
        }
    }

    final AtomicReference a;
    final AtomicReference b;
    final ReadWriteLock c;
    final Lock d;
    final Lock e;
    final AtomicReference f;
    long g;
    private static final Object[] h;
    static final a[] i;
    static final a[] j;

    static {
        b.h = new Object[0];
        b.i = new a[0];
        b.j = new a[0];
    }

    b() {
        ReentrantReadWriteLock reentrantReadWriteLock0 = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock0;
        this.d = reentrantReadWriteLock0.readLock();
        this.e = reentrantReadWriteLock0.writeLock();
        this.b = new AtomicReference(b.i);
        this.a = new AtomicReference();
        this.f = new AtomicReference();
    }

    b(Object object0) {
        Object object1 = io.reactivex.internal.functions.b.g(object0, "defaultValue is null");
        this.a.lazySet(object1);
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        a b$a0 = new a(i0, this);
        i0.b(b$a0);
        if(this.n8(b$a0)) {
            if(b$a0.g) {
                this.u8(b$a0);
                return;
            }
            b$a0.b();
            return;
        }
        Throwable throwable0 = (Throwable)this.f.get();
        if(throwable0 == k.a) {
            i0.onComplete();
            return;
        }
        i0.onError(throwable0);
    }

    @Override  // io.reactivex.I
    public void b(c c0) {
        if(this.f.get() != null) {
            c0.dispose();
        }
    }

    @Override  // io.reactivex.subjects.i
    @g
    public Throwable i8() {
        Object object0 = this.a.get();
        return q.n(object0) ? q.i(object0) : null;
    }

    @Override  // io.reactivex.subjects.i
    public boolean j8() {
        return q.l(this.a.get());
    }

    @Override  // io.reactivex.subjects.i
    public boolean k8() {
        return ((a[])this.b.get()).length != 0;
    }

    @Override  // io.reactivex.subjects.i
    public boolean l8() {
        return q.n(this.a.get());
    }

    boolean n8(a b$a0) {
        do {
            a[] arr_b$a = (a[])this.b.get();
            if(arr_b$a == b.j) {
                return false;
            }
            a[] arr_b$a1 = new a[arr_b$a.length + 1];
            System.arraycopy(arr_b$a, 0, arr_b$a1, 0, arr_b$a.length);
            arr_b$a1[arr_b$a.length] = b$a0;
        }
        while(!d.a(this.b, arr_b$a, arr_b$a1));
        return true;
    }

    @d3.d
    @f
    public static b o8() {
        return new b();
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        if(!d.a(this.f, null, k.a)) {
            return;
        }
        Object object0 = q.e();
        a[] arr_b$a = this.x8(object0);
        for(int v = 0; v < arr_b$a.length; ++v) {
            arr_b$a[v].d(object0, this.g);
        }
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        io.reactivex.internal.functions.b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(!d.a(this.f, null, throwable0)) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        Object object0 = q.g(throwable0);
        a[] arr_b$a = this.x8(object0);
        for(int v = 0; v < arr_b$a.length; ++v) {
            arr_b$a[v].d(object0, this.g);
        }
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        io.reactivex.internal.functions.b.g(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.f.get() != null) {
            return;
        }
        this.v8(object0);
        a[] arr_b$a = (a[])this.b.get();
        for(int v = 0; v < arr_b$a.length; ++v) {
            arr_b$a[v].d(object0, this.g);
        }
    }

    @d3.d
    @f
    public static b p8(Object object0) {
        return new b(object0);
    }

    @g
    public Object q8() {
        Object object0 = this.a.get();
        return q.l(object0) || q.n(object0) ? null : object0;
    }

    @Deprecated
    public Object[] r8() {
        Object[] arr_object = this.s8(b.h);
        return arr_object == b.h ? new Object[0] : arr_object;
    }

    @Deprecated
    public Object[] s8(Object[] arr_object) {
        Object object0 = this.a.get();
        if(object0 != null && !q.l(object0) && !q.n(object0)) {
            if(arr_object.length == 0) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), 1);
                arr_object[0] = object0;
            }
            else {
                arr_object[0] = object0;
                if(arr_object.length != 1) {
                    arr_object[1] = null;
                    return arr_object;
                }
            }
            return arr_object;
        }
        if(arr_object.length != 0) {
            arr_object[0] = null;
        }
        return arr_object;
    }

    public boolean t8() {
        Object object0 = this.a.get();
        return object0 != null && !q.l(object0) && !q.n(object0);
    }

    void u8(a b$a0) {
        a[] arr_b$a1;
        do {
            a[] arr_b$a = (a[])this.b.get();
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
                arr_b$a1 = b.i;
            }
            else {
                a[] arr_b$a2 = new a[v - 1];
                System.arraycopy(arr_b$a, 0, arr_b$a2, 0, v1);
                System.arraycopy(arr_b$a, v1 + 1, arr_b$a2, v1, v - v1 - 1);
                arr_b$a1 = arr_b$a2;
            }
        }
        while(!d.a(this.b, arr_b$a, arr_b$a1));
    }

    void v8(Object object0) {
        this.e.lock();
        ++this.g;
        this.a.lazySet(object0);
        this.e.unlock();
    }

    int w8() {
        return ((a[])this.b.get()).length;
    }

    a[] x8(Object object0) {
        a[] arr_b$a = (a[])this.b.getAndSet(b.j);
        if(arr_b$a != b.j) {
            this.v8(object0);
        }
        return arr_b$a;
    }
}

