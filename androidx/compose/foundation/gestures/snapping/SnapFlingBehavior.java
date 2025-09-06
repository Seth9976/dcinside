package androidx.compose.foundation.gestures.snapping;

import A3.o;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.e;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@s0({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n1#1,546:1\n1#2:547\n543#3,4:548\n543#3,4:552\n543#3,4:556\n543#3,4:560\n543#3,4:564\n543#3,4:568\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n*L\n120#1:548,4\n148#1:552,4\n168#1:556,4\n185#1:560,4\n208#1:564,4\n211#1:568,4\n*E\n"})
public final class SnapFlingBehavior implements FlingBehavior {
    @l
    private final SnapLayoutInfoProvider a;
    @l
    private final AnimationSpec b;
    @l
    private final DecayAnimationSpec c;
    @l
    private final AnimationSpec d;
    @l
    private final Density e;
    private final float f;
    private final float g;
    @l
    private MotionDurationScale h;
    public static final int i;

    static {
    }

    private SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider0, AnimationSpec animationSpec0, DecayAnimationSpec decayAnimationSpec0, AnimationSpec animationSpec1, Density density0, float f) {
        this.a = snapLayoutInfoProvider0;
        this.b = animationSpec0;
        this.c = decayAnimationSpec0;
        this.d = animationSpec1;
        this.e = density0;
        this.f = f;
        this.g = density0.y1(f);
        this.h = ScrollableKt.f();
    }

    public SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider0, AnimationSpec animationSpec0, DecayAnimationSpec decayAnimationSpec0, AnimationSpec animationSpec1, Density density0, float f, int v, w w0) {
        this(snapLayoutInfoProvider0, animationSpec0, decayAnimationSpec0, animationSpec1, density0, ((v & 0x20) == 0 ? f : 400.0f), null);
    }

    public SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider0, AnimationSpec animationSpec0, DecayAnimationSpec decayAnimationSpec0, AnimationSpec animationSpec1, Density density0, float f, w w0) {
        this(snapLayoutInfoProvider0, animationSpec0, decayAnimationSpec0, animationSpec1, density0, f);
    }

    @Override  // androidx.compose.foundation.gestures.FlingBehavior
    @m
    public Object a(@l ScrollScope scrollScope0, float f, @l d d0) {
        return this.k(scrollScope0, f, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling.2.e, d0);

        final class androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling.2 extends N implements Function1 {
            public static final androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling.2 e;

            static {
                androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling.2.e = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling.2();
            }

            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling.2() {
                super(1);
            }

            public final void b(float f) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

    }

    public static final Object e(SnapFlingBehavior snapFlingBehavior0, ScrollScope scrollScope0, float f, float f1, Function1 function10, d d0) {
        return snapFlingBehavior0.l(scrollScope0, f, f1, function10, d0);
    }

    // 去混淆评级： 中等(70)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof SnapFlingBehavior && L.g(((SnapFlingBehavior)object0).d, this.d) && L.g(((SnapFlingBehavior)object0).c, this.c) && L.g(((SnapFlingBehavior)object0).b, this.b) && L.g(((SnapFlingBehavior)object0).a, this.a) && L.g(((SnapFlingBehavior)object0).e, this.e) && Dp.l(((SnapFlingBehavior)object0).f, this.f);
    }

    private final Object g(ScrollScope scrollScope0, float f, Function1 function10, d d0) {
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling.1 snapFlingBehavior$fling$10;
        if(d0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling.1) {
            snapFlingBehavior$fling$10 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling.1)d0;
            int v = snapFlingBehavior$fling$10.n;
            if((v & 0x80000000) == 0) {
                snapFlingBehavior$fling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.g(null, 0.0f, null, this);
                    }
                };
            }
            else {
                snapFlingBehavior$fling$10.n = v ^ 0x80000000;
            }
        }
        else {
            snapFlingBehavior$fling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return d0.g(null, 0.0f, null, this);
                }
            };
        }
        Object object0 = snapFlingBehavior$fling$10.l;
        Object object1 = b.l();
        switch(snapFlingBehavior$fling$10.n) {
            case 0: {
                f0.n(object0);
                MotionDurationScale motionDurationScale0 = this.h;
                androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling.result.1 snapFlingBehavior$fling$result$10 = new o(this, scrollScope0, function10, null) {
                    int k;
                    final float l;
                    final SnapFlingBehavior m;
                    final ScrollScope n;
                    final Function1 o;

                    {
                        this.l = f;
                        this.m = snapFlingBehavior0;
                        this.n = scrollScope0;
                        this.o = function10;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling.result.1(this.l, this.m, this.n, this.o, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling.result.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                if(Math.abs(this.l) <= Math.abs(this.m.g)) {
                                    this.k = 1;
                                    object0 = this.m.n(this.n, this.l, this.o, this);
                                    return object0 == object1 ? object1 : ((AnimationResult)object0);
                                }
                                this.k = 2;
                                object0 = this.m.j(this.n, this.l, this.o, this);
                                return object0 == object1 ? object1 : ((AnimationResult)object0);
                            }
                            case 1: {
                                f0.n(object0);
                                return (AnimationResult)object0;
                            }
                            case 2: {
                                f0.n(object0);
                                return (AnimationResult)object0;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                snapFlingBehavior$fling$10.k = function10;
                snapFlingBehavior$fling$10.n = 1;
                object0 = i.h(motionDurationScale0, snapFlingBehavior$fling$result$10, snapFlingBehavior$fling$10);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                function10 = (Function1)snapFlingBehavior$fling$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        function10.invoke(kotlin.coroutines.jvm.internal.b.e(0.0f));
        return (AnimationResult)object0;
    }

    @l
    public final MotionDurationScale h() {
        return this.h;
    }

    @Override
    public int hashCode() {
        return ((((this.d.hashCode() * 0x1F + this.c.hashCode()) * 0x1F + this.b.hashCode()) * 0x1F + this.a.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + Dp.n(this.f);
    }

    private final boolean i(float f, float f1) {
        return Math.abs(DecayAnimationSpecKt.a(this.c, 0.0f, f1)) >= Math.abs(f) + this.a.a(this.e);
    }

    private final Object j(ScrollScope scrollScope0, float f, Function1 function10, d d0) {
        ScrollScope scrollScope1;
        e l0$e1;
        Function1 function11;
        SnapFlingBehavior snapFlingBehavior0;
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.longSnap.1 snapFlingBehavior$longSnap$10;
        if(d0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.longSnap.1) {
            snapFlingBehavior$longSnap$10 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.longSnap.1)d0;
            int v = snapFlingBehavior$longSnap$10.q;
            if((v & 0x80000000) == 0) {
                snapFlingBehavior$longSnap$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    int q;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.o = object0;
                        this.q |= 0x80000000;
                        return d0.j(null, 0.0f, null, this);
                    }
                };
            }
            else {
                snapFlingBehavior$longSnap$10.q = v ^ 0x80000000;
            }
        }
        else {
            snapFlingBehavior$longSnap$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                int q;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.o = object0;
                    this.q |= 0x80000000;
                    return d0.j(null, 0.0f, null, this);
                }
            };
        }
        Object object0 = snapFlingBehavior$longSnap$10.o;
        Object object1 = b.l();
        switch(snapFlingBehavior$longSnap$10.q) {
            case 0: {
                f0.n(object0);
                float f1 = Math.abs(this.a.c(this.e, f)) * Math.signum(f);
                e l0$e0 = new e();
                l0$e0.a = f1;
                function10.invoke(kotlin.coroutines.jvm.internal.b.e(f1));
                androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.longSnap.3 snapFlingBehavior$longSnap$30 = new Function1(function10) {
                    final e e;
                    final Function1 f;

                    {
                        this.e = l0$e0;
                        this.f = function10;
                        super(1);
                    }

                    public final void b(float f) {
                        float f1 = this.e.a - f;
                        this.e.a = f1;
                        this.f.invoke(f1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.b(((Number)object0).floatValue());
                        return S0.a;
                    }
                };
                snapFlingBehavior$longSnap$10.k = this;
                snapFlingBehavior$longSnap$10.l = scrollScope0;
                snapFlingBehavior$longSnap$10.m = function10;
                snapFlingBehavior$longSnap$10.n = l0$e0;
                snapFlingBehavior$longSnap$10.q = 1;
                object0 = this.l(scrollScope0, f1, f, snapFlingBehavior$longSnap$30, snapFlingBehavior$longSnap$10);
                if(object0 == object1) {
                    return object1;
                }
                snapFlingBehavior0 = this;
                function11 = function10;
                l0$e1 = l0$e0;
                scrollScope1 = scrollScope0;
                break;
            }
            case 1: {
                l0$e1 = (e)snapFlingBehavior$longSnap$10.n;
                function11 = (Function1)snapFlingBehavior$longSnap$10.m;
                ScrollScope scrollScope2 = (ScrollScope)snapFlingBehavior$longSnap$10.l;
                snapFlingBehavior0 = (SnapFlingBehavior)snapFlingBehavior$longSnap$10.k;
                f0.n(object0);
                scrollScope1 = scrollScope2;
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
        float f2 = ((Number)((AnimationResult)object0).a()).floatValue();
        AnimationState animationState0 = ((AnimationResult)object0).b();
        l0$e1.a = f2;
        AnimationState animationState1 = AnimationStateKt.g(animationState0, 0.0f, 0.0f, 0L, 0L, false, 30, null);
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.longSnap.5 snapFlingBehavior$longSnap$50 = new Function1(function11) {
            final e e;
            final Function1 f;

            {
                this.e = l0$e0;
                this.f = function10;
                super(1);
            }

            public final void b(float f) {
                float f1 = this.e.a - f;
                this.e.a = f1;
                this.f.invoke(f1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((Number)object0).floatValue());
                return S0.a;
            }
        };
        snapFlingBehavior$longSnap$10.k = null;
        snapFlingBehavior$longSnap$10.l = null;
        snapFlingBehavior$longSnap$10.m = null;
        snapFlingBehavior$longSnap$10.n = null;
        snapFlingBehavior$longSnap$10.q = 2;
        object0 = SnapFlingBehaviorKt.h(scrollScope1, f2, f2, animationState1, snapFlingBehavior0.d, snapFlingBehavior$longSnap$50, snapFlingBehavior$longSnap$10);
        return object0 == object1 ? object1 : object0;
    }

    @m
    public final Object k(@l ScrollScope scrollScope0, float f, @l Function1 function10, @l d d0) {
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling.3 snapFlingBehavior$performFling$30;
        if(d0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling.3) {
            snapFlingBehavior$performFling$30 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling.3)d0;
            int v = snapFlingBehavior$performFling$30.m;
            if((v & 0x80000000) == 0) {
                snapFlingBehavior$performFling$30 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.m |= 0x80000000;
                        return d0.k(null, 0.0f, null, this);
                    }
                };
            }
            else {
                snapFlingBehavior$performFling$30.m = v ^ 0x80000000;
            }
        }
        else {
            snapFlingBehavior$performFling$30 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.k = object0;
                    this.m |= 0x80000000;
                    return d0.k(null, 0.0f, null, this);
                }
            };
        }
        Object object0 = snapFlingBehavior$performFling$30.k;
        Object object1 = b.l();
        switch(snapFlingBehavior$performFling$30.m) {
            case 0: {
                f0.n(object0);
                snapFlingBehavior$performFling$30.m = 1;
                object0 = this.g(scrollScope0, f, function10, snapFlingBehavior$performFling$30);
                return object0 == object1 ? object1 : kotlin.coroutines.jvm.internal.b.e((((Number)((AnimationResult)object0).a()).floatValue() == 0.0f ? 0.0f : ((Number)((AnimationResult)object0).b().h()).floatValue()));
            }
            case 1: {
                f0.n(object0);
                return kotlin.coroutines.jvm.internal.b.e((((Number)((AnimationResult)object0).a()).floatValue() == 0.0f ? 0.0f : ((Number)((AnimationResult)object0).b().h()).floatValue()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // 去混淆评级： 低(20)
    private final Object l(ScrollScope scrollScope0, float f, float f1, Function1 function10, d d0) {
        return this.i(f, f1) ? SnapFlingBehaviorKt.i(scrollScope0, f, f1, new HighVelocityApproachAnimation(this.c), this.a, this.e, function10, d0) : SnapFlingBehaviorKt.i(scrollScope0, f, f1, new LowVelocityApproachAnimation(this.b, this.a, this.e), this.a, this.e, function10, d0);
    }

    public final void m(@l MotionDurationScale motionDurationScale0) {
        L.p(motionDurationScale0, "<set-?>");
        this.h = motionDurationScale0;
    }

    private final Object n(ScrollScope scrollScope0, float f, Function1 function10, d d0) {
        float f1 = SnapFlingBehaviorKt.n(0.0f, this.a, this.e);
        e l0$e0 = new e();
        l0$e0.a = f1;
        AnimationState animationState0 = AnimationStateKt.c(0.0f, f, 0L, 0L, false, 28, null);
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.shortSnap.3 snapFlingBehavior$shortSnap$30 = new Function1(function10) {
            final e e;
            final Function1 f;

            {
                this.e = l0$e0;
                this.f = function10;
                super(1);
            }

            public final void b(float f) {
                float f1 = this.e.a - f;
                this.e.a = f1;
                this.f.invoke(f1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((Number)object0).floatValue());
                return S0.a;
            }
        };
        return SnapFlingBehaviorKt.h(scrollScope0, f1, f1, animationState0, this.d, snapFlingBehavior$shortSnap$30, d0);
    }
}

