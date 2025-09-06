package androidx.work;

import A3.a;
import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import java.util.concurrent.atomic.AtomicBoolean;

public final class j implements Runnable {
    public final AtomicBoolean a;
    public final Completer b;
    public final a c;

    public j(AtomicBoolean atomicBoolean0, Completer callbackToFutureAdapter$Completer0, a a0) {
        this.a = atomicBoolean0;
        this.b = callbackToFutureAdapter$Completer0;
        this.c = a0;
    }

    @Override
    public final void run() {
        WorkerKt.h(this.a, this.b, this.c);
    }
}

