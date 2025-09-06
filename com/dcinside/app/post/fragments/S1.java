package com.dcinside.app.post.fragments;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class s1 implements p {
    public final Function1 a;

    public s1(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return k.c(this.a, object0);
    }
}

