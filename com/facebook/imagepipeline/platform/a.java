package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import androidx.core.util.Pools.Pool;
import com.facebook.imagepipeline.memory.k;
import com.facebook.imageutils.c;
import kotlin.jvm.internal.L;
import p3.d;
import y4.l;

@TargetApi(21)
@d
public final class a extends b {
    public a(@l k k0, @l Pool pools$Pool0, @l f f0) {
        L.p(k0, "bitmapPool");
        L.p(pools$Pool0, "decodeBuffers");
        L.p(f0, "platformDecoderOptions");
        super(k0, pools$Pool0, f0);
    }

    @Override  // com.facebook.imagepipeline.platform.b
    public int g(int v, int v1, @l BitmapFactory.Options bitmapFactory$Options0) {
        L.p(bitmapFactory$Options0, "options");
        Bitmap.Config bitmap$Config0 = bitmapFactory$Options0.inPreferredConfig;
        if(bitmap$Config0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return c.k(v, v1, bitmap$Config0);
    }
}

