package io.reactivex.plugins;

import d3.f;
import d3.g;
import e3.c;
import e3.e;
import e3.o;
import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.J;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.exceptions.d;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.schedulers.h;
import io.reactivex.internal.schedulers.r;
import io.reactivex.internal.util.k;
import io.reactivex.l;
import io.reactivex.s;
import io.reactivex.v;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;

public final class a {
    @g
    static volatile e3.g a;
    @g
    static volatile o b;
    @g
    static volatile o c;
    @g
    static volatile o d;
    @g
    static volatile o e;
    @g
    static volatile o f;
    @g
    static volatile o g;
    @g
    static volatile o h;
    @g
    static volatile o i;
    @g
    static volatile o j;
    @g
    static volatile o k;
    @g
    static volatile o l;
    @g
    static volatile o m;
    @g
    static volatile o n;
    @g
    static volatile o o;
    @g
    static volatile o p;
    @g
    static volatile o q;
    @g
    static volatile o r;
    @g
    static volatile c s;
    @g
    static volatile c t;
    @g
    static volatile c u;
    @g
    static volatile c v;
    @g
    static volatile c w;
    @g
    static volatile e x;
    static volatile boolean y;
    static volatile boolean z;

    private a() {
        throw new IllegalStateException("No instances!");
    }

    @g
    public static c A() {
        return a.u;
    }

    public static void A0(@g c c0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.t = c0;
    }

    @g
    public static o B() {
        return a.r;
    }

