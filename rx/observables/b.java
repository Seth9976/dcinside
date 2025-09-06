package rx.observables;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.functions.m;
import rx.functions.p;
import rx.g;
import rx.h;
import rx.i;
import rx.internal.operators.d;
import rx.internal.operators.f;
import rx.internal.operators.x;
import rx.internal.util.e;
import rx.internal.util.s;
import rx.n;
import rx.o;

public final class b {
    private final g a;
    static final Object b;
    static final Object c;
    static final Object d;

    static {
        b.b = new Object();
        b.c = new Object();
        b.d = new Object();
    }

    private b(g g0) {
        this.a = g0;
    }

    public Iterable A() {
        class rx.observables.b.b implements Iterable {
            final b a;

            @Override
            public Iterator iterator() {
                return b.this.h();
            }
        }

        return () -> f.a(b.this.a);
    }

    private Object a(g g0) {
        class c extends n {
            final CountDownLatch f;
            final AtomicReference g;
            final AtomicReference h;
            final b i;

            c(CountDownLatch countDownLatch0, AtomicReference atomicReference0, AtomicReference atomicReference1) {
                this.f = countDownLatch0;
                this.g = atomicReference0;
                this.h = atomicReference1;
                super();
            }

            @Override  // rx.h
            public void d() {
                this.f.countDown();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.g.set(throwable0);
                this.f.countDown();
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.h.set(object0);
            }
        }

        AtomicReference atomicReference0 = new AtomicReference();
        AtomicReference atomicReference1 = new AtomicReference();
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        e.a(countDownLatch0, g0.v5(new c(this, countDownLatch0, atomicReference1, atomicReference0)));
        if(atomicReference1.get() != null) {
            rx.exceptions.c.c(((Throwable)atomicReference1.get()));
        }
        return atomicReference0.get();
    }

    public Object b() {
        return this.a(this.a.b2());
    }

    public Object c(p p0) {
        return this.a(this.a.c2(p0));
    }

    public Object d(Object object0) {
        return this.a(this.a.g3(s.c()).d2(object0));
    }

    public Object e(Object object0, p p0) {
        return this.a(this.a.Z1(p0).g3(s.c()).d2(object0));
    }

    public void f(rx.functions.b b0) {
        class a extends n {
            final CountDownLatch f;
            final AtomicReference g;
            final rx.functions.b h;
            final b i;

            a(CountDownLatch countDownLatch0, AtomicReference atomicReference0, rx.functions.b b1) {
                this.f = countDownLatch0;
                this.g = atomicReference0;
                this.h = b1;
                super();
            }

            @Override  // rx.h
            public void d() {
                this.f.countDown();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.g.set(throwable0);
                this.f.countDown();
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.h.b(object0);
            }
        }

        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        AtomicReference atomicReference0 = new AtomicReference();
        a b$a0 = new a(this, countDownLatch0, atomicReference0, b0);
        e.a(countDownLatch0, this.a.v5(b$a0));
        if(atomicReference0.get() != null) {
            rx.exceptions.c.c(((Throwable)atomicReference0.get()));
        }
    }

    public static b g(g g0) {
        return new b(g0);
    }

    // 检测为 Lambda 实现
    public Iterator h() [...]

    public Object i() {
        return this.a(this.a.a3());
    }

    public Object j(p p0) {
        return this.a(this.a.b3(p0));
    }

    public Object k(Object object0) {
        return this.a(this.a.g3(s.c()).c3(object0));
    }

    public Object l(Object object0, p p0) {
        return this.a(this.a.Z1(p0).g3(s.c()).c3(object0));
    }

    public Iterable m() {
        return rx.internal.operators.b.a(this.a);
    }

    public Iterable n(Object object0) {
        return rx.internal.operators.c.a(this.a, object0);
    }

    public Iterable o() {
        return d.a(this.a);
    }

    public Object p() {
        return this.a(this.a.U4());
    }

    public Object q(p p0) {
        return this.a(this.a.V4(p0));
    }

    public Object r(Object object0) {
        return this.a(this.a.g3(s.c()).W4(object0));
    }

    public Object s(Object object0, p p0) {
        return this.a(this.a.Z1(p0).g3(s.c()).W4(object0));
    }

    public void t() {
        class rx.observables.b.d extends n {
            final Throwable[] f;
            final CountDownLatch g;
            final b h;

            rx.observables.b.d(Throwable[] arr_throwable, CountDownLatch countDownLatch0) {
                this.f = arr_throwable;
                this.g = countDownLatch0;
                super();
            }

            @Override  // rx.h
            public void d() {
                this.g.countDown();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.f[0] = throwable0;
                this.g.countDown();
            }

            @Override  // rx.h
            public void onNext(Object object0) {
            }
        }

        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        Throwable[] arr_throwable = {null};
        rx.observables.b.d b$d0 = new rx.observables.b.d(this, arr_throwable, countDownLatch0);
        e.a(countDownLatch0, this.a.v5(b$d0));
        Throwable throwable0 = arr_throwable[0];
        if(throwable0 != null) {
            rx.exceptions.c.c(throwable0);
        }
    }

