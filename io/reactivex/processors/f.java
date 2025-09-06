package io.reactivex.processors;

import d3.g;
import io.reactivex.J;
import io.reactivex.internal.subscriptions.j;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class f extends c {
    static final class a extends AtomicReference {
        final Object a;
        private static final long b = 0x58E06200F2EDB94CL;

        a(Object object0) {
            this.a = object0;
        }
    }

    interface b {
        void a();

        void b(Object arg1);

        void c(Throwable arg1);

        void d();

        Object[] e(Object[] arg1);

        void f(io.reactivex.processors.f.c arg1);

        Throwable getError();

        @g
        Object getValue();

        boolean isDone();

        int size();
    }

    static final class io.reactivex.processors.f.c extends AtomicInteger implements e {
        final d a;
        final f b;
        Object c;
        final AtomicLong d;
        volatile boolean e;
        long f;
        private static final long g = 0x679849349531B12L;

        io.reactivex.processors.f.c(d d0, f f0) {
            this.a = d0;
            this.b = f0;
            this.d = new AtomicLong();
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.e) {
                this.e = true;
                this.b.f9(this);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.d, v);
                this.b.b.f(this);
            }
        }
    }

    static final class io.reactivex.processors.f.d implements b {
        final int a;
        final long b;
        final TimeUnit c;
        final J d;
        int e;
        volatile io.reactivex.processors.f.f f;
        io.reactivex.processors.f.f g;
        Throwable h;
        volatile boolean i;

        io.reactivex.processors.f.d(int v, long v1, TimeUnit timeUnit0, J j0) {
            this.a = io.reactivex.internal.functions.b.h(v, "maxSize");
            this.b = io.reactivex.internal.functions.b.i(v1, "maxAge");
            this.c = (TimeUnit)io.reactivex.internal.functions.b.g(timeUnit0, "unit is null");
            this.d = (J)io.reactivex.internal.functions.b.g(j0, "scheduler is null");
            io.reactivex.processors.f.f f$f0 = new io.reactivex.processors.f.f(null, 0L);
            this.g = f$f0;
            this.f = f$f0;
        }

        @Override  // io.reactivex.processors.f$b
        public void a() {
            this.j();
            this.i = true;
        }

        @Override  // io.reactivex.processors.f$b
        public void b(Object object0) {
            io.reactivex.processors.f.f f$f0 = new io.reactivex.processors.f.f(object0, this.d.e(this.c));
            io.reactivex.processors.f.f f$f1 = this.g;
            this.g = f$f0;
            ++this.e;
            f$f1.set(f$f0);
            this.i();
        }

        @Override  // io.reactivex.processors.f$b
        public void c(Throwable throwable0) {
            this.j();
            this.h = throwable0;
            this.i = true;
        }

        @Override  // io.reactivex.processors.f$b
        public void d() {
            if(this.f.a != null) {
                io.reactivex.processors.f.f f$f0 = new io.reactivex.processors.f.f(null, 0L);
                f$f0.lazySet(this.f.get());
                this.f = f$f0;
            }
        }

        @Override  // io.reactivex.processors.f$b
        public Object[] e(Object[] arr_object) {
            io.reactivex.processors.f.f f$f0 = this.g();
            int v = this.h(f$f0);
            if(v != 0) {
                if(arr_object.length < v) {
                    arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
                }
                for(int v1 = 0; v1 != v; ++v1) {
                    f$f0 = (io.reactivex.processors.f.f)f$f0.get();
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

        @Override  // io.reactivex.processors.f$b
        public void f(io.reactivex.processors.f.c f$c0) {
            if(f$c0.getAndIncrement() != 0) {
                return;
            }
            d d0 = f$c0.a;
            io.reactivex.processors.f.f f$f0 = (io.reactivex.processors.f.f)f$c0.c;
            if(f$f0 == null) {
                f$f0 = this.g();
            }
            long v = f$c0.f;
            int v1 = 1;
            do {
                long v2 = f$c0.d.get();
                int v3;
                while((v3 = Long.compare(v, v2)) != 0) {
                    if(f$c0.e) {
                        f$c0.c = null;
                        return;
                    }
                    boolean z = this.i;
                    io.reactivex.processors.f.f f$f1 = (io.reactivex.processors.f.f)f$f0.get();
                    if(z && f$f1 == null) {
                        f$c0.c = null;
                        f$c0.e = true;
                        Throwable throwable0 = this.h;
                        if(throwable0 == null) {
                            d0.onComplete();
                            return;
                        }
                        d0.onError(throwable0);
                        return;
                    }
                    if(f$f1 == null) {
                        break;
                    }
                    d0.onNext(f$f1.a);
                    ++v;
                    f$f0 = f$f1;
                }
                if(v3 == 0) {
                    if(f$c0.e) {
                        f$c0.c = null;
                        return;
                    }
                    if(this.i && f$f0.get() == null) {
                        f$c0.c = null;
                        f$c0.e = true;
                        Throwable throwable1 = this.h;
                        if(throwable1 == null) {
                            d0.onComplete();
                            return;
                        }
                        d0.onError(throwable1);
                        return;
                    }
                }
                f$c0.c = f$f0;
                f$c0.f = v;
                v1 = f$c0.addAndGet(-v1);
            }
            while(v1 != 0);
        }

        io.reactivex.processors.f.f g() {
            io.reactivex.processors.f.f f$f2;
            io.reactivex.processors.f.f f$f0 = this.f;
            long v = this.d.e(this.c) - this.b;
            for(io.reactivex.processors.f.f f$f1 = (io.reactivex.processors.f.f)f$f0.get(); true; f$f1 = (io.reactivex.processors.f.f)f$f0.get()) {
                f$f2 = f$f0;
                f$f0 = f$f1;
                if(f$f0 == null || f$f0.b > v) {
                    break;
                }
            }
            return f$f2;
        }

        @Override  // io.reactivex.processors.f$b
        public Throwable getError() {
            return this.h;
        }

        @Override  // io.reactivex.processors.f$b
        @g
        public Object getValue() {
            io.reactivex.processors.f.f f$f0 = this.f;
            io.reactivex.processors.f.f f$f1;
            while((f$f1 = (io.reactivex.processors.f.f)f$f0.get()) != null) {
                f$f0 = f$f1;
            }
            long v = this.d.e(this.c);
            return f$f0.b >= v - this.b ? f$f0.a : null;
        }

        int h(io.reactivex.processors.f.f f$f0) {
            int v;
            for(v = 0; v != 0x7FFFFFFF; ++v) {
                f$f0 = (io.reactivex.processors.f.f)f$f0.get();
                if(f$f0 == null) {
                    break;
                }
            }
            return v;
        }

        void i() {
            int v = this.e;
            if(v > this.a) {
                this.e = v - 1;
                this.f = (io.reactivex.processors.f.f)this.f.get();
            }
            long v1 = this.d.e(this.c) - this.b;
            for(io.reactivex.processors.f.f f$f0 = this.f; true; f$f0 = f$f1) {
                if(this.e <= 1) {
                    this.f = f$f0;
                    return;
                }
                io.reactivex.processors.f.f f$f1 = (io.reactivex.processors.f.f)f$f0.get();
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

        @Override  // io.reactivex.processors.f$b
        public boolean isDone() {
            return this.i;
        }

        void j() {
            long v = this.d.e(this.c) - this.b;
            for(io.reactivex.processors.f.f f$f0 = this.f; true; f$f0 = f$f1) {
                io.reactivex.processors.f.f f$f1 = (io.reactivex.processors.f.f)f$f0.get();
                if(f$f1 == null) {
                    if(f$f0.a != null) {
                        this.f = new io.reactivex.processors.f.f(null, 0L);
                        return;
                    }
                    this.f = f$f0;
                    return;
                }
                if(f$f1.b > v) {
                    if(f$f0.a != null) {
                        io.reactivex.processors.f.f f$f2 = new io.reactivex.processors.f.f(null, 0L);
                        f$f2.lazySet(f$f0.get());
                        this.f = f$f2;
                        return;
                    }
                    this.f = f$f0;
                    return;
                }
            }
        }

        @Override  // io.reactivex.processors.f$b
        public int size() {
            return this.h(this.g());
        }
    }

    static final class io.reactivex.processors.f.e implements b {
        final int a;
        int b;
        volatile a c;
        a d;
        Throwable e;
        volatile boolean f;

        io.reactivex.processors.f.e(int v) {
            this.a = io.reactivex.internal.functions.b.h(v, "maxSize");
            a f$a0 = new a(null);
            this.d = f$a0;
            this.c = f$a0;
        }

        @Override  // io.reactivex.processors.f$b
        public void a() {
            this.d();
            this.f = true;
        }

        @Override  // io.reactivex.processors.f$b
        public void b(Object object0) {
            a f$a0 = new a(object0);
            a f$a1 = this.d;
            this.d = f$a0;
            ++this.b;
            f$a1.set(f$a0);
            this.g();
        }

        @Override  // io.reactivex.processors.f$b
        public void c(Throwable throwable0) {
            this.e = throwable0;
            this.d();
            this.f = true;
        }

        @Override  // io.reactivex.processors.f$b
        public void d() {
            if(this.c.a != null) {
                a f$a0 = new a(null);
                f$a0.lazySet(this.c.get());
                this.c = f$a0;
            }
        }

        @Override  // io.reactivex.processors.f$b
        public Object[] e(Object[] arr_object) {
            a f$a0 = this.c;
            a f$a1 = f$a0;
            int v1;
            for(v1 = 0; true; ++v1) {
                f$a1 = (a)f$a1.get();
                if(f$a1 == null) {
                    break;
                }
            }
            if(arr_object.length < v1) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v1);
            }
            for(int v = 0; v < v1; ++v) {
                f$a0 = (a)f$a0.get();
                arr_object[v] = f$a0.a;
            }
            if(arr_object.length > v1) {
                arr_object[v1] = null;
            }
            return arr_object;
        }

        @Override  // io.reactivex.processors.f$b
        public void f(io.reactivex.processors.f.c f$c0) {
            if(f$c0.getAndIncrement() != 0) {
                return;
            }
            d d0 = f$c0.a;
            a f$a0 = (a)f$c0.c;
            if(f$a0 == null) {
                f$a0 = this.c;
            }
            long v = f$c0.f;
            int v1 = 1;
            do {
                long v2 = f$c0.d.get();
                int v3;
                while((v3 = Long.compare(v, v2)) != 0) {
                    if(f$c0.e) {
                        f$c0.c = null;
                        return;
                    }
                    boolean z = this.f;
                    a f$a1 = (a)f$a0.get();
                    if(z && f$a1 == null) {
                        f$c0.c = null;
                        f$c0.e = true;
                        Throwable throwable0 = this.e;
                        if(throwable0 == null) {
                            d0.onComplete();
                            return;
                        }
                        d0.onError(throwable0);
                        return;
                    }
                    if(f$a1 == null) {
                        break;
                    }
                    d0.onNext(f$a1.a);
                    ++v;
                    f$a0 = f$a1;
                }
                if(v3 == 0) {
                    if(f$c0.e) {
                        f$c0.c = null;
                        return;
                    }
                    if(this.f && f$a0.get() == null) {
                        f$c0.c = null;
                        f$c0.e = true;
                        Throwable throwable1 = this.e;
                        if(throwable1 == null) {
                            d0.onComplete();
                            return;
                        }
                        d0.onError(throwable1);
                        return;
                    }
                }
                f$c0.c = f$a0;
                f$c0.f = v;
                v1 = f$c0.addAndGet(-v1);
            }
            while(v1 != 0);
        }

        void g() {
            int v = this.b;
            if(v > this.a) {
                this.b = v - 1;
                this.c = (a)this.c.get();
            }
        }

        @Override  // io.reactivex.processors.f$b
        public Throwable getError() {
            return this.e;
        }

        @Override  // io.reactivex.processors.f$b
        public Object getValue() {
            a f$a0 = this.c;
            a f$a1;
            while((f$a1 = (a)f$a0.get()) != null) {
                f$a0 = f$a1;
            }
            return f$a0.a;
        }

        @Override  // io.reactivex.processors.f$b
        public boolean isDone() {
            return this.f;
        }

        @Override  // io.reactivex.processors.f$b
        public int size() {
            a f$a0 = this.c;
            int v;
            for(v = 0; v != 0x7FFFFFFF; ++v) {
                f$a0 = (a)f$a0.get();
                if(f$a0 == null) {
                    break;
                }
            }
            return v;
        }
    }

    static final class io.reactivex.processors.f.f extends AtomicReference {
        final Object a;
        final long b;
        private static final long c = 0x58E06200F2EDB94CL;

        io.reactivex.processors.f.f(Object object0, long v) {
            this.a = object0;
            this.b = v;
        }
    }

    static final class io.reactivex.processors.f.g implements b {
        final List a;
        Throwable b;
        volatile boolean c;
        volatile int d;

        io.reactivex.processors.f.g(int v) {
            this.a = new ArrayList(io.reactivex.internal.functions.b.h(v, "capacityHint"));
        }

        @Override  // io.reactivex.processors.f$b
        public void a() {
            this.c = true;
        }

        @Override  // io.reactivex.processors.f$b
        public void b(Object object0) {
            this.a.add(object0);
            ++this.d;
        }

        @Override  // io.reactivex.processors.f$b
        public void c(Throwable throwable0) {
            this.b = throwable0;
            this.c = true;
        }

        @Override  // io.reactivex.processors.f$b
        public void d() {
        }

        @Override  // io.reactivex.processors.f$b
        public Object[] e(Object[] arr_object) {
            int v = this.d;
            if(v == 0) {
                if(arr_object.length != 0) {
                    arr_object[0] = null;
                }
                return arr_object;
            }
            List list0 = this.a;
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

        @Override  // io.reactivex.processors.f$b
        public void f(io.reactivex.processors.f.c f$c0) {
            int v;
            if(f$c0.getAndIncrement() != 0) {
                return;
            }
            List list0 = this.a;
            d d0 = f$c0.a;
            Integer integer0 = (Integer)f$c0.c;
            if(integer0 == null) {
                v = 0;
                f$c0.c = 0;
            }
            else {
                v = (int)integer0;
            }
            long v1 = f$c0.f;
            int v2 = 1;
            do {
                long v3 = f$c0.d.get();
                int v4;
                while((v4 = Long.compare(v1, v3)) != 0) {
                    if(f$c0.e) {
                        f$c0.c = null;
                        return;
                    }
                    int v5 = this.d;
                    if(this.c && v == v5) {
                        f$c0.c = null;
                        f$c0.e = true;
                        Throwable throwable0 = this.b;
                        if(throwable0 == null) {
                            d0.onComplete();
                            return;
                        }
                        d0.onError(throwable0);
                        return;
                    }
                    if(v == v5) {
                        break;
                    }
                    d0.onNext(list0.get(v));
                    ++v;
                    ++v1;
                }
                if(v4 == 0) {
                    if(f$c0.e) {
                        f$c0.c = null;
                        return;
                    }
                    if(this.c && v == this.d) {
                        f$c0.c = null;
                        f$c0.e = true;
                        Throwable throwable1 = this.b;
                        if(throwable1 == null) {
                            d0.onComplete();
                            return;
                        }
                        d0.onError(throwable1);
                        return;
                    }
                }
                f$c0.c = v;
                f$c0.f = v1;
                v2 = f$c0.addAndGet(-v2);
            }
            while(v2 != 0);
        }

        @Override  // io.reactivex.processors.f$b
        public Throwable getError() {
            return this.b;
        }

        @Override  // io.reactivex.processors.f$b
        @g
        public Object getValue() {
            return this.d == 0 ? null : this.a.get(this.d - 1);
        }

        @Override  // io.reactivex.processors.f$b
        public boolean isDone() {
            return this.c;
        }

        @Override  // io.reactivex.processors.f$b
        public int size() {
            return this.d;
        }
    }

    final b b;
    boolean c;
    final AtomicReference d;
    private static final Object[] e;
    static final io.reactivex.processors.f.c[] f;
    static final io.reactivex.processors.f.c[] g;

    static {
        f.e = new Object[0];
        f.f = new io.reactivex.processors.f.c[0];
        f.g = new io.reactivex.processors.f.c[0];
    }

    f(b f$b0) {
        this.b = f$b0;
        this.d = new AtomicReference(f.f);
    }

    // 去混淆评级： 低(20)
    @Override  // io.reactivex.processors.c
    @g
    public Throwable O8() {
        return this.b.isDone() ? this.b.getError() : null;
    }

    @Override  // io.reactivex.processors.c
    public boolean P8() {
        return this.b.isDone() && this.b.getError() == null;
    }

    @Override  // io.reactivex.processors.c
    public boolean Q8() {
        return ((io.reactivex.processors.f.c[])this.d.get()).length != 0;
    }

    @Override  // io.reactivex.processors.c
    public boolean R8() {
        return this.b.isDone() && this.b.getError() != null;
    }

    boolean T8(io.reactivex.processors.f.c f$c0) {
        do {
            io.reactivex.processors.f.c[] arr_f$c = (io.reactivex.processors.f.c[])this.d.get();
            if(arr_f$c == f.g) {
                return false;
            }
            io.reactivex.processors.f.c[] arr_f$c1 = new io.reactivex.processors.f.c[arr_f$c.length + 1];
            System.arraycopy(arr_f$c, 0, arr_f$c1, 0, arr_f$c.length);
            arr_f$c1[arr_f$c.length] = f$c0;
        }
        while(!androidx.compose.animation.core.d.a(this.d, arr_f$c, arr_f$c1));
        return true;
    }

    public void U8() {
        this.b.d();
    }

    @d3.d
    @d3.f
    public static f V8() {
        return new f(new io.reactivex.processors.f.g(16));
    }

    @d3.d
    @d3.f
    public static f W8(int v) {
        return new f(new io.reactivex.processors.f.g(v));
    }

    static f X8() {
        return new f(new io.reactivex.processors.f.e(0x7FFFFFFF));
    }

    @d3.d
    @d3.f
    public static f Y8(int v) {
        return new f(new io.reactivex.processors.f.e(v));
    }

    @d3.d
    @d3.f
    public static f Z8(long v, TimeUnit timeUnit0, J j0) {
        return new f(new io.reactivex.processors.f.d(0x7FFFFFFF, v, timeUnit0, j0));
    }

    @d3.d
    @d3.f
    public static f a9(long v, TimeUnit timeUnit0, J j0, int v1) {
        return new f(new io.reactivex.processors.f.d(v1, v, timeUnit0, j0));
    }

    public Object b9() {
        return this.b.getValue();
    }

    public Object[] c9() {
        Object[] arr_object = this.d9(f.e);
        return arr_object == f.e ? new Object[0] : arr_object;
    }

    public Object[] d9(Object[] arr_object) {
        return this.b.e(arr_object);
    }

    public boolean e9() {
        return this.b.size() != 0;
    }

    void f9(io.reactivex.processors.f.c f$c0) {
        io.reactivex.processors.f.c[] arr_f$c1;
        do {
            io.reactivex.processors.f.c[] arr_f$c = (io.reactivex.processors.f.c[])this.d.get();
            if(arr_f$c == f.g || arr_f$c == f.f) {
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
                arr_f$c1 = f.f;
            }
            else {
                io.reactivex.processors.f.c[] arr_f$c2 = new io.reactivex.processors.f.c[v - 1];
                System.arraycopy(arr_f$c, 0, arr_f$c2, 0, v1);
                System.arraycopy(arr_f$c, v1 + 1, arr_f$c2, v1, v - v1 - 1);
                arr_f$c1 = arr_f$c2;
            }
        }
        while(!androidx.compose.animation.core.d.a(this.d, arr_f$c, arr_f$c1));
    }

    @Override  // io.reactivex.q, org.reactivestreams.d
    public void g(e e0) {
        if(this.c) {
            e0.cancel();
            return;
        }
        e0.request(0x7FFFFFFFFFFFFFFFL);
    }

    int g9() {
        return this.b.size();
    }

    int h9() {
        return ((io.reactivex.processors.f.c[])this.d.get()).length;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.processors.f.c f$c0 = new io.reactivex.processors.f.c(d0, this);
        d0.g(f$c0);
        if(this.T8(f$c0) && f$c0.e) {
            this.f9(f$c0);
            return;
        }
        this.b.f(f$c0);
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        if(this.c) {
            return;
        }
        this.c = true;
        b f$b0 = this.b;
        f$b0.a();
        io.reactivex.processors.f.c[] arr_f$c = (io.reactivex.processors.f.c[])this.d.getAndSet(f.g);
        for(int v = 0; v < arr_f$c.length; ++v) {
            f$b0.f(arr_f$c[v]);
        }
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        io.reactivex.internal.functions.b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.c) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        this.c = true;
        b f$b0 = this.b;
        f$b0.c(throwable0);
        io.reactivex.processors.f.c[] arr_f$c = (io.reactivex.processors.f.c[])this.d.getAndSet(f.g);
        for(int v = 0; v < arr_f$c.length; ++v) {
            f$b0.f(arr_f$c[v]);
        }
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        io.reactivex.internal.functions.b.g(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.c) {
            return;
        }
        b f$b0 = this.b;
        f$b0.b(object0);
        io.reactivex.processors.f.c[] arr_f$c = (io.reactivex.processors.f.c[])this.d.get();
        for(int v = 0; v < arr_f$c.length; ++v) {
            f$b0.f(arr_f$c[v]);
        }
    }
}

