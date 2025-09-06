package kotlinx.coroutines.flow.internal;

import A3.o;
import kotlin.S0;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.internal.Q;
import y4.l;
import y4.m;
import z3.i;

public final class x {
    @i(name = "checkContext")
    public static final void a(@l v v0, @l g g0) {
        static final class a extends N implements o {
            final v e;

            a(v v0) {
                this.e = v0;
                super(2);
            }

            @l
            public final Integer a(int v, @l b g$b0) {
                c g$c0 = g$b0.getKey();
                b g$b1 = this.e.l.get(g$c0);
                if(g$c0 != I0.B8) {
                    return g$b0 == g$b1 ? ((int)(v + 1)) : 0x80000000;
                }
                L.n(g$b0, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                I0 i00 = x.b(((I0)g$b0), ((I0)g$b1));
                if(i00 != ((I0)g$b1)) {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + i00 + ", expected child of " + ((I0)g$b1) + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'").toString());
                }
                if(((I0)g$b1) != null) {
                    ++v;
                }
                return v;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), ((b)object1));
            }
        }

        if(((Number)g0.fold(0, new a(v0))).intValue() != v0.m) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + v0.l + ",\n\t\tbut emission happened in " + g0 + ".\n\t\tPlease refer to \'flow\' documentation or use \'flowOn\' instead").toString());
        }
    }

    @m
    public static final I0 b(@m I0 i00, @m I0 i01) {
        while(true) {
            if(i00 == null) {
                return null;
            }
            if(i00 == i01) {
                return i00;
            }
            if(!(i00 instanceof Q)) {
                return i00;
            }
            i00 = i00.getParent();
        }
    }

    @b0
    @l
    public static final kotlinx.coroutines.flow.i c(@kotlin.b @l o o0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n*L\n1#1,111:1\n*E\n"})
        public static final class kotlinx.coroutines.flow.internal.x.b implements kotlinx.coroutines.flow.i {
            final o a;

            public kotlinx.coroutines.flow.internal.x.b(o o0) {
                this.a = o0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.internal.x.b.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    final kotlinx.coroutines.flow.internal.x.b l;
                    int m;

                    public kotlinx.coroutines.flow.internal.x.b.a(kotlinx.coroutines.flow.internal.x.b x$b0, d d0) {
                        this.l = x$b0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.m |= 0x80000000;
                        return this.l.collect(null, this);
                    }
                }

                Object object0 = this.a.invoke(j0, d0);
                return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
            }

            @m
            public Object f(@l j j0, @l d d0) {
                new kotlinx.coroutines.flow.internal.x.b.a(this, d0);
                this.a.invoke(j0, d0);
                return S0.a;
            }
        }

        return new kotlinx.coroutines.flow.internal.x.b(o0);
    }
}

