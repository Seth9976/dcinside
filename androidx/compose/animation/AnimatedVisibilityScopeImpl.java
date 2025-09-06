package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.L;
import y4.l;

@ExperimentalAnimationApi
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {
    @l
    private Transition a;
    @l
    private final MutableState b;

    public AnimatedVisibilityScopeImpl(@l Transition transition0) {
        L.p(transition0, "transition");
        super();
        this.a = transition0;
        this.b = SnapshotStateKt__SnapshotStateKt.g(IntSize.b(0L), null, 2, null);
    }

    @Override  // androidx.compose.animation.AnimatedVisibilityScope
    public Modifier a(Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, String s) {
        return AnimatedVisibilityScope.-CC.a(this, modifier0, enterTransition0, exitTransition0, s);
    }

    @Override  // androidx.compose.animation.AnimatedVisibilityScope
    @l
    public Transition b() {
        return this.a;
    }

    @l
    public final MutableState c() {
        return this.b;
    }

    public void d(@l Transition transition0) {
        L.p(transition0, "<set-?>");
        this.a = transition0;
    }
}

