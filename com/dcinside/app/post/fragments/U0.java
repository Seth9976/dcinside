package com.dcinside.app.post.fragments;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class u0 implements p {
    public final Function1 a;

    public u0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return S0.w3(this.a, object0);
    }
}

