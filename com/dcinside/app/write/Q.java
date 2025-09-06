package com.dcinside.app.write;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class q implements ActivityResultCallback {
    public final PostWriteActivity a;

    public q(PostWriteActivity postWriteActivity0) {
        this.a = postWriteActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        PostWriteActivity.a7(this.a, ((ActivityResult)object0));
    }
}

