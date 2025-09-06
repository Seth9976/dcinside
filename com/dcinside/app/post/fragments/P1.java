package com.dcinside.app.post.fragments;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class p1 implements ActivityResultCallback {
    public final r1 a;

    public p1(r1 r10) {
        this.a = r10;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        r1.r(this.a, ((ActivityResult)object0));
    }
}

