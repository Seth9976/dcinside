package androidx.compose.runtime;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

final class SdkStubsFallbackFrameClock implements MonotonicFrameClock {
    @l
    public static final SdkStubsFallbackFrameClock a = null;
    private static final long b = 16L;

    static {
        SdkStubsFallbackFrameClock.a = new SdkStubsFallbackFrameClock();
    }

    @Override  // kotlin.coroutines.g$b
    public Object fold(Object object0, @l o o0) {
        return DefaultImpls.a(this, object0, o0);
    }

    @Override  // kotlin.coroutines.g$b
    @m
    public b get(@l c g$c0) {
        return DefaultImpls.b(this, g$c0);
    }

    @Override  // androidx.compose.runtime.MonotonicFrameClock
    public c getKey() {
        return androidx.compose.runtime.c.a(this);
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public g minusKey(@l c g$c0) {
        return DefaultImpls.d(this, g$c0);
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        return DefaultImpls.e(this, g0);
    }

    @Override  // androidx.compose.runtime.MonotonicFrameClock
    @m
    public Object s(@l Function1 function10, @l d d0) {
        return i.h(h0.e(), new o(null) {
            int k;
            final Function1 l;

            {
                this.l = function10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.runtime.SdkStubsFallbackFrameClock.withFrameNanos.2(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.runtime.SdkStubsFallbackFrameClock.withFrameNanos.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return a0.b(16L, this) == object1 ? object1 : this.l.invoke(kotlin.coroutines.jvm.internal.b.g(System.nanoTime()));
                    }
                    case 1: {
                        f0.n(object0);
                        return this.l.invoke(kotlin.coroutines.jvm.internal.b.g(System.nanoTime()));
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, d0);
    }
}

