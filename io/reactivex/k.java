package io.reactivex;

import d3.d;
import d3.f;
import d3.h;
import e3.g;
import e3.i;
import e3.j;
import e3.k;
import e3.m;
import e3.n;
import e3.o;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.operators.flowable.e0;
import io.reactivex.internal.operators.flowable.u1;
import io.reactivex.internal.operators.maybe.z;
import io.reactivex.internal.operators.observable.h1;
import io.reactivex.internal.operators.single.A;
import io.reactivex.internal.operators.single.C;
import io.reactivex.internal.operators.single.D;
import io.reactivex.internal.operators.single.E;
import io.reactivex.internal.operators.single.F;
import io.reactivex.internal.operators.single.H;
import io.reactivex.internal.operators.single.I;
import io.reactivex.internal.operators.single.M;
import io.reactivex.internal.operators.single.N;
import io.reactivex.internal.operators.single.P;
import io.reactivex.internal.operators.single.S;
import io.reactivex.internal.operators.single.T;
import io.reactivex.internal.operators.single.U;
import io.reactivex.internal.operators.single.V;
import io.reactivex.internal.operators.single.W;
import io.reactivex.internal.operators.single.X;
import io.reactivex.internal.operators.single.Y;
import io.reactivex.internal.operators.single.Z;
import io.reactivex.internal.operators.single.a0;
import io.reactivex.internal.operators.single.c;
import io.reactivex.internal.operators.single.e;
import io.reactivex.internal.operators.single.p;
import io.reactivex.internal.operators.single.q;
import io.reactivex.internal.operators.single.r;
import io.reactivex.internal.operators.single.t;
import io.reactivex.internal.operators.single.u;
import io.reactivex.internal.operators.single.v;
import io.reactivex.internal.operators.single.w;
import io.reactivex.internal.operators.single.x;
import io.reactivex.internal.operators.single.y;
import io.reactivex.plugins.a;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class K implements Q {
    @d
    @f
    @h("none")
    public final K A(Object object0, e3.d d0) {
        b.g(object0, "value is null");
        b.g(d0, "comparer is null");
        return a.S(new c(this, object0, d0));
    }

    @d
    @f
    @h("none")
    public static K A0(Q q0) {
        b.g(q0, "source is null");
        return a.S(new x(q0, io.reactivex.internal.functions.a.k()));
    }

    @d
    @h("none")
    public static K A1(Callable callable0, o o0, g g0) {
        return K.B1(callable0, o0, g0, true);
    }

    @d
    @f
    @h("none")
    public static K B(O o0) {
        b.g(o0, "source is null");
        return a.S(new io.reactivex.internal.operators.single.d(o0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l B0(Q q0, Q q1) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        return K.F0(l.T2(new Q[]{q0, q1}));
    }

    @d
    @f
    @h("none")
    public static K B1(Callable callable0, o o0, g g0, boolean z) {
        b.g(callable0, "resourceSupplier is null");
        b.g(o0, "singleFunction is null");
        b.g(g0, "disposer is null");
        return a.S(new Y(callable0, o0, g0, z));
    }

    @d
    @f
    @h("none")
    public static K C(Callable callable0) {
        b.g(callable0, "singleSupplier is null");
        return a.S(new e(callable0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l C0(Q q0, Q q1, Q q2) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        return K.F0(l.T2(new Q[]{q0, q1, q2}));
    }

    @d
    @f
    @h("none")
    public static K C1(Q q0) {
        b.g(q0, "source is null");
        return q0 instanceof K ? a.S(((K)q0)) : a.S(new F(q0));
    }

    @d
    @h("io.reactivex:computation")
    public final K D(long v, TimeUnit timeUnit0) {
        return this.F(v, timeUnit0, io.reactivex.schedulers.b.a(), false);
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l D0(Q q0, Q q1, Q q2, Q q3) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        b.g(q3, "source4 is null");
        return K.F0(l.T2(new Q[]{q0, q1, q2, q3}));
    }

    @d
    @f
    @h("none")
    public static K D1(Q q0, Q q1, e3.c c0) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        return K.M1(io.reactivex.internal.functions.a.x(c0), new Q[]{q0, q1});
    }

    @d
    @h("custom")
    public final K E(long v, TimeUnit timeUnit0, J j0) {
        return this.F(v, timeUnit0, j0, false);
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l E0(Iterable iterable0) {
        return K.F0(l.Z2(iterable0));
    }

    @d
    @f
    @h("none")
    public static K E1(Q q0, Q q1, Q q2, e3.h h0) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        return K.M1(io.reactivex.internal.functions.a.y(h0), new Q[]{q0, q1, q2});
    }

    @d
    @f
    @h("custom")
    public final K F(long v, TimeUnit timeUnit0, J j0, boolean z) {
        b.g(timeUnit0, "unit is null");
        b.g(j0, "scheduler is null");
        return a.S(new io.reactivex.internal.operators.single.f(this, v, timeUnit0, j0, z));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l F0(org.reactivestreams.c c0) {
        b.g(c0, "sources is null");
        return a.P(new e0(c0, H.c(), true, 0x7FFFFFFF, 0x80));
    }

    @d
    @f
    @h("none")
    public static K F1(Q q0, Q q1, Q q2, Q q3, i i0) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        b.g(q3, "source4 is null");
        return K.M1(io.reactivex.internal.functions.a.z(i0), new Q[]{q0, q1, q2, q3});
    }

    @d
    @h("io.reactivex:computation")
    public final K G(long v, TimeUnit timeUnit0, boolean z) {
        return this.F(v, timeUnit0, io.reactivex.schedulers.b.a(), z);
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l G0(Q q0) {
        return K.v0(this, q0);
    }

    @d
    @f
    @h("none")
    public static K G1(Q q0, Q q1, Q q2, Q q3, Q q4, j j0) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        b.g(q3, "source4 is null");
        b.g(q4, "source5 is null");
        return K.M1(io.reactivex.internal.functions.a.A(j0), new Q[]{q0, q1, q2, q3, q4});
    }

    @d
    @h("io.reactivex:computation")
    public final K H(long v, TimeUnit timeUnit0) {
        return this.I(v, timeUnit0, io.reactivex.schedulers.b.a());
    }

    @d
    @h("none")
    public static K H0() {
        return a.S(M.a);
    }

    @d
    @f
    @h("none")
    public static K H1(Q q0, Q q1, Q q2, Q q3, Q q4, Q q5, k k0) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        b.g(q3, "source4 is null");
        b.g(q4, "source5 is null");
        b.g(q5, "source6 is null");
        return K.M1(io.reactivex.internal.functions.a.B(k0), new Q[]{q0, q1, q2, q3, q4, q5});
    }

    @d
    @h("custom")
    public final K I(long v, TimeUnit timeUnit0, J j0) {
        return this.K(B.Q6(v, timeUnit0, j0));
    }

    @d
    @f
    @h("custom")
    public final K I0(J j0) {
        b.g(j0, "scheduler is null");
        return a.S(new N(this, j0));
    }

    @d
    @f
    @h("none")
    public static K I1(Q q0, Q q1, Q q2, Q q3, Q q4, Q q5, Q q6, e3.l l0) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        b.g(q3, "source4 is null");
        b.g(q4, "source5 is null");
        b.g(q5, "source6 is null");
        b.g(q6, "source7 is null");
        return K.M1(io.reactivex.internal.functions.a.C(l0), new Q[]{q0, q1, q2, q3, q4, q5, q6});
    }

    @d
    @f
    @h("none")
    public final K J(io.reactivex.i i0) {
        b.g(i0, "other is null");
        return a.S(new io.reactivex.internal.operators.single.g(this, i0));
    }

    @d
    @f
    @h("none")
    public final K J0(o o0) {
        b.g(o0, "resumeFunctionInCaseOfError is null");
        return a.S(new P(this, o0));
    }

    @d
    @f
    @h("none")
    public static K J1(Q q0, Q q1, Q q2, Q q3, Q q4, Q q5, Q q6, Q q7, m m0) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        b.g(q3, "source4 is null");
        b.g(q4, "source5 is null");
        b.g(q5, "source6 is null");
        b.g(q6, "source7 is null");
        b.g(q7, "source8 is null");
        return K.M1(io.reactivex.internal.functions.a.D(m0), new Q[]{q0, q1, q2, q3, q4, q5, q6, q7});
    }

    @d
    @f
    @h("none")
    public final K K(G g0) {
        b.g(g0, "other is null");
        return a.S(new io.reactivex.internal.operators.single.h(this, g0));
    }

    @d
    @f
    @h("none")
    public final K K0(K k0) {
        b.g(k0, "resumeSingleInCaseOfError is null");
        return this.J0(io.reactivex.internal.functions.a.n(k0));
    }

    @d
    @f
    @h("none")
    public static K K1(Q q0, Q q1, Q q2, Q q3, Q q4, Q q5, Q q6, Q q7, Q q8, n n0) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        b.g(q3, "source4 is null");
        b.g(q4, "source5 is null");
        b.g(q5, "source6 is null");
        b.g(q6, "source7 is null");
        b.g(q7, "source8 is null");
        b.g(q8, "source9 is null");
        return K.M1(io.reactivex.internal.functions.a.E(n0), new Q[]{q0, q1, q2, q3, q4, q5, q6, q7, q8});
    }

    @d
    @f
    @h("none")
    public final K L(Q q0) {
        b.g(q0, "other is null");
        return a.S(new io.reactivex.internal.operators.single.j(this, q0));
    }

    @d
    @f
    @h("none")
    public final K L0(o o0) {
        b.g(o0, "resumeFunction is null");
        return a.S(new io.reactivex.internal.operators.single.O(this, o0, null));
    }

    @d
    @f
    @h("none")
    public static K L1(Iterable iterable0, o o0) {
        b.g(o0, "zipper is null");
        b.g(iterable0, "sources is null");
        return a.S(new a0(iterable0, o0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public final K M(org.reactivestreams.c c0) {
        b.g(c0, "other is null");
        return a.S(new io.reactivex.internal.operators.single.i(this, c0));
    }

    @d
    @f
    @h("none")
    public final K M0(Object object0) {
        b.g(object0, "value is null");
        return a.S(new io.reactivex.internal.operators.single.O(this, null, object0));
    }

    @d
    @f
    @h("none")
    public static K M1(o o0, Q[] arr_q) {
        b.g(o0, "zipper is null");
        b.g(arr_q, "sources is null");
        return arr_q.length == 0 ? K.Y(new NoSuchElementException()) : a.S(new Z(arr_q, o0));
    }

    @d
    @d3.e
    @f
    @h("none")
    public final s N(o o0) {
        b.g(o0, "selector is null");
        return a.Q(new io.reactivex.internal.operators.single.k(this, o0));
    }

    @d
    @h("none")
    public final K N0() {
        return a.S(new io.reactivex.internal.operators.single.l(this));
    }

    @d
    @h("none")
    public final K N1(Q q0, e3.c c0) {
        return K.D1(this, q0, c0);
    }

    @d
    @f
    @h("none")
    public final K O(g g0) {
        b.g(g0, "onAfterSuccess is null");
        return a.S(new io.reactivex.internal.operators.single.m(this, g0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l O0() {
        return this.t1().V4();
    }

    @d
    @f
    @h("none")
    public final K P(e3.a a0) {
        b.g(a0, "onAfterTerminate is null");
        return a.S(new io.reactivex.internal.operators.single.n(this, a0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l P0(long v) {
        return this.t1().W4(v);
    }

    @d
    @f
    @h("none")
    public final K Q(e3.a a0) {
        b.g(a0, "onFinally is null");
        return a.S(new io.reactivex.internal.operators.single.o(this, a0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l Q0(e3.e e0) {
        return this.t1().X4(e0);
    }

    @d
    @f
    @h("none")
    public final K R(e3.a a0) {
        b.g(a0, "onDispose is null");
        return a.S(new p(this, a0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l R0(o o0) {
        return this.t1().Y4(o0);
    }

    @d
    @f
    @h("none")
    public final K S(g g0) {
        b.g(g0, "onError is null");
        return a.S(new q(this, g0));
    }

    @d
    @h("none")
    public final K S0() {
        return K.x1(this.t1().p5());
    }

    @d
    @f
    @h("none")
    public final K T(e3.b b0) {
        b.g(b0, "onEvent is null");
        return a.S(new r(this, b0));
    }

    @d
    @h("none")
    public final K T0(long v) {
        return K.x1(this.t1().q5(v));
    }

    @d
    @f
    @h("none")
    public final K U(g g0) {
        b.g(g0, "onSubscribe is null");
        return a.S(new io.reactivex.internal.operators.single.s(this, g0));
    }

    @d
    @h("none")
    public final K U0(long v, e3.r r0) {
        return K.x1(this.t1().r5(v, r0));
    }

    @d
    @f
    @h("none")
    public final K V(g g0) {
        b.g(g0, "onSuccess is null");
        return a.S(new t(this, g0));
    }

    @d
    @h("none")
    public final K V0(e3.d d0) {
        return K.x1(this.t1().s5(d0));
    }

    @d
    @d3.e
    @f
    @h("none")
    public final K W(e3.a a0) {
        b.g(a0, "onTerminate is null");
        return a.S(new u(this, a0));
    }

    @d
    @h("none")
    public final K W0(e3.r r0) {
        return K.x1(this.t1().t5(r0));
    }

    @d
    @f
    @h("none")
    public static K X(Q q0, Q q1) {
        b.g(q0, "first is null");
        b.g(q1, "second is null");
        return a.S(new v(q0, q1));
    }

    @d
    @h("none")
    public final K X0(o o0) {
        return K.x1(this.t1().v5(o0));
    }

    @d
    @f
    @h("none")
    public static K Y(Throwable throwable0) {
        b.g(throwable0, "exception is null");
        return K.Z(io.reactivex.internal.functions.a.m(throwable0));
    }

    @h("none")
    public final io.reactivex.disposables.c Y0() {
        return this.b1(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f);
    }

    @d
    @f
    @h("none")
    public static K Z(Callable callable0) {
        b.g(callable0, "errorSupplier is null");
        return a.S(new w(callable0));
    }

    @d
    @f
    @h("none")
    public final io.reactivex.disposables.c Z0(e3.b b0) {
        b.g(b0, "onCallback is null");
        io.reactivex.disposables.c c0 = new io.reactivex.internal.observers.d(b0);
        this.e(((io.reactivex.N)c0));
        return c0;
    }

    @d
    @f
    @h("none")
    public final s a0(e3.r r0) {
        b.g(r0, "predicate is null");
        return a.Q(new z(this, r0));
    }

    @d
    @h("none")
    public final io.reactivex.disposables.c a1(g g0) {
        return this.b1(g0, io.reactivex.internal.functions.a.f);
    }

    @d
    @f
    @h("none")
    public final K b0(o o0) {
        b.g(o0, "mapper is null");
        return a.S(new x(this, o0));
    }

    @d
    @f
    @h("none")
    public final io.reactivex.disposables.c b1(g g0, g g1) {
        b.g(g0, "onSuccess is null");
        b.g(g1, "onError is null");
        io.reactivex.disposables.c c0 = new io.reactivex.internal.observers.k(g0, g1);
        this.e(((io.reactivex.N)c0));
        return c0;
    }

    @d
    @f
    @h("none")
    public final io.reactivex.c c0(o o0) {
        b.g(o0, "mapper is null");
        return a.O(new y(this, o0));
    }

    protected abstract void c1(@f io.reactivex.N arg1);

    @d
    @f
    @h("none")
    public final s d0(o o0) {
        b.g(o0, "mapper is null");
        return a.Q(new io.reactivex.internal.operators.single.B(this, o0));
    }

    @d
    @f
    @h("custom")
    public final K d1(J j0) {
        b.g(j0, "scheduler is null");
        return a.S(new io.reactivex.internal.operators.single.Q(this, j0));
    }

    @Override  // io.reactivex.Q
    @h("none")
    public final void e(io.reactivex.N n0) {
        b.g(n0, "observer is null");
        io.reactivex.N n1 = a.g0(this, n0);
        b.g(n1, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            this.c1(n1);
        }
        catch(NullPointerException nullPointerException0) {
            throw nullPointerException0;
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            NullPointerException nullPointerException1 = new NullPointerException("subscribeActual failed");
            nullPointerException1.initCause(throwable0);
            throw nullPointerException1;
        }
    }

    @d
    @f
    @h("none")
    public final B e0(o o0) {
        b.g(o0, "mapper is null");
        return a.R(new io.reactivex.internal.operators.mixed.s(this, o0));
    }

    @d
    @h("none")
    public final io.reactivex.N e1(io.reactivex.N n0) {
        this.e(n0);
        return n0;
    }

    @d
    @f
    @h("none")
    public static K f(Iterable iterable0) {
        b.g(iterable0, "sources is null");
        return a.S(new io.reactivex.internal.operators.single.a(null, iterable0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public final l f0(o o0) {
        b.g(o0, "mapper is null");
        return a.P(new C(this, o0));
    }

    @d
    @f
    @h("none")
    public final K f1(io.reactivex.i i0) {
        b.g(i0, "other is null");
        return this.h1(new io.reactivex.internal.operators.completable.O(i0));
    }

    @d
    @h("none")
    public static K g(Q[] arr_q) {
        switch(arr_q.length) {
            case 0: {
                return K.Z(H.a());
            }
            case 1: {
                return K.C1(arr_q[0]);
            }
            default: {
                return a.S(new io.reactivex.internal.operators.single.a(arr_q, null));
            }
        }
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public final l g0(o o0) {
        b.g(o0, "mapper is null");
        return a.P(new io.reactivex.internal.operators.single.z(this, o0));
    }

    @d
    @f
    @h("none")
    public final K g1(Q q0) {
        b.g(q0, "other is null");
        return this.h1(new V(q0));
    }

    @d
    @f
    @h("none")
    public final K h(Q q0) {
        b.g(q0, "other is null");
        return K.g(new Q[]{this, q0});
    }

    @d
    @f
    @h("none")
    public final B h0(o o0) {
        b.g(o0, "mapper is null");
        return a.R(new A(this, o0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public final K h1(org.reactivestreams.c c0) {
        b.g(c0, "other is null");
        return a.S(new S(this, c0));
    }

    @d
    @h("none")
    public final Object i(@f L l0) {
        return ((L)b.g(l0, "converter is null")).a(this);
    }

    @d
    @f
    @h("none")
    public static K i0(Callable callable0) {
        b.g(callable0, "callable is null");
        return a.S(new D(callable0));
    }

    @d
    @h("none")
    public final io.reactivex.observers.n i1() {
        io.reactivex.observers.n n0 = new io.reactivex.observers.n();
        this.e(n0);
        return n0;
    }

    @d
    @h("none")
    public final Object j() {
        io.reactivex.internal.observers.h h0 = new io.reactivex.internal.observers.h();
        this.e(h0);
        return h0.c();
    }

    @d
    @h("none")
    public static K j0(Future future0) {
        return K.x1(l.V2(future0));
    }

    @d
    @h("none")
    public final io.reactivex.observers.n j1(boolean z) {
        io.reactivex.observers.n n0 = new io.reactivex.observers.n();
        if(z) {
            n0.cancel();
        }
        this.e(n0);
        return n0;
    }

    @d
    @h("none")
    public final K k() {
        return a.S(new io.reactivex.internal.operators.single.b(this));
    }

    @d
    @h("none")
    public static K k0(Future future0, long v, TimeUnit timeUnit0) {
        return K.x1(l.W2(future0, v, timeUnit0));
    }

    @d
    @h("io.reactivex:computation")
    public final K k1(long v, TimeUnit timeUnit0) {
        return this.o1(v, timeUnit0, io.reactivex.schedulers.b.a(), null);
    }

    @d
    @f
    @h("none")
    public final K l(Class class0) {
        b.g(class0, "clazz is null");
        return this.t0(io.reactivex.internal.functions.a.e(class0));
    }

    @d
    @h("custom")
    public static K l0(Future future0, long v, TimeUnit timeUnit0, J j0) {
        return K.x1(l.X2(future0, v, timeUnit0, j0));
    }

    @d
    @h("custom")
    public final K l1(long v, TimeUnit timeUnit0, J j0) {
        return this.o1(v, timeUnit0, j0, null);
    }

    @d
    @h("none")
    public final K m(io.reactivex.S s0) {
        return K.C1(((io.reactivex.S)b.g(s0, "transformer is null")).a(this));
    }

    @d
    @h("custom")
    public static K m0(Future future0, J j0) {
        return K.x1(l.Y2(future0, j0));
    }

    @d
    @f
    @h("custom")
    public final K m1(long v, TimeUnit timeUnit0, J j0, Q q0) {
        b.g(q0, "other is null");
        return this.o1(v, timeUnit0, j0, q0);
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l n(Q q0, Q q1) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        return K.r(l.T2(new Q[]{q0, q1}));
    }

    @d
    @f
    @h("none")
    public static K n0(G g0) {
        b.g(g0, "observableSource is null");
        return a.S(new h1(g0, null));
    }

    @d
    @f
    @h("io.reactivex:computation")
    public final K n1(long v, TimeUnit timeUnit0, Q q0) {
        b.g(q0, "other is null");
        return this.o1(v, timeUnit0, io.reactivex.schedulers.b.a(), q0);
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l o(Q q0, Q q1, Q q2) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        return K.r(l.T2(new Q[]{q0, q1, q2}));
    }

    @d3.b(d3.a.d)
    @d
    @f
    @h("none")
    public static K o0(org.reactivestreams.c c0) {
        b.g(c0, "publisher is null");
        return a.S(new E(c0));
    }

    private K o1(long v, TimeUnit timeUnit0, J j0, Q q0) {
        b.g(timeUnit0, "unit is null");
        b.g(j0, "scheduler is null");
        return a.S(new T(this, v, timeUnit0, j0, q0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l p(Q q0, Q q1, Q q2, Q q3) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        b.g(q3, "source4 is null");
        return K.r(l.T2(new Q[]{q0, q1, q2, q3}));
    }

    @d
    @h("none")
    public final K p0() {
        return a.S(new io.reactivex.internal.operators.single.G(this));
    }

    @d
    @h("io.reactivex:computation")
    public static K p1(long v, TimeUnit timeUnit0) {
        return K.q1(v, timeUnit0, io.reactivex.schedulers.b.a());
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l q(Iterable iterable0) {
        return K.r(l.Z2(iterable0));
    }

    @d
    @h("none")
    public final io.reactivex.c q0() {
        return a.O(new io.reactivex.internal.operators.completable.v(this));
    }

    @d
    @f
    @h("custom")
    public static K q1(long v, TimeUnit timeUnit0, J j0) {
        b.g(timeUnit0, "unit is null");
        b.g(j0, "scheduler is null");
        return a.S(new U(v, timeUnit0, j0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l r(org.reactivestreams.c c0) {
        return K.s(c0, 2);
    }

    @d
    @f
    @h("none")
    public static K r0(Object object0) {
        b.g(object0, "item is null");
        return a.S(new I(object0));
    }

    @d
    @h("none")
    public final Object r1(o o0) {
        try {
            return ((o)b.g(o0, "convert is null")).apply(this);
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            throw io.reactivex.internal.util.k.f(throwable0);
        }
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l s(org.reactivestreams.c c0, int v) {
        b.g(c0, "sources is null");
        b.h(v, "prefetch");
        return a.P(new io.reactivex.internal.operators.flowable.z(c0, H.c(), v, io.reactivex.internal.util.j.a));
    }

    @d
    @f
    @h("none")
    public final K s0(io.reactivex.P p0) {
        b.g(p0, "lift is null");
        return a.S(new io.reactivex.internal.operators.single.J(this, p0));
    }

    @d
    @h("none")
    @Deprecated
    public final io.reactivex.c s1() {
        return a.O(new io.reactivex.internal.operators.completable.v(this));
    }

    @d
    @f
    @h("none")
    public static B t(G g0) {
        b.g(g0, "sources is null");
        return a.R(new io.reactivex.internal.operators.observable.v(g0, H.d(), 2, io.reactivex.internal.util.j.a));
    }

    @d
    @f
    @h("none")
    public final K t0(o o0) {
        b.g(o0, "mapper is null");
        return a.S(new io.reactivex.internal.operators.single.K(this, o0));
    }

    // 去混淆评级： 低(20)
    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l t1() {
        return this instanceof f3.b ? ((f3.b)this).d() : a.P(new V(this));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l u(Q[] arr_q) {
        return a.P(new io.reactivex.internal.operators.flowable.w(l.T2(arr_q), H.c(), 2, io.reactivex.internal.util.j.b));
    }

    @d
    @d3.e
    @h("none")
    public final K u0() {
        return a.S(new io.reactivex.internal.operators.single.L(this));
    }

    @d
    @h("none")
    public final Future u1() {
        return (Future)this.e1(new io.reactivex.internal.observers.r());
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l v(Q[] arr_q) {
        return l.T2(arr_q).c1(H.c());
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l v0(Q q0, Q q1) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        return K.z0(l.T2(new Q[]{q0, q1}));
    }

    // 去混淆评级： 低(20)
    @d
    @h("none")
    public final s v1() {
        return this instanceof f3.c ? ((f3.c)this).a() : a.Q(new io.reactivex.internal.operators.maybe.N(this));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l w(Iterable iterable0) {
        return l.Z2(iterable0).c1(H.c());
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l w0(Q q0, Q q1, Q q2) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        return K.z0(l.T2(new Q[]{q0, q1, q2}));
    }

    // 去混淆评级： 低(20)
    @d
    @h("none")
    public final B w1() {
        return this instanceof f3.d ? ((f3.d)this).c() : a.R(new W(this));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l x(org.reactivestreams.c c0) {
        return l.a3(c0).c1(H.c());
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l x0(Q q0, Q q1, Q q2, Q q3) {
        b.g(q0, "source1 is null");
        b.g(q1, "source2 is null");
        b.g(q2, "source3 is null");
        b.g(q3, "source4 is null");
        return K.z0(l.T2(new Q[]{q0, q1, q2, q3}));
    }

    private static K x1(l l0) {
        return a.S(new u1(l0, null));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l y(Q q0) {
        return K.n(this, q0);
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l y0(Iterable iterable0) {
        return K.z0(l.Z2(iterable0));
    }

    @d
    @f
    @h("none")
    public static K y1(Q q0) {
        b.g(q0, "onSubscribe is null");
        if(q0 instanceof K) {
            throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
        }
        return a.S(new F(q0));
    }

    @d
    @h("none")
    public final K z(Object object0) {
        return this.A(object0, b.d());
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l z0(org.reactivestreams.c c0) {
        b.g(c0, "sources is null");
        return a.P(new e0(c0, H.c(), false, 0x7FFFFFFF, 0x80));
    }

    @d
    @f
    @h("custom")
    public final K z1(J j0) {
        b.g(j0, "scheduler is null");
        return a.S(new X(this, j0));
    }
}

