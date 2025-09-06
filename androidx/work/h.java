package androidx.work;

import A3.a;
import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.lifecycle.MutableLiveData;

public final class h implements Runnable {
    public final Tracer a;
    public final String b;
    public final a c;
    public final MutableLiveData d;
    public final Completer e;

    public h(Tracer tracer0, String s, a a0, MutableLiveData mutableLiveData0, Completer callbackToFutureAdapter$Completer0) {
        this.a = tracer0;
        this.b = s;
        this.c = a0;
        this.d = mutableLiveData0;
        this.e = callbackToFutureAdapter$Completer0;
    }

    @Override
    public final void run() {
        OperationKt.g(this.a, this.b, this.c, this.d, this.e);
    }
}

