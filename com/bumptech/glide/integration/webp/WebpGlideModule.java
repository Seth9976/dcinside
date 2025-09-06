package com.bumptech.glide.integration.webp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.d;
import com.bumptech.glide.integration.webp.decoder.a;
import com.bumptech.glide.integration.webp.decoder.f;
import com.bumptech.glide.integration.webp.decoder.g;
import com.bumptech.glide.integration.webp.decoder.l;
import com.bumptech.glide.integration.webp.decoder.m;
import com.bumptech.glide.k;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.module.c;
import java.io.InputStream;
import java.nio.ByteBuffer;

@Deprecated
public class WebpGlideModule implements c {
    @Override  // com.bumptech.glide.module.c
    public void a(Context context0, d d0) {
    }

    @Override  // com.bumptech.glide.module.c
    public void b(Context context0, com.bumptech.glide.c c0, k k0) {
        Resources resources0 = context0.getResources();
        e e0 = c0.h();
        b b0 = c0.g();
        com.bumptech.glide.integration.webp.decoder.k k1 = new com.bumptech.glide.integration.webp.decoder.k(k0.g(), resources0.getDisplayMetrics(), e0, b0);
        a a0 = new a(b0, e0);
        com.bumptech.glide.integration.webp.decoder.c c1 = new com.bumptech.glide.integration.webp.decoder.c(k1);
        f f0 = new f(k1, b0);
        com.bumptech.glide.integration.webp.decoder.d d0 = new com.bumptech.glide.integration.webp.decoder.d(context0, b0, e0);
        k k2 = k0.s("Bitmap", ByteBuffer.class, Bitmap.class, c1).s("Bitmap", InputStream.class, Bitmap.class, f0);
        com.bumptech.glide.load.resource.bitmap.a a1 = new com.bumptech.glide.load.resource.bitmap.a(resources0, c1);
        k k3 = k2.s("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, a1);
        com.bumptech.glide.load.resource.bitmap.a a2 = new com.bumptech.glide.load.resource.bitmap.a(resources0, f0);
        k k4 = k3.s("BitmapDrawable", InputStream.class, BitmapDrawable.class, a2);
        com.bumptech.glide.integration.webp.decoder.b b1 = new com.bumptech.glide.integration.webp.decoder.b(a0);
        k k5 = k4.s("Bitmap", ByteBuffer.class, Bitmap.class, b1);
        com.bumptech.glide.integration.webp.decoder.e e1 = new com.bumptech.glide.integration.webp.decoder.e(a0);
        k k6 = k5.s("Bitmap", InputStream.class, Bitmap.class, e1).q(ByteBuffer.class, l.class, d0);
        g g0 = new g(d0, b0);
        k k7 = k6.q(InputStream.class, l.class, g0);
        m m0 = new m();
        k7.p(l.class, m0);
    }
}

