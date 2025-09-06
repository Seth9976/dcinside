package com.dcinside.app.post.fragments;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class v2 implements b {
    public final Function1 a;

    public v2(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        N3.M8(this.a, object0);
    }
}

