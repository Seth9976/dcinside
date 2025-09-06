package rx.plugins;

import rx.b.J;
import rx.b.K;
import rx.functions.b;
import rx.functions.o;
import rx.functions.p;
import rx.functions.q;
import rx.g.a;
import rx.g;
import rx.internal.operators.U1;
import rx.internal.operators.W;
import rx.internal.operators.X;
import rx.internal.operators.Y;
import rx.internal.operators.i2;
import rx.j;
import rx.k.t;
import rx.k;

public final class c {
    static volatile boolean a;
    static volatile b b;
    static volatile p c;
    static volatile p d;
    static volatile p e;
    static volatile q f;
    static volatile q g;
    static volatile q h;
    static volatile p i;
    static volatile p j;
    static volatile p k;
    static volatile p l;
    static volatile p m;
    static volatile p n;
    static volatile o o;
    static volatile p p;
    static volatile p q;
    static volatile p r;
    static volatile p s;
    static volatile p t;
    static volatile p u;

    static {
        c.x();
    }

    private c() {
        throw new IllegalStateException("No instances!");
    }

    public static void A() {
        c.a = true;
    }

    public static Throwable B(Throwable throwable0) {
        return c.r == null ? throwable0 : ((Throwable)c.r.b(throwable0));
    }

    public static K C(K b$K0) {
        return c.u == null ? b$K0 : ((K)c.u.b(b$K0));
    }

    public static J D(rx.b b0, J b$J0) {
        return c.h == null ? b$J0 : ((J)c.h.p(b0, b$J0));
    }

    public static j E(j j0) {
        return c.i == null ? j0 : ((j)c.i.b(j0));
    }

    public static J F(J b$J0) {
        return c.e == null ? b$J0 : ((J)c.e.b(b$J0));
    }

    public static a G(a g$a0) {
        return c.c == null ? g$a0 : ((a)c.c.b(g$a0));
    }

    public static t H(t k$t0) {
        return c.d == null ? k$t0 : ((t)c.d.b(k$t0));
    }

    public static void I(Throwable throwable0) {
        b b0 = c.b;
        if(b0 != null) {
            try {
                b0.b(throwable0);
                return;
            }
            catch(Throwable throwable1) {
                System.err.println("The onError handler threw an Exception. It shouldn\'t. => " + throwable1.getMessage());
                throwable1.printStackTrace();
                c.q0(throwable1);
            }
        }
        c.q0(throwable0);
    }

    public static j J(j j0) {
        return c.j == null ? j0 : ((j)c.j.b(j0));
    }

    public static j K(j j0) {
        return c.k == null ? j0 : ((j)c.k.b(j0));
    }

    public static Throwable L(Throwable throwable0) {
        return c.p == null ? throwable0 : ((Throwable)c.p.b(throwable0));
    }

    public static rx.g.b M(rx.g.b g$b0) {
        return c.s == null ? g$b0 : ((rx.g.b)c.s.b(g$b0));
    }

    public static rx.o N(rx.o o0) {
        return c.m == null ? o0 : ((rx.o)c.m.b(o0));
    }

    public static a O(g g0, a g$a0) {
        return c.f == null ? g$a0 : ((a)c.f.p(g0, g$a0));
    }

    public static rx.functions.a P(rx.functions.a a0) {
        return c.l == null ? a0 : ((rx.functions.a)c.l.b(a0));
    }

    public static Throwable Q(Throwable throwable0) {
        return c.q == null ? throwable0 : ((Throwable)c.q.b(throwable0));
    }

    public static rx.g.b R(rx.g.b g$b0) {
        return c.t == null ? g$b0 : ((rx.g.b)c.t.b(g$b0));
    }

    public static rx.o S(rx.o o0) {
        return c.n == null ? o0 : ((rx.o)c.n.b(o0));
    }

    public static t T(k k0, t k$t0) {
        return c.g == null ? k$t0 : ((t)c.g.p(k0, k$t0));
    }

    public static void U() {
        if(c.a) {
            return;
        }
        c.x();
        c.i = null;
        c.j = null;
        c.k = null;
        c.o = null;
    }

