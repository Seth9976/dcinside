package com.bumptech.glide.integration.webp.decoder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.integration.webp.d;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class g implements l {
    private final l a;
    private final b b;
    public static final i c;

    static {
        g.c = i.g("com.bumptech.glide.integration.webp.decoder.StreamWebpDecoder.DisableAnimation", Boolean.FALSE);
    }

    public g(l l0, b b0) {
        this.a = l0;
        this.b = b0;
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.d(((InputStream)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    @Nullable
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        return this.c(((InputStream)object0), v, v1, j0);
    }

    @Nullable
    public v c(@NonNull InputStream inputStream0, int v, int v1, @NonNull j j0) throws IOException {
        byte[] arr_b = h.b(inputStream0);
        if(arr_b == null) {
            return null;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        return this.a.b(byteBuffer0, v, v1, j0);
    }

    // 去混淆评级： 低(20)
    public boolean d(@NonNull InputStream inputStream0, @NonNull j j0) throws IOException {
        return ((Boolean)j0.c(g.c)).booleanValue() ? false : d.f(d.b(inputStream0, this.b));
    }
}

