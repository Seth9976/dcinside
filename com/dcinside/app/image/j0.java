package com.dcinside.app.image;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class j0 implements p {
    public final Function1 a;

    public j0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return m0.q(this.a, object0);
    }
}

