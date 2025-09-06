package com.dcinside.app.write;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class s implements ActivityResultCallback {
    public final PostWriteActivity a;

    public s(PostWriteActivity postWriteActivity0) {
        this.a = postWriteActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        PostWriteActivity.c7(this.a, ((ActivityResult)object0));
    }
}

