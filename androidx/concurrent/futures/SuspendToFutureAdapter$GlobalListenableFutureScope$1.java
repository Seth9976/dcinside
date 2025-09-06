package androidx.concurrent.futures;

import kotlin.coroutines.g;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import y4.l;

public final class SuspendToFutureAdapter.GlobalListenableFutureScope.1 implements O {
    @l
    private final g a;

    SuspendToFutureAdapter.GlobalListenableFutureScope.1() {
        this.a = h0.e();
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.a;
    }
}

