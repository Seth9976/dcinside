package com.dcinside.app.totalsearch.gallery;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class s implements b {
    public final Function1 a;

    public s(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        a.c(this.a, object0);
    }
}

