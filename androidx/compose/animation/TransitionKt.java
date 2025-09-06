package androidx.compose.animation;

import A3.p;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;
import y4.m;

@s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,124:1\n36#2:125\n25#2:137\n1057#3,6:126\n1057#3,6:138\n857#4,5:132\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n*L\n70#1:125\n103#1:137\n70#1:126,6\n103#1:138,6\n74#1:132,5\n*E\n"})
public final class TransitionKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @l
    public static final State a(@l Transition transition0, @m p p0, @m String s, @l p p1, @m Composer composer0, int v, int v1) {
        L.p(transition0, "<this>");
        L.p(p1, "targetValueByState");
        composer0.V(0x8C629A81);
        if((v1 & 1) != 0) {
            p0 = androidx.compose.animation.TransitionKt.animateColor.1.e;
        }
        if((v1 & 2) != 0) {
            s = "ColorAnimation";
        }
        ColorSpace colorSpace0 = Color.E(((Color)p1.invoke(transition0.o(), composer0, ((int)(v >> 6 & 0x70)))).M());
        composer0.V(0x44FAF204);
        boolean z = composer0.t(colorSpace0);
        TwoWayConverter twoWayConverter0 = composer0.W();
        if(z || twoWayConverter0 == Composer.a.a()) {
            twoWayConverter0 = (TwoWayConverter)ColorVectorConverterKt.d(Color.b).invoke(colorSpace0);
            composer0.O(twoWayConverter0);
        }
        composer0.g0();
        int v2 = v & 14 | 0x40 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        composer0.V(0xF77F2E11);
        int v3 = v2 >> 9 & 0x70;
        State state0 = androidx.compose.animation.core.TransitionKt.m(transition0, p1.invoke(transition0.h(), composer0, v3), p1.invoke(transition0.o(), composer0, v3), ((FiniteAnimationSpec)p0.invoke(transition0.m(), composer0, ((int)(v2 >> 3 & 0x70)))), twoWayConverter0, s, composer0, v2 & 14 | 0x8000 | v2 << 6 & 0x70000);
        composer0.g0();
        composer0.g0();
        return state0;

        @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt$animateColor$1\n*L\n1#1,124:1\n*E\n"})
        public final class androidx.compose.animation.TransitionKt.animateColor.1 extends N implements p {
            public static final androidx.compose.animation.TransitionKt.animateColor.1 e;

            static {
                androidx.compose.animation.TransitionKt.animateColor.1.e = new androidx.compose.animation.TransitionKt.animateColor.1();
            }

            public androidx.compose.animation.TransitionKt.animateColor.1() {
                super(3);
            }

            @Composable
            @l
            public final SpringSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                L.p(transition$Segment0, "$this$null");
                composer0.V(-1457805428);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(-1457805428, v, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.o(0.0f, 0.0f, null, 7, null);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return springSpec0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Segment)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }

    }

    @Composable
    @l
    public static final State b(@l InfiniteTransition infiniteTransition0, long v, long v1, @l InfiniteRepeatableSpec infiniteRepeatableSpec0, @m String s, @m Composer composer0, int v2, int v3) {
        L.p(infiniteTransition0, "$this$animateColor");
        L.p(infiniteRepeatableSpec0, "animationSpec");
        composer0.V(0x715DA90D);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x715DA90D, v2, -1, "androidx.compose.animation.animateColor (Transition.kt:96)");
        }
        composer0.V(0xE2A708A4);
        TwoWayConverter twoWayConverter0 = composer0.W();
        if(twoWayConverter0 == Composer.a.a()) {
            twoWayConverter0 = (TwoWayConverter)ColorVectorConverterKt.d(Color.b).invoke(Color.E(v1));
            composer0.O(twoWayConverter0);
        }
        composer0.g0();
        State state0 = InfiniteTransitionKt.d(infiniteTransition0, Color.n(v), Color.n(v1), twoWayConverter0, infiniteRepeatableSpec0, ((v3 & 8) == 0 ? s : "ColorAnimation"), composer0, InfiniteTransition.f | 0x1000 | v2 & 14 | v2 & 0x70 | v2 & 0x380 | InfiniteRepeatableSpec.d << 12 | 0xE000 & v2 << 3 | v2 << 3 & 0x70000, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @k(level = kotlin.m.c, message = "animateColor APIs now have a new label parameter added.")
    public static final State c(InfiniteTransition infiniteTransition0, long v, long v1, InfiniteRepeatableSpec infiniteRepeatableSpec0, Composer composer0, int v2) {
        L.p(infiniteTransition0, "$this$animateColor");
        L.p(infiniteRepeatableSpec0, "animationSpec");
        composer0.V(1400583834);
        if(ComposerKt.g0()) {
            ComposerKt.w0(1400583834, v2, -1, "androidx.compose.animation.animateColor (Transition.kt:113)");
        }
        State state0 = TransitionKt.b(infiniteTransition0, v, v1, infiniteRepeatableSpec0, "ColorAnimation", composer0, InfiniteTransition.f | 0x6000 | v2 & 14 | v2 & 0x70 | v2 & 0x380 | InfiniteRepeatableSpec.d << 9 | v2 & 0x1C00, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }
}

