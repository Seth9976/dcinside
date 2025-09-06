package com.canhub.cropper;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class r implements ActivityResultCallback {
    public final s a;

    public r(s s0) {
        this.a = s0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        s.e(this.a, ((ActivityResult)object0));
    }
}

