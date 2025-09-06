package com.dcinside.app.base;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class f implements ActivityResultCallback {
    public final g a;

    public f(g g0) {
        this.a = g0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        g.H1(this.a, ((ActivityResult)object0));
    }
}

