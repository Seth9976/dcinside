package com.dcinside.app.util;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class r implements p {
    public final Function1 a;

    public r(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return i.e(this.a, object0);
    }
}

