package com.dcinside.app.post;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class c implements p {
    public final Function1 a;

    public c(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return e.h(this.a, object0);
    }
}

