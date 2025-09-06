package com.dcinside.app.util;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class al implements b {
    public final Function1 a;

    public al(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        bl.d(this.a, object0);
    }
}

