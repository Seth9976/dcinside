package com.dcinside.app.push;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class i0 implements b {
    public final Function1 a;

    public i0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        z0.W0(this.a, object0);
    }
}

