package rx;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.functions.b;
import rx.functions.p;
import rx.functions.v;
import rx.functions.w;
import rx.functions.x;
import rx.functions.y;
import rx.internal.operators.M1;
import rx.internal.operators.N1;
import rx.internal.operators.O1;
import rx.internal.operators.P1;
import rx.internal.operators.Q1;
import rx.internal.operators.R1;
import rx.internal.operators.S1;
import rx.internal.operators.T1;
import rx.internal.operators.U1;
import rx.internal.operators.V1;
import rx.internal.operators.W1;
import rx.internal.operators.X1;
import rx.internal.operators.Y1;
import rx.internal.operators.Z1;
import rx.internal.operators.a2;
import rx.internal.operators.b2;
import rx.internal.operators.c2;
import rx.internal.operators.d2;
import rx.internal.operators.e2;
import rx.internal.operators.f2;
import rx.internal.operators.g2;
import rx.internal.operators.h2;
import rx.internal.operators.i2;
import rx.internal.operators.i;
import rx.observers.e;
import rx.plugins.c;
import rx.subscriptions.f;

public class k {
    public interface t extends b {
    }

    public interface u extends p {
    }

    final t a;

    @Deprecated
    protected k(a g$a0) {
        this.a = c.H(new U1(g$a0));
    }

    protected k(t k$t0) {
        this.a = c.H(k$t0);
    }

    public final rx.b A(p p0) {
        return rx.b.p(new i(this, p0));
    }

    public final o A0(n n0) {
        return this.B0(n0, true);
    }

    public final g B(p p0) {
        return g.l3(k.a(this.K(p0)));
    }

    private o B0(n n0, boolean z) {
        try {
            if(z) {
                n0.onStart();
            }
            c.T(this, this.a).b(V1.c(n0));
            return c.S(n0);
        }
        catch(Throwable throwable0) {
        }
        rx.exceptions.c.e(throwable0);
        try {
            n0.onError(c.Q(throwable0));
            return f.e();
        }
        catch(Throwable throwable1) {
            rx.exceptions.c.e(throwable1);
            RuntimeException runtimeException0 = new RuntimeException("Error occurred attempting to subscribe [" + throwable0.getMessage() + "] and then again while trying to pass to onError.", throwable1);
            c.Q(runtimeException0);
            throw runtimeException0;
        }
    }

    public static k C(Future future0) {
        return k.n(new T1(future0, 0L, null));
    }

    @D4.b
    public final k C0(j j0) {
        class rx.k.j implements t {
            final j a;
            final k b;

            rx.k.j(j j0) {
                this.a = j0;
                super();
            }

            public void a(m m0) {
                class rx.k.j.a extends m {
                    final m b;
                    final rx.k.j c;

                    rx.k.j.a(m m0) {
                        this.b = m0;
                        super();
                    }

                    @Override  // rx.m
                    public void e(Object object0) {
                        this.b.e(object0);
                    }

                    @Override  // rx.m
                    public void onError(Throwable throwable0) {
                        this.b.onError(throwable0);
                    }
                }


                class rx.k.j.b implements rx.functions.a {
                    final m a;
                    final rx.k.j b;

                    rx.k.j.b(m m0) {
                        this.a = m0;
                        super();
                    }

                    @Override  // rx.functions.a
                    public void call() {
                        class rx.k.j.b.a implements rx.functions.a {
                            final rx.j.a a;
                            final rx.k.j.b b;

                            rx.k.j.b.a(rx.j.a j$a0) {
                                this.a = j$a0;
                                super();
                            }

                            @Override  // rx.functions.a
                            public void call() {
                                try {
                                    rx.k.j.b.this.a.l();
                                }
                                finally {
                                    this.a.l();
                                }
                            }
                        }

                        rx.j.a j$a0 = rx.k.j.this.a.a();
                        j$a0.c(new rx.k.j.b.a(this, j$a0));
                    }
                }

                rx.k.j.a k$j$a0 = new rx.k.j.a(this, m0);
                m0.c(f.a(new rx.k.j.b(this, k$j$a0)));
                k.this.j0(k$j$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((m)object0));
            }
        }

        return k.n(new rx.k.j(this, j0));
    }

