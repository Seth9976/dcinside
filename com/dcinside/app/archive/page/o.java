package com.dcinside.app.archive.page;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class o implements b {
    public final Function1 a;

    public o(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        p.w(this.a, object0);
    }
}