    public static void B0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.m = o0;
    }

    @g
    public static o C() {
        return a.p;
    }

    public static void C0(@g c c0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.u = c0;
    }

    @g
    public static c D() {
        return a.v;
    }

    public static void D0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.r = o0;
    }

    @g
    public static o E() {
        return a.b;
    }

    public static void E0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.p = o0;
    }

    @g
    public static o F() {
        return a.h;
    }

    public static void F0(@g c c0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.v = c0;
    }

    @f
    public static J G(@f Callable callable0) {
        b.g(callable0, "Scheduler Callable can\'t be null");
        return a.c == null ? a.d(callable0) : a.c(a.c, callable0);
    }

    public static void G0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.b = o0;
    }

    @f
    public static J H(@f Callable callable0) {
        b.g(callable0, "Scheduler Callable can\'t be null");
        return a.e == null ? a.d(callable0) : a.c(a.e, callable0);
    }

    public static void H0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.h = o0;
    }

    @f
    public static J I(@f Callable callable0) {
        b.g(callable0, "Scheduler Callable can\'t be null");
        return a.f == null ? a.d(callable0) : a.c(a.f, callable0);
    }

    static void I0(@f Throwable throwable0) {
        Thread thread0 = Thread.currentThread();
        thread0.getUncaughtExceptionHandler().uncaughtException(thread0, throwable0);
    }

    @f
    public static J J(@f Callable callable0) {
        b.g(callable0, "Scheduler Callable can\'t be null");
        return a.d == null ? a.d(callable0) : a.c(a.d, callable0);
    }

    static void J0() {
        a.y = false;
    }

    static boolean K(Throwable throwable0) {
        if(throwable0 instanceof d) {
            return true;
        }
        if(throwable0 instanceof io.reactivex.exceptions.c) {
            return true;
        }
        if(throwable0 instanceof IllegalStateException) {
            return true;
        }
        if(throwable0 instanceof NullPointerException) {
            return true;
        }
        return throwable0 instanceof IllegalArgumentException ? true : throwable0 instanceof io.reactivex.exceptions.a;
    }

    public static boolean L() [...] // 潜在的解密器

    public static boolean M() {
        return a.y;
    }

    public static void N() {
        a.y = true;
    }

    @f
    public static io.reactivex.c O(@f io.reactivex.c c0) {
        return a.q == null ? c0 : ((io.reactivex.c)a.b(a.q, c0));
    }

    @f
    public static l P(@f l l0) {
        return a.k == null ? l0 : ((l)a.b(a.k, l0));
    }

    @f
    public static s Q(@f s s0) {
        return a.o == null ? s0 : ((s)a.b(a.o, s0));
    }

    @f
    public static B R(@f B b0) {
        return a.m == null ? b0 : ((B)a.b(a.m, b0));
    }

    @f
    public static K S(@f K k0) {
        return a.p == null ? k0 : ((K)a.b(a.p, k0));
    }

    @f
    public static io.reactivex.flowables.a T(@f io.reactivex.flowables.a a0) {
        return a.l == null ? a0 : ((io.reactivex.flowables.a)a.b(a.l, a0));
    }

    @f
    public static io.reactivex.observables.a U(@f io.reactivex.observables.a a0) {
        return a.n == null ? a0 : ((io.reactivex.observables.a)a.b(a.n, a0));
    }

    @f
    public static io.reactivex.parallel.b V(@f io.reactivex.parallel.b b0) {
        return a.r == null ? b0 : ((io.reactivex.parallel.b)a.b(a.r, b0));
    }

    public static boolean W() {
        e e0 = a.x;
        if(e0 != null) {
            try {
                return e0.a();
            }
            catch(Throwable throwable0) {
                throw k.f(throwable0);
            }
        }
        return false;
    }

    @f
    public static J X(@f J j0) {
        return a.g == null ? j0 : ((J)a.b(a.g, j0));
    }

    public static void Y(@f Throwable throwable0) {
        e3.g g0 = a.a;
        if(throwable0 == null) {
            throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        else if(!a.K(throwable0)) {
            throwable0 = new io.reactivex.exceptions.f(throwable0);
        }
        if(g0 != null) {
            try {
                g0.accept(throwable0);
                return;
            }
            catch(Throwable throwable1) {
                throwable1.printStackTrace();
                a.I0(throwable1);
            }
        }
        throwable0.printStackTrace();
        a.I0(throwable0);
    }

    @f
    public static J Z(@f J j0) {
        return a.i == null ? j0 : ((J)a.b(a.i, j0));
    }

    @f
    static Object a(@f c c0, @f Object object0, @f Object object1) {
        try {
            return c0.apply(object0, object1);
        }
        catch(Throwable throwable0) {
            throw k.f(throwable0);
        }
    }

    @f
    public static J a0(@f J j0) {
        return a.j == null ? j0 : ((J)a.b(a.j, j0));
    }

    @f
    static Object b(@f o o0, @f Object object0) {
        try {
            return o0.apply(object0);
        }
        catch(Throwable throwable0) {
            throw k.f(throwable0);
        }
    }

    @f
    public static Runnable b0(@f Runnable runnable0) {
        b.g(runnable0, "run is null");
        return a.b == null ? runnable0 : ((Runnable)a.b(a.b, runnable0));
    }

    @f
    static J c(@f o o0, Callable callable0) {
        return (J)b.g(a.b(o0, callable0), "Scheduler Callable result can\'t be null");
    }

    @f
    public static J c0(@f J j0) {
        return a.h == null ? j0 : ((J)a.b(a.h, j0));
    }

    @f
    static J d(@f Callable callable0) {
        try {
            return (J)b.g(callable0.call(), "Scheduler Callable result can\'t be null");
        }
        catch(Throwable throwable0) {
            throw k.f(throwable0);
        }
    }

    @f
    public static io.reactivex.f d0(@f io.reactivex.c c0, @f io.reactivex.f f0) {
        return a.w == null ? f0 : ((io.reactivex.f)a.a(a.w, c0, f0));
    }

    @f
    public static J e(@f ThreadFactory threadFactory0) {
        return new io.reactivex.internal.schedulers.b(((ThreadFactory)b.g(threadFactory0, "threadFactory is null")));
    }

    @f
    public static v e0(@f s s0, @f v v0) {
        return a.t == null ? v0 : ((v)a.a(a.t, s0, v0));
    }

    @f
    public static J f(@f ThreadFactory threadFactory0) {
        return new io.reactivex.internal.schedulers.g(((ThreadFactory)b.g(threadFactory0, "threadFactory is null")));
    }

    @f
    public static I f0(@f B b0, @f I i0) {
        return a.u == null ? i0 : ((I)a.a(a.u, b0, i0));
    }

    @f
    public static J g(@f ThreadFactory threadFactory0) {
        return new h(((ThreadFactory)b.g(threadFactory0, "threadFactory is null")));
    }

    @f
    public static N g0(@f K k0, @f N n0) {
        return a.v == null ? n0 : ((N)a.a(a.v, k0, n0));
    }

    @f
    public static J h(@f ThreadFactory threadFactory0) {
        return new r(((ThreadFactory)b.g(threadFactory0, "threadFactory is null")));
    }

    @f
    public static org.reactivestreams.d h0(@f l l0, @f org.reactivestreams.d d0) {
        return a.s == null ? d0 : ((org.reactivestreams.d)a.a(a.s, l0, d0));
    }

    @g
    public static o i() {
        return a.g;
    }

    public static void i0() {
        a.k0(null);
        a.G0(null);
        a.j0(null);
        a.m0(null);
        a.q0(null);
        a.n0(null);
        a.H0(null);
        a.p0(null);
        a.r0(null);
        a.o0(null);
        a.x0(null);
        a.y0(null);
        a.B0(null);
        a.C0(null);
        a.E0(null);
        a.F0(null);
        a.t0(null);
        a.u0(null);
        a.v0(null);
        a.w0(null);
        a.z0(null);
        a.A0(null);
        a.D0(null);
        a.l0(false);
        a.s0(null);
    }

    @g
    public static e3.g j() {
        return a.a;
    }

    public static void j0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.g = o0;
    }

    @g
    public static o k() {
        return a.c;
    }

    public static void k0(@g e3.g g0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.a = g0;
    }

    @g
    public static o l() {
        return a.e;
    }

    public static void l0(boolean z) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.z = z;
    }

    @g
    public static o m() {
        return a.f;
    }

    public static void m0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.c = o0;
    }

    @g
    public static o n() {
        return a.d;
    }

    public static void n0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.e = o0;
    }

    @g
    public static o o() {
        return a.i;
    }

    public static void o0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.f = o0;
    }

    @g
    public static o p() {
        return a.j;
    }

    public static void p0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.d = o0;
    }

    @g
    public static e q() {
        return a.x;
    }

    public static void q0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.i = o0;
    }

    @g
    public static o r() {
        return a.q;
    }

    public static void r0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.j = o0;
    }

    @g
    public static c s() {
        return a.w;
    }

    public static void s0(@g e e0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.x = e0;
    }

    @g
    public static o t() {
        return a.l;
    }

    public static void t0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.q = o0;
    }

    @g
    public static o u() {
        return a.n;
    }

    public static void u0(@g c c0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.w = c0;
    }

    @g
    public static o v() {
        return a.k;
    }

    public static void v0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.l = o0;
    }

    @g
    public static c w() {
        return a.s;
    }

    public static void w0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.n = o0;
    }

    @g
    public static o x() {
        return a.o;
    }

    public static void x0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.k = o0;
    }

    @g
    public static c y() {
        return a.t;
    }

    public static void y0(@g c c0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.s = c0;
    }

    @g
    public static o z() {
        return a.m;
    }

    public static void z0(@g o o0) {
        if(a.y) {
            throw new IllegalStateException("Plugins can\'t be changed anymore");
        }
        a.o = o0;
    }
}

