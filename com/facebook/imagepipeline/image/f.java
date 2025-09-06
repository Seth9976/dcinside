package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.common.references.a;
import com.facebook.common.references.h;

public final class f {
    public static g a(Bitmap bitmap0, h h0, r r0, int v) {
        return f.b(bitmap0, h0, r0, v, 0);
    }

    // 去混淆评级： 低(30)
    public static g b(Bitmap bitmap0, h h0, r r0, int v, int v1) {
        return new j(bitmap0, h0, r0, v, v1);
    }

    public static g c(a a0, r r0, int v) {
        return f.d(a0, r0, v, 0);
    }

    // 去混淆评级： 低(30)
    public static g d(a a0, r r0, int v, int v1) {
        return new j(a0, r0, v, v1);
    }
}

