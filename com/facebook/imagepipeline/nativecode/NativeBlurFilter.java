package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.f;
import k1.n.a;
import k1.n;

@f
@n(a.a)
public class NativeBlurFilter {
    static {
        b.a();
    }

    public static void a(Bitmap bitmap0, int v, int v1) {
        com.facebook.common.internal.n.i(bitmap0);
        boolean z = false;
        com.facebook.common.internal.n.d(Boolean.valueOf(v > 0));
        if(v1 > 0) {
            z = true;
        }
        com.facebook.common.internal.n.d(Boolean.valueOf(z));
        NativeBlurFilter.nativeIterativeBoxBlur(bitmap0, v, v1);
    }

    @f
    private static native void nativeIterativeBoxBlur(Bitmap arg0, int arg1, int arg2) {
    }
}

