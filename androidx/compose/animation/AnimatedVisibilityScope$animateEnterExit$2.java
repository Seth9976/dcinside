package androidx.compose.animation;

import A3.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class AnimatedVisibilityScope.animateEnterExit.2 extends N implements p {
    final AnimatedVisibilityScope e;
    final EnterTransition f;
    final ExitTransition g;
    final String h;

    AnimatedVisibilityScope.animateEnterExit.2(AnimatedVisibilityScope animatedVisibilityScope0, EnterTransition enterTransition0, ExitTransition exitTransition0, String s) {
        this.e = animatedVisibilityScope0;
        this.f = enterTransition0;
        this.g = exitTransition0;
        this.h = s;
        super(3);
    }

    @Composable
    @l
    public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
        L.p(modifier0, "$this$composed");
        composer0.V(1840112047);
        if(ComposerKt.g0()) {
            ComposerKt.w0(1840112047, v, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:671)");
        }
        Modifier modifier1 = modifier0.r0(EnterExitTransitionKt.g(this.e.b(), this.f, this.g, this.h, composer0, 0));
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return modifier1;
    }

    @Override  // A3.p
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
    }
}

