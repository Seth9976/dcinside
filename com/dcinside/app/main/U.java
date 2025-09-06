package com.dcinside.app.main;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class u implements b {
    public final Function1 a;

    public u(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        Q.A1(this.a, object0);
    }
}

