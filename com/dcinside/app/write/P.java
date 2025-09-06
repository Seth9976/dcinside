package com.dcinside.app.write;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class p implements ActivityResultCallback {
    public final PostWriteActivity a;

    public p(PostWriteActivity postWriteActivity0) {
        this.a = postWriteActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        PostWriteActivity.Z6(this.a, ((ActivityResult)object0));
    }
}

