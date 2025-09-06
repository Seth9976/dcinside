package com.dcinside.app.main;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class x0 implements p {
    public final Function1 a;

    public x0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return c.f(this.a, object0);
    }
}

