package io.reactivex.parallel;

import d3.d;
import d3.f;
import e3.o;
import e3.q;
import e3.r;
import io.reactivex.J;
import io.reactivex.internal.operators.parallel.e;
import io.reactivex.internal.operators.parallel.g;
import io.reactivex.internal.operators.parallel.h;
import io.reactivex.internal.operators.parallel.i;
import io.reactivex.internal.operators.parallel.j;
import io.reactivex.internal.operators.parallel.k;
import io.reactivex.internal.operators.parallel.m;
import io.reactivex.internal.operators.parallel.n;
import io.reactivex.internal.operators.parallel.p;
import io.reactivex.internal.util.w;
import io.reactivex.l;
import io.reactivex.plugins.a;
import java.util.Comparator;
import java.util.concurrent.Callable;
import org.reactivestreams.c;

public abstract class b {
    @d
    @f
    public static b A(@f c c0, int v, int v1) {
        io.reactivex.internal.functions.b.g(c0, "source");
        io.reactivex.internal.functions.b.h(v, "parallelism");
        io.reactivex.internal.functions.b.h(v1, "prefetch");
        return a.V(new h(c0, v, v1));
    }

    @d
    @f
    public static b B(@f c[] arr_c) {
        if(arr_c.length == 0) {
            throw new IllegalArgumentException("Zero publishers not supported");
        }
        return a.V(new g(arr_c));
    }

    @d
    @f
    public final b C(@f o o0) {
        io.reactivex.internal.functions.b.g(o0, "mapper");
        return a.V(new j(this, o0));
    }

    @d
    @f
    public final b D(@f o o0, @f e3.c c0) {
        io.reactivex.internal.functions.b.g(o0, "mapper");
        io.reactivex.internal.functions.b.g(c0, "errorHandler is null");
        return a.V(new k(this, o0, c0));
    }

    @d
    @f
    public final b E(@f o o0, @f io.reactivex.parallel.a a0) {
        io.reactivex.internal.functions.b.g(o0, "mapper");
        io.reactivex.internal.functions.b.g(a0, "errorHandler is null");
        return a.V(new k(this, o0, a0));
    }

    public abstract int F();

    @d
    @f
    public final l G(@f e3.c c0) {
        io.reactivex.internal.functions.b.g(c0, "reducer");
        return a.P(new n(this, c0));
    }

    @d
    @f
    public final b H(@f Callable callable0, @f e3.c c0) {
        io.reactivex.internal.functions.b.g(callable0, "initialSupplier");
        io.reactivex.internal.functions.b.g(c0, "reducer");
        return a.V(new m(this, callable0, c0));
    }

    // 去混淆评级： 低(20)
    @d
    @f
    public final b I(@f J j0) {
        return this.J(j0, 0x80);
    }

    @d
    @f
    public final b J(@f J j0, int v) {
        io.reactivex.internal.functions.b.g(j0, "scheduler");
        io.reactivex.internal.functions.b.h(v, "prefetch");
        return a.V(new io.reactivex.internal.operators.parallel.o(this, j0, v));
    }

    // 去混淆评级： 低(20)
    @d3.b(d3.a.b)
    @d
    @d3.h("none")
    public final l K() {
        return this.L(0x80);
    }

    @d3.b(d3.a.b)
    @d
    @f
    @d3.h("none")
    public final l L(int v) {
        io.reactivex.internal.functions.b.h(v, "prefetch");
        return a.P(new i(this, v, false));
    }

    // 去混淆评级： 低(20)
    @d3.b(d3.a.b)
    @d
    @f
    @d3.h("none")
    public final l M() {
        return this.N(0x80);
    }

    @d3.b(d3.a.b)
    @d
    @f
    @d3.h("none")
    public final l N(int v) {
        io.reactivex.internal.functions.b.h(v, "prefetch");
        return a.P(new i(this, v, true));
    }

    @d
    @f
    public final l O(@f Comparator comparator0) {
        return this.P(comparator0, 16);
    }

