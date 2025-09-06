package io.reactivex.internal.operators.flowable;

import d3.f;
import d3.g;
import e3.o;
import io.reactivex.internal.subscriptions.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import io.reactivex.l;
import io.reactivex.q;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class u extends l {
    static final class a extends c {
        final d b;
        final o c;
        final b[] d;
        final io.reactivex.internal.queue.c e;
        final Object[] f;
        final boolean g;
        boolean h;
        int i;
        int j;
        volatile boolean k;
        final AtomicLong l;
        volatile boolean m;
        final AtomicReference n;
        private static final long o = 0xB978216A761B5443L;

        a(d d0, o o0, int v, int v1, boolean z) {
            this.b = d0;
            this.c = o0;
            b[] arr_u$b = new b[v];
            for(int v2 = 0; v2 < v; ++v2) {
                arr_u$b[v2] = new b(this, v2, v1);
            }
            this.d = arr_u$b;
            this.f = new Object[v];
            this.e = new io.reactivex.internal.queue.c(v1);
            this.l = new AtomicLong();
            this.n = new AtomicReference();
            this.g = z;
        }

        void a() {
            b[] arr_u$b = this.d;
            for(int v = 0; v < arr_u$b.length; ++v) {
                arr_u$b[v].a();
            }
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.k = true;
            this.a();
        }

        @Override  // f3.o
        public void clear() {
            this.e.clear();
        }

        void d() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            if(this.h) {
                this.o();
                return;
            }
            this.n();
        }

        boolean f(boolean z, boolean z1, d d0, io.reactivex.internal.queue.c c0) {
            if(this.k) {
                this.a();
                c0.clear();
                return true;
            }
            if(z) {
                if(!this.g) {
                    Throwable throwable1 = k.c(this.n);
                    if(throwable1 != null && throwable1 != k.a) {
                        this.a();
                        c0.clear();
                        d0.onError(throwable1);
                        return true;
                    }
                    if(z1) {
                        this.a();
                        d0.onComplete();
                        return true;
                    }
                }
                else if(z1) {
                    this.a();
                    Throwable throwable0 = k.c(this.n);
                    if(throwable0 != null && throwable0 != k.a) {
                        d0.onError(throwable0);
                        return true;
                    }
                    d0.onComplete();
                    return true;
                }
            }
            return false;
        }

        @Override  // f3.k
        public int i(int v) {
            boolean z = false;
            if((v & 4) != 0) {
                return 0;
            }
            if((v & 2) != 0) {
                z = true;
            }
            this.h = z;
            return v & 2;
        }

        @Override  // f3.o
        public boolean isEmpty() {
            return this.e.isEmpty();
        }

        void n() {
            Object object1;
            d d0 = this.b;
            io.reactivex.internal.queue.c c0 = this.e;
            int v = 1;
            do {
                long v1 = this.l.get();
                long v2 = 0L;
                int v3;
                while((v3 = Long.compare(v2, v1)) != 0) {
                    boolean z = this.m;
                    Object object0 = c0.poll();
                    if(this.f(z, object0 == null, d0, c0)) {
                        return;
                    }
                    if(object0 == null) {
                        break;
                    }
                    Object[] arr_object = (Object[])c0.poll();
                    try {
                        object1 = io.reactivex.internal.functions.b.g(this.c.apply(arr_object), "The combiner returned a null value");
                    }
                    catch(Throwable throwable0) {
                        io.reactivex.exceptions.b.b(throwable0);
                        this.a();
                        k.a(this.n, throwable0);
                        d0.onError(k.c(this.n));
                        return;
                    }
                    d0.onNext(object1);
                    ((b)object0).b();
                    ++v2;
                }
                if(v3 == 0 && this.f(this.m, c0.isEmpty(), d0, c0)) {
                    return;
                }
                if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                    this.l.addAndGet(-v2);
                }
                v = this.addAndGet(-v);
            }
            while(v != 0);
        }

        void o() {
            d d0 = this.b;
            io.reactivex.internal.queue.c c0 = this.e;
            int v = 1;
            do {
                if(this.k) {
                    c0.clear();
                    return;
                }
                Throwable throwable0 = (Throwable)this.n.get();
                if(throwable0 != null) {
                    c0.clear();
                    d0.onError(throwable0);
                    return;
                }
                boolean z = this.m;
                boolean z1 = c0.isEmpty();
                if(!z1) {
                    d0.onNext(null);
                }
                if(z && z1) {
                    d0.onComplete();
                    return;
                }
                v = this.addAndGet(-v);
            }
            while(v != 0);
        }

        void p(int v) {
            synchronized(this) {
                Object[] arr_object = this.f;
                if(arr_object[v] == null) {
                    this.m = true;
                }
                else {
                    int v2 = this.j + 1;
                    if(v2 == arr_object.length) {
                        this.m = true;
                        this.d();
                        return;
                    }
                    this.j = v2;
                    return;
                }
            }
            this.d();
        }

        @Override  // f3.o
        @g
        public Object poll() throws Exception {
            Object object0 = this.e.poll();
            if(object0 == null) {
                return null;
            }
            Object[] arr_object = (Object[])this.e.poll();
            Object object1 = io.reactivex.internal.functions.b.g(this.c.apply(arr_object), "The combiner returned a null value");
            ((b)object0).b();
            return object1;
        }

        void q(int v, Throwable throwable0) {
            if(k.a(this.n, throwable0)) {
                if(!this.g) {
                    this.a();
                    this.m = true;
                    this.d();
                    return;
                }
                this.p(v);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        void r(int v, Object object0) {
            boolean z;
            synchronized(this) {
                Object[] arr_object = this.f;
                int v2 = this.i;
                if(arr_object[v] == null) {
                    ++v2;
                    this.i = v2;
                }
                arr_object[v] = object0;
                if(arr_object.length == v2) {
                    b u$b0 = this.d[v];
                    Object object1 = arr_object.clone();
                    this.e.j(u$b0, object1);
                    z = false;
                }
                else {
                    z = true;
                }
            }
            if(z) {
                this.d[v].b();
                return;
            }
            this.d();
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.l, v);
                this.d();
            }
        }

        void s(org.reactivestreams.c[] arr_c, int v) {
            b[] arr_u$b = this.d;
            for(int v1 = 0; v1 < v && !this.m && !this.k; ++v1) {
                arr_c[v1].e(arr_u$b[v1]);
            }
        }
    }

    static final class b extends AtomicReference implements q {
        final a a;
        final int b;
        final int c;
        final int d;
        int e;
        private static final long f = -8730235182291002949L;

        b(a u$a0, int v, int v1) {
            this.a = u$a0;
            this.b = v;
            this.c = v1;
            this.d = v1 - (v1 >> 2);
        }

        public void a() {
            j.a(this);
        }

        public void b() {
            int v = this.e + 1;
            if(v == this.d) {
                this.e = 0;
                ((e)this.get()).request(((long)v));
                return;
            }
            this.e = v;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.i(this, e0, ((long)this.c));
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a.p(this.b);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.q(this.b, throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.a.r(this.b, object0);
        }
    }

    final class io.reactivex.internal.operators.flowable.u.c implements o {
        final u a;

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return u.this.d.apply(new Object[]{object0});
        }
    }

    @g
    final org.reactivestreams.c[] b;
    @g
    final Iterable c;
    final o d;
    final int e;
    final boolean f;

    public u(@f Iterable iterable0, @f o o0, int v, boolean z) {
        this.b = null;
        this.c = iterable0;
        this.d = o0;
        this.e = v;
        this.f = z;
    }

    public u(@f org.reactivestreams.c[] arr_c, @f o o0, int v, boolean z) {
        this.b = arr_c;
        this.c = null;
        this.d = o0;
        this.e = v;
        this.f = z;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        org.reactivestreams.c c0;
        int v;
        Iterator iterator0;
        org.reactivestreams.c[] arr_c = this.b;
        if(arr_c == null) {
            try {
                arr_c = new org.reactivestreams.c[8];
                iterator0 = (Iterator)io.reactivex.internal.functions.b.g(this.c.iterator(), "The iterator returned is null");
                v = 0;
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                io.reactivex.internal.subscriptions.g.b(throwable0, d0);
                return;
            }
            while(true) {
                try {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                }
                catch(Throwable throwable1) {
                    io.reactivex.exceptions.b.b(throwable1);
                    io.reactivex.internal.subscriptions.g.b(throwable1, d0);
                    return;
                }
                try {
                    Object object0 = iterator0.next();
                    c0 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(object0, "The publisher returned by the iterator is null");
                }
                catch(Throwable throwable2) {
                    io.reactivex.exceptions.b.b(throwable2);
                    io.reactivex.internal.subscriptions.g.b(throwable2, d0);
                    return;
                }
                if(v == arr_c.length) {
                    org.reactivestreams.c[] arr_c1 = new org.reactivestreams.c[(v >> 2) + v];
                    System.arraycopy(arr_c, 0, arr_c1, 0, v);
                    arr_c = arr_c1;
                }
                arr_c[v] = c0;
                ++v;
            }
        }
        else {
            v = arr_c.length;
        }
        if(v == 0) {
            io.reactivex.internal.subscriptions.g.a(d0);
            return;
        }
        if(v == 1) {
            arr_c[0].e(new io.reactivex.internal.operators.flowable.C0.b(d0, new io.reactivex.internal.operators.flowable.u.c(this)));
            return;
        }
        a u$a0 = new a(d0, this.d, v, this.e, this.f);
        d0.g(u$a0);
        u$a0.s(arr_c, v);
    }
}

