package com.dcinside.app.post.fragments;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class d2 implements p {
    public final Function1 a;

    public d2(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return N3.D4(this.a, object0);
    }
}

