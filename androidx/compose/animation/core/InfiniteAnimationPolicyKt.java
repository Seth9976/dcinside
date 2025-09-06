package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import y4.l;
import y4.m;

public final class InfiniteAnimationPolicyKt {
    @m
    public static final Object a(@l Function1 function10, @l d d0) {
        return InfiniteAnimationPolicyKt.c(new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            public final Object a(long v) {
                return this.e.invoke(((long)(v / 1000000L)));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).longValue());
            }
        }, d0);
    }

    private static final Object b(Function1 function10, d d0) {
        return InfiniteAnimationPolicyKt.c(new androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameMillis.2(function10), d0);
    }

    @m
    public static final Object c(@l Function1 function10, @l d d0) {
        InfiniteAnimationPolicy infiniteAnimationPolicy0 = (InfiniteAnimationPolicy)d0.getContext().get(InfiniteAnimationPolicy.r0);
        return infiniteAnimationPolicy0 == null ? MonotonicFrameClockKt.f(function10, d0) : infiniteAnimationPolicy0.R(new Function1(function10, null) {
            int k;
            final Function1 l;

            {
                this.l = function10;
                super(1, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@l d d0) {
                return new androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos.2(this.l, d0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((d)object0));
            }

            @m
            public final Object invoke(@m d d0) {
                return ((androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos.2)this.create(d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        object0 = MonotonicFrameClockKt.f(this.l, this);
                        return object0 == object1 ? object1 : object0;
                    }
                    case 1: {
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, d0);
    }
}

