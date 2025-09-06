package androidx.compose.animation.core;

import A3.a;
import A3.o;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
public final class SuspendAnimationKt {
    public static final Object a(Animation animation0, Function1 function10, d d0) {
        return SuspendAnimationKt.n(animation0, function10, d0);
    }

    @m
    public static final Object c(float f, float f1, float f2, @l AnimationSpec animationSpec0, @l o o0, @l d d0) {
        Object object0 = SuspendAnimationKt.e(VectorConvertersKt.i(A.a), b.e(f), b.e(f1), b.e(f2), animationSpec0, o0, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    @m
    public static final Object d(@l AnimationState animationState0, @l Animation animation0, long v, @l Function1 function10, @l d d0) {
        Animation animation2;
        Function1 function12;
        h l0$h1;
        AnimationState animationState2;
        Function1 function11;
        androidx.compose.animation.core.SuspendAnimationKt.animate.4 suspendAnimationKt$animate$40;
        AnimationState animationState1 = animationState0;
        Animation animation1 = animation0;
        if(d0 instanceof androidx.compose.animation.core.SuspendAnimationKt.animate.4) {
            suspendAnimationKt$animate$40 = (androidx.compose.animation.core.SuspendAnimationKt.animate.4)d0;
            int v1 = suspendAnimationKt$animate$40.p;
            if((v1 & 0x80000000) == 0) {
                suspendAnimationKt$animate$40 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.o = object0;
                        this.p |= 0x80000000;
                        return SuspendAnimationKt.d(null, null, 0L, null, this);
                    }
                };
            }
            else {
                suspendAnimationKt$animate$40.p = v1 ^ 0x80000000;
            }
        }
        else {
            suspendAnimationKt$animate$40 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.o = object0;
                    this.p |= 0x80000000;
                    return SuspendAnimationKt.d(null, null, 0L, null, this);
                }
            };
        }
        Object object0 = suspendAnimationKt$animate$40.o;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(suspendAnimationKt$animate$40.p) {
            case 0: {
                f0.n(object0);
                Object object2 = animation1.e(0L);
                AnimationVector animationVector0 = animation1.g(0L);
                h l0$h0 = new h();
                try {
                    if(v == 0x8000000000000000L) {
                        androidx.compose.animation.core.SuspendAnimationKt.animate.6 suspendAnimationKt$animate$60 = new Function1(l0$h0, object2, animation0, animationVector0, animationState0, SuspendAnimationKt.q(suspendAnimationKt$animate$40.getContext()), function10) {
                            final h e;
                            final Object f;
                            final Animation g;
                            final AnimationVector h;
                            final AnimationState i;
                            final float j;
                            final Function1 k;

                            {
                                this.e = l0$h0;
                                this.f = object0;
                                this.g = animation0;
                                this.h = animationVector0;
                                this.i = animationState0;
                                this.j = f;
                                this.k = function10;
                                super(1);
                            }

                            public final void a(long v) {
                                TwoWayConverter twoWayConverter0 = this.g.d();
                                Object object0 = this.g.f();
                                androidx.compose.animation.core.SuspendAnimationKt.animate.6.1 suspendAnimationKt$animate$6$10 = new a() {
                                    final AnimationState e;

                                    {
                                        this.e = animationState0;
                                        super(0);
                                    }

                                    @Override  // A3.a
                                    public Object invoke() {
                                        this.invoke();
                                        return S0.a;
                                    }

                                    public final void invoke() {
                                        this.e.o(false);
                                    }
                                };
                                AnimationScope animationScope0 = new AnimationScope(this.f, twoWayConverter0, this.h, v, object0, v, true, suspendAnimationKt$animate$6$10);
                                SuspendAnimationKt.p(animationScope0, v, this.j, this.g, this.i, this.k);
                                this.e.a = animationScope0;
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((Number)object0).longValue());
                                return S0.a;
                            }
                        };
                        suspendAnimationKt$animate$40.k = animationState1;
                        suspendAnimationKt$animate$40.l = animation1;
                        function11 = function10;
                        suspendAnimationKt$animate$40.m = function11;
                        suspendAnimationKt$animate$40.n = l0$h0;
                        suspendAnimationKt$animate$40.p = 1;
                        if(SuspendAnimationKt.n(animation1, suspendAnimationKt$animate$60, suspendAnimationKt$animate$40) == object1) {
                            return object1;
                        }
                    }
                    else {
                        function11 = function10;
                        AnimationScope animationScope0 = new AnimationScope(object2, animation0.d(), animationVector0, v, animation0.f(), v, true, new a(animationState1) {
                            final AnimationState e;

                            {
                                this.e = animationState0;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                this.e.o(false);
                            }
                        });
                        SuspendAnimationKt.p(animationScope0, v, SuspendAnimationKt.q(suspendAnimationKt$animate$40.getContext()), animation0, animationState0, function10);
                        l0$h0.a = animationScope0;
                    }
                    animationState2 = animationState1;
                    l0$h1 = l0$h0;
                    goto label_51;
                }
                catch(CancellationException cancellationException0) {
                    l0$h1 = l0$h0;
                    goto label_65;
                }
            }
            case 1: {
                l0$h1 = (h)suspendAnimationKt$animate$40.n;
                function12 = (Function1)suspendAnimationKt$animate$40.m;
                animation2 = (Animation)suspendAnimationKt$animate$40.l;
                animationState2 = (AnimationState)suspendAnimationKt$animate$40.k;
                goto label_48;
            }
            case 2: {
                l0$h1 = (h)suspendAnimationKt$animate$40.n;
                function12 = (Function1)suspendAnimationKt$animate$40.m;
                animation2 = (Animation)suspendAnimationKt$animate$40.l;
                animationState2 = (AnimationState)suspendAnimationKt$animate$40.k;
                try {
                label_48:
                    f0.n(object0);
                    function11 = function12;
                    animation1 = animation2;
                    do {
                    label_51:
                        Object object3 = l0$h1.a;
                        L.m(object3);
                        if(!((AnimationScope)object3).j()) {
                            return S0.a;
                        }
                        androidx.compose.animation.core.SuspendAnimationKt.animate.9 suspendAnimationKt$animate$90 = new Function1(l0$h1, SuspendAnimationKt.q(suspendAnimationKt$animate$40.getContext()), animation1, animationState2, function11) {
                            final h e;
                            final float f;
                            final Animation g;
                            final AnimationState h;
                            final Function1 i;

                            {
                                this.e = l0$h0;
                                this.f = f;
                                this.g = animation0;
                                this.h = animationState0;
                                this.i = function10;
                                super(1);
                            }

                            public final void a(long v) {
                                Object object0 = this.e.a;
                                L.m(object0);
                                SuspendAnimationKt.p(((AnimationScope)object0), v, this.f, this.g, this.h, this.i);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((Number)object0).longValue());
                                return S0.a;
                            }
                        };
                        suspendAnimationKt$animate$40.k = animationState2;
                        suspendAnimationKt$animate$40.l = animation1;
                        suspendAnimationKt$animate$40.m = function11;
                        suspendAnimationKt$animate$40.n = l0$h1;
                        suspendAnimationKt$animate$40.p = 2;
                    }
                    while(SuspendAnimationKt.n(animation1, suspendAnimationKt$animate$90, suspendAnimationKt$animate$40) != object1);
                    return object1;
                }
                catch(CancellationException cancellationException0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        animationState1 = animationState2;
    label_65:
        AnimationScope animationScope1 = (AnimationScope)l0$h1.a;
        if(animationScope1 != null) {
            animationScope1.m(false);
        }
        AnimationScope animationScope2 = (AnimationScope)l0$h1.a;
        if(animationScope2 != null && animationScope2.c() == animationState1.d()) {
            animationState1.o(false);
        }
        throw cancellationException0;
    }

    @m
    public static final Object e(@l TwoWayConverter twoWayConverter0, Object object0, Object object1, @m Object object2, @l AnimationSpec animationSpec0, @l o o0, @l d d0) {
        AnimationVector animationVector0;
        if(object2 == null) {
            animationVector0 = AnimationVectorsKt.g(((AnimationVector)twoWayConverter0.a().invoke(object0)));
        }
        else {
            animationVector0 = (AnimationVector)twoWayConverter0.a().invoke(object2);
            if(animationVector0 == null) {
                animationVector0 = AnimationVectorsKt.g(((AnimationVector)twoWayConverter0.a().invoke(object0)));
            }
        }
        TargetBasedAnimation targetBasedAnimation0 = new TargetBasedAnimation(animationSpec0, twoWayConverter0, object0, object1, animationVector0);
        Object object3 = SuspendAnimationKt.g(new AnimationState(twoWayConverter0, object0, animationVector0, 0L, 0L, false, 56, null), targetBasedAnimation0, 0L, new Function1(o0, twoWayConverter0) {
            final o e;
            final TwoWayConverter f;

            {
                this.e = o0;
                this.f = twoWayConverter0;
                super(1);
            }

            public final void a(@l AnimationScope animationScope0) {
                L.p(animationScope0, "$this$animate");
                Object object0 = animationScope0.g();
                Object object1 = this.f.b().invoke(animationScope0.i());
                this.e.invoke(object0, object1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((AnimationScope)object0));
                return S0.a;
            }
        }, d0, 2, null);
        return object3 == kotlin.coroutines.intrinsics.b.l() ? object3 : S0.a;
    }

    public static Object f(float f, float f1, float f2, AnimationSpec animationSpec0, o o0, d d0, int v, Object object0) {
        if((v & 8) != 0) {
            animationSpec0 = AnimationSpecKt.o(0.0f, 0.0f, null, 7, null);
        }
        return SuspendAnimationKt.c(f, f1, ((v & 4) == 0 ? f2 : 0.0f), animationSpec0, o0, d0);
    }

    public static Object g(AnimationState animationState0, Animation animation0, long v, Function1 function10, d d0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x8000000000000000L;
        }
        if((v1 & 4) != 0) {
            function10 = androidx.compose.animation.core.SuspendAnimationKt.animate.5.e;
        }
        return SuspendAnimationKt.d(animationState0, animation0, v, function10, d0);

        final class androidx.compose.animation.core.SuspendAnimationKt.animate.5 extends N implements Function1 {
            public static final androidx.compose.animation.core.SuspendAnimationKt.animate.5 e;

            static {
                androidx.compose.animation.core.SuspendAnimationKt.animate.5.e = new androidx.compose.animation.core.SuspendAnimationKt.animate.5();
            }

            androidx.compose.animation.core.SuspendAnimationKt.animate.5() {
                super(1);
            }

            public final void a(@l AnimationScope animationScope0) {
                L.p(animationScope0, "$this$null");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((AnimationScope)object0));
                return S0.a;
            }
        }

    }

    public static Object h(TwoWayConverter twoWayConverter0, Object object0, Object object1, Object object2, AnimationSpec animationSpec0, o o0, d d0, int v, Object object3) {
        Object object4 = (v & 8) == 0 ? object2 : null;
        return (v & 16) == 0 ? SuspendAnimationKt.e(twoWayConverter0, object0, object1, object4, animationSpec0, o0, d0) : SuspendAnimationKt.e(twoWayConverter0, object0, object1, object4, AnimationSpecKt.o(0.0f, 0.0f, null, 7, null), o0, d0);
    }

    @m
    public static final Object i(float f, float f1, @l FloatDecayAnimationSpec floatDecayAnimationSpec0, @l o o0, @l d d0) {
        DecayAnimation decayAnimation0 = AnimationKt.a(floatDecayAnimationSpec0, f, f1);
        Object object0 = SuspendAnimationKt.g(AnimationStateKt.c(f, f1, 0L, 0L, false, 28, null), decayAnimation0, 0L, new Function1(o0) {
            final o e;

            {
                this.e = o0;
                super(1);
            }

            public final void a(@l AnimationScope animationScope0) {
                L.p(animationScope0, "$this$animate");
                Object object0 = animationScope0.g();
                Float float0 = ((AnimationVector1D)animationScope0.i()).f();
                this.e.invoke(object0, float0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((AnimationScope)object0));
                return S0.a;
            }
        }, d0, 2, null);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    @m
    public static final Object j(@l AnimationState animationState0, @l DecayAnimationSpec decayAnimationSpec0, boolean z, @l Function1 function10, @l d d0) {
        Object object0 = SuspendAnimationKt.d(animationState0, new DecayAnimation(decayAnimationSpec0, animationState0.g(), animationState0.getValue(), animationState0.j()), (z ? animationState0.d() : 0x8000000000000000L), function10, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    public static Object k(AnimationState animationState0, DecayAnimationSpec decayAnimationSpec0, boolean z, Function1 function10, d d0, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            function10 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay.4.e;
        }
        return SuspendAnimationKt.j(animationState0, decayAnimationSpec0, z, function10, d0);

        final class androidx.compose.animation.core.SuspendAnimationKt.animateDecay.4 extends N implements Function1 {
            public static final androidx.compose.animation.core.SuspendAnimationKt.animateDecay.4 e;

            static {
                androidx.compose.animation.core.SuspendAnimationKt.animateDecay.4.e = new androidx.compose.animation.core.SuspendAnimationKt.animateDecay.4();
            }

            androidx.compose.animation.core.SuspendAnimationKt.animateDecay.4() {
                super(1);
            }

            public final void a(@l AnimationScope animationScope0) {
                L.p(animationScope0, "$this$null");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((AnimationScope)object0));
                return S0.a;
            }
        }

    }

    @m
    public static final Object l(@l AnimationState animationState0, Object object0, @l AnimationSpec animationSpec0, boolean z, @l Function1 function10, @l d d0) {
        Object object1 = SuspendAnimationKt.d(animationState0, new TargetBasedAnimation(animationSpec0, animationState0.g(), animationState0.getValue(), object0, animationState0.j()), (z ? animationState0.d() : 0x8000000000000000L), function10, d0);
        return object1 == kotlin.coroutines.intrinsics.b.l() ? object1 : S0.a;
    }

    public static Object m(AnimationState animationState0, Object object0, AnimationSpec animationSpec0, boolean z, Function1 function10, d d0, int v, Object object1) {
        if((v & 2) != 0) {
            animationSpec0 = AnimationSpecKt.o(0.0f, 0.0f, null, 7, null);
        }
        if((v & 8) != 0) {
            function10 = androidx.compose.animation.core.SuspendAnimationKt.animateTo.2.e;
        }
        return SuspendAnimationKt.l(animationState0, object0, animationSpec0, ((v & 4) == 0 ? z : false), function10, d0);

        final class androidx.compose.animation.core.SuspendAnimationKt.animateTo.2 extends N implements Function1 {
            public static final androidx.compose.animation.core.SuspendAnimationKt.animateTo.2 e;

            static {
                androidx.compose.animation.core.SuspendAnimationKt.animateTo.2.e = new androidx.compose.animation.core.SuspendAnimationKt.animateTo.2();
            }

            androidx.compose.animation.core.SuspendAnimationKt.animateTo.2() {
                super(1);
            }

            public final void a(@l AnimationScope animationScope0) {
                L.p(animationScope0, "$this$null");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((AnimationScope)object0));
                return S0.a;
            }
        }

    }

    // 去混淆评级： 低(20)
    private static final Object n(Animation animation0, Function1 function10, d d0) {
        return animation0.a() ? InfiniteAnimationPolicyKt.c(function10, d0) : MonotonicFrameClockKt.f(new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            public final Object a(long v) {
                return this.e.invoke(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).longValue());
            }
        }, d0);
    }

    private static final void o(AnimationScope animationScope0, long v, long v1, Animation animation0, AnimationState animationState0, Function1 function10) {
        animationScope0.l(v);
        animationScope0.n(animation0.e(v1));
        animationScope0.o(animation0.g(v1));
        if(animation0.b(v1)) {
            animationScope0.k(animationScope0.c());
            animationScope0.m(false);
        }
        SuspendAnimationKt.r(animationScope0, animationState0);
        function10.invoke(animationScope0);
    }

    private static final void p(AnimationScope animationScope0, long v, float f, Animation animation0, AnimationState animationState0, Function1 function10) {
        SuspendAnimationKt.o(animationScope0, v, (f == 0.0f ? animation0.c() : ((long)(((float)(v - animationScope0.d())) / f))), animation0, animationState0, function10);
    }

    public static final float q(@l g g0) {
        L.p(g0, "<this>");
        MotionDurationScale motionDurationScale0 = (MotionDurationScale)g0.get(MotionDurationScale.n0);
        float f = motionDurationScale0 == null ? 1.0f : motionDurationScale0.T0();
        if(f < 0.0f) {
            throw new IllegalStateException("Check failed.");
        }
        return f;
    }

    public static final void r(@l AnimationScope animationScope0, @l AnimationState animationState0) {
        L.p(animationScope0, "<this>");
        L.p(animationState0, "state");
        animationState0.p(animationScope0.g());
        AnimationVectorsKt.f(animationState0.j(), animationScope0.i());
        animationState0.m(animationScope0.b());
        animationState0.n(animationScope0.c());
        animationState0.o(animationScope0.j());
    }
}