    public static k D(Future future0, long v, TimeUnit timeUnit0) {
        if(timeUnit0 == null) {
            throw new NullPointerException("unit is null");
        }
        return k.n(new T1(future0, v, timeUnit0));
    }

    public static k D0(rx.functions.o o0, p p0, b b0) {
        return k.E0(o0, p0, b0, false);
    }

    public static k E(Future future0, j j0) {
        return k.C(future0).n0(j0);
    }

    public static k E0(rx.functions.o o0, p p0, b b0, boolean z) {
        if(o0 == null) {
            throw new NullPointerException("resourceFactory is null");
        }
        if(p0 == null) {
            throw new NullPointerException("singleFactory is null");
        }
        if(b0 == null) {
            throw new NullPointerException("disposeAction is null");
        }
        return k.n(new a2(o0, p0, b0, z));
    }

    public static k F(Callable callable0) {
        return k.n(new R1(callable0));
    }

    public static k F0(Iterable iterable0, y y0) {
        return d2.a(k.H(iterable0), y0);
    }

    public static k G(b b0) {
        if(b0 == null) {
            throw new NullPointerException("producer is null");
        }
        return k.n(new S1(b0));
    }

    public static k G0(k k0, k k1, k k2, k k3, k k4, k k5, k k6, k k7, k k8, x x0) {
        static final class rx.k.a implements y {
            final x a;

            rx.k.a(x x0) {
                this.a = x0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                return this.a.h(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4], arr_object[5], arr_object[6], arr_object[7], arr_object[8]);
            }
        }

