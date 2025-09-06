package com.dcinside.app.image;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class h0 implements p {
    public final Function1 a;

    public h0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return m0.o(this.a, object0);
    }
}

