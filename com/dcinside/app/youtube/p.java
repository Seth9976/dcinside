package com.dcinside.app.youtube;

import kotlin.jvm.functions.Function1;

public final class p implements rx.functions.p {
    public final Function1 a;

    public p(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return c.c(this.a, object0);
    }
}

