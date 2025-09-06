package androidx.lifecycle;

import java.io.Closeable;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.O;
import y4.l;

public final class CloseableCoroutineScope implements Closeable, O {
    @l
    private final g a;

    public CloseableCoroutineScope(@l g g0) {
        L.p(g0, "context");
        super();
        this.a = g0;
    }

    @Override
    public void close() {
        O0.i(this.getCoroutineContext(), null, 1, null);
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.a;
    }
}

