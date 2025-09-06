package com.dcinside.app.auth;

import rx.functions.b;

public final class j implements b {
    public final AuthenticatorActivity a;

    public j(AuthenticatorActivity authenticatorActivity0) {
        this.a = authenticatorActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        AuthenticatorActivity.g2(this.a, ((Throwable)object0));
    }
}

