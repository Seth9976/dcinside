package com.dcinside.app.image;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class k0 implements b {
    public final Function1 a;

    public k0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        m0.r(this.a, object0);
    }
}