    public static void V() {
        if(c.a) {
            return;
        }
        c.y();
    }

    public static void W(p p0) {
        if(c.a) {
            return;
        }
        c.e = p0;
    }

    public static void X(p p0) {
        if(c.a) {
            return;
        }
        c.u = p0;
    }

    public static void Y(q q0) {
        if(c.a) {
            return;
        }
        c.h = q0;
    }

    public static void Z(p p0) {
        if(c.a) {
            return;
        }
        c.r = p0;
    }

    public static void a() {
        if(c.a) {
            return;
        }
        c.b = null;
        c.c = null;
        c.f = null;
        c.m = null;
        c.p = null;
        c.s = null;
        c.d = null;
        c.g = null;
        c.n = null;
        c.q = null;
        c.t = null;
        c.e = null;
        c.h = null;
        c.r = null;
        c.u = null;
        c.i = null;
        c.j = null;
        c.k = null;
        c.l = null;
        c.o = null;
    }

    public static void a0(p p0) {
        if(c.a) {
            return;
        }
        c.i = p0;
    }

    public static void b() {
        if(c.a) {
            return;
        }
        c.c = null;
        c.d = null;
        c.e = null;
    }

    public static void b0(b b0) {
        if(c.a) {
            return;
        }
        c.b = b0;
    }

    public static void c() {
        static final class h implements p {
            public a a(a g$a0) {
                return new W(g$a0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((a)object0));
            }
        }


        static final class i implements p {
            public t a(t k$t0) {
                return new Y(k$t0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((t)object0));
            }
        }


        static final class rx.plugins.c.j implements p {
            public J a(J b$J0) {
                return new X(b$J0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((J)object0));
            }
        }

        if(c.a) {
            return;
        }
        c.c = new h();
        c.d = new i();
        c.e = new rx.plugins.c.j();
    }

    public static void c0(o o0) {
        if(c.a) {
            return;
        }
        c.o = o0;
    }

    public static p d() {
        return c.e;
    }

    public static void d0(p p0) {
        if(c.a) {
            return;
        }
        c.j = p0;
    }

    public static p e() {
        return c.u;
    }

    public static void e0(p p0) {
        if(c.a) {
            return;
        }
        c.k = p0;
    }

    public static q f() {
        return c.h;
    }

    public static void f0(p p0) {
        if(c.a) {
            return;
        }
        c.c = p0;
    }

    public static p g() {
        return c.r;
    }

    public static void g0(p p0) {
        if(c.a) {
            return;
        }
        c.s = p0;
    }

    public static p h() {
        return c.i;
    }

    public static void h0(p p0) {
        if(c.a) {
            return;
        }
        c.m = p0;
    }

    public static b i() {
        return c.b;
    }

    public static void i0(q q0) {
        if(c.a) {
            return;
        }
        c.f = q0;
    }

    public static o j() {
        return c.o;
    }

    public static void j0(p p0) {
        if(c.a) {
            return;
        }
        c.p = p0;
    }

    public static p k() {
        return c.j;
    }

    public static void k0(p p0) {
        if(c.a) {
            return;
        }
        c.l = p0;
    }

    public static p l() {
        return c.k;
    }

    public static void l0(p p0) {
        if(c.a) {
            return;
        }
        c.d = p0;
    }

    public static p m() {
        return c.c;
    }

    public static void m0(p p0) {
        if(c.a) {
            return;
        }
        c.t = p0;
    }

    public static p n() {
        return c.s;
    }

    public static void n0(p p0) {
        if(c.a) {
            return;
        }
        c.n = p0;
    }

    public static p o() {
        return c.m;
    }

    public static void o0(q q0) {
        if(c.a) {
            return;
        }
        c.g = q0;
    }

    public static q p() {
        return c.f;
    }

    public static void p0(p p0) {
        if(c.a) {
            return;
        }
        c.q = p0;
    }

    public static p q() {
        return c.p;
    }

    static void q0(Throwable throwable0) {
        Thread thread0 = Thread.currentThread();
        thread0.getUncaughtExceptionHandler().uncaughtException(thread0, throwable0);
    }

