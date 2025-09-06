package androidx.compose.animation.core;

import A3.a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import y4.l;

@s0({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,364:1\n25#2:365\n25#2:372\n1057#3,6:366\n1057#3,6:373\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n*L\n46#1:365\n263#1:372\n46#1:366,6\n263#1:373,6\n*E\n"})
public final class InfiniteTransitionKt {
    @Composable
    @k(level = m.c, message = "animateFloat APIs now have a new label parameter added.")
    public static final State a(InfiniteTransition infiniteTransition0, float f, float f1, InfiniteRepeatableSpec infiniteRepeatableSpec0, Composer composer0, int v) {
        L.p(infiniteTransition0, "<this>");
        L.p(infiniteRepeatableSpec0, "animationSpec");
        composer0.V(0x1BFB95F0);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x1BFB95F0, v, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:352)");
        }
        State state0 = InfiniteTransitionKt.b(infiniteTransition0, f, f1, infiniteRepeatableSpec0, "FloatAnimation", composer0, v & 0x70 | 0x6008 | v & 0x380 | v & 0x1C00, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @l
    public static final State b(@l InfiniteTransition infiniteTransition0, float f, float f1, @l InfiniteRepeatableSpec infiniteRepeatableSpec0, @y4.m String s, @y4.m Composer composer0, int v, int v1) {
        L.p(infiniteTransition0, "<this>");
        L.p(infiniteRepeatableSpec0, "animationSpec");
        composer0.V(-644770905);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-644770905, v, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:310)");
        }
        State state0 = InfiniteTransitionKt.d(infiniteTransition0, f, f1, VectorConvertersKt.i(A.a), infiniteRepeatableSpec0, ((v1 & 8) == 0 ? s : "FloatAnimation"), composer0, v & 0x70 | 8 | v & 0x380 | 0xE000 & v << 3 | v << 3 & 0x70000, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @k(level = m.c, message = "animateValue APIs now have a new label parameter added.")
    public static final State c(InfiniteTransition infiniteTransition0, Object object0, Object object1, TwoWayConverter twoWayConverter0, InfiniteRepeatableSpec infiniteRepeatableSpec0, Composer composer0, int v) {
        L.p(infiniteTransition0, "<this>");
        L.p(twoWayConverter0, "typeConverter");
        L.p(infiniteRepeatableSpec0, "animationSpec");
        composer0.V(0x9AF211C6);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x9AF211C6, v, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:332)");
        }
        int v1 = v >> 3 & 8;
        State state0 = InfiniteTransitionKt.d(infiniteTransition0, object0, object1, twoWayConverter0, infiniteRepeatableSpec0, "ValueAnimation", composer0, v1 << 6 | (v1 << 3 | 0x30008 | v & 0x70) | v & 0x380 | v & 0x1C00 | v & 0xE000, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @l
    public static final State d(@l InfiniteTransition infiniteTransition0, Object object0, Object object1, @l TwoWayConverter twoWayConverter0, @l InfiniteRepeatableSpec infiniteRepeatableSpec0, @y4.m String s, @y4.m Composer composer0, int v, int v1) {
        L.p(infiniteTransition0, "<this>");
        L.p(twoWayConverter0, "typeConverter");
        L.p(infiniteRepeatableSpec0, "animationSpec");
        composer0.V(0xC0A63B11);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xC0A63B11, v, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:254)");
        }
        composer0.V(0xE2A708A4);
        TransitionAnimationState infiniteTransition$TransitionAnimationState0 = composer0.W();
        if(infiniteTransition$TransitionAnimationState0 == Composer.a.a()) {
            infiniteTransition$TransitionAnimationState0 = new TransitionAnimationState(infiniteTransition0, object0, object1, twoWayConverter0, infiniteRepeatableSpec0, ((v1 & 16) == 0 ? s : "ValueAnimation"));
            composer0.O(infiniteTransition$TransitionAnimationState0);
        }
        composer0.g0();
        EffectsKt.k(new a(object0, infiniteTransition$TransitionAnimationState0, object1, infiniteRepeatableSpec0) {
            final Object e;
            final TransitionAnimationState f;
            final Object g;
            final InfiniteRepeatableSpec h;

            {
                this.e = object0;
                this.f = infiniteTransition$TransitionAnimationState0;
                this.g = object1;
                this.h = infiniteRepeatableSpec0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                if(!L.g(this.e, this.f.g()) || !L.g(this.g, this.f.j())) {
                    this.f.v(this.e, this.g, this.h);
                }
            }
        }, composer0, 0);
        EffectsKt.c(infiniteTransition$TransitionAnimationState0, new Function1(infiniteTransition0, infiniteTransition$TransitionAnimationState0) {
            final InfiniteTransition e;
            final TransitionAnimationState f;

            {
                this.e = infiniteTransition0;
                this.f = infiniteTransition$TransitionAnimationState0;
                super(1);
            }

            @l
            public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                L.p(disposableEffectScope0, "$this$DisposableEffect");
                this.e.f(this.f);
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.f.l(this.b);
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((DisposableEffectScope)object0));
            }
        }, composer0, 6);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return infiniteTransition$TransitionAnimationState0;
    }

    @Composable
    @k(level = m.c, message = "rememberInfiniteTransition APIs now have a new label parameter added.")
    public static final InfiniteTransition e(Composer composer0, int v) {
        composer0.V(-840193660);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-840193660, v, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:323)");
        }
        InfiniteTransition infiniteTransition0 = InfiniteTransitionKt.f("InfiniteTransition", composer0, 6, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return infiniteTransition0;
    }

    @Composable
    @l
    public static final InfiniteTransition f(@y4.m String s, @y4.m Composer composer0, int v, int v1) {
        composer0.V(1013651573);
        if((v1 & 1) != 0) {
            s = "InfiniteTransition";
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(1013651573, v, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        composer0.V(0xE2A708A4);
        InfiniteTransition infiniteTransition0 = composer0.W();
        if(infiniteTransition0 == Composer.a.a()) {
            infiniteTransition0 = new InfiniteTransition(s);
            composer0.O(infiniteTransition0);
        }
        composer0.g0();
        infiniteTransition0.m(composer0, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return infiniteTransition0;
    }
}

