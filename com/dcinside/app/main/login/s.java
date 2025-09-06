package com.dcinside.app.main.login;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class s implements ActivityResultCallback {
    public final t a;

    public s(t t0) {
        this.a = t0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        t.y(this.a, ((ActivityResult)object0));
    }
}

