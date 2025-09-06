package com.facebook.imagepipeline.bitmaps;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.k;
import com.facebook.imageutils.c;
import kotlin.jvm.internal.L;
import p3.d;
import y4.l;

@TargetApi(21)
@d
public final class a extends e {
    @l
    private final k a;
    @l
    private final com.facebook.imagepipeline.core.a b;

    public a(@l k k0, @l com.facebook.imagepipeline.core.a a0) {
        L.p(k0, "bitmapPool");
        L.p(a0, "closeableReferenceFactory");
        super();
        this.a = k0;
        this.b = a0;
    }

    @Override  // com.facebook.imagepipeline.bitmaps.e
    @l
    public com.facebook.common.references.a z(int v, int v1, @l Bitmap.Config bitmap$Config0) {
        L.p(bitmap$Config0, "bitmapConfig");
        int v2 = c.k(v, v1, bitmap$Config0);
        Bitmap bitmap0 = (Bitmap)this.a.get(v2);
        if(bitmap0.getAllocationByteCount() < v * v1 * c.j(bitmap$Config0)) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap0.reconfigure(v, v1, bitmap$Config0);
        com.facebook.common.references.a a0 = this.b.c(bitmap0, this.a);
        L.o(a0, "create(...)");
        return a0;
    }
}

