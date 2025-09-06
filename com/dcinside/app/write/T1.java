package com.dcinside.app.write;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class t1 implements p {
    public final Function1 a;

    public t1(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return A1.O(this.a, object0);
    }
}

