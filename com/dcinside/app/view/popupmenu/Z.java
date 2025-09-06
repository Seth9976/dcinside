package com.dcinside.app.view.popupmenu;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class z implements b {
    public final Function1 a;

    public z(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        U.Q(this.a, object0);
    }
}

