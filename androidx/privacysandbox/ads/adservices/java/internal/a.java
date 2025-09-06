package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter.Resolver;
import kotlinx.coroutines.X;

public final class a implements Resolver {
    public final X a;
    public final Object b;

    public a(X x0, Object object0) {
        this.a = x0;
        this.b = object0;
    }

    @Override  // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object a(Completer callbackToFutureAdapter$Completer0) {
        return CoroutineAdapterKt.d(this.a, this.b, callbackToFutureAdapter$Completer0);
    }
}

