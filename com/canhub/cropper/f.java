package com.canhub.cropper;

import android.net.Uri;
import androidx.activity.result.ActivityResultCallback;

public final class f implements ActivityResultCallback {
    public final CropImageActivity a;

    public f(CropImageActivity cropImageActivity0) {
        this.a = cropImageActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        CropImageActivity.o1(this.a, ((Uri)object0));
    }
}

