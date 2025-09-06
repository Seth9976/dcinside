package com.dcinside.app.totalsearch.video;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class k implements p {
    public final Function1 a;

    public k(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return q.J0(this.a, object0);
    }
}

