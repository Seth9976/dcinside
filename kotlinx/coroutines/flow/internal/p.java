package kotlinx.coroutines.flow.internal;

import A3.o;
import kotlin.S0;
import kotlin.b;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import y4.l;
import y4.m;

@s0({"SMAP\nFlowCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,59:1\n105#2:60\n*S KotlinDebug\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n46#1:60\n*E\n"})
public final class p {
    @m
    public static final Object a(@b @l o o0, @l d d0) {
        kotlinx.coroutines.flow.internal.o o1 = new kotlinx.coroutines.flow.internal.o(d0.getContext(), d0);
        Object object0 = M3.b.d(o1, o1, o0);
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object0;
    }

    @l
    public static final i b(@b @l A3.p p0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n1#1,111:1\n47#2,2:112\n*E\n"})
        public static final class a implements i {
            final A3.p a;

            public a(A3.p p0) {
                this.a = p0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                Object object0 = p.a(new kotlinx.coroutines.flow.internal.p.b(this.a, j0, null), d0);
                return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
            }
        }


        @f(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {0x2F}, m = "invokeSuspend", n = {}, s = {})
        static final class kotlinx.coroutines.flow.internal.p.b extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            private Object l;
            final A3.p m;
            final j n;

            kotlinx.coroutines.flow.internal.p.b(A3.p p0, j j0, d d0) {
                this.m = p0;
                this.n = j0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.flow.internal.p.b(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((kotlinx.coroutines.flow.internal.p.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.m.invoke(((O)this.l), this.n, this) == object1 ? object1 : S0.a;
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

        return new a(p0);
    }
}

