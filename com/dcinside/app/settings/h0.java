package com.dcinside.app.settings;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class h0 implements b {
    public final Function1 a;

    public h0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        j0.b1(this.a, object0);
    }
}

