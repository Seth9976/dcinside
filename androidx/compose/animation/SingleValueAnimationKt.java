package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import y4.l;

@s0({"SMAP\nSingleValueAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,110:1\n36#2:111\n1057#3,6:112\n*S KotlinDebug\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n*L\n63#1:111\n63#1:112,6\n*E\n"})
public final class SingleValueAnimationKt {
    @l
    private static final SpringSpec a;

    static {
        SingleValueAnimationKt.a = AnimationSpecKt.o(0.0f, 0.0f, null, 7, null);
    }

    @l
    public static final Animatable a(long v) {
        return new Animatable(Color.n(v), ((TwoWayConverter)ColorVectorConverterKt.d(Color.b).invoke(Color.E(v))), null, null, 12, null);
    }

    @Composable
    @k(level = m.c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State b(long v, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v1, int v2) {
        composer0.V(-1942442407);
        if((v2 & 2) != 0) {
            animationSpec0 = SingleValueAnimationKt.a;
        }
        if((v2 & 4) != 0) {
            function10 = null;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1942442407, v1, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:75)");
        }
        State state0 = SingleValueAnimationKt.c(v, animationSpec0, null, function10, composer0, v1 & 14 | 0x40 | v1 << 3 & 0x1C00, 4);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @l
    public static final State c(long v, @y4.m AnimationSpec animationSpec0, @y4.m String s, @y4.m Function1 function10, @y4.m Composer composer0, int v1, int v2) {
        composer0.V(0xE510911C);
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : SingleValueAnimationKt.a;
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xE510911C, v1, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:56)");
        }
        ColorSpace colorSpace0 = Color.E(v);
        composer0.V(0x44FAF204);
        boolean z = composer0.t(colorSpace0);
        TwoWayConverter twoWayConverter0 = composer0.W();
        if(z || twoWayConverter0 == Composer.a.a()) {
            twoWayConverter0 = (TwoWayConverter)ColorVectorConverterKt.d(Color.b).invoke(Color.E(v));
            composer0.O(twoWayConverter0);
        }
        composer0.g0();
        State state0 = AnimateAsStateKt.s(Color.n(v), twoWayConverter0, animationSpec1, null, ((v2 & 4) == 0 ? s : "ColorAnimation"), ((v2 & 8) == 0 ? function10 : null), composer0, v1 & 14 | 0x240 | 0xE000 & v1 << 6 | v1 << 6 & 0x70000, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }
}

