package io.reactivex.internal.operators.observable;

import e3.o;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class b0 extends a {
    static final class io.reactivex.internal.operators.observable.b0.a extends AtomicInteger implements I, c {
        final class io.reactivex.internal.operators.observable.b0.a.a extends AtomicReference implements N, c {
            final io.reactivex.internal.operators.observable.b0.a a;
            private static final long b = 0xF90689EF97A3C632L;

            @Override  // io.reactivex.disposables.c
            public boolean a() {
                return d.c(((c)this.get()));
            }

            @Override  // io.reactivex.N
            public void b(c c0) {
                d.g(this, c0);
            }

            @Override  // io.reactivex.disposables.c
            public void dispose() {
                d.b(this);
            }

            @Override  // io.reactivex.N
            public void onError(Throwable throwable0) {
                io.reactivex.internal.operators.observable.b0.a.this.g(this, throwable0);
            }

            @Override  // io.reactivex.N
            public void onSuccess(Object object0) {
                io.reactivex.internal.operators.observable.b0.a.this.h(this, object0);
            }
        }

        final I a;
        final boolean b;
        final b c;
        final AtomicInteger d;
        final io.reactivex.internal.util.c e;
        final o f;
        final AtomicReference g;
        c h;
        volatile boolean i;
        private static final long j = 0x775A28D5B42D01B7L;

        io.reactivex.internal.operators.observable.b0.a(I i0, o o0, boolean z) {
            this.a = i0;
            this.f = o0;
            this.b = z;
            this.c = new b();
            this.e = new io.reactivex.internal.util.c();
            this.d = new AtomicInteger(1);
            this.g = new AtomicReference();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.i;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.h, c0)) {
                this.h = c0;
                this.a.b(this);
            }
        }

        void c() {
            io.reactivex.internal.queue.c c0 = (io.reactivex.internal.queue.c)this.g.get();
            if(c0 != null) {
                c0.clear();
            }
        }

        void d() {
            if(this.getAndIncrement() == 0) {
                this.e();
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.i = true;
            this.h.dispose();
            this.c.dispose();
        }

        void e() {
            I i0 = this.a;
            AtomicInteger atomicInteger0 = this.d;
            AtomicReference atomicReference0 = this.g;
            int v = 1;
            while(true) {
                boolean z = false;
                if(this.i) {
                    this.c();
                    return;
                }
                if(!this.b && ((Throwable)this.e.get()) != null) {
                    Throwable throwable0 = this.e.c();
                    this.c();
                    i0.onError(throwable0);
                    return;
                }
                boolean z1 = atomicInteger0.get() == 0;
                io.reactivex.internal.queue.c c0 = (io.reactivex.internal.queue.c)atomicReference0.get();
                Object object0 = c0 == null ? null : c0.poll();
                if(object0 == null) {
                    z = true;
                }
                if(z1 && z) {
                    Throwable throwable1 = this.e.c();
                    if(throwable1 != null) {
                        i0.onError(throwable1);
                        return;
                    }
                    i0.onComplete();
                    return;
                }
                if(z) {
                    v = this.addAndGet(-v);
                    if(v != 0) {
                        continue;
                    }
                    return;
                }
                i0.onNext(object0);
            }
        }

        io.reactivex.internal.queue.c f() {
            io.reactivex.internal.queue.c c1;
            do {
                io.reactivex.internal.queue.c c0 = (io.reactivex.internal.queue.c)this.g.get();
                if(c0 != null) {
                    return c0;
                }
                c1 = new io.reactivex.internal.queue.c(0x80);
            }
            while(!androidx.compose.animation.core.d.a(this.g, null, c1));
            return c1;
        }

        void g(io.reactivex.internal.operators.observable.b0.a.a b0$a$a0, Throwable throwable0) {
            this.c.c(b0$a$a0);
            if(this.e.a(throwable0)) {
                if(!this.b) {
                    this.h.dispose();
                    this.c.dispose();
                }
                this.d.decrementAndGet();
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        void h(io.reactivex.internal.operators.observable.b0.a.a b0$a$a0, Object object0) {
            boolean z = false;
            this.c.c(b0$a$a0);
            if(this.get() != 0 || !this.compareAndSet(0, 1)) {
                io.reactivex.internal.queue.c c1 = this.f();
                synchronized(c1) {
                    c1.offer(object0);
                }
                this.d.decrementAndGet();
                if(this.getAndIncrement() != 0) {
                    return;
                }
            }
            else {
                this.a.onNext(object0);
                if(this.d.decrementAndGet() == 0) {
                    z = true;
                }
                io.reactivex.internal.queue.c c0 = (io.reactivex.internal.queue.c)this.g.get();
                if(z && (c0 == null || c0.isEmpty())) {
                    Throwable throwable0 = this.e.c();
                    if(throwable0 != null) {
                        this.a.onError(throwable0);
                        return;
                    }
                    this.a.onComplete();
                    return;
                }
                if(this.decrementAndGet() == 0) {
                    return;
                }
            }
            this.e();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.d.decrementAndGet();
            this.d();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.d.decrementAndGet();
            if(this.e.a(throwable0)) {
                if(!this.b) {
                    this.c.dispose();
                }
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            Q q0;
            try {
                q0 = (Q)io.reactivex.internal.functions.b.g(this.f.apply(object0), "The mapper returned a null SingleSource");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.h.dispose();
                this.onError(throwable0);
                return;
            }
            this.d.getAndIncrement();
            io.reactivex.internal.operators.observable.b0.a.a b0$a$a0 = new io.reactivex.internal.operators.observable.b0.a.a(this);
            if(!this.i && this.c.d(b0$a$a0)) {
                q0.e(b0$a$a0);
            }
        }
    }

    final o b;
    final boolean c;

    public b0(G g0, o o0, boolean z) {
        super(g0);
        this.b = o0;
        this.c = z;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.internal.operators.observable.b0.a b0$a0 = new io.reactivex.internal.operators.observable.b0.a(i0, this.b, this.c);
        this.a.d(b0$a0);
    }
}

