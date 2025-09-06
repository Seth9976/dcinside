package com.dcinside.app.gallery.info;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class s implements b {
    public final Function1 a;

    public s(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        u.s0(this.a, object0);
    }
}

