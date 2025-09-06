package com.dcinside.app.write;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class o2 implements b {
    public final Function1 a;

    public o2(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        p2.s(this.a, object0);
    }
}