    public static p r() {
        return c.l;
    }

    public static p s() {
        return c.d;
    }

    public static p t() {
        return c.t;
    }

    public static p u() {
        return c.n;
    }

    public static q v() {
        return c.g;
    }

    public static p w() {
        return c.q;
    }

    static void x() {
        static final class rx.plugins.c.a implements p {
            public Throwable a(Throwable throwable0) {
                return f.c().g().c(throwable0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((Throwable)object0));
            }
        }


        static final class rx.plugins.c.b implements p {
            public rx.g.b a(rx.g.b g$b0) {
                return f.c().g().b(g$b0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((rx.g.b)object0));
            }
        }


        static final class rx.plugins.c.c implements p {
            public Throwable a(Throwable throwable0) {
                return f.c().a().c(throwable0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((Throwable)object0));
            }
        }


        static final class d implements p {
            public K a(K b$K0) {
                return f.c().a().b(b$K0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((K)object0));
            }
        }


        static final class rx.plugins.c.k implements b {
            public void a(Throwable throwable0) {
                f.c().b().a(throwable0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((Throwable)object0));
            }
        }


        static final class l implements q {
            public a a(g g0, a g$a0) {
                return f.c().d().e(g0, g$a0);
            }

            @Override  // rx.functions.q
            public Object p(Object object0, Object object1) {
                return this.a(((g)object0), ((a)object1));
            }
        }


        static final class m implements p {
            public rx.o a(rx.o o0) {
                return f.c().d().d(o0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((rx.o)object0));
            }
        }


        static final class n implements q {
            public t a(k k0, t k$t0) {
                rx.plugins.h h0 = f.c().g();
                return h0 == rx.plugins.i.f() ? k$t0 : new U1(h0.e(k0, new i2(k$t0)));
            }

            @Override  // rx.functions.q
            public Object p(Object object0, Object object1) {
                return this.a(((k)object0), ((t)object1));
            }
        }


        static final class rx.plugins.c.o implements p {
            public rx.o a(rx.o o0) {
                return f.c().g().d(o0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((rx.o)object0));
            }
        }


        static final class rx.plugins.c.p implements q {
            public J a(rx.b b0, J b$J0) {
                return f.c().a().d(b0, b$J0);
            }

            @Override  // rx.functions.q
            public Object p(Object object0, Object object1) {
                return this.a(((rx.b)object0), ((J)object1));
            }
        }


        static final class rx.plugins.c.q implements p {
            public rx.functions.a a(rx.functions.a a0) {
                return f.c().f().k(a0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((rx.functions.a)object0));
            }
        }


        static final class r implements p {
            public Throwable a(Throwable throwable0) {
                return f.c().d().c(throwable0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((Throwable)object0));
            }
        }


        static final class s implements p {
            public rx.g.b a(rx.g.b g$b0) {
                return f.c().d().b(g$b0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((rx.g.b)object0));
            }
        }

        c.b = new rx.plugins.c.k();
        c.f = new l();
        c.m = new m();
        c.g = new n();
        c.n = new rx.plugins.c.o();
        c.h = new rx.plugins.c.p();
        c.l = new rx.plugins.c.q();
        c.p = new r();
        c.s = new s();
        c.q = new rx.plugins.c.a();
        c.t = new rx.plugins.c.b();
        c.r = new rx.plugins.c.c();
        c.u = new d();
        c.y();
    }

    static void y() {
        static final class e implements p {
            public a a(a g$a0) {
                return f.c().d().a(g$a0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((a)object0));
            }
        }


        static final class rx.plugins.c.f implements p {
            public t a(t k$t0) {
                return f.c().g().a(k$t0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((t)object0));
            }
        }


        static final class rx.plugins.c.g implements p {
            public J a(J b$J0) {
                return f.c().a().a(b$J0);
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((J)object0));
            }
        }

        c.c = new e();
        c.d = new rx.plugins.c.f();
        c.e = new rx.plugins.c.g();
    }

    public static boolean z() {
        return c.a;
    }
}