        return d2.a(new k[]{k0, k1, k2, k3, k4, k5, k6, k7, k8}, new rx.k.a(x0));
    }

    static k[] H(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return (k[])((Collection)iterable0).toArray(new k[((Collection)iterable0).size()]);
        }
        k[] arr_k = new k[8];
        int v = 0;
        for(Object object0: iterable0) {
            if(v == arr_k.length) {
                k[] arr_k1 = new k[(v >> 2) + v];
                System.arraycopy(arr_k, 0, arr_k1, 0, v);
                arr_k = arr_k1;
            }
            arr_k[v] = (k)object0;
            ++v;
        }
        if(arr_k.length == v) {
            return arr_k;
        }
        k[] arr_k2 = new k[v];
        System.arraycopy(arr_k, 0, arr_k2, 0, v);
        return arr_k2;
    }

    public static k H0(k k0, k k1, k k2, k k3, k k4, k k5, k k6, k k7, w w0) {
        static final class s implements y {
            final w a;

            s(w w0) {
                this.a = w0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                return this.a.g(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4], arr_object[5], arr_object[6], arr_object[7]);
            }
        }

        return d2.a(new k[]{k0, k1, k2, k3, k4, k5, k6, k7}, new s(w0));
    }

    public static k I(Object object0) {
        return rx.internal.util.p.P0(object0);
    }

    public static k I0(k k0, k k1, k k2, k k3, k k4, k k5, k k6, v v0) {
        static final class r implements y {
            final v a;

            r(v v0) {
                this.a = v0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                return this.a.i(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4], arr_object[5], arr_object[6]);
            }
        }

        return d2.a(new k[]{k0, k1, k2, k3, k4, k5, k6}, new r(v0));
    }

    public final k J(rx.g.b g$b0) {
        return k.n(new V1(this.a, g$b0));
    }

    public static k J0(k k0, k k1, k k2, k k3, k k4, k k5, rx.functions.u u0) {
        static final class q implements y {
            final rx.functions.u a;

            q(rx.functions.u u0) {
                this.a = u0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                return this.a.k(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4], arr_object[5]);
            }
        }

        return d2.a(new k[]{k0, k1, k2, k3, k4, k5}, new q(u0));
    }

    public final k K(p p0) {
        return k.n(new Z1(this, p0));
    }

    public static k K0(k k0, k k1, k k2, k k3, k k4, rx.functions.t t0) {
        static final class rx.k.p implements y {
            final rx.functions.t a;

            rx.k.p(rx.functions.t t0) {
                this.a = t0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                return this.a.f(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4]);
            }
        }

        return d2.a(new k[]{k0, k1, k2, k3, k4}, new rx.k.p(t0));
    }

    public static g L(g g0) {
        return k.M(g0, 0x7FFFFFFF);
    }

    public static k L0(k k0, k k1, k k2, k k3, rx.functions.s s0) {
        static final class rx.k.o implements y {
            final rx.functions.s a;

            rx.k.o(rx.functions.s s0) {
                this.a = s0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                return this.a.n(arr_object[0], arr_object[1], arr_object[2], arr_object[3]);
            }
        }

        return d2.a(new k[]{k0, k1, k2, k3}, new rx.k.o(s0));
    }

    public static g M(g g0, int v) {
        return g0.u2(rx.internal.util.s.c(), false, v);
    }

    public static k M0(k k0, k k1, k k2, rx.functions.r r0) {
        static final class rx.k.n implements y {
            final rx.functions.r a;

            rx.k.n(rx.functions.r r0) {
                this.a = r0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                return this.a.m(arr_object[0], arr_object[1], arr_object[2]);
            }
        }

        return d2.a(new k[]{k0, k1, k2}, new rx.k.n(r0));
    }

    public static g N(k k0, k k1) {
        return g.n3(k.a(k0), k.a(k1));
    }

    public static k N0(k k0, k k1, rx.functions.q q0) {
        static final class rx.k.m implements y {
            final rx.functions.q a;

            rx.k.m(rx.functions.q q0) {
                this.a = q0;
                super();
            }

            @Override  // rx.functions.y
            public Object call(Object[] arr_object) {
                return this.a.p(arr_object[0], arr_object[1]);
            }
        }

        return d2.a(new k[]{k0, k1}, new rx.k.m(q0));
    }

    public static g O(k k0, k k1, k k2) {
        return g.o3(k.a(k0), k.a(k1), k.a(k2));
    }

    public final k O0(k k0, rx.functions.q q0) {
        return k.N0(this, k0, q0);
    }

    public static g P(k k0, k k1, k k2, k k3) {
        return g.p3(k.a(k0), k.a(k1), k.a(k2), k.a(k3));
    }

    public static g Q(k k0, k k1, k k2, k k3, k k4) {
        return g.q3(k.a(k0), k.a(k1), k.a(k2), k.a(k3), k.a(k4));
    }

    public static g R(k k0, k k1, k k2, k k3, k k4, k k5) {
        return g.r3(k.a(k0), k.a(k1), k.a(k2), k.a(k3), k.a(k4), k.a(k5));
    }

    public static g S(k k0, k k1, k k2, k k3, k k4, k k5, k k6) {
        return g.s3(k.a(k0), k.a(k1), k.a(k2), k.a(k3), k.a(k4), k.a(k5), k.a(k6));
    }

    public static g T(k k0, k k1, k k2, k k3, k k4, k k5, k k6, k k7) {
        return g.t3(k.a(k0), k.a(k1), k.a(k2), k.a(k3), k.a(k4), k.a(k5), k.a(k6), k.a(k7));
    }

    public static g U(k k0, k k1, k k2, k k3, k k4, k k5, k k6, k k7, k k8) {
        return g.u3(k.a(k0), k.a(k1), k.a(k2), k.a(k3), k.a(k4), k.a(k5), k.a(k6), k.a(k7), k.a(k8));
    }

    // 去混淆评级： 低(20)
    public static k V(k k0) {
        static final class l implements t {
            final k a;

            l(k k0) {
                this.a = k0;
                super();
            }

            public void a(m m0) {
                class rx.k.l.a extends m {
                    final m b;
                    final l c;

                    rx.k.l.a(m m0) {
                        this.b = m0;
                        super();
                    }

                    @Override  // rx.m
                    public void e(Object object0) {
                        this.o(((k)object0));
                    }

                    public void o(k k0) {
                        k0.j0(this.b);
                    }

                    @Override  // rx.m
                    public void onError(Throwable throwable0) {
                        this.b.onError(throwable0);
                    }
                }

                rx.k.l.a k$l$a0 = new rx.k.l.a(this, m0);
                m0.c(k$l$a0);
                this.a.j0(k$l$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((m)object0));
            }
        }

        return k0 instanceof rx.internal.util.p ? ((rx.internal.util.p)k0).R0(rx.internal.util.s.c()) : k.n(new l(k0));
    }

    public static g W(g g0) {
        return k.M(g0, 0x7FFFFFFF);
    }

    public static g X(g g0, int v) {
        return g0.u2(rx.internal.util.s.c(), true, v);
    }

    public final g Y(k k0) {
        return k.N(this, k0);
    }

    public final k Z(j j0) {
        if(this instanceof rx.internal.util.p) {
            return ((rx.internal.util.p)this).S0(j0);
        }
        if(j0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        return k.n(new W1(this.a, j0));
    }

    private static g a(k k0) {
        return g.M6(new i2(k0.a));
    }

    public final k a0(k k0) {
        return new k(c2.d(this, k0));
    }

    public final k b() {
        return this.z0().i0(1).H6();
    }

    public final k b0(p p0) {
        return new k(c2.c(this, p0));
    }

    @D4.b
    public final k c(Class class0) {
        return this.K(new b2(class0));
    }

    public final k c0(p p0) {
        return k.n(new X1(this.a, p0));
    }

    public k d(u k$u0) {
        return (k)k$u0.b(this);
    }

    public final k d0() {
        return this.z0().G4().H6();
    }

    public static g e(k k0, k k1) {
        return g.z0(k.a(k0), k.a(k1));
    }

    public final k e0(long v) {
        return this.z0().H4(v).H6();
    }

    public static g f(k k0, k k1, k k2) {
        return g.A0(k.a(k0), k.a(k1), k.a(k2));
    }

    public final k f0(rx.functions.q q0) {
        return this.z0().I4(q0).H6();
    }

    public static g g(k k0, k k1, k k2, k k3) {
        return g.B0(k.a(k0), k.a(k1), k.a(k2), k.a(k3));
    }

    public final k g0(p p0) {
        return this.z0().J4(p0).H6();
    }

    public static g h(k k0, k k1, k k2, k k3, k k4) {
        return g.C0(k.a(k0), k.a(k1), k.a(k2), k.a(k3), k.a(k4));
    }

    public final o h0() {
        return this.m0(rx.functions.m.a(), rx.functions.m.b());
    }

    public static g i(k k0, k k1, k k2, k k3, k k4, k k5) {
        return g.D0(k.a(k0), k.a(k1), k.a(k2), k.a(k3), k.a(k4), k.a(k5));
    }

    public final o i0(h h0) {
        class rx.k.c extends m {
            final h b;
            final k c;

            rx.k.c(h h0) {
                this.b = h0;
                super();
            }

            @Override  // rx.m
            public void e(Object object0) {
                this.b.onNext(object0);
                this.b.d();
            }

            @Override  // rx.m
            public void onError(Throwable throwable0) {
                this.b.onError(throwable0);
            }
        }

        if(h0 == null) {
            throw new NullPointerException("observer is null");
        }
        return this.j0(new rx.k.c(this, h0));
    }

    public static g j(k k0, k k1, k k2, k k3, k k4, k k5, k k6) {
        return g.E0(k.a(k0), k.a(k1), k.a(k2), k.a(k3), k.a(k4), k.a(k5), k.a(k6));
    }

    public final o j0(m m0) {
        if(m0 != null) {
            try {
                c.T(this, this.a).b(m0);
                return c.S(m0);
            }
            catch(Throwable throwable0) {
                rx.exceptions.c.e(throwable0);
                try {
                    m0.onError(c.Q(throwable0));
                    return f.b();
                }
                catch(Throwable throwable1) {
                    rx.exceptions.c.e(throwable1);
                    RuntimeException runtimeException0 = new RuntimeException("Error occurred attempting to subscribe [" + throwable0.getMessage() + "] and then again while trying to pass to onError.", throwable1);
                    c.Q(runtimeException0);
                    throw runtimeException0;
                }
            }
        }
        throw new IllegalArgumentException("te is null");
    }

    public static g k(k k0, k k1, k k2, k k3, k k4, k k5, k k6, k k7) {
        return g.F0(k.a(k0), k.a(k1), k.a(k2), k.a(k3), k.a(k4), k.a(k5), k.a(k6), k.a(k7));
    }

    public final o k0(n n0) {
        if(n0 == null) {
            throw new IllegalArgumentException("observer can not be null");
        }
        n0.onStart();
        return n0 instanceof e ? this.B0(n0, true) : this.B0(new e(n0), false);
    }

    public static g l(k k0, k k1, k k2, k k3, k k4, k k5, k k6, k k7, k k8) {
        return g.G0(k.a(k0), k.a(k1), k.a(k2), k.a(k3), k.a(k4), k.a(k5), k.a(k6), k.a(k7), k.a(k8));
    }

    public final o l0(b b0) {
        return this.m0(b0, rx.functions.m.b());
    }

    public final g m(k k0) {
        return k.e(this, k0);
    }

    public final o m0(b b0, b b1) {
        class rx.k.b extends m {
            final b b;
            final b c;
            final k d;

            rx.k.b(b b0, b b1) {
                this.b = b0;
                this.c = b1;
                super();
            }

            @Override  // rx.m
            public final void e(Object object0) {
                try {
                    this.c.b(object0);
                }
                finally {
                    this.l();
                }
            }

            @Override  // rx.m
            public final void onError(Throwable throwable0) {
                try {
                    this.b.b(throwable0);
                }
                finally {
                    this.l();
                }
            }
        }

        if(b0 == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        }
        if(b1 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        return this.j0(new rx.k.b(this, b1, b0));
    }

    public static k n(t k$t0) {
        return new k(k$t0);
    }

    // 去混淆评级： 低(20)
    public final k n0(j j0) {
        class d implements t {
            final j a;
            final k b;

            d(j j0) {
                this.a = j0;
                super();
            }

            public void a(m m0) {
                class rx.k.d.a implements rx.functions.a {
                    final m a;
                    final rx.j.a b;
                    final d c;

                    rx.k.d.a(m m0, rx.j.a j$a0) {
                        this.a = m0;
                        this.b = j$a0;
                        super();
                    }

                    @Override  // rx.functions.a
                    public void call() {
                        class rx.k.d.a.a extends m {
                            final rx.k.d.a b;

                            @Override  // rx.m
                            public void e(Object object0) {
                                try {
                                    rx.k.d.a.this.a.e(object0);
                                }
                                finally {
                                    rx.k.d.a.this.b.l();
                                }
                            }

                            @Override  // rx.m
                            public void onError(Throwable throwable0) {
                                try {
                                    rx.k.d.a.this.a.onError(throwable0);
                                }
                                finally {
                                    rx.k.d.a.this.b.l();
                                }
                            }
                        }

                        rx.k.d.a.a k$d$a$a0 = new rx.k.d.a.a(this);
                        this.a.c(k$d$a$a0);
                        k.this.j0(k$d$a$a0);
                    }
                }

                rx.j.a j$a0 = this.a.a();
                m0.c(j$a0);
                j$a0.c(new rx.k.d.a(this, m0, j$a0));
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((m)object0));
            }
        }

        return this instanceof rx.internal.util.p ? ((rx.internal.util.p)this).S0(j0) : k.n(new d(this, j0));
    }

    public static k o(Callable callable0) {
        static final class rx.k.i implements t {
            final Callable a;

            rx.k.i(Callable callable0) {
                this.a = callable0;
                super();
            }

            public void a(m m0) {
                k k0;
                try {
                    k0 = (k)this.a.call();
                }
                catch(Throwable throwable0) {
                    rx.exceptions.c.e(throwable0);
                    m0.onError(throwable0);
                    return;
                }
                k0.j0(m0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((m)object0));
            }
        }

        return k.n(new rx.k.i(callable0));
    }

    public final k o0(rx.b b0) {
        return k.n(new e2(this.a, b0));
    }

    public final k p(long v, TimeUnit timeUnit0) {
        return this.q(v, timeUnit0, rx.schedulers.c.a());
    }

    public final k p0(g g0) {
        return k.n(new f2(this.a, g0));
    }

    public final k q(long v, TimeUnit timeUnit0, j j0) {
        return k.n(new M1(this.a, v, timeUnit0, j0));
    }

    public final k q0(k k0) {
        return k.n(new g2(this.a, k0));
    }

    public final k r(g g0) {
        g0.getClass();
        return k.n(new Y1(this, g0));
    }

    public final rx.observers.a r0() {
        rx.observers.a a0 = E4.a.x(0x7FFFFFFFFFFFFFFFL);
        this.k0(((n)a0));
        return a0;
    }

    public final k s(rx.functions.a a0) {
        return k.n(new N1(this, a0));
    }

    public final k s0(long v, TimeUnit timeUnit0) {
        return this.v0(v, timeUnit0, null, rx.schedulers.c.a());
    }

    public final k t(b b0) {
        class rx.k.g implements b {
            final b a;
            final k b;

            rx.k.g(b b0) {
                this.a = b0;
                super();
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                rx.f f0 = rx.f.e(object0);
                this.a.b(f0);
            }
        }


        class rx.k.h implements b {
            final b a;
            final k b;

            rx.k.h(b b0) {
                this.a = b0;
                super();
            }

            public void a(Throwable throwable0) {
                rx.f f0 = rx.f.d(throwable0);
                this.a.b(f0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((Throwable)object0));
            }
        }

        if(b0 == null) {
            throw new IllegalArgumentException("onNotification is null");
        }
        return k.n(new O1(this, new rx.k.g(this, b0), new rx.k.h(this, b0)));
    }

    public final k t0(long v, TimeUnit timeUnit0, j j0) {
        return this.v0(v, timeUnit0, null, j0);
    }

    public final k u(b b0) {
        class rx.k.f implements b {
            final b a;
            final k b;

            rx.k.f(b b0) {
                this.a = b0;
                super();
            }

            public void a(Throwable throwable0) {
                this.a.b(throwable0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((Throwable)object0));
            }
        }

        if(b0 == null) {
            throw new IllegalArgumentException("onError is null");
        }
        return k.n(new O1(this, rx.functions.m.a(), new rx.k.f(this, b0)));
    }

    public final k u0(long v, TimeUnit timeUnit0, k k0) {
        return this.v0(v, timeUnit0, k0, rx.schedulers.c.a());
    }

    public final k v(rx.functions.a a0) {
        return k.n(new P1(this.a, a0));
    }

    public final k v0(long v, TimeUnit timeUnit0, k k0, j j0) {
        class rx.k.e implements rx.functions.o {
            final k a;

            public k a() {
                return k.y(new TimeoutException());
            }

            @Override  // rx.functions.o
            public Object call() {
                return this.a();
            }
        }

        if(k0 == null) {
            k0 = k.o(new rx.k.e(this));
        }
        return k.n(new h2(this.a, v, timeUnit0, j0, k0.a));
    }

    public final k w(b b0) {
        if(b0 == null) {
            throw new IllegalArgumentException("onSuccess is null");
        }
        return k.n(new O1(this, b0, rx.functions.m.a()));
    }

    public final Object w0(p p0) {
        return p0.b(this);
    }

    public final k x(rx.functions.a a0) {
        return k.n(new Q1(this.a, a0));
    }

    public final rx.singles.a x0() {
        return rx.singles.a.a(this);
    }

    public static k y(Throwable throwable0) {
        static final class rx.k.k implements t {
            final Throwable a;

            rx.k.k(Throwable throwable0) {
                this.a = throwable0;
                super();
            }

            public void a(m m0) {
                m0.onError(this.a);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((m)object0));
            }
        }

        return k.n(new rx.k.k(throwable0));
    }

    public final rx.b y0() {
        return rx.b.K(this);
    }

    // 去混淆评级： 低(20)
    public final k z(p p0) {
        return this instanceof rx.internal.util.p ? ((rx.internal.util.p)this).R0(p0) : k.V(this.K(p0));
    }

    public final g z0() {
        return k.a(this);
    }
}

