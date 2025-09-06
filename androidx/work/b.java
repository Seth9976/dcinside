package androidx.work;

import A3.o;
import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter.Resolver;
import kotlin.coroutines.g;
import kotlinx.coroutines.Q;

public final class b implements Resolver {
    public final g a;
    public final Q b;
    public final o c;

    public b(g g0, Q q0, o o0) {
        this.a = g0;
        this.b = q0;
        this.c = o0;
    }

    @Override  // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object a(Completer callbackToFutureAdapter$Completer0) {
        return ListenableFutureKt.l(this.a, this.b, this.c, callbackToFutureAdapter$Completer0);
    }
}

