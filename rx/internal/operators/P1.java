package rx.internal.operators;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import rx.g.b;
import rx.i;
import rx.internal.util.atomic.g;
import rx.internal.util.m;
import rx.n;
import rx.o;
import rx.subscriptions.e;
import rx.subscriptions.f;

public final class p1 implements b {
    static final class a {
        static final p1 a;

        static {
            a.a = new p1(false);
        }
    }

    static final class rx.internal.operators.p1.b {
        static final p1 a;

        static {
            rx.internal.operators.p1.b.a = new p1(true);
        }
    }

    static final class c extends n {
        private final long f;
        private final d g;

        c(long v, d p1$d0) {
            this.f = v;
            this.g = p1$d0;
        }

        @Override  // rx.n
        public void X(i i0) {
            this.g.d0(i0, this.f);
        }

        @Override  // rx.h
        public void d() {
            this.g.T(this.f);
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.g.b0(throwable0, this.f);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.g.a0(object0, this);
        }
    }

    static final class d extends n {
        final n f;
        final e g;
        final boolean h;
        final AtomicLong i;
        final g j;
        boolean k;
        boolean l;
        long m;
        i n;
        volatile boolean o;
        Throwable p;
        boolean q;
        static final Throwable r;

        static {
            d.r = new Throwable("Terminal error");
        }

        d(n n0, boolean z) {
            this.f = n0;
            this.g = new e();
            this.h = z;
            this.i = new AtomicLong();
            this.j = new g(m.d);
        }

        void Q(long v) {
            i i0;
            synchronized(this) {
                i0 = this.n;
                this.m = rx.internal.operators.a.a(this.m, v);
            }
            if(i0 != null) {
                i0.request(v);
            }
            this.Y();
        }

        // 检测为 Lambda 实现
        void R() [...]

        void T(long v) {
            synchronized(this) {
                if(this.i.get() != v) {
                    return;
                }
                this.q = false;
                this.n = null;
            }
            this.Y();
        }

        void Y() {
            Throwable throwable0;
            long v;
            boolean z;
            synchronized(this) {
                if(this.k) {
                    this.l = true;
                    return;
                }
                this.k = true;
                z = this.q;
                v = this.m;
                throwable0 = this.p;
                if(throwable0 != null) {
                    Throwable throwable1 = d.r;
                    if(throwable0 != throwable1 && !this.h) {
                        this.p = throwable1;
                    }
                }
            }
            g g0 = this.j;
            AtomicLong atomicLong0 = this.i;
            n n0 = this.f;
            long v1 = v;
            Throwable throwable2 = throwable0;
            boolean z1 = this.o;
            while(true) {
                long v2 = 0L;
                int v3;
                while((v3 = Long.compare(v2, v1)) != 0) {
                    if(n0.j()) {
                        return;
                    }
                    boolean z2 = g0.isEmpty();
                    if(this.x(z1, z, throwable2, g0, n0, z2)) {
                        return;
                    }
                    if(z2) {
                        break;
                    }
                    c p1$c0 = (c)g0.poll();
                    Object object0 = x.e(g0.poll());
                    if(atomicLong0.get() == p1$c0.f) {
                        n0.onNext(object0);
                        ++v2;
                    }
                }
                if(v3 == 0) {
                    if(n0.j()) {
                        return;
                    }
                    if(this.x(this.o, z, throwable2, g0, n0, g0.isEmpty())) {
                        return;
                    }
                }
                synchronized(this) {
                    long v4 = this.m;
                    if(v4 != 0x7FFFFFFFFFFFFFFFL) {
                        v4 -= v2;
                        this.m = v4;
                    }
                    v1 = v4;
                    if(!this.l) {
                        this.k = false;
                        return;
                    }
                    this.l = false;
                    z1 = this.o;
                    z = this.q;
                    throwable2 = this.p;
                    if(throwable2 != null) {
                        Throwable throwable3 = d.r;
                        if(throwable2 != throwable3 && !this.h) {
                            this.p = throwable3;
                        }
                    }
                }
            }
        }

