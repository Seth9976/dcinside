package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter.Resolver;
import java.util.concurrent.Executor;

public final class a implements Resolver {
    public final Executor a;
    public final String b;
    public final A3.a c;

    public a(Executor executor0, String s, A3.a a0) {
        this.a = executor0;
        this.b = s;
        this.c = a0;
    }

    @Override  // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object a(Completer callbackToFutureAdapter$Completer0) {
        return ListenableFutureKt.g(this.a, this.b, this.c, callbackToFutureAdapter$Completer0);
    }
}

