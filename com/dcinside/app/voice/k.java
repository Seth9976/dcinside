package com.dcinside.app.voice;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class k implements p {
    public final Function1 a;

    public k(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return m.E(this.a, object0);
    }
}

