package com.dcinside.app.album.picker;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class k implements b {
    public final Function1 a;

    public k(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        l.m(this.a, object0);
    }
}

