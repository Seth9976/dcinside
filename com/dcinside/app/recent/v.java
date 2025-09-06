package com.dcinside.app.recent;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class v implements p {
    public final Function1 a;

    public v(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return RecentView.U(this.a, object0);
    }
}

