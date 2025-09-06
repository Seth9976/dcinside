package com.dcinside.app.auth;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class p implements b {
    public final Function1 a;

    public p(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        r.w0(this.a, object0);
    }
}

