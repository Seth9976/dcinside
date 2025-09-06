package io.reactivex.internal.operators.observable;

import e3.o;
import io.reactivex.B;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class u extends B {
    static final class a extends AtomicReference implements I {
        final b a;
        final int b;
        private static final long c = 0xBD0EB6F2C0FA37ABL;

        a(b u$b0, int v) {
            this.a = u$b0;
            this.b = v;
        }

        public void a() {
            d.b(this);
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            d.g(this, c0);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.a.e(this.b);
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.a.f(this.b, throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.a.g(this.b, object0);
        }
    }

    static final class b extends AtomicInteger implements c {
        final I a;
        final o b;
        final a[] c;
        Object[] d;
        final io.reactivex.internal.queue.c e;
        final boolean f;
        volatile boolean g;
        volatile boolean h;
        final io.reactivex.internal.util.c i;
        int j;
        int k;
        private static final long l = 0x76E7117251786DB1L;

        b(I i0, o o0, int v, int v1, boolean z) {
            this.i = new io.reactivex.internal.util.c();
            this.a = i0;
            this.b = o0;
            this.f = z;
            this.d = new Object[v];
            a[] arr_u$a = new a[v];
            for(int v2 = 0; v2 < v; ++v2) {
                arr_u$a[v2] = new a(this, v2);
            }
            this.c = arr_u$a;
            this.e = new io.reactivex.internal.queue.c(v1);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.g;
        }

        void b() {
            a[] arr_u$a = this.c;
            for(int v = 0; v < arr_u$a.length; ++v) {
                arr_u$a[v].a();
            }
        }

        void c(io.reactivex.internal.queue.c c0) {
            synchronized(this) {
                this.d = null;
            }
            c0.clear();
        }

        void d() {
            Object object0;
            if(this.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.c c0 = this.e;
            I i0 = this.a;
            boolean z = this.f;
            int v = 1;
            while(true) {
                if(this.g) {
                    this.c(c0);
                    return;
                }
                if(!z && this.i.get() != null) {
                    this.b();
                    this.c(c0);
                    i0.onError(this.i.c());
                    return;
                }
                boolean z1 = this.h;
                Object[] arr_object = (Object[])c0.poll();
                if(z1 && arr_object == null) {
                    this.c(c0);
                    Throwable throwable0 = this.i.c();
                    if(throwable0 == null) {
                        i0.onComplete();
                        return;
                    }
                    i0.onError(throwable0);
                    return;
                }
                if(arr_object == null) {
                    v = this.addAndGet(-v);
                    if(v != 0) {
                        continue;
                    }
                    return;
                }
                try {
                    object0 = io.reactivex.internal.functions.b.g(this.b.apply(arr_object), "The combiner returned a null value");
                }
                catch(Throwable throwable1) {
                    io.reactivex.exceptions.b.b(throwable1);
                    this.i.a(throwable1);
                    this.b();
                    this.c(c0);
                    i0.onError(this.i.c());
                    return;
                }
                i0.onNext(object0);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.g) {
                this.g = true;
                this.b();
                if(this.getAndIncrement() == 0) {
                    this.c(this.e);
                }
            }
        }

        void e(int v) {
            synchronized(this) {
                Object[] arr_object = this.d;
                if(arr_object == null) {
                    return;
                }
                boolean z = arr_object[v] == null;
                if(z) {
                    this.h = true;
                }
                else {
                    int v2 = this.k + 1;
                    this.k = v2;
                    if(v2 == arr_object.length) {
                        this.h = true;
                    }
                }
            }
            if(z) {
                this.b();
            }
            this.d();
        }

        void f(int v, Throwable throwable0) {
            int v1 = 1;
            if(this.i.a(throwable0)) {
                if(this.f) {
                    synchronized(this) {
                        Object[] arr_object = this.d;
                        if(arr_object != null) {
                            int v2 = arr_object[v] == null ? 1 : 0;
                            if(v2 == 0) {
                                int v3 = this.k + 1;
                                this.k = v3;
                                if(v3 == arr_object.length) {
                                    this.h = true;
                                }
                            }
                            else {
                                this.h = true;
                            }
                            v1 = v2;
                            goto label_22;
                        }
                    }
                    return;
                }
            label_22:
                if(v1 != 0) {
                    this.b();
                }
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        void g(int v, Object object0) {
            boolean z;
            synchronized(this) {
                Object[] arr_object = this.d;
                if(arr_object == null) {
                    return;
                }
                int v2 = this.j;
                if(arr_object[v] == null) {
                    ++v2;
                    this.j = v2;
                }
                arr_object[v] = object0;
                if(v2 == arr_object.length) {
                    Object object1 = arr_object.clone();
                    this.e.offer(object1);
                    z = true;
                }
                else {
                    z = false;
                }
            }
            if(z) {
                this.d();
            }
        }

        public void h(G[] arr_g) {
            a[] arr_u$a = this.c;
            this.a.b(this);
            for(int v = 0; v < arr_u$a.length && !this.h && !this.g; ++v) {
                arr_g[v].d(arr_u$a[v]);
            }
        }
    }

    final G[] a;
    final Iterable b;
    final o c;
    final int d;
    final boolean e;

    public u(G[] arr_g, Iterable iterable0, o o0, int v, boolean z) {
        this.a = arr_g;
        this.b = iterable0;
        this.c = o0;
        this.d = v;
        this.e = z;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        int v;
        G[] arr_g = this.a;
        if(arr_g == null) {
            arr_g = new B[8];
            v = 0;
            for(Object object0: this.b) {
                if(v == arr_g.length) {
                    G[] arr_g1 = new G[(v >> 2) + v];
                    System.arraycopy(arr_g, 0, arr_g1, 0, v);
                    arr_g = arr_g1;
                }
                arr_g[v] = (G)object0;
                ++v;
            }
        }
        else {
            v = arr_g.length;
        }
        if(v == 0) {
            e.d(i0);
            return;
        }
        new b(i0, this.c, v, this.d, this.e).h(arr_g);
    }
}

