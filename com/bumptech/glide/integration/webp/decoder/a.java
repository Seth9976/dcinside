package com.bumptech.glide.integration.webp.decoder;

import androidx.annotation.NonNull;
import com.bumptech.glide.integration.webp.WebpImage;
import com.bumptech.glide.integration.webp.d;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class a {
    private final b a;
    private final e b;
    private final com.bumptech.glide.load.resource.gif.b c;
    public static final i d;

    static {
        a.d = i.g("com.bumptech.glide.integration.webp.decoder.AnimatedWebpBitmapDecoder.DisableBitmap", Boolean.FALSE);
    }

    public a(b b0, e e0) {
        this.a = b0;
        this.b = e0;
        this.c = new com.bumptech.glide.load.resource.gif.b(e0, b0);
    }

    public v a(InputStream inputStream0, int v, int v1, j j0) throws IOException {
        byte[] arr_b = h.b(inputStream0);
        return arr_b == null ? null : this.b(ByteBuffer.wrap(arr_b), v, v1, j0);
    }

    public v b(ByteBuffer byteBuffer0, int v, int v1, j j0) throws IOException {
        int v2 = byteBuffer0.remaining();
        byte[] arr_b = new byte[v2];
        byteBuffer0.get(arr_b, 0, v2);
        WebpImage webpImage0 = WebpImage.create(arr_b);
        int v3 = h.a(webpImage0.getWidth(), webpImage0.getHeight(), v, v1);
        com.bumptech.glide.integration.webp.decoder.j j1 = new com.bumptech.glide.integration.webp.decoder.j(this.c, webpImage0, byteBuffer0, v3);
        try {
            j1.j();
            return com.bumptech.glide.load.resource.bitmap.h.c(j1.i(), this.b);
        }
        finally {
            j1.clear();
        }
    }

    // 去混淆评级： 低(20)
    public boolean c(InputStream inputStream0, @NonNull j j0) throws IOException {
        return ((Boolean)j0.c(a.d)).booleanValue() ? false : d.f(d.b(inputStream0, this.a));
    }

    // 去混淆评级： 低(20)
    public boolean d(ByteBuffer byteBuffer0, @NonNull j j0) throws IOException {
        return ((Boolean)j0.c(a.d)).booleanValue() ? false : d.f(d.c(byteBuffer0));
    }
}

