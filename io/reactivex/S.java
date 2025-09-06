package io.reactivex;

import d3.d;
import d3.e;
import d3.f;
import d3.h;
import e3.g;
import e3.o;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.operators.flowable.e0;
import io.reactivex.internal.operators.maybe.A;
import io.reactivex.internal.operators.maybe.C;
import io.reactivex.internal.operators.maybe.D;
import io.reactivex.internal.operators.maybe.E;
import io.reactivex.internal.operators.maybe.F;
import io.reactivex.internal.operators.maybe.G;
import io.reactivex.internal.operators.maybe.H;
import io.reactivex.internal.operators.maybe.I;
import io.reactivex.internal.operators.maybe.L;
import io.reactivex.internal.operators.maybe.M;
import io.reactivex.internal.operators.maybe.N;
import io.reactivex.internal.operators.maybe.O;
import io.reactivex.internal.operators.maybe.T;
import io.reactivex.internal.operators.maybe.U;
import io.reactivex.internal.operators.maybe.V;
import io.reactivex.internal.operators.maybe.W;
import io.reactivex.internal.operators.maybe.X;
import io.reactivex.internal.operators.maybe.Y;
import io.reactivex.internal.operators.maybe.Z;
import io.reactivex.internal.operators.maybe.a0;
import io.reactivex.internal.operators.maybe.b0;
import io.reactivex.internal.operators.maybe.c0;
import io.reactivex.internal.operators.maybe.d0;
import io.reactivex.internal.operators.maybe.f0;
import io.reactivex.internal.operators.maybe.g0;
import io.reactivex.internal.operators.maybe.h0;
import io.reactivex.internal.operators.maybe.i0;
import io.reactivex.internal.operators.maybe.i;
import io.reactivex.internal.operators.maybe.j0;
import io.reactivex.internal.operators.maybe.j;
import io.reactivex.internal.operators.maybe.k0;
import io.reactivex.internal.operators.maybe.k;
import io.reactivex.internal.operators.maybe.l0;
import io.reactivex.internal.operators.maybe.m0;
import io.reactivex.internal.operators.maybe.m;
import io.reactivex.internal.operators.maybe.n0;
import io.reactivex.internal.operators.maybe.n;
import io.reactivex.internal.operators.maybe.o0;
import io.reactivex.internal.operators.maybe.p0;
import io.reactivex.internal.operators.maybe.p;
import io.reactivex.internal.operators.maybe.q0;
import io.reactivex.internal.operators.maybe.q;
import io.reactivex.internal.operators.maybe.r0;
import io.reactivex.internal.operators.maybe.r;
import io.reactivex.internal.operators.maybe.s0;
import io.reactivex.internal.operators.maybe.t0;
import io.reactivex.internal.operators.maybe.t;
import io.reactivex.internal.operators.maybe.u0;
import io.reactivex.internal.operators.maybe.u;
import io.reactivex.internal.operators.maybe.v0;
import io.reactivex.internal.operators.maybe.x;
import io.reactivex.plugins.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.c;

