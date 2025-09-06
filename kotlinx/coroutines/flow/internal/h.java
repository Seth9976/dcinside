package kotlinx.coroutines.flow.internal;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.J;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import y4.l;
import y4.m;
import z3.f;

public abstract class h extends e {
    @l
    @f
    protected final i d;

    public h(@l i i0, @l g g0, int v, @l kotlinx.coroutines.channels.i i1) {
        super(g0, v, i1);
        this.d = i0;
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @m
    public Object collect(@l j j0, @l d d0) {
        return h.o(this, j0, d0);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @m
    protected Object h(@l D d0, @l d d1) {
        return h.p(this, d0, d1);
    }

    public static final Object n(h h0, j j0, g g0, d d0) {
        return h0.q(j0, g0, d0);
    }

    static Object o(h h0, j j0, d d0) {
        if(h0.b == -3) {
            g g0 = d0.getContext();
            g g1 = J.d(g0, h0.a);
            if(L.g(g1, g0)) {
                Object object0 = h0.r(j0, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
            if(L.g(g1.get(kotlin.coroutines.e.z8), g0.get(kotlin.coroutines.e.z8))) {
                Object object1 = h0.q(j0, g1, d0);
                return object1 == b.l() ? object1 : S0.a;
            }
        }
        Object object2 = h0.super.collect(j0, d0);
        return object2 == b.l() ? object2 : S0.a;
    }

    static Object p(h h0, D d0, d d1) {
        Object object0 = h0.r(new y(d0), d1);
        return object0 == b.l() ? object0 : S0.a;
    }

    private final Object q(j j0, g g0, d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {0x94}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.o {
            int k;
            Object l;
            final h m;

            a(h h0, d d0) {
                this.m = h0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new a(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((j)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l j j0, @m d d0) {
                return ((a)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.m.r(((j)this.l), this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        return kotlinx.coroutines.flow.internal.f.d(g0, kotlinx.coroutines.flow.internal.f.e(j0, d0.getContext()), null, new a(this, null), d0, 4, null);
    }

    @m
    protected abstract Object r(@l j arg1, @l d arg2);

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    public String toString() {
        return this.d + " -> " + super.toString();
    }
}

