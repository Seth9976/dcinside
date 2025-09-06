package com.dcinside.app.read;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class f0 implements p {
    public final Function1 a;

    public f0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return r0.M(this.a, object0);
    }
}

