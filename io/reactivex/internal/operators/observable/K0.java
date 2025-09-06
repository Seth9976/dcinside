package io.reactivex.internal.operators.observable;

import e3.o;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class k0 extends a {
    public static final class io.reactivex.internal.operators.observable.k0.a extends AtomicInteger implements I, c {
        final I a;
        final o b;
        final o c;
        final int d;
        final boolean e;
        final Map f;
        c g;
        final AtomicBoolean h;
        private static final long i = 0xCCD08E47B9F8DD32L;
        static final Object j;

        static {
            io.reactivex.internal.operators.observable.k0.a.j = new Object();
        }

        public io.reactivex.internal.operators.observable.k0.a(I i0, o o0, o o1, int v, boolean z) {
            this.h = new AtomicBoolean();
            this.a = i0;
            this.b = o0;
            this.c = o1;
            this.d = v;
            this.e = z;
            this.f = new ConcurrentHashMap();
            this.lazySet(1);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.h.get();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.g, c0)) {
                this.g = c0;
                this.a.b(this);
            }
        }

        public void c(Object object0) {
            if(object0 == null) {
                object0 = io.reactivex.internal.operators.observable.k0.a.j;
            }
            this.f.remove(object0);
            if(this.decrementAndGet() == 0) {
                this.g.dispose();
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.h.compareAndSet(false, true) && this.decrementAndGet() == 0) {
                this.g.dispose();
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            ArrayList arrayList0 = new ArrayList(this.f.values());
            this.f.clear();
            for(Object object0: arrayList0) {
                ((b)object0).onComplete();
            }
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            ArrayList arrayList0 = new ArrayList(this.f.values());
            this.f.clear();
            for(Object object0: arrayList0) {
                ((b)object0).onError(throwable0);
            }
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            Object object3;
            Object object1;
            try {
                object1 = this.b.apply(object0);
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.g.dispose();
                this.onError(throwable0);
                return;
            }
            Object object2 = object1 == null ? io.reactivex.internal.operators.observable.k0.a.j : object1;
            b k0$b0 = (b)this.f.get(object2);
            if(k0$b0 == null) {
                if(this.h.get()) {
                    return;
                }
                k0$b0 = b.j8(object1, this.d, this, this.e);
                this.f.put(object2, k0$b0);
                this.getAndIncrement();
                this.a.onNext(k0$b0);
            }
            try {
                object3 = io.reactivex.internal.functions.b.g(this.c.apply(object0), "The value supplied is null");
            }
            catch(Throwable throwable1) {
                io.reactivex.exceptions.b.b(throwable1);
                this.g.dispose();
                this.onError(throwable1);
                return;
            }
            k0$b0.onNext(object3);
        }
    }

    static final class b extends io.reactivex.observables.b {
        final io.reactivex.internal.operators.observable.k0.c b;

        protected b(Object object0, io.reactivex.internal.operators.observable.k0.c k0$c0) {
            super(object0);
            this.b = k0$c0;
        }

        @Override  // io.reactivex.B
        protected void I5(I i0) {
            this.b.d(i0);
        }

        public static b j8(Object object0, int v, io.reactivex.internal.operators.observable.k0.a k0$a0, boolean z) {
            return new b(object0, new io.reactivex.internal.operators.observable.k0.c(v, k0$a0, object0, z));
        }

        public void onComplete() {
            this.b.e();
        }

        public void onError(Throwable throwable0) {
            this.b.f(throwable0);
        }

        public void onNext(Object object0) {
            this.b.g(object0);
        }
    }

    static final class io.reactivex.internal.operators.observable.k0.c extends AtomicInteger implements G, c {
        final Object a;
        final io.reactivex.internal.queue.c b;
        final io.reactivex.internal.operators.observable.k0.a c;
        final boolean d;
        volatile boolean e;
        Throwable f;
        final AtomicBoolean g;
        final AtomicBoolean h;
        final AtomicReference i;
        private static final long j = -3852313036005250360L;

        io.reactivex.internal.operators.observable.k0.c(int v, io.reactivex.internal.operators.observable.k0.a k0$a0, Object object0, boolean z) {
            this.g = new AtomicBoolean();
            this.h = new AtomicBoolean();
            this.i = new AtomicReference();
            this.b = new io.reactivex.internal.queue.c(v);
            this.c = k0$a0;
            this.a = object0;
            this.d = z;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.g.get();
        }

        boolean b(boolean z, boolean z1, I i0, boolean z2) {
            if(this.g.get()) {
                this.b.clear();
                this.c.c(this.a);
                this.i.lazySet(null);
                return true;
            }
            if(z) {
                if(!z2) {
                    Throwable throwable1 = this.f;
                    if(throwable1 != null) {
                        this.b.clear();
                        this.i.lazySet(null);
                        i0.onError(throwable1);
                        return true;
                    }
                    if(z1) {
                        this.i.lazySet(null);
                        i0.onComplete();
                        return true;
                    }
                }
                else if(z1) {
                    Throwable throwable0 = this.f;
                    this.i.lazySet(null);
                    if(throwable0 != null) {
                        i0.onError(throwable0);
                        return true;
                    }
                    i0.onComplete();
                    return true;
                }
            }
            return false;
        }

        void c() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.c c0 = this.b;
            boolean z = this.d;
            I i0 = (I)this.i.get();
            int v = 1;
            while(true) {
                if(i0 != null) {
                    while(true) {
                        boolean z1 = this.e;
                        Object object0 = c0.poll();
                        if(this.b(z1, object0 == null, i0, z)) {
                            return;
                        }
                        if(object0 == null) {
                            break;
                        }
                        i0.onNext(object0);
                    }
                }
                v = this.addAndGet(-v);
                if(v == 0) {
                    return;
                }
                if(i0 == null) {
                    i0 = (I)this.i.get();
                }
            }
        }

        @Override  // io.reactivex.G
        public void d(I i0) {
            if(this.h.compareAndSet(false, true)) {
                i0.b(this);
                this.i.lazySet(i0);
                if(this.g.get()) {
                    this.i.lazySet(null);
                    return;
                }
                this.c();
                return;
            }
            e.g(new IllegalStateException("Only one Observer allowed!"), i0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.g.compareAndSet(false, true) && this.getAndIncrement() == 0) {
                this.i.lazySet(null);
                this.c.c(this.a);
            }
        }

        public void e() {
            this.e = true;
            this.c();
        }

        public void f(Throwable throwable0) {
            this.f = throwable0;
            this.e = true;
            this.c();
        }

        public void g(Object object0) {
            this.b.offer(object0);
            this.c();
        }
    }

    final o b;
    final o c;
    final int d;
    final boolean e;

    public k0(G g0, o o0, o o1, int v, boolean z) {
        super(g0);
        this.b = o0;
        this.c = o1;
        this.d = v;
        this.e = z;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.k0.a k0$a0 = new io.reactivex.internal.operators.observable.k0.a(i0, this.b, this.c, this.d, this.e);
        this.a.d(k0$a0);
    }
}

