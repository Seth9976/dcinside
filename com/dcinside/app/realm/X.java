package com.dcinside.app.realm;

import io.realm.F0.d.b;
import kotlin.jvm.functions.Function1;

public final class x implements b {
    public final Function1 a;

    public x(Function1 function10) {
        this.a = function10;
    }

    @Override  // io.realm.F0$d$b
    public final void onError(Throwable throwable0) {
        a.h(this.a, throwable0);
    }
}

