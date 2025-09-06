package com.dcinside.app.write;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class j1 implements b {
    public final Function1 a;

    public j1(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        k1.r(this.a, object0);
    }
}

