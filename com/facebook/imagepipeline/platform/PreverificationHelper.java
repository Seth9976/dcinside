package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import com.facebook.soloader.f;
import y4.m;

@f
public final class PreverificationHelper {
    @TargetApi(26)
    @f
    public final boolean shouldUseHardwareBitmapConfig(@m Bitmap.Config bitmap$Config0) {
        return bitmap$Config0 == Bitmap.Config.HARDWARE;
    }
}

