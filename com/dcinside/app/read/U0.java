package com.dcinside.app.read;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class u0 implements b {
    public final Function1 a;

    public u0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        B0.o(this.a, object0);
    }
}

