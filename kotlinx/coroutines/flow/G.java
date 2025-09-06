package kotlinx.coroutines.flow;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0.h;
import kotlinx.coroutines.flow.internal.u;
import y4.l;
import y4.m;
import z3.f;

final class g implements i {
    @l
    private final i a;
    @l
    @f
    public final Function1 b;
    @l
    @f
    public final o c;

    public g(@l i i0, @l Function1 function10, @l o o0) {
        this.a = i0;
        this.b = function10;
        this.c = o0;
    }

    @Override  // kotlinx.coroutines.flow.i
    @m
    public Object collect(@l j j0, @l d d0) {
        static final class a implements j {
            final g a;
            final h b;
            final j c;

            a(g g0, h l0$h0, j j0) {
                this.a = g0;
                this.b = l0$h0;
                this.c = j0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {73}, m = "emit", n = {}, s = {})
                static final class kotlinx.coroutines.flow.g.a.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    final a l;
                    int m;

                    kotlinx.coroutines.flow.g.a.a(a g$a0, d d0) {
                        this.l = g$a0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.m |= 0x80000000;
                        return this.l.emit(null, this);
                    }
                }

                kotlinx.coroutines.flow.g.a.a g$a$a0;
                if(d0 instanceof kotlinx.coroutines.flow.g.a.a) {
                    g$a$a0 = (kotlinx.coroutines.flow.g.a.a)d0;
                    int v = g$a$a0.m;
                    if((v & 0x80000000) == 0) {
                        g$a$a0 = new kotlinx.coroutines.flow.g.a.a(this, d0);
                    }
                    else {
                        g$a$a0.m = v ^ 0x80000000;
                    }
                }
                else {
                    g$a$a0 = new kotlinx.coroutines.flow.g.a.a(this, d0);
                }
                Object object1 = g$a$a0.k;
                Object object2 = b.l();
                switch(g$a$a0.m) {
                    case 0: {
                        f0.n(object1);
                        Object object3 = this.a.b.invoke(object0);
                        Object object4 = this.b.a;
                        if(object4 != u.a && ((Boolean)this.a.c.invoke(object4, object3)).booleanValue()) {
                            return S0.a;
                        }
                        this.b.a = object3;
                        g$a$a0.m = 1;
                        return this.c.emit(object0, g$a$a0) == object2 ? object2 : S0.a;
                    }
                    case 1: {
                        f0.n(object1);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        h l0$h0 = new h();
        l0$h0.a = u.a;
        a g$a0 = new a(this, l0$h0, j0);
        Object object0 = this.a.collect(g$a0, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

