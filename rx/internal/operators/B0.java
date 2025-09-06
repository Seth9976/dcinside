package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.f;
import rx.functions.p;
import rx.functions.q;
import rx.g.a;
import rx.g;
import rx.i;
import rx.j;
import rx.n;
import rx.observers.h;
import rx.subscriptions.e;

public final class b0 implements a {
    static final class rx.internal.operators.b0.a implements p {
        public g a(g g0) {
            class rx.internal.operators.b0.a.a implements p {
                final rx.internal.operators.b0.a a;

                public f a(f f0) {
                    return f.e(null);
                }

                @Override  // rx.functions.p
                public Object b(Object object0) {
                    return this.a(((f)object0));
                }
            }

            return g0.g3(new rx.internal.operators.b0.a.a(this));
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(((g)object0));
        }
    }

    public static final class rx.internal.operators.b0.f implements p {
        final long a;

        public rx.internal.operators.b0.f(long v) {
            this.a = v;
        }

        public g a(g g0) {
            class rx.internal.operators.b0.f.a implements p {
                int a;
                final rx.internal.operators.b0.f b;

                public f a(f f0) {
                    long v = rx.internal.operators.b0.f.this.a;
                    if(v == 0L) {
                        return f0;
                    }
                    int v1 = this.a + 1;
                    this.a = v1;
                    return ((long)v1) > v ? f0 : f.e(v1);
                }

                @Override  // rx.functions.p
                public Object b(Object object0) {
                    return this.a(((f)object0));
                }
            }

            return g0.g3(new rx.internal.operators.b0.f.a(this)).E1();
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(((g)object0));
        }
    }

    public static final class rx.internal.operators.b0.g implements p {
        final q a;

        public rx.internal.operators.b0.g(q q0) {
            this.a = q0;
        }

        public g a(g g0) {
            class rx.internal.operators.b0.g.a implements q {
                final rx.internal.operators.b0.g a;

                public f a(f f0, f f1) {
                    Integer integer0 = (Integer)f0.h();
                    return ((Boolean)rx.internal.operators.b0.g.this.a.p(integer0, f1.g())).booleanValue() ? f.e(((int)(((int)integer0) + 1))) : f1;
                }

                @Override  // rx.functions.q
                public Object p(Object object0, Object object1) {
                    return this.a(((f)object0), ((f)object1));
                }
            }

            return g0.O4(f.e(0), new rx.internal.operators.b0.g.a(this));
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(((g)object0));
        }
    }

    final g a;
    private final p b;
    final boolean c;
    final boolean d;
    private final j e;
    static final p f;

    static {
        b0.f = new rx.internal.operators.b0.a();
    }

    private b0(g g0, p p0, boolean z, boolean z1, j j0) {
        this.a = g0;
        this.b = p0;
        this.c = z;
        this.d = z1;
        this.e = j0;
    }

