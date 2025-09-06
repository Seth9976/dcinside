package com.dcinside.app.post.fragments;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class w4 implements b {
    public final Function1 a;

    public w4(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        s.g(this.a, object0);
    }
}

