package com.dcinside.app.write;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class l2 implements b {
    public final Function1 a;

    public l2(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        m2.C(this.a, object0);
    }
}

