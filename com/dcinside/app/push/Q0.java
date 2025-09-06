package com.dcinside.app.push;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class q0 implements p {
    public final Function1 a;

    public q0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return z0.f1(this.a, object0);
    }
}

