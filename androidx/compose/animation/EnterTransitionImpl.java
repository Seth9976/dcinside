package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import y4.l;

@Immutable
final class EnterTransitionImpl extends EnterTransition {
    @l
    private final TransitionData d;

    public EnterTransitionImpl(@l TransitionData transitionData0) {
        L.p(transitionData0, "data");
        super(null);
        this.d = transitionData0;
    }

    @Override  // androidx.compose.animation.EnterTransition
    @l
    public TransitionData b() {
        return this.d;
    }
}

