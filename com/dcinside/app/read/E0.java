package com.dcinside.app.read;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class e0 implements b {
    public final Function1 a;

    public e0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        r0.P(this.a, object0);
    }
}