    public void a(n n0) {
        class b implements rx.functions.a {
            final n a;
            final rx.subjects.f b;
            final rx.internal.producers.a c;
            final AtomicLong d;
            final e e;
            final b0 f;

            b(n n0, rx.subjects.f f0, rx.internal.producers.a a0, AtomicLong atomicLong0, e e0) {
                this.a = n0;
                this.b = f0;
                this.c = a0;
                this.d = atomicLong0;
                this.e = e0;
                super();
            }

            @Override  // rx.functions.a
            public void call() {
                class rx.internal.operators.b0.b.a extends n {
                    boolean f;
                    final b g;

                    @Override  // rx.n
                    public void X(i i0) {
                        b.this.c.c(i0);
                    }

                    @Override  // rx.h
                    public void d() {
                        if(!this.f) {
                            this.f = true;
                            this.l();
                            b.this.b.onNext(f.b());
                        }
                    }

                    @Override  // rx.h
                    public void onError(Throwable throwable0) {
                        if(!this.f) {
                            this.f = true;
                            this.l();
                            f f0 = f.d(throwable0);
                            b.this.b.onNext(f0);
                        }
                    }

                    @Override  // rx.h
                    public void onNext(Object object0) {
                        if(!this.f) {
                            b.this.a.onNext(object0);
                            this.x();
                            b.this.c.b(1L);
                        }
                    }

                    private void x() {
                        do {
                            long v = b.this.d.get();
                        }
                        while(v != 0x7FFFFFFFFFFFFFFFL && !b.this.d.compareAndSet(v, v - 1L));
                    }
                }

                if(this.a.j()) {
                    return;
                }
                rx.internal.operators.b0.b.a b0$b$a0 = new rx.internal.operators.b0.b.a(this);
                this.e.b(b0$b$a0);
                b0.this.a.N6(b0$b$a0);
            }
        }


        class c implements rx.g.b {
            final b0 a;

            public n a(n n0) {
                class rx.internal.operators.b0.c.a extends n {
                    final n f;
                    final c g;

                    rx.internal.operators.b0.c.a(n n0, n n1) {
                        this.f = n1;
                        super(n0);
                    }

                    @Override  // rx.n
                    public void X(i i0) {
                        i0.request(0x7FFFFFFFFFFFFFFFL);
                    }

                    @Override  // rx.h
                    public void d() {
                        this.f.d();
                    }

                    @Override  // rx.h
                    public void onError(Throwable throwable0) {
                        this.f.onError(throwable0);
                    }

                    @Override  // rx.h
                    public void onNext(Object object0) {
                        this.x(((f)object0));
                    }

                    public void x(f f0) {
                        if(f0.k() && b0.this.c) {
                            this.f.d();
                            return;
                        }
                        if(f0.l() && b0.this.d) {
                            this.f.onError(f0.g());
                            return;
                        }
                        this.f.onNext(f0);
                    }
                }

                return new rx.internal.operators.b0.c.a(this, n0, n0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((n)object0));
            }
        }


        class d implements rx.functions.a {
            final g a;
            final n b;
            final AtomicLong c;
            final rx.j.a d;
            final rx.functions.a e;
            final AtomicBoolean f;
            final b0 g;

            d(g g0, n n0, AtomicLong atomicLong0, rx.j.a j$a0, rx.functions.a a0, AtomicBoolean atomicBoolean0) {
                this.a = g0;
                this.b = n0;
                this.c = atomicLong0;
                this.d = j$a0;
                this.e = a0;
                this.f = atomicBoolean0;
                super();
            }

            @Override  // rx.functions.a
            public void call() {
                class rx.internal.operators.b0.d.a extends n {
                    final d f;

                    rx.internal.operators.b0.d.a(n n0) {
                        super(n0);
                    }

                    @Override  // rx.n
                    public void X(i i0) {
                        i0.request(0x7FFFFFFFFFFFFFFFL);
                    }

                    @Override  // rx.h
                    public void d() {
                        d.this.b.d();
                    }

                    @Override  // rx.h
                    public void onError(Throwable throwable0) {
                        d.this.b.onError(throwable0);
                    }

                    @Override  // rx.h
                    public void onNext(Object object0) {
                        if(!d.this.b.j()) {
                            if(d.this.c.get() > 0L) {
                                d.this.d.c(d.this.e);
                                return;
                            }
                            d.this.f.compareAndSet(false, true);
                        }
                    }
                }

                rx.internal.operators.b0.d.a b0$d$a0 = new rx.internal.operators.b0.d.a(this, this.b);
                this.a.N6(b0$d$a0);
            }
        }


        class rx.internal.operators.b0.e implements i {
            final AtomicLong a;
            final rx.internal.producers.a b;
            final AtomicBoolean c;
            final rx.j.a d;
            final rx.functions.a e;
            final b0 f;

            rx.internal.operators.b0.e(AtomicLong atomicLong0, rx.internal.producers.a a0, AtomicBoolean atomicBoolean0, rx.j.a j$a0, rx.functions.a a1) {
                this.a = atomicLong0;
                this.b = a0;
                this.c = atomicBoolean0;
                this.d = j$a0;
                this.e = a1;
                super();
            }

            @Override  // rx.i
            public void request(long v) {
                if(v > 0L) {
                    rx.internal.operators.a.b(this.a, v);
                    this.b.request(v);
                    if(this.c.compareAndSet(true, false)) {
                        this.d.c(this.e);
                    }
                }
            }
        }

        AtomicBoolean atomicBoolean0 = new AtomicBoolean(true);
        AtomicLong atomicLong0 = new AtomicLong();
        rx.j.a j$a0 = this.e.a();
        n0.q(j$a0);
        e e0 = new e();
        n0.q(e0);
        rx.subjects.e e1 = rx.subjects.b.C7().B7();
        e1.v5(h.d());
        rx.internal.producers.a a0 = new rx.internal.producers.a();
        b b0$b0 = new b(this, n0, e1, a0, atomicLong0, e0);
        g g0 = e1.e3(new c(this));
        j$a0.c(new d(this, ((g)this.b.b(g0)), n0, atomicLong0, j$a0, b0$b0, atomicBoolean0));
        n0.X(new rx.internal.operators.b0.e(this, atomicLong0, a0, atomicBoolean0, j$a0, b0$b0));
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }

    public static g c(g g0, p p0, j j0) {
        return g.M6(new b0(g0, p0, false, false, j0));
    }

    public static g d(g g0) {
        return b0.l(g0, rx.schedulers.c.m());
    }

    public static g e(g g0, long v) {
        return b0.j(g0, v, rx.schedulers.c.m());
    }

    public static g j(g g0, long v, j j0) {
        int v1 = Long.compare(v, 0L);
        if(v1 == 0) {
            return g.W1();
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("count >= 0 expected");
        }
        return b0.q(g0, new rx.internal.operators.b0.f(v - 1L), j0);
    }

    public static g l(g g0, j j0) {
        return b0.q(g0, b0.f, j0);
    }

    public static g o(g g0, p p0) {
        return g.M6(new b0(g0, p0, false, true, rx.schedulers.c.m()));
    }

    public static g q(g g0, p p0, j j0) {
        return g.M6(new b0(g0, p0, false, true, j0));
    }

    public static g r(g g0) {
        return b0.t(g0, b0.f);
    }

    public static g s(g g0, long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException("count >= 0 expected");
        }
        return v1 == 0 ? g0 : b0.t(g0, new rx.internal.operators.b0.f(v));
    }

    public static g t(g g0, p p0) {
        return g.M6(new b0(g0, p0, true, false, rx.schedulers.c.m()));
    }

    public static g u(g g0, p p0, j j0) {
        return g.M6(new b0(g0, p0, true, false, j0));
    }
}

