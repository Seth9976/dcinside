package com.bumptech.glide.integration.webp.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.c;
import com.bumptech.glide.integration.webp.WebpImage;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.resource.gif.b;
import com.bumptech.glide.load.resource.k;
import java.io.IOException;
import java.nio.ByteBuffer;

public class d implements l {
    private final Context a;
    private final e b;
    private final b c;
    public static final i d;

    static {
        d.d = i.g("com.bumptech.glide.integration.webp.decoder.ByteBufferWebpDecoder.DisableAnimation", Boolean.FALSE);
    }

    public d(Context context0) {
        this(context0, c.e(context0).g(), c.e(context0).h());
    }

    public d(Context context0, com.bumptech.glide.load.engine.bitmap_recycle.b b0, e e0) {
        this.a = context0.getApplicationContext();
        this.b = e0;
        this.c = new b(e0, b0);
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.d(((ByteBuffer)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    @Nullable
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        return this.c(((ByteBuffer)object0), v, v1, j0);
    }

    @Nullable
    public v c(@NonNull ByteBuffer byteBuffer0, int v, int v1, @NonNull j j0) throws IOException {
        int v2 = byteBuffer0.remaining();
        byte[] arr_b = new byte[v2];
        byteBuffer0.get(arr_b, 0, v2);
        WebpImage webpImage0 = WebpImage.create(arr_b);
        int v3 = h.a(webpImage0.getWidth(), webpImage0.getHeight(), v, v1);
        Object object0 = j0.c(q.t);
        com.bumptech.glide.integration.webp.decoder.j j1 = new com.bumptech.glide.integration.webp.decoder.j(this.c, webpImage0, byteBuffer0, v3, ((p)object0));
        j1.j();
        Bitmap bitmap0 = j1.i();
        if(bitmap0 == null) {
            return null;
        }
        k k0 = k.c();
        return new n(new com.bumptech.glide.integration.webp.decoder.l(this.a, j1, this.b, k0, v, v1, bitmap0));
    }

    // 去混淆评级： 低(20)
    public boolean d(@NonNull ByteBuffer byteBuffer0, @NonNull j j0) throws IOException {
        return ((Boolean)j0.c(d.d)).booleanValue() ? false : com.bumptech.glide.integration.webp.d.f(com.bumptech.glide.integration.webp.d.c(byteBuffer0));
    }
}

