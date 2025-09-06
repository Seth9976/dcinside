package kotlinx.coroutines.flow.internal;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.channels.i;
import y4.l;
import y4.m;

@s0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1855#2,2:97\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n*L\n91#1:97,2\n*E\n"})
public final class k extends e {
    @l
    private final Iterable d;

    public k(@l Iterable iterable0, @l g g0, int v, @l i i0) {
        super(g0, v, i0);
        this.d = iterable0;
    }

    public k(Iterable iterable0, g g0, int v, i i0, int v1, w w0) {
        if((v1 & 2) != 0) {
            g0 = kotlin.coroutines.i.a;
        }
        if((v1 & 4) != 0) {
            v = -2;
        }
        if((v1 & 8) != 0) {
            i0 = i.a;
        }
        this(iterable0, g0, v, i0);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @m
    protected Object h(@l D d0, @l d d1) {
        @f(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.o {
            int k;
            final kotlinx.coroutines.flow.i l;
            final y m;

            a(kotlinx.coroutines.flow.i i0, y y0, d d0) {
                this.l = i0;
                this.m = y0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new a(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.l.collect(this.m, this) == object1 ? object1 : S0.a;
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

        y y0 = new y(d0);
        for(Object object0: this.d) {
            kotlinx.coroutines.k.f(d0, null, null, new a(((kotlinx.coroutines.flow.i)object0), y0, null), 3, null);
        }
        return S0.a;
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    protected e i(@l g g0, int v, @l i i0) {
        return new k(this.d, g0, v, i0);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    public F m(@l O o0) {
        A3.o o1 = this.k();
        return B.c(o0, this.a, this.b, o1);
    }
}