        void a0(Object object0, c p1$c0) {
            synchronized(this) {
                if(this.i.get() != p1$c0.f) {
                    return;
                }
                Object object1 = x.j(object0);
                this.j.n(p1$c0, object1);
            }
            this.Y();
        }

        void b0(Throwable throwable0, long v) {
            boolean z;
            synchronized(this) {
                if(this.i.get() == v) {
                    z = this.g0(throwable0);
                    this.q = false;
                    this.n = null;
                }
                else {
                    z = true;
                }
            }
            if(z) {
                this.Y();
                return;
            }
            this.f0(throwable0);
        }

        void c0() {
            class rx.internal.operators.p1.d.a implements rx.functions.a {
                final d a;

                @Override  // rx.functions.a
                public void call() {
                    d.this.R();
                }
            }


            class rx.internal.operators.p1.d.b implements i {
                final d a;

                @Override  // rx.i
                public void request(long v) {
                    int v1 = Long.compare(v, 0L);
                    if(v1 > 0) {
                        d.this.Q(v);
                        return;
                    }
                    if(v1 < 0) {
                        throw new IllegalArgumentException("n >= 0 expected but it was " + v);
                    }
                }
            }

            this.f.q(this.g);
            o o0 = f.a(() -> synchronized(d.this) {
                d.this.n = null;
            });
            this.f.q(o0);
            rx.internal.operators.p1.d.b p1$d$b0 = new rx.internal.operators.p1.d.b(this);
            this.f.X(p1$d$b0);
        }

        @Override  // rx.h
        public void d() {
            this.o = true;
            this.Y();
        }

        void d0(i i0, long v) {
            synchronized(this) {
                if(this.i.get() != v) {
                    return;
                }
                this.n = i0;
            }
            i0.request(this.m);
        }

        public void e0(rx.g g0) {
            c p1$c0;
            long v = this.i.incrementAndGet();
            o o0 = this.g.a();
            if(o0 != null) {
                o0.l();
            }
            synchronized(this) {
                p1$c0 = new c(v, this);
                this.q = true;
                this.n = null;
            }
            this.g.b(p1$c0);
            g0.N6(p1$c0);
        }

        void f0(Throwable throwable0) {
            rx.plugins.c.I(throwable0);
        }

        boolean g0(Throwable throwable0) {
            Throwable throwable1 = this.p;
            if(throwable1 == d.r) {
                return false;
            }
            if(throwable1 == null) {
                this.p = throwable0;
                return true;
            }
            if(throwable1 instanceof rx.exceptions.b) {
                ArrayList arrayList0 = new ArrayList(((rx.exceptions.b)throwable1).b());
                arrayList0.add(throwable0);
                this.p = new rx.exceptions.b(arrayList0);
                return true;
            }
            this.p = new rx.exceptions.b(new Throwable[]{throwable1, throwable0});
            return true;
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            synchronized(this) {
                boolean z = this.g0(throwable0);
            }
            if(z) {
                this.o = true;
                this.Y();
                return;
            }
            this.f0(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.e0(((rx.g)object0));
        }

        protected boolean x(boolean z, boolean z1, Throwable throwable0, g g0, n n0, boolean z2) {
            if(!this.h) {
                if(throwable0 != null) {
                    g0.clear();
                    n0.onError(throwable0);
                    return true;
                }
                if(z && !z1 && z2) {
                    n0.d();
                    return true;
                }
            }
            else if(z && !z1 && z2) {
                if(throwable0 != null) {
                    n0.onError(throwable0);
                    return true;
                }
                n0.d();
                return true;
            }
            return false;
        }
    }

    final boolean a;

    p1(boolean z) {
        this.a = z;
    }

    public n a(n n0) {
        n n1 = new d(n0, this.a);
        n0.q(n1);
        ((d)n1).c0();
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }

    // 去混淆评级： 低(20)
    public static p1 c(boolean z) {
        return z ? rx.internal.operators.p1.b.a : a.a;
    }
}

