package androidx.compose.runtime;

import A3.o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.d;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    @l
    private final MonotonicFrameClock a;
    @l
    private final Latch b;
    public static final int c = 8;

    static {
    }

    public PausableMonotonicFrameClock(@l MonotonicFrameClock monotonicFrameClock0) {
        L.p(monotonicFrameClock0, "frameClock");
        super();
        this.a = monotonicFrameClock0;
        this.b = new Latch();
    }

    public final boolean b() {
        return !this.b.e();
    }

    public final void d() {
        this.b.d();
    }

    @Override  // kotlin.coroutines.g$b
    public Object fold(Object object0, @l o o0) {
        return DefaultImpls.a(this, object0, o0);
    }

    public final void g() {
        this.b.f();
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
        PausableMonotonicFrameClock pausableMonotonicFrameClock0;
        androidx.compose.runtime.PausableMonotonicFrameClock.withFrameNanos.1 pausableMonotonicFrameClock$withFrameNanos$10;
        if(d0 instanceof androidx.compose.runtime.PausableMonotonicFrameClock.withFrameNanos.1) {
            pausableMonotonicFrameClock$withFrameNanos$10 = (androidx.compose.runtime.PausableMonotonicFrameClock.withFrameNanos.1)d0;
            int v = pausableMonotonicFrameClock$withFrameNanos$10.o;
            if((v & 0x80000000) == 0) {
                pausableMonotonicFrameClock$withFrameNanos$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return d0.s(null, this);
                    }
                };
            }
            else {
                pausableMonotonicFrameClock$withFrameNanos$10.o = v ^ 0x80000000;
            }
        }
        else {
            pausableMonotonicFrameClock$withFrameNanos$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.o |= 0x80000000;
                    return d0.s(null, this);
                }
            };
        }
        Object object0 = pausableMonotonicFrameClock$withFrameNanos$10.m;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(pausableMonotonicFrameClock$withFrameNanos$10.o) {
            case 0: {
                f0.n(object0);
                pausableMonotonicFrameClock$withFrameNanos$10.k = this;
                pausableMonotonicFrameClock$withFrameNanos$10.l = function10;
                pausableMonotonicFrameClock$withFrameNanos$10.o = 1;
                if(this.b.c(pausableMonotonicFrameClock$withFrameNanos$10) == object1) {
                    return object1;
                }
                pausableMonotonicFrameClock0 = this;
                break;
            }
            case 1: {
                function10 = (Function1)pausableMonotonicFrameClock$withFrameNanos$10.l;
                pausableMonotonicFrameClock0 = (PausableMonotonicFrameClock)pausableMonotonicFrameClock$withFrameNanos$10.k;
                f0.n(object0);
                break;
            }
            case 2: {
                f0.n(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        pausableMonotonicFrameClock$withFrameNanos$10.k = null;
        pausableMonotonicFrameClock$withFrameNanos$10.l = null;
        pausableMonotonicFrameClock$withFrameNanos$10.o = 2;
        object0 = pausableMonotonicFrameClock0.a.s(function10, pausableMonotonicFrameClock$withFrameNanos$10);
        return object0 == object1 ? object1 : object0;
    }
}

