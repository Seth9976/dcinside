package io.reactivex.subjects;

import d3.g;
import io.reactivex.I;
import io.reactivex.J;
import io.reactivex.internal.util.q;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class f extends i {
    static final class a extends AtomicReference {
        final Object a;
        private static final long b = 0x58E06200F2EDB94CL;

        a(Object object0) {
            this.a = object0;
        }
    }

    interface b {
        void a(Object arg1);

        void add(Object arg1);

        void b(c arg1);

        boolean compareAndSet(Object arg1, Object arg2);

        void d();

        Object[] e(Object[] arg1);

        Object get();

        @g
        Object getValue();

        int size();
    }

    static final class c extends AtomicInteger implements io.reactivex.disposables.c {
        final I a;
        final f b;
        Object c;
        volatile boolean d;
        private static final long e = 0x679849349531B12L;

        c(I i0, f f0) {
            this.a = i0;
            this.b = f0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.d;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.d) {
                this.d = true;
                this.b.A8(this);
            }
        }
    }

    static final class d extends AtomicReference implements b {
        final int a;
        final long b;
        final TimeUnit c;
        final J d;
        int e;
        volatile io.reactivex.subjects.f.f f;
        io.reactivex.subjects.f.f g;
        volatile boolean h;
        private static final long i = -8056260896137901749L;

        d(int v, long v1, TimeUnit timeUnit0, J j0) {
            this.a = io.reactivex.internal.functions.b.h(v, "maxSize");
            this.b = io.reactivex.internal.functions.b.i(v1, "maxAge");
            this.c = (TimeUnit)io.reactivex.internal.functions.b.g(timeUnit0, "unit is null");
            this.d = (J)io.reactivex.internal.functions.b.g(j0, "scheduler is null");
            io.reactivex.subjects.f.f f$f0 = new io.reactivex.subjects.f.f(null, 0L);
            this.g = f$f0;
            this.f = f$f0;
        }

        @Override  // io.reactivex.subjects.f$b
        public void a(Object object0) {
            io.reactivex.subjects.f.f f$f0 = new io.reactivex.subjects.f.f(object0, 0x7FFFFFFFFFFFFFFFL);
            io.reactivex.subjects.f.f f$f1 = this.g;
            this.g = f$f0;
            ++this.e;
            f$f1.lazySet(f$f0);
            this.h();
            this.h = true;
        }

        @Override  // io.reactivex.subjects.f$b
        public void add(Object object0) {
            io.reactivex.subjects.f.f f$f0 = new io.reactivex.subjects.f.f(object0, this.d.e(this.c));
            io.reactivex.subjects.f.f f$f1 = this.g;
            this.g = f$f0;
            ++this.e;
            f$f1.set(f$f0);
            this.g();
        }

        @Override  // io.reactivex.subjects.f$b
        public void b(c f$c0) {
            io.reactivex.subjects.f.f f$f1;
            if(f$c0.getAndIncrement() != 0) {
                return;
            }
            I i0 = f$c0.a;
            io.reactivex.subjects.f.f f$f0 = (io.reactivex.subjects.f.f)f$c0.c;
            if(f$f0 == null) {
                f$f0 = this.c();
            }
            int v = 1;
            while(true) {
                if(f$c0.d) {
                    f$c0.c = null;
                    return;
                }
            label_10:
                if(f$c0.d) {
                    f$c0.c = null;
                    return;
                }
                f$f1 = (io.reactivex.subjects.f.f)f$f0.get();
                if(f$f1 != null) {
                    break;
                }
                if(f$f0.get() != null) {
                    continue;
                }
                f$c0.c = f$f0;
                v = f$c0.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            Object object0 = f$f1.a;
            if(!this.h || f$f1.get() != null) {
                i0.onNext(object0);
                f$f0 = f$f1;
                goto label_10;
            }
            if(q.l(object0)) {
                i0.onComplete();
            }
            else {
                i0.onError(q.i(object0));
            }
            f$c0.c = null;
            f$c0.d = true;
        }

        io.reactivex.subjects.f.f c() {
            io.reactivex.subjects.f.f f$f2;
            io.reactivex.subjects.f.f f$f0 = this.f;
            long v = this.d.e(this.c) - this.b;
            for(io.reactivex.subjects.f.f f$f1 = (io.reactivex.subjects.f.f)f$f0.get(); true; f$f1 = (io.reactivex.subjects.f.f)f$f0.get()) {
                f$f2 = f$f0;
                f$f0 = f$f1;
                if(f$f0 == null || f$f0.b > v) {
                    break;
                }
            }
            return f$f2;
        }

        @Override  // io.reactivex.subjects.f$b
        public void d() {
            io.reactivex.subjects.f.f f$f0 = this.f;
            if(f$f0.a != null) {
                io.reactivex.subjects.f.f f$f1 = new io.reactivex.subjects.f.f(null, 0L);
                f$f1.lazySet(f$f0.get());
                this.f = f$f1;
            }
        }

        @Override  // io.reactivex.subjects.f$b
        public Object[] e(Object[] arr_object) {
            io.reactivex.subjects.f.f f$f0 = this.c();
            int v = this.f(f$f0);
            if(v != 0) {
                if(arr_object.length < v) {
                    arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
                }
                for(int v1 = 0; v1 != v; ++v1) {
                    f$f0 = (io.reactivex.subjects.f.f)f$f0.get();
                    arr_object[v1] = f$f0.a;
                }
                if(arr_object.length > v) {
                    arr_object[v] = null;
                }
            }
            else if(arr_object.length != 0) {
                arr_object[0] = null;
                return arr_object;
            }
            return arr_object;
        }

        int f(io.reactivex.subjects.f.f f$f0) {
            int v = 0;
            while(v != 0x7FFFFFFF) {
                io.reactivex.subjects.f.f f$f1 = (io.reactivex.subjects.f.f)f$f0.get();
                if(f$f1 == null) {
                    return !q.l(f$f0.a) && !q.n(f$f0.a) ? v : v - 1;
                }
                ++v;
                f$f0 = f$f1;
            }
            return 0x7FFFFFFF;
        }

        void g() {
            int v = this.e;
            if(v > this.a) {
                this.e = v - 1;
                this.f = (io.reactivex.subjects.f.f)this.f.get();
            }
            long v1 = this.d.e(this.c) - this.b;
            for(io.reactivex.subjects.f.f f$f0 = this.f; true; f$f0 = f$f1) {
                if(this.e <= 1) {
                    this.f = f$f0;
                    return;
                }
                io.reactivex.subjects.f.f f$f1 = (io.reactivex.subjects.f.f)f$f0.get();
                if(f$f1 == null) {
                    this.f = f$f0;
                    return;
                }
                if(f$f1.b > v1) {
                    this.f = f$f0;
                    return;
                }
                --this.e;
            }
        }

        @Override  // io.reactivex.subjects.f$b
        @g
        public Object getValue() {
            io.reactivex.subjects.f.f f$f0 = this.f;
            io.reactivex.subjects.f.f f$f1 = null;
            io.reactivex.subjects.f.f f$f2;
            while((f$f2 = (io.reactivex.subjects.f.f)f$f0.get()) != null) {
                f$f1 = f$f0;
                f$f0 = f$f2;
            }
            long v = this.d.e(this.c);
            if(f$f0.b < v - this.b) {
                return null;
            }
            Object object0 = f$f0.a;
            if(object0 == null) {
                return null;
            }
            return q.l(object0) || q.n(object0) ? f$f1.a : object0;
        }

        void h() {
            long v = this.d.e(this.c) - this.b;
            for(io.reactivex.subjects.f.f f$f0 = this.f; true; f$f0 = f$f1) {
                io.reactivex.subjects.f.f f$f1 = (io.reactivex.subjects.f.f)f$f0.get();
                if(f$f1.get() == null) {
                    if(f$f0.a != null) {
                        io.reactivex.subjects.f.f f$f2 = new io.reactivex.subjects.f.f(null, 0L);
                        f$f2.lazySet(f$f0.get());
                        this.f = f$f2;
                        return;
                    }
                    this.f = f$f0;
                    return;
                }
                if(f$f1.b > v) {
                    if(f$f0.a != null) {
                        io.reactivex.subjects.f.f f$f3 = new io.reactivex.subjects.f.f(null, 0L);
                        f$f3.lazySet(f$f0.get());
                        this.f = f$f3;
                        return;
                    }
                    this.f = f$f0;
                    return;
                }
            }
        }

        @Override  // io.reactivex.subjects.f$b
        public int size() {
            return this.f(this.c());
        }
    }

    static final class e extends AtomicReference implements b {
        final int a;
        int b;
        volatile a c;
        a d;
        volatile boolean e;
        private static final long f = 0xF5F291FE2C1030BL;

        e(int v) {
            this.a = io.reactivex.internal.functions.b.h(v, "maxSize");
            a f$a0 = new a(null);
            this.d = f$a0;
            this.c = f$a0;
        }

        @Override  // io.reactivex.subjects.f$b
        public void a(Object object0) {
            a f$a0 = new a(object0);
            a f$a1 = this.d;
            this.d = f$a0;
            ++this.b;
            f$a1.lazySet(f$a0);
            this.d();
            this.e = true;
        }

        @Override  // io.reactivex.subjects.f$b
        public void add(Object object0) {
            a f$a0 = new a(object0);
            a f$a1 = this.d;
            this.d = f$a0;
            ++this.b;
            f$a1.set(f$a0);
            this.c();
        }

        @Override  // io.reactivex.subjects.f$b
        public void b(c f$c0) {
            if(f$c0.getAndIncrement() != 0) {
                return;
            }
            I i0 = f$c0.a;
            a f$a0 = (a)f$c0.c;
            if(f$a0 == null) {
                f$a0 = this.c;
            }
            int v = 1;
            while(true) {
                if(f$c0.d) {
                    f$c0.c = null;
                    return;
                }
                a f$a1 = (a)f$a0.get();
                if(f$a1 == null) {
                    if(f$a0.get() != null) {
                        continue;
                    }
                    f$c0.c = f$a0;
                    v = f$c0.addAndGet(-v);
                    if(v != 0) {
                        continue;
                    }
                    return;
                }
                Object object0 = f$a1.a;
                if(this.e && f$a1.get() == null) {
                    if(q.l(object0)) {
                        i0.onComplete();
                    }
                    else {
                        i0.onError(q.i(object0));
                    }
                    f$c0.c = null;
                    f$c0.d = true;
                    return;
                }
                i0.onNext(object0);
                f$a0 = f$a1;
            }
        }

        void c() {
            int v = this.b;
            if(v > this.a) {
                this.b = v - 1;
                this.c = (a)this.c.get();
            }
        }

        @Override  // io.reactivex.subjects.f$b
        public void d() {
            a f$a0 = this.c;
            if(f$a0.a != null) {
                a f$a1 = new a(null);
                f$a1.lazySet(f$a0.get());
                this.c = f$a1;
            }
        }

        @Override  // io.reactivex.subjects.f$b
        public Object[] e(Object[] arr_object) {
            a f$a0 = this.c;
            int v = this.size();
            if(v != 0) {
                if(arr_object.length < v) {
                    arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
                }
                for(int v1 = 0; v1 != v; ++v1) {
                    f$a0 = (a)f$a0.get();
                    arr_object[v1] = f$a0.a;
                }
                if(arr_object.length > v) {
                    arr_object[v] = null;
                }
            }
            else if(arr_object.length != 0) {
                arr_object[0] = null;
                return arr_object;
            }
            return arr_object;
        }

        @Override  // io.reactivex.subjects.f$b
        @g
        public Object getValue() {
            a f$a0 = this.c;
            a f$a1 = null;
            a f$a2;
            while((f$a2 = (a)f$a0.get()) != null) {
                f$a1 = f$a0;
                f$a0 = f$a2;
            }
            Object object0 = f$a0.a;
            if(object0 == null) {
                return null;
            }
            return q.l(object0) || q.n(object0) ? f$a1.a : object0;
        }

        @Override  // io.reactivex.subjects.f$b
        public int size() {
            a f$a0 = this.c;
            int v = 0;
            while(v != 0x7FFFFFFF) {
                a f$a1 = (a)f$a0.get();
                if(f$a1 == null) {
                    return !q.l(f$a0.a) && !q.n(f$a0.a) ? v : v - 1;
                }
                ++v;
                f$a0 = f$a1;
            }
            return 0x7FFFFFFF;
        }
    }

    static final class io.reactivex.subjects.f.f extends AtomicReference {
        final Object a;
        final long b;
        private static final long c = 0x58E06200F2EDB94CL;

        io.reactivex.subjects.f.f(Object object0, long v) {
            this.a = object0;
            this.b = v;
        }
    }

    static final class io.reactivex.subjects.f.g extends AtomicReference implements b {
        final List a;
        volatile boolean b;
        volatile int c;
        private static final long d = 0xF5D0BF9738C41B4DL;

        io.reactivex.subjects.f.g(int v) {
            this.a = new ArrayList(io.reactivex.internal.functions.b.h(v, "capacityHint"));
        }

        @Override  // io.reactivex.subjects.f$b
        public void a(Object object0) {
            this.a.add(object0);
            ++this.c;
            this.b = true;
        }

        @Override  // io.reactivex.subjects.f$b
        public void add(Object object0) {
            this.a.add(object0);
            ++this.c;
        }

        @Override  // io.reactivex.subjects.f$b
        public void b(c f$c0) {
            int v;
            if(f$c0.getAndIncrement() != 0) {
                return;
            }
            List list0 = this.a;
            I i0 = f$c0.a;
            Integer integer0 = (Integer)f$c0.c;
            if(integer0 == null) {
                v = 0;
                f$c0.c = 0;
            }
            else {
                v = (int)integer0;
            }
            int v1 = 1;
            while(true) {
                if(f$c0.d) {
                    f$c0.c = null;
                    return;
                }
                int v2 = this.c;
                while(v2 != v) {
                    if(f$c0.d) {
                        f$c0.c = null;
                        return;
                    }
                    Object object0 = list0.get(v);
                    if(this.b && v + 1 == v2) {
                        v2 = this.c;
                        if(v + 1 == v2) {
                            if(q.l(object0)) {
                                i0.onComplete();
                            }
                            else {
                                i0.onError(q.i(object0));
                            }
                            f$c0.c = null;
                            f$c0.d = true;
                            return;
                        }
                    }
                    i0.onNext(object0);
                    ++v;
                }
                if(v == this.c) {
                    f$c0.c = v;
                    v1 = f$c0.addAndGet(-v1);
                    if(v1 == 0) {
                        break;
                    }
                }
            }
        }

        @Override  // io.reactivex.subjects.f$b
        public void d() {
        }

        @Override  // io.reactivex.subjects.f$b
        public Object[] e(Object[] arr_object) {
            int v = this.c;
            if(v == 0) {
                if(arr_object.length != 0) {
                    arr_object[0] = null;
                }
                return arr_object;
            }
            List list0 = this.a;
            Object object0 = list0.get(v - 1);
            if(q.l(object0) || q.n(object0)) {
                --v;
                if(v == 0) {
                    if(arr_object.length != 0) {
                        arr_object[0] = null;
                    }
                    return arr_object;
                }
            }
            if(arr_object.length < v) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
            }
            for(int v1 = 0; v1 < v; ++v1) {
                arr_object[v1] = list0.get(v1);
            }
            if(arr_object.length > v) {
                arr_object[v] = null;
            }
            return arr_object;
        }

        @Override  // io.reactivex.subjects.f$b
        @g
        public Object getValue() {
            int v = this.c;
            if(v != 0) {
                List list0 = this.a;
                Object object0 = list0.get(v - 1);
                if(!q.l(object0) && !q.n(object0)) {
                    return object0;
                }
                return v == 1 ? null : list0.get(v - 2);
            }
            return null;
        }

        @Override  // io.reactivex.subjects.f$b
        public int size() {
            int v = this.c;
            if(v != 0) {
                Object object0 = this.a.get(v - 1);
                return q.l(object0) || q.n(object0) ? v - 1 : v;
            }
            return 0;
        }
    }

    final b a;
    final AtomicReference b;
    boolean c;
    static final c[] d;
    static final c[] e;
    private static final Object[] f;

    static {
        f.d = new c[0];
        f.e = new c[0];
        f.f = new Object[0];
    }

    f(b f$b0) {
        this.a = f$b0;
        this.b = new AtomicReference(f.d);
    }

    void A8(c f$c0) {
        c[] arr_f$c1;
        do {
            c[] arr_f$c = (c[])this.b.get();
            if(arr_f$c == f.e || arr_f$c == f.d) {
                break;
            }
            int v = arr_f$c.length;
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_f$c[v1] == f$c0) {
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
                arr_f$c1 = f.d;
            }
            else {
                c[] arr_f$c2 = new c[v - 1];
                System.arraycopy(arr_f$c, 0, arr_f$c2, 0, v1);
                System.arraycopy(arr_f$c, v1 + 1, arr_f$c2, v1, v - v1 - 1);
                arr_f$c1 = arr_f$c2;
            }
        }
        while(!androidx.compose.animation.core.d.a(this.b, arr_f$c, arr_f$c1));
    }

    int B8() {
        return this.a.size();
    }

    // 去混淆评级： 低(20)
    c[] C8(Object object0) {
        return this.a.compareAndSet(null, object0) ? ((c[])this.b.getAndSet(f.e)) : f.e;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        c f$c0 = new c(i0, this);
        i0.b(f$c0);
        if(!f$c0.d) {
            if(this.n8(f$c0) && f$c0.d) {
                this.A8(f$c0);
                return;
            }
            this.a.b(f$c0);
        }
    }

    @Override  // io.reactivex.I
    public void b(io.reactivex.disposables.c c0) {
        if(this.c) {
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
        return ((c[])this.b.get()).length != 0;
    }

    @Override  // io.reactivex.subjects.i
    public boolean l8() {
        return q.n(this.a.get());
    }

    boolean n8(c f$c0) {
        do {
            c[] arr_f$c = (c[])this.b.get();
            if(arr_f$c == f.e) {
                return false;
            }
            c[] arr_f$c1 = new c[arr_f$c.length + 1];
            System.arraycopy(arr_f$c, 0, arr_f$c1, 0, arr_f$c.length);
            arr_f$c1[arr_f$c.length] = f$c0;
        }
        while(!androidx.compose.animation.core.d.a(this.b, arr_f$c, arr_f$c1));
        return true;
    }

    public void o8() {
        this.a.d();
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        if(this.c) {
            return;
        }
        this.c = true;
        Object object0 = q.e();
        b f$b0 = this.a;
        f$b0.a(object0);
        c[] arr_f$c = this.C8(object0);
        for(int v = 0; v < arr_f$c.length; ++v) {
            f$b0.b(arr_f$c[v]);
        }
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        io.reactivex.internal.functions.b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.c) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        this.c = true;
        Object object0 = q.g(throwable0);
        b f$b0 = this.a;
        f$b0.a(object0);
        c[] arr_f$c = this.C8(object0);
        for(int v = 0; v < arr_f$c.length; ++v) {
            f$b0.b(arr_f$c[v]);
        }
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        io.reactivex.internal.functions.b.g(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.c) {
            return;
        }
        b f$b0 = this.a;
        f$b0.add(object0);
        c[] arr_f$c = (c[])this.b.get();
        for(int v = 0; v < arr_f$c.length; ++v) {
            f$b0.b(arr_f$c[v]);
        }
    }

    @d3.d
    @d3.f
    public static f p8() {
        return new f(new io.reactivex.subjects.f.g(16));
    }

    @d3.d
    @d3.f
    public static f q8(int v) {
        return new f(new io.reactivex.subjects.f.g(v));
    }

    static f r8() {
        return new f(new e(0x7FFFFFFF));
    }

    @d3.d
    @d3.f
    public static f s8(int v) {
        return new f(new e(v));
    }

    @d3.d
    @d3.f
    public static f t8(long v, TimeUnit timeUnit0, J j0) {
        return new f(new d(0x7FFFFFFF, v, timeUnit0, j0));
    }

    @d3.d
    @d3.f
    public static f u8(long v, TimeUnit timeUnit0, J j0, int v1) {
        return new f(new d(v1, v, timeUnit0, j0));
    }

    @g
    public Object v8() {
        return this.a.getValue();
    }

    public Object[] w8() {
        Object[] arr_object = this.x8(f.f);
        return arr_object == f.f ? new Object[0] : arr_object;
    }

    public Object[] x8(Object[] arr_object) {
        return this.a.e(arr_object);
    }

    public boolean y8() {
        return this.a.size() != 0;
    }

    int z8() {
        return ((c[])this.b.get()).length;
    }
}

