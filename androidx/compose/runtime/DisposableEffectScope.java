package androidx.compose.runtime;

import A3.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
public final class DisposableEffectScope {
    public static final int a;

    static {
    }

    @l
    public final DisposableEffectResult a(@l a a0) {
        L.p(a0, "onDisposeEffect");
        return new DisposableEffectResult() {
            @Override  // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.a.invoke();
            }
        };
    }
}

