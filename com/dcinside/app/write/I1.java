package com.dcinside.app.write;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class i1 implements p {
    public final Function1 a;

    public i1(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return k1.q(this.a, object0);
    }
}

