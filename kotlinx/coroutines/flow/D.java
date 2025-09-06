package kotlinx.coroutines.flow;

import kotlin.S0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.M0;
import y4.l;
import y4.m;

final class d implements c {
    @l
    private final i a;

    public d(@l i i0) {
        this.a = i0;
    }

    @Override  // kotlinx.coroutines.flow.i
    @m
    public Object collect(@l j j0, @l kotlin.coroutines.d d0) {
        @s0({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,281:1\n326#2:282\n*S KotlinDebug\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n*L\n270#1:282\n*E\n"})
        static final class a implements j {
            final j a;

            a(j j0) {
                this.a = j0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l kotlin.coroutines.d d0) {
                @f(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {0x10F}, m = "emit", n = {}, s = {})
                static final class kotlinx.coroutines.flow.d.a.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    final a l;
                    int m;

                    kotlinx.coroutines.flow.d.a.a(a d$a0, kotlin.coroutines.d d0) {
                        this.l = d$a0;
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

                kotlinx.coroutines.flow.d.a.a d$a$a0;
                if(d0 instanceof kotlinx.coroutines.flow.d.a.a) {
                    d$a$a0 = (kotlinx.coroutines.flow.d.a.a)d0;
                    int v = d$a$a0.m;
                    if((v & 0x80000000) == 0) {
                        d$a$a0 = new kotlinx.coroutines.flow.d.a.a(this, d0);
                    }
                    else {
                        d$a$a0.m = v ^ 0x80000000;
                    }
                }
                else {
                    d$a$a0 = new kotlinx.coroutines.flow.d.a.a(this, d0);
                }
                Object object1 = d$a$a0.k;
                Object object2 = b.l();
                switch(d$a$a0.m) {
                    case 0: {
                        f0.n(object1);
                        M0.z(d$a$a0.getContext());
                        d$a$a0.m = 1;
                        return this.a.emit(object0, d$a$a0) == object2 ? object2 : S0.a;
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

        a d$a0 = new a(j0);
        Object object0 = this.a.collect(d$a0, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

