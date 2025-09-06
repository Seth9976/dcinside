package com.dcinside.app.util;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class u implements p {
    public final Function1 a;

    public u(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return a.B(this.a, object0);
    }
}

