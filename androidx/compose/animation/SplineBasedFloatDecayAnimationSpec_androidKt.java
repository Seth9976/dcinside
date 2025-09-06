package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nSplineBasedFloatDecayAnimationSpec.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplineBasedFloatDecayAnimationSpec.android.kt\nandroidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,49:1\n76#2:50\n36#3:51\n1057#4,6:52\n*S KotlinDebug\n*F\n+ 1 SplineBasedFloatDecayAnimationSpec.android.kt\nandroidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt\n*L\n44#1:50\n45#1:51\n45#1:52,6\n*E\n"})
public final class SplineBasedFloatDecayAnimationSpec_androidKt {
    private static final float a;

    static {
        SplineBasedFloatDecayAnimationSpec_androidKt.a = 0.015f;
    }

    public static final float a() [...] // 潜在的解密器

    @Composable
    @l
    public static final DecayAnimationSpec b(@m Composer composer0, int v) {
        composer0.V(0x35E8BF9B);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x35E8BF9B, v, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
        Float float0 = density0.getDensity();
        composer0.V(0x44FAF204);
        boolean z = composer0.t(float0);
        DecayAnimationSpec decayAnimationSpec0 = composer0.W();
        if(z || decayAnimationSpec0 == Composer.a.a()) {
            decayAnimationSpec0 = DecayAnimationSpecKt.e(new SplineBasedFloatDecayAnimationSpec(density0));
            composer0.O(decayAnimationSpec0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return decayAnimationSpec0;
    }

    @k(level = kotlin.m.c, message = "Moved to common code")
    @i(name = "splineBasedDecay")
    public static final DecayAnimationSpec c(Density density0) {
        L.p(density0, "density");
        return SplineBasedDecayKt.c(density0);
    }
}

