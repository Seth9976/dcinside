package androidx.compose.runtime;

import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import y4.l;

@b0
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    @l
    private final O a;

    public CompositionScopedCoroutineScopeCanceller(@l O o0) {
        L.p(o0, "coroutineScope");
        super();
        this.a = o0;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void a() {
    }

    @l
    public final O b() {
        return this.a;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void c() {
        P.f(this.a, null, 1, null);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void d() {
        P.f(this.a, null, 1, null);
    }
}

