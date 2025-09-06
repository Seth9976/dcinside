package androidx.compose.runtime;

import A3.o;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@s0({"SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,99:1\n314#2,11:100\n*S KotlinDebug\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n*L\n64#1:100,11\n*E\n"})
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    @l
    public static final DefaultChoreographerFrameClock a;
    private static final Choreographer b;

    static {
        DefaultChoreographerFrameClock.a = new DefaultChoreographerFrameClock();
        DefaultChoreographerFrameClock.b = (Choreographer)i.f(h0.e().u1(), new DefaultChoreographerFrameClock.choreographer.1(null));
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
        p p0 = new p(kotlin.coroutines.intrinsics.b.e(d0), 1);
        p0.c0();
        androidx.compose.runtime.DefaultChoreographerFrameClock.withFrameNanos.2.callback.1 defaultChoreographerFrameClock$withFrameNanos$2$callback$10 = new Choreographer.FrameCallback() {
            @Override  // android.view.Choreographer$FrameCallback
            public final void doFrame(long v) {
                Object object0;
                kotlinx.coroutines.o o0;
                try {
                    o0 = function10;
                    object0 = e0.b(this.b.invoke(v));
                }
                catch(Throwable throwable0) {
                    object0 = e0.b(f0.a(throwable0));
                }
                o0.resumeWith(object0);
            }
        };
        DefaultChoreographerFrameClock.b.postFrameCallback(defaultChoreographerFrameClock$withFrameNanos$2$callback$10);
        p0.K(new Function1() {
            final Choreographer.FrameCallback e;

            {
                this.e = choreographer$FrameCallback0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                DefaultChoreographerFrameClock.b.removeFrameCallback(this.e);
            }
        });
        Object object0 = p0.x();
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object0;
    }
}

