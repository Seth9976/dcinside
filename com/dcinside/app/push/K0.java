package com.dcinside.app.push;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class k0 implements p {
    public final Function1 a;

    public k0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return z0.r1(this.a, object0);
    }
}

