package io.reactivex.flowables;

import d3.b;
import d3.d;
import d3.f;
import d3.h;
import e3.g;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.operators.flowable.T0;
import io.reactivex.internal.operators.flowable.U0;
import io.reactivex.internal.operators.flowable.c1;
import io.reactivex.internal.operators.flowable.k;
import io.reactivex.l;
import java.util.concurrent.TimeUnit;

public abstract class a extends l {
    @f
    public l O8() {
        return this.P8(1);
    }

    @f
    public l P8(int v) {
        return this.Q8(v, io.reactivex.internal.functions.a.h());
    }

    @f
    public l Q8(int v, @f g g0) {
        if(v <= 0) {
            this.S8(g0);
            return io.reactivex.plugins.a.T(this);
        }
        return io.reactivex.plugins.a.P(new k(this, v, g0));
    }

    public final c R8() {
        io.reactivex.internal.util.g g0 = new io.reactivex.internal.util.g();
        this.S8(g0);
        return g0.a;
    }

    public abstract void S8(@f g arg1);

    // 去混淆评级： 低(20)
    private a T8() {
        return this instanceof U0 ? io.reactivex.plugins.a.T(new T0(((U0)this).c(), ((U0)this).d())) : this;
    }

    @b(d3.a.a)
    @d
    @f
    @h("none")
    public l U8() {
        return io.reactivex.plugins.a.P(new c1(this.T8()));
    }

    @b(d3.a.a)
    @d
    @h("none")
    public final l V8(int v) {
        return this.X8(v, 0L, TimeUnit.NANOSECONDS, io.reactivex.schedulers.b.i());
    }

    @b(d3.a.a)
    @d
    @h("io.reactivex:computation")
    public final l W8(int v, long v1, TimeUnit timeUnit0) {
        return this.X8(v, v1, timeUnit0, io.reactivex.schedulers.b.a());
    }

    @b(d3.a.a)
    @d
    @h("custom")
    public final l X8(int v, long v1, TimeUnit timeUnit0, J j0) {
        io.reactivex.internal.functions.b.h(v, "subscriberCount");
        io.reactivex.internal.functions.b.g(timeUnit0, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P(new c1(this.T8(), v, v1, timeUnit0, j0));
    }

    @b(d3.a.a)
    @d
    @h("io.reactivex:computation")
    public final l Y8(long v, TimeUnit timeUnit0) {
        return this.X8(1, v, timeUnit0, io.reactivex.schedulers.b.a());
    }

    @b(d3.a.a)
    @d
    @h("custom")
    public final l Z8(long v, TimeUnit timeUnit0, J j0) {
        return this.X8(1, v, timeUnit0, j0);
    }
}

