package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,863:1\n135#2:864\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n666#1:864\n*E\n"})
public interface AnimatedVisibilityScope {
    public static final class DefaultImpls {
        @ExperimentalAnimationApi
        @Deprecated
        @l
        public static Modifier a(@l AnimatedVisibilityScope animatedVisibilityScope0, @l Modifier modifier0, @l EnterTransition enterTransition0, @l ExitTransition exitTransition0, @l String s) {
            L.p(modifier0, "$receiver");
            L.p(enterTransition0, "enter");
            L.p(exitTransition0, "exit");
            L.p(s, "label");
            return AnimatedVisibilityScope.-CC.a(animatedVisibilityScope0, modifier0, enterTransition0, exitTransition0, s);
        }

        public static Modifier b(AnimatedVisibilityScope animatedVisibilityScope0, Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, String s, int v, Object object0) {
            return AnimatedVisibilityScope.-CC.c(animatedVisibilityScope0, modifier0, enterTransition0, exitTransition0, s, v, object0);
        }

        @ExperimentalAnimationApi
        public static void c() {
        }
    }

    @ExperimentalAnimationApi
    @l
    Modifier a(@l Modifier arg1, @l EnterTransition arg2, @l ExitTransition arg3, @l String arg4);

    @ExperimentalAnimationApi
    @l
    Transition b();
}

