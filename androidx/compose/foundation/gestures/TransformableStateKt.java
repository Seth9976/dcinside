package androidx.compose.foundation.gestures;

import A3.o;
import A3.p;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.g;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,261:1\n25#2:262\n1114#3,6:263\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n*L\n119#1:262\n119#1:263,6\n*E\n"})
public final class TransformableStateKt {
    @l
    public static final TransformableState a(@l p p0) {
        L.p(p0, "onTransformation");
        return new DefaultTransformableState(p0);
    }

    @m
    public static final Object b(@l TransformableState transformableState0, long v, @l AnimationSpec animationSpec0, @l d d0) {
        g l0$g0 = new g();
        l0$g0.a = 0L;
        Object object0 = e.a(transformableState0, null, new o(l0$g0, v, animationSpec0, null) {
            int k;
            private Object l;
            final g m;
            final long n;
            final AnimationSpec o;

            {
                this.m = l0$g0;
                this.n = v;
                this.o = animationSpec0;
                super(2, d0);
            }

            @m
            public final Object a(@l TransformScope transformScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.TransformableStateKt.animatePanBy.2)this.create(transformScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.TransformableStateKt.animatePanBy.2(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((TransformScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        TransformScope transformScope0 = (TransformScope)this.l;
                        AnimationState animationState0 = new AnimationState(VectorConvertersKt.b(Offset.b), Offset.d(this.m.a), null, 0L, 0L, false, 60, null);
                        Offset offset0 = Offset.d(this.n);
                        androidx.compose.foundation.gestures.TransformableStateKt.animatePanBy.2.1 transformableStateKt$animatePanBy$2$10 = new Function1(transformScope0) {
                            final g e;
                            final TransformScope f;

                            {
                                this.e = l0$g0;
                                this.f = transformScope0;
                                super(1);
                            }

                            public final void a(@l AnimationScope animationScope0) {
                                L.p(animationScope0, "$this$animateTo");
                                long v = Offset.u(((Offset)animationScope0.g()).A(), this.e.a);
                                androidx.compose.foundation.gestures.d.a(this.f, 0.0f, v, 0.0f, 5, null);
                                this.e.a = ((Offset)animationScope0.g()).A();
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((AnimationScope)object0));
                                return S0.a;
                            }
                        };
                        this.k = 1;
                        return SuspendAnimationKt.m(animationState0, offset0, this.o, false, transformableStateKt$animatePanBy$2$10, this, 4, null) == object1 ? object1 : S0.a;
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
        }, d0, 1, null);
        return object0 == b.l() ? object0 : S0.a;
    }

    public static Object c(TransformableState transformableState0, long v, AnimationSpec animationSpec0, d d0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            animationSpec0 = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return TransformableStateKt.b(transformableState0, v, animationSpec0, d0);
    }

    @m
    public static final Object d(@l TransformableState transformableState0, float f, @l AnimationSpec animationSpec0, @l d d0) {
        Object object0 = e.a(transformableState0, null, new o(new kotlin.jvm.internal.l0.e(), f, animationSpec0, null) {
            int k;
            private Object l;
            final kotlin.jvm.internal.l0.e m;
            final float n;
            final AnimationSpec o;

            {
                this.m = l0$e0;
                this.n = f;
                this.o = animationSpec0;
                super(2, d0);
            }

            @m
            public final Object a(@l TransformScope transformScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.TransformableStateKt.animateRotateBy.2)this.create(transformScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.TransformableStateKt.animateRotateBy.2(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((TransformScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        TransformScope transformScope0 = (TransformScope)this.l;
                        AnimationState animationState0 = AnimationStateKt.c(this.m.a, 0.0f, 0L, 0L, false, 30, null);
                        androidx.compose.foundation.gestures.TransformableStateKt.animateRotateBy.2.1 transformableStateKt$animateRotateBy$2$10 = new Function1(transformScope0) {
                            final kotlin.jvm.internal.l0.e e;
                            final TransformScope f;

                            {
                                this.e = l0$e0;
                                this.f = transformScope0;
                                super(1);
                            }

                            public final void a(@l AnimationScope animationScope0) {
                                L.p(animationScope0, "$this$animateTo");
                                float f = ((Number)animationScope0.g()).floatValue();
                                androidx.compose.foundation.gestures.d.a(this.f, 0.0f, 0L, f - this.e.a, 3, null);
                                this.e.a = ((Number)animationScope0.g()).floatValue();
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((AnimationScope)object0));
                                return S0.a;
                            }
                        };
                        this.k = 1;
                        return SuspendAnimationKt.m(animationState0, kotlin.coroutines.jvm.internal.b.e(this.n), this.o, false, transformableStateKt$animateRotateBy$2$10, this, 4, null) == object1 ? object1 : S0.a;
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
        }, d0, 1, null);
        return object0 == b.l() ? object0 : S0.a;
    }

    public static Object e(TransformableState transformableState0, float f, AnimationSpec animationSpec0, d d0, int v, Object object0) {
        if((v & 2) != 0) {
            animationSpec0 = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return TransformableStateKt.d(transformableState0, f, animationSpec0, d0);
    }

    @m
    public static final Object f(@l TransformableState transformableState0, float f, @l AnimationSpec animationSpec0, @l d d0) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("zoom value should be greater than 0");
        }
        kotlin.jvm.internal.l0.e l0$e0 = new kotlin.jvm.internal.l0.e();
        l0$e0.a = 1.0f;
        Object object0 = e.a(transformableState0, null, new o(l0$e0, f, animationSpec0, null) {
            int k;
            private Object l;
            final kotlin.jvm.internal.l0.e m;
            final float n;
            final AnimationSpec o;

            {
                this.m = l0$e0;
                this.n = f;
                this.o = animationSpec0;
                super(2, d0);
            }

            @m
            public final Object a(@l TransformScope transformScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.TransformableStateKt.animateZoomBy.3)this.create(transformScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.TransformableStateKt.animateZoomBy.3(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((TransformScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        TransformScope transformScope0 = (TransformScope)this.l;
                        AnimationState animationState0 = AnimationStateKt.c(this.m.a, 0.0f, 0L, 0L, false, 30, null);
                        androidx.compose.foundation.gestures.TransformableStateKt.animateZoomBy.3.1 transformableStateKt$animateZoomBy$3$10 = new Function1(transformScope0) {
                            final kotlin.jvm.internal.l0.e e;
                            final TransformScope f;

                            {
                                this.e = l0$e0;
                                this.f = transformScope0;
                                super(1);
                            }

                            public final void a(@l AnimationScope animationScope0) {
                                L.p(animationScope0, "$this$animateTo");
                                float f = this.e.a == 0.0f ? 1.0f : ((Number)animationScope0.g()).floatValue() / this.e.a;
                                androidx.compose.foundation.gestures.d.a(this.f, f, 0L, 0.0f, 6, null);
                                this.e.a = ((Number)animationScope0.g()).floatValue();
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((AnimationScope)object0));
                                return S0.a;
                            }
                        };
                        this.k = 1;
                        return SuspendAnimationKt.m(animationState0, kotlin.coroutines.jvm.internal.b.e(this.n), this.o, false, transformableStateKt$animateZoomBy$3$10, this, 4, null) == object1 ? object1 : S0.a;
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
        }, d0, 1, null);
        return object0 == b.l() ? object0 : S0.a;
    }

    public static Object g(TransformableState transformableState0, float f, AnimationSpec animationSpec0, d d0, int v, Object object0) {
        if((v & 2) != 0) {
            animationSpec0 = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return TransformableStateKt.f(transformableState0, f, animationSpec0, d0);
    }

    @m
    public static final Object h(@l TransformableState transformableState0, long v, @l d d0) {
        Object object0 = e.a(transformableState0, null, new o(v, null) {
            int k;
            private Object l;
            final long m;

            {
                this.m = v;
                super(2, d0);
            }

            @m
            public final Object a(@l TransformScope transformScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.TransformableStateKt.panBy.2)this.create(transformScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.TransformableStateKt.panBy.2(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((TransformScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                ((TransformScope)this.l).a(1.0f, this.m, 0.0f);
                return S0.a;
            }
        }, d0, 1, null);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Composable
    @l
    public static final TransformableState i(@l p p0, @m Composer composer0, int v) {
        L.p(p0, "onTransformation");
        composer0.V(0x64386C11);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x64386C11, v, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:114)");
        }
        State state0 = SnapshotStateKt.t(p0, composer0, v & 14);
        composer0.V(0xE2A708A4);
        TransformableState transformableState0 = composer0.W();
        if(transformableState0 == Composer.a.a()) {
            transformableState0 = TransformableStateKt.a(new p(state0) {
                final State e;

                {
                    this.e = state0;
                    super(3);
                }

                public final void a(float f, long v, float f1) {
                    ((p)this.e.getValue()).invoke(f, Offset.d(v), f1);
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.a(((Number)object0).floatValue(), ((Offset)object1).A(), ((Number)object2).floatValue());
                    return S0.a;
                }
            });
            composer0.O(transformableState0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return transformableState0;
    }

    @m
    public static final Object j(@l TransformableState transformableState0, float f, @l d d0) {
        Object object0 = e.a(transformableState0, null, new o(f, null) {
            int k;
            private Object l;
            final float m;

            {
                this.m = f;
                super(2, d0);
            }

            @m
            public final Object a(@l TransformScope transformScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.TransformableStateKt.rotateBy.2)this.create(transformScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.TransformableStateKt.rotateBy.2(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((TransformScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                ((TransformScope)this.l).a(1.0f, 0L, this.m);
                return S0.a;
            }
        }, d0, 1, null);
        return object0 == b.l() ? object0 : S0.a;
    }

    @m
    public static final Object k(@l TransformableState transformableState0, @l MutatePriority mutatePriority0, @l d d0) {
        Object object0 = transformableState0.a(mutatePriority0, new o(null) {
            int k;

            {
                super(2, d0);
            }

            @m
            public final Object a(@l TransformScope transformScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.TransformableStateKt.stopTransformation.2)this.create(transformScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.foundation.gestures.TransformableStateKt.stopTransformation.2(d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((TransformScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    public static Object l(TransformableState transformableState0, MutatePriority mutatePriority0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.a;
        }
        return TransformableStateKt.k(transformableState0, mutatePriority0, d0);
    }

    @m
    public static final Object m(@l TransformableState transformableState0, float f, @l d d0) {
        Object object0 = e.a(transformableState0, null, new o(f, null) {
            int k;
            private Object l;
            final float m;

            {
                this.m = f;
                super(2, d0);
            }

            @m
            public final Object a(@l TransformScope transformScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.TransformableStateKt.zoomBy.2)this.create(transformScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.TransformableStateKt.zoomBy.2(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((TransformScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                ((TransformScope)this.l).a(this.m, 0L, 0.0f);
                return S0.a;
            }
        }, d0, 1, null);
        return object0 == b.l() ? object0 : S0.a;
    }
}

