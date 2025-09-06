package com.dcinside.app.post.fragments;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class o0 implements ActivityResultCallback {
    public final S0 a;

    public o0(S0 s00) {
        this.a = s00;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        S0.q4(this.a, ((ActivityResult)object0));
    }
}

