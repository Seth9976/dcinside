package io.reactivex.internal.operators.observable;

import e3.o;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.util.k;
import io.reactivex.subjects.j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class l0 extends a {
    static final class io.reactivex.internal.operators.observable.l0.a extends AtomicInteger implements c, b {
        final I a;
        final io.reactivex.internal.queue.c b;
        final io.reactivex.disposables.b c;
        final Map d;
        final Map e;
        final AtomicReference f;
        final o g;
        final o h;
        final e3.c i;
        final AtomicInteger j;
        int k;
        int l;
        volatile boolean m;
        private static final long n = 0xABBEB4AB90BF18C7L;
        static final Integer o;
        static final Integer p;
        static final Integer q;
        static final Integer r;

        static {
            io.reactivex.internal.operators.observable.l0.a.o = 1;
            io.reactivex.internal.operators.observable.l0.a.p = 2;
            io.reactivex.internal.operators.observable.l0.a.q = 3;
            io.reactivex.internal.operators.observable.l0.a.r = 4;
        }

        io.reactivex.internal.operators.observable.l0.a(I i0, o o0, o o1, e3.c c0) {
            this.a = i0;
            this.c = new io.reactivex.disposables.b();
            this.b = new io.reactivex.internal.queue.c(0x80);
            this.d = new LinkedHashMap();
            this.e = new LinkedHashMap();
            this.f = new AtomicReference();
            this.g = o0;
            this.h = o1;
            this.i = c0;
            this.j = new AtomicInteger(2);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.m;
        }

        @Override  // io.reactivex.internal.operators.observable.l0$b
        public void b(Throwable throwable0) {
            if(k.a(this.f, throwable0)) {
                this.h();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.internal.operators.observable.l0$b
        public void c(Throwable throwable0) {
            if(k.a(this.f, throwable0)) {
                this.j.decrementAndGet();
                this.h();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.internal.operators.observable.l0$b
        public void d(boolean z, Object object0) {
            synchronized(this) {
                this.b.j((z ? io.reactivex.internal.operators.observable.l0.a.o : io.reactivex.internal.operators.observable.l0.a.p), object0);
            }
            this.h();
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.m) {
                return;
            }
            this.m = true;
            this.g();
            if(this.getAndIncrement() == 0) {
                this.b.clear();
            }
        }

        @Override  // io.reactivex.internal.operators.observable.l0$b
        public void e(boolean z, io.reactivex.internal.operators.observable.l0.c l0$c0) {
            synchronized(this) {
                this.b.j((z ? io.reactivex.internal.operators.observable.l0.a.q : io.reactivex.internal.operators.observable.l0.a.r), l0$c0);
            }
            this.h();
        }

        @Override  // io.reactivex.internal.operators.observable.l0$b
        public void f(d l0$d0) {
            this.c.c(l0$d0);
            this.j.decrementAndGet();
            this.h();
        }

        void g() {
            this.c.dispose();
        }

        void h() {
            G g1;
            Object object2;
            G g0;
            if(this.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.c c0 = this.b;
            I i0 = this.a;
            int v = 1;
            while(true) {
                if(this.m) {
                    c0.clear();
                    return;
                }
                if(((Throwable)this.f.get()) != null) {
                    c0.clear();
                    this.g();
                    this.i(i0);
                    return;
                }
                boolean z = this.j.get() == 0;
                Integer integer0 = (Integer)c0.poll();
                if(z && integer0 == null) {
                    for(Object object0: this.d.values()) {
                        ((j)object0).onComplete();
                    }
                    this.d.clear();
                    this.e.clear();
                    this.c.dispose();
                    i0.onComplete();
                    return;
                }
                if(integer0 == null) {
                    v = this.addAndGet(-v);
                    if(v != 0) {
                        continue;
                    }
                    return;
                }
                Object object1 = c0.poll();
                if(integer0 == io.reactivex.internal.operators.observable.l0.a.o) {
                    j j0 = j.n8();
                    int v1 = this.k;
                    this.k = v1 + 1;
                    this.d.put(v1, j0);
                    try {
                        g0 = (G)io.reactivex.internal.functions.b.g(this.g.apply(object1), "The leftEnd returned a null ObservableSource");
                    }
                    catch(Throwable throwable0) {
                        this.j(throwable0, i0, c0);
                        return;
                    }
                    io.reactivex.internal.operators.observable.l0.c l0$c0 = new io.reactivex.internal.operators.observable.l0.c(this, true, v1);
                    this.c.d(l0$c0);
                    g0.d(l0$c0);
                    if(((Throwable)this.f.get()) != null) {
                        c0.clear();
                        this.g();
                        this.i(i0);
                        return;
                    }
                    try {
                        object2 = io.reactivex.internal.functions.b.g(this.i.apply(object1, j0), "The resultSelector returned a null value");
                    }
                    catch(Throwable throwable1) {
                        this.j(throwable1, i0, c0);
                        return;
                    }
                    i0.onNext(object2);
                    for(Object object3: this.e.values()) {
                        j0.onNext(object3);
                    }
                }
                else if(integer0 == io.reactivex.internal.operators.observable.l0.a.p) {
                    int v2 = this.l;
                    this.l = v2 + 1;
                    this.e.put(v2, object1);
                    try {
                        g1 = (G)io.reactivex.internal.functions.b.g(this.h.apply(object1), "The rightEnd returned a null ObservableSource");
                    }
                    catch(Throwable throwable2) {
                        this.j(throwable2, i0, c0);
                        return;
                    }
                    io.reactivex.internal.operators.observable.l0.c l0$c1 = new io.reactivex.internal.operators.observable.l0.c(this, false, v2);
                    this.c.d(l0$c1);
                    g1.d(l0$c1);
                    if(((Throwable)this.f.get()) != null) {
                        c0.clear();
                        this.g();
                        this.i(i0);
                        return;
                    }
                    for(Object object4: this.d.values()) {
                        ((j)object4).onNext(object1);
                    }
                }
                else if(integer0 == io.reactivex.internal.operators.observable.l0.a.q) {
                    j j1 = (j)this.d.remove(((io.reactivex.internal.operators.observable.l0.c)object1).c);
                    this.c.b(((io.reactivex.internal.operators.observable.l0.c)object1));
                    if(j1 == null) {
                        continue;
                    }
                    j1.onComplete();
                }
                else if(integer0 == io.reactivex.internal.operators.observable.l0.a.r) {
                    this.e.remove(((io.reactivex.internal.operators.observable.l0.c)object1).c);
                    this.c.b(((io.reactivex.internal.operators.observable.l0.c)object1));
                }
            }
        }

        void i(I i0) {
            Throwable throwable0 = k.c(this.f);
            for(Object object0: this.d.values()) {
                ((j)object0).onError(throwable0);
            }
            this.d.clear();
            this.e.clear();
            i0.onError(throwable0);
        }

        void j(Throwable throwable0, I i0, io.reactivex.internal.queue.c c0) {
            io.reactivex.exceptions.b.b(throwable0);
            k.a(this.f, throwable0);
            c0.clear();
            this.g();
            this.i(i0);
        }
    }

    interface b {
        void b(Throwable arg1);

        void c(Throwable arg1);

        void d(boolean arg1, Object arg2);

        void e(boolean arg1, io.reactivex.internal.operators.observable.l0.c arg2);

        void f(d arg1);
    }

    static final class io.reactivex.internal.operators.observable.l0.c extends AtomicReference implements I, c {
        final b a;
        final boolean b;
        final int c;
        private static final long d = 0x1A24EC53E2780A15L;

        io.reactivex.internal.operators.observable.l0.c(b l0$b0, boolean z, int v) {
            this.a = l0$b0;
            this.b = z;
            this.c = v;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return io.reactivex.internal.disposables.d.c(((c)this.get()));
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            io.reactivex.internal.disposables.d.g(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.a.e(this.b, this);
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.a.b(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(io.reactivex.internal.disposables.d.b(this)) {
                this.a.e(this.b, this);
            }
        }
    }

    static final class d extends AtomicReference implements I, c {
        final b a;
        final boolean b;
        private static final long c = 0x1A24EC53E2780A15L;

        d(b l0$b0, boolean z) {
            this.a = l0$b0;
            this.b = z;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return io.reactivex.internal.disposables.d.c(((c)this.get()));
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            io.reactivex.internal.disposables.d.g(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.a.f(this);
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.a.c(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.a.d(this.b, object0);
        }
    }

    final G b;
    final o c;
    final o d;
    final e3.c e;

    public l0(G g0, G g1, o o0, o o1, e3.c c0) {
        super(g0);
        this.b = g1;
        this.c = o0;
        this.d = o1;
        this.e = c0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.internal.operators.observable.l0.a l0$a0 = new io.reactivex.internal.operators.observable.l0.a(i0, this.c, this.d, this.e);
        i0.b(l0$a0);
        d l0$d0 = new d(l0$a0, true);
        l0$a0.c.d(l0$d0);
        d l0$d1 = new d(l0$a0, false);
        l0$a0.c.d(l0$d1);
        this.a.d(l0$d0);
        this.b.d(l0$d1);
    }
}

