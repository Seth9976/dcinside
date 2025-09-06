package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import kotlin.jvm.internal.L;
import y4.l;

final class AnimationResult {
    private final Object a;
    @l
    private final AnimationState b;

    public AnimationResult(Object object0, @l AnimationState animationState0) {
        L.p(animationState0, "currentAnimationState");
        super();
        this.a = object0;
        this.b = animationState0;
    }

    public final Object a() {
        return this.a;
    }

    @l
    public final AnimationState b() {
        return this.b;
    }

    @l
    public final AnimationState c() {
        return this.b;
    }

    public final Object d() {
        return this.a;
    }
}

