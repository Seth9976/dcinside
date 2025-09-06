package com.dcinside.app.post.fragments;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class a4 implements p {
    public final Function1 a;

    public a4(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return e1.c(this.a, object0);
    }
}

