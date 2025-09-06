package io.reactivex.processors;

import d3.f;
import d3.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import io.reactivex.internal.util.q;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class b extends c {
    static final class a extends AtomicLong implements io.reactivex.internal.util.a.a, e {
        final d a;
        final b b;
        boolean c;
        boolean d;
        io.reactivex.internal.util.a e;
        boolean f;
        volatile boolean g;
        long h;
        private static final long i = 0x2DB3B5785EA03C8EL;

        a(d d0, b b0) {
            this.a = d0;
            this.b = b0;
        }

        void a() {
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
                this.h = this.b.h;
                Object object0 = this.b.f.get();
                this.b.d.unlock();
                this.d = object0 != null;
                this.c = true;
            }
            if(object0 == null || this.test(object0)) {
                return;
            }
            this.b();
        }

        void b() {
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

        void c(Object object0, long v) {
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

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.g) {
                this.g = true;
                this.b.b9(this);
            }
        }

        public boolean d() {
            return this.get() == 0L;
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this, v);
            }
        }

        @Override  // io.reactivex.internal.util.a$a
        public boolean test(Object object0) {
            if(this.g) {
                return true;
            }
            if(q.l(object0)) {
                this.a.onComplete();
                return true;
            }
            if(q.n(object0)) {
                Throwable throwable0 = q.i(object0);
                this.a.onError(throwable0);
                return true;
            }
            long v = this.get();
            if(v != 0L) {
                this.a.onNext(object0);
                if(v != 0x7FFFFFFFFFFFFFFFL) {
                    this.decrementAndGet();
                }
                return false;
            }
            this.cancel();
            io.reactivex.exceptions.c c0 = new io.reactivex.exceptions.c("Could not deliver value due to lack of requests");
            this.a.onError(c0);
            return true;
        }
    }

    final AtomicReference b;
    final ReadWriteLock c;
    final Lock d;
    final Lock e;
    final AtomicReference f;
    final AtomicReference g;
    long h;
    static final Object[] i;
    static final a[] j;
    static final a[] k;

    static {
        b.i = new Object[0];
        b.j = new a[0];
        b.k = new a[0];
    }

    b() {
        this.f = new AtomicReference();
        ReentrantReadWriteLock reentrantReadWriteLock0 = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock0;
        this.d = reentrantReadWriteLock0.readLock();
        this.e = reentrantReadWriteLock0.writeLock();
        this.b = new AtomicReference(b.j);
        this.g = new AtomicReference();
    }

    b(Object object0) {
        Object object1 = io.reactivex.internal.functions.b.g(object0, "defaultValue is null");
        this.f.lazySet(object1);
    }

    @Override  // io.reactivex.processors.c
    @g
    public Throwable O8() {
        Object object0 = this.f.get();
        return q.n(object0) ? q.i(object0) : null;
    }

    @Override  // io.reactivex.processors.c
    public boolean P8() {
        return q.l(this.f.get());
    }

    @Override  // io.reactivex.processors.c
    public boolean Q8() {
        return ((a[])this.b.get()).length != 0;
    }

    @Override  // io.reactivex.processors.c
    public boolean R8() {
        return q.n(this.f.get());
    }

    boolean T8(a b$a0) {
        do {
            a[] arr_b$a = (a[])this.b.get();
            if(arr_b$a == b.k) {
                return false;
            }
            a[] arr_b$a1 = new a[arr_b$a.length + 1];
            System.arraycopy(arr_b$a, 0, arr_b$a1, 0, arr_b$a.length);
            arr_b$a1[arr_b$a.length] = b$a0;
        }
        while(!androidx.compose.animation.core.d.a(this.b, arr_b$a, arr_b$a1));
        return true;
    }

    @d3.d
    @f
    public static b U8() {
        return new b();
    }

    @d3.d
    @f
    public static b V8(Object object0) {
        io.reactivex.internal.functions.b.g(object0, "defaultValue is null");
        return new b(object0);
    }

    @g
    public Object W8() {
        Object object0 = this.f.get();
        return q.l(object0) || q.n(object0) ? null : object0;
    }

    @Deprecated
    public Object[] X8() {
        Object[] arr_object = this.Y8(b.i);
        return arr_object == b.i ? new Object[0] : arr_object;
    }

    @Deprecated
    public Object[] Y8(Object[] arr_object) {
        Object object0 = this.f.get();
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

    public boolean Z8() {
        Object object0 = this.f.get();
        return object0 != null && !q.l(object0) && !q.n(object0);
    }

    public boolean a9(Object object0) {
        if(object0 == null) {
            this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        a[] arr_b$a = (a[])this.b.get();
        for(int v1 = 0; v1 < arr_b$a.length; ++v1) {
            if(arr_b$a[v1].d()) {
                return false;
            }
        }
        this.c9(object0);
        for(int v = 0; v < arr_b$a.length; ++v) {
            arr_b$a[v].c(object0, this.h);
        }
        return true;
    }

    void b9(a b$a0) {
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
                arr_b$a1 = b.j;
            }
            else {
                a[] arr_b$a2 = new a[v - 1];
                System.arraycopy(arr_b$a, 0, arr_b$a2, 0, v1);
                System.arraycopy(arr_b$a, v1 + 1, arr_b$a2, v1, v - v1 - 1);
                arr_b$a1 = arr_b$a2;
            }
        }
        while(!androidx.compose.animation.core.d.a(this.b, arr_b$a, arr_b$a1));
    }

    void c9(Object object0) {
        this.e.lock();
        ++this.h;
        this.f.lazySet(object0);
        this.e.unlock();
    }

    int d9() {
        return ((a[])this.b.get()).length;
    }

    a[] e9(Object object0) {
        a[] arr_b$a = (a[])this.b.get();
        a[] arr_b$a1 = b.k;
        if(arr_b$a != arr_b$a1) {
            arr_b$a = (a[])this.b.getAndSet(arr_b$a1);
            if(arr_b$a != arr_b$a1) {
                this.c9(object0);
            }
        }
        return arr_b$a;
    }

    @Override  // io.reactivex.q, org.reactivestreams.d
    public void g(e e0) {
        if(this.g.get() != null) {
            e0.cancel();
            return;
        }
        e0.request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        a b$a0 = new a(d0, this);
        d0.g(b$a0);
        if(this.T8(b$a0)) {
            if(b$a0.g) {
                this.b9(b$a0);
                return;
            }
            b$a0.a();
            return;
        }
        Throwable throwable0 = (Throwable)this.g.get();
        if(throwable0 == k.a) {
            d0.onComplete();
            return;
        }
        d0.onError(throwable0);
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        if(!androidx.compose.animation.core.d.a(this.g, null, k.a)) {
            return;
        }
        Object object0 = q.e();
        a[] arr_b$a = this.e9(object0);
        for(int v = 0; v < arr_b$a.length; ++v) {
            arr_b$a[v].c(object0, this.h);
        }
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        io.reactivex.internal.functions.b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(!androidx.compose.animation.core.d.a(this.g, null, throwable0)) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        Object object0 = q.g(throwable0);
        a[] arr_b$a = this.e9(object0);
        for(int v = 0; v < arr_b$a.length; ++v) {
            arr_b$a[v].c(object0, this.h);
        }
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        io.reactivex.internal.functions.b.g(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.g.get() != null) {
            return;
        }
        this.c9(object0);
        a[] arr_b$a = (a[])this.b.get();
        for(int v = 0; v < arr_b$a.length; ++v) {
            arr_b$a[v].c(object0, this.h);
        }
    }
}

