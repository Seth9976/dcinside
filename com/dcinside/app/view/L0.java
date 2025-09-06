package com.dcinside.app.view;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class l0 implements b {
    public final Function1 a;

    public l0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        n0.d0(this.a, object0);
    }
}

