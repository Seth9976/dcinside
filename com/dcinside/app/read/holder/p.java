package com.dcinside.app.read.holder;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class p implements b {
    public final Function1 a;

    public p(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        r.n(this.a, object0);
    }
}

