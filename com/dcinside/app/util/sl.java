package com.dcinside.app.util;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class sl implements b {
    public final Function1 a;

    public sl(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        Al.F(this.a, object0);
    }
}