    @d
    @f
    public final l P(@f Comparator comparator0, int v) {
        io.reactivex.internal.functions.b.g(comparator0, "comparator is null");
        io.reactivex.internal.functions.b.h(v, "capacityHint");
        return a.P(new p(this.H(io.reactivex.internal.functions.a.f(v / this.F() + 1), io.reactivex.internal.util.o.b()).C(new w(comparator0)), comparator0));
    }

    public abstract void Q(@f org.reactivestreams.d[] arg1);

    @d
    @f
    public final Object R(@f o o0) {
        try {
            return ((o)io.reactivex.internal.functions.b.g(o0, "converter is null")).apply(this);
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            throw io.reactivex.internal.util.k.f(throwable0);
        }
    }

    @d
    @f
    public final l S(@f Comparator comparator0) {
        return this.T(comparator0, 16);
    }

    @d
    @f
    public final l T(@f Comparator comparator0, int v) {
        io.reactivex.internal.functions.b.g(comparator0, "comparator is null");
        io.reactivex.internal.functions.b.h(v, "capacityHint");
        return a.P(this.H(io.reactivex.internal.functions.a.f(v / this.F() + 1), io.reactivex.internal.util.o.b()).C(new w(comparator0)).G(new io.reactivex.internal.util.p(comparator0)));
    }

