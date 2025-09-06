package io.reactivex.observables;

import d3.d;
import d3.f;
import d3.h;
import e3.g;
import io.reactivex.B;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.operators.observable.I0;
import io.reactivex.internal.operators.observable.J0;
import io.reactivex.internal.operators.observable.Q0;
import io.reactivex.internal.operators.observable.k;
import io.reactivex.schedulers.b;
import java.util.concurrent.TimeUnit;

public abstract class a extends B {
    @f
    public B i8() {
        return this.j8(1);
    }

    @f
    public B j8(int v) {
        return this.k8(v, io.reactivex.internal.functions.a.h());
    }

    @f
    public B k8(int v, @f g g0) {
        if(v <= 0) {
            this.m8(g0);
            return io.reactivex.plugins.a.U(this);
        }
        return io.reactivex.plugins.a.R(new k(this, v, g0));
    }

    public final c l8() {
        io.reactivex.internal.util.g g0 = new io.reactivex.internal.util.g();
        this.m8(g0);
        return g0.a;
    }

    public abstract void m8(@f g arg1);

    // 去混淆评级： 低(20)
    private a n8() {
        return this instanceof J0 ? io.reactivex.plugins.a.U(new I0(((J0)this).c())) : this;
    }

    @d
    @f
    @h("none")
    public B o8() {
        return io.reactivex.plugins.a.R(new Q0(this.n8()));
    }

    @d
    @h("none")
    public final B p8(int v) {
        return this.r8(v, 0L, TimeUnit.NANOSECONDS, b.i());
    }

    @d
    @h("io.reactivex:computation")
    public final B q8(int v, long v1, TimeUnit timeUnit0) {
        return this.r8(v, v1, timeUnit0, b.a());
    }

    @d
    @h("custom")
    public final B r8(int v, long v1, TimeUnit timeUnit0, J j0) {
        io.reactivex.internal.functions.b.h(v, "subscriberCount");
        io.reactivex.internal.functions.b.g(timeUnit0, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R(new Q0(this.n8(), v, v1, timeUnit0, j0));
    }

    @d
    @h("io.reactivex:computation")
    public final B s8(long v, TimeUnit timeUnit0) {
        return this.r8(1, v, timeUnit0, b.a());
    }

    @d
    @h("custom")
    public final B t8(long v, TimeUnit timeUnit0, J j0) {
        return this.r8(1, v, timeUnit0, j0);
    }
}

