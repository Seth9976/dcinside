package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.f;
import k1.n.a;
import k1.n;

@f
@n(a.a)
public class Bitmaps {
    static {
        com.facebook.imagepipeline.nativecode.a.a();
    }

    @f
    public static void copyBitmap(Bitmap bitmap0, Bitmap bitmap1) {
        boolean z = false;
        com.facebook.common.internal.n.d(Boolean.valueOf(bitmap1.getConfig() == bitmap0.getConfig()));
        com.facebook.common.internal.n.d(Boolean.valueOf(bitmap0.isMutable()));
        com.facebook.common.internal.n.d(Boolean.valueOf(bitmap0.getWidth() == bitmap1.getWidth()));
        if(bitmap0.getHeight() == bitmap1.getHeight()) {
            z = true;
        }
        com.facebook.common.internal.n.d(Boolean.valueOf(z));
        Bitmaps.nativeCopyBitmap(bitmap0, bitmap0.getRowBytes(), bitmap1, bitmap1.getRowBytes(), bitmap0.getHeight());
    }

    @f
    private static native void nativeCopyBitmap(Bitmap arg0, int arg1, Bitmap arg2, int arg3, int arg4) {
    }
}