    protected final boolean U(@f org.reactivestreams.d[] arr_d) {
        int v = this.F();
        if(arr_d.length != v) {
            IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("parallelism = " + v + ", subscribers = " + arr_d.length);
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                io.reactivex.internal.subscriptions.g.b(illegalArgumentException0, arr_d[v1]);
            }
            return false;
        }
        return true;
    }

    @d
    @f
    public final Object a(@f io.reactivex.parallel.c c0) {
        return ((io.reactivex.parallel.c)io.reactivex.internal.functions.b.g(c0, "converter is null")).a(this);
    }

    @d
    @f
    public final b b(@f Callable callable0, @f e3.b b0) {
        io.reactivex.internal.functions.b.g(callable0, "collectionSupplier is null");
        io.reactivex.internal.functions.b.g(b0, "collector is null");
        return a.V(new io.reactivex.internal.operators.parallel.a(this, callable0, b0));
    }

    @d
    @f
    public final b c(@f io.reactivex.parallel.d d0) {
        return a.V(((io.reactivex.parallel.d)io.reactivex.internal.functions.b.g(d0, "composer is null")).a(this));
    }

    @d
    @f
    public final b d(@f o o0) {
        return this.e(o0, 2);
    }

    @d
    @f
    public final b e(@f o o0, int v) {
        io.reactivex.internal.functions.b.g(o0, "mapper is null");
        io.reactivex.internal.functions.b.h(v, "prefetch");
        return a.V(new io.reactivex.internal.operators.parallel.b(this, o0, v, io.reactivex.internal.util.j.a));
    }

    @d
    @f
    public final b f(@f o o0, int v, boolean z) {
        io.reactivex.internal.functions.b.g(o0, "mapper is null");
        io.reactivex.internal.functions.b.h(v, "prefetch");
        return z ? a.V(new io.reactivex.internal.operators.parallel.b(this, o0, v, io.reactivex.internal.util.j.c)) : a.V(new io.reactivex.internal.operators.parallel.b(this, o0, v, io.reactivex.internal.util.j.b));
    }

    @d
    @f
    public final b g(@f o o0, boolean z) {
        return this.f(o0, 2, z);
    }

    @d
    @f
    public final b h(@f e3.g g0) {
        io.reactivex.internal.functions.b.g(g0, "onAfterNext is null");
        return a.V(new io.reactivex.internal.operators.parallel.l(this, io.reactivex.internal.functions.a.h(), g0, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, io.reactivex.internal.functions.a.c));
    }

    @d
    @f
    public final b i(@f e3.a a0) {
        io.reactivex.internal.functions.b.g(a0, "onAfterTerminate is null");
        return a.V(new io.reactivex.internal.operators.parallel.l(this, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, a0, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, io.reactivex.internal.functions.a.c));
    }

    @d
    @f
    public final b j(@f e3.a a0) {
        io.reactivex.internal.functions.b.g(a0, "onCancel is null");
        return a.V(new io.reactivex.internal.operators.parallel.l(this, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, a0));
    }

    @d
    @f
    public final b k(@f e3.a a0) {
        io.reactivex.internal.functions.b.g(a0, "onComplete is null");
        return a.V(new io.reactivex.internal.operators.parallel.l(this, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), a0, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, io.reactivex.internal.functions.a.c));
    }

    @d
    @f
    public final b l(@f e3.g g0) {
        io.reactivex.internal.functions.b.g(g0, "onError is null");
        return a.V(new io.reactivex.internal.operators.parallel.l(this, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), g0, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, io.reactivex.internal.functions.a.c));
    }

    @d
    @f
    public final b m(@f e3.g g0) {
        io.reactivex.internal.functions.b.g(g0, "onNext is null");
        return a.V(new io.reactivex.internal.operators.parallel.l(this, g0, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, io.reactivex.internal.functions.a.c));
    }

    @d
    @f
    public final b n(@f e3.g g0, @f e3.c c0) {
        io.reactivex.internal.functions.b.g(g0, "onNext is null");
        io.reactivex.internal.functions.b.g(c0, "errorHandler is null");
        return a.V(new io.reactivex.internal.operators.parallel.c(this, g0, c0));
    }

    @d
    @f
    public final b o(@f e3.g g0, @f io.reactivex.parallel.a a0) {
        io.reactivex.internal.functions.b.g(g0, "onNext is null");
        io.reactivex.internal.functions.b.g(a0, "errorHandler is null");
        return a.V(new io.reactivex.internal.operators.parallel.c(this, g0, a0));
    }

    @d
    @f
    public final b p(@f q q0) {
        io.reactivex.internal.functions.b.g(q0, "onRequest is null");
        return a.V(new io.reactivex.internal.operators.parallel.l(this, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.h(), q0, io.reactivex.internal.functions.a.c));
    }

    @d
    @f
    public final b q(@f e3.g g0) {
        io.reactivex.internal.functions.b.g(g0, "onSubscribe is null");
        return a.V(new io.reactivex.internal.operators.parallel.l(this, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, io.reactivex.internal.functions.a.c, g0, io.reactivex.internal.functions.a.g, io.reactivex.internal.functions.a.c));
    }

    @d
    public final b r(@f r r0) {
        io.reactivex.internal.functions.b.g(r0, "predicate");
        return a.V(new io.reactivex.internal.operators.parallel.d(this, r0));
    }

    @d
    public final b s(@f r r0, @f e3.c c0) {
        io.reactivex.internal.functions.b.g(r0, "predicate");
        io.reactivex.internal.functions.b.g(c0, "errorHandler is null");
        return a.V(new e(this, r0, c0));
    }

    @d
    public final b t(@f r r0, @f io.reactivex.parallel.a a0) {
        io.reactivex.internal.functions.b.g(r0, "predicate");
        io.reactivex.internal.functions.b.g(a0, "errorHandler is null");
        return a.V(new e(this, r0, a0));
    }

    // 去混淆评级： 低(20)
    @d
    @f
    public final b u(@f o o0) {
        return this.x(o0, false, 0x7FFFFFFF, 0x80);
    }

    // 去混淆评级： 低(20)
    @d
    @f
    public final b v(@f o o0, boolean z) {
        return this.x(o0, z, 0x7FFFFFFF, 0x80);
    }

    // 去混淆评级： 低(20)
    @d
    @f
    public final b w(@f o o0, boolean z, int v) {
        return this.x(o0, z, v, 0x80);
    }

    @d
    @f
    public final b x(@f o o0, boolean z, int v, int v1) {
        io.reactivex.internal.functions.b.g(o0, "mapper is null");
        io.reactivex.internal.functions.b.h(v, "maxConcurrency");
        io.reactivex.internal.functions.b.h(v1, "prefetch");
        return a.V(new io.reactivex.internal.operators.parallel.f(this, o0, z, v, v1));
    }

    // 去混淆评级： 低(20)
    @d
    public static b y(@f c c0) {
        return b.A(c0, Runtime.getRuntime().availableProcessors(), 0x80);
    }

    // 去混淆评级： 低(20)
    @d
    public static b z(@f c c0, int v) {
        return b.A(c0, v, 0x80);
    }
}

