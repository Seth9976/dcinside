package com.dcinside.app.settings.image;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class h implements p {
    public final Function1 a;

    public h(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return a.c(this.a, object0);
    }
}

