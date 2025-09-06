package com.dcinside.app.auth;

import rx.functions.b;

public final class e implements b {
    public final AuthenticatorActivity a;
    public final String b;
    public final String c;

    public e(AuthenticatorActivity authenticatorActivity0, String s, String s1) {
        this.a = authenticatorActivity0;
        this.b = s;
        this.c = s1;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        AuthenticatorActivity.a2(this.a, this.b, this.c, ((Throwable)object0));
    }
}

