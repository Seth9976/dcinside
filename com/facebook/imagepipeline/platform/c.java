package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import androidx.core.util.Pools.Pool;
import com.facebook.imagepipeline.memory.k;
import kotlin.jvm.internal.L;
import p3.d;
import y4.l;

@TargetApi(26)
@d
public final class c extends b {
    @l
    private final f h;

    public c(@l k k0, @l Pool pools$Pool0, @l f f0) {
        L.p(k0, "bitmapPool");
        L.p(pools$Pool0, "decodeBuffers");
        L.p(f0, "platformDecoderOptions");
        super(k0, pools$Pool0, f0);
        this.h = f0;
    }

    @Override  // com.facebook.imagepipeline.platform.b
    public int g(int v, int v1, @l BitmapFactory.Options bitmapFactory$Options0) {
        L.p(bitmapFactory$Options0, "options");
        return com.facebook.imageutils.c.k(v, v1, (bitmapFactory$Options0.outConfig == null ? Bitmap.Config.ARGB_8888 : bitmapFactory$Options0.outConfig));
    }

    @l
    public final f i() {
        return this.h;
    }
}

