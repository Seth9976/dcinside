package io.reactivex;

import d3.d;
import d3.e;
import d3.f;
import d3.h;
import e3.o;
import e3.r;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.observers.j;
import io.reactivex.internal.operators.completable.A;
import io.reactivex.internal.operators.completable.C;
import io.reactivex.internal.operators.completable.D;
import io.reactivex.internal.operators.completable.E;
import io.reactivex.internal.operators.completable.F;
import io.reactivex.internal.operators.completable.H;
import io.reactivex.internal.operators.completable.I;
import io.reactivex.internal.operators.completable.K;
import io.reactivex.internal.operators.completable.L;
import io.reactivex.internal.operators.completable.M;
import io.reactivex.internal.operators.completable.N;
import io.reactivex.internal.operators.completable.O;
import io.reactivex.internal.operators.completable.P;
import io.reactivex.internal.operators.completable.S;
import io.reactivex.internal.operators.completable.m;
import io.reactivex.internal.operators.completable.p;
import io.reactivex.internal.operators.completable.q;
import io.reactivex.internal.operators.completable.s;
import io.reactivex.internal.operators.completable.t;
import io.reactivex.internal.operators.completable.u;
import io.reactivex.internal.operators.completable.v;
import io.reactivex.internal.operators.completable.w;
import io.reactivex.internal.operators.completable.x;
import io.reactivex.internal.operators.completable.z;
import io.reactivex.internal.operators.maybe.Q;
import io.reactivex.internal.util.k;
import io.reactivex.observers.n;
import io.reactivex.plugins.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class c implements i {
    @d
    @f
    @h("none")
    public static c A(g g0) {
        b.g(g0, "source is null");
        return a.O(new io.reactivex.internal.operators.completable.g(g0));
    }

    @d
    @h("none")
    public final c A0(e3.d d0) {
        return c.X(this.X0().s5(d0));
    }

    @d
    @f
    @h("none")
    public static c B(Callable callable0) {
        b.g(callable0, "completableSupplier");
        return a.O(new io.reactivex.internal.operators.completable.h(callable0));
    }

    @d
    @h("none")
    public final c B0(r r0) {
        return c.X(this.X0().t5(r0));
    }

    @d
    @h("io.reactivex:computation")
    public final c C(long v, TimeUnit timeUnit0) {
        return this.E(v, timeUnit0, io.reactivex.schedulers.b.a(), false);
    }

    @d
    @h("none")
    public final c C0(o o0) {
        return c.X(this.X0().v5(o0));
    }

    @d
    @h("custom")
    public final c D(long v, TimeUnit timeUnit0, J j0) {
        return this.E(v, timeUnit0, j0, false);
    }

    @d
    @f
    @h("none")
    public final c D0(i i0) {
        b.g(i0, "other is null");
        return c.y(new i[]{i0, this});
    }

    @d
    @f
    @h("custom")
    public final c E(long v, TimeUnit timeUnit0, J j0, boolean z) {
        b.g(timeUnit0, "unit is null");
        b.g(j0, "scheduler is null");
        return a.O(new io.reactivex.internal.operators.completable.i(this, v, timeUnit0, j0, z));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public final l E0(org.reactivestreams.c c0) {
        b.g(c0, "other is null");
        return this.X0().e6(c0);
    }

    @d
    @e
    @h("io.reactivex:computation")
    public final c F(long v, TimeUnit timeUnit0) {
        return this.G(v, timeUnit0, io.reactivex.schedulers.b.a());
    }

    @d
    @f
    @h("none")
    public final B F0(B b0) {
        b.g(b0, "other is null");
        return b0.n1(this.a1());
    }

    @d
    @e
    @h("custom")
    public final c G(long v, TimeUnit timeUnit0, J j0) {
        return c.V0(v, timeUnit0, j0).i(this);
    }

    @h("none")
    public final io.reactivex.disposables.c G0() {
        io.reactivex.disposables.c c0 = new io.reactivex.internal.observers.o();
        this.e(((io.reactivex.f)c0));
        return c0;
    }

    @d
    @h("none")
    public final c H(e3.a a0) {
        return this.N(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, a0, io.reactivex.internal.functions.a.c);
    }

    @d
    @f
    @h("none")
    public final io.reactivex.disposables.c H0(e3.a a0) {
        b.g(a0, "onComplete is null");
        io.reactivex.disposables.c c0 = new j(a0);
        this.e(((io.reactivex.f)c0));
        return c0;
    }

    @d
    @f
    @h("none")
    public final c I(e3.a a0) {
        b.g(a0, "onFinally is null");
        return a.O(new io.reactivex.internal.operators.completable.l(this, a0));
    }

    @d
    @f
    @h("none")
    public final io.reactivex.disposables.c I0(e3.a a0, e3.g g0) {
        b.g(g0, "onError is null");
        b.g(a0, "onComplete is null");
        io.reactivex.disposables.c c0 = new j(g0, a0);
        this.e(((io.reactivex.f)c0));
        return c0;
    }

    @d
    @h("none")
    public final c J(e3.a a0) {
        return this.N(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), a0, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c);
    }

    protected abstract void J0(io.reactivex.f arg1);

    @d
    @h("none")
    public final c K(e3.a a0) {
        return this.N(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, a0);
    }

    @d
    @f
    @h("custom")
    public final c K0(J j0) {
        b.g(j0, "scheduler is null");
        return a.O(new K(this, j0));
    }

    @d
    @h("none")
    public final c L(e3.g g0) {
        return this.N(io.reactivex.internal.functions.a.h(), g0, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c);
    }

    @d
    @h("none")
    public final io.reactivex.f L0(io.reactivex.f f0) {
        this.e(f0);
        return f0;
    }

    @d
    @f
    @h("none")
    public final c M(e3.g g0) {
        b.g(g0, "onEvent is null");
        return a.O(new m(this, g0));
    }

    @d
    @f
    @h("none")
    public final c M0(i i0) {
        b.g(i0, "other is null");
        return a.O(new L(this, i0));
    }

    @d
    @f
    @h("none")
    private c N(e3.g g0, e3.g g1, e3.a a0, e3.a a1, e3.a a2, e3.a a3) {
        b.g(g0, "onSubscribe is null");
        b.g(g1, "onError is null");
        b.g(a0, "onComplete is null");
        b.g(a1, "onTerminate is null");
        b.g(a2, "onAfterTerminate is null");
        b.g(a3, "onDispose is null");
        return a.O(new I(this, g0, g1, a0, a1, a2, a3));
    }

    @d
    @h("none")
    public final n N0() {
        n n0 = new n();
        this.e(n0);
        return n0;
    }

    @d
    @h("none")
    public final c O(e3.g g0) {
        return this.N(g0, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c);
    }

    @d
    @h("none")
    public final n O0(boolean z) {
        n n0 = new n();
        if(z) {
            n0.cancel();
        }
        this.e(n0);
        return n0;
    }

    @d
    @h("none")
    public final c P(e3.a a0) {
        return this.N(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, a0, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c);
    }

    @d
    @h("io.reactivex:computation")
    public final c P0(long v, TimeUnit timeUnit0) {
        return this.T0(v, timeUnit0, io.reactivex.schedulers.b.a(), null);
    }

    @d
    @f
    @h("none")
    public static c Q(Throwable throwable0) {
        b.g(throwable0, "error is null");
        return a.O(new io.reactivex.internal.operators.completable.o(throwable0));
    }

    @d
    @f
    @h("io.reactivex:computation")
    public final c Q0(long v, TimeUnit timeUnit0, i i0) {
        b.g(i0, "other is null");
        return this.T0(v, timeUnit0, io.reactivex.schedulers.b.a(), i0);
    }

    @d
    @f
    @h("none")
    public static c R(Callable callable0) {
        b.g(callable0, "errorSupplier is null");
        return a.O(new p(callable0));
    }

    @d
    @h("custom")
    public final c R0(long v, TimeUnit timeUnit0, J j0) {
        return this.T0(v, timeUnit0, j0, null);
    }

    @d
    @f
    @h("none")
    public static c S(e3.a a0) {
        b.g(a0, "run is null");
        return a.O(new q(a0));
    }

    @d
    @f
    @h("custom")
    public final c S0(long v, TimeUnit timeUnit0, J j0, i i0) {
        b.g(i0, "other is null");
        return this.T0(v, timeUnit0, j0, i0);
    }

    @d
    @f
    @h("none")
    public static c T(Callable callable0) {
        b.g(callable0, "callable is null");
        return a.O(new io.reactivex.internal.operators.completable.r(callable0));
    }

    @d
    @f
    @h("custom")
    private c T0(long v, TimeUnit timeUnit0, J j0, i i0) {
        b.g(timeUnit0, "unit is null");
        b.g(j0, "scheduler is null");
        return a.O(new M(this, v, timeUnit0, j0, i0));
    }

    @d
    @f
    @h("none")
    public static c U(Future future0) {
        b.g(future0, "future is null");
        return c.S(io.reactivex.internal.functions.a.j(future0));
    }

    @d
    @h("io.reactivex:computation")
    public static c U0(long v, TimeUnit timeUnit0) {
        return c.V0(v, timeUnit0, io.reactivex.schedulers.b.a());
    }

    @d
    @f
    @h("none")
    public static c V(y y0) {
        b.g(y0, "maybe is null");
        return a.O(new Q(y0));
    }

    @d
    @f
    @h("custom")
    public static c V0(long v, TimeUnit timeUnit0, J j0) {
        b.g(timeUnit0, "unit is null");
        b.g(j0, "scheduler is null");
        return a.O(new N(v, timeUnit0, j0));
    }

    @d
    @f
    @h("none")
    public static c W(G g0) {
        b.g(g0, "observable is null");
        return a.O(new s(g0));
    }

    @d
    @h("none")
    public final Object W0(o o0) {
        try {
            return ((o)b.g(o0, "converter is null")).apply(this);
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            throw k.f(throwable0);
        }
    }

    @d3.b(d3.a.d)
    @d
    @f
    @h("none")
    public static c X(org.reactivestreams.c c0) {
        b.g(c0, "publisher is null");
        return a.O(new t(c0));
    }

    // 去混淆评级： 低(20)
    @d3.b(d3.a.b)
    @d
    @h("none")
    public final l X0() {
        return this instanceof f3.b ? ((f3.b)this).d() : a.P(new O(this));
    }

    @d
    @f
    @h("none")
    public static c Y(Runnable runnable0) {
        b.g(runnable0, "run is null");
        return a.O(new u(runnable0));
    }

    // 去混淆评级： 低(20)
    @d
    @h("none")
    public final io.reactivex.s Y0() {
        return this instanceof f3.c ? ((f3.c)this).a() : a.Q(new io.reactivex.internal.operators.maybe.K(this));
    }

    @d
    @f
    @h("none")
    public static c Z(io.reactivex.Q q0) {
        b.g(q0, "single is null");
        return a.O(new v(q0));
    }

    private static NullPointerException Z0(Throwable throwable0) {
        NullPointerException nullPointerException0 = new NullPointerException("Actually not, but can\'t pass out an exception otherwise...");
        nullPointerException0.initCause(throwable0);
        return nullPointerException0;
    }

    @d
    @h("none")
    public final c a0() {
        return a.O(new x(this));
    }

    // 去混淆评级： 低(20)
    @d
    @h("none")
    public final B a1() {
        return this instanceof f3.d ? ((f3.d)this).c() : a.R(new P(this));
    }

    @d
    @f
    @h("none")
    public final c b0(io.reactivex.h h0) {
        b.g(h0, "onLift is null");
        return a.O(new io.reactivex.internal.operators.completable.y(this, h0));
    }

    @d
    @f
    @h("none")
    public final io.reactivex.K b1(Callable callable0) {
        b.g(callable0, "completionValueSupplier is null");
        return a.S(new io.reactivex.internal.operators.completable.Q(this, callable0, null));
    }

    @d
    @e
    @h("none")
    public final io.reactivex.K c0() {
        return a.S(new z(this));
    }

    @d
    @f
    @h("none")
    public final io.reactivex.K c1(Object object0) {
        b.g(object0, "completionValue is null");
        return a.S(new io.reactivex.internal.operators.completable.Q(this, null, object0));
    }

    @d
    @f
    @h("none")
    public static c d0(Iterable iterable0) {
        b.g(iterable0, "sources is null");
        return a.O(new E(iterable0));
    }

    @d
    @f
    @h("none")
    public static c d1(i i0) {
        b.g(i0, "source is null");
        if(i0 instanceof c) {
            throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
        }
        return a.O(new w(i0));
    }

    @Override  // io.reactivex.i
    @h("none")
    public final void e(io.reactivex.f f0) {
        b.g(f0, "observer is null");
        try {
            io.reactivex.f f1 = a.d0(this, f0);
            b.g(f1, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.J0(f1);
        }
        catch(NullPointerException nullPointerException0) {
            throw nullPointerException0;
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            a.Y(throwable0);
            throw c.Z0(throwable0);
        }
    }

    @d3.b(d3.a.d)
    @d
    @h("none")
    public static c e0(org.reactivestreams.c c0) {
        return c.g0(c0, 0x7FFFFFFF, false);
    }

    @d
    @f
    @h("custom")
    public final c e1(J j0) {
        b.g(j0, "scheduler is null");
        return a.O(new io.reactivex.internal.operators.completable.k(this, j0));
    }

    @d
    @f
    @h("none")
    public static c f(Iterable iterable0) {
        b.g(iterable0, "sources is null");
        return a.O(new io.reactivex.internal.operators.completable.a(null, iterable0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static c f0(org.reactivestreams.c c0, int v) {
        return c.g0(c0, v, false);
    }

    @d
    @h("none")
    public static c f1(Callable callable0, o o0, e3.g g0) {
        return c.g1(callable0, o0, g0, true);
    }

    @d
    @f
    @h("none")
    public static c g(i[] arr_i) {
        b.g(arr_i, "sources is null");
        if(arr_i.length == 0) {
            return c.t();
        }
        return arr_i.length == 1 ? c.h1(arr_i[0]) : a.O(new io.reactivex.internal.operators.completable.a(arr_i, null));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    private static c g0(org.reactivestreams.c c0, int v, boolean z) {
        b.g(c0, "sources is null");
        b.h(v, "maxConcurrency");
        return a.O(new A(c0, v, z));
    }

    @d
    @f
    @h("none")
    public static c g1(Callable callable0, o o0, e3.g g0, boolean z) {
        b.g(callable0, "resourceSupplier is null");
        b.g(o0, "completableFunction is null");
        b.g(g0, "disposer is null");
        return a.O(new S(callable0, o0, g0, z));
    }

    @d
    @f
    @h("none")
    public final c h(i i0) {
        b.g(i0, "other is null");
        return c.g(new i[]{this, i0});
    }

    @d
    @f
    @h("none")
    public static c h0(i[] arr_i) {
        b.g(arr_i, "sources is null");
        if(arr_i.length == 0) {
            return c.t();
        }
        return arr_i.length == 1 ? c.h1(arr_i[0]) : a.O(new io.reactivex.internal.operators.completable.B(arr_i));
    }

    @d
    @f
    @h("none")
    public static c h1(i i0) {
        b.g(i0, "source is null");
        return i0 instanceof c ? a.O(((c)i0)) : a.O(new w(i0));
    }

    @d
    @h("none")
    public final c i(i i0) {
        b.g(i0, "next is null");
        return a.O(new io.reactivex.internal.operators.completable.b(this, i0));
    }

    @d
    @f
    @h("none")
    public static c i0(i[] arr_i) {
        b.g(arr_i, "sources is null");
        return a.O(new C(arr_i));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public final l j(org.reactivestreams.c c0) {
        b.g(c0, "next is null");
        return a.P(new io.reactivex.internal.operators.mixed.b(this, c0));
    }

    @d
    @f
    @h("none")
    public static c j0(Iterable iterable0) {
        b.g(iterable0, "sources is null");
        return a.O(new D(iterable0));
    }

    @d
    @f
    @h("none")
    public final io.reactivex.s k(y y0) {
        b.g(y0, "next is null");
        return a.Q(new io.reactivex.internal.operators.maybe.o(y0, this));
    }

    @d3.b(d3.a.d)
    @d
    @h("none")
    public static c k0(org.reactivestreams.c c0) {
        return c.g0(c0, 0x7FFFFFFF, true);
    }

    @d
    @f
    @h("none")
    public final B l(G g0) {
        b.g(g0, "next is null");
        return a.R(new io.reactivex.internal.operators.mixed.a(this, g0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static c l0(org.reactivestreams.c c0, int v) {
        return c.g0(c0, v, true);
    }

    @d
    @f
    @h("none")
    public final io.reactivex.K m(io.reactivex.Q q0) {
        b.g(q0, "next is null");
        return a.S(new io.reactivex.internal.operators.single.g(q0, this));
    }

    @d
    @f
    @h("none")
    public final c m0(i i0) {
        b.g(i0, "other is null");
        return c.h0(new i[]{this, i0});
    }

    @d
    @h("none")
    public final Object n(@f io.reactivex.d d0) {
        return ((io.reactivex.d)b.g(d0, "converter is null")).a(this);
    }

    @d
    @h("none")
    public static c n0() {
        return a.O(F.a);
    }

    @h("none")
    public final void o() {
        io.reactivex.internal.observers.h h0 = new io.reactivex.internal.observers.h();
        this.e(h0);
        h0.c();
    }

    @d
    @f
    @h("custom")
    public final c o0(J j0) {
        b.g(j0, "scheduler is null");
        return a.O(new io.reactivex.internal.operators.completable.G(this, j0));
    }

    @d
    @f
    @h("none")
    public final boolean p(long v, TimeUnit timeUnit0) {
        b.g(timeUnit0, "unit is null");
        io.reactivex.internal.observers.h h0 = new io.reactivex.internal.observers.h();
        this.e(h0);
        return h0.a(v, timeUnit0);
    }

    @d
    @h("none")
    public final c p0() {
        return this.q0(io.reactivex.internal.functions.a.c());
    }

    @d
    @d3.g
    @h("none")
    public final Throwable q() {
        io.reactivex.internal.observers.h h0 = new io.reactivex.internal.observers.h();
        this.e(h0);
        return h0.e();
    }

    @d
    @f
    @h("none")
    public final c q0(r r0) {
        b.g(r0, "predicate is null");
        return a.O(new H(this, r0));
    }

    @d
    @d3.g
    @h("none")
    public final Throwable r(long v, TimeUnit timeUnit0) {
        b.g(timeUnit0, "unit is null");
        io.reactivex.internal.observers.h h0 = new io.reactivex.internal.observers.h();
        this.e(h0);
        return h0.f(v, timeUnit0);
    }

    @d
    @f
    @h("none")
    public final c r0(o o0) {
        b.g(o0, "errorMapper is null");
        return a.O(new io.reactivex.internal.operators.completable.J(this, o0));
    }

    @d
    @h("none")
    public final c s() {
        return a.O(new io.reactivex.internal.operators.completable.c(this));
    }

    @d
    @h("none")
    public final c s0() {
        return a.O(new io.reactivex.internal.operators.completable.j(this));
    }

    @d
    @f
    @h("none")
    public static c t() {
        return a.O(io.reactivex.internal.operators.completable.n.a);
    }

    @d
    @h("none")
    public final c t0() {
        return c.X(this.X0().V4());
    }

    @d
    @h("none")
    public final c u(io.reactivex.j j0) {
        return c.h1(((io.reactivex.j)b.g(j0, "transformer is null")).a(this));
    }

    @d
    @h("none")
    public final c u0(long v) {
        return c.X(this.X0().W4(v));
    }

    @d
    @f
    @h("none")
    public static c v(Iterable iterable0) {
        b.g(iterable0, "sources is null");
        return a.O(new io.reactivex.internal.operators.completable.f(iterable0));
    }

    @d
    @h("none")
    public final c v0(e3.e e0) {
        return c.X(this.X0().X4(e0));
    }

    @d3.b(d3.a.b)
    @d
    @h("none")
    public static c w(org.reactivestreams.c c0) {
        return c.x(c0, 2);
    }

    @d
    @h("none")
    public final c w0(o o0) {
        return c.X(this.X0().Y4(o0));
    }

    @d3.b(d3.a.b)
    @d
    @f
    @h("none")
    public static c x(org.reactivestreams.c c0, int v) {
        b.g(c0, "sources is null");
        b.h(v, "prefetch");
        return a.O(new io.reactivex.internal.operators.completable.d(c0, v));
    }

    @d
    @h("none")
    public final c x0() {
        return c.X(this.X0().p5());
    }

    @d
    @f
    @h("none")
    public static c y(i[] arr_i) {
        b.g(arr_i, "sources is null");
        if(arr_i.length == 0) {
            return c.t();
        }
        return arr_i.length == 1 ? c.h1(arr_i[0]) : a.O(new io.reactivex.internal.operators.completable.e(arr_i));
    }

    @d
    @h("none")
    public final c y0(long v) {
        return c.X(this.X0().q5(v));
    }

    @d
    @f
    @h("none")
    public final c z(i i0) {
        b.g(i0, "other is null");
        return a.O(new io.reactivex.internal.operators.completable.b(this, i0));
    }

    @d
    @h("none")
    public final c z0(long v, r r0) {
        return c.X(this.X0().r5(v, r0));
    }
}