public abstract class s implements y {
    @d
    @f
    @h("none")
    public final s A(o o0) {
        b.g(o0, "mapper is null");
        return a.Q(new H(this, o0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l A0(y y0, y y1, y y2) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        return s.G0(new y[]{y0, y1, y2});
    }

    @d
    @h("io.reactivex:computation")
    public final s A1(long v, TimeUnit timeUnit0) {
        return this.C1(v, timeUnit0, io.reactivex.schedulers.b.a());
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public final l B(y y0) {
        b.g(y0, "other is null");
        return s.n(this, y0);
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l B0(y y0, y y1, y y2, y y3) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        b.g(y3, "source4 is null");
        return s.G0(new y[]{y0, y1, y2, y3});
    }

    @d
    @f
    @h("io.reactivex:computation")
    public final s B1(long v, TimeUnit timeUnit0, y y0) {
        b.g(y0, "fallback is null");
        return this.D1(v, timeUnit0, io.reactivex.schedulers.b.a(), y0);
    }

    @d
    @f
    @h("none")
    public final K C(Object object0) {
        b.g(object0, "item is null");
        return a.S(new io.reactivex.internal.operators.maybe.h(this, object0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static l C0(Iterable iterable0) {
        return s.D0(l.Z2(iterable0));
    }

    @d
    @h("custom")
    public final s C1(long v, TimeUnit timeUnit0, J j0) {
        return this.E1(s.J1(v, timeUnit0, j0));
    }

    @d
    @h("none")
    public final K D() {
        return a.S(new i(this));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static l D0(c c0) {
        return s.E0(c0, 0x7FFFFFFF);
    }

    @d
    @f
    @h("custom")
    public final s D1(long v, TimeUnit timeUnit0, J j0, y y0) {
        b.g(y0, "fallback is null");
        return this.F1(s.J1(v, timeUnit0, j0), y0);
    }

    @d
    @f
    @h("none")
    public static s E(w w0) {
        b.g(w0, "onSubscribe is null");
        return a.Q(new j(w0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l E0(c c0, int v) {
        b.g(c0, "source is null");
        b.h(v, "maxConcurrency");
        return a.P(new e0(c0, p0.b(), false, v, 1));
    }

    @d
    @f
    @h("none")
    public final s E1(y y0) {
        b.g(y0, "timeoutIndicator is null");
        return a.Q(new k0(this, y0, null));
    }

    @d
    @f
    @h("none")
    public final s F(Object object0) {
        b.g(object0, "defaultItem is null");
        return this.u1(s.v0(object0));
    }

    @d
    @f
    @h("none")
    public static s F0(y y0) {
        b.g(y0, "source is null");
        return a.Q(new H(y0, io.reactivex.internal.functions.a.k()));
    }

    @d
    @f
    @h("none")
    public final s F1(y y0, y y1) {
        b.g(y0, "timeoutIndicator is null");
        b.g(y1, "fallback is null");
        return a.Q(new k0(this, y0, y1));
    }

    @d
    @f
    @h("none")
    public static s G(Callable callable0) {
        b.g(callable0, "maybeSupplier is null");
        return a.Q(new k(callable0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l G0(y[] arr_y) {
        b.g(arr_y, "sources is null");
        if(arr_y.length == 0) {
            return l.m2();
        }
        return arr_y.length == 1 ? a.P(new n0(arr_y[0])) : a.P(new Y(arr_y));
    }

    @d3.b(d3.a.d)
    @d
    @f
    @h("none")
    public final s G1(c c0) {
        b.g(c0, "timeoutIndicator is null");
        return a.Q(new l0(this, c0, null));
    }

    @d
    @h("io.reactivex:computation")
    public final s H(long v, TimeUnit timeUnit0) {
        return this.I(v, timeUnit0, io.reactivex.schedulers.b.a());
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static l H0(y[] arr_y) {
        return arr_y.length == 0 ? l.m2() : l.T2(arr_y).D2(p0.b(), true, arr_y.length);
    }

    @d3.b(d3.a.d)
    @d
    @f
    @h("none")
    public final s H1(c c0, y y0) {
        b.g(c0, "timeoutIndicator is null");
        b.g(y0, "fallback is null");
        return a.Q(new l0(this, c0, y0));
    }

    @d
    @f
    @h("custom")
    public final s I(long v, TimeUnit timeUnit0, J j0) {
        b.g(timeUnit0, "unit is null");
        b.g(j0, "scheduler is null");
        return a.Q(new io.reactivex.internal.operators.maybe.l(this, Math.max(0L, v), timeUnit0, j0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l I0(y y0, y y1) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        return s.H0(new y[]{y0, y1});
    }

    @d
    @h("io.reactivex:computation")
    public static s I1(long v, TimeUnit timeUnit0) {
        return s.J1(v, timeUnit0, io.reactivex.schedulers.b.a());
    }

    @d3.b(d3.a.d)
    @d
    @f
    @h("none")
    public final s J(c c0) {
        b.g(c0, "delayIndicator is null");
        return a.Q(new m(this, c0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l J0(y y0, y y1, y y2) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        return s.H0(new y[]{y0, y1, y2});
    }

    @d
    @f
    @h("custom")
    public static s J1(long v, TimeUnit timeUnit0, J j0) {
        b.g(timeUnit0, "unit is null");
        b.g(j0, "scheduler is null");
        return a.Q(new m0(Math.max(0L, v), timeUnit0, j0));
    }

    @d
    @h("io.reactivex:computation")
    public final s K(long v, TimeUnit timeUnit0) {
        return this.L(v, timeUnit0, io.reactivex.schedulers.b.a());
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l K0(y y0, y y1, y y2, y y3) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        b.g(y3, "source4 is null");
        return s.H0(new y[]{y0, y1, y2, y3});
    }

    @d
    @f
    @h("none")
    public final Object K1(o o0) {
        try {
            return ((o)b.g(o0, "convert is null")).apply(this);
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            throw io.reactivex.internal.util.k.f(throwable0);
        }
    }

    @d
    @h("custom")
    public final s L(long v, TimeUnit timeUnit0, J j0) {
        return this.M(l.x7(v, timeUnit0, j0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static l L0(Iterable iterable0) {
        return l.Z2(iterable0).C2(p0.b(), true);
    }

    // 去混淆评级： 低(20)
    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l L1() {
        return this instanceof f3.b ? ((f3.b)this).d() : a.P(new n0(this));
    }

    @d3.b(d3.a.d)
    @d
    @f
    @h("none")
    public final s M(c c0) {
        b.g(c0, "subscriptionIndicator is null");
        return a.Q(new n(this, c0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static l M0(c c0) {
        return s.N0(c0, 0x7FFFFFFF);
    }

    // 去混淆评级： 低(20)
    @d
    @h("none")
    public final B M1() {
        return this instanceof f3.d ? ((f3.d)this).c() : a.R(new o0(this));
    }

    @d
    @f
    @h("none")
    public final s N(g g0) {
        b.g(g0, "onAfterSuccess is null");
        return a.Q(new q(this, g0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l N0(c c0, int v) {
        b.g(c0, "source is null");
        b.h(v, "maxConcurrency");
        return a.P(new e0(c0, p0.b(), true, v, 1));
    }

    @d
    @h("none")
    public final K N1() {
        return a.S(new q0(this, null));
    }

    @d
    @f
    @h("none")
    public final s O(e3.a a0) {
        Object object0 = b.g(a0, "onAfterTerminate is null");
        return a.Q(new io.reactivex.internal.operators.maybe.e0(this, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, ((e3.a)object0), io.reactivex.internal.functions.a.c));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public final l O0(y y0) {
        b.g(y0, "other is null");
        return s.z0(this, y0);
    }

    @d
    @f
    @h("none")
    public final K O1(Object object0) {
        b.g(object0, "defaultValue is null");
        return a.S(new q0(this, object0));
    }

    @d
    @f
    @h("none")
    public final s P(e3.a a0) {
        b.g(a0, "onFinally is null");
        return a.Q(new r(this, a0));
    }

    @d
    @h("none")
    public static s P0() {
        return a.Q(Z.a);
    }

    @d
    @f
    @h("none")
    public static s P1(y y0) {
        if(y0 instanceof s) {
            throw new IllegalArgumentException("unsafeCreate(Maybe) should be upgraded");
        }
        b.g(y0, "onSubscribe is null");
        return a.Q(new r0(y0));
    }

    @d
    @f
    @h("none")
    public final s Q(e3.a a0) {
        return a.Q(new io.reactivex.internal.operators.maybe.e0(this, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), ((e3.a)b.g(a0, "onComplete is null")), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c));
    }

    @d
    @f
    @h("custom")
    public final s Q0(J j0) {
        b.g(j0, "scheduler is null");
        return a.Q(new a0(this, j0));
    }

    @d
    @f
    @h("custom")
    public final s Q1(J j0) {
        b.g(j0, "scheduler is null");
        return a.Q(new s0(this, j0));
    }

    @d
    @f
    @h("none")
    public final s R(e3.a a0) {
        Object object0 = b.g(a0, "onDispose is null");
        return a.Q(new io.reactivex.internal.operators.maybe.e0(this, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, ((e3.a)object0)));
    }

    @d
    @f
    @h("none")
    public final s R0(Class class0) {
        b.g(class0, "clazz is null");
        return this.a0(io.reactivex.internal.functions.a.l(class0)).l(class0);
    }

    @d
    @h("none")
    public static s R1(Callable callable0, o o0, g g0) {
        return s.S1(callable0, o0, g0, true);
    }

    @d
    @f
    @h("none")
    public final s S(g g0) {
        return a.Q(new io.reactivex.internal.operators.maybe.e0(this, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), ((g)b.g(g0, "onError is null")), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c));
    }

    @d
    @h("none")
    public final s S0() {
        return this.T0(io.reactivex.internal.functions.a.c());
    }

    @d
    @f
    @h("none")
    public static s S1(Callable callable0, o o0, g g0, boolean z) {
        b.g(callable0, "resourceSupplier is null");
        b.g(o0, "sourceSupplier is null");
        b.g(g0, "disposer is null");
        return a.Q(new t0(callable0, o0, g0, z));
    }

    @d
    @h("none")
    public final s T(e3.b b0) {
        b.g(b0, "onEvent is null");
        return a.Q(new io.reactivex.internal.operators.maybe.s(this, b0));
    }

    @d
    @f
    @h("none")
    public final s T0(e3.r r0) {
        b.g(r0, "predicate is null");
        return a.Q(new b0(this, r0));
    }

    @d
    @f
    @h("none")
    public static s T1(y y0) {
        if(y0 instanceof s) {
            return a.Q(((s)y0));
        }
        b.g(y0, "onSubscribe is null");
        return a.Q(new r0(y0));
    }

    @d
    @f
    @h("none")
    public final s U(g g0) {
        return a.Q(new io.reactivex.internal.operators.maybe.e0(this, ((g)b.g(g0, "onSubscribe is null")), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c));
    }

    @d
    @f
    @h("none")
    public final s U0(o o0) {
        b.g(o0, "resumeFunction is null");
        return a.Q(new c0(this, o0, true));
    }

    @d
    @f
    @h("none")
    public static s U1(y y0, y y1, e3.c c0) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        return s.d2(io.reactivex.internal.functions.a.x(c0), new y[]{y0, y1});
    }

    @d
    @f
    @h("none")
    public final s V(g g0) {
        return a.Q(new io.reactivex.internal.operators.maybe.e0(this, io.reactivex.internal.functions.a.h(), ((g)b.g(g0, "onSuccess is null")), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c));
    }

    @d
    @f
    @h("none")
    public final s V0(y y0) {
        b.g(y0, "next is null");
        return this.U0(io.reactivex.internal.functions.a.n(y0));
    }

    @d
    @f
    @h("none")
    public static s V1(y y0, y y1, y y2, e3.h h0) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        return s.d2(io.reactivex.internal.functions.a.y(h0), new y[]{y0, y1, y2});
    }

    @d
    @e
    @f
    @h("none")
    public final s W(e3.a a0) {
        b.g(a0, "onTerminate is null");
        return a.Q(new t(this, a0));
    }

    @d
    @f
    @h("none")
    public final s W0(o o0) {
        b.g(o0, "valueSupplier is null");
        return a.Q(new d0(this, o0));
    }

    @d
    @f
    @h("none")
    public static s W1(y y0, y y1, y y2, y y3, e3.i i0) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        b.g(y3, "source4 is null");
        return s.d2(io.reactivex.internal.functions.a.z(i0), new y[]{y0, y1, y2, y3});
    }

    @d
    @h("none")
    public static s X() {
        return a.Q(u.a);
    }

    @d
    @f
    @h("none")
    public final s X0(Object object0) {
        b.g(object0, "item is null");
        return this.W0(io.reactivex.internal.functions.a.n(object0));
    }

    @d
    @f
    @h("none")
    public static s X1(y y0, y y1, y y2, y y3, y y4, e3.j j0) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        b.g(y3, "source4 is null");
        b.g(y4, "source5 is null");
        return s.d2(io.reactivex.internal.functions.a.A(j0), new y[]{y0, y1, y2, y3, y4});
    }

    @d
    @f
    @h("none")
    public static s Y(Throwable throwable0) {
        b.g(throwable0, "exception is null");
        return a.Q(new io.reactivex.internal.operators.maybe.w(throwable0));
    }

    @d
    @f
    @h("none")
    public final s Y0(y y0) {
        b.g(y0, "next is null");
        return a.Q(new c0(this, io.reactivex.internal.functions.a.n(y0), false));
    }

    @d
    @f
    @h("none")
    public static s Y1(y y0, y y1, y y2, y y3, y y4, y y5, e3.k k0) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        b.g(y3, "source4 is null");
        b.g(y4, "source5 is null");
        b.g(y5, "source6 is null");
        return s.d2(io.reactivex.internal.functions.a.B(k0), new y[]{y0, y1, y2, y3, y4, y5});
    }

    @d
    @f
    @h("none")
    public static s Z(Callable callable0) {
        b.g(callable0, "errorSupplier is null");
        return a.Q(new x(callable0));
    }

    @d
    @h("none")
    public final s Z0() {
        return a.Q(new p(this));
    }

    @d
    @f
    @h("none")
    public static s Z1(y y0, y y1, y y2, y y3, y y4, y y5, y y6, e3.l l0) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        b.g(y3, "source4 is null");
        b.g(y4, "source5 is null");
        b.g(y5, "source6 is null");
        b.g(y6, "source7 is null");
        return s.d2(io.reactivex.internal.functions.a.C(l0), new y[]{y0, y1, y2, y3, y4, y5, y6});
    }

    @Override  // io.reactivex.y
    @h("none")
    public final void a(v v0) {
        b.g(v0, "observer is null");
        v v1 = a.e0(this, v0);
        b.g(v1, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            this.r1(v1);
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
    public final s a0(e3.r r0) {
        b.g(r0, "predicate is null");
        return a.Q(new io.reactivex.internal.operators.maybe.y(this, r0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l a1() {
        return this.b1(0x7FFFFFFFFFFFFFFFL);
    }

    @d
    @f
    @h("none")
    public static s a2(y y0, y y1, y y2, y y3, y y4, y y5, y y6, y y7, e3.m m0) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        b.g(y3, "source4 is null");
        b.g(y4, "source5 is null");
        b.g(y5, "source6 is null");
        b.g(y6, "source7 is null");
        b.g(y7, "source8 is null");
        return s.d2(io.reactivex.internal.functions.a.D(m0), new y[]{y0, y1, y2, y3, y4, y5, y6, y7});
    }

    @d
    @f
    @h("none")
    public final s b0(o o0) {
        b.g(o0, "mapper is null");
        return a.Q(new H(this, o0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l b1(long v) {
        return this.L1().W4(v);
    }

    @d
    @f
    @h("none")
    public static s b2(y y0, y y1, y y2, y y3, y y4, y y5, y y6, y y7, y y8, e3.n n0) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        b.g(y3, "source4 is null");
        b.g(y4, "source5 is null");
        b.g(y5, "source6 is null");
        b.g(y6, "source7 is null");
        b.g(y7, "source8 is null");
        b.g(y8, "source9 is null");
        return s.d2(io.reactivex.internal.functions.a.E(n0), new y[]{y0, y1, y2, y3, y4, y5, y6, y7, y8});
    }

    @d
    @f
    @h("none")
    public final s c0(o o0, e3.c c0) {
        b.g(o0, "mapper is null");
        b.g(c0, "resultSelector is null");
        return a.Q(new A(this, o0, c0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l c1(e3.e e0) {
        return this.L1().X4(e0);
    }

    @d
    @f
    @h("none")
    public static s c2(Iterable iterable0, o o0) {
        b.g(o0, "zipper is null");
        b.g(iterable0, "sources is null");
        return a.Q(new v0(iterable0, o0));
    }

    @d
    @f
    @h("none")
    public final s d0(o o0, o o1, Callable callable0) {
        b.g(o0, "onSuccessMapper is null");
        b.g(o1, "onErrorMapper is null");
        b.g(callable0, "onCompleteSupplier is null");
        return a.Q(new E(this, o0, o1, callable0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l d1(o o0) {
        return this.L1().Y4(o0);
    }

    @d
    @f
    @h("none")
    public static s d2(o o0, y[] arr_y) {
        b.g(arr_y, "sources is null");
        if(arr_y.length == 0) {
            return s.X();
        }
        b.g(o0, "zipper is null");
        return a.Q(new u0(arr_y, o0));
    }

    @d
    @f
    @h("none")
    public static s e(Iterable iterable0) {
        b.g(iterable0, "sources is null");
        return a.Q(new io.reactivex.internal.operators.maybe.b(null, iterable0));
    }

    @d
    @f
    @h("none")
    public final io.reactivex.c e0(o o0) {
        b.g(o0, "mapper is null");
        return a.O(new io.reactivex.internal.operators.maybe.B(this, o0));
    }

    @d
    @h("none")
    public final s e1() {
        return this.g1(0x7FFFFFFFFFFFFFFFL, io.reactivex.internal.functions.a.c());
    }

    @d
    @f
    @h("none")
    public final s e2(y y0, e3.c c0) {
        b.g(y0, "other is null");
        return s.U1(this, y0, c0);
    }

    @d
    @h("none")
    public static s f(y[] arr_y) {
        switch(arr_y.length) {
            case 0: {
                return s.X();
            }
            case 1: {
                return s.T1(arr_y[0]);
            }
            default: {
                return a.Q(new io.reactivex.internal.operators.maybe.b(arr_y, null));
            }
        }
    }

    @d
    @f
    @h("none")
    public final B f0(o o0) {
        b.g(o0, "mapper is null");
        return a.R(new io.reactivex.internal.operators.mixed.j(this, o0));
    }

    @d
    @h("none")
    public final s f1(long v) {
        return this.g1(v, io.reactivex.internal.functions.a.c());
    }

    @d
    @f
    @h("none")
    public final s g(y y0) {
        b.g(y0, "other is null");
        return s.f(new y[]{this, y0});
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public final l g0(o o0) {
        b.g(o0, "mapper is null");
        return a.P(new io.reactivex.internal.operators.mixed.k(this, o0));
    }

    @d
    @h("none")
    public final s g1(long v, e3.r r0) {
        return this.L1().r5(v, r0).N5();
    }

    @d
    @h("none")
    public final Object h(@f io.reactivex.t t0) {
        return ((io.reactivex.t)b.g(t0, "converter is null")).a(this);
    }

    @d
    @f
    @h("none")
    public final K h0(o o0) {
        b.g(o0, "mapper is null");
        return a.S(new F(this, o0));
    }

    @d
    @h("none")
    public final s h1(e3.d d0) {
        return this.L1().s5(d0).N5();
    }

    @d
    @h("none")
    public final Object i() {
        io.reactivex.internal.observers.h h0 = new io.reactivex.internal.observers.h();
        this.a(h0);
        return h0.c();
    }

    @d
    @f
    @h("none")
    public final s i0(o o0) {
        b.g(o0, "mapper is null");
        return a.Q(new G(this, o0));
    }

    @d
    @h("none")
    public final s i1(e3.r r0) {
        return this.g1(0x7FFFFFFFFFFFFFFFL, r0);
    }

    @d
    @h("none")
    public final Object j(Object object0) {
        b.g(object0, "defaultValue is null");
        io.reactivex.internal.observers.h h0 = new io.reactivex.internal.observers.h();
        this.a(h0);
        return h0.d(object0);
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public final l j0(o o0) {
        b.g(o0, "mapper is null");
        return a.P(new C(this, o0));
    }

    @d
    @f
    @h("none")
    public final s j1(e3.e e0) {
        b.g(e0, "stop is null");
        return this.g1(0x7FFFFFFFFFFFFFFFL, io.reactivex.internal.functions.a.v(e0));
    }

    @d
    @h("none")
    public final s k() {
        return a.Q(new io.reactivex.internal.operators.maybe.c(this));
    }

    @d
    @f
    @h("none")
    public final B k0(o o0) {
        b.g(o0, "mapper is null");
        return a.R(new D(this, o0));
    }

    @d
    @h("none")
    public final s k1(o o0) {
        return this.L1().v5(o0).N5();
    }

    @d
    @f
    @h("none")
    public final s l(Class class0) {
        b.g(class0, "clazz is null");
        return this.x0(io.reactivex.internal.functions.a.e(class0));
    }

    @d
    @f
    @h("none")
    public static s l0(e3.a a0) {
        b.g(a0, "run is null");
        return a.Q(new I(a0));
    }

    @d
    @h("none")
    public static K l1(y y0, y y1) {
        return s.m1(y0, y1, b.d());
    }

    @d
    @h("none")
    public final s m(z z0) {
        return s.T1(((z)b.g(z0, "transformer is null")).a(this));
    }

    @d
    @f
    @h("none")
    public static s m0(@f Callable callable0) {
        b.g(callable0, "callable is null");
        return a.Q(new io.reactivex.internal.operators.maybe.J(callable0));
    }

    @d
    @f
    @h("none")
    public static K m1(y y0, y y1, e3.d d0) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(d0, "isEqual is null");
        return a.S(new io.reactivex.internal.operators.maybe.v(y0, y1, d0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l n(y y0, y y1) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        return s.t(new y[]{y0, y1});
    }

    @d
    @f
    @h("none")
    public static s n0(io.reactivex.i i0) {
        b.g(i0, "completableSource is null");
        return a.Q(new io.reactivex.internal.operators.maybe.K(i0));
    }

    @h("none")
    public final io.reactivex.disposables.c n1() {
        return this.q1(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f, io.reactivex.internal.functions.a.c);
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l o(y y0, y y1, y y2) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        return s.t(new y[]{y0, y1, y2});
    }

    @d
    @f
    @h("none")
    public static s o0(Future future0) {
        b.g(future0, "future is null");
        return a.Q(new L(future0, 0L, null));
    }

    @d
    @h("none")
    public final io.reactivex.disposables.c o1(g g0) {
        return this.q1(g0, io.reactivex.internal.functions.a.f, io.reactivex.internal.functions.a.c);
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l p(y y0, y y1, y y2, y y3) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        b.g(y2, "source3 is null");
        b.g(y3, "source4 is null");
        return s.t(new y[]{y0, y1, y2, y3});
    }

    @d
    @f
    @h("none")
    public static s p0(Future future0, long v, TimeUnit timeUnit0) {
        b.g(future0, "future is null");
        b.g(timeUnit0, "unit is null");
        return a.Q(new L(future0, v, timeUnit0));
    }

    @d
    @h("none")
    public final io.reactivex.disposables.c p1(g g0, g g1) {
        return this.q1(g0, g1, io.reactivex.internal.functions.a.c);
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l q(Iterable iterable0) {
        b.g(iterable0, "sources is null");
        return a.P(new io.reactivex.internal.operators.maybe.g(iterable0));
    }

    @d
    @f
    @h("none")
    public static s q0(Runnable runnable0) {
        b.g(runnable0, "run is null");
        return a.Q(new M(runnable0));
    }

    @d
    @f
    @h("none")
    public final io.reactivex.disposables.c q1(g g0, g g1, e3.a a0) {
        b.g(g0, "onSuccess is null");
        b.g(g1, "onError is null");
        b.g(a0, "onComplete is null");
        return (io.reactivex.disposables.c)this.t1(new io.reactivex.internal.operators.maybe.d(g0, g1, a0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static l r(c c0) {
        return s.s(c0, 2);
    }

    @d
    @f
    @h("none")
    public static s r0(Q q0) {
        b.g(q0, "singleSource is null");
        return a.Q(new N(q0));
    }

    protected abstract void r1(v arg1);

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l s(c c0, int v) {
        b.g(c0, "sources is null");
        b.h(v, "prefetch");
        return a.P(new io.reactivex.internal.operators.flowable.z(c0, p0.b(), v, io.reactivex.internal.util.j.a));
    }

    @d
    @h("none")
    public final s s0() {
        return a.Q(new O(this));
    }

    @d
    @f
    @h("custom")
    public final s s1(J j0) {
        b.g(j0, "scheduler is null");
        return a.Q(new f0(this, j0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l t(y[] arr_y) {
        b.g(arr_y, "sources is null");
        if(arr_y.length == 0) {
            return l.m2();
        }
        return arr_y.length == 1 ? a.P(new n0(arr_y[0])) : a.P(new io.reactivex.internal.operators.maybe.e(arr_y));
    }

    @d
    @h("none")
    public final io.reactivex.c t0() {
        return a.O(new io.reactivex.internal.operators.maybe.Q(this));
    }

    @d
    @h("none")
    public final v t1(v v0) {
        this.a(v0);
        return v0;
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static l u(y[] arr_y) {
        switch(arr_y.length) {
            case 0: {
                return l.m2();
            }
            case 1: {
                return a.P(new n0(arr_y[0]));
            }
            default: {
                return a.P(new io.reactivex.internal.operators.maybe.f(arr_y));
            }
        }
    }

    @d
    @h("none")
    public final K u0() {
        return a.S(new T(this));
    }

    @d
    @f
    @h("none")
    public final s u1(y y0) {
        b.g(y0, "other is null");
        return a.Q(new g0(this, y0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static l v(y[] arr_y) {
        return l.T2(arr_y).c1(p0.b());
    }

    @d
    @f
    @h("none")
    public static s v0(Object object0) {
        b.g(object0, "item is null");
        return a.Q(new U(object0));
    }

    @d
    @f
    @h("none")
    public final K v1(Q q0) {
        b.g(q0, "other is null");
        return a.S(new h0(this, q0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l w(Iterable iterable0) {
        b.g(iterable0, "sources is null");
        return l.Z2(iterable0).a1(p0.b());
    }

    @d
    @f
    @h("none")
    public final s w0(io.reactivex.x x0) {
        b.g(x0, "lift is null");
        return a.Q(new V(this, x0));
    }

    @d
    @f
    @h("none")
    public final s w1(y y0) {
        b.g(y0, "other is null");
        return a.Q(new i0(this, y0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static l x(c c0) {
        return l.a3(c0).a1(p0.b());
    }

    @d
    @f
    @h("none")
    public final s x0(o o0) {
        b.g(o0, "mapper is null");
        return a.Q(new W(this, o0));
    }

    @d3.b(d3.a.d)
    @d
    @f
    @h("none")
    public final s x1(c c0) {
        b.g(c0, "other is null");
        return a.Q(new j0(this, c0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static l y(Iterable iterable0) {
        return l.Z2(iterable0).c1(p0.b());
    }

    @d
    @e
    @h("none")
    public final K y0() {
        return a.S(new X(this));
    }

    @d
    @h("none")
    public final io.reactivex.observers.n y1() {
        io.reactivex.observers.n n0 = new io.reactivex.observers.n();
        this.a(n0);
        return n0;
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static l z(c c0) {
        return l.a3(c0).c1(p0.b());
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static l z0(y y0, y y1) {
        b.g(y0, "source1 is null");
        b.g(y1, "source2 is null");
        return s.G0(new y[]{y0, y1});
    }

    @d
    @h("none")
    public final io.reactivex.observers.n z1(boolean z) {
        io.reactivex.observers.n n0 = new io.reactivex.observers.n();
        if(z) {
            n0.cancel();
        }
        this.a(n0);
        return n0;
    }
}

