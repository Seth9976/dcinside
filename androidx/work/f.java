package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter.Resolver;

public final class f implements Resolver {
    @Override  // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object a(Completer callbackToFutureAdapter$Completer0) {
        return ListenableWorker.b(callbackToFutureAdapter$Completer0);
    }
}

