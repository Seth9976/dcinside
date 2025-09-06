package com.bumptech.glide.integration.webp.decoder;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import com.bumptech.glide.util.a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class c implements l {
    private final k a;

    public c(k k0) {
        this.a = k0;
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.d(((ByteBuffer)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        return this.c(((ByteBuffer)object0), v, v1, j0);
    }

    public v c(@NonNull ByteBuffer byteBuffer0, int v, int v1, @NonNull j j0) throws IOException {
        InputStream inputStream0 = a.g(byteBuffer0);
        return this.a.d(inputStream0, v, v1, j0);
    }

    public boolean d(@NonNull ByteBuffer byteBuffer0, @NonNull j j0) throws IOException {
        return this.a.m(byteBuffer0, j0);
    }
}

