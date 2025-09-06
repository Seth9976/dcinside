package com.dcinside.app.write;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class b2 implements p {
    public final Function1 a;

    public b2(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return h2.T(this.a, object0);
    }
}

