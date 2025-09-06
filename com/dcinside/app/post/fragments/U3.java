package com.dcinside.app.post.fragments;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class u3 implements ActivityResultCallback {
    public final N3 a;

    public u3(N3 n30) {
        this.a = n30;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        N3.C5(this.a, ((ActivityResult)object0));
    }
}