    public void u(h h0) {
        class rx.observables.b.e extends n {
            final BlockingQueue f;
            final b g;

            rx.observables.b.e(BlockingQueue blockingQueue0) {
                this.f = blockingQueue0;
                super();
            }

            @Override  // rx.h
            public void d() {
                this.f.offer(x.b());
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                Object object0 = x.c(throwable0);
                this.f.offer(object0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                Object object1 = x.j(object0);
                this.f.offer(object1);
            }
        }

        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        rx.observables.b.e b$e0 = new rx.observables.b.e(this, linkedBlockingQueue0);
        o o0 = this.a.v5(b$e0);
        try {
            do {
                Object object0 = linkedBlockingQueue0.poll();
                if(object0 == null) {
                    object0 = linkedBlockingQueue0.take();
                }
            }
            while(!x.a(h0, object0));
            goto label_17;
        }
        catch(InterruptedException interruptedException0) {
            goto label_11;
        }
        catch(Throwable throwable0) {
        }
        try {
            try {
                goto label_15;
            }
            catch(InterruptedException interruptedException0) {
            }
        label_11:
            Thread.currentThread().interrupt();
            h0.onError(interruptedException0);
        }
        catch(Throwable throwable0) {
            goto label_15;
        }
        o0.l();
        return;
    label_15:
        o0.l();
        throw throwable0;
    label_17:
        o0.l();
    }

    public void v(n n0) {
        class rx.observables.b.f extends n {
            final BlockingQueue f;
            final i[] g;
            final b h;

            rx.observables.b.f(BlockingQueue blockingQueue0, i[] arr_i) {
                this.f = blockingQueue0;
                this.g = arr_i;
                super();
            }

            @Override  // rx.n
            public void X(i i0) {
                this.g[0] = i0;
                this.f.offer(b.c);
            }

            @Override  // rx.h
            public void d() {
                this.f.offer(x.b());
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                Object object0 = x.c(throwable0);
                this.f.offer(object0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                Object object1 = x.j(object0);
                this.f.offer(object1);
            }

            @Override  // rx.n
            public void onStart() {
                this.f.offer(b.b);
            }
        }


        class rx.observables.b.g implements rx.functions.a {
            final BlockingQueue a;
            final b b;

            rx.observables.b.g(BlockingQueue blockingQueue0) {
                this.a = blockingQueue0;
                super();
            }

            @Override  // rx.functions.a
            public void call() {
                this.a.offer(b.d);
            }
        }

        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        i[] arr_i = {null};
        rx.observables.b.f b$f0 = new rx.observables.b.f(this, linkedBlockingQueue0, arr_i);
        n0.q(b$f0);
        n0.q(rx.subscriptions.f.a(new rx.observables.b.g(this, linkedBlockingQueue0)));
        this.a.v5(b$f0);
        while(true) {
            try {
            label_6:
                if(n0.j()) {
                    break;
                }
                Object object0 = linkedBlockingQueue0.poll();
                if(object0 == null) {
                    object0 = linkedBlockingQueue0.take();
                }
                if(n0.j() || object0 == b.d) {
                    break;
                }
                if(object0 == b.b) {
                    n0.onStart();
                    goto label_6;
                }
                if(object0 == b.c) {
                    n0.X(arr_i[0]);
                    goto label_6;
                }
                if(x.a(n0, object0)) {
                    goto label_27;
                }
                continue;
            }
            catch(InterruptedException interruptedException0) {
                goto label_22;
            }
            catch(Throwable throwable0) {
            }
            try {
                try {
                    goto label_25;
                }
                catch(InterruptedException interruptedException0) {
                }
            label_22:
                Thread.currentThread().interrupt();
                n0.onError(interruptedException0);
                break;
            }
            catch(Throwable throwable0) {
            }
        label_25:
            b$f0.l();
            throw throwable0;
        label_27:
            b$f0.l();
            return;
        }
        b$f0.l();
    }

    public void w(rx.functions.b b0) {
        class rx.observables.b.h implements rx.functions.b {
            final b a;

            public void a(Throwable throwable0) {
                throw new rx.exceptions.g(throwable0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((Throwable)object0));
            }
        }

        this.y(b0, new rx.observables.b.h(this), m.a());
    }

    public void x(rx.functions.b b0, rx.functions.b b1) {
        this.y(b0, b1, m.a());
    }

    public void y(rx.functions.b b0, rx.functions.b b1, rx.functions.a a0) {
        class rx.observables.b.i implements h {
            final rx.functions.b a;
            final rx.functions.b b;
            final rx.functions.a c;
            final b d;

            rx.observables.b.i(rx.functions.b b1, rx.functions.b b2, rx.functions.a a0) {
                this.a = b1;
                this.b = b2;
                this.c = a0;
                super();
            }

            @Override  // rx.h
            public void d() {
                this.c.call();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.b.b(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.a.b(object0);
            }
        }

        this.u(new rx.observables.b.i(this, b0, b1, a0));
    }

    public Future z() {
        return rx.internal.operators.e.a(this.a);
    }
}

