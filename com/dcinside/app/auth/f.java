package com.dcinside.app.auth;

import android.view.View.OnClickListener;
import android.view.View;

public final class f implements View.OnClickListener {
    public final AuthenticatorActivity a;

    public f(AuthenticatorActivity authenticatorActivity0) {
        this.a = authenticatorActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        AuthenticatorActivity.k2(this.a, view0);
    }
}

