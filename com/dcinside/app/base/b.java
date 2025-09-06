package com.dcinside.app.base;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class b implements ActivityResultCallback {
    public final d a;

    public b(d d0) {
        this.a = d0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        d.u1(this.a, ((ActivityResult)object0));
    }
}

