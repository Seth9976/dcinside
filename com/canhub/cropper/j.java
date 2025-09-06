package com.canhub.cropper;

import androidx.activity.OnBackPressedCallback;
import kotlin.jvm.functions.Function1;

public final class j implements Function1 {
    public final CropImageActivity a;

    public j(CropImageActivity cropImageActivity0) {
        this.a = cropImageActivity0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return CropImageActivity.k1(this.a, ((OnBackPressedCallback)object0));
    }
}

