package com.dcinside.app.image;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class y implements ActivityResultCallback {
    public final ImageViewerActivity a;

    public y(ImageViewerActivity imageViewerActivity0) {
        this.a = imageViewerActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        ImageViewerActivity.U2(this.a, ((ActivityResult)object0));
    }
}

