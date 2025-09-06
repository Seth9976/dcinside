package com.vungle.ads.internal.executor;

import A3.a;
import java.util.concurrent.Callable;

public final class h implements Callable {
    public final Callable a;
    public final a b;

    public h(Callable callable0, a a0) {
        this.a = callable0;
        this.b = a0;
    }

    @Override
    public final Object call() {
        return com.vungle.ads.internal.executor.i.a.getWrappedCallableWithFallback$lambda-0(this.a, this.b);
    }
}

