package androidx.compose.foundation.gestures.snapping;

import A3.a;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.e;
import kotlin.jvm.internal.s0;
import kotlin.ranges.f;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,546:1\n543#1,4:558\n543#1,4:562\n76#2:547\n67#3,3:548\n66#3:551\n1114#4,6:552\n154#5:566\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n356#1:558,4\n423#1:562,4\n272#1:547\n274#1:548,3\n274#1:551\n274#1:552,6\n537#1:566\n*E\n"})
public final class SnapFlingBehaviorKt {
    private static final float a = 0.0f;
    public static final float b = 0.0f;
    public static final float c = 0.0f;
    private static final boolean d = false;

    static {
        SnapFlingBehaviorKt.a = 400.0f;
    }

    private static final Object f(ScrollScope scrollScope0, float f, AnimationState animationState0, DecayAnimationSpec decayAnimationSpec0, Function1 function10, d d0) {
        androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay.1 snapFlingBehaviorKt$animateDecay$10;
        if(d0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay.1) {
            snapFlingBehaviorKt$animateDecay$10 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay.1)d0;
            int v = snapFlingBehaviorKt$animateDecay$10.o;
            if((v & 0x80000000) == 0) {
                snapFlingBehaviorKt$animateDecay$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    float k;
                    Object l;
                    Object m;
                    Object n;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.n = object0;
                        this.o |= 0x80000000;
                        return SnapFlingBehaviorKt.f(null, 0.0f, null, null, null, this);
                    }
                };
            }
            else {
                snapFlingBehaviorKt$animateDecay$10.o = v ^ 0x80000000;
            }
        }
        else {
            snapFlingBehaviorKt$animateDecay$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                float k;
                Object l;
                Object m;
                Object n;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.n = object0;
                    this.o |= 0x80000000;
                    return SnapFlingBehaviorKt.f(null, 0.0f, null, null, null, this);
                }
            };
        }
        Object object0 = snapFlingBehaviorKt$animateDecay$10.n;
        Object object1 = b.l();
        switch(snapFlingBehaviorKt$animateDecay$10.o) {
            case 0: {
                f0.n(object0);
                e l0$e0 = new e();
                int v1 = ((Number)animationState0.h()).floatValue() == 0.0f ? 1 : 0;
                androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay.2 snapFlingBehaviorKt$animateDecay$20 = new Function1(f, l0$e0, scrollScope0, function10) {
                    final float e;
                    final e f;
                    final ScrollScope g;
                    final Function1 h;

                    {
                        this.e = f;
                        this.f = l0$e0;
                        this.g = scrollScope0;
                        this.h = function10;
                        super(1);
                    }

                    public final void a(@l AnimationScope animationScope0) {
                        L.p(animationScope0, "$this$animateDecay");
                        if(Math.abs(((Number)animationScope0.g()).floatValue()) >= Math.abs(this.e)) {
                            float f = SnapFlingBehaviorKt.j(((Number)animationScope0.g()).floatValue(), this.e);
                            SnapFlingBehaviorKt.g(animationScope0, this.g, this.h, f - this.f.a);
                            animationScope0.a();
                            this.f.a = f;
                            return;
                        }
                        float f1 = ((Number)animationScope0.g()).floatValue();
                        SnapFlingBehaviorKt.g(animationScope0, this.g, this.h, f1 - this.f.a);
                        this.f.a = ((Number)animationScope0.g()).floatValue();
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((AnimationScope)object0));
                        return S0.a;
                    }
                };
                snapFlingBehaviorKt$animateDecay$10.l = animationState0;
                snapFlingBehaviorKt$animateDecay$10.m = l0$e0;
                snapFlingBehaviorKt$animateDecay$10.k = f;
                snapFlingBehaviorKt$animateDecay$10.o = 1;
                return SuspendAnimationKt.j(animationState0, decayAnimationSpec0, ((boolean)(v1 ^ 1)), snapFlingBehaviorKt$animateDecay$20, snapFlingBehaviorKt$animateDecay$10) == object1 ? object1 : new AnimationResult(kotlin.coroutines.jvm.internal.b.e(f - l0$e0.a), animationState0);
            }
            case 1: {
                f = snapFlingBehaviorKt$animateDecay$10.k;
                e l0$e1 = (e)snapFlingBehaviorKt$animateDecay$10.m;
                animationState0 = (AnimationState)snapFlingBehaviorKt$animateDecay$10.l;
                f0.n(object0);
                return new AnimationResult(kotlin.coroutines.jvm.internal.b.e(f - l0$e1.a), animationState0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private static final void g(AnimationScope animationScope0, ScrollScope scrollScope0, Function1 function10, float f) {
        float f1 = scrollScope0.a(f);
        function10.invoke(f1);
        if(Math.abs(f - f1) > 0.5f) {
            animationScope0.a();
        }
    }

    private static final Object h(ScrollScope scrollScope0, float f, float f1, AnimationState animationState0, AnimationSpec animationSpec0, Function1 function10, d d0) {
        AnimationState animationState1;
        float f4;
        e l0$e1;
        float f3;
        androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateSnap.1 snapFlingBehaviorKt$animateSnap$10;
        if(d0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateSnap.1) {
            snapFlingBehaviorKt$animateSnap$10 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateSnap.1)d0;
            int v = snapFlingBehaviorKt$animateSnap$10.p;
            if((v & 0x80000000) == 0) {
                snapFlingBehaviorKt$animateSnap$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    float k;
                    float l;
                    Object m;
                    Object n;
                    Object o;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.o = object0;
                        this.p |= 0x80000000;
                        return SnapFlingBehaviorKt.h(null, 0.0f, 0.0f, null, null, null, this);
                    }
                };
            }
            else {
                snapFlingBehaviorKt$animateSnap$10.p = v ^ 0x80000000;
            }
        }
        else {
            snapFlingBehaviorKt$animateSnap$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                float k;
                float l;
                Object m;
                Object n;
                Object o;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.o = object0;
                    this.p |= 0x80000000;
                    return SnapFlingBehaviorKt.h(null, 0.0f, 0.0f, null, null, null, this);
                }
            };
        }
        Object object0 = snapFlingBehaviorKt$animateSnap$10.o;
        Object object1 = b.l();
        switch(snapFlingBehaviorKt$animateSnap$10.p) {
            case 0: {
                f0.n(object0);
                e l0$e0 = new e();
                float f2 = ((Number)animationState0.h()).floatValue();
                int v1 = ((Number)animationState0.h()).floatValue() == 0.0f ? 1 : 0;
                androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateSnap.2 snapFlingBehaviorKt$animateSnap$20 = new Function1(f1, l0$e0, scrollScope0, function10) {
                    final float e;
                    final e f;
                    final ScrollScope g;
                    final Function1 h;

                    {
                        this.e = f;
                        this.f = l0$e0;
                        this.g = scrollScope0;
                        this.h = function10;
                        super(1);
                    }

                    public final void a(@l AnimationScope animationScope0) {
                        L.p(animationScope0, "$this$animateTo");
                        float f = SnapFlingBehaviorKt.j(((Number)animationScope0.g()).floatValue(), this.e);
                        float f1 = f - this.f.a;
                        float f2 = this.g.a(f1);
                        this.h.invoke(f2);
                        if(Math.abs(f1 - f2) > 0.5f || f != ((Number)animationScope0.g()).floatValue()) {
                            animationScope0.a();
                        }
                        this.f.a += f2;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((AnimationScope)object0));
                        return S0.a;
                    }
                };
                snapFlingBehaviorKt$animateSnap$10.m = animationState0;
                snapFlingBehaviorKt$animateSnap$10.n = l0$e0;
                f3 = f;
                snapFlingBehaviorKt$animateSnap$10.k = f3;
                snapFlingBehaviorKt$animateSnap$10.l = f2;
                snapFlingBehaviorKt$animateSnap$10.p = 1;
                if(SuspendAnimationKt.l(animationState0, kotlin.coroutines.jvm.internal.b.e(f), animationSpec0, ((boolean)(v1 ^ 1)), snapFlingBehaviorKt$animateSnap$20, snapFlingBehaviorKt$animateSnap$10) == object1) {
                    return object1;
                }
                l0$e1 = l0$e0;
                f4 = f2;
                animationState1 = animationState0;
                break;
            }
            case 1: {
                f4 = snapFlingBehaviorKt$animateSnap$10.l;
                float f5 = snapFlingBehaviorKt$animateSnap$10.k;
                l0$e1 = (e)snapFlingBehaviorKt$animateSnap$10.n;
                AnimationState animationState2 = (AnimationState)snapFlingBehaviorKt$animateSnap$10.m;
                f0.n(object0);
                f3 = f5;
                animationState1 = animationState2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        float f6 = SnapFlingBehaviorKt.j(((Number)animationState1.h()).floatValue(), f4);
        return new AnimationResult(kotlin.coroutines.jvm.internal.b.e(f3 - l0$e1.a), AnimationStateKt.g(animationState1, 0.0f, f6, 0L, 0L, false, 29, null));
    }

    private static final Object i(ScrollScope scrollScope0, float f, float f1, ApproachAnimation approachAnimation0, SnapLayoutInfoProvider snapLayoutInfoProvider0, Density density0, Function1 function10, d d0) {
        androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.approach.1 snapFlingBehaviorKt$approach$10;
        if(d0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.approach.1) {
            snapFlingBehaviorKt$approach$10 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.approach.1)d0;
            int v = snapFlingBehaviorKt$approach$10.n;
            if((v & 0x80000000) == 0) {
                snapFlingBehaviorKt$approach$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.n |= 0x80000000;
                        return SnapFlingBehaviorKt.i(null, 0.0f, 0.0f, null, null, null, null, this);
                    }
                };
            }
            else {
                snapFlingBehaviorKt$approach$10.n = v ^ 0x80000000;
            }
        }
        else {
            snapFlingBehaviorKt$approach$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.n |= 0x80000000;
                    return SnapFlingBehaviorKt.i(null, 0.0f, 0.0f, null, null, null, null, this);
                }
            };
        }
        Object object0 = snapFlingBehaviorKt$approach$10.m;
        Object object1 = b.l();
        switch(snapFlingBehaviorKt$approach$10.n) {
            case 0: {
                f0.n(object0);
                snapFlingBehaviorKt$approach$10.k = snapLayoutInfoProvider0;
                snapFlingBehaviorKt$approach$10.l = density0;
                snapFlingBehaviorKt$approach$10.n = 1;
                object0 = approachAnimation0.a(scrollScope0, kotlin.coroutines.jvm.internal.b.e(f), kotlin.coroutines.jvm.internal.b.e(f1), function10, snapFlingBehaviorKt$approach$10);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                density0 = (Density)snapFlingBehaviorKt$approach$10.l;
                snapLayoutInfoProvider0 = (SnapLayoutInfoProvider)snapFlingBehaviorKt$approach$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        AnimationState animationState0 = ((AnimationResult)object0).b();
        return new AnimationResult(kotlin.coroutines.jvm.internal.b.e(SnapFlingBehaviorKt.n(((Number)animationState0.h()).floatValue(), snapLayoutInfoProvider0, density0)), animationState0);
    }

    private static final float j(float f, float f1) {
        if(f1 == 0.0f) {
            return 0.0f;
        }
        return f1 > 0.0f ? s.A(f, f1) : s.t(f, f1);
    }

    private static final Comparable k(f f0) {
        L.p(f0, "<this>");
        return f0.getStart();
    }

    private static final Comparable l(f f0) {
        L.p(f0, "<this>");
        return f0.d();
    }

    private static final void m(a a0) {
    }

    public static final float n(float f, @l SnapLayoutInfoProvider snapLayoutInfoProvider0, @l Density density0) {
        L.p(snapLayoutInfoProvider0, "snapLayoutInfoProvider");
        L.p(density0, "density");
        f f1 = snapLayoutInfoProvider0.b(density0);
        float f2 = ((Number)SnapFlingBehaviorKt.k(f1)).floatValue();
        float f3 = ((Number)SnapFlingBehaviorKt.l(f1)).floatValue();
        float f4 = Math.signum(f);
        if(f4 != 0.0f) {
            if(f4 == 1.0f) {
                return SnapFlingBehaviorKt.o(f3) ? f3 : 0.0f;
            }
            if(f4 != -1.0f) {
                f2 = 0.0f;
            }
        }
        else if(Math.abs(f3) <= Math.abs(f2)) {
            return SnapFlingBehaviorKt.o(f3) ? f3 : 0.0f;
        }
        return SnapFlingBehaviorKt.o(f2) ? f2 : 0.0f;
    }

    private static final boolean o(float f) {
        return f != Infinityf && f != -Infinityf;
    }

    public static final float p() [...] // 潜在的解密器

    @ExperimentalFoundationApi
    @Composable
    @l
    public static final SnapFlingBehavior q(@l SnapLayoutInfoProvider snapLayoutInfoProvider0, @m Composer composer0, int v) {
        L.p(snapLayoutInfoProvider0, "snapLayoutInfoProvider");
        composer0.V(0xE3BF91D8);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xE3BF91D8, v, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:268)");
        }
        Object object0 = composer0.L(CompositionLocalsKt.i());
        DecayAnimationSpec decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.b(composer0, 0);
        composer0.V(0x607FB4C4);
        boolean z = composer0.t(snapLayoutInfoProvider0);
        boolean z1 = composer0.t(decayAnimationSpec0);
        boolean z2 = composer0.t(((Density)object0));
        SnapFlingBehavior snapFlingBehavior0 = composer0.W();
        if((z | z1 | z2) != 0 || snapFlingBehavior0 == Composer.a.a()) {
            SnapFlingBehavior snapFlingBehavior1 = new SnapFlingBehavior(snapLayoutInfoProvider0, AnimationSpecKt.q(0, 0, EasingKt.c(), 3, null), decayAnimationSpec0, AnimationSpecKt.o(0.0f, 400.0f, null, 5, null), ((Density)object0), 0.0f, 0x20, null);
            composer0.O(snapFlingBehavior1);
            snapFlingBehavior0 = snapFlingBehavior1;
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return snapFlingBehavior0;
    }
}

