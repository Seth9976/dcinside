package androidx.browser.trusted;

import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter.Resolver;

public final class a implements Resolver {
    public final ConnectionHolder a;

    public a(ConnectionHolder connectionHolder0) {
        this.a = connectionHolder0;
    }

    @Override  // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object a(Completer callbackToFutureAdapter$Completer0) {
        return this.a.d(callbackToFutureAdapter$Completer0);
    }
}

