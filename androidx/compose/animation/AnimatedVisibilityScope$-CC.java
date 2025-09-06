package androidx.compose.animation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class AnimatedVisibilityScope.-CC {
    @ExperimentalAnimationApi
    @l
    public static Modifier a(AnimatedVisibilityScope animatedVisibilityScope0, @l Modifier modifier0, @l EnterTransition enterTransition0, @l ExitTransition exitTransition0, @l String s) {
        L.p(modifier0, "<this>");
        L.p(enterTransition0, "enter");
        L.p(exitTransition0, "exit");
        L.p(s, "label");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new AnimatedVisibilityScope.animateEnterExit.2(animatedVisibilityScope0, enterTransition0, exitTransition0, s));
    }

    public static Modifier c(AnimatedVisibilityScope animatedVisibilityScope0, Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, String s, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
        }
        if((v & 1) != 0) {
            enterTransition0 = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
        }
        if((v & 2) != 0) {
            exitTransition0 = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
        }
        if((v & 4) != 0) {
            s = "animateEnterExit";
        }
        return animatedVisibilityScope0.a(modifier0, enterTransition0, exitTransition0, s);
    }
}

