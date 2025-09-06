package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.f;
import k1.n.a;
import k1.n;

@f
@n(a.a)
public class NativeRoundingFilter {
    static {
        b.a();
    }

    public static void a(Bitmap bitmap0, int v, int v1, int v2, int v3) {
        NativeRoundingFilter.nativeAddRoundedCornersFilter(bitmap0, v, v1, v2, v3);
    }

    public static void b(Bitmap bitmap0) {
        NativeRoundingFilter.toCircle(bitmap0, false);
    }

    public static void c(Bitmap bitmap0) {
        NativeRoundingFilter.toCircleFast(bitmap0, false);
    }

    public static void d(Bitmap bitmap0, int v, int v1, boolean z) {
        com.facebook.common.internal.n.i(bitmap0);
        if(bitmap0.getWidth() >= 3 && bitmap0.getHeight() >= 3) {
            NativeRoundingFilter.nativeToCircleWithBorderFilter(bitmap0, v, v1, z);
        }
    }

    @f
    private static native void nativeAddRoundedCornersFilter(Bitmap arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @f
    private static native void nativeToCircleFastFilter(Bitmap arg0, boolean arg1) {
    }

    @f
    private static native void nativeToCircleFilter(Bitmap arg0, boolean arg1) {
    }

    @f
    private static native void nativeToCircleWithBorderFilter(Bitmap arg0, int arg1, int arg2, boolean arg3) {
    }

    @f
    public static void toCircle(Bitmap bitmap0, boolean z) {
        com.facebook.common.internal.n.i(bitmap0);
        if(bitmap0.getWidth() >= 3 && bitmap0.getHeight() >= 3) {
            NativeRoundingFilter.nativeToCircleFilter(bitmap0, z);
        }
    }

    @f
    public static void toCircleFast(Bitmap bitmap0, boolean z) {
        com.facebook.common.internal.n.i(bitmap0);
        if(bitmap0.getWidth() >= 3 && bitmap0.getHeight() >= 3) {
            NativeRoundingFilter.nativeToCircleFastFilter(bitmap0, z);
        }
    }
}

