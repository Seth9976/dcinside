package com.dcinside.app.read;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class t0 implements p {
    public final Function1 a;

    public t0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return B0.k0(this.a, object0);
    }
}

