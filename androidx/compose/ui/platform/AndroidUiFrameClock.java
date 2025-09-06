package androidx.compose.ui.platform;

import A3.o;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock.DefaultImpls;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,53:1\n314#2,11:54\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n31#1:54,11\n*E\n"})
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    @l
    private final Choreographer a;
    public static final int b = 8;

    static {
    }

    public AndroidUiFrameClock(@l Choreographer choreographer0) {
        L.p(choreographer0, "choreographer");
        super();
        this.a = choreographer0;
    }

    @l
    public final Choreographer b() {
        return this.a;
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
        b g$b0 = d0.getContext().get(e.z8);
        AndroidUiDispatcher androidUiDispatcher0 = g$b0 instanceof AndroidUiDispatcher ? ((AndroidUiDispatcher)g$b0) : null;
        p p0 = new p(kotlin.coroutines.intrinsics.b.e(d0), 1);
        p0.c0();
        androidx.compose.ui.platform.AndroidUiFrameClock.withFrameNanos.2.callback.1 androidUiFrameClock$withFrameNanos$2$callback$10 = new Choreographer.FrameCallback() {
            @Override  // android.view.Choreographer$FrameCallback
            public final void doFrame(long v) {
                Object object0;
                kotlinx.coroutines.o o0;
                try {
                    o0 = this;
                    object0 = e0.b(this.c.invoke(v));
                }
                catch(Throwable throwable0) {
                    object0 = e0.b(f0.a(throwable0));
                }
                o0.resumeWith(object0);
            }
        };
        if(androidUiDispatcher0 == null || !L.g(androidUiDispatcher0.o2(), this.b())) {
            this.b().postFrameCallback(androidUiFrameClock$withFrameNanos$2$callback$10);
            p0.K(new Function1(androidUiFrameClock$withFrameNanos$2$callback$10) {
                final AndroidUiFrameClock e;
                final Choreographer.FrameCallback f;

                {
                    this.e = androidUiFrameClock0;
                    this.f = choreographer$FrameCallback0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Throwable)object0));
                    return S0.a;
                }

                public final void invoke(@m Throwable throwable0) {
                    this.e.b().removeFrameCallback(this.f);
                }
            });
        }
        else {
            androidUiDispatcher0.I2(androidUiFrameClock$withFrameNanos$2$callback$10);
            p0.K(new Function1(androidUiFrameClock$withFrameNanos$2$callback$10) {
                final AndroidUiDispatcher e;
                final Choreographer.FrameCallback f;

                {
                    this.e = androidUiDispatcher0;
                    this.f = choreographer$FrameCallback0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Throwable)object0));
                    return S0.a;
                }

                public final void invoke(@m Throwable throwable0) {
                    this.e.L2(this.f);
                }
            });
        }
        Object object0 = p0.x();
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object0;
    }
}

