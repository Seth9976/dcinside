package com.dcinside.app.auth;

public final class h implements Runnable {
    public final AuthenticatorActivity a;

    public h(AuthenticatorActivity authenticatorActivity0) {
        this.a = authenticatorActivity0;
    }

    @Override
    public final void run() {
        AuthenticatorActivity.n2(this.a);
    }
}

