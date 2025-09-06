package kotlinx.coroutines.internal;

import kotlin.coroutines.g;
import kotlinx.coroutines.O;
import y4.l;

public final class i implements O {
    @l
    private final g a;

    public i(@l g g0) {
        this.a = g0;
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "CoroutineScope(coroutineContext=" + this.getCoroutineContext() + ')';
    }
}

