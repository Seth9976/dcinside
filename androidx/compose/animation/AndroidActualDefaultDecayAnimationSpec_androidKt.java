package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.k;
import y4.l;
import y4.m;

public final class AndroidActualDefaultDecayAnimationSpec_androidKt {
    @Composable
    @k(message = "Replace with rememberSplineBasedDecay<Float>")
    @l
    public static final DecayAnimationSpec a(@m Composer composer0, int v) {
        composer0.V(-1468328074);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1468328074, v, -1, "androidx.compose.animation.defaultDecayAnimationSpec (AndroidActualDefaultDecayAnimationSpec.android.kt:23)");
        }
        DecayAnimationSpec decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.b(composer0, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return decayAnimationSpec0;
    }
}

