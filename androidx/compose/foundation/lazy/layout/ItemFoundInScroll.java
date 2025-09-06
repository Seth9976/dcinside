package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.L;
import y4.l;

final class ItemFoundInScroll extends CancellationException {
    private final int a;
    @l
    private final AnimationState b;

    public ItemFoundInScroll(int v, @l AnimationState animationState0) {
        L.p(animationState0, "previousAnimation");
        super();
        this.a = v;
        this.b = animationState0;
    }

    public final int a() {
        return this.a;
    }

    @l
    public final AnimationState b() {
        return this.b;
    }
}

