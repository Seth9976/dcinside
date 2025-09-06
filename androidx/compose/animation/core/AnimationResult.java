package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
public final class AnimationResult {
    @l
    private final AnimationState a;
    @l
    private final AnimationEndReason b;
    public static final int c;

    static {
    }

    public AnimationResult(@l AnimationState animationState0, @l AnimationEndReason animationEndReason0) {
        L.p(animationState0, "endState");
        L.p(animationEndReason0, "endReason");
        super();
        this.a = animationState0;
        this.b = animationEndReason0;
    }

    @l
    public final AnimationEndReason a() {
        return this.b;
    }

    @l
    public final AnimationState b() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "AnimationResult(endReason=" + this.b + ", endState=" + this.a + ')';
    }
}

