package com.dcinside.app.util;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class ul implements b {
    public final Function1 a;

    public ul(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        Al.z(this.a, object0);
    }
}

