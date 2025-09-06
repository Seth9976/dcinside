package com.dcinside.app.auth;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class i implements b {
    public final Function1 a;

    public i(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        AuthenticatorActivity.f2(this.a, object0);
    }
}

