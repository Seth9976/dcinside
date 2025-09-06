package androidx.work;

import A3.a;
import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter.Resolver;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;

public final class g implements Resolver {
    public final Executor a;
    public final Tracer b;
    public final String c;
    public final a d;
    public final MutableLiveData e;

    public g(Executor executor0, Tracer tracer0, String s, a a0, MutableLiveData mutableLiveData0) {
        this.a = executor0;
        this.b = tracer0;
        this.c = s;
        this.d = a0;
        this.e = mutableLiveData0;
    }

    @Override  // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object a(Completer callbackToFutureAdapter$Completer0) {
        return OperationKt.f(this.a, this.b, this.c, this.d, this.e, callbackToFutureAdapter$Completer0);
    }
}

