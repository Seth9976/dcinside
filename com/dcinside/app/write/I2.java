package com.dcinside.app.write;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class i2 implements b {
    public final Function1 a;

    public i2(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        m2.w(this.a, object0);
    }
}

