package com.canhub.cropper;

import androidx.activity.result.ActivityResultCallback;

public final class g implements ActivityResultCallback {
    public final CropImageActivity a;

    public g(CropImageActivity cropImageActivity0) {
        this.a = cropImageActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        CropImageActivity.y1(this.a, ((Boolean)object0).booleanValue());
    }
}

