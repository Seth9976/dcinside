package kotlinx.coroutines.flow.internal;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.internal.b0;
import y4.l;
import y4.m;

final class B implements j {
    @l
    private final g a;
    @l
    private final Object b;
    @l
    private final o c;

    public B(@l j j0, @l g g0) {
        @f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {0xD0}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            Object l;
            final j m;

            a(j j0, d d0) {
                this.m = j0;
                super(2, d0);
            }

            @m
            public final Object a(Object object0, @m d d0) {
                return ((a)this.create(object0, d0)).invokeSuspend(S0.a);
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
                return this.a(object0, ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.m.emit(this.l, this) == object1 ? object1 : S0.a;
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

        this.a = g0;
        this.b = b0.b(g0);
        this.c = new a(j0, null);
    }

    @Override  // kotlinx.coroutines.flow.j
    @m
    public Object emit(Object object0, @l d d0) {
        Object object1 = kotlinx.coroutines.flow.internal.f.c(this.a, object0, this.b, this.c, d0);
        return object1 == b.l() ? object1 : S0.a;
    }
}

