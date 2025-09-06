package com.dcinside.app.post.fragments;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class t2 implements b {
    public final Function1 a;

    public t2(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        N3.M4(this.a, object0);
    }
}

