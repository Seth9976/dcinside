package androidx.compose.foundation;

import A3.o;
import A3.p;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,417:1\n135#2:418\n1#3:419\n154#4:420\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n*L\n142#1:418\n91#1:420\n*E\n"})
public final class BasicMarqueeKt {
    private static final int a = 3;
    private static final int b = 1200;
    @l
    private static final MarqueeSpacing c;
    private static final float d;

    static {
        BasicMarqueeKt.c = MarqueeSpacing.a.a(0.333333f);
        BasicMarqueeKt.d = 30.0f;
    }

    @ExperimentalFoundationApi
    @l
    public static final MarqueeSpacing a(float f) {
        return new MarqueeSpacing() {
            @Override  // androidx.compose.foundation.MarqueeSpacing
            public final int a(@l Density density0, int v, int v1) {
                L.p(density0, "$this$MarqueeSpacing");
                return density0.b1(f);
            }
        };
    }

    @ExperimentalFoundationApi
    @l
    public static final Modifier c(@l Modifier modifier0, int v, int v1, int v2, int v3, @l MarqueeSpacing marqueeSpacing0, float f) {
        L.p(modifier0, "$this$basicMarquee");
        L.p(marqueeSpacing0, "spacing");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(v, v2, v3, f, marqueeSpacing0, v1) {
            final int e;
            final int f;
            final int g;
            final float h;
            final MarqueeSpacing i;
            final int j;

            {
                this.e = v;
                this.f = v1;
                this.g = v2;
                this.h = f;
                this.i = marqueeSpacing0;
                this.j = v3;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0xDE7BF303);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xDE7BF303, v, -1, "androidx.compose.foundation.basicMarquee.<anonymous> (BasicMarquee.kt:150)");
                }
                Object object0 = composer0.L(CompositionLocalsKt.i());
                LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
                Dp dp0 = Dp.d(this.h);
                Object[] arr_object = {this.e, this.f, this.g, dp0, ((Density)object0), layoutDirection0};
                int v2 = this.e;
                int v3 = this.f;
                int v4 = this.g;
                float f = this.h;
                composer0.V(0xDE219177);
                boolean z = false;
                for(int v1 = 0; v1 < 6; ++v1) {
                    z |= composer0.t(arr_object[v1]);
                }
                MarqueeModifier marqueeModifier0 = composer0.W();
                if(z || marqueeModifier0 == Composer.a.a()) {
                    marqueeModifier0 = new MarqueeModifier(v2, v3, v4, f * (layoutDirection0 == LayoutDirection.a ? 1.0f : -1.0f), ((Density)object0), null);
                    composer0.O(marqueeModifier0);
                }
                composer0.g0();
                marqueeModifier0.I(this.i);
                marqueeModifier0.C(this.j);
                composer0.V(0x44FAF204);
                boolean z1 = composer0.t(marqueeModifier0);
                androidx.compose.foundation.BasicMarqueeKt.basicMarquee.2.1.1 basicMarqueeKt$basicMarquee$2$1$10 = composer0.W();
                if(z1 || basicMarqueeKt$basicMarquee$2$1$10 == Composer.a.a()) {
                    basicMarqueeKt$basicMarquee$2$1$10 = new o(null) {
                        int k;
                        final MarqueeModifier l;

                        {
                            this.l = marqueeModifier0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.compose.foundation.BasicMarqueeKt.basicMarquee.2.1.1(this.l, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.foundation.BasicMarqueeKt.basicMarquee.2.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    this.k = 1;
                                    return this.l.A(this) == object1 ? object1 : S0.a;
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
                    };
                    composer0.O(basicMarqueeKt$basicMarquee$2$1$10);
                }
                composer0.g0();
                EffectsKt.g(marqueeModifier0, basicMarqueeKt$basicMarquee$2$1$10, composer0, 0x40);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return marqueeModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n*L\n1#1,170:1\n143#2,8:171\n*E\n"})
        public final class androidx.compose.foundation.BasicMarqueeKt.basicMarquee-1Mj1MLw..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final int e;
            final int f;
            final int g;
            final int h;
            final MarqueeSpacing i;
            final float j;

            public androidx.compose.foundation.BasicMarqueeKt.basicMarquee-1Mj1MLw..inlined.debugInspectorInfo.1(int v, int v1, int v2, int v3, MarqueeSpacing marqueeSpacing0, float f) {
                this.e = v;
                this.f = v1;
                this.g = v2;
                this.h = v3;
                this.i = marqueeSpacing0;
                this.j = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("basicMarquee");
                inspectorInfo0.b().c("iterations", this.e);
                inspectorInfo0.b().c("animationMode", MarqueeAnimationMode.c(this.f));
                inspectorInfo0.b().c("delayMillis", this.g);
                inspectorInfo0.b().c("initialDelayMillis", this.h);
                inspectorInfo0.b().c("spacing", this.i);
                inspectorInfo0.b().c("velocity", Dp.d(this.j));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier d(Modifier modifier0, int v, int v1, int v2, int v3, MarqueeSpacing marqueeSpacing0, float f, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = BasicMarqueeKt.a;
        }
        if((v4 & 2) != 0) {
            v1 = 0;
        }
        if((v4 & 4) != 0) {
            v2 = BasicMarqueeKt.b;
        }
        if((v4 & 8) != 0) {
            v3 = MarqueeAnimationMode.f(v1, 0) ? v2 : 0;
        }
        if((v4 & 16) != 0) {
            marqueeSpacing0 = BasicMarqueeKt.c;
        }
        if((v4 & 0x20) != 0) {
            f = BasicMarqueeKt.d;
        }
        return BasicMarqueeKt.c(modifier0, v, v1, v2, v3, marqueeSpacing0, f);
    }

    private static final AnimationSpec e(int v, float f, int v1, int v2, float f1, Density density0) {
        TweenSpec tweenSpec0 = BasicMarqueeKt.n(Math.abs(density0.y1(f1)), f, v2);
        long v3 = StartOffset.d(v1 - v2, 0, 2, null);
        return v == 0x7FFFFFFF ? AnimationSpecKt.f(tweenSpec0, null, v3, 2, null) : AnimationSpecKt.k(v, tweenSpec0, null, v3, 4, null);
    }

    @ExperimentalFoundationApi
    public static final int f() {
        return BasicMarqueeKt.b;
    }

    @ExperimentalFoundationApi
    public static void g() {
    }

    @ExperimentalFoundationApi
    public static final int h() {
        return BasicMarqueeKt.a;
    }

    @ExperimentalFoundationApi
    public static void i() {
    }

    @ExperimentalFoundationApi
    @l
    public static final MarqueeSpacing j() {
        return BasicMarqueeKt.c;
    }

    @ExperimentalFoundationApi
    public static void k() {
    }

    @ExperimentalFoundationApi
    public static final float l() {
        return BasicMarqueeKt.d;
    }

    @ExperimentalFoundationApi
    public static void m() {
    }

    private static final TweenSpec n(float f, float f1, int v) {
        return AnimationSpecKt.p(((int)(((float)Math.ceil(f1 / (f / 1000.0f))))), v, EasingKt.c());
    }
}

