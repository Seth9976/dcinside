package com.dcinside.app.post;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class p0 implements b {
    public final Function1 a;

    public p0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        PostSearchActivity.N1(this.a, object0);
    }
}

