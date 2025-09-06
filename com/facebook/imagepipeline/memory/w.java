package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import com.facebook.common.memory.c;
import kotlin.jvm.internal.L;
import y4.l;

public final class w implements k {
    @Override  // com.facebook.common.memory.g
    public void a(Object object0) {
        this.r(((Bitmap)object0));
    }

    @l
    public Bitmap g(int v) {
        Bitmap bitmap0 = Bitmap.createBitmap(1, ((int)Math.ceil(((double)v) / 2.0)), Bitmap.Config.RGB_565);
        L.o(bitmap0, "createBitmap(...)");
        return bitmap0;
    }

    @Override  // com.facebook.common.memory.g
    public Object get(int v) {
        return this.g(v);
    }

    @Override  // com.facebook.common.memory.d
    public void q(@l c c0) {
        L.p(c0, "trimType");
    }

    public void r(@l Bitmap bitmap0) {
        L.p(bitmap0, "value");
        bitmap0.recycle();
    }
}

