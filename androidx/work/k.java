package androidx.work;

import A3.a;
import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter.Resolver;
import java.util.concurrent.Executor;

public final class k implements Resolver {
    public final Executor a;
    public final a b;

    public k(Executor executor0, a a0) {
        this.a = executor0;
        this.b = a0;
    }

    @Override  // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object a(Completer callbackToFutureAdapter$Completer0) {
        return WorkerKt.f(this.a, this.b, callbackToFutureAdapter$Completer0);
    }
}

