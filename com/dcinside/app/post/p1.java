package com.dcinside.app.post;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class p1 implements p {
    public final Function1 a;

    public p1(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return r1.g(this.a, object0);
    }
}

