package com.dcinside.app.write;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class l1 implements p {
    public final Function1 a;

    public l1(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return r1.M(this.a, object0);
    }
}

