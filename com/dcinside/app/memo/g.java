package com.dcinside.app.memo;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class g implements b {
    public final Function1 a;

    public g(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        j.V(this.a, object0);
    }
}

