package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import rx.g.a;
import rx.n;
import rx.o;
import rx.observables.c;
import rx.subscriptions.b;
import rx.subscriptions.f;

public final class e0 implements a {
    private final c a;
    volatile b b;
    final AtomicInteger c;
    final ReentrantLock d;

    public e0(c c0) {
        this.b = new b();
        this.c = new AtomicInteger(0);
        this.d = new ReentrantLock();
        this.a = c0;
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.c(((n)object0));
    }

    public void c(n n0) {
        this.d.lock();
        if(this.c.incrementAndGet() == 1) {
            AtomicBoolean atomicBoolean0 = new AtomicBoolean(true);
            try {
                rx.functions.b b0 = this.j(n0, atomicBoolean0);
                this.a.E7(b0);
            }
            catch(Throwable throwable0) {
                if(atomicBoolean0.get()) {
                    this.d.unlock();
                }
                throw throwable0;
            }
            if(atomicBoolean0.get()) {
                this.d.unlock();
            }
        }
        else {
            try {
                this.e(n0, this.b);
            }
            catch(Throwable throwable1) {
                this.d.unlock();
                throw throwable1;
            }
            this.d.unlock();
        }
    }

    private o d(b b0) {
        class rx.internal.operators.e0.c implements rx.functions.a {
            final b a;
            final e0 b;

            rx.internal.operators.e0.c(b b0) {
                this.a = b0;
                super();
            }

            @Override  // rx.functions.a
            public void call() {
                e0.this.d.lock();
                try {
                    if(e0.this.b == this.a && e0.this.c.decrementAndGet() == 0) {
                        if(e0.this.a instanceof o) {
                            ((o)e0.this.a).l();
                        }
                        e0.this.b.l();
                        e0.this.b = new b();
                    }
                }
                finally {
                    e0.this.d.unlock();
                }
            }
        }

        return f.a(new rx.internal.operators.e0.c(this, b0));
    }

    void e(n n0, b b0) {
        class rx.internal.operators.e0.b extends n {
            final n f;
            final b g;
            final e0 h;

            rx.internal.operators.e0.b(n n0, n n1, b b0) {
                this.f = n1;
                this.g = b0;
                super(n0);
            }

            @Override  // rx.h
            public void d() {
                this.x();
                this.f.d();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.x();
                this.f.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.f.onNext(object0);
            }

            void x() {
                e0.this.d.lock();
                try {
                    if(e0.this.b == this.g) {
                        if(e0.this.a instanceof o) {
                            ((o)e0.this.a).l();
                        }
                        e0.this.b.l();
                        e0.this.b = new b();
                        e0.this.c.set(0);
                    }
                }
                finally {
                    e0.this.d.unlock();
                }
            }
        }

        n0.q(this.d(b0));
        rx.internal.operators.e0.b e0$b0 = new rx.internal.operators.e0.b(this, n0, n0, b0);
        this.a.N6(e0$b0);
    }

    private rx.functions.b j(n n0, AtomicBoolean atomicBoolean0) {
        class rx.internal.operators.e0.a implements rx.functions.b {
            final n a;
            final AtomicBoolean b;
            final e0 c;

            rx.internal.operators.e0.a(n n0, AtomicBoolean atomicBoolean0) {
                this.a = n0;
                this.b = atomicBoolean0;
                super();
            }

            public void a(o o0) {
                try {
                    e0.this.b.a(o0);
                    e0.this.e(this.a, e0.this.b);
                }
                finally {
                    e0.this.d.unlock();
                    this.b.set(false);
                }
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((o)object0));
            }
        }

        return new rx.internal.operators.e0.a(this, n0, atomicBoolean0);
    }
}

