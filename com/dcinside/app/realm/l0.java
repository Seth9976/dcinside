package com.dcinside.app.realm;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class l0 implements p {
    public final Function1 a;

    public l0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return a.r(this.a, object0);
    }
}

