package com.dcinside.app.post.fragments;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class v3 implements ActivityResultCallback {
    public final N3 a;

    public v3(N3 n30) {
        this.a = n30;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        N3.D5(this.a, ((ActivityResult)object0));
    }
}

