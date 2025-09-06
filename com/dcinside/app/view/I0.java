package com.dcinside.app.view;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class i0 implements p {
    public final Function1 a;

    public i0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return n0.X(this.a, object0);
    }
}

