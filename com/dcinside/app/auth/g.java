package com.dcinside.app.auth;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class g implements ActivityResultCallback {
    public final AuthenticatorActivity a;

    public g(AuthenticatorActivity authenticatorActivity0) {
        this.a = authenticatorActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        AuthenticatorActivity.l2(this.a, ((ActivityResult)object0));
    }
}

