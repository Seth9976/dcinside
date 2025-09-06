package androidx.compose.foundation.gestures;

import A3.a;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedSpringSpec;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class UpdatableAnimationState {
    static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final VectorizedSpringSpec a() {
            return UpdatableAnimationState.h;
        }

        @l
        public final AnimationVector1D b() {
            return UpdatableAnimationState.g;
        }

        public final boolean c(float f) {
            return Math.abs(f) < 0.01f;
        }
    }

    private long a;
    @l
    private AnimationVector1D b;
    private boolean c;
    private float d;
    @l
    private static final Companion e = null;
    @Deprecated
    public static final float f = 0.01f;
    @Deprecated
    @l
    private static final AnimationVector1D g;
    @Deprecated
    @l
    private static final VectorizedSpringSpec h;

    static {
        UpdatableAnimationState.e = new Companion(null);
        UpdatableAnimationState.g = new AnimationVector1D(0.0f);
        UpdatableAnimationState.h = AnimationSpecKt.o(0.0f, 0.0f, null, 7, null).i(VectorConvertersKt.i(A.a));
    }

    public UpdatableAnimationState() {
        this.a = 0x8000000000000000L;
        this.b = UpdatableAnimationState.g;
    }

    @m
    public final Object h(@l Function1 function10, @l a a0, @l d d0) {
        a a3;
        UpdatableAnimationState updatableAnimationState2;
        UpdatableAnimationState updatableAnimationState0;
        float f1;
        Function1 function11;
        a a1;
        androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero.1 updatableAnimationState$animateToZero$11;
        androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero.1 updatableAnimationState$animateToZero$10;
        if(d0 instanceof androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero.1) {
            updatableAnimationState$animateToZero$10 = (androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero.1)d0;
            int v = updatableAnimationState$animateToZero$10.q;
            if((v & 0x80000000) == 0) {
                updatableAnimationState$animateToZero$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    float n;
                    Object o;
                    int q;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.o = object0;
                        this.q |= 0x80000000;
                        return d0.h(null, null, this);
                    }
                };
            }
            else {
                updatableAnimationState$animateToZero$10.q = v ^ 0x80000000;
            }
        }
        else {
            updatableAnimationState$animateToZero$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                float n;
                Object o;
                int q;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.o = object0;
                    this.q |= 0x80000000;
                    return d0.h(null, null, this);
                }
            };
        }
        Object object0 = updatableAnimationState$animateToZero$10.o;
        Object object1 = b.l();
        switch(updatableAnimationState$animateToZero$10.q) {
            case 0: {
                f0.n(object0);
                if(this.c) {
                    throw new IllegalStateException("Check failed.");
                }
                MotionDurationScale motionDurationScale0 = (MotionDurationScale)updatableAnimationState$animateToZero$10.getContext().get(MotionDurationScale.n0);
                float f = motionDurationScale0 == null ? 1.0f : motionDurationScale0.T0();
                this.c = true;
                updatableAnimationState$animateToZero$11 = updatableAnimationState$animateToZero$10;
                a1 = a0;
                function11 = function10;
                f1 = f;
                updatableAnimationState0 = this;
                goto label_40;
            }
            case 1: {
                f1 = updatableAnimationState$animateToZero$10.n;
                a a2 = (a)updatableAnimationState$animateToZero$10.m;
                Function1 function12 = (Function1)updatableAnimationState$animateToZero$10.l;
                UpdatableAnimationState updatableAnimationState1 = (UpdatableAnimationState)updatableAnimationState$animateToZero$10.k;
                try {
                    f0.n(object0);
                    updatableAnimationState0 = updatableAnimationState1;
                    a1 = a2;
                    function11 = function12;
                    updatableAnimationState$animateToZero$11 = updatableAnimationState$animateToZero$10;
                }
                catch(Throwable throwable0) {
                    updatableAnimationState2 = updatableAnimationState1;
                    updatableAnimationState2.a = 0x8000000000000000L;
                    updatableAnimationState2.b = UpdatableAnimationState.g;
                    updatableAnimationState2.c = false;
                    throw throwable0;
                }
                try {
                    while(true) {
                        a1.invoke();
                        if(f1 == 0.0f) {
                            break;
                        }
                    label_40:
                        if(UpdatableAnimationState.e.c(updatableAnimationState0.d)) {
                            break;
                        }
                        androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero.3 updatableAnimationState$animateToZero$30 = new Function1(f1, function11) {
                            final UpdatableAnimationState e;
                            final float f;
                            final Function1 g;

                            {
                                this.e = updatableAnimationState0;
                                this.f = f;
                                this.g = function10;
                                super(1);
                            }

                            public final void a(long v) {
                                if(this.e.a == 0x8000000000000000L) {
                                    this.e.a = v;
                                }
                                AnimationVector1D animationVector1D0 = new AnimationVector1D(this.e.i());
                                long v1 = this.f == 0.0f ? UpdatableAnimationState.e.a().b(new AnimationVector1D(this.e.i()), UpdatableAnimationState.e.b(), this.e.b) : kotlin.math.b.N0(((float)(v - this.e.a)) / this.f);
                                float f = ((AnimationVector1D)UpdatableAnimationState.e.a().f(v1, animationVector1D0, UpdatableAnimationState.e.b(), this.e.b)).f();
                                AnimationVector1D animationVector1D1 = (AnimationVector1D)UpdatableAnimationState.e.a().e(v1, animationVector1D0, UpdatableAnimationState.e.b(), this.e.b);
                                this.e.b = animationVector1D1;
                                this.e.a = v;
                                this.e.j(f);
                                this.g.invoke(((float)(this.e.i() - f)));
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((Number)object0).longValue());
                                return S0.a;
                            }
                        };
                        updatableAnimationState$animateToZero$11.k = updatableAnimationState0;
                        updatableAnimationState$animateToZero$11.l = function11;
                        updatableAnimationState$animateToZero$11.m = a1;
                        updatableAnimationState$animateToZero$11.n = f1;
                        updatableAnimationState$animateToZero$11.q = 1;
                        if(MonotonicFrameClockKt.f(updatableAnimationState$animateToZero$30, updatableAnimationState$animateToZero$11) != object1) {
                            continue;
                        }
                        return object1;
                    }
                    a3 = a1;
                    updatableAnimationState2 = updatableAnimationState0;
                }
                catch(Throwable throwable0) {
                    updatableAnimationState2 = updatableAnimationState0;
                    updatableAnimationState2.a = 0x8000000000000000L;
                    updatableAnimationState2.b = UpdatableAnimationState.g;
                    updatableAnimationState2.c = false;
                    throw throwable0;
                }
                try {
                    if(Math.abs(updatableAnimationState2.d) != 0.0f) {
                        androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero.4 updatableAnimationState$animateToZero$40 = new Function1(function11) {
                            final UpdatableAnimationState e;
                            final Function1 f;

                            {
                                this.e = updatableAnimationState0;
                                this.f = function10;
                                super(1);
                            }

                            public final void a(long v) {
                                this.e.j(0.0f);
                                this.f.invoke(this.e.i());
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((Number)object0).longValue());
                                return S0.a;
                            }
                        };
                        updatableAnimationState$animateToZero$11.k = updatableAnimationState2;
                        updatableAnimationState$animateToZero$11.l = a3;
                        updatableAnimationState$animateToZero$11.m = null;
                        updatableAnimationState$animateToZero$11.q = 2;
                        if(MonotonicFrameClockKt.f(updatableAnimationState$animateToZero$40, updatableAnimationState$animateToZero$11) == object1) {
                            return object1;
                        }
                        goto label_66;
                    }
                    updatableAnimationState2.a = 0x8000000000000000L;
                    updatableAnimationState2.b = UpdatableAnimationState.g;
                    updatableAnimationState2.c = false;
                    return S0.a;
                }
                catch(Throwable throwable0) {
                    updatableAnimationState2.a = 0x8000000000000000L;
                    updatableAnimationState2.b = UpdatableAnimationState.g;
                    updatableAnimationState2.c = false;
                    throw throwable0;
                }
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a3 = (a)updatableAnimationState$animateToZero$10.l;
        updatableAnimationState2 = (UpdatableAnimationState)updatableAnimationState$animateToZero$10.k;
        try {
            f0.n(object0);
        label_66:
            a3.invoke();
            updatableAnimationState2.a = 0x8000000000000000L;
            updatableAnimationState2.b = UpdatableAnimationState.g;
            updatableAnimationState2.c = false;
            return S0.a;
        }
        catch(Throwable throwable0) {
        }
        updatableAnimationState2.a = 0x8000000000000000L;
        updatableAnimationState2.b = UpdatableAnimationState.g;
        updatableAnimationState2.c = false;
        throw throwable0;
    }

    public final float i() {
        return this.d;
    }

    public final void j(float f) {
        this.d = f;
    }
}

